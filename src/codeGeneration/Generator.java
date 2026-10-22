package codeGeneration;

import AST.Python.*;
import AST.Jinja.TemplateDocument;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.file.*;
import java.util.*;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Generator {

    // متغيرات الحالة
    private int indentLevel = 0;
    private String dataVariable = "products";
    private boolean firstFunction = true;
    private boolean insideFunction = false;
    private boolean hasReturn = false;
    private String currentFunctionName = "";
    private boolean wroteAppFactory = false;
    private boolean inBody = false;
    private int routeCounter = 0;
    private boolean hasParams = false;

    private final Map<String, Set<String>> detectedRoutes = new LinkedHashMap<>();
    private final Map<String, String> routeBodies = new LinkedHashMap<>();
    private final Map<String, Map<String, String>> routeMethodBodies = new LinkedHashMap<>();

    private static final Set<String> SKIP_FUNCTIONS = Set.of(
            "escape_html", "load_template", "render", "render_string",
            "extract_blocks", "process_for", "process_if", "evaluate",
            "process_expressions", "eval_expression", "url_for"
    );
    private static final Pattern ROUTE_PATH = Pattern.compile(
            "(?:self\\.path|path)\\s*==\\s*(['\"])(/[^'\"]*)\\1"
    );
    private static final Pattern PATH_PARAM = Pattern.compile(
            "<(?:[^:<>]+:)?([A-Za-z_][A-Za-z0-9_]*)>"
    );

    // نقطة الدخول

    public void generate(FileInput ast, Map<String, TemplateDocument> jinjaAsts,
                         Path templatesDir, Path staticDir) throws IOException {
        Path resultDir = Paths.get("Result").toAbsolutePath();
        Files.createDirectories(resultDir.resolve("templates"));
        Files.createDirectories(resultDir.resolve("static"));

        try (FileWriter fw = new FileWriter(resultDir.resolve("app.py").toFile())) {
            generate(ast, fw);
        }

        Files.writeString(resultDir.resolve("requirements.txt"), "Flask==3.0.0\n");
        copyDirectory(templatesDir, resultDir.resolve("templates"));
        copyDirectory(staticDir, resultDir.resolve("static"));
        System.out.println("Flask project generated in " + resultDir);
    }

    public void generate(FileInput fileInput, FileWriter fw) throws IOException {
        if (fileInput == null) return;

        resetGenerationState();
        generate("from flask import Flask, render_template, request, redirect, url_for, abort\n\n", fw);
        if (!wroteAppFactory) {
            generate("app = Flask(__name__)\n\n", fw);
            wroteAppFactory = true;
        }

        detectDataVariable(fileInput);
        extractRoutesFromFileInput(fileInput);

        if (fileInput.getStatements() != null) {
            generate(fileInput.getStatements(), fw);
        }

        for (Map.Entry<String, Set<String>> entry : detectedRoutes.entrySet()) {
            String path = entry.getKey();
            generateRoute(path, entry.getValue(),
                    routeBodies.getOrDefault(path, "    abort(404)\n"), fw);
        }

        generate("\n@app.errorhandler(404)\n", fw);
        generate("def not_found(error):\n", fw);
        generate("    return render_template(\"404.html\"), 404\n\n", fw);
        generate("if __name__ == '__main__':\n", fw);
        generate("    app.run(debug=True)\n", fw);
    }

    // المرور على AST

    public void generate(Statements statements, FileWriter fw) throws IOException {
        if (statements == null || statements.getStatement() == null) return;
        for (Statement statement : statements.getStatement()) generate(statement, fw);
    }

    public void generate(Statement statement, FileWriter fw) throws IOException {
        if (statement instanceof SimpleStatements simple) {
            generate(simple, fw);
        } else if (statement instanceof CompoundStatement compound) {
            generate(compound, fw);
        }
    }

    public void generate(SimpleStatements statements, FileWriter fw) throws IOException {
        Object simpleStmts = get(statements, "simpleStmts");
        for (Object simpleStmt : getList(simpleStmts, "simpleStmt")) {
            generate((SimpleStmt) simpleStmt, fw);
        }
    }

    public void generate(SimpleStmt statement, FileWriter fw) throws IOException {
        generateSimpleStatement(statement, fw);
    }

    public void generate(CompoundStatement statement, FileWriter fw) throws IOException {
        Object compound = get(statement, "compoundStmt");
        if (compound instanceof FunctionDefinition function) {
            generate(function, fw);
        } else if (compound instanceof ClassDefinition definition) {
            generate(definition, fw);
        }
    }

    private void generateInFunction(Statement statement, FileWriter fw) throws IOException {
        if (statement instanceof SimpleStatements simple) {
            generate(simple, fw);
        } else if (statement instanceof CompoundStatement compound) {
            Object inner = get(compound, "compoundStmt");
            if (inner instanceof FunctionDefinition fd) {
                generateFunctionDefinition(fd, fw);
            } else if (inner instanceof IfStatement ifStmt) {
                generateIfStatement(ifStmt, fw);
            } else if (inner instanceof ForStatement forStmt) {
                generateForStatement(forStmt, fw);
            } else if (inner instanceof WhileStatement whileStmt) {
                generateWhileStatement(whileStmt, fw);
            }
        }
    }

    private void generateForStatement(Object forStmt, FileWriter fw) throws IOException {
        Object raw = get(forStmt, "forStmt");
        if (raw == null) raw = forStmt;

        String targets = renderAst(get(raw, "starTargets"));
        String iterable = renderAst(get(raw, "starExpressions"));
        Object block = get(raw, "block");

        generate(indent() + "for " + targets + " in " + iterable + ":\n", fw);
        indentLevel++;
        boolean wrote = generateBlock(block, fw);
        if (!wrote) generate(indent() + "pass\n", fw);
        indentLevel--;

        Object elseBlock = get(raw, "elseBlock");
        if (elseBlock != null) {
            generate(indent() + "else:\n", fw);
            indentLevel++;
            generateBlock(get(elseBlock, "block"), fw);
            indentLevel--;
        }
    }

    private void generateIfStatement(Object ifStmt, FileWriter fw) throws IOException {
        Object raw = get(ifStmt, "ifStmt");
        if (raw == null) raw = ifStmt;

        String cond = renderAst(get(raw, "namedExpression"));
        Object block = get(raw, "block");

        generate(indent() + "if " + cond + ":\n", fw);
        indentLevel++;
        boolean wrote = generateBlock(block, fw);
        if (!wrote) generate(indent() + "pass\n", fw);
        indentLevel--;

        Object elif = get(raw, "elifStmt");
        if (elif != null) {
            generate(indent() + "elif " + renderAst(get(elif, "namedExpression")) + ":\n", fw);
            indentLevel++;
            generateBlock(get(elif, "block"), fw);
            indentLevel--;
        }

        Object elseBlock = get(raw, "elseBlock");
        if (elseBlock != null) {
            generate(indent() + "else:\n", fw);
            indentLevel++;
            generateBlock(get(elseBlock, "block"), fw);
            indentLevel--;
        }
    }

    private void generateWhileStatement(Object whileStmt, FileWriter fw) throws IOException {
        Object raw = get(whileStmt, "whileStmt");
        if (raw == null) raw = whileStmt;

        String cond = renderAst(get(raw, "namedExpression"));
        generate(indent() + "while " + cond + ":\n", fw);
        indentLevel++;
        generateBlock(get(raw, "block"), fw);
        indentLevel--;

        Object elseBlock = get(raw, "elseBlock");
        if (elseBlock != null) {
            generate(indent() + "else:\n", fw);
            indentLevel++;
            generateBlock(get(elseBlock, "block"), fw);
            indentLevel--;
        }
    }

    public void generate(FunctionDefinition function, FileWriter fw) throws IOException {
        generateFunctionDefinition(function, fw);
    }

    private void generateFunctionDefinition(FunctionDefinition function, FileWriter fw) throws IOException {
        Object rawFunction = unwrap(get(function, "functionDef"),
                "undecoratedFunctionDefinition", "decoratedFunctionDefinition",
                "functionDefRaw");

        String name = renderAst(get(rawFunction, "name"));
        if (name.isBlank() || SKIP_FUNCTIONS.contains(name)) return;

        currentFunctionName = name;
        firstFunction = false;
        insideFunction = true;
        hasReturn = false;
        hasParams = get(rawFunction, "params") != null;

        String params = renderAst(get(rawFunction, "params"));

        generate(indent() + "def " + name + "(" + params + "):\n", fw);
        indentLevel++;

        inBody = true;
        boolean wroteBody = generateBlock(get(rawFunction, "block"), fw);
        if (!wroteBody) generate(indent() + "pass\n", fw);


        indentLevel--;
        inBody = false;
        insideFunction = false;
        generate("\n", fw);
    }

    public void generate(Assignment assignment, FileWriter fw) throws IOException {
        if (assignment instanceof ChainedAssignment chained) {
            List<?> targets = asList(get(chained, "starTargets"));
            if (targets.isEmpty()) return;

            StringJoiner lhs = new StringJoiner(" = ");
            for (Object target : targets) lhs.add(renderAst(target));
            Object rhs = get(chained, "annotatedRhs");
            String value = renderAst(rhs);
            if (lhs.toString().equals("app") && value.startsWith("Flask(")) return;
            generate(indent() + lhs + " = " + value + "\n", fw);
        } else if (assignment instanceof AugmentedAssignment augmented) {
            String target = renderAst(get(augmented, "singleTarget"));
            String operator = renderAst(get(augmented, "augassign"));
            String value = renderAst(get(augmented, "annotatedRhs"));
            generate(indent() + target + " " + operator + " " + value + "\n", fw);
        }
    }

    public void generate(ReturnStmt statement, FileWriter fw) throws IOException {
        String expression = renderAst(get(statement, "starExpressions"));
        generate(indent() + "return" + (expression.isBlank() ? "" : " " + expression) + "\n", fw);
        hasReturn = true;
    }

    public void generate(StarExpressionStatement statement, FileWriter fw) throws IOException {
        String expression = renderAst(get(statement, "starExpressions"));
        String translated = translateExpressionStatement(expression);
        if (!translated.isEmpty()) generate(indent() + translated + "\n", fw);
    }

    public void generate(ClassDefinition definition, FileWriter fw) {
        // Routes مستخرجة مسبقاً
    }

    private void generateSimpleStatement(Object statement, FileWriter fw) throws IOException {
        if (statement instanceof AssignmentStatement assignmentStatement) {
            generate((Assignment) get(assignmentStatement, "assignment"), fw);
        } else if (statement instanceof ReturnStatement returnStatement) {
            generate((ReturnStmt) get(returnStatement, "returnStmt"), fw);
        } else if (statement instanceof StarExpressionStatement expressionStatement) {
            generate(expressionStatement, fw);
        } else if (simpleName(statement).equals("PassStatement")) {
            generate(indent() + "pass\n", fw);
        } else if (simpleName(statement).equals("BreakStatement")) {
            generate(indent() + "break\n", fw);
        } else if (simpleName(statement).equals("ContinueStatement")) {
            generate(indent() + "continue\n", fw);
        }
    }

    private boolean generateBlock(Object block, FileWriter fw) throws IOException {
        if (block == null) return false;

        Object statements = get(block, "statements");
        if (statements instanceof Statements value && value.getStatement() != null) {
            for (Statement st : value.getStatement()) {
                generateInFunction(st, fw);
            }
            return !value.getStatement().isEmpty();
        }

        Object simpleStmts = get(block, "simpleStmts");
        if (simpleStmts instanceof SimpleStmts value) {
            generate(new SimpleStatements("SimpleStatements", 0, value), fw);
            return value.getSimpleStmt() != null && !value.getSimpleStmt().isEmpty();
        }
        return false;
    }

    private void detectDataVariable(FileInput fileInput) {
        Statements statements = fileInput.getStatements();
        if (statements == null || statements.getStatement() == null) return;
        for (Statement statement : statements.getStatement()) {
            if (!(statement instanceof SimpleStatements simple)) continue;
            for (Object item : getList(get(simple, "simpleStmts"), "simpleStmt")) {
                if (!(item instanceof AssignmentStatement assignmentStatement)) continue;
                Object assignment = get(assignmentStatement, "assignment");
                if (!(assignment instanceof ChainedAssignment chained)) continue;
                List<?> targets = asList(get(chained, "starTargets"));
                if (!targets.isEmpty()) {
                    String candidate = renderAst(targets.get(0)).trim();
                    if (candidate.matches("[A-Za-z_][A-Za-z0-9_]*")
                            && !candidate.equals("app")) {
                        dataVariable = candidate;
                        return;
                    }
                }
            }
        }
    }
    // استخراج Routes
    private void extractRoutesFromFileInput(FileInput fileInput) {
        Statements statements = fileInput.getStatements();
        if (statements == null || statements.getStatement() == null) return;

        for (Statement statement : statements.getStatement()) {
            if (!(statement instanceof CompoundStatement compound)
                    || !(get(compound, "compoundStmt") instanceof ClassDefinition classDefinition)) {
                continue;
            }

            Object classRaw = unwrap(get(classDefinition, "classDef"),
                    "undecoratedClassDefinition", "decoratedClassDefinition", "classDefRaw");
            Object classBlock = get(classRaw, "block");

            for (Object function : findNodes(classBlock, "FunctionDefinition")) {
                Object rawFunction = unwrap(get(function, "functionDef"),
                        "undecoratedFunctionDefinition", "decoratedFunctionDefinition",
                        "functionDefRaw");
                String method = renderAst(get(rawFunction, "name"));
                if (!method.equals("do_GET") && !method.equals("do_POST")) continue;

                Object methodBlock = get(rawFunction, "block");
                processMethodRoutes(methodBlock, method.substring(3));
            }
        }
    }

    private void processMethodRoutes(Object methodBlock, String httpMethod) {
        List<Object> allStatements = collectStatements(methodBlock);
        String pendingRegex = null;

        for (Object stmt : allStatements) {
            String regex = findRegexInAssignment(stmt);
            if (regex != null) {
                pendingRegex = regex;
                continue;
            }

            Object ifStmt = extractIfStatement(stmt);
            if (ifStmt != null) {
                String condition = renderAst(get(ifStmt, "namedExpression"));
                Object routeBlock = get(ifStmt, "block");
                String body = renderBlock(routeBlock, 1);

                Matcher pm = ROUTE_PATH.matcher(condition);
                if (pm.find()) {
                    String path = pm.group(2);
                    if (!path.startsWith("/static/")) {
                        addRoute(path, httpMethod, body);
                    }
                    pendingRegex = null;
                    continue;
                }

                if (condition.trim().matches("[A-Za-z_][A-Za-z0-9_]*") && pendingRegex != null) {
                    String flaskPath = regexToFlaskPath(pendingRegex);
                    if (flaskPath != null) {
                        addRoute(flaskPath, httpMethod, body);
                    }
                    pendingRegex = null;
                    continue;
                }

                Matcher rm = Pattern.compile(
                        "re\\.match\\(\\s*r?[\"'](\\^[^\"']+\\$)[\"']"
                ).matcher(condition);
                if (rm.find()) {
                    String flaskPath = regexToFlaskPath(rm.group(1));
                    if (flaskPath != null) addRoute(flaskPath, httpMethod, body);
                }
            }
        }
    }

    private List<Object> collectStatements(Object block) {
        List<Object> result = new ArrayList<>();
        if (block == null) return result;

        Object statements = get(block, "statements");
        if (statements instanceof Statements value && value.getStatement() != null) {
            result.addAll(value.getStatement());
        } else {
            Object simpleStmts = get(block, "simpleStmts");
            if (simpleStmts != null) {
                for (Object st : getList(simpleStmts, "simpleStmt")) result.add(st);
            }
        }
        return result;
    }

    private String findRegexInAssignment(Object stmt) {
        if (!(stmt instanceof SimpleStatements simple)) return null;
        for (Object item : getList(get(simple, "simpleStmts"), "simpleStmt")) {
            if (!(item instanceof AssignmentStatement assign)) continue;
            Object a = get(assign, "assignment");
            if (!(a instanceof ChainedAssignment chained)) continue;
            String rhs = renderAst(get(chained, "annotatedRhs"));
            Matcher m = Pattern.compile(
                    "re\\.match\\(\\s*r?[\"'](\\^[^\"']+\\$)[\"']"
            ).matcher(rhs);
            if (m.find()) return m.group(1);
        }
        return null;
    }

    private Object extractIfStatement(Object stmt) {
        if (stmt instanceof CompoundStatement compound) {
            Object inner = get(compound, "compoundStmt");
            if (inner instanceof IfStatement ifStmt) {
                Object raw = get(ifStmt, "ifStmt");
                return raw != null ? raw : ifStmt;
            }
        }
        return null;
    }

    private String regexToFlaskPath(String regex) {
        if (!regex.startsWith("^") || !regex.endsWith("$")) return null;
        String path = regex.substring(1, regex.length() - 1);
        Matcher m = Pattern.compile("\\(\\\\d\\+\\)").matcher(path);
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        while (m.find()) {
            m.appendReplacement(sb, "<int:arg" + (idx++) + ">");
        }
        m.appendTail(sb);
        return sb.toString();
    }

    private void addRoute(String path, String method, String body) {
        detectedRoutes.computeIfAbsent(path, ignored -> new LinkedHashSet<>()).add(method);
        Map<String, String> methods = routeMethodBodies.computeIfAbsent(path,
                ignored -> new LinkedHashMap<>());
        methods.putIfAbsent(method, body);

        if (methods.size() == 1) {
            routeBodies.put(path, body);
            return;
        }
        StringBuilder combined = new StringBuilder();
        int index = 0;
        for (Map.Entry<String, String> entry : methods.entrySet()) {
            combined.append(index++ == 0 ? "    if " : "    elif ")
                    .append("request.method == ")
                    .append(quote(entry.getKey()))
                    .append(":\n");
            String methodBody = entry.getValue();
            if (methodBody.isBlank()) methodBody = "        abort(404)\n";
            for (String line : methodBody.split("\\R", -1)) {
                if (!line.isEmpty()) combined.append("    ").append(line).append('\n');
            }
        }
        routeBodies.put(path, combined.toString());
    }

    public void generateRoute(String path, Set<String> methods, String body,
                              FileWriter fw) throws IOException {
        List<String> params = extractPathParams(path);
        String pathLiteral = quote(path).replace("\"", "'");
        generate("@app.route(" + pathLiteral + ", methods="
                + serializePythonList(new ArrayList<>(methods)) + ")\n", fw);
        generate("def " + pathToFunctionName(path) + "("
                + String.join(", ", params) + "):\n", fw);

        String normalizedBody = body == null ? "" : body;
        if (normalizedBody.isBlank()) normalizedBody = "    abort(404)\n";
        if (!normalizedBody.startsWith("    ")) normalizedBody = "    " + normalizedBody;
        generate(normalizedBody, fw);
        if (!normalizedBody.endsWith("\n")) generate("\n", fw);
        generate("\n", fw);
        routeCounter++;
    }

    // ============================================================
    // renderAst
    // ============================================================
    public String serializeExpression(Object expression) {
        if (expression == null) return "None";
        if (expression instanceof String text) {
            return isQuoted(text) ? text : quote(text);
        }
        return renderAst(expression);
    }

    private String renderAst(Object value) {
        if (value == null) return "";
        if (value instanceof String text) return text;
        if (value instanceof Boolean bool) return bool ? "True" : "False";
        if (value instanceof Number) return value.toString();
        if (value instanceof Collection<?> collection) {
            return joinRendered(collection);
        }

        String type = simpleName(value);
        if (type.equals("TrueAtom") || type.equals("TrueLiteralExpr")) return "True";
        if (type.equals("FalseAtom") || type.equals("FalseLiteralExpr")) return "False";
        if (type.equals("NoneAtom") || type.equals("NoneLiteralExpr")) return "None";

        // ----- Chained Assignment -----
        if (type.equals("ChainedAssignment")) {
            List<?> targets = asList(get(value, "starTargets"));
            String rhs = renderAst(get(value, "annotatedRhs"));
            List<String> all = new ArrayList<>();
            for (Object target : targets) all.add(renderAst(target));
            all.add(rhs);
            return String.join(" = ", all);
        }
        if (type.equals("StarExpressionsAnnotatedRhs")) {
            return renderAst(get(value, "starExpressions"));
        }
        if (type.equals("YieldAnnotatedRhs")) return renderAst(get(value, "yieldExpr"));
        if (type.equals("RegularStarExpression")) return renderAst(get(value, "expression"));

        // ----- Conditional Expression -----
        if (type.equals("ConditionalExpression")) {
            Object disjunctions = get(value, "disjunction");
            if (get(value, "IF") != null) {
                List<?> list = asList(disjunctions);
                if (list.size() >= 2) {
                    return renderAst(list.get(0)) + " if "
                            + renderAst(list.get(1)) + " else "
                            + renderAst(get(value, "expression"));
                }
            }
            return renderAst(disjunctions);
        }

        // ----- Arithmetic -----
        if (type.equals("AdditiveExpression")) {
            String operator = firstText(get(value, "PLUS"), get(value, "MINUS"));
            return renderAst(get(value, "sum")) + " " + operator + " "
                    + renderAst(get(value, "term"));
        }
        if (type.equals("MultiplicativeExpression")) {
            String operator = firstText(get(value, "STAR"), get(value, "SLASH"),
                    get(value, "DOUBLESLASH"), get(value, "PERCENT"), get(value, "AT"));
            return renderAst(get(value, "term")) + " " + operator + " "
                    + renderAst(get(value, "factor"));
        }

        // ----- Primary access -----
        if (type.equals("PrimaryWithAccess")) {
            String base = renderAst(get(value, "primary"));
            if (get(value, "DOT") != null) {
                return base + "." + renderAst(get(value, "name"));
            }
            if (get(value, "LPAR") != null) {
                return base + "(" + renderAst(get(value, "arguments")) + ")";
            }
            if (get(value, "LSQB") != null) {
                return base + "[" + renderAst(get(value, "slices")) + "]";
            }
            return base;
        }
        if (type.equals("Arguments")) return renderAst(get(value, "args"));

        // ----- Collections -----
        if (type.equals("Dict")) {
            return "{" + renderAst(get(value, "doubleStarredKvpairs")) + "}";
        }
        if (type.equals("RegularKvpair")) return renderAst(get(value, "kvpair"));
        if (type.equals("Kvpair")) {
            List<?> expressions = asList(get(value, "expression"));
            return expressions.size() >= 2
                    ? renderAst(expressions.get(0)) + ": " + renderAst(expressions.get(1))
                    : joinRendered(expressions);
        }
        if (type.equals("ListLiteral")) {
            return "[" + renderAst(get(value, "starNamedExpressions")) + "]";
        }
        if (type.equals("Tuple")) {
            List<String> values = new ArrayList<>();
            Object first = get(value, "starNamedExpression");
            if (first != null) values.add(renderAst(first));
            values.addAll(renderedList(get(value, "starNamedExpressions"), "starNamedExpression"));
            String inside = String.join(", ", values);
            if (get(value, "COMMA") != null && values.size() == 1) inside += ",";
            return "(" + inside + ")";
        }
        if (type.equals("DoubleStarredKeyValue")) {
            return "**" + renderAst(get(value, "bitwiseOr"));
        }

        // ----- Strings -----
        if (type.equals("StringLiteralExpr") || type.equals("StringAtom")) {
            return renderAst(get(value, "strings"));
        }

        // ----- Disjunction (or) — قائمة Conjunction -----
        if (type.equals("Disjunction")) {
            List<?> conjunctions = asList(get(value, "conjunction"));
            if (conjunctions.isEmpty()) return "";
            if (conjunctions.size() == 1) return renderAst(conjunctions.get(0));
            List<String> parts = new ArrayList<>();
            for (Object c : conjunctions) parts.add(renderAst(c));
            return String.join(" or ", parts);
        }

        // ----- Conjunction (and) — قائمة Inversion -----
        if (type.equals("Conjunction")) {
            List<?> inversions = asList(get(value, "inversion"));
            if (inversions.isEmpty()) return "";
            if (inversions.size() == 1) return renderAst(inversions.get(0));
            List<String> parts = new ArrayList<>();
            for (Object c : inversions) parts.add(renderAst(c));
            return String.join(" and ", parts);
        }

        if (type.equals("NotInversion")) {
            return "not " + renderAst(get(value, "inversion"));
        }

        // ----- Comparison -----
        if (type.equals("Comparison")) {
            String left = renderAst(get(value, "bitwiseOr"));
            List<?> pairs = asList(get(value, "compareOpBitwiseOrPair"));
            if (pairs.isEmpty()) return left;
            StringBuilder sb = new StringBuilder(left);
            for (Object p : pairs) sb.append(" ").append(renderAst(p));
            return sb.toString();
        }

        // EqComparison → EqBitwiseOr → BitwiseOr
        if (type.equals("EqComparison")) {
            return "== " + renderComparisonRight(value, "eqBitwiseOr");
        }
        if (type.equals("NotEqComparison")) {
            return "!= " + renderComparisonRight(value, "noteqBitwiseOr");
        }
        if (type.equals("LessComparison")) {
            return "< " + renderComparisonRight(value, "ltBitwiseOr");
        }
        if (type.equals("GreaterComparison")) {
            return "> " + renderComparisonRight(value, "gtBitwiseOr");
        }
        if (type.equals("LessEqComparison")) {
            return "<= " + renderComparisonRight(value, "lteBitwiseOr");
        }
        if (type.equals("GreaterEqComparison")) {
            return ">= " + renderComparisonRight(value, "gteBitwiseOr");
        }
        if (type.equals("InComparison")) {
            return "in " + renderComparisonRight(value, "inBitwiseOr");
        }
        if (type.equals("NotInComparison")) {
            return "not in " + renderComparisonRight(value, "notinBitwiseOr");
        }
        if (type.equals("IsComparison")) {
            return "is " + renderComparisonRight(value, "isBitwiseOr");
        }
        if (type.equals("IsNotComparison")) {
            return "is not " + renderComparisonRight(value, "isnotBitwiseOr");
        }

        // ----- Group -----
        if (type.equals("Group")) {
            Object named = get(value, "namedExpression");
            if (named == null) named = get(value, "yieldExpr");
            return "(" + renderAst(named) + ")";
        }

        // ----- Arguments -----
        if (type.equals("NamedArg") || type.equals("NamedKwargOrStarred")
                || type.equals("NamedDoubleStarArg") || type.equals("NamedKwargOrDoubleStarred")) {
            return renderAst(get(value, "name")) + "=" + renderAst(get(value, "expression"));
        }
        if (type.equals("PositionalArgsWithKwargs")) {
            List<String> parts = new ArrayList<>();
            Object starred = get(value, "starredExpression");
            if (starred instanceof Collection<?> cs) {
                for (Object c : cs) parts.add(renderAst(c));
            } else if (starred != null) {
                parts.add(renderAst(starred));
            }
            Object expr = get(value, "expression");
            if (expr instanceof Collection<?> cs) {
                for (Object c : cs) parts.add(renderAst(c));
            } else if (expr != null) {
                parts.add(renderAst(expr));
            }
            Object kwargs = get(value, "kwargs");
            if (kwargs != null) parts.add(renderAst(kwargs));
            return String.join(", ", parts);
        }
        if (type.equals("KeywordArgs")) return renderAst(get(value, "kwargs"));
        if (type.equals("StarredKwargs")) {
            List<String> parts = new ArrayList<>();
            for (Object k : asList(get(value, "kwargOrStarred"))) parts.add(renderAst(k));
            for (Object k : asList(get(value, "kwargOrDoubleStarred"))) parts.add(renderAst(k));
            return String.join(", ", parts);
        }
        if (type.equals("DoubleStarredKwargs")) {
            List<String> parts = new ArrayList<>();
            for (Object k : asList(get(value, "kwargOrDoubleStarred"))) parts.add(renderAst(k));
            return String.join(", ", parts);
        }

        // ----- F-Strings -----
        if (type.equals("FString") || type.equals("FStringOrStringList")) {
            Object start = get(value, "FSTRING_START");
            Object end = get(value, "FSTRING_END");
            StringBuilder sb = new StringBuilder();
            if (start != null) sb.append(start);
            else sb.append("f\"");
            for (Object m : asList(get(value, "fstringMiddle"))) {
                sb.append(renderAst(m));
            }
            if (end != null) sb.append(end);
            else sb.append("\"");
            return sb.toString();
        }
        if (type.equals("FStringMiddleText")) {
            return str(get(value, "FSTRING_MIDDLE"));
        }
        if (type.equals("FStringReplacementFieldMiddle")) {
            return renderAst(get(value, "fstringReplacementField"));
        }
        if (type.equals("FStringReplacementField")) {
            return "{" + renderAst(get(value, "annotatedRhs")) + "}";
        }

        return renderFields(value);
    }

    // ============================================================
    // renderComparisonRight — للـ CompareOpBitwiseOrPair
    // ============================================================
    private String renderComparisonRight(Object comparison, String innerFieldName) {
        // comparison.eqBitwiseOr → eqBitwiseOr.bitwiseOr
        Object inner = get(comparison, innerFieldName);
        if (inner == null) {
            // جرّب أي حقل ينتهي بـ BitwiseOr
            for (Field f : instanceFields(comparison.getClass())) {
                String n = f.getName();
                if (n.equals("nodeName") || n.equals("lineNumber")) continue;
                if (n.equals("EQEQUAL") || n.equals("NOTEQUAL")
                        || n.equals("LESS") || n.equals("GREATER")
                        || n.equals("LESSEQUAL") || n.equals("GREATEREQUAL")
                        || n.equals("IN") || n.equals("IS") || n.equals("NOT")) continue;
                Object v = readField(comparison, f);
                if (v != null) { inner = v; break; }
            }
        }
        if (inner == null) return "None";

        // داخل الحقل الوسيط، ابحث عن bitwiseOr
        Object right = get(inner, "bitwiseOr");
        if (right == null) right = get(inner, "expression");
        if (right == null) right = get(inner, "operand");
        if (right == null) right = inner;

        String rhs = renderAst(right);
        return rhs.isBlank() ? "None" : rhs;
    }

    // ============================================================
    // renderFields / renderBlock / convertRenderCalls
    // ============================================================
    private String renderFields(Object value) {
        List<String> fields = new ArrayList<>();
        for (Field field : instanceFields(value.getClass())) {
            String name = field.getName();
            if (name.equals("nodeName") || name.equals("lineNumber")
                    || name.equals("TYPE_COMMENT") || name.equals("COMMA")
                    || name.equals("SEMI") || name.equals("NEWLINE")
                    || name.equals("INDENT") || name.equals("DEDENT")) continue;
            Object fieldValue = readField(value, field);
            if (fieldValue == null) continue;

            String rendered;
            if (fieldValue instanceof Collection<?> collection) {
                rendered = joinRendered(collection);
            } else {
                rendered = renderAst(fieldValue);
            }
            if (!rendered.isBlank()) fields.add(rendered);
        }
        return String.join(" ", fields).trim();
    }

    private String joinRendered(Collection<?> values) {
        List<String> rendered = new ArrayList<>();
        for (Object value : values) {
            String item = renderAst(value);
            if (!item.isBlank()) rendered.add(item);
        }
        return String.join(", ", rendered);
    }

    private List<String> renderedList(Object holder, String fieldName) {
        List<String> values = new ArrayList<>();
        for (Object value : getList(holder, fieldName)) {
            String rendered = renderAst(value);
            if (!rendered.isBlank()) values.add(rendered);
        }
        return values;
    }

    private String renderBlock(Object block, int level) {
        if (block == null) return "";
        StringBuilder output = new StringBuilder();

        Object statements = get(block, "statements");
        if (statements instanceof Statements value && value.getStatement() != null) {
            for (Statement statement : value.getStatement()) {
                output.append(renderStatement(statement, level));
            }
        } else {
            Object simpleStmts = get(block, "simpleStmts");
            if (simpleStmts != null) {
                for (Object statement : getList(simpleStmts, "simpleStmt")) {
                    output.append(renderSimpleStatement(statement, level));
                }
            }
        }

        return convertRenderCalls(output.toString(), level);
    }

    private String renderStatement(Statement statement, int level) {
        if (statement instanceof SimpleStatements simple) {
            StringBuilder output = new StringBuilder();
            for (Object item : getList(get(simple, "simpleStmts"), "simpleStmt")) {
                output.append(renderSimpleStatement(item, level));
            }
            return output.toString();
        }
        if (statement instanceof CompoundStatement compound) {
            Object inner = get(compound, "compoundStmt");
            if (inner instanceof IfStatement conditional) {
                return renderIfBlock(conditional, level);
            }
            if (inner instanceof ForStatement forStmt) {
                return renderForBlock(forStmt, level);
            }
            if (inner instanceof WhileStatement whileStmt) {
                return renderWhileBlock(whileStmt, level);
            }
        }
        return "";
    }

    private String renderIfBlock(Object conditional, int level) {
        Object ifStmt = get(conditional, "ifStmt");
        if (ifStmt == null) ifStmt = conditional;

        String cond = renderAst(get(ifStmt, "namedExpression"));
        Object block = get(ifStmt, "block");

        StringBuilder sb = new StringBuilder();
        sb.append(indentation(level)).append("if ").append(cond).append(":\n");

        String body = renderBlock(block, level + 1);
        if (body.isBlank()) {
            sb.append(indentation(level + 1)).append("pass\n");
        } else {
            sb.append(body);
            if (!body.endsWith("\n")) sb.append("\n");
        }

        Object elif = get(ifStmt, "elifStmt");
        if (elif != null) sb.append(renderElifBlock(elif, level));

        Object elseBlock = get(ifStmt, "elseBlock");
        if (elseBlock != null) {
            sb.append(indentation(level)).append("else:\n");
            String elseBody = renderBlock(get(elseBlock, "block"), level + 1);
            if (elseBody.isBlank()) {
                sb.append(indentation(level + 1)).append("pass\n");
            } else {
                sb.append(elseBody);
                if (!elseBody.endsWith("\n")) sb.append("\n");
            }
        }
        return sb.toString();
    }

    private String renderElifBlock(Object elif, int level) {
        StringBuilder sb = new StringBuilder();
        sb.append(indentation(level)).append("elif ")
                .append(renderAst(get(elif, "namedExpression"))).append(":\n");

        String body = renderBlock(get(elif, "block"), level + 1);
        if (body.isBlank()) {
            sb.append(indentation(level + 1)).append("pass\n");
        } else {
            sb.append(body);
            if (!body.endsWith("\n")) sb.append("\n");
        }

        Object nextElif = get(elif, "elifStmt");
        if (nextElif != null) sb.append(renderElifBlock(nextElif, level));

        Object elseBlock = get(elif, "elseBlock");
        if (elseBlock != null) {
            sb.append(indentation(level)).append("else:\n");
            String elseBody = renderBlock(get(elseBlock, "block"), level + 1);
            if (elseBody.isBlank()) {
                sb.append(indentation(level + 1)).append("pass\n");
            } else {
                sb.append(elseBody);
            }
        }
        return sb.toString();
    }

    private String renderForBlock(Object forStmt, int level) {
        Object raw = get(forStmt, "forStmt");
        if (raw == null) raw = forStmt;

        StringBuilder sb = new StringBuilder();
        sb.append(indentation(level)).append("for ")
                .append(renderAst(get(raw, "starTargets"))).append(" in ")
                .append(renderAst(get(raw, "starExpressions"))).append(":\n");

        String body = renderBlock(get(raw, "block"), level + 1);
        if (body.isBlank()) {
            sb.append(indentation(level + 1)).append("pass\n");
        } else {
            sb.append(body);
        }
        return sb.toString();
    }

    private String renderWhileBlock(Object whileStmt, int level) {
        Object raw = get(whileStmt, "whileStmt");
        if (raw == null) raw = whileStmt;

        StringBuilder sb = new StringBuilder();
        sb.append(indentation(level)).append("while ")
                .append(renderAst(get(raw, "namedExpression"))).append(":\n");

        String body = renderBlock(get(raw, "block"), level + 1);
        if (body.isBlank()) {
            sb.append(indentation(level + 1)).append("pass\n");
        } else {
            sb.append(body);
        }
        return sb.toString();
    }

    private String renderSimpleStatement(Object statement, int level) {
        String prefix = indentation(level);
        if (statement instanceof AssignmentStatement assignmentStatement) {
            return prefix + renderAst(get(assignmentStatement, "assignment")) + "\n";
        }
        if (statement instanceof ReturnStatement returnStatement) {
            String expression = renderAst(get(get(returnStatement, "returnStmt"), "starExpressions"));
            return prefix + "return" + (expression.isBlank() ? "" : " " + expression) + "\n";
        }
        if (statement instanceof StarExpressionStatement expressionStatement) {
            String translated = translateExpressionStatement(
                    renderAst(get(expressionStatement, "starExpressions")));
            return translated.isBlank() ? "" : prefix + translated + "\n";
        }
        if (simpleName(statement).equals("PassStatement")) return prefix + "pass\n";
        if (simpleName(statement).equals("BreakStatement")) return prefix + "break\n";
        if (simpleName(statement).equals("ContinueStatement")) return prefix + "continue\n";
        return "";
    }

    // ============================================================
    // convertRenderCalls — التحويلات النهائية
    // ============================================================
    private String convertRenderCalls(String body, int level) {
        body = translateRegexMatch(body);
        body = translateFormCalls(body);

        Matcher m = Pattern.compile("html\\s*=\\s*render\\((.+?)\\)\\s*$",
                Pattern.MULTILINE).matcher(body);
        String templateCall = null;
        if (m.find()) {
            templateCall = indentation(level) + "return render_template("
                    + convertRenderArgs(m.group(1)) + ")\n";
        }

        StringBuilder cleaned = new StringBuilder();
        for (String line : body.split("\n", -1)) {
            String t = line.trim();
            if (t.isEmpty()) continue;
            if (t.startsWith("html = render(")) continue;
            if (t.equals("self.send_html(html)")) continue;
            if (t.startsWith("self.send_html(html,")) continue;
            if (t.startsWith("self.send_css(")) continue;
            if (t.equals("return")) continue;

            if (t.startsWith("self.redirect_to(")) {
                String url = t.substring("self.redirect_to(".length(), t.length() - 1).trim();
                String indent = line.substring(0, line.indexOf(t));
                cleaned.append(indent)
                        .append(translateRedirect(url))
                        .append("\n");
                continue;
            }

            cleaned.append(line).append("\n");
        }

        if (templateCall != null) return templateCall;
        return cleaned.toString();
    }

    private String translateRegexMatch(String body) {
        body = body.replaceAll(
                "(?m)^[ \\t]*\\w+[ \\t]*=[ \\t]*re\\.match\\([^\\n]*\\)[ \\t]*$", "");
        body = body.replaceAll("int\\(m\\.group\\((\\d+)\\)\\)", "int(arg0)");
        body = body.replaceAll("m\\.group\\((\\d+)\\)", "arg0");
        return body;
    }

    private String translateFormCalls(String body) {
        body = body.replaceAll("(?m)^[ \\t]*form[ \\t]*=[ \\t]*self\\.read_form\\(\\)[ \\t]*$", "");
        body = body.replace("form.get(", "request.form.get(");
        body = body.replaceAll("\\bform\\[", "request.form[");
        return body;
    }

    private String translateRedirect(String target) {
        Matcher fm = Pattern.compile(
                "^f?[\"'].*?\\{\\s*(\\w+)\\s*\\}.*?[\"']$"
        ).matcher(target);
        if (fm.find()) {
            String param = fm.group(1);
            return "return redirect(url_for('book_arg0', arg0=" + param + "))";
        }

        if (isQuoted(target)) {
            String path = unquote(target);
            return "return redirect(" + pathToUrlFor(path) + ")";
        }

        return "return redirect(url_for(" + target + "))";
    }

    private String translateExpressionStatement(String expression) {
        if (expression.contains("self.send_html")) return "";

        String prefix = "self.redirect_to(";
        if (!expression.startsWith(prefix) || !expression.endsWith(")")) {
            return expression;
        }

        String target = expression.substring(prefix.length(), expression.length() - 1).trim();
        return translateRedirect(target);
    }

    private String convertRenderArgs(String args) {
        int commaIdx = args.indexOf(',');
        if (commaIdx < 0) return args;
        String template = args.substring(0, commaIdx).trim();
        String dict = args.substring(commaIdx + 1).trim();
        if (!dict.startsWith("{") || !dict.endsWith("}")) return args;
        String inner = dict.substring(1, dict.length() - 1).trim();
        if (inner.isEmpty()) return template;
        String[] pairs = inner.split(",");
        StringBuilder result = new StringBuilder(template);
        for (String pair : pairs) {
            int colon = pair.indexOf(':');
            if (colon < 0) continue;
            String key = pair.substring(0, colon).trim().replaceAll("^[\"']|[\"']$", "");
            String val = pair.substring(colon + 1).trim();
            result.append(", ").append(key).append("=").append(val);
        }
        return result.toString();
    }

    // ============================================================
    // Helpers
    // ============================================================
    private void generate(String text, FileWriter fw) throws IOException {
        fw.append(text);
    }

    private String indent() {
        return indentation(indentLevel);
    }

    private String indentation(int level) {
        return "    ".repeat(Math.max(0, level));
    }

    private String pathToFunctionName(String path) {
        Matcher matcher = PATH_PARAM.matcher(path);
        StringBuilder result = new StringBuilder();
        int start = 0;
        while (matcher.find()) {
            result.append(path, start, matcher.start()).append('_').append(matcher.group(1));
            start = matcher.end();
        }
        result.append(path.substring(start));
        String name = result.toString().replaceAll("[^A-Za-z0-9_]+", "_")
                .replaceAll("_+", "_").replaceAll("^_|_$", "");
        return name.isEmpty() ? "index" : name;
    }

    private List<String> extractPathParams(String path) {
        List<String> params = new ArrayList<>();
        Matcher matcher = PATH_PARAM.matcher(path);
        while (matcher.find()) params.add(matcher.group(1));
        return params;
    }

    private String pathToUrlFor(String path) {
        Matcher m = Pattern.compile("book/\\{(\\w+)\\}").matcher(path);
        if (m.find()) {
            String param = m.group(1);
            return "url_for('book_arg0', arg0=" + param + ")";
        }
        return "url_for(" + quote(pathToFunctionName(path)) + ")";
    }

    private String serializePythonList(List<String> values) {
        List<String> quoted = new ArrayList<>();
        for (String value : values) quoted.add(quote(value));
        return "[" + String.join(", ", quoted) + "]";
    }

    private String quote(String value) {
        return "\"" + value.replace("\\", "\\\\").replace("\"", "\\\"")
                .replace("\n", "\\n").replace("\r", "\\r") + "\"";
    }

    private boolean isQuoted(String text) {
        return text.length() >= 2
                && ((text.startsWith("\"") && text.endsWith("\""))
                || (text.startsWith("'") && text.endsWith("'")));
    }

    private String unquote(String text) {
        return isQuoted(text) ? text.substring(1, text.length() - 1) : text;
    }

    private String str(Object o) {
        return o == null ? "" : o.toString();
    }

    private String firstText(Object... candidates) {
        for (Object candidate : candidates) {
            if (candidate != null && !candidate.toString().isBlank()) return candidate.toString();
        }
        return "";
    }

    private Object unwrap(Object node, String... fields) {
        Object current = node;
        for (int depth = 0; depth < 8 && current != null; depth++) {
            Object next = null;
            for (String field : fields) {
                next = get(current, field);
                if (next != null) break;
            }
            if (next == null || next == current) return current;
            current = next;
        }
        return current;
    }

    private List<Object> findNodes(Object root, String wantedType) {
        List<Object> matches = new ArrayList<>();
        collectNodes(root, wantedType, matches, Collections.newSetFromMap(new IdentityHashMap<>()));
        return matches;
    }

    private void collectNodes(Object value, String wantedType, List<Object> matches,
                              Set<Object> visited) {
        if (value == null || value instanceof String || value instanceof Number
                || value instanceof Boolean || !visited.add(value)) return;
        if (simpleName(value).equals(wantedType)) matches.add(value);

        if (value instanceof Collection<?> collection) {
            for (Object child : collection) collectNodes(child, wantedType, matches, visited);
            return;
        }
        for (Field field : instanceFields(value.getClass())) {
            String name = field.getName();
            if (name.equals("nodeName") || name.equals("lineNumber")) continue;
            collectNodes(readField(value, field), wantedType, matches, visited);
        }
    }

    private Object get(Object object, String fieldName) {
        if (object == null) return null;
        for (Class<?> type = object.getClass(); type != null; type = type.getSuperclass()) {
            try {
                Field field = type.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field.get(object);
            } catch (NoSuchFieldException ignored) {
                // ابحث في الأب
            } catch (ReflectiveOperationException exception) {
                throw new IllegalStateException("Could not read AST field "
                        + fieldName + " from " + simpleName(object), exception);
            }
        }
        return null;
    }

    private List<Object> getList(Object object, String... fieldNames) {
        List<Object> values = new ArrayList<>();
        for (String fieldName : fieldNames) {
            Object value = get(object, fieldName);
            if (value instanceof Collection<?> collection) {
                values.addAll(collection);
            } else if (value != null) {
                values.add(value);
            }
        }
        return values;
    }

    private List<?> asList(Object value) {
        return value instanceof List<?> list ? list : Collections.emptyList();
    }

    private String simpleName(Object value) {
        return value == null ? "" : value.getClass().getSimpleName();
    }

    private List<Field> instanceFields(Class<?> concreteType) {
        List<Field> fields = new ArrayList<>();
        Deque<Class<?>> hierarchy = new ArrayDeque<>();
        for (Class<?> type = concreteType; type != null && type != Object.class;
             type = type.getSuperclass()) {
            hierarchy.push(type);
        }
        while (!hierarchy.isEmpty()) {
            for (Field field : hierarchy.pop().getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) fields.add(field);
            }
        }
        return fields;
    }

    private Object readField(Object object, Field field) {
        try {
            field.setAccessible(true);
            return field.get(object);
        } catch (ReflectiveOperationException exception) {
            throw new IllegalStateException("Could not read AST field "
                    + field.getName() + " from " + simpleName(object), exception);
        }
    }

    private void resetGenerationState() {
        indentLevel = 0;
        dataVariable = "products";
        firstFunction = true;
        insideFunction = false;
        hasReturn = false;
        currentFunctionName = "";
        wroteAppFactory = false;
        inBody = false;
        routeCounter = 0;
        hasParams = false;
        detectedRoutes.clear();
        routeBodies.clear();
        routeMethodBodies.clear();
    }

    private void copyDirectory(Path source, Path destination) throws IOException {
        if (source == null || !Files.isDirectory(source)) return;
        Files.createDirectories(destination);
        try (Stream<Path> paths = Files.walk(source)) {
            for (Path path : paths.toList()) {
                if (Files.isRegularFile(path)) {
                    Path relative = source.relativize(path);
                    Path target = destination.resolve(relative);
                    Files.createDirectories(target.getParent());
                    Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }
}