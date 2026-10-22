// =============================================================================
// BaseVisitor.java
// Converts the JinjaParser parse tree into AST.Jinja.* nodes.
// Extends the ANTLR-generated JinjaParserBaseVisitor (default package).
// =============================================================================


package Visitor;
import antlr.JinjaParser;
import antlr.JinjaParserBaseVisitor;

import AST.Jinja.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.ArrayList;
import java.util.List;

public class JinjaVisitor extends JinjaParserBaseVisitor {

    /* =====================================================================
     *  Helpers
     * ===================================================================== */

    private static List<String> texts(List<TerminalNode> nodes) {
        List<String> r = new ArrayList<>();
        if (nodes != null) {
            for (TerminalNode n : nodes) {
                if (n != null) r.add(n.getText());
            }
        }
        return r;
    }

    private static String tok(TerminalNode n) {
        return n == null ? null : n.getText();
    }

    private static int line(ParserRuleContext ctx) {
        return ctx.getStart().getLine();
    }

    /* =====================================================================
     *  ENTRY POINT
     * ===================================================================== */

    @Override
    public TemplateDocument visitTemplateDocument(JinjaParser.TemplateDocumentContext ctx) {
        TemplateBody body = ctx.templateBody() != null
                ? visitTemplateBody(ctx.templateBody()) : null;
        String eof = tok(ctx.EOF());
        return new TemplateDocument("TemplateDocument", line(ctx), body, eof);
    }

    @Override
    public TemplateBody visitTemplateBody(JinjaParser.TemplateBodyContext ctx) {
        List<TemplateChunk> chunks = new ArrayList<>();
        for (JinjaParser.TemplateChunkContext c : ctx.templateChunk()) {
            Object r = visit(c);
            if (r instanceof TemplateChunk) chunks.add((TemplateChunk) r);
        }
        return new TemplateBody("TemplateBody", line(ctx), chunks);
    }

    /* =====================================================================
     *  TEMPLATE CHUNKS  (3 labeled alternatives)
     * ===================================================================== */

    @Override
    public MiscChunk visitMiscChunk(JinjaParser.MiscChunkContext ctx) {
        HtmlMisc m = ctx.htmlMisc() != null ? (HtmlMisc)visit(ctx.htmlMisc()) : null;
        return new MiscChunk("MiscChunk", line(ctx), m);
    }

    @Override
    public ElementChunk visitElementChunk(JinjaParser.ElementChunkContext ctx) {
        HtmlElement e = ctx.htmlElement() != null ? (HtmlElement)visit(ctx.htmlElement()) : null;
        return new ElementChunk("ElementChunk", line(ctx), e);
    }

    @Override
    public JinjaChunk visitJinjaChunk(JinjaParser.JinjaChunkContext ctx) {
        TemplateJinja t = null;
        if (ctx.templateJinja() != null) {
            Object r = visit(ctx.templateJinja());
            if (r instanceof TemplateJinja) t = (TemplateJinja) r;
        }
        return new JinjaChunk("JinjaChunk", line(ctx), t);
    }

    /* =====================================================================
     *  HTML
     * ===================================================================== */

    @Override
    public HtmlDocument visitHtmlDocument(JinjaParser.HtmlDocumentContext ctx) {
        List<ScriptletOrSeaWs> ss = new ArrayList<>();
        for (JinjaParser.ScriptletOrSeaWsContext c : ctx.scriptletOrSeaWs()) {
            Object r = visit(c);
            if (r instanceof ScriptletOrSeaWs) ss.add((ScriptletOrSeaWs) r);
        }
        String xmlDecl = tok(ctx.XML_DECLARATION());
        String dtd = tok(ctx.DTD());
        List<HtmlElements> elems = new ArrayList<>();
        for (JinjaParser.HtmlElementsContext c : ctx.htmlElements()) {
            elems.add(visitHtmlElements(c));
        }
        return new HtmlDocument("HtmlDocument", line(ctx), ss, xmlDecl, dtd, elems);
    }

    @Override
    public ScriptletValue visitScriptletValue(JinjaParser.ScriptletValueContext ctx) {
        return new ScriptletValue("ScriptletValue", line(ctx), tok(ctx.SCRIPTLET()));
    }

    @Override
    public WhitespaceValue visitWhitespaceValue(JinjaParser.WhitespaceValueContext ctx) {
        return new WhitespaceValue("WhitespaceValue", line(ctx), tok(ctx.SEA_WS()));
    }

    @Override
    public HtmlElements visitHtmlElements(JinjaParser.HtmlElementsContext ctx) {
        List<HtmlMisc> misc = new ArrayList<>();
        for (JinjaParser.HtmlMiscContext c : ctx.htmlMisc()) {
            Object r = (HtmlMisc)visit(c);
            if (r instanceof HtmlMisc) misc.add((HtmlMisc) r);
        }
        HtmlElement elem = ctx.htmlElement() != null ? (HtmlElement)visit(ctx.htmlElement()) : null;
        return new HtmlElements("HtmlElements", line(ctx), misc, elem);
    }

    @Override
    public PairedElement visitPairedElement(JinjaParser.PairedElementContext ctx) {
        String tagOpen = tok(ctx.TAG_OPEN(0));
        String tagName = ctx.tagName != null ? ctx.tagName.getText() : null;

        List<HtmlAttribute> attrs = new ArrayList<>();
        for (JinjaParser.HtmlAttributeContext c : ctx.attributes) {
            attrs.add(visitHtmlAttribute(c));
        }

        String tagClose = tok(ctx.TAG_CLOSE(0));
        HtmlContent content = ctx.content != null ? visitHtmlContent(ctx.content) : null;
        String tagSlash = tok(ctx.TAG_SLASH());
        String closeName = ctx.closeName != null ? ctx.closeName.getText() : null;
        String tagSlashClose = tok(ctx.TAG_SLASH_CLOSE());

        return new PairedElement("PairedElement", line(ctx),
                tagOpen, tagName, attrs, tagClose, content,
                tagSlash, closeName, tagSlashClose);
    }

    @Override
    public ScriptletElement visitScriptletElement(JinjaParser.ScriptletElementContext ctx) {
        return new ScriptletElement("ScriptletElement", line(ctx), tok(ctx.SCRIPTLET()));
    }

    @Override
    public StyleElement visitStyleElement(JinjaParser.StyleElementContext ctx) {
        String styleOpen = tok(ctx.STYLE_OPEN());
        CssStylesheet ss = ctx.stylesheet != null ? visitCssStylesheet(ctx.stylesheet) : null;
        String cssEnd = tok(ctx.CSS_END());
        return new StyleElement("StyleElement", line(ctx), styleOpen, ss, cssEnd);
    }

    @Override
    public HtmlContent visitHtmlContent(JinjaParser.HtmlContentContext ctx) {
        List<HtmlContentItem> items = new ArrayList<>();
        for (JinjaParser.HtmlContentItemContext c : ctx.htmlContentItem()) {
            Object r = visit(c);
            if (r instanceof HtmlContentItem) items.add((HtmlContentItem) r);
        }
        return new HtmlContent("HtmlContent", line(ctx), items);
    }

    /* ---------- htmlContentItem alternatives ---------- */

    @Override
    public ChardataItem visitChardataItem(JinjaParser.ChardataItemContext ctx) {
        HtmlChardata c = ctx.htmlChardata() != null
                ? (HtmlChardata) visit(ctx.htmlChardata()) : null;
        return new ChardataItem("ChardataItem", line(ctx), c);
    }

    @Override
    public ElementItem visitElementItem(JinjaParser.ElementItemContext ctx) {
        HtmlElement e = ctx.htmlElement() != null ? (HtmlElement)visit(ctx.htmlElement()) : null;
        return new ElementItem("ElementItem", line(ctx), e);
    }

    @Override
    public CdataItem visitCdataItem(JinjaParser.CdataItemContext ctx) {
        return new CdataItem("CdataItem", line(ctx), tok(ctx.CDATA()));
    }

    @Override
    public CommentItem visitCommentItem(JinjaParser.CommentItemContext ctx) {
        HtmlComment c = ctx.htmlComment() != null
                ? (HtmlComment) visit(ctx.htmlComment()) : null;
        return new CommentItem("CommentItem", line(ctx), c);
    }

    @Override
    public TemplateJinjaItem visitTemplateJinjaItem(JinjaParser.TemplateJinjaItemContext ctx) {
        TemplateJinja t = null;
        if (ctx.templateJinja() != null) {
            Object r = visit(ctx.templateJinja());
            if (r instanceof TemplateJinja) t = (TemplateJinja) r;
        }
        return new TemplateJinjaItem("TemplateJinjaItem", line(ctx), t);
    }

    @Override
    public HtmlAttribute visitHtmlAttribute(JinjaParser.HtmlAttributeContext ctx) {
        String name = ctx.name != null ? ctx.name.getText() : null;
        String eq = tok(ctx.TAG_EQUALS());
        AttributeValue value = ctx.value != null ? (AttributeValue) visit(ctx.value) : null;
        return new HtmlAttribute("HtmlAttribute", line(ctx), name, eq, value);
    }

    /* ---------- attributeValue alternatives ---------- */

    @Override
    public DoubleQuotedValue visitDoubleQuotedValue(JinjaParser.DoubleQuotedValueContext ctx) {
        String open = tok(ctx.ATTVALUE_OPEN_DQ());
        List<AttributeValueContent> contents = new ArrayList<>();
        for (JinjaParser.AttributeValueContentContext c : ctx.attributeValueContent()) {
            Object r = visit(c);
            if (r instanceof AttributeValueContent) contents.add((AttributeValueContent) r);
        }
        String close = tok(ctx.ATTVALUE_DQ_CLOSE());
        return new DoubleQuotedValue("DoubleQuotedValue", line(ctx), open, contents, close);
    }

    @Override
    public SingleQuotedValue visitSingleQuotedValue(JinjaParser.SingleQuotedValueContext ctx) {
        String open = tok(ctx.ATTVALUE_OPEN_SQ());
        List<AttributeValueContent> contents = new ArrayList<>();
        for (JinjaParser.AttributeValueContentContext c : ctx.attributeValueContent()) {
            Object r = visit(c);
            if (r instanceof AttributeValueContent) contents.add((AttributeValueContent) r);
        }
        String close = tok(ctx.ATTVALUE_SQ_CLOSE());
        return new SingleQuotedValue("SingleQuotedValue", line(ctx), open, contents, close);
    }

    @Override
    public UnquotedValue visitUnquotedValue(JinjaParser.UnquotedValueContext ctx) {
        return new UnquotedValue("UnquotedValue", line(ctx), tok(ctx.ATTVALUE_UNQUOTED()));
    }

    /* ---------- attributeValueContent alternatives ---------- */

    @Override
    public DoubleQuotedText visitDoubleQuotedText(JinjaParser.DoubleQuotedTextContext ctx) {
        return new DoubleQuotedText("DoubleQuotedText", line(ctx), tok(ctx.ATTVALUE_DQ_TEXT()));
    }

    @Override
    public SingleQuotedText visitSingleQuotedText(JinjaParser.SingleQuotedTextContext ctx) {
        return new SingleQuotedText("SingleQuotedText", line(ctx), tok(ctx.ATTVALUE_SQ_TEXT()));
    }

    @Override
    public DoubleQuotedLbrace visitDoubleQuotedLbrace(JinjaParser.DoubleQuotedLbraceContext ctx) {
        return new DoubleQuotedLbrace("DoubleQuotedLbrace", line(ctx), tok(ctx.ATTVALUE_DQ_LBRACE()));
    }

    @Override
    public SingleQuotedLbrace visitSingleQuotedLbrace(JinjaParser.SingleQuotedLbraceContext ctx) {
        return new SingleQuotedLbrace("SingleQuotedLbrace", line(ctx), tok(ctx.ATTVALUE_SQ_LBRACE()));
    }

    @Override
    public AttributeJinjaExpression visitAttributeJinjaExpression(
            JinjaParser.AttributeJinjaExpressionContext ctx) {
        JinjaExpression e = ctx.jinjaExpression() != null
                ? visitJinjaExpression(ctx.jinjaExpression()) : null;
        return new AttributeJinjaExpression("AttributeJinjaExpression", line(ctx), e);
    }

    /* ---------- htmlChardata / misc / comments ---------- */

    @Override
    public HtmlTextChardata visitHtmlTextChardata(JinjaParser.HtmlTextChardataContext ctx) {
        return new HtmlTextChardata("HtmlTextChardata", line(ctx), tok(ctx.HTML_TEXT()));
    }

    @Override
    public SeaWsChardata visitSeaWsChardata(JinjaParser.SeaWsChardataContext ctx) {
        return new SeaWsChardata("SeaWsChardata", line(ctx), tok(ctx.SEA_WS()));
    }

    @Override
    public CommentMisc visitCommentMisc(JinjaParser.CommentMiscContext ctx) {
        HtmlComment c = ctx.htmlComment() != null ? (HtmlComment) visit(ctx.htmlComment()) : null;
        return new CommentMisc("CommentMisc", line(ctx), c);
    }

    @Override
    public ChardataMisc visitChardataMisc(JinjaParser.ChardataMiscContext ctx) {
        HtmlChardata c = ctx.htmlChardata() != null
                ? (HtmlChardata) visit(ctx.htmlChardata()) : null;
        return new ChardataMisc("ChardataMisc", line(ctx), c);
    }

    @Override
    public RegularHtmlComment visitRegularHtmlComment(JinjaParser.RegularHtmlCommentContext ctx) {
        return new RegularHtmlComment("RegularHtmlComment", line(ctx), tok(ctx.HTML_COMMENT()));
    }

    @Override
    public ConditionalHtmlComment visitConditionalHtmlComment(
            JinjaParser.ConditionalHtmlCommentContext ctx) {
        return new ConditionalHtmlComment("ConditionalHtmlComment", line(ctx),
                tok(ctx.HTML_CONDITIONAL_COMMENT()));
    }

    /* =====================================================================
     *  JINJA dispatcher (12 alternatives)
     * ===================================================================== */

    @Override
    public JinjaExpressionNode visitJinjaExpressionNode(JinjaParser.JinjaExpressionNodeContext ctx) {
        JinjaExpression e = ctx.jinjaExpression() != null
                ? visitJinjaExpression(ctx.jinjaExpression()) : null;
        return new JinjaExpressionNode("JinjaExpressionNode", line(ctx), e);
    }

    @Override
    public JinjaCommentNode visitJinjaCommentNode(JinjaParser.JinjaCommentNodeContext ctx) {
        JinjaComment c = ctx.jinjaComment() != null
                ? visitJinjaComment(ctx.jinjaComment()) : null;
        return new JinjaCommentNode("JinjaCommentNode", line(ctx), c);
    }

    @Override
    public JinjaSimpleStmt visitJinjaSimpleStmt(JinjaParser.JinjaSimpleStmtContext ctx) {
        JinjaSimpleStatement s = ctx.jinjaSimpleStatement() != null
                ? visitJinjaSimpleStatement(ctx.jinjaSimpleStatement()) : null;
        return new JinjaSimpleStmt("JinjaSimpleStmt", line(ctx), s);
    }

    @Override
    public JinjaIf visitJinjaIf(JinjaParser.JinjaIfContext ctx) {
        JinjaIfStatement s = ctx.jinjaIfStatement() != null
                ? visitJinjaIfStatement(ctx.jinjaIfStatement()) : null;
        return new JinjaIf("JinjaIf", line(ctx), s);
    }

    @Override
    public JinjaFor visitJinjaFor(JinjaParser.JinjaForContext ctx) {
        JinjaForStatement s = ctx.jinjaForStatement() != null
                ? visitJinjaForStatement(ctx.jinjaForStatement()) : null;
        return new JinjaFor("JinjaFor", line(ctx), s);
    }

    @Override
    public JinjaBlock visitJinjaBlock(JinjaParser.JinjaBlockContext ctx) {
        JinjaBlockStatement s = ctx.jinjaBlockStatement() != null
                ? visitJinjaBlockStatement(ctx.jinjaBlockStatement()) : null;
        return new JinjaBlock("JinjaBlock", line(ctx), s);
    }

    @Override
    public JinjaSet visitJinjaSet(JinjaParser.JinjaSetContext ctx) {
        JinjaSetStatement s = null;
        if (ctx.jinjaSetStatement() != null) {
            Object r = visit(ctx.jinjaSetStatement());
            if (r instanceof JinjaSetStatement) s = (JinjaSetStatement) r;
        }
        return new JinjaSet("JinjaSet", line(ctx), s);
    }

    @Override
    public JinjaWith visitJinjaWith(JinjaParser.JinjaWithContext ctx) {
        JinjaWithStatement s = ctx.jinjaWithStatement() != null
                ? visitJinjaWithStatement(ctx.jinjaWithStatement()) : null;
        return new JinjaWith("JinjaWith", line(ctx), s);
    }

    @Override
    public JinjaMacro visitJinjaMacro(JinjaParser.JinjaMacroContext ctx) {
        JinjaMacroStatement s = ctx.jinjaMacroStatement() != null
                ? visitJinjaMacroStatement(ctx.jinjaMacroStatement()) : null;
        return new JinjaMacro("JinjaMacro", line(ctx), s);
    }

    @Override
    public JinjaCall visitJinjaCall(JinjaParser.JinjaCallContext ctx) {
        JinjaCallStatement s = ctx.jinjaCallStatement() != null
                ? visitJinjaCallStatement(ctx.jinjaCallStatement()) : null;
        return new JinjaCall("JinjaCall", line(ctx), s);
    }

    @Override
    public JinjaFilter visitJinjaFilter(JinjaParser.JinjaFilterContext ctx) {
        JinjaFilterStatement s = ctx.jinjaFilterStatement() != null
                ? visitJinjaFilterStatement(ctx.jinjaFilterStatement()) : null;
        return new JinjaFilter("JinjaFilter", line(ctx), s);
    }

    @Override
    public JinjaRaw visitJinjaRaw(JinjaParser.JinjaRawContext ctx) {
        JinjaRawStatement s = ctx.jinjaRawStatement() != null
                ? visitJinjaRawStatement(ctx.jinjaRawStatement()) : null;
        return new JinjaRaw("JinjaRaw", line(ctx), s);
    }

    /* =====================================================================
     *  JINJA EXPRESSIONS
     * ===================================================================== */

    @Override
    public JinjaExpression visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx) {
        String open = tok(ctx.JINJA_EXPR_OPEN());
        JinjaExprList exprs = ctx.exprs != null ? visitJinjaExprList(ctx.exprs) : null;
        String close = tok(ctx.JINJA_EXPR_CLOSE());
        return new JinjaExpression("JinjaExpression", line(ctx), open, exprs, close);
    }

    @Override
    public JinjaExprList visitJinjaExprList(JinjaParser.JinjaExprListContext ctx) {
        List<JinjaExpr> items = new ArrayList<>();
        for (JinjaParser.JinjaExprContext c : ctx.items) items.add(visitJinjaExpr(c));
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new JinjaExprList("JinjaExprList", line(ctx), items, commas);
    }

    @Override
    public JinjaExpr visitJinjaExpr(JinjaParser.JinjaExprContext ctx) {
        JinjaOrExpression t = ctx.trueExpr != null ? visitJinjaOrExpression(ctx.trueExpr) : null;
        String ifTok = tok(ctx.JINJA_IF());
        JinjaOrExpression cond = ctx.condition != null
                ? visitJinjaOrExpression(ctx.condition) : null;
        String elseTok = tok(ctx.JINJA_ELSE());
        JinjaExpr falseE = ctx.falseExpr != null ? visitJinjaExpr(ctx.falseExpr) : null;
        return new JinjaExpr("JinjaExpr", line(ctx), t, ifTok, cond, elseTok, falseE);
    }

    @Override
    public JinjaOrExpression visitJinjaOrExpression(JinjaParser.JinjaOrExpressionContext ctx) {
        JinjaAndExpression first = ctx.first != null ? visitJinjaAndExpression(ctx.first) : null;
        List<String> orToks = texts(ctx.JINJA_OR());
        List<JinjaAndExpression> ops = new ArrayList<>();
        for (JinjaParser.JinjaAndExpressionContext c : ctx.operands) {
            ops.add(visitJinjaAndExpression(c));
        }
        return new JinjaOrExpression("JinjaOrExpression", line(ctx), first, orToks, ops);
    }

    @Override
    public JinjaAndExpression visitJinjaAndExpression(JinjaParser.JinjaAndExpressionContext ctx) {
        JinjaNotExpression first = null;
        if (ctx.first != null) {
            Object r = visit(ctx.first);
            if (r instanceof JinjaNotExpression) first = (JinjaNotExpression) r;
        }
        List<String> andToks = texts(ctx.JINJA_AND());
        List<JinjaNotExpression> ops = new ArrayList<>();
        for (JinjaParser.JinjaNotExpressionContext c : ctx.operands) {
            Object r = visit(c);
            if (r instanceof JinjaNotExpression) ops.add((JinjaNotExpression) r);
        }
        return new JinjaAndExpression("JinjaAndExpression", line(ctx), first, andToks, ops);
    }

    @Override
    public NotExpression visitNotExpression(JinjaParser.NotExpressionContext ctx) {
        String notTok = tok(ctx.JINJA_NOT());
        JinjaNotExpression inner = null;
        if (ctx.jinjaNotExpression() != null) {
            Object r = visit(ctx.jinjaNotExpression());
            if (r instanceof JinjaNotExpression) inner = (JinjaNotExpression) r;
        }
        return new NotExpression("NotExpression", line(ctx), notTok, inner);
    }

    @Override
    public ComparisonExpression visitComparisonExpression(
            JinjaParser.ComparisonExpressionContext ctx) {
        JinjaComparison c = ctx.jinjaComparison() != null
                ? visitJinjaComparison(ctx.jinjaComparison()) : null;
        return new ComparisonExpression("ComparisonExpression", line(ctx), c);
    }

    @Override
    public JinjaComparison visitJinjaComparison(JinjaParser.JinjaComparisonContext ctx) {
        JinjaAdditive first = ctx.first != null ? visitJinjaAdditive(ctx.first) : null;
        List<JinjaComparisonOperator> ops = new ArrayList<>();
        for (JinjaParser.JinjaComparisonOperatorContext c : ctx.operators) {
            Object r = visit(c);
            if (r instanceof JinjaComparisonOperator) ops.add((JinjaComparisonOperator) r);
        }
        List<JinjaAdditive> operands = new ArrayList<>();
        for (JinjaParser.JinjaAdditiveContext c : ctx.operands) {
            operands.add(visitJinjaAdditive(c));
        }
        return new JinjaComparison("JinjaComparison", line(ctx), first, ops, operands);
    }

    /* ---------- comparison operators ---------- */

    @Override
    public EqOperator visitEqOperator(JinjaParser.EqOperatorContext ctx) {
        return new EqOperator("EqOperator", line(ctx), tok(ctx.JINJA_EQ()));
    }

    @Override
    public NotEqOperator visitNotEqOperator(JinjaParser.NotEqOperatorContext ctx) {
        return new NotEqOperator("NotEqOperator", line(ctx), tok(ctx.JINJA_NEQ()));
    }

    @Override
    public LtOperator visitLtOperator(JinjaParser.LtOperatorContext ctx) {
        return new LtOperator("LtOperator", line(ctx), tok(ctx.JINJA_LT()));
    }

    @Override
    public LteOperator visitLteOperator(JinjaParser.LteOperatorContext ctx) {
        return new LteOperator("LteOperator", line(ctx), tok(ctx.JINJA_LE()));
    }

    @Override
    public GtOperator visitGtOperator(JinjaParser.GtOperatorContext ctx) {
        return new GtOperator("GtOperator", line(ctx), tok(ctx.JINJA_GT()));
    }

    @Override
    public GteOperator visitGteOperator(JinjaParser.GteOperatorContext ctx) {
        return new GteOperator("GteOperator", line(ctx), tok(ctx.JINJA_GE()));
    }

    @Override
    public InOperator visitInOperator(JinjaParser.InOperatorContext ctx) {
        return new InOperator("InOperator", line(ctx), tok(ctx.JINJA_IN()));
    }

    @Override
    public IsOperator visitIsOperator(JinjaParser.IsOperatorContext ctx) {
        return new IsOperator("IsOperator", line(ctx), tok(ctx.JINJA_IS()));
    }

    /* ---------- additive / multiplicative / power ---------- */

    @Override
    public JinjaAdditive visitJinjaAdditive(JinjaParser.JinjaAdditiveContext ctx) {
        JinjaMultiplicative m = ctx.jinjaMultiplicative() != null
                ? visitJinjaMultiplicative(ctx.jinjaMultiplicative()) : null;
        List<JinjaAdditiveTail> tails = new ArrayList<>();
        for (JinjaParser.JinjaAdditiveTailContext c : ctx.jinjaAdditiveTail()) {
            tails.add(visitJinjaAdditiveTail(c));
        }
        return new JinjaAdditive("JinjaAdditive", line(ctx), m, tails);
    }

    @Override
    public JinjaAdditiveTail visitJinjaAdditiveTail(JinjaParser.JinjaAdditiveTailContext ctx) {
        JinjaAdditiveOperator op = null;
        if (ctx.jinjaAdditiveOperator() != null) {
            Object r = visit(ctx.jinjaAdditiveOperator());
            if (r instanceof JinjaAdditiveOperator) op = (JinjaAdditiveOperator) r;
        }
        JinjaMultiplicative m = ctx.jinjaMultiplicative() != null
                ? visitJinjaMultiplicative(ctx.jinjaMultiplicative()) : null;
        return new JinjaAdditiveTail("JinjaAdditiveTail", line(ctx), op, m);
    }

    @Override
    public PlusAdditiveOperator visitPlusAdditiveOperator(
            JinjaParser.PlusAdditiveOperatorContext ctx) {
        return new PlusAdditiveOperator("PlusAdditiveOperator", line(ctx), tok(ctx.JINJA_PLUS()));
    }

    @Override
    public MinusAdditiveOperator visitMinusAdditiveOperator(
            JinjaParser.MinusAdditiveOperatorContext ctx) {
        return new MinusAdditiveOperator("MinusAdditiveOperator", line(ctx),
                tok(ctx.JINJA_MINUS()));
    }

    @Override
    public TildeAdditiveOperator visitTildeAdditiveOperator(
            JinjaParser.TildeAdditiveOperatorContext ctx) {
        return new TildeAdditiveOperator("TildeAdditiveOperator", line(ctx),
                tok(ctx.JINJA_TILDE()));
    }

    @Override
    public JinjaMultiplicative visitJinjaMultiplicative(
            JinjaParser.JinjaMultiplicativeContext ctx) {
        JinjaPower p = ctx.jinjaPower() != null ? visitJinjaPower(ctx.jinjaPower()) : null;
        List<JinjaMultiplicativeTail> tails = new ArrayList<>();
        for (JinjaParser.JinjaMultiplicativeTailContext c : ctx.jinjaMultiplicativeTail()) {
            tails.add(visitJinjaMultiplicativeTail(c));
        }
        return new JinjaMultiplicative("JinjaMultiplicative", line(ctx), p, tails);
    }

    @Override
    public JinjaMultiplicativeTail visitJinjaMultiplicativeTail(
            JinjaParser.JinjaMultiplicativeTailContext ctx) {
        JinjaMultiplicativeOperator op = null;
        if (ctx.jinjaMultiplicativeOperator() != null) {
            Object r = visit(ctx.jinjaMultiplicativeOperator());
            if (r instanceof JinjaMultiplicativeOperator) op = (JinjaMultiplicativeOperator) r;
        }
        JinjaPower p = ctx.jinjaPower() != null ? visitJinjaPower(ctx.jinjaPower()) : null;
        return new JinjaMultiplicativeTail("JinjaMultiplicativeTail", line(ctx), op, p);
    }

    @Override
    public StarMultiplicativeOperator visitStarMultiplicativeOperator(
            JinjaParser.StarMultiplicativeOperatorContext ctx) {
        return new StarMultiplicativeOperator("StarMultiplicativeOperator", line(ctx),
                tok(ctx.JINJA_STAR()));
    }

    @Override
    public SlashMultiplicativeOperator visitSlashMultiplicativeOperator(
            JinjaParser.SlashMultiplicativeOperatorContext ctx) {
        return new SlashMultiplicativeOperator("SlashMultiplicativeOperator", line(ctx),
                tok(ctx.JINJA_SLASH()));
    }

    @Override
    public FloorDivMultiplicativeOperator visitFloorDivMultiplicativeOperator(
            JinjaParser.FloorDivMultiplicativeOperatorContext ctx) {
        return new FloorDivMultiplicativeOperator("FloorDivMultiplicativeOperator", line(ctx),
                tok(ctx.JINJA_FLOORDIV()));
    }

    @Override
    public ModMultiplicativeOperator visitModMultiplicativeOperator(
            JinjaParser.ModMultiplicativeOperatorContext ctx) {
        return new ModMultiplicativeOperator("ModMultiplicativeOperator", line(ctx),
                tok(ctx.JINJA_MOD()));
    }

    @Override
    public JinjaPower visitJinjaPower(JinjaParser.JinjaPowerContext ctx) {
        JinjaUnary base = ctx.base != null ? (JinjaUnary) visit(ctx.base) : null;
        List<String> powToks = texts(ctx.JINJA_POW());
        List<JinjaUnary> exps = new ArrayList<>();
        for (JinjaParser.JinjaUnaryContext c : ctx.exponents) {
            Object r = visit(c);
            if (r instanceof JinjaUnary) exps.add((JinjaUnary) r);
        }
        return new JinjaPower("JinjaPower", line(ctx), base, powToks, exps);
    }

    /* ---------- unary ---------- */

    @Override
    public UnaryPrefixExpr visitUnaryPrefixExpr(JinjaParser.UnaryPrefixExprContext ctx) {
        JinjaUnaryPrefix p = ctx.jinjaUnaryPrefix() != null
                ? visitJinjaUnaryPrefix(ctx.jinjaUnaryPrefix()) : null;
        return new UnaryPrefixExpr("UnaryPrefixExpr", line(ctx), p);
    }

    @Override
    public PostfixExpr visitPostfixExpr(JinjaParser.PostfixExprContext ctx) {
        JinjaPostfix p = ctx.jinjaPostfix() != null ? visitJinjaPostfix(ctx.jinjaPostfix()) : null;
        return new PostfixExpr("PostfixExpr", line(ctx), p);
    }

    @Override
    public JinjaUnaryPrefix visitJinjaUnaryPrefix(JinjaParser.JinjaUnaryPrefixContext ctx) {
        JinjaUnaryOperator op = null;
        if (ctx.jinjaUnaryOperator() != null) {
            Object r = visit(ctx.jinjaUnaryOperator());
            if (r instanceof JinjaUnaryOperator) op = (JinjaUnaryOperator) r;
        }
        JinjaUnary inner = null;
        if (ctx.jinjaUnary() != null) {
            Object r = visit(ctx.jinjaUnary());
            if (r instanceof JinjaUnary) inner = (JinjaUnary) r;
        }
        return new JinjaUnaryPrefix("JinjaUnaryPrefix", line(ctx), op, inner);
    }

    @Override
    public PlusUnaryOperator visitPlusUnaryOperator(JinjaParser.PlusUnaryOperatorContext ctx) {
        return new PlusUnaryOperator("PlusUnaryOperator", line(ctx), tok(ctx.JINJA_PLUS()));
    }

    @Override
    public MinusUnaryOperator visitMinusUnaryOperator(JinjaParser.MinusUnaryOperatorContext ctx) {
        return new MinusUnaryOperator("MinusUnaryOperator", line(ctx), tok(ctx.JINJA_MINUS()));
    }

    /* ---------- postfix ---------- */

    @Override
    public JinjaPostfix visitJinjaPostfix(JinjaParser.JinjaPostfixContext ctx) {
        JinjaPrimary base = ctx.base != null ? (JinjaPrimary) visit(ctx.base) : null;
        List<JinjaPostfixPart> parts = new ArrayList<>();
        for (JinjaParser.JinjaPostfixPartContext c : ctx.parts) {
            Object r = visit(c);
            if (r instanceof JinjaPostfixPart) parts.add((JinjaPostfixPart) r);
        }
        return new JinjaPostfix("JinjaPostfix", line(ctx), base, parts);
    }

    @Override
    public AttributeAccess visitAttributeAccess(JinjaParser.AttributeAccessContext ctx) {
        return new AttributeAccess("AttributeAccess", line(ctx),
                tok(ctx.JINJA_DOT()), tok(ctx.JINJA_IDENTIFIER()));
    }

    @Override
    public Subscript visitSubscript(JinjaParser.SubscriptContext ctx) {
        String lb = tok(ctx.JINJA_LBRACK());
        JinjaExpr e = ctx.jinjaExpr() != null ? visitJinjaExpr(ctx.jinjaExpr()) : null;
        String rb = tok(ctx.JINJA_RBRACK());
        return new Subscript("Subscript", line(ctx), lb, e, rb);
    }

    @Override
    public FunctionCall visitFunctionCall(JinjaParser.FunctionCallContext ctx) {
        String lp = tok(ctx.JINJA_LPAREN());
        JinjaArgumentList args = ctx.jinjaArgumentList() != null
                ? visitJinjaArgumentList(ctx.jinjaArgumentList()) : null;
        String rp = tok(ctx.JINJA_RPAREN());
        return new FunctionCall("FunctionCall", line(ctx), lp, args, rp);
    }

    @Override
    public FilterApplication visitFilterApplication(JinjaParser.FilterApplicationContext ctx) {
        String pipe = tok(ctx.JINJA_PIPE());
        String id = tok(ctx.JINJA_IDENTIFIER());
        String lp = tok(ctx.JINJA_LPAREN());
        JinjaArgumentList args = ctx.jinjaArgumentList() != null
                ? visitJinjaArgumentList(ctx.jinjaArgumentList()) : null;
        String rp = tok(ctx.JINJA_RPAREN());
        return new FilterApplication("FilterApplication", line(ctx),
                pipe, id, lp, args, rp);
    }

    /* ---------- primary ---------- */

    @Override
    public IdentifierPrimary visitIdentifierPrimary(JinjaParser.IdentifierPrimaryContext ctx) {
        return new IdentifierPrimary("IdentifierPrimary", line(ctx), tok(ctx.JINJA_IDENTIFIER()));
    }

    @Override
    public StringPrimary visitStringPrimary(JinjaParser.StringPrimaryContext ctx) {
        return new StringPrimary("StringPrimary", line(ctx), tok(ctx.JINJA_STRING()));
    }

    @Override
    public IntegerPrimary visitIntegerPrimary(JinjaParser.IntegerPrimaryContext ctx) {
        return new IntegerPrimary("IntegerPrimary", line(ctx), tok(ctx.JINJA_INTEGER()));
    }

    @Override
    public FloatPrimary visitFloatPrimary(JinjaParser.FloatPrimaryContext ctx) {
        return new FloatPrimary("FloatPrimary", line(ctx), tok(ctx.JINJA_FLOAT()));
    }

    @Override
    public TruePrimary visitTruePrimary(JinjaParser.TruePrimaryContext ctx) {
        return new TruePrimary("TruePrimary", line(ctx), tok(ctx.JINJA_TRUE()));
    }

    @Override
    public FalsePrimary visitFalsePrimary(JinjaParser.FalsePrimaryContext ctx) {
        return new FalsePrimary("FalsePrimary", line(ctx), tok(ctx.JINJA_FALSE()));
    }

    @Override
    public NonePrimary visitNonePrimary(JinjaParser.NonePrimaryContext ctx) {
        return new NonePrimary("NonePrimary", line(ctx), tok(ctx.JINJA_NONE()));
    }

    @Override
    public ParenPrimary visitParenPrimary(JinjaParser.ParenPrimaryContext ctx) {
        String lp = tok(ctx.JINJA_LPAREN());
        JinjaExpr e = ctx.jinjaExpr() != null ? visitJinjaExpr(ctx.jinjaExpr()) : null;
        String rp = tok(ctx.JINJA_RPAREN());
        return new ParenPrimary("ParenPrimary", line(ctx), lp, e, rp);
    }

    @Override
    public ListPrimary visitListPrimary(JinjaParser.ListPrimaryContext ctx) {
        String lb = tok(ctx.JINJA_LBRACK());
        JinjaExprList list = ctx.jinjaExprList() != null
                ? visitJinjaExprList(ctx.jinjaExprList()) : null;
        String rb = tok(ctx.JINJA_RBRACK());
        return new ListPrimary("ListPrimary", line(ctx), lb, list, rb);
    }

    @Override
    public DictPrimary visitDictPrimary(JinjaParser.DictPrimaryContext ctx) {
        String lb = tok(ctx.JINJA_LBRACE());
        JinjaDictEntryList list = ctx.jinjaDictEntryList() != null
                ? visitJinjaDictEntryList(ctx.jinjaDictEntryList()) : null;
        String rb = tok(ctx.JINJA_RBRACE());
        return new DictPrimary("DictPrimary", line(ctx), lb, list, rb);
    }

    /* ---------- arguments & dict entries ---------- */

    @Override
    public JinjaArgumentList visitJinjaArgumentList(JinjaParser.JinjaArgumentListContext ctx) {
        List<JinjaArgument> items = new ArrayList<>();
        for (JinjaParser.JinjaArgumentContext c : ctx.items) {
            Object r = visit(c);
            if (r instanceof JinjaArgument) items.add((JinjaArgument) r);
        }
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new JinjaArgumentList("JinjaArgumentList", line(ctx), items, commas);
    }

    @Override
    public KeywordArgument visitKeywordArgument(JinjaParser.KeywordArgumentContext ctx) {
        String key = ctx.key != null ? ctx.key.getText() : null;
        String eq = tok(ctx.JINJA_ASSIGN());
        JinjaExpr value = ctx.value != null ? visitJinjaExpr(ctx.value) : null;
        return new KeywordArgument("KeywordArgument", line(ctx), key, eq, value);
    }

    @Override
    public PositionalArgument visitPositionalArgument(JinjaParser.PositionalArgumentContext ctx) {
        JinjaExpr e = ctx.jinjaExpr() != null ? visitJinjaExpr(ctx.jinjaExpr()) : null;
        return new PositionalArgument("PositionalArgument", line(ctx), e);
    }

    @Override
    public JinjaDictEntryList visitJinjaDictEntryList(
            JinjaParser.JinjaDictEntryListContext ctx) {
        List<JinjaDictEntry> items = new ArrayList<>();
        for (JinjaParser.JinjaDictEntryContext c : ctx.items) {
            items.add(visitJinjaDictEntry(c));
        }
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new JinjaDictEntryList("JinjaDictEntryList", line(ctx), items, commas);
    }

    @Override
    public JinjaDictEntry visitJinjaDictEntry(JinjaParser.JinjaDictEntryContext ctx) {
        JinjaExpr key = ctx.key != null ? visitJinjaExpr(ctx.key) : null;
        String colon = tok(ctx.JINJA_COLON());
        JinjaExpr value = ctx.value != null ? visitJinjaExpr(ctx.value) : null;
        return new JinjaDictEntry("JinjaDictEntry", line(ctx), key, colon, value);
    }

    /* =====================================================================
     *  JINJA STATEMENTS
     * ===================================================================== */

    @Override
    public JinjaSimpleStatement visitJinjaSimpleStatement(
            JinjaParser.JinjaSimpleStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN());
        JinjaSimpleStatementInner inner = null;
        if (ctx.jinjaSimpleStatementInner() != null) {
            Object r = visit(ctx.jinjaSimpleStatementInner());
            if (r instanceof JinjaSimpleStatementInner) inner = (JinjaSimpleStatementInner) r;
        }
        String close = tok(ctx.JINJA_STMT_CLOSE());
        return new JinjaSimpleStatement("JinjaSimpleStatement", line(ctx), open, inner, close);
    }

    @Override
    public ExtendsStatement visitExtendsStatement(JinjaParser.ExtendsStatementContext ctx) {
        String ext = tok(ctx.JINJA_STMT_EXTENDS());
        String module = ctx.module != null ? ctx.module.getText() : null;
        return new ExtendsStatement("ExtendsStatement", line(ctx), ext, module);
    }

    @Override
    public IncludeStatement visitIncludeStatement(JinjaParser.IncludeStatementContext ctx) {
        String inc = tok(ctx.JINJA_STMT_INCLUDE());
        String str = tok(ctx.JINJA_STRING());
        String id = tok(ctx.JINJA_IDENTIFIER());
        return new IncludeStatement("IncludeStatement", line(ctx), inc, str, id);
    }

    @Override
    public ImportStatement visitImportStatement(JinjaParser.ImportStatementContext ctx) {
        String imp = tok(ctx.JINJA_STMT_IMPORT());
        String module = ctx.module != null ? ctx.module.getText() : null;
        String as = tok(ctx.JINJA_STMT_AS());
        String alias = ctx.alias != null ? ctx.alias.getText() : null;
        return new ImportStatement("ImportStatement", line(ctx), imp, module, as, alias);
    }

    @Override
    public FromImportStatement visitFromImportStatement(
            JinjaParser.FromImportStatementContext ctx) {
        String from = tok(ctx.JINJA_STMT_FROM());
        String module = ctx.module != null ? ctx.module.getText() : null;
        String imp = tok(ctx.JINJA_STMT_IMPORT());
        List<String> names = new ArrayList<>();
        for (org.antlr.v4.runtime.Token t : ctx.importedNames) names.add(t.getText());
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new FromImportStatement("FromImportStatement", line(ctx),
                from, module, imp, names, commas);
    }

    @Override
    public JinjaBlockStatement visitJinjaBlockStatement(
            JinjaParser.JinjaBlockStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String block = tok(ctx.JINJA_STMT_BLOCK());
        String blockName = ctx.blockName != null ? ctx.blockName.getText() : null;
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endblock = tok(ctx.JINJA_STMT_ENDBLOCK());
        String closeName = ctx.closeName != null ? ctx.closeName.getText() : null;
        return new JinjaBlockStatement("JinjaBlockStatement", line(ctx),
                open, block, blockName, close, body, endblock, closeName);
    }

    @Override
    public JinjaIfStatement visitJinjaIfStatement(JinjaParser.JinjaIfStatementContext ctx) {
        List<String> openToks = texts(ctx.JINJA_STMT_OPEN());
        String ifTok = tok(ctx.JINJA_STMT_IF());
        JinjaExpr ifCond = ctx.ifCondition != null ? visitJinjaExpr(ctx.ifCondition) : null;
        List<String> closeToks = texts(ctx.JINJA_STMT_CLOSE());
        TemplateBody ifBody = ctx.ifBody != null ? visitTemplateBody(ctx.ifBody) : null;
        List<String> elifToks = texts(ctx.JINJA_STMT_ELIF());
        List<JinjaExpr> elifConds = new ArrayList<>();
        for (JinjaParser.JinjaExprContext c : ctx.elifConditions) elifConds.add(visitJinjaExpr(c));
        List<TemplateBody> elifBodies = new ArrayList<>();
        for (JinjaParser.TemplateBodyContext c : ctx.elifBodies) elifBodies.add(visitTemplateBody(c));
        String elseTok = tok(ctx.JINJA_STMT_ELSE());
        TemplateBody elseBody = ctx.elseBody != null ? visitTemplateBody(ctx.elseBody) : null;
        String endifTok = tok(ctx.JINJA_STMT_ENDIF());
        return new JinjaIfStatement("JinjaIfStatement", line(ctx),
                openToks, ifTok, ifCond, closeToks, ifBody,
                elifToks, elifConds, elifBodies,
                elseTok, elseBody, endifTok);
    }

    @Override
    public JinjaForStatement visitJinjaForStatement(JinjaParser.JinjaForStatementContext ctx) {
        List<String> openToks = texts(ctx.JINJA_STMT_OPEN());
        String forTok = tok(ctx.JINJA_STMT_FOR());
        JinjaForTarget target = ctx.target != null ? visitJinjaForTarget(ctx.target) : null;
        String inTok = tok(ctx.JINJA_IN());
        JinjaExprList iter = ctx.iterable != null ? visitJinjaExprList(ctx.iterable) : null;
        String rec = tok(ctx.JINJA_STMT_RECURSIVE());
        List<String> closeToks = texts(ctx.JINJA_STMT_CLOSE());
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String elseTok = tok(ctx.JINJA_STMT_ELSE());
        TemplateBody elseBody = ctx.elseBody != null ? visitTemplateBody(ctx.elseBody) : null;
        String endfor = tok(ctx.JINJA_STMT_ENDFOR());
        return new JinjaForStatement("JinjaForStatement", line(ctx),
                openToks, forTok, target, inTok, iter, rec,
                closeToks, body, elseTok, elseBody, endfor);
    }

    @Override
    public JinjaForTarget visitJinjaForTarget(JinjaParser.JinjaForTargetContext ctx) {
        List<JinjaExpr> items = new ArrayList<>();
        for (JinjaParser.JinjaExprContext c : ctx.items) items.add(visitJinjaExpr(c));
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new JinjaForTarget("JinjaForTarget", line(ctx), items, commas);
    }

    @Override
    public InlineSetStatement visitInlineSetStatement(JinjaParser.InlineSetStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN());
        String set = tok(ctx.JINJA_STMT_SET());
        String name = ctx.name != null ? ctx.name.getText() : null;
        String assign = tok(ctx.JINJA_ASSIGN());
        JinjaExpr value = ctx.value != null ? visitJinjaExpr(ctx.value) : null;
        String close = tok(ctx.JINJA_STMT_CLOSE());
        return new InlineSetStatement("InlineSetStatement", line(ctx),
                open, set, name, assign, value, close);
    }

    @Override
    public BlockSetStatement visitBlockSetStatement(JinjaParser.BlockSetStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String set = tok(ctx.JINJA_STMT_SET());
        String name = ctx.name != null ? ctx.name.getText() : null;
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endset = tok(ctx.JINJA_STMT_ENDSET());
        return new BlockSetStatement("BlockSetStatement", line(ctx),
                open, set, name, close, body, endset);
    }

    @Override
    public JinjaWithStatement visitJinjaWithStatement(
            JinjaParser.JinjaWithStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String with = tok(ctx.JINJA_STMT_WITH());
        List<JinjaWithItem> items = new ArrayList<>();
        for (JinjaParser.JinjaWithItemContext c : ctx.items) {
            Object r = visit(c);
            if (r instanceof JinjaWithItem) items.add((JinjaWithItem) r);
        }
        List<String> commas = texts(ctx.JINJA_COMMA());
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endwith = tok(ctx.JINJA_STMT_ENDWITH());
        return new JinjaWithStatement("JinjaWithStatement", line(ctx),
                open, with, items, commas, close, body, endwith);
    }

    @Override
    public AssignedWithItem visitAssignedWithItem(JinjaParser.AssignedWithItemContext ctx) {
        String name = ctx.name != null ? ctx.name.getText() : null;
        String assign = tok(ctx.JINJA_ASSIGN());
        JinjaExpr value = ctx.value != null ? visitJinjaExpr(ctx.value) : null;
        return new AssignedWithItem("AssignedWithItem", line(ctx), name, assign, value);
    }

    @Override
    public SimpleWithItem visitSimpleWithItem(JinjaParser.SimpleWithItemContext ctx) {
        JinjaExpr value = ctx.value != null ? visitJinjaExpr(ctx.value) : null;
        return new SimpleWithItem("SimpleWithItem", line(ctx), value);
    }

    @Override
    public JinjaMacroStatement visitJinjaMacroStatement(
            JinjaParser.JinjaMacroStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String macro = tok(ctx.JINJA_STMT_MACRO());
        String name = ctx.name != null ? ctx.name.getText() : null;
        String lp = tok(ctx.JINJA_LPAREN());
        JinjaMacroParams params = ctx.params != null
                ? visitJinjaMacroParams(ctx.params) : null;
        String rp = tok(ctx.JINJA_RPAREN());
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endmacro = tok(ctx.JINJA_STMT_ENDMACRO());
        return new JinjaMacroStatement("JinjaMacroStatement", line(ctx),
                open, macro, name, lp, params, rp, close, body, endmacro);
    }

    @Override
    public JinjaMacroParams visitJinjaMacroParams(JinjaParser.JinjaMacroParamsContext ctx) {
        List<String> items = new ArrayList<>();
        for (org.antlr.v4.runtime.Token t : ctx.items) items.add(t.getText());
        List<String> commas = texts(ctx.JINJA_COMMA());
        return new JinjaMacroParams("JinjaMacroParams", line(ctx), items, commas);
    }

    @Override
    public JinjaCallStatement visitJinjaCallStatement(JinjaParser.JinjaCallStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String call = tok(ctx.JINJA_STMT_CALL());
        String name = ctx.name != null ? ctx.name.getText() : null;
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endcall = tok(ctx.JINJA_STMT_ENDCALL());
        return new JinjaCallStatement("JinjaCallStatement", line(ctx),
                open, call, name, close, body, endcall);
    }

    @Override
    public JinjaFilterStatement visitJinjaFilterStatement(
            JinjaParser.JinjaFilterStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String filter = tok(ctx.JINJA_STMT_FILTER());
        String name = ctx.name != null ? ctx.name.getText() : null;
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endfilter = tok(ctx.JINJA_STMT_ENDFILTER());
        return new JinjaFilterStatement("JinjaFilterStatement", line(ctx),
                open, filter, name, close, body, endfilter);
    }

    @Override
    public JinjaRawStatement visitJinjaRawStatement(JinjaParser.JinjaRawStatementContext ctx) {
        String open = tok(ctx.JINJA_STMT_OPEN(0));
        String raw = tok(ctx.JINJA_STMT_RAW());
        String close = tok(ctx.JINJA_STMT_CLOSE(0));
        TemplateBody body = ctx.body != null ? visitTemplateBody(ctx.body) : null;
        String endraw = tok(ctx.JINJA_STMT_ENDRAW());
        return new JinjaRawStatement("JinjaRawStatement", line(ctx),
                open, raw, close, body, endraw);
    }

    @Override
    public JinjaComment visitJinjaComment(JinjaParser.JinjaCommentContext ctx) {
        String open = tok(ctx.JINJA_COMMENT_OPEN());
        List<String> text = new ArrayList<>();
        for (org.antlr.v4.runtime.Token t : ctx.text) text.add(t.getText());
        String close = tok(ctx.JINJA_COMMENT_CLOSE());
        return new JinjaComment("JinjaComment", line(ctx), open, text, close);
    }

    /* =====================================================================
     *  CSS
     * ===================================================================== */

    @Override
    public CssStylesheet visitCssStylesheet(JinjaParser.CssStylesheetContext ctx) {
        List<CssRuleSet> rules = new ArrayList<>();
        for (JinjaParser.CssRuleSetContext c : ctx.rules) {
            Object r = visit(c);
            if (r instanceof CssRuleSet) rules.add((CssRuleSet) r);
        }
        return new CssStylesheet("CssStylesheet", line(ctx), rules);
    }

    @Override
    public SelectorRule visitSelectorRule(JinjaParser.SelectorRuleContext ctx) {
        CssSelectorPart sel = ctx.selectors != null ? visitCssSelectorPart(ctx.selectors) : null;
        String open = tok(ctx.OpenBrace());
        CssDeclarationList decls = ctx.decls != null
                ? visitCssDeclarationList(ctx.decls) : null;
        String close = tok(ctx.CloseBrace());
        return new SelectorRule("SelectorRule", line(ctx), sel, open, decls, close);
    }

    @Override
    public AtRule visitAtRule(JinjaParser.AtRuleContext ctx) {
        String keyword = ctx.keyword != null ? ctx.keyword.getText() : null;
        CssAtRuleBody body = ctx.body != null ? visitCssAtRuleBody(ctx.body) : null;
        return new AtRule("AtRule", line(ctx), keyword, body);
    }

    @Override
    public CssAtRuleBody visitCssAtRuleBody(JinjaParser.CssAtRuleBodyContext ctx) {
        List<CssAnyToken> tokens = new ArrayList<>();
        for (JinjaParser.CssAnyTokenContext c : ctx.cssAnyToken()) {
            Object r = visit(c);
            if (r instanceof CssAnyToken) tokens.add((CssAnyToken) r);
        }
        String open = tok(ctx.OpenBrace());
        String close = tok(ctx.CloseBrace());
        String semi = tok(ctx.SemiColon());
        return new CssAtRuleBody("CssAtRuleBody", line(ctx), tokens, open, close, semi);
    }

    @Override
    public CssSelectorPart visitCssSelectorPart(JinjaParser.CssSelectorPartContext ctx) {
        List<CssSelectorAtom> atoms = new ArrayList<>();
        for (JinjaParser.CssSelectorAtomContext c : ctx.atoms) {
            Object r = visit(c);
            if (r instanceof CssSelectorAtom) atoms.add((CssSelectorAtom) r);
        }
        return new CssSelectorPart("CssSelectorPart", line(ctx), atoms);
    }

    /* ---------- cssSelectorAtom ---------- */

    @Override
    public CssIdentAtom visitCssIdentAtom(JinjaParser.CssIdentAtomContext ctx) {
        return new CssIdentAtom("CssIdentAtom", line(ctx), tok(ctx.CSS_IDENT()));
    }

    @Override
    public CssHashAtom visitCssHashAtom(JinjaParser.CssHashAtomContext ctx) {
        return new CssHashAtom("CssHashAtom", line(ctx), tok(ctx.CSS_HASH()));
    }

    @Override
    public CssStringAtom visitCssStringAtom(JinjaParser.CssStringAtomContext ctx) {
        return new CssStringAtom("CssStringAtom", line(ctx), tok(ctx.CSS_STRING()));
    }

    @Override
    public CssNumberAtom visitCssNumberAtom(JinjaParser.CssNumberAtomContext ctx) {
        return new CssNumberAtom("CssNumberAtom", line(ctx), tok(ctx.CSS_NUMBER()));
    }

    @Override
    public CssVariableAtom visitCssVariableAtom(JinjaParser.CssVariableAtomContext ctx) {
        return new CssVariableAtom("CssVariableAtom", line(ctx), tok(ctx.CSS_VARIABLE()));
    }

    @Override
    public CssPercentAtom visitCssPercentAtom(JinjaParser.CssPercentAtomContext ctx) {
        return new CssPercentAtom("CssPercentAtom", line(ctx), tok(ctx.CSS_PERCENT()));
    }

    @Override
    public CssBangAtom visitCssBangAtom(JinjaParser.CssBangAtomContext ctx) {
        return new CssBangAtom("CssBangAtom", line(ctx), tok(ctx.CSS_BANG()));
    }

    @Override
    public CssAtKeywordAtom visitCssAtKeywordAtom(JinjaParser.CssAtKeywordAtomContext ctx) {
        return new CssAtKeywordAtom("CssAtKeywordAtom", line(ctx), tok(ctx.CSS_AT_KEYWORD()));
    }

    @Override
    public MultiplyAtom visitMultiplyAtom(JinjaParser.MultiplyAtomContext ctx) {
        return new MultiplyAtom("MultiplyAtom", line(ctx), tok(ctx.Multiply()));
    }

    @Override
    public DotAtom visitDotAtom(JinjaParser.DotAtomContext ctx) {
        return new DotAtom("DotAtom", line(ctx), tok(ctx.Dot()));
    }

    @Override
    public ColonAtom visitColonAtom(JinjaParser.ColonAtomContext ctx) {
        return new ColonAtom("ColonAtom", line(ctx), tok(ctx.Colon()));
    }

    @Override
    public PipeAtom visitPipeAtom(JinjaParser.PipeAtomContext ctx) {
        return new PipeAtom("PipeAtom", line(ctx), tok(ctx.Pipe()));
    }

    @Override
    public GreaterAtom visitGreaterAtom(JinjaParser.GreaterAtomContext ctx) {
        return new GreaterAtom("GreaterAtom", line(ctx), tok(ctx.Greater()));
    }

    @Override
    public PlusAtom visitPlusAtom(JinjaParser.PlusAtomContext ctx) {
        return new PlusAtom("PlusAtom", line(ctx), tok(ctx.Plus()));
    }

    @Override
    public TildeAtom visitTildeAtom(JinjaParser.TildeAtomContext ctx) {
        return new TildeAtom("TildeAtom", line(ctx), tok(ctx.Tilde()));
    }

    @Override
    public CommaAtom visitCommaAtom(JinjaParser.CommaAtomContext ctx) {
        return new CommaAtom("CommaAtom", line(ctx), tok(ctx.Comma()));
    }

    @Override
    public FunctionCallAtom visitFunctionCallAtom(JinjaParser.FunctionCallAtomContext ctx) {
        String fn = tok(ctx.CSS_FUNCTION());
        List<CssSelectorAtom> atoms = new ArrayList<>();
        for (JinjaParser.CssSelectorAtomContext c : ctx.cssSelectorAtom()) {
            Object r = visit(c);
            if (r instanceof CssSelectorAtom) atoms.add((CssSelectorAtom) r);
        }
        String close = tok(ctx.CloseParen());
        return new FunctionCallAtom("FunctionCallAtom", line(ctx), fn, atoms, close);
    }

    @Override
    public BracketGroupAtom visitBracketGroupAtom(JinjaParser.BracketGroupAtomContext ctx) {
        String open = tok(ctx.OpenBracket());
        List<CssSelectorAtom> atoms = new ArrayList<>();
        for (JinjaParser.CssSelectorAtomContext c : ctx.cssSelectorAtom()) {
            Object r = visit(c);
            if (r instanceof CssSelectorAtom) atoms.add((CssSelectorAtom) r);
        }
        String close = tok(ctx.CloseBracket());
        return new BracketGroupAtom("BracketGroupAtom", line(ctx), open, atoms, close);
    }

    @Override
    public ParenGroupAtom visitParenGroupAtom(JinjaParser.ParenGroupAtomContext ctx) {
        String open = tok(ctx.OpenParen());
        List<CssSelectorAtom> atoms = new ArrayList<>();
        for (JinjaParser.CssSelectorAtomContext c : ctx.cssSelectorAtom()) {
            Object r = visit(c);
            if (r instanceof CssSelectorAtom) atoms.add((CssSelectorAtom) r);
        }
        String close = tok(ctx.CloseParen());
        return new ParenGroupAtom("ParenGroupAtom", line(ctx), open, atoms, close);
    }

    /* ---------- cssAnyToken ---------- */

    @Override
    public CssIdentToken visitCssIdentToken(JinjaParser.CssIdentTokenContext ctx) {
        return new CssIdentToken("CssIdentToken", line(ctx), tok(ctx.CSS_IDENT()));
    }

    @Override
    public CssNumberToken visitCssNumberToken(JinjaParser.CssNumberTokenContext ctx) {
        return new CssNumberToken("CssNumberToken", line(ctx), tok(ctx.CSS_NUMBER()));
    }

    @Override
    public CssStringToken visitCssStringToken(JinjaParser.CssStringTokenContext ctx) {
        return new CssStringToken("CssStringToken", line(ctx), tok(ctx.CSS_STRING()));
    }

    @Override
    public CssHashToken visitCssHashToken(JinjaParser.CssHashTokenContext ctx) {
        return new CssHashToken("CssHashToken", line(ctx), tok(ctx.CSS_HASH()));
    }

    @Override
    public CssVariableToken visitCssVariableToken(JinjaParser.CssVariableTokenContext ctx) {
        return new CssVariableToken("CssVariableToken", line(ctx), tok(ctx.CSS_VARIABLE()));
    }

    @Override
    public CssPercentToken visitCssPercentToken(JinjaParser.CssPercentTokenContext ctx) {
        return new CssPercentToken("CssPercentToken", line(ctx), tok(ctx.CSS_PERCENT()));
    }

    @Override
    public CssBangToken visitCssBangToken(JinjaParser.CssBangTokenContext ctx) {
        return new CssBangToken("CssBangToken", line(ctx), tok(ctx.CSS_BANG()));
    }

    @Override
    public CssImportantToken visitCssImportantToken(JinjaParser.CssImportantTokenContext ctx) {
        return new CssImportantToken("CssImportantToken", line(ctx), tok(ctx.CSS_IMPORTANT()));
    }

    @Override
    public CssAtKeywordToken visitCssAtKeywordToken(JinjaParser.CssAtKeywordTokenContext ctx) {
        return new CssAtKeywordToken("CssAtKeywordToken", line(ctx), tok(ctx.CSS_AT_KEYWORD()));
    }

    @Override
    public FunctionCallToken visitFunctionCallToken(JinjaParser.FunctionCallTokenContext ctx) {
        String fn = tok(ctx.CSS_FUNCTION());
        List<CssAnyToken> toks = new ArrayList<>();
        for (JinjaParser.CssAnyTokenContext c : ctx.cssAnyToken()) {
            Object r = visit(c);
            if (r instanceof CssAnyToken) toks.add((CssAnyToken) r);
        }
        String close = tok(ctx.CloseParen());
        return new FunctionCallToken("FunctionCallToken", line(ctx), fn, toks, close);
    }

    @Override
    public ParenGroupToken visitParenGroupToken(JinjaParser.ParenGroupTokenContext ctx) {
        String open = tok(ctx.OpenParen());
        List<CssAnyToken> toks = new ArrayList<>();
        for (JinjaParser.CssAnyTokenContext c : ctx.cssAnyToken()) {
            Object r = visit(c);
            if (r instanceof CssAnyToken) toks.add((CssAnyToken) r);
        }
        String close = tok(ctx.CloseParen());
        return new ParenGroupToken("ParenGroupToken", line(ctx), open, toks, close);
    }

    @Override
    public BracketGroupToken visitBracketGroupToken(JinjaParser.BracketGroupTokenContext ctx) {
        String open = tok(ctx.OpenBracket());
        List<CssAnyToken> toks = new ArrayList<>();
        for (JinjaParser.CssAnyTokenContext c : ctx.cssAnyToken()) {
            Object r = visit(c);
            if (r instanceof CssAnyToken) toks.add((CssAnyToken) r);
        }
        String close = tok(ctx.CloseBracket());
        return new BracketGroupToken("BracketGroupToken", line(ctx), open, toks, close);
    }

    @Override
    public BraceGroupToken visitBraceGroupToken(JinjaParser.BraceGroupTokenContext ctx) {
        String open = tok(ctx.OpenBrace());
        List<CssAnyToken> toks = new ArrayList<>();
        for (JinjaParser.CssAnyTokenContext c : ctx.cssAnyToken()) {
            Object r = visit(c);
            if (r instanceof CssAnyToken) toks.add((CssAnyToken) r);
        }
        String close = tok(ctx.CloseBrace());
        return new BraceGroupToken("BraceGroupToken", line(ctx), open, toks, close);
    }

    @Override
    public CommaToken visitCommaToken(JinjaParser.CommaTokenContext ctx) {
        return new CommaToken("CommaToken", line(ctx), tok(ctx.Comma()));
    }

    @Override
    public ColonToken visitColonToken(JinjaParser.ColonTokenContext ctx) {
        return new ColonToken("ColonToken", line(ctx), tok(ctx.Colon()));
    }

    @Override
    public SemiColonToken visitSemiColonToken(JinjaParser.SemiColonTokenContext ctx) {
        return new SemiColonToken("SemiColonToken", line(ctx), tok(ctx.SemiColon()));
    }

    @Override
    public PlusToken visitPlusToken(JinjaParser.PlusTokenContext ctx) {
        return new PlusToken("PlusToken", line(ctx), tok(ctx.Plus()));
    }

    @Override
    public MinusToken visitMinusToken(JinjaParser.MinusTokenContext ctx) {
        return new MinusToken("MinusToken", line(ctx), tok(ctx.Minus()));
    }

    @Override
    public MultiplyToken visitMultiplyToken(JinjaParser.MultiplyTokenContext ctx) {
        return new MultiplyToken("MultiplyToken", line(ctx), tok(ctx.Multiply()));
    }

    @Override
    public DivideToken visitDivideToken(JinjaParser.DivideTokenContext ctx) {
        return new DivideToken("DivideToken", line(ctx), tok(ctx.Divide()));
    }

    @Override
    public EqualToken visitEqualToken(JinjaParser.EqualTokenContext ctx) {
        return new EqualToken("EqualToken", line(ctx), tok(ctx.Equal()));
    }

    @Override
    public DotToken visitDotToken(JinjaParser.DotTokenContext ctx) {
        return new DotToken("DotToken", line(ctx), tok(ctx.Dot()));
    }

    @Override
    public PipeToken visitPipeToken(JinjaParser.PipeTokenContext ctx) {
        return new PipeToken("PipeToken", line(ctx), tok(ctx.Pipe()));
    }

    @Override
    public GreaterToken visitGreaterToken(JinjaParser.GreaterTokenContext ctx) {
        return new GreaterToken("GreaterToken", line(ctx), tok(ctx.Greater()));
    }

    @Override
    public TildeToken visitTildeToken(JinjaParser.TildeTokenContext ctx) {
        return new TildeToken("TildeToken", line(ctx), tok(ctx.Tilde()));
    }

    /* ---------- CSS declarations & values ---------- */

    @Override
    public CssDeclarationList visitCssDeclarationList(
            JinjaParser.CssDeclarationListContext ctx) {
        List<CssDeclaration> decls = new ArrayList<>();
        for (JinjaParser.CssDeclarationContext c : ctx.decls) {
            decls.add(visitCssDeclaration(c));
        }
        List<String> semis = texts(ctx.SemiColon());
        return new CssDeclarationList("CssDeclarationList", line(ctx), decls, semis);
    }

    @Override
    public CssDeclaration visitCssDeclaration(JinjaParser.CssDeclarationContext ctx) {
        CssProperty prop = null;
        if (ctx.property != null) {
            Object r = visit(ctx.property);
            if (r instanceof CssProperty) prop = (CssProperty) r;
        }
        String colon = tok(ctx.Colon());
        CssValue value = ctx.value != null ? visitCssValue(ctx.value) : null;
        return new CssDeclaration("CssDeclaration", line(ctx), prop, colon, value);
    }

    @Override
    public IdentCssProperty visitIdentCssProperty(JinjaParser.IdentCssPropertyContext ctx) {
        return new IdentCssProperty("IdentCssProperty", line(ctx), tok(ctx.CSS_IDENT()));
    }

    @Override
    public VariableCssProperty visitVariableCssProperty(
            JinjaParser.VariableCssPropertyContext ctx) {
        return new VariableCssProperty("VariableCssProperty", line(ctx), tok(ctx.CSS_VARIABLE()));
    }

    @Override
    public CssValue visitCssValue(JinjaParser.CssValueContext ctx) {
        List<CssValuePart> parts = new ArrayList<>();
        for (JinjaParser.CssValuePartContext c : ctx.parts) {
            Object r = visit(c);
            if (r instanceof CssValuePart) parts.add((CssValuePart) r);
        }
        return new CssValue("CssValue", line(ctx), parts);
    }

    /* ---------- cssValuePart ---------- */

    @Override
    public CssIdentValue visitCssIdentValue(JinjaParser.CssIdentValueContext ctx) {
        return new CssIdentValue("CssIdentValue", line(ctx), tok(ctx.CSS_IDENT()));
    }

    @Override
    public CssNumberValue visitCssNumberValue(JinjaParser.CssNumberValueContext ctx) {
        return new CssNumberValue("CssNumberValue", line(ctx), tok(ctx.CSS_NUMBER()));
    }

    @Override
    public CssStringValue visitCssStringValue(JinjaParser.CssStringValueContext ctx) {
        return new CssStringValue("CssStringValue", line(ctx), tok(ctx.CSS_STRING()));
    }

    @Override
    public CssHashValue visitCssHashValue(JinjaParser.CssHashValueContext ctx) {
        return new CssHashValue("CssHashValue", line(ctx), tok(ctx.CSS_HASH()));
    }

    @Override
    public CssVariableValue visitCssVariableValue(JinjaParser.CssVariableValueContext ctx) {
        return new CssVariableValue("CssVariableValue", line(ctx), tok(ctx.CSS_VARIABLE()));
    }

    @Override
    public CssPercentValue visitCssPercentValue(JinjaParser.CssPercentValueContext ctx) {
        return new CssPercentValue("CssPercentValue", line(ctx), tok(ctx.CSS_PERCENT()));
    }

    @Override
    public CssImportantValue visitCssImportantValue(JinjaParser.CssImportantValueContext ctx) {
        return new CssImportantValue("CssImportantValue", line(ctx), tok(ctx.CSS_IMPORTANT()));
    }

    @Override
    public CssBangValue visitCssBangValue(JinjaParser.CssBangValueContext ctx) {
        return new CssBangValue("CssBangValue", line(ctx), tok(ctx.CSS_BANG()));
    }

    @Override
    public FunctionCallValue visitFunctionCallValue(JinjaParser.FunctionCallValueContext ctx) {
        String fn = tok(ctx.CSS_FUNCTION());
        List<CssValuePart> parts = new ArrayList<>();
        for (JinjaParser.CssValuePartContext c : ctx.cssValuePart()) {
            Object r = visit(c);
            if (r instanceof CssValuePart) parts.add((CssValuePart) r);
        }
        String close = tok(ctx.CloseParen());
        return new FunctionCallValue("FunctionCallValue", line(ctx), fn, parts, close);
    }

    @Override
    public ParenGroupValue visitParenGroupValue(JinjaParser.ParenGroupValueContext ctx) {
        String open = tok(ctx.OpenParen());
        List<CssValuePart> parts = new ArrayList<>();
        for (JinjaParser.CssValuePartContext c : ctx.cssValuePart()) {
            Object r = visit(c);
            if (r instanceof CssValuePart) parts.add((CssValuePart) r);
        }
        String close = tok(ctx.CloseParen());
        return new ParenGroupValue("ParenGroupValue", line(ctx), open, parts, close);
    }

    @Override
    public BracketGroupValue visitBracketGroupValue(JinjaParser.BracketGroupValueContext ctx) {
        String open = tok(ctx.OpenBracket());
        List<CssValuePart> parts = new ArrayList<>();
        for (JinjaParser.CssValuePartContext c : ctx.cssValuePart()) {
            Object r = visit(c);
            if (r instanceof CssValuePart) parts.add((CssValuePart) r);
        }
        String close = tok(ctx.CloseBracket());
        return new BracketGroupValue("BracketGroupValue", line(ctx), open, parts, close);
    }

    @Override
    public CommaValue visitCommaValue(JinjaParser.CommaValueContext ctx) {
        return new CommaValue("CommaValue", line(ctx), tok(ctx.Comma()));
    }

    @Override
    public PlusValue visitPlusValue(JinjaParser.PlusValueContext ctx) {
        return new PlusValue("PlusValue", line(ctx), tok(ctx.Plus()));
    }

    @Override
    public MinusValue visitMinusValue(JinjaParser.MinusValueContext ctx) {
        return new MinusValue("MinusValue", line(ctx), tok(ctx.Minus()));
    }

    @Override
    public MultiplyValue visitMultiplyValue(JinjaParser.MultiplyValueContext ctx) {
        return new MultiplyValue("MultiplyValue", line(ctx), tok(ctx.Multiply()));
    }

    @Override
    public DivideValue visitDivideValue(JinjaParser.DivideValueContext ctx) {
        return new DivideValue("DivideValue", line(ctx), tok(ctx.Divide()));
    }

    @Override
    public EqualValue visitEqualValue(JinjaParser.EqualValueContext ctx) {
        return new EqualValue("EqualValue", line(ctx), tok(ctx.Equal()));
    }

    @Override
    public DotValue visitDotValue(JinjaParser.DotValueContext ctx) {
        return new DotValue("DotValue", line(ctx), tok(ctx.Dot()));
    }

    @Override
    public PipeValue visitPipeValue(JinjaParser.PipeValueContext ctx) {
        return new PipeValue("PipeValue", line(ctx), tok(ctx.Pipe()));
    }

    @Override
    public GreaterValue visitGreaterValue(JinjaParser.GreaterValueContext ctx) {
        return new GreaterValue("GreaterValue", line(ctx), tok(ctx.Greater()));
    }

    @Override
    public TildeValue visitTildeValue(JinjaParser.TildeValueContext ctx) {
        return new TildeValue("TildeValue", line(ctx), tok(ctx.Tilde()));
    }
}