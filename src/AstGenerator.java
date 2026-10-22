import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * AstGenerator
 * ------------
 * Generates all Jinja/HTML/CSS AST node classes for the JinjaParser.g4 grammar.
 *
 * Usage:
 *   Just run main() with no arguments — output goes to ./ast (no package).
 *
 * Optional (from command line):
 *   java AstGenerator <outputDir> [packageName]
 *
 * Example:
 *   java AstGenerator src/main/java/ast com.example.ast
 */
public class AstGenerator {

    /* =================== CONFIG (defaults) =================== */
    private static final String DEFAULT_OUTPUT_DIR = "C:\\Users\\HP\\Desktop\\compiler\\Flask Compiler\\src\\AST\\Jinja";
    private static final String DEFAULT_PACKAGE    = "AST.Jinja";     // "" = no package

    /* =================== MODEL =================== */

    static class Field {
        final String type;
        final String name;
        Field(String type, String name) { this.type = type; this.name = name; }
    }

    static class ClassSpec {
        final String name;
        String parent = null;
        boolean isAbstract = false;
        final List<Field> fields = new ArrayList<>();

        ClassSpec(String name) { this.name = name; }
        ClassSpec parent(String p) { this.parent = p; return this; }
        ClassSpec abstractClass()  { this.isAbstract = true; return this; }
        ClassSpec field(String t, String n) { fields.add(new Field(t, n)); return this; }
        ClassSpec stringField(String n)     { return field("String", n); }
        ClassSpec listField(String t, String n) { return field("List<" + t + ">", n); }
    }

    /* =================== MAIN =================== */

    public static void main(String[] args) throws IOException {
        // Use args if provided, otherwise fall back to defaults.
        String outDir = (args.length > 0 && args[0] != null && !args[0].isBlank())
                ? args[0]
                : DEFAULT_OUTPUT_DIR;

        String pkg = (args.length > 1 && args[1] != null && !args[1].isBlank())
                ? args[1]
                : DEFAULT_PACKAGE;

        Path dir = Paths.get(outDir).toAbsolutePath();
        Files.createDirectories(dir);

        List<ClassSpec> specs = buildSpecs();
        int written = 0;
        for (ClassSpec s : specs) {
            Files.writeString(dir.resolve(s.name + ".java"), generate(s, pkg));
            written++;
        }

        System.out.println("========================================");
        System.out.println(" AST generation complete");
        System.out.println("----------------------------------------");
        System.out.println(" Classes written : " + written);
        System.out.println(" Output directory: " + dir);
        System.out.println(" Package         : " + (pkg.isBlank() ? "(none)" : pkg));
        System.out.println("========================================");
    }

    /* =================== SPECS =================== */

    static List<ClassSpec> buildSpecs() {
        List<ClassSpec> s = new ArrayList<>();

        /* ---------- SINGLE-ALTERNATIVE RULES ---------- */

        s.add(new ClassSpec("TemplateDocument")
                .field("TemplateBody", "body").stringField("EOF"));

        s.add(new ClassSpec("TemplateBody")
                .listField("TemplateChunk", "chunks"));

        s.add(new ClassSpec("HtmlDocument")
                .listField("ScriptletOrSeaWs", "scriptletOrSeaWs")
                .stringField("XML_DECLARATION")
                .stringField("DTD")
                .listField("HtmlElements", "htmlElements"));

        s.add(new ClassSpec("HtmlElements")
                .listField("HtmlMisc", "htmlMisc")
                .field("HtmlElement", "htmlElement"));

        s.add(new ClassSpec("HtmlContent")
                .listField("HtmlContentItem", "htmlContentItem"));

        s.add(new ClassSpec("HtmlAttribute")
                .stringField("name")
                .stringField("TAG_EQUALS")
                .field("AttributeValue", "value"));

        s.add(new ClassSpec("JinjaExpression")
                .stringField("JINJA_EXPR_OPEN")
                .field("JinjaExprList", "exprs")
                .stringField("JINJA_EXPR_CLOSE"));

        s.add(new ClassSpec("JinjaExprList")
                .listField("JinjaExpr", "items")
                .listField("String", "JINJA_COMMA"));

        s.add(new ClassSpec("JinjaExpr")
                .field("JinjaOrExpression", "trueExpr")
                .stringField("JINJA_IF")
                .field("JinjaOrExpression", "condition")
                .stringField("JINJA_ELSE")
                .field("JinjaExpr", "falseExpr"));

        s.add(new ClassSpec("JinjaOrExpression")
                .field("JinjaAndExpression", "first")
                .listField("String", "JINJA_OR")
                .listField("JinjaAndExpression", "operands"));

        s.add(new ClassSpec("JinjaAndExpression")
                .field("JinjaNotExpression", "first")
                .listField("String", "JINJA_AND")
                .listField("JinjaNotExpression", "operands"));

        s.add(new ClassSpec("JinjaComparison")
                .field("JinjaAdditive", "first")
                .listField("JinjaComparisonOperator", "operators")
                .listField("JinjaAdditive", "operands"));

        s.add(new ClassSpec("JinjaAdditive")
                .field("JinjaMultiplicative", "jinjaMultiplicative")
                .listField("JinjaAdditiveTail", "jinjaAdditiveTail"));

        s.add(new ClassSpec("JinjaAdditiveTail")
                .field("JinjaAdditiveOperator", "jinjaAdditiveOperator")
                .field("JinjaMultiplicative", "jinjaMultiplicative"));

        s.add(new ClassSpec("JinjaMultiplicative")
                .field("JinjaPower", "jinjaPower")
                .listField("JinjaMultiplicativeTail", "jinjaMultiplicativeTail"));

        s.add(new ClassSpec("JinjaMultiplicativeTail")
                .field("JinjaMultiplicativeOperator", "jinjaMultiplicativeOperator")
                .field("JinjaPower", "jinjaPower"));

        s.add(new ClassSpec("JinjaPower")
                .field("JinjaUnary", "base")
                .listField("String", "JINJA_POW")
                .listField("JinjaUnary", "exponents"));

        s.add(new ClassSpec("JinjaUnaryPrefix")
                .field("JinjaUnaryOperator", "jinjaUnaryOperator")
                .field("JinjaUnary", "jinjaUnary"));

        s.add(new ClassSpec("JinjaPostfix")
                .field("JinjaPrimary", "base")
                .listField("JinjaPostfixPart", "parts"));

        s.add(new ClassSpec("JinjaArgumentList")
                .listField("JinjaArgument", "items")
                .listField("String", "JINJA_COMMA"));

        s.add(new ClassSpec("JinjaDictEntryList")
                .listField("JinjaDictEntry", "items")
                .listField("String", "JINJA_COMMA"));

        s.add(new ClassSpec("JinjaDictEntry")
                .field("JinjaExpr", "key")
                .stringField("JINJA_COLON")
                .field("JinjaExpr", "value"));

        s.add(new ClassSpec("JinjaSimpleStatement")
                .stringField("JINJA_STMT_OPEN")
                .field("JinjaSimpleStatementInner", "jinjaSimpleStatementInner")
                .stringField("JINJA_STMT_CLOSE"));

        s.add(new ClassSpec("JinjaBlockStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_BLOCK")
                .stringField("blockName")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDBLOCK")
                .stringField("closeName"));

        s.add(new ClassSpec("JinjaIfStatement")
                .listField("String", "JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_IF")
                .field("JinjaExpr", "ifCondition")
                .listField("String", "JINJA_STMT_CLOSE")
                .field("TemplateBody", "ifBody")
                .listField("String", "JINJA_STMT_ELIF")
                .listField("JinjaExpr", "elifConditions")
                .listField("TemplateBody", "elifBodies")
                .stringField("JINJA_STMT_ELSE")
                .field("TemplateBody", "elseBody")
                .stringField("JINJA_STMT_ENDIF"));

        s.add(new ClassSpec("JinjaForStatement")
                .listField("String", "JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_FOR")
                .field("JinjaForTarget", "target")
                .stringField("JINJA_IN")
                .field("JinjaExprList", "iterable")
                .stringField("JINJA_STMT_RECURSIVE")
                .listField("String", "JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ELSE")
                .field("TemplateBody", "elseBody")
                .stringField("JINJA_STMT_ENDFOR"));

        s.add(new ClassSpec("JinjaForTarget")
                .listField("JinjaExpr", "items")
                .listField("String", "JINJA_COMMA"));

        s.add(new ClassSpec("JinjaWithStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_WITH")
                .listField("JinjaWithItem", "items")
                .listField("String", "JINJA_COMMA")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDWITH"));

        s.add(new ClassSpec("JinjaMacroStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_MACRO")
                .stringField("name")
                .stringField("JINJA_LPAREN")
                .field("JinjaMacroParams", "params")
                .stringField("JINJA_RPAREN")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDMACRO"));

        s.add(new ClassSpec("JinjaMacroParams")
                .listField("String", "items")
                .listField("String", "JINJA_COMMA"));

        s.add(new ClassSpec("JinjaCallStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_CALL")
                .stringField("name")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDCALL"));

        s.add(new ClassSpec("JinjaFilterStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_FILTER")
                .stringField("name")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDFILTER"));

        s.add(new ClassSpec("JinjaRawStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_RAW")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDRAW"));

        s.add(new ClassSpec("JinjaComment")
                .stringField("JINJA_COMMENT_OPEN")
                .listField("String", "text")
                .stringField("JINJA_COMMENT_CLOSE"));

        s.add(new ClassSpec("CssStylesheet")
                .listField("CssRuleSet", "rules"));

        s.add(new ClassSpec("CssAtRuleBody")
                .listField("CssAnyToken", "cssAnyToken")
                .stringField("OpenBrace")
                .stringField("CloseBrace")
                .stringField("SemiColon"));

        s.add(new ClassSpec("CssSelectorPart")
                .listField("CssSelectorAtom", "atoms"));

        s.add(new ClassSpec("CssDeclarationList")
                .listField("CssDeclaration", "decls")
                .listField("String", "SemiColon"));

        s.add(new ClassSpec("CssDeclaration")
                .field("CssProperty", "property")
                .stringField("Colon")
                .field("CssValue", "value"));

        s.add(new ClassSpec("CssValue")
                .listField("CssValuePart", "parts"));

        /* ---------- MULTI-ALTERNATIVE RULES ---------- */

        // templateChunk
        s.add(new ClassSpec("TemplateChunk").abstractClass());
        s.add(new ClassSpec("MiscChunk").parent("TemplateChunk").field("HtmlMisc", "htmlMisc"));
        s.add(new ClassSpec("ElementChunk").parent("TemplateChunk").field("HtmlElement", "htmlElement"));
        s.add(new ClassSpec("JinjaChunk").parent("TemplateChunk").field("TemplateJinja", "templateJinja"));

        // scriptletOrSeaWs
        s.add(new ClassSpec("ScriptletOrSeaWs").abstractClass());
        s.add(new ClassSpec("ScriptletValue").parent("ScriptletOrSeaWs").stringField("SCRIPTLET"));
        s.add(new ClassSpec("WhitespaceValue").parent("ScriptletOrSeaWs").stringField("SEA_WS"));

        // htmlElement
        s.add(new ClassSpec("HtmlElement").abstractClass());
        s.add(new ClassSpec("PairedElement").parent("HtmlElement")
                .stringField("TAG_OPEN")
                .stringField("tagName")
                .listField("HtmlAttribute", "attributes")
                .stringField("TAG_CLOSE")
                .field("HtmlContent", "content")
                .stringField("TAG_SLASH")
                .stringField("closeName")
                .stringField("TAG_SLASH_CLOSE"));
        s.add(new ClassSpec("ScriptletElement").parent("HtmlElement").stringField("SCRIPTLET"));
        s.add(new ClassSpec("StyleElement").parent("HtmlElement")
                .stringField("STYLE_OPEN")
                .field("CssStylesheet", "stylesheet")
                .stringField("CSS_END"));

        // htmlContentItem
        s.add(new ClassSpec("HtmlContentItem").abstractClass());
        s.add(new ClassSpec("ChardataItem").parent("HtmlContentItem").field("HtmlChardata", "htmlChardata"));
        s.add(new ClassSpec("ElementItem").parent("HtmlContentItem").field("HtmlElement", "htmlElement"));
        s.add(new ClassSpec("CdataItem").parent("HtmlContentItem").stringField("CDATA"));
        s.add(new ClassSpec("CommentItem").parent("HtmlContentItem").field("HtmlComment", "htmlComment"));
        s.add(new ClassSpec("TemplateJinjaItem").parent("HtmlContentItem").field("TemplateJinja", "templateJinja"));

        // attributeValue
        s.add(new ClassSpec("AttributeValue").abstractClass());
        s.add(new ClassSpec("DoubleQuotedValue").parent("AttributeValue")
                .stringField("ATTVALUE_OPEN_DQ")
                .listField("AttributeValueContent", "attributeValueContent")
                .stringField("ATTVALUE_DQ_CLOSE"));
        s.add(new ClassSpec("SingleQuotedValue").parent("AttributeValue")
                .stringField("ATTVALUE_OPEN_SQ")
                .listField("AttributeValueContent", "attributeValueContent")
                .stringField("ATTVALUE_SQ_CLOSE"));
        s.add(new ClassSpec("UnquotedValue").parent("AttributeValue").stringField("ATTVALUE_UNQUOTED"));

        // attributeValueContent
        s.add(new ClassSpec("AttributeValueContent").abstractClass());
        s.add(new ClassSpec("DoubleQuotedText").parent("AttributeValueContent").stringField("ATTVALUE_DQ_TEXT"));
        s.add(new ClassSpec("SingleQuotedText").parent("AttributeValueContent").stringField("ATTVALUE_SQ_TEXT"));
        s.add(new ClassSpec("DoubleQuotedLbrace").parent("AttributeValueContent").stringField("ATTVALUE_DQ_LBRACE"));
        s.add(new ClassSpec("SingleQuotedLbrace").parent("AttributeValueContent").stringField("ATTVALUE_SQ_LBRACE"));
        s.add(new ClassSpec("AttributeJinjaExpression").parent("AttributeValueContent").field("JinjaExpression", "jinjaExpression"));

        // htmlChardata
        s.add(new ClassSpec("HtmlChardata").abstractClass());
        s.add(new ClassSpec("HtmlTextChardata").parent("HtmlChardata").stringField("HTML_TEXT"));
        s.add(new ClassSpec("SeaWsChardata").parent("HtmlChardata").stringField("SEA_WS"));

        // htmlMisc
        s.add(new ClassSpec("HtmlMisc").abstractClass());
        s.add(new ClassSpec("CommentMisc").parent("HtmlMisc").field("HtmlComment", "htmlComment"));
        s.add(new ClassSpec("ChardataMisc").parent("HtmlMisc").field("HtmlChardata", "htmlChardata"));

        // htmlComment
        s.add(new ClassSpec("HtmlComment").abstractClass());
        s.add(new ClassSpec("RegularHtmlComment").parent("HtmlComment").stringField("HTML_COMMENT"));
        s.add(new ClassSpec("ConditionalHtmlComment").parent("HtmlComment").stringField("HTML_CONDITIONAL_COMMENT"));

        // templateJinja
        s.add(new ClassSpec("TemplateJinja").abstractClass());
        s.add(new ClassSpec("JinjaExpressionNode").parent("TemplateJinja").field("JinjaExpression", "jinjaExpression"));
        s.add(new ClassSpec("JinjaCommentNode").parent("TemplateJinja").field("JinjaComment", "jinjaComment"));
        s.add(new ClassSpec("JinjaSimpleStmt").parent("TemplateJinja").field("JinjaSimpleStatement", "jinjaSimpleStatement"));
        s.add(new ClassSpec("JinjaIf").parent("TemplateJinja").field("JinjaIfStatement", "jinjaIfStatement"));
        s.add(new ClassSpec("JinjaFor").parent("TemplateJinja").field("JinjaForStatement", "jinjaForStatement"));
        s.add(new ClassSpec("JinjaBlock").parent("TemplateJinja").field("JinjaBlockStatement", "jinjaBlockStatement"));
        s.add(new ClassSpec("JinjaSet").parent("TemplateJinja").field("JinjaSetStatement", "jinjaSetStatement"));
        s.add(new ClassSpec("JinjaWith").parent("TemplateJinja").field("JinjaWithStatement", "jinjaWithStatement"));
        s.add(new ClassSpec("JinjaMacro").parent("TemplateJinja").field("JinjaMacroStatement", "jinjaMacroStatement"));
        s.add(new ClassSpec("JinjaCall").parent("TemplateJinja").field("JinjaCallStatement", "jinjaCallStatement"));
        s.add(new ClassSpec("JinjaFilter").parent("TemplateJinja").field("JinjaFilterStatement", "jinjaFilterStatement"));
        s.add(new ClassSpec("JinjaRaw").parent("TemplateJinja").field("JinjaRawStatement", "jinjaRawStatement"));

        // jinjaNotExpression
        s.add(new ClassSpec("JinjaNotExpression").abstractClass());
        s.add(new ClassSpec("NotExpression").parent("JinjaNotExpression")
                .stringField("JINJA_NOT")
                .field("JinjaNotExpression", "jinjaNotExpression"));
        s.add(new ClassSpec("ComparisonExpression").parent("JinjaNotExpression").field("JinjaComparison", "jinjaComparison"));

        // jinjaComparisonOperator
        s.add(new ClassSpec("JinjaComparisonOperator").abstractClass());
        s.add(new ClassSpec("EqOperator").parent("JinjaComparisonOperator").stringField("JINJA_EQ"));
        s.add(new ClassSpec("NotEqOperator").parent("JinjaComparisonOperator").stringField("JINJA_NEQ"));
        s.add(new ClassSpec("LtOperator").parent("JinjaComparisonOperator").stringField("JINJA_LT"));
        s.add(new ClassSpec("LteOperator").parent("JinjaComparisonOperator").stringField("JINJA_LE"));
        s.add(new ClassSpec("GtOperator").parent("JinjaComparisonOperator").stringField("JINJA_GT"));
        s.add(new ClassSpec("GteOperator").parent("JinjaComparisonOperator").stringField("JINJA_GE"));
        s.add(new ClassSpec("InOperator").parent("JinjaComparisonOperator").stringField("JINJA_IN"));
        s.add(new ClassSpec("IsOperator").parent("JinjaComparisonOperator").stringField("JINJA_IS"));

        // jinjaAdditiveOperator
        s.add(new ClassSpec("JinjaAdditiveOperator").abstractClass());
        s.add(new ClassSpec("PlusAdditiveOperator").parent("JinjaAdditiveOperator").stringField("JINJA_PLUS"));
        s.add(new ClassSpec("MinusAdditiveOperator").parent("JinjaAdditiveOperator").stringField("JINJA_MINUS"));
        s.add(new ClassSpec("TildeAdditiveOperator").parent("JinjaAdditiveOperator").stringField("JINJA_TILDE"));

        // jinjaMultiplicativeOperator
        s.add(new ClassSpec("JinjaMultiplicativeOperator").abstractClass());
        s.add(new ClassSpec("StarMultiplicativeOperator").parent("JinjaMultiplicativeOperator").stringField("JINJA_STAR"));
        s.add(new ClassSpec("SlashMultiplicativeOperator").parent("JinjaMultiplicativeOperator").stringField("JINJA_SLASH"));
        s.add(new ClassSpec("FloorDivMultiplicativeOperator").parent("JinjaMultiplicativeOperator").stringField("JINJA_FLOORDIV"));
        s.add(new ClassSpec("ModMultiplicativeOperator").parent("JinjaMultiplicativeOperator").stringField("JINJA_MOD"));

        // jinjaUnary
        s.add(new ClassSpec("JinjaUnary").abstractClass());
        s.add(new ClassSpec("UnaryPrefixExpr").parent("JinjaUnary").field("JinjaUnaryPrefix", "jinjaUnaryPrefix"));
        s.add(new ClassSpec("PostfixExpr").parent("JinjaUnary").field("JinjaPostfix", "jinjaPostfix"));

        // jinjaUnaryOperator
        s.add(new ClassSpec("JinjaUnaryOperator").abstractClass());
        s.add(new ClassSpec("PlusUnaryOperator").parent("JinjaUnaryOperator").stringField("JINJA_PLUS"));
        s.add(new ClassSpec("MinusUnaryOperator").parent("JinjaUnaryOperator").stringField("JINJA_MINUS"));

        // jinjaPostfixPart
        s.add(new ClassSpec("JinjaPostfixPart").abstractClass());
        s.add(new ClassSpec("AttributeAccess").parent("JinjaPostfixPart")
                .stringField("JINJA_DOT")
                .stringField("JINJA_IDENTIFIER"));
        s.add(new ClassSpec("Subscript").parent("JinjaPostfixPart")
                .stringField("JINJA_LBRACK")
                .field("JinjaExpr", "jinjaExpr")
                .stringField("JINJA_RBRACK"));
        s.add(new ClassSpec("FunctionCall").parent("JinjaPostfixPart")
                .stringField("JINJA_LPAREN")
                .field("JinjaArgumentList", "jinjaArgumentList")
                .stringField("JINJA_RPAREN"));
        s.add(new ClassSpec("FilterApplication").parent("JinjaPostfixPart")
                .stringField("JINJA_PIPE")
                .stringField("JINJA_IDENTIFIER")
                .stringField("JINJA_LPAREN")
                .field("JinjaArgumentList", "jinjaArgumentList")
                .stringField("JINJA_RPAREN"));

        // jinjaPrimary
        s.add(new ClassSpec("JinjaPrimary").abstractClass());
        s.add(new ClassSpec("IdentifierPrimary").parent("JinjaPrimary").stringField("JINJA_IDENTIFIER"));
        s.add(new ClassSpec("StringPrimary").parent("JinjaPrimary").stringField("JINJA_STRING"));
        s.add(new ClassSpec("IntegerPrimary").parent("JinjaPrimary").stringField("JINJA_INTEGER"));
        s.add(new ClassSpec("FloatPrimary").parent("JinjaPrimary").stringField("JINJA_FLOAT"));
        s.add(new ClassSpec("TruePrimary").parent("JinjaPrimary").stringField("JINJA_TRUE"));
        s.add(new ClassSpec("FalsePrimary").parent("JinjaPrimary").stringField("JINJA_FALSE"));
        s.add(new ClassSpec("NonePrimary").parent("JinjaPrimary").stringField("JINJA_NONE"));
        s.add(new ClassSpec("ParenPrimary").parent("JinjaPrimary")
                .stringField("JINJA_LPAREN")
                .field("JinjaExpr", "jinjaExpr")
                .stringField("JINJA_RPAREN"));
        s.add(new ClassSpec("ListPrimary").parent("JinjaPrimary")
                .stringField("JINJA_LBRACK")
                .field("JinjaExprList", "jinjaExprList")
                .stringField("JINJA_RBRACK"));
        s.add(new ClassSpec("DictPrimary").parent("JinjaPrimary")
                .stringField("JINJA_LBRACE")
                .field("JinjaDictEntryList", "jinjaDictEntryList")
                .stringField("JINJA_RBRACE"));

        // jinjaArgument
        s.add(new ClassSpec("JinjaArgument").abstractClass());
        s.add(new ClassSpec("KeywordArgument").parent("JinjaArgument")
                .stringField("key")
                .stringField("JINJA_ASSIGN")
                .field("JinjaExpr", "value"));
        s.add(new ClassSpec("PositionalArgument").parent("JinjaArgument").field("JinjaExpr", "jinjaExpr"));

        // jinjaSimpleStatementInner
        s.add(new ClassSpec("JinjaSimpleStatementInner").abstractClass());
        s.add(new ClassSpec("ExtendsStatement").parent("JinjaSimpleStatementInner")
                .stringField("JINJA_STMT_EXTENDS")
                .stringField("module"));
        s.add(new ClassSpec("IncludeStatement").parent("JinjaSimpleStatementInner")
                .stringField("JINJA_STMT_INCLUDE")
                .stringField("JINJA_STRING")
                .stringField("JINJA_IDENTIFIER"));
        s.add(new ClassSpec("ImportStatement").parent("JinjaSimpleStatementInner")
                .stringField("JINJA_STMT_IMPORT")
                .stringField("module")
                .stringField("JINJA_STMT_AS")
                .stringField("alias"));
        s.add(new ClassSpec("FromImportStatement").parent("JinjaSimpleStatementInner")
                .stringField("JINJA_STMT_FROM")
                .stringField("module")
                .stringField("JINJA_STMT_IMPORT")
                .listField("String", "importedNames")
                .listField("String", "JINJA_COMMA"));

        // jinjaSetStatement
        s.add(new ClassSpec("JinjaSetStatement").abstractClass());
        s.add(new ClassSpec("InlineSetStatement").parent("JinjaSetStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_SET")
                .stringField("name")
                .stringField("JINJA_ASSIGN")
                .field("JinjaExpr", "value")
                .stringField("JINJA_STMT_CLOSE"));
        s.add(new ClassSpec("BlockSetStatement").parent("JinjaSetStatement")
                .stringField("JINJA_STMT_OPEN")
                .stringField("JINJA_STMT_SET")
                .stringField("name")
                .stringField("JINJA_STMT_CLOSE")
                .field("TemplateBody", "body")
                .stringField("JINJA_STMT_ENDSET"));

        // jinjaWithItem
        s.add(new ClassSpec("JinjaWithItem").abstractClass());
        s.add(new ClassSpec("AssignedWithItem").parent("JinjaWithItem")
                .stringField("name")
                .stringField("JINJA_ASSIGN")
                .field("JinjaExpr", "value"));
        s.add(new ClassSpec("SimpleWithItem").parent("JinjaWithItem").field("JinjaExpr", "value"));

        // cssRuleSet
        s.add(new ClassSpec("CssRuleSet").abstractClass());
        s.add(new ClassSpec("SelectorRule").parent("CssRuleSet")
                .field("CssSelectorPart", "selectors")
                .stringField("OpenBrace")
                .field("CssDeclarationList", "decls")
                .stringField("CloseBrace"));
        s.add(new ClassSpec("AtRule").parent("CssRuleSet")
                .stringField("keyword")
                .field("CssAtRuleBody", "body"));

        // cssSelectorAtom
        s.add(new ClassSpec("CssSelectorAtom").abstractClass());
        s.add(new ClassSpec("CssIdentAtom").parent("CssSelectorAtom").stringField("CSS_IDENT"));
        s.add(new ClassSpec("CssHashAtom").parent("CssSelectorAtom").stringField("CSS_HASH"));
        s.add(new ClassSpec("CssStringAtom").parent("CssSelectorAtom").stringField("CSS_STRING"));
        s.add(new ClassSpec("CssNumberAtom").parent("CssSelectorAtom").stringField("CSS_NUMBER"));
        s.add(new ClassSpec("CssVariableAtom").parent("CssSelectorAtom").stringField("CSS_VARIABLE"));
        s.add(new ClassSpec("CssPercentAtom").parent("CssSelectorAtom").stringField("CSS_PERCENT"));
        s.add(new ClassSpec("CssBangAtom").parent("CssSelectorAtom").stringField("CSS_BANG"));
        s.add(new ClassSpec("CssAtKeywordAtom").parent("CssSelectorAtom").stringField("CSS_AT_KEYWORD"));
        s.add(new ClassSpec("MultiplyAtom").parent("CssSelectorAtom").stringField("Multiply"));
        s.add(new ClassSpec("DotAtom").parent("CssSelectorAtom").stringField("Dot"));
        s.add(new ClassSpec("ColonAtom").parent("CssSelectorAtom").stringField("Colon"));
        s.add(new ClassSpec("PipeAtom").parent("CssSelectorAtom").stringField("Pipe"));
        s.add(new ClassSpec("GreaterAtom").parent("CssSelectorAtom").stringField("Greater"));
        s.add(new ClassSpec("PlusAtom").parent("CssSelectorAtom").stringField("Plus"));
        s.add(new ClassSpec("TildeAtom").parent("CssSelectorAtom").stringField("Tilde"));
        s.add(new ClassSpec("CommaAtom").parent("CssSelectorAtom").stringField("Comma"));
        s.add(new ClassSpec("FunctionCallAtom").parent("CssSelectorAtom")
                .stringField("CSS_FUNCTION")
                .listField("CssSelectorAtom", "cssSelectorAtom")
                .stringField("CloseParen"));
        s.add(new ClassSpec("BracketGroupAtom").parent("CssSelectorAtom")
                .stringField("OpenBracket")
                .listField("CssSelectorAtom", "cssSelectorAtom")
                .stringField("CloseBracket"));
        s.add(new ClassSpec("ParenGroupAtom").parent("CssSelectorAtom")
                .stringField("OpenParen")
                .listField("CssSelectorAtom", "cssSelectorAtom")
                .stringField("CloseParen"));

        // cssAnyToken
        s.add(new ClassSpec("CssAnyToken").abstractClass());
        s.add(new ClassSpec("CssIdentToken").parent("CssAnyToken").stringField("CSS_IDENT"));
        s.add(new ClassSpec("CssNumberToken").parent("CssAnyToken").stringField("CSS_NUMBER"));
        s.add(new ClassSpec("CssStringToken").parent("CssAnyToken").stringField("CSS_STRING"));
        s.add(new ClassSpec("CssHashToken").parent("CssAnyToken").stringField("CSS_HASH"));
        s.add(new ClassSpec("CssVariableToken").parent("CssAnyToken").stringField("CSS_VARIABLE"));
        s.add(new ClassSpec("CssPercentToken").parent("CssAnyToken").stringField("CSS_PERCENT"));
        s.add(new ClassSpec("CssBangToken").parent("CssAnyToken").stringField("CSS_BANG"));
        s.add(new ClassSpec("CssImportantToken").parent("CssAnyToken").stringField("CSS_IMPORTANT"));
        s.add(new ClassSpec("CssAtKeywordToken").parent("CssAnyToken").stringField("CSS_AT_KEYWORD"));
        s.add(new ClassSpec("FunctionCallToken").parent("CssAnyToken")
                .stringField("CSS_FUNCTION")
                .listField("CssAnyToken", "cssAnyToken")
                .stringField("CloseParen"));
        s.add(new ClassSpec("ParenGroupToken").parent("CssAnyToken")
                .stringField("OpenParen")
                .listField("CssAnyToken", "cssAnyToken")
                .stringField("CloseParen"));
        s.add(new ClassSpec("BracketGroupToken").parent("CssAnyToken")
                .stringField("OpenBracket")
                .listField("CssAnyToken", "cssAnyToken")
                .stringField("CloseBracket"));
        s.add(new ClassSpec("BraceGroupToken").parent("CssAnyToken")
                .stringField("OpenBrace")
                .listField("CssAnyToken", "cssAnyToken")
                .stringField("CloseBrace"));
        s.add(new ClassSpec("CommaToken").parent("CssAnyToken").stringField("Comma"));
        s.add(new ClassSpec("ColonToken").parent("CssAnyToken").stringField("Colon"));
        s.add(new ClassSpec("SemiColonToken").parent("CssAnyToken").stringField("SemiColon"));
        s.add(new ClassSpec("PlusToken").parent("CssAnyToken").stringField("Plus"));
        s.add(new ClassSpec("MinusToken").parent("CssAnyToken").stringField("Minus"));
        s.add(new ClassSpec("MultiplyToken").parent("CssAnyToken").stringField("Multiply"));
        s.add(new ClassSpec("DivideToken").parent("CssAnyToken").stringField("Divide"));
        s.add(new ClassSpec("EqualToken").parent("CssAnyToken").stringField("Equal"));
        s.add(new ClassSpec("DotToken").parent("CssAnyToken").stringField("Dot"));
        s.add(new ClassSpec("PipeToken").parent("CssAnyToken").stringField("Pipe"));
        s.add(new ClassSpec("GreaterToken").parent("CssAnyToken").stringField("Greater"));
        s.add(new ClassSpec("TildeToken").parent("CssAnyToken").stringField("Tilde"));

        // cssProperty
        s.add(new ClassSpec("CssProperty").abstractClass());
        s.add(new ClassSpec("IdentCssProperty").parent("CssProperty").stringField("CSS_IDENT"));
        s.add(new ClassSpec("VariableCssProperty").parent("CssProperty").stringField("CSS_VARIABLE"));

        // cssValuePart
        s.add(new ClassSpec("CssValuePart").abstractClass());
        s.add(new ClassSpec("CssIdentValue").parent("CssValuePart").stringField("CSS_IDENT"));
        s.add(new ClassSpec("CssNumberValue").parent("CssValuePart").stringField("CSS_NUMBER"));
        s.add(new ClassSpec("CssStringValue").parent("CssValuePart").stringField("CSS_STRING"));
        s.add(new ClassSpec("CssHashValue").parent("CssValuePart").stringField("CSS_HASH"));
        s.add(new ClassSpec("CssVariableValue").parent("CssValuePart").stringField("CSS_VARIABLE"));
        s.add(new ClassSpec("CssPercentValue").parent("CssValuePart").stringField("CSS_PERCENT"));
        s.add(new ClassSpec("CssImportantValue").parent("CssValuePart").stringField("CSS_IMPORTANT"));
        s.add(new ClassSpec("CssBangValue").parent("CssValuePart").stringField("CSS_BANG"));
        s.add(new ClassSpec("FunctionCallValue").parent("CssValuePart")
                .stringField("CSS_FUNCTION")
                .listField("CssValuePart", "cssValuePart")
                .stringField("CloseParen"));
        s.add(new ClassSpec("ParenGroupValue").parent("CssValuePart")
                .stringField("OpenParen")
                .listField("CssValuePart", "cssValuePart")
                .stringField("CloseParen"));
        s.add(new ClassSpec("BracketGroupValue").parent("CssValuePart")
                .stringField("OpenBracket")
                .listField("CssValuePart", "cssValuePart")
                .stringField("CloseBracket"));
        s.add(new ClassSpec("CommaValue").parent("CssValuePart").stringField("Comma"));
        s.add(new ClassSpec("PlusValue").parent("CssValuePart").stringField("Plus"));
        s.add(new ClassSpec("MinusValue").parent("CssValuePart").stringField("Minus"));
        s.add(new ClassSpec("MultiplyValue").parent("CssValuePart").stringField("Multiply"));
        s.add(new ClassSpec("DivideValue").parent("CssValuePart").stringField("Divide"));
        s.add(new ClassSpec("EqualValue").parent("CssValuePart").stringField("Equal"));
        s.add(new ClassSpec("DotValue").parent("CssValuePart").stringField("Dot"));
        s.add(new ClassSpec("PipeValue").parent("CssValuePart").stringField("Pipe"));
        s.add(new ClassSpec("GreaterValue").parent("CssValuePart").stringField("Greater"));
        s.add(new ClassSpec("TildeValue").parent("CssValuePart").stringField("Tilde"));

        return s;
    }

    /* =================== CODE GENERATION =================== */

    static String generate(ClassSpec s, String pkg) {
        StringBuilder sb = new StringBuilder();

        if (pkg != null && !pkg.isEmpty()) {
            sb.append("package ").append(pkg).append(";\n\n");
        }
        sb.append("import java.util.List;\n\n");
        sb.append("// Auto-generated AST node for JinjaParser.g4\n");
        sb.append("public ");
        if (s.isAbstract) sb.append("abstract ");
        sb.append("class ").append(s.name);
        if (s.parent != null) sb.append(" extends ").append(s.parent);
        sb.append(" {\n");

        if (s.isAbstract) {
            sb.append("}\n");
            return sb.toString();
        }

        // Fields
        sb.append("    private String nodeName;\n");
        sb.append("    private int lineNumber;\n");
        for (Field f : s.fields) {
            sb.append("    private ").append(f.type).append(" ").append(f.name).append(";\n");
        }
        sb.append("\n");

        // Constructor
        sb.append("    public ").append(s.name).append("(String nodeName, int lineNumber");
        for (Field f : s.fields) {
            sb.append(", ").append(f.type).append(" ").append(f.name);
        }
        sb.append(") {\n");
        sb.append("        this.nodeName = nodeName;\n");
        sb.append("        this.lineNumber = lineNumber;\n");
        for (Field f : s.fields) {
            sb.append("        this.").append(f.name).append(" = ").append(f.name).append(";\n");
        }
        sb.append("    }\n\n");

        // getters / setters
        sb.append("    public String getNodeName() { return nodeName; }\n");
        sb.append("    public void setNodeName(String nodeName) { this.nodeName = nodeName; }\n");
        sb.append("    public int getLineNumber() { return lineNumber; }\n");
        sb.append("    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }\n");
        for (Field f : s.fields) {
            String cap = capitalize(f.name);
            sb.append("    public ").append(f.type).append(" get").append(cap).append("() { return ").append(f.name).append("; }\n");
            sb.append("    public void set").append(cap).append("(").append(f.type).append(" ").append(f.name).append(") { this.").append(f.name).append(" = ").append(f.name).append("; }\n");
        }
        sb.append("\n");

        // toString
        sb.append("    @Override\n");
        sb.append("    public String toString() { return \"").append(s.name).append("\"; }\n");
        sb.append("}\n");

        return sb.toString();
    }

    static String capitalize(String s) {
        if (s == null || s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}