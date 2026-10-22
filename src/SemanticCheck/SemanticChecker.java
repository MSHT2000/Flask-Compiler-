package SemanticCheck;

import AST.Python.*;
import AST.Jinja.TemplateDocument;
import SymbolTable.Symbol;
import SymbolTable.SymbolTable;

import java.lang.reflect.Field;
import java.util.*;
import java.util.Set;

public class SemanticChecker {
    // الحقول
    private final SymbolTable table;
    private final List<String> errors   = new ArrayList<>();
    private final List<String> warnings = new ArrayList<>();

    private int loopDepth = 0;
    private int functionDepth = 0;
    private int asyncDepth = 0;

    private final Map<String, String> knownNameScope = new HashMap<>();

    // BUILTINS (Python)

    private static final Set<String> BUILTINS = new HashSet<>(Arrays.asList(
        "print", "len", "str", "int", "float", "bool", "list", "dict",
        "set", "tuple", "max", "min", "sum", "abs", "round", "range",
        "enumerate", "zip", "sorted", "reversed", "open", "isinstance",
        "type", "getattr", "setattr", "hasattr", "repr", "hash", "id",
        "iter", "next", "map", "filter", "input", "format", "callable",
        "dir", "vars", "locals", "globals", "eval", "exec", "compile",
        "self", "super", "object", "cls", "classmethod", "staticmethod", "property",
        "Exception", "ValueError", "TypeError", "KeyError", "IndexError",
        "AttributeError", "NameError", "RuntimeError", "StopIteration",
        "BaseException", "ArithmeticError",
        "None", "True", "False", "__name__", "__file__", "__doc__",
        "render_template", "request", "redirect", "url_for", "abort",
        "Flask", "Response", "session", "flash", "g",
        "HTTPServer", "BaseHTTPRequestHandler",
        "urllib", "re", "os", "io", "json", "sys", "time", "datetime"
    ));

    private static final Map<String, Integer> BUILTIN_ARG_COUNT = new HashMap<>();
    static {
        BUILTIN_ARG_COUNT.put("len", 1);   BUILTIN_ARG_COUNT.put("str", 1);
        BUILTIN_ARG_COUNT.put("int", 1);   BUILTIN_ARG_COUNT.put("float", 1);
        BUILTIN_ARG_COUNT.put("bool", 1);  BUILTIN_ARG_COUNT.put("abs", 1);
        BUILTIN_ARG_COUNT.put("round", 1); BUILTIN_ARG_COUNT.put("repr", 1);
        BUILTIN_ARG_COUNT.put("hash", 1);  BUILTIN_ARG_COUNT.put("id", 1);
        BUILTIN_ARG_COUNT.put("sorted", 1);BUILTIN_ARG_COUNT.put("reversed", 1);
        BUILTIN_ARG_COUNT.put("iter", 1);  BUILTIN_ARG_COUNT.put("next", 1);
        BUILTIN_ARG_COUNT.put("type", 1);  BUILTIN_ARG_COUNT.put("callable", 1);
        BUILTIN_ARG_COUNT.put("isinstance", 2);
        BUILTIN_ARG_COUNT.put("hasattr", 2);
        BUILTIN_ARG_COUNT.put("getattr", 2);
        BUILTIN_ARG_COUNT.put("setattr", 3);
    }

    // Jinja constants

    /** فلاتر Jinja2 القياسية (Jinja 3.x) */
    private static final Set<String> KNOWN_FILTERS = new HashSet<>(Arrays.asList(
        "abs", "attr", "batch", "capitalize", "center", "count", "d",
        "default", "dictsort", "e", "escape", "filesizeformat", "first",
        "float", "forceescape", "format", "groupby", "indent", "int",
        "join", "last", "length", "list", "lower", "map", "max", "min",
        "pprint", "random", "reject", "rejectattr", "replace", "reverse",
        "round", "safe", "select", "selectattr", "slice", "sort",
        "string", "striptags", "sum", "title", "tojson", "trim",
        "truncate", "unique", "upper", "urlencode", "urlize",
        "wordcount", "wordwrap", "xmlattr", "selecteq"
    ));

    /** متغيرات Jinja المدمجة (globals) */
    private static final Set<String> KNOWN_JINJA_GLOBALS = new HashSet<>(Arrays.asList(
        "range", "dict", "lipsum", "cycler", "joiner", "namespace",
        "loop", "self", "super", "varargs", "kwargs", "caller",
        "request", "session", "g", "url_for", "get_flashed_messages",
        "config", "None", "True", "False"
    ));

    public SemanticChecker(SymbolTable table) {
        this.table = table;
    }

    // نقطة الدخول

    /** فحص Python فقط (توافق خلفي) */
    public void check(FileInput file) {
        if (file == null || file.getStatements() == null) return;
        prescan(file);
        for (Statement stmt : file.getStatements().getStatement()) checkStatement(stmt);
        for (Symbol s : table.globalScope().symbols.values()) {
            if (s.used || s.kind == Symbol.Kind.IMPORT
                    || s.kind == Symbol.Kind.FUNCTION
                    || s.kind == Symbol.Kind.CLASS) continue;
            warnings.add("Line " + s.line + ": '" + s.name + "' is defined but never used");
        }
    }

    /** فحص Python + Jinja2 — الموصى به */
    public void check(FileInput file, Map<String, TemplateDocument> templates) {
        check(file);        // Python
        checkJinja(templates);  // Jinja2
    }

    public List<String> getErrors()   { return errors; }
    public List<String> getWarnings() { return warnings; }
    // Pass 1: prescan
    private void prescan(FileInput file) {
        for (Statement stmt : file.getStatements().getStatement()) {
            if (!(stmt instanceof CompoundStatement compound)) continue;
            Object inner = get(compound, "compoundStmt");

            if (inner instanceof FunctionDefinition fn) {
                String name = extractFunctionName(fn);
                if (name == null) continue;
                Symbol existing = table.globalScope().lookupLocal(name);
                if (existing != null) {
                    warnings.add("Line " + getLine(fn) + ": redefinition of '" + name + "'");
                } else {
                    Symbol s = new Symbol(name, Symbol.Kind.FUNCTION, getLine(fn), "function");
                    s.paramCount = countParams(fn);
                    table.globalScope().define(s);
                    knownNameScope.put(name, "global");
                }
            } else if (inner instanceof ClassDefinition cls) {
                String name = extractClassName(cls);
                if (name == null) continue;
                Symbol existing = table.globalScope().lookupLocal(name);
                if (existing != null) {
                    warnings.add("Line " + getLine(cls) + ": redefinition of '" + name + "'");
                } else {
                    table.globalScope().define(
                        new Symbol(name, Symbol.Kind.CLASS, getLine(cls), "class"));
                    knownNameScope.put(name, "global");
                }
            }
        }
    }

    // Statement dispatch

    private void checkStatement(Statement stmt) {
        if (stmt instanceof SimpleStatements simple) {
            Object inner = get(simple, "simpleStmts");
            for (Object s : getList(inner, "simpleStmt")) checkSimpleStmt(s);
        } else if (stmt instanceof CompoundStatement compound) {
            checkCompoundStmt(get(compound, "compoundStmt"));
        }
    }

    private void checkSimpleStmt(Object stmt) {
        if (stmt == null) return;
        switch (simpleName(stmt)) {
            case "AssignmentStatement" -> checkAssignment(get(stmt, "assignment"));
            case "ReturnStatement" -> {
                if (functionDepth == 0)
                    errors.add("Line " + getLine(stmt) + ": 'return' outside function");
                Object rs = get(stmt, "returnStmt");
                if (rs != null) checkExpression(get(rs, "starExpressions"));
            }
            case "YieldStatement" -> {
                if (functionDepth == 0)
                    errors.add("Line " + getLine(stmt) + ": 'yield' outside function");
                Object ys = get(stmt, "yieldStmt");
                if (ys != null) checkExpression(get(ys, "yieldExpr"));
            }
            case "BreakStatement" -> {
                if (loopDepth == 0)
                    errors.add("Line " + getLine(stmt) + ": 'break' outside loop");
            }
            case "ContinueStatement" -> {
                if (loopDepth == 0)
                    errors.add("Line " + getLine(stmt) + ": 'continue' outside loop");
            }
            case "StarExpressionStatement" -> checkExpression(get(stmt, "starExpressions"));
            case "ImportStatement" -> handleImport(get(stmt, "importStmt"));
        }
    }

    private void checkCompoundStmt(Object compound) {
        if (compound == null) return;
        switch (simpleName(compound)) {
            case "FunctionDefinition" -> checkFunction(compound);
            case "ClassDefinition"    -> checkClass(compound);
            case "IfStatement"        -> checkIf(compound);
            case "ForStatement"       -> checkFor(compound);
            case "WhileStatement"     -> checkWhile(compound);
        }
    }

    // ═══════════════════════════════════════════════════════════
    // Imports
    // ═══════════════════════════════════════════════════════════

    private void handleImport(Object importStmt) {
        if (importStmt == null) return;
        String cls = simpleName(importStmt);
        if (cls.equals("ImportNameStatement")) {
            Object inner = get(importStmt, "importName");
            if (inner == null) inner = importStmt;
            Object names = get(inner, "dottedAsNames");
            if (names == null) return;
            for (Object item : getList(names, "dottedAsName")) {
                String name = extractFirstDottedName(get(item, "dottedName"));
                if (name != null) {
                    table.define(new Symbol(name, Symbol.Kind.IMPORT, getLine(importStmt), "import"));
                    knownNameScope.put(name, "global");
                }
            }
        } else if (cls.equals("ImportFromStatement")) {
            Object from = get(importStmt, "importFrom");
            if (from == null) from = importStmt;
            Object targets = get(from, "importFromTargets");
            if (targets == null) return;
            Object names = get(targets, "importFromAsNames");
            if (names == null) return;
            for (Object item : getList(names, "importFromAsName")) {
                Object nameList = get(item, "name");
                if (nameList instanceof List<?> l && !l.isEmpty()) {
                    String name = extractName(l.get(0));
                    if (name != null) {
                        table.define(new Symbol(name, Symbol.Kind.IMPORT, getLine(importStmt), "import"));
                        knownNameScope.put(name, "global");
                    }
                }
            }
        }
    }

    private String extractFirstDottedName(Object dotted) {
        Object cur = dotted;
        while (cur != null) {
            if (simpleName(cur).equals("SimpleDottedName"))
                return extractName(get(cur, "name"));
            Object inner = get(cur, "dottedName");
            if (inner == null) return extractName(get(cur, "name"));
            cur = inner;
        }
        return null;
    }

    // ═══════════════════════════════════════════════════════════
    // Functions
    // ═══════════════════════════════════════════════════════════

    private void checkFunction(Object fn) {
        Object raw = unwrap(get(fn, "functionDef"),
                "undecoratedFunctionDefinition", "decoratedFunctionDefinition", "functionDefRaw");
        String name = extractName(get(raw, "name"));
        if (name == null) return;

        boolean isAsync = simpleName(raw).equals("AsyncFunction")
                || get(raw, "ASYNC") != null
                || get(raw, "asyncToken") != null;

        if (table.currentScope() != table.globalScope()) {
            Symbol existing = table.resolveLocal(name);
            if (existing != null) {
                warnings.add("Line " + getLine(fn) + ": redefinition of '" + name + "'");
            } else {
                Symbol s = new Symbol(name, Symbol.Kind.FUNCTION, getLine(fn), "function");
                s.paramCount = countParamsFromRaw(raw);
                table.define(s);
                knownNameScope.put(name, table.currentScope().name);
            }
        }

        table.enterScope("function:" + name);
        functionDepth++;
        if (isAsync) asyncDepth++;
        int savedLoop = loopDepth;
        loopDepth = 0;

        defineParams(get(raw, "params"));
        checkBlock(get(raw, "block"));
        checkUnusedParameters();

        loopDepth = savedLoop;
        if (isAsync) asyncDepth--;
        functionDepth--;
        table.exitScope();
    }

    private void checkUnusedParameters() {
        for (Symbol s : table.currentScope().symbols.values()) {
            if (s.kind == Symbol.Kind.PARAMETER && !s.used
                    && !s.name.equals("self") && !s.name.equals("cls")) {
                warnings.add("Line " + s.line + ": parameter '" + s.name + "' is never used");
            }
        }
    }

    private void defineParams(Object params) {
        if (params == null) return;
        Object inner = get(params, "parameters");
        if (inner == null) inner = params;
        for (String f : new String[]{"paramNoDefault", "paramWithDefault",
                "paramNoDefaultList", "paramWithDefaultList"}) {
            for (Object p : getList(inner, f)) {
                Object param = get(p, "param");
                if (param == null) param = p;
                String name = extractName(get(param, "name"));
                if (name != null && !name.isEmpty()) {
                    if (table.resolveLocal(name) != null) {
                        errors.add("Line " + getLine(param) + ": duplicate parameter '" + name + "'");
                    } else {
                        Symbol s = new Symbol(name, Symbol.Kind.PARAMETER, getLine(param), null);
                        table.define(s);
                        knownNameScope.put(name, table.currentScope().name);
                    }
                }
            }
        }
    }

    // ═══════════════════════════════════════════════════════════
    // Classes
    // ═══════════════════════════════════════════════════════════

    private void checkClass(Object cls) {
        Object raw = unwrap(get(cls, "classDef"),
                "undecoratedClassDefinition", "decoratedClassDefinition", "classDefRaw");
        String name = extractName(get(raw, "name"));
        if (name == null) return;

        table.enterScope("class:" + name);
        Object block = get(raw, "block");
        if (block != null) {
            Object stmts = get(block, "statements");
            if (stmts instanceof Statements s && s.getStatement() != null) {
                for (Statement st : s.getStatement()) {
                    if (st instanceof CompoundStatement c) {
                        Object inner = get(c, "compoundStmt");
                        if (inner instanceof FunctionDefinition fn) checkFunction(fn);
                    }
                }
            }
        }
        table.exitScope();
    }

    // ═══════════════════════════════════════════════════════════
    // If / For / While
    // ═══════════════════════════════════════════════════════════

    private void checkIf(Object ifStmt) {
        Object raw = get(ifStmt, "ifStmt");
        if (raw == null) raw = ifStmt;

        checkExpression(get(raw, "namedExpression"));
        table.enterScope("if");
        checkBlock(get(raw, "block"));
        table.exitScope();

        Object elif = get(raw, "elifStmt");
        while (elif != null) {
            checkExpression(get(elif, "namedExpression"));
            table.enterScope("elif");
            checkBlock(get(elif, "block"));
            table.exitScope();
            elif = get(elif, "elifStmt");
        }

        Object elseBlock = get(raw, "elseBlock");
        if (elseBlock != null) {
            table.enterScope("else");
            checkBlock(get(elseBlock, "block"));
            table.exitScope();
        }
    }

    private void checkFor(Object forStmt) {
        Object raw = get(forStmt, "forStmt");
        if (raw == null) raw = forStmt;
        checkExpression(get(raw, "starExpressions"));
        table.enterScope("for");
        defineTargets(get(raw, "starTargets"), null, getLine(raw));
        loopDepth++;
        checkBlock(get(raw, "block"));
        loopDepth--;
        table.exitScope();
    }

    private void checkWhile(Object whileStmt) {
        Object raw = get(whileStmt, "whileStmt");
        if (raw == null) raw = whileStmt;
        checkExpression(get(raw, "namedExpression"));
        table.enterScope("while");
        loopDepth++;
        checkBlock(get(raw, "block"));
        loopDepth--;
        table.exitScope();
    }

    // ═══════════════════════════════════════════════════════════
    // Block — مع unreachable detection
    // ═══════════════════════════════════════════════════════════

    private void checkBlock(Object block) {
        if (block == null) return;
        Object stmts = get(block, "statements");
        if (stmts instanceof Statements s && s.getStatement() != null) {
            boolean terminated = false;
            for (Statement st : s.getStatement()) {
                if (terminated)
                    warnings.add("Line " + getLine(st) + ": unreachable code after return/raise/break/continue");
                checkStatement(st);
                if (statementTerminates(st)) terminated = true;
            }
            return;
        }
        Object simpleStmts = get(block, "simpleStmts");
        if (simpleStmts != null) {
            boolean terminated = false;
            for (Object s : getList(simpleStmts, "simpleStmt")) {
                if (terminated)
                    warnings.add("Line " + getLine(s) + ": unreachable code after return/raise/break/continue");
                checkSimpleStmt(s);
                if (simpleStmtTerminates(s)) terminated = true;
            }
        }
    }

    private boolean statementTerminates(Statement st) {
        if (st instanceof SimpleStatements simple) {
            Object inner = get(simple, "simpleStmts");
            List<Object> list = getList(inner, "simpleStmt");
            if (!list.isEmpty()) return simpleStmtTerminates(list.get(list.size() - 1));
        }
        return false;
    }

    private boolean simpleStmtTerminates(Object s) {
        String cls = simpleName(s);
        return cls.equals("ReturnStatement") || cls.equals("RaiseStatement")
            || cls.equals("BreakStatement")  || cls.equals("ContinueStatement");
    }

    // ═══════════════════════════════════════════════════════════
    // Assignment
    // ═══════════════════════════════════════════════════════════

    private void checkAssignment(Object assignment) {
        if (assignment == null) return;
        switch (simpleName(assignment)) {
            case "ChainedAssignment" -> {
                Object rhs = get(assignment, "annotatedRhs");
                String type = inferType(rhs);
                checkExpression(rhs);
                Object targets = get(assignment, "starTargets");
                List<String> targetNames = extractAllTargetNames(targets);
                if (targetNames.isEmpty()) {
                    errors.add("Line " + getLine(assignment) + ": invalid assignment target");
                } else if (targetNames.size() > 1) {
                    int rhsSize = tupleSizeFromRhs(rhs);
                    if (rhsSize > 0 && rhsSize != targetNames.size()) {
                        errors.add("Line " + getLine(assignment) + ": cannot unpack "
                                + rhsSize + " values into " + targetNames.size() + " targets");
                    }
                }
                defineTargets(targets, type, getLine(assignment));
            }
            case "AugmentedAssignment" -> {
                String target = extractTargetName(get(assignment, "singleTarget"));
                if (target != null) {
                    Symbol s = table.resolve(target);
                    if (s == null)
                        errors.add("Line " + getLine(assignment) + ": undefined variable '" + target + "'");
                    else s.used = true;
                }
                checkExpression(get(assignment, "annotatedRhs"));
            }
            case "AnnotatedAssignmentName" -> {
                String name = extractName(get(assignment, "name"));
                String type = extractName(get(assignment, "expression"));
                if (name != null)
                    defineSymbol(name, Symbol.Kind.VARIABLE, getLine(assignment), type);
            }
        }
    }

    private void defineTargets(Object targets, String type, int line) {
        if (targets == null) return;
        List<Object> items = new ArrayList<>();
        if (targets instanceof List<?> list) {
            for (Object t : list) {
                if (t == null) continue;
                List<?> inner = getList(t, "starTarget");
                if (inner.isEmpty()) items.add(t);
                else items.addAll(inner);
            }
        } else {
            List<?> inner = getList(targets, "starTarget");
            if (inner.isEmpty()) items.add(targets);
            else items.addAll(inner);
        }
        for (Object t : items) defineTarget(t, type, line);
    }

    private void defineTarget(Object target, String type, int line) {
        if (target == null) return;
        String name = extractTargetName(target);
        if (name == null || name.isBlank()) return;
        defineSymbol(name, Symbol.Kind.VARIABLE, line, type);
    }

    private void defineSymbol(String name, Symbol.Kind kind, int line, String type) {
        if (BUILTINS.contains(name) && kind == Symbol.Kind.VARIABLE)
            warnings.add("Line " + line + ": '" + name + "' shadows builtin");

        Symbol existing = table.resolveLocal(name);
        if (existing != null) {
            if (kind == Symbol.Kind.VARIABLE) return;
            if (kind == Symbol.Kind.FUNCTION || kind == Symbol.Kind.CLASS)
                warnings.add("Line " + line + ": redefinition of '" + name + "'");
            return;
        }
        table.define(new Symbol(name, kind, line, type));
        knownNameScope.put(name, table.currentScope().name);
    }

    // ═══════════════════════════════════════════════════════════
    // Expression traversal (Python)
    // ═══════════════════════════════════════════════════════════

    private void checkExpression(Object expr) {
        if (expr == null) return;
        String cls = simpleName(expr);

        if (cls.equals("NamedArg") || cls.equals("NamedDoubleStarArg")
                || cls.equals("NamedKwargOrStarred") || cls.equals("NamedKwargOrDoubleStarred")
                || cls.equals("KeywordArgument")) {
            Object e = get(expr, "expression");
            if (e == null) e = get(expr, "value");
            checkExpression(e);
            return;
        }

        if (cls.equals("AwaitExpression")) {
            if (asyncDepth == 0)
                errors.add("Line " + getLine(expr) + ": 'await' outside async function");
            checkExpression(get(expr, "primary"));
            return;
        }

        if (cls.equals("PrimaryWithAccess")) {
            Object base = get(expr, "primary");
            Object attr = get(expr, "name");
            Object args = get(expr, "arguments");
            Object lpar = get(expr, "LPAR");
            if (lpar == null) lpar = get(expr, "lpar");
            boolean isCall = (lpar != null) || (args != null);

            if (isCall) {
                String funcName = (attr != null) ? extractName(attr)
                                : (base != null) ? extractName(base) : null;
                if (funcName != null) {
                    Integer expected = BUILTIN_ARG_COUNT.get(funcName);
                    if (expected != null) {
                        int actual = (args != null) ? countArgs(args) : 0;
                        if (actual != expected)
                            errors.add("Line " + getLine(expr) + ": builtin '" + funcName
                                    + "' expects " + expected + ", got " + actual);
                    } else if (!BUILTINS.contains(funcName)) {
                        Symbol s = table.resolve(funcName);
                        if (s != null && s.kind != Symbol.Kind.FUNCTION) {
                            errors.add("Line " + getLine(expr) + ": '" + funcName + "' is not callable");
                            s.used = true;
                        } else if (s != null && s.paramCount >= 0) {
                            int cnt = (args != null) ? countArgs(args) : 0;
                            if (cnt != s.paramCount)
                                errors.add("Line " + getLine(expr) + ": '" + funcName
                                        + "' expects " + s.paramCount + ", got " + cnt);
                            s.used = true;
                        }
                    }
                }
            }
            if (base != null) checkExpression(base);
            if (args != null) checkExpression(args);
            Object slices = get(expr, "slices");
            if (slices != null) checkExpression(slices);
            return;
        }

        if (cls.equals("AtomOperand")) { checkExpression(get(expr, "atom")); return; }
        if (cls.equals("NameAtom")) {
            useVariable(extractName(get(expr, "name")), getLine(expr)); return;
        }
        if (cls.equals("RegularName") || cls.equals("NonWildcardName")) {
            useVariable(extractName(expr), getLine(expr)); return;
        }

        if (cls.equals("Genexp")) {
            table.enterScope("genexp");
            Object clauses = get(expr, "forIfClauses");
            if (clauses != null) {
                for (Object clause : getList(clauses, "forIfClause")) {
                    defineTargets(get(clause, "starTargets"), null, getLine(expr));
                    Object disj = get(clause, "disjunction");
                    if (disj instanceof List<?> l) {
                        for (Object d : l) checkExpression(d);
                    } else if (disj != null) checkExpression(disj);
                }
            }
            checkExpression(get(expr, "expression"));
            checkExpression(get(expr, "assignmentExpression"));
            table.exitScope();
            return;
        }

        if (cls.equals("Comparison")) {
            Object left = get(expr, "bitwiseOr");
            String leftType = inferType(left);
            for (Object pair : getList(expr, "compareOpBitwiseOrPair")) {
                Object right = get(pair, "bitwiseOr");
                String rightType = inferType(right);
                if (leftType != null && rightType != null
                        && !leftType.equals(rightType)
                        && !(isNumeric(leftType) && isNumeric(rightType))
                        && !leftType.equals("NoneType") && !rightType.equals("NoneType"))
                    errors.add("Line " + getLine(expr) + ": comparing "
                            + leftType + " with " + rightType);
                checkExpression(right);
            }
            checkExpression(left);
            return;
        }

        if (cls.equals("AdditiveExpression")) {
            String op = get(expr, "PLUS") != null ? "+" : "-";
            String leftType  = inferType(get(expr, "sum"));
            String rightType = inferType(get(expr, "term"));
            if (op.equals("+") && leftType != null && rightType != null
                    && !leftType.equals(rightType)
                    && (leftType.equals("str") || rightType.equals("str")))
                errors.add("Line " + getLine(expr) + ": type mismatch — "
                        + leftType + " " + op + " " + rightType);
            checkExpression(get(expr, "sum"));
            checkExpression(get(expr, "term"));
            return;
        }

        if (cls.equals("MultiplicativeExpression")) {
            Object term = get(expr, "term");
            Object factor = get(expr, "factor");
            Object slash = get(expr, "SLASH");
            Object dslash = get(expr, "DOUBLESLASH");
            Object percent = get(expr, "PERCENT");
            if (slash != null || dslash != null || percent != null) {
                if (isZeroLiteral(factor)) {
                    String op = slash != null ? "/" : dslash != null ? "//" : "%";
                    errors.add("Line " + getLine(expr) + ": division by zero (" + op + ")");
                }
            }
            checkExpression(term);
            checkExpression(factor);
            return;
        }

        for (Field f : allFields(expr.getClass())) {
            try {
                f.setAccessible(true);
                String fname = f.getName();
                if (fname.equals("nodeName") || fname.equals("lineNumber")) continue;
                Object v = f.get(expr);
                if (v == null) continue;
                if (v instanceof List<?> list) {
                    for (Object item : list)
                        if (item != null && item.getClass().getName().startsWith("AST.Python."))
                            checkExpression(item);
                } else if (v.getClass().getName().startsWith("AST.Python.")) {
                    checkExpression(v);
                }
            } catch (Exception ignored) {}
        }
    }

    private void useVariable(String name, int line) {
        if (name == null || name.isEmpty()) return;
        if (BUILTINS.contains(name)) return;
        Symbol s = table.resolve(name);
        if (s == null) {
            String where = knownNameScope.get(name);
            if (where != null && !where.equals(table.currentScope().name))
                errors.add("Line " + line + ": '" + name + "' is out of scope (defined in " + where + ")");
            else
                errors.add("Line " + line + ": undefined variable '" + name + "'");
        } else s.used = true;
    }

    // ═══════════════════════════════════════════════════════════
    // Helpers
    // ═══════════════════════════════════════════════════════════

    private boolean isZeroLiteral(Object node) {
        if (node == null) return false;
        String cls = simpleName(node);
        if (cls.equals("FactorOperand"))  return isZeroLiteral(get(node, "factor"));
        if (cls.equals("PowerOperand"))   return isZeroLiteral(get(node, "power"));
        if (cls.equals("Power"))          return isZeroLiteral(get(node, "awaitPrimary"));
        if (cls.equals("PrimaryOperand")) return isZeroLiteral(get(node, "primary"));
        if (cls.equals("AtomOperand"))    return isZeroLiteral(get(node, "atom"));
        if (cls.equals("NumberAtom")) {
            String num = extractName(get(node, "NUMBER"));
            if (num == null) return false;
            try { return Double.parseDouble(num) == 0.0; }
            catch (NumberFormatException e) { return false; }
        }
        return false;
    }

    private boolean isNumeric(String t) {
        return t.equals("int") || t.equals("float") || t.equals("bool");
    }

    private int tupleSizeFromRhs(Object annotatedRhs) {
        if (annotatedRhs == null) return 0;
        Object starExprs = get(annotatedRhs, "starExpressions");
        if (starExprs == null) return 0;
        List<?> items = getList(starExprs, "starExpression");
        if (items.size() > 1) return items.size();
        if (items.size() == 1) {
            Object se = items.get(0);
            Object expr = get(se, "expression");
            if (expr != null) return countSequenceItems(expr);
        }
        return 0;
    }

    private int countSequenceItems(Object expr) {
        if (expr == null) return 0;
        String cls = simpleName(expr);
        if (cls.equals("ConditionalExpression")) {
            List<?> ds = getList(expr, "disjunction");
            if (ds.size() == 1) return countSequenceItems(ds.get(0));
            return 0;
        }
        if (cls.equals("AtomOperand")) return countSequenceItems(get(expr, "atom"));
        if (cls.equals("ListAtom")) {
            Object ll = get(expr, "listLiteral");
            if (ll != null) {
                Object items = get(ll, "starNamedExpressions");
                if (items != null) return getList(items, "starNamedExpression").size();
            }
        }
        if (cls.equals("Tuple")) {
            List<?> items = getList(expr, "starNamedExpressions");
            return items.isEmpty() ? 0 : items.size();
        }
        return 0;
    }

    private String inferType(Object node) {
        if (node == null) return null;
        String cls = simpleName(node);
        if (cls.equals("StarExpressionsAnnotatedRhs")) return inferType(get(node, "starExpressions"));
        if (cls.equals("StarExpressions")) {
            List<?> list = getList(node, "starExpression");
            if (list.size() == 1) return inferType(list.get(0));
        }
        if (cls.equals("RegularStarExpression")) return inferType(get(node, "expression"));
        if (cls.equals("RegularNamedExpression")) return inferType(get(node, "expression"));
        if (cls.equals("TermOperand"))    return inferType(get(node, "term"));
        if (cls.equals("FactorOperand"))  return inferType(get(node, "factor"));
        if (cls.equals("PowerOperand"))   return inferType(get(node, "power"));
        if (cls.equals("Power"))          return inferType(get(node, "awaitPrimary"));
        if (cls.equals("PrimaryOperand")) return inferType(get(node, "primary"));
        if (cls.equals("AtomOperand"))    return inferType(get(node, "atom"));
        if (cls.equals("ConditionalExpression")) {
            List<?> ds = getList(node, "disjunction");
            if (ds.size() == 1 && get(node, "expression") == null) return inferType(ds.get(0));
            return null;
        }
        if (cls.equals("NumberAtom")) {
            String num = extractName(get(node, "NUMBER"));
            return (num != null && num.contains(".")) ? "float" : "int";
        }
        if (cls.equals("StringAtom") || cls.equals("StringLiteralExpr")) return "str";
        if (cls.equals("TrueAtom") || cls.equals("FalseAtom"))          return "bool";
        if (cls.equals("NoneAtom"))                                     return "NoneType";
        if (cls.equals("ListAtom") || cls.equals("ListLiteral"))         return "list";
        if (cls.equals("DictSetAtom") || cls.equals("Dict"))             return "dict";
        if (cls.equals("RegularName") || cls.equals("NameAtom")
                || cls.equals("NonWildcardName")) {
            String name = extractName(node);
            if (name != null) {
                Symbol s = table.resolve(name);
                if (s != null && s.dataType != null) return s.dataType;
            }
        }
        return null;
    }

    // ═══════════════════════════════════════════════════════════
    // Name extraction
    // ═══════════════════════════════════════════════════════════

    private String extractName(Object node) {
        if (node == null) return null;
        if (node instanceof String s) return s;
        String cls = simpleName(node);
        if (cls.equals("AtomOperand")) return extractName(get(node, "atom"));
        if (cls.equals("NameAtom")) {
            Object name = get(node, "name");
            if (name != null && name != node) return extractName(name);
            return null;
        }
        Object nonWild = get(node, "nameExceptUnderscore");
        if (nonWild != null) {
            Object name = get(nonWild, "NAME");
            if (name == null) name = get(nonWild, "name");
            return name != null ? name.toString() : null;
        }
        Object name = get(node, "name");
        if (name != null && name != node) return extractName(name);
        Object id = get(node, "identifier");
        if (id != null) return id.toString();
        Object NAME = get(node, "NAME");
        return NAME != null ? NAME.toString() : null;
    }

    private String extractTargetName(Object target) {
        if (target == null) return null;
        if (target instanceof List<?> list) {
            for (Object item : list) {
                String name = extractTargetName(item);
                if (name != null && !name.isBlank()) return name;
            }
            return null;
        }
        Object st = get(target, "starTarget");
        if (st instanceof List<?> l) {
            if (l.isEmpty()) return null;
            return extractTargetName(l.get(0));
        }
        if (st == null) st = target;
        Object twa = get(st, "targetWithStarAtom");
        if (twa == null) twa = st;
        Object sa = get(twa, "starAtom");
        if (sa == null) sa = twa;
        Object name = get(sa, "name");
        if (name == null) name = sa;
        return extractName(name);
    }

    private List<String> extractAllTargetNames(Object targets) {
        List<String> names = new ArrayList<>();
        if (targets == null) return names;
        List<?> list = (targets instanceof List<?> l) ? l : List.of(targets);
        for (Object t : list) {
            if (t == null) continue;
            List<?> inner = getList(t, "starTarget");
            if (inner.isEmpty()) {
                String n = extractTargetName(t);
                if (n != null && !n.isBlank()) names.add(n);
            } else {
                for (Object i : inner) {
                    String n = extractTargetName(i);
                    if (n != null && !n.isBlank()) names.add(n);
                }
            }
        }
        return names;
    }

    private String extractFunctionName(Object fn) {
        Object raw = unwrap(get(fn, "functionDef"),
                "undecoratedFunctionDefinition", "decoratedFunctionDefinition", "functionDefRaw");
        return extractName(get(raw, "name"));
    }

    private String extractClassName(Object cls) {
        Object raw = unwrap(get(cls, "classDef"),
                "undecoratedClassDefinition", "decoratedClassDefinition", "classDefRaw");
        return extractName(get(raw, "name"));
    }

    // ═══════════════════════════════════════════════════════════
    // Parameter/Argument counting
    // ═══════════════════════════════════════════════════════════

    private int countParams(Object fn) {
        Object raw = unwrap(get(fn, "functionDef"),
                "undecoratedFunctionDefinition", "decoratedFunctionDefinition", "functionDefRaw");
        return countParamsFromRaw(raw);
    }

    private int countParamsFromRaw(Object raw) {
        Object params = get(raw, "params");
        if (params == null) return 0;
        Object inner = get(params, "parameters");
        if (inner == null) return 0;
        int c = 0;
        for (String f : new String[]{"paramNoDefault", "paramWithDefault"})
            c += getList(inner, f).size();
        return c;
    }

    private int countArgs(Object args) {
        Object inner = get(args, "args");
        if (inner == null) return 0;
        int c = 0;
        for (String f : new String[]{"expression", "starredExpression"})
            c += getList(inner, f).size();
        return c;
    }

    // ═══════════════════════════════════════════════════════════
    // Reflection helpers
    // ═══════════════════════════════════════════════════════════

    private int getLine(Object node) {
        Object l = get(node, "lineNumber");
        return l instanceof Integer ? (Integer) l : 0;
    }

    private String simpleName(Object o) {
        return o == null ? "" : o.getClass().getSimpleName();
    }

    private Object get(Object node, String field) {
        if (node == null) return null;
        for (Class<?> c = node.getClass(); c != null; c = c.getSuperclass()) {
            try {
                Field f = c.getDeclaredField(field);
                f.setAccessible(true);
                return f.get(node);
            } catch (NoSuchFieldException ignored) {
            } catch (Exception ignored) { return null; }
        }
        return null;
    }

    private List<Object> getList(Object node, String field) {
        Object v = get(node, field);
        if (v instanceof List<?> l) return new ArrayList<>(l);
        if (v != null) return List.of(v);
        return Collections.emptyList();
    }

    private List<Field> allFields(Class<?> cls) {
        List<Field> out = new ArrayList<>();
        while (cls != null && cls != Object.class) {
            Collections.addAll(out, cls.getDeclaredFields());
            cls = cls.getSuperclass();
        }
        return out;
    }

    private Object unwrap(Object node, String... fields) {
        Object cur = node;
        for (int i = 0; i < 6 && cur != null; i++) {
            Object next = null;
            for (String f : fields) {
                next = get(cur, f);
                if (next != null) break;
            }
            if (next == null || next == cur) return cur;
            cur = next;
        }
        return cur;
    }

    // ═══════════ Jinja2 Checks (5 types) ═══════════

    private void checkJinja(Map<String, TemplateDocument> templates) {
        if (templates == null || templates.isEmpty()) return;

        // 1. اجمع المتغيرات المتاحة من Python
        Set<String> availableVars = new HashSet<>();
        for (Symbol s : table.globalScope().symbols.values()) {
            availableVars.add(s.name);
        }

        // 2. أسماء القوالب المعروفة (مع/بدون .html)
        Set<String> knownTemplates = new HashSet<>();
        for (String name : templates.keySet()) {
            knownTemplates.add(name);
            knownTemplates.add(name + ".html");
        }

        // 3. افحص كل قالب
        for (Map.Entry<String, TemplateDocument> e : templates.entrySet()) {
            Set<String> scope = new HashSet<>(availableVars);
            Set<String> definedBlocks = new HashSet<>();
            traverseJinja(e.getValue(), e.getKey(), scope, knownTemplates, definedBlocks);
        }
    }

    /** المرور على عقدة Jinja AST — dispatch + reflection fallback */
    private void traverseJinja(Object node, String templateName,
                                Set<String> scope, Set<String> knownTemplates,
                                Set<String> definedBlocks) {
        if (node == null) return;
        String cls = simpleName(node);

        // ─── J2: extends ───
        if (cls.equals("ExtendsStatement")) {
            String target = firstStringField(node, "module", "JINJA_STRING");
            if (target != null) {
                String name = unquoteJinja(target);
                if (!knownTemplates.contains(name)
                        && !knownTemplates.contains(name.replace(".html", ""))) {
                    errors.add("Jinja [" + templateName + "] Line " + getLine(node)
                            + ": template '" + name + "' not found (extends)");
                }
            }
            return;
        }

        // ─── J3: include ───
        if (cls.equals("IncludeStatement")) {
            String target = firstStringField(node, "JINJA_STRING", "stringLiteral");
            String dynamic = firstStringField(node, "JINJA_IDENTIFIER", "jinjaIdentifier");
            if (target != null) {
                String name = unquoteJinja(target);
                if (!knownTemplates.contains(name)
                        && !knownTemplates.contains(name.replace(".html", ""))) {
                    errors.add("Jinja [" + templateName + "] Line " + getLine(node)
                            + ": template '" + name + "' not found (include)");
                }
            }
            // dynamic include (variable) — cannot check statically → skip
            return;
        }

        // ─── J4: duplicate block ───
        if (cls.equals("JinjaBlockStatement")) {
            String blockName = firstStringField(node, "blockName", "name");
            if (blockName != null) {
                if (definedBlocks.contains(blockName)) {
                    errors.add("Jinja [" + templateName + "] Line " + getLine(node)
                            + ": duplicate block '" + blockName + "'");
                } else {
                    definedBlocks.add(blockName);
                }
            }
            Object body = get(node, "body");
            if (body != null)
                traverseJinja(body, templateName, scope, knownTemplates, definedBlocks);
            return;
        }

        // ─── J5: undefined filter ───
        if (cls.equals("FilterApplication")) {
            String filter = firstStringField(node, "JINJA_IDENTIFIER", "jinjaIdentifier", "filter");
            if (filter != null && !KNOWN_FILTERS.contains(filter)) {
                errors.add("Jinja [" + templateName + "] Line " + getLine(node)
                        + ": undefined filter '" + filter + "'");
            }
            Object args = get(node, "jinjaArgumentList");
            if (args != null)
                traverseJinja(args, templateName, scope, knownTemplates, definedBlocks);
            return;
        }

        // ─── For loop — introduce loop var + `loop` ───
        if (cls.equals("JinjaForStatement")) {
            Set<String> innerScope = new HashSet<>(scope);
            innerScope.add("loop");  // Jinja built-in inside for

            Object target = get(node, "target");
            if (target != null) collectJinjaVarNames(target, innerScope);

            Object iterable = get(node, "iterable");
            if (iterable != null)
                traverseJinja(iterable, templateName, scope, knownTemplates, definedBlocks);

            Object body = get(node, "body");
            if (body != null)
                traverseJinja(body, templateName, innerScope, knownTemplates, definedBlocks);

            Object elseBody = get(node, "elseBody");
            if (elseBody != null)
                traverseJinja(elseBody, templateName, scope, knownTemplates, definedBlocks);
            return;
        }

        // ─── Set (inline) — introduce var ───
        if (cls.equals("InlineSetStatement")) {
            String name = firstStringField(node, "name");
            if (name != null) scope.add(name);
            Object value = get(node, "value");
            if (value != null)
                traverseJinja(value, templateName, scope, knownTemplates, definedBlocks);
            return;
        }

        // ─── J1: undefined variable ───
        if (cls.equals("IdentifierPrimary")) {
            String varName = firstStringField(node, "JINJA_IDENTIFIER", "jinjaIdentifier", "identifier");
            if (varName != null
                    && !scope.contains(varName)
                    && !BUILTINS.contains(varName)
                    && !KNOWN_JINJA_GLOBALS.contains(varName)
                    && !KNOWN_FILTERS.contains(varName)) {
                errors.add("Jinja [" + templateName + "] Line " + getLine(node)
                        + ": undefined variable '" + varName + "'");
            }
            return;
        }

        // ─── Fallback: traverse children ───
        for (Field f : allFields(node.getClass())) {
            try {
                f.setAccessible(true);
                String fname = f.getName();
                if (fname.equals("nodeName") || fname.equals("lineNumber")) continue;
                Object v = f.get(node);
                if (v == null) continue;
                if (v instanceof List<?> list) {
                    for (Object item : list) {
                        if (item != null && item.getClass().getName().startsWith("AST.Jinja."))
                            traverseJinja(item, templateName, scope, knownTemplates, definedBlocks);
                    }
                } else if (v.getClass().getName().startsWith("AST.Jinja.")) {
                    traverseJinja(v, templateName, scope, knownTemplates, definedBlocks);
                }
            } catch (Exception ignored) {}
        }
    }

    /** يجمع أسماء المتغيرات داخل target (مثل `k, v` → {k, v}) */
    private void collectJinjaVarNames(Object node, Set<String> out) {
        if (node == null) return;
        String cls = simpleName(node);
        if (cls.equals("IdentifierPrimary")) {
            String name = firstStringField(node, "JINJA_IDENTIFIER", "jinjaIdentifier", "identifier");
            if (name != null) out.add(name);
            return;
        }
        for (Field f : allFields(node.getClass())) {
            try {
                f.setAccessible(true);
                Object v = f.get(node);
                if (v == null) continue;
                if (v instanceof List<?> list) {
                    for (Object item : list) {
                        if (item != null && item.getClass().getName().startsWith("AST.Jinja."))
                            collectJinjaVarNames(item, out);
                    }
                } else if (v.getClass().getName().startsWith("AST.Jinja.")) {
                    collectJinjaVarNames(v, out);
                }
            } catch (Exception ignored) {}
        }
    }

    /** يجرّب عدة أسماء حقل ويُعيد أول قيمة موجودة */
    private String firstStringField(Object node, String... names) {
        for (String name : names) {
            Object v = get(node, name);
            if (v != null) return v.toString();
        }
        return null;
    }

    /** يزيل علامات التنصيص من "base.html" */
    private String unquoteJinja(String s) {
        if (s == null) return null;
        s = s.trim();
        if (s.length() >= 2 && (s.startsWith("\"") && s.endsWith("\""))
                || (s.startsWith("'") && s.endsWith("'")))
            return s.substring(1, s.length() - 1);
        return s;
    }
}