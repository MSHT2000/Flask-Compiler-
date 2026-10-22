package codeGeneration;

import AST.Jinja.*;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JinjaGenerator {
    private final StringBuilder out = new StringBuilder();
    // نقطة الدخول
    public String generate(TemplateDocument doc) {
        out.setLength(0);
        if (doc != null && doc.getBody() != null) {
            generateBody(doc.getBody());
        }
        return out.toString();
    }

    public void generateToFile(TemplateDocument doc, Path output) throws IOException {
        Files.createDirectories(output.getParent());
        try (FileWriter fw = new FileWriter(output.toFile())) {
            fw.write(generate(doc));
        }
    }
    // TemplateBody → chunks
    private void generateBody(TemplateBody body) {
        if (body == null || body.getChunks() == null) return;
        for (TemplateChunk c : body.getChunks()) generateChunk(c);
    }

    // TemplateChunk — dispatch
    private void generateChunk(TemplateChunk chunk) {
        if (chunk instanceof MiscChunk m) {
            generateMisc(m);
        } else if (chunk instanceof ElementChunk e) {
            generateElement(e);
        } else if (chunk instanceof JinjaChunk j) {
            generateJinja(j);
        }
    }

    // MiscChunk
    private void generateMisc(MiscChunk chunk) {
        HtmlMisc misc = chunk.getHtmlMisc();
        if (misc instanceof ChardataMisc c) {
            generateChardata(c.getHtmlChardata());
        } else if (misc instanceof CommentMisc cm) {
            generateComment(cm.getHtmlComment());
        }
    }

    private void generateChardata(HtmlChardata cd) {
        if (cd instanceof HtmlTextChardata t) {
            append(t.getHTML_TEXT());
        } else if (cd instanceof SeaWsChardata w) {
            append(w.getSEA_WS());
        }
    }

    private void generateComment(HtmlComment c) {
        if (c instanceof RegularHtmlComment r) {
            append(r.getHTML_COMMENT());
        } else if (c instanceof ConditionalHtmlComment cc) {
            append(cc.getHTML_CONDITIONAL_COMMENT());
        }
    }

    // ElementChunk
    private void generateElement(ElementChunk chunk) {
        generateHtmlElement(chunk.getHtmlElement());
    }

    private void generateHtmlElement(HtmlElement element) {
        if (element instanceof PairedElement p) {
            append(p.getTAG_OPEN());
            append(p.getTagName());
            if (p.getAttributes() != null) {
                for (HtmlAttribute a : p.getAttributes()) generateAttribute(a);
            }
            append(p.getTAG_CLOSE());
            if (p.getContent() != null) generateHtmlContent(p.getContent());
            append(p.getTAG_SLASH());
            append(p.getCloseName());
            append(p.getTAG_SLASH_CLOSE());
        } else if (element instanceof ScriptletElement s) {
            append(s.getSCRIPTLET());
        } else if (element instanceof StyleElement st) {
            append(st.getSTYLE_OPEN());
            if (st.getStylesheet() != null) generateStylesheet(st.getStylesheet());
            append(st.getCSS_END());
        }
    }

    private void generateAttribute(HtmlAttribute a) {
        append(" ");
        append(a.getName());
        if (a.getTAG_EQUALS() != null) {
            append("=");
            generateAttributeValue(a.getValue());
        }
    }

    private void generateAttributeValue(AttributeValue v) {
        if (v instanceof DoubleQuotedValue d) {
            append(d.getATTVALUE_OPEN_DQ());
            if (d.getAttributeValueContent() != null) {
                for (AttributeValueContent c : d.getAttributeValueContent()) {
                    generateAttributeValueContent(c);
                }
            }
            append(d.getATTVALUE_DQ_CLOSE());
        } else if (v instanceof SingleQuotedValue s) {
            append(s.getATTVALUE_OPEN_SQ());
            if (s.getAttributeValueContent() != null) {
                for (AttributeValueContent c : s.getAttributeValueContent()) {
                    generateAttributeValueContent(c);
                }
            }
            append(s.getATTVALUE_SQ_CLOSE());
        } else if (v instanceof UnquotedValue u) {
            append(u.getATTVALUE_UNQUOTED());
        }
    }

    private void generateAttributeValueContent(AttributeValueContent c) {
        if (c instanceof DoubleQuotedText t) {
            append(t.getATTVALUE_DQ_TEXT());
        } else if (c instanceof SingleQuotedText t) {
            append(t.getATTVALUE_SQ_TEXT());
        } else if (c instanceof DoubleQuotedLbrace l) {
            append(l.getATTVALUE_DQ_LBRACE());
        } else if (c instanceof SingleQuotedLbrace l) {
            append(l.getATTVALUE_SQ_LBRACE());
        } else if (c instanceof AttributeJinjaExpression e) {
            generateJinjaExpression(e.getJinjaExpression());
        }
    }
    // HtmlContent

    private void generateHtmlContent(HtmlContent content) {
        if (content == null || content.getHtmlContentItem() == null) return;
        for (HtmlContentItem item : content.getHtmlContentItem()) {
            generateHtmlContentItem(item);
        }
    }

    private void generateHtmlContentItem(HtmlContentItem item) {
        if (item instanceof ChardataItem ci) {
            generateChardata(ci.getHtmlChardata());
        } else if (item instanceof ElementItem ei) {
            generateHtmlElement(ei.getHtmlElement());
        } else if (item instanceof CdataItem cd) {
            append(cd.getCDATA());
        } else if (item instanceof CommentItem cm) {
            generateComment(cm.getHtmlComment());
        } else if (item instanceof TemplateJinjaItem tji) {
            generateJinjaNode(tji.getTemplateJinja());
        }
    }

    // ============================================================
    // JinjaChunk / TemplateJinja
    // ============================================================
    private void generateJinja(JinjaChunk chunk) {
        generateJinjaNode(chunk.getTemplateJinja());
    }

    private void generateJinjaNode(TemplateJinja j) {
        if (j == null) return;

        if (j instanceof JinjaExpressionNode e) {
            generateJinjaExpression(e.getJinjaExpression());
        } else if (j instanceof JinjaCommentNode c) {
            generateJinjaComment(c.getJinjaComment());
        } else if (j instanceof JinjaSimpleStmt s) {
            generateJinjaSimpleStatement(s.getJinjaSimpleStatement());
        } else if (j instanceof JinjaIf i) {
            generateJinjaIf(i.getJinjaIfStatement());
        } else if (j instanceof JinjaFor f) {
            generateJinjaFor(f.getJinjaForStatement());
        } else if (j instanceof JinjaBlock b) {
            generateJinjaBlock(b.getJinjaBlockStatement());
        } else if (j instanceof JinjaSet s) {
            generateJinjaSet(s.getJinjaSetStatement());
        } else if (j instanceof JinjaWith w) {
            generateJinjaWith(w.getJinjaWithStatement());
        } else if (j instanceof JinjaMacro m) {
            generateJinjaMacro(m.getJinjaMacroStatement());
        } else if (j instanceof JinjaCall c) {
            generateJinjaCall(c.getJinjaCallStatement());
        } else if (j instanceof JinjaFilter f) {
            generateJinjaFilter(f.getJinjaFilterStatement());
        } else if (j instanceof JinjaRaw r) {
            generateJinjaRaw(r.getJinjaRawStatement());
        }
    }

    // ============================================================
    // JinjaExpression: {{ expr1, expr2 }}
    // ============================================================
    private void generateJinjaExpression(JinjaExpression expr) {
        if (expr == null) return;
        append(expr.getJINJA_EXPR_OPEN());
        generateJinjaExprList(expr.getExprs());
        append(expr.getJINJA_EXPR_CLOSE());
    }

    private void generateJinjaExprList(JinjaExprList list) {
        if (list == null || list.getItems() == null) return;
        for (int i = 0; i < list.getItems().size(); i++) {
            if (i > 0) append(", ");
            generateJinjaExpr(list.getItems().get(i));
        }
    }

    // ============================================================
    // JinjaExpr — تعبير كامل
    // ============================================================
    private void generateJinjaExpr(JinjaExpr expr) {
        if (expr == null) return;
        generateJinjaOr(expr.getTrueExpr());
        if (expr.getJINJA_IF() != null) {
            append(" if ");
            generateJinjaOr(expr.getCondition());
            append(" else ");
            generateJinjaExpr(expr.getFalseExpr());
        }
    }

    private void generateJinjaOr(JinjaOrExpression or) {
        if (or == null) return;
        generateJinjaAnd(or.getFirst());
        if (or.getJINJA_OR() != null) {
            for (int i = 0; i < or.getJINJA_OR().size(); i++) {
                append(" or ");
                generateJinjaAnd(or.getOperands().get(i));
            }
        }
    }

    private void generateJinjaAnd(JinjaAndExpression and) {
        if (and == null) return;
        generateJinjaNot(and.getFirst());
        if (and.getJINJA_AND() != null) {
            for (int i = 0; i < and.getJINJA_AND().size(); i++) {
                append(" and ");
                generateJinjaNot(and.getOperands().get(i));
            }
        }
    }

    private void generateJinjaNot(JinjaNotExpression not) {
        if (not == null) return;
        if (not instanceof NotExpression n) {
            append("not ");
            generateJinjaNot(n.getJinjaNotExpression());
        } else if (not instanceof ComparisonExpression c) {
            generateJinjaComparison(c.getJinjaComparison());
        }
    }

    private void generateJinjaComparison(JinjaComparison cmp) {
        if (cmp == null) return;
        generateJinjaAdditive(cmp.getFirst());
        if (cmp.getOperators() != null) {
            for (int i = 0; i < cmp.getOperators().size(); i++) {
                append(" ");
                generateJinjaComparisonOperator(cmp.getOperators().get(i));
                append(" ");
                generateJinjaAdditive(cmp.getOperands().get(i));
            }
        }
    }

    private void generateJinjaComparisonOperator(JinjaComparisonOperator op) {
        if (op instanceof EqOperator o) append(o.getJINJA_EQ());
        else if (op instanceof NotEqOperator o) append(o.getJINJA_NEQ());
        else if (op instanceof LtOperator o) append(o.getJINJA_LT());
        else if (op instanceof LteOperator o) append(o.getJINJA_LE());
        else if (op instanceof GtOperator o) append(o.getJINJA_GT());
        else if (op instanceof GteOperator o) append(o.getJINJA_GE());
        else if (op instanceof InOperator o) append(o.getJINJA_IN());
        else if (op instanceof IsOperator o) append(o.getJINJA_IS());
    }

    private void generateJinjaAdditive(JinjaAdditive add) {
        if (add == null) return;
        generateJinjaMultiplicative(add.getJinjaMultiplicative());
        if (add.getJinjaAdditiveTail() != null) {
            for (JinjaAdditiveTail tail : add.getJinjaAdditiveTail()) {
                append(" ");
                generateJinjaAdditiveOperator(tail.getJinjaAdditiveOperator());
                append(" ");
                generateJinjaMultiplicative(tail.getJinjaMultiplicative());
            }
        }
    }

    private void generateJinjaAdditiveOperator(JinjaAdditiveOperator op) {
        if (op instanceof PlusAdditiveOperator o) append(o.getJINJA_PLUS());
        else if (op instanceof MinusAdditiveOperator o) append(o.getJINJA_MINUS());
        else if (op instanceof TildeAdditiveOperator o) append(o.getJINJA_TILDE());
    }

    private void generateJinjaMultiplicative(JinjaMultiplicative mul) {
        if (mul == null) return;
        generateJinjaPower(mul.getJinjaPower());
        if (mul.getJinjaMultiplicativeTail() != null) {
            for (JinjaMultiplicativeTail tail : mul.getJinjaMultiplicativeTail()) {
                append(" ");
                generateJinjaMultiplicativeOperator(tail.getJinjaMultiplicativeOperator());
                append(" ");
                generateJinjaPower(tail.getJinjaPower());
            }
        }
    }

    private void generateJinjaMultiplicativeOperator(JinjaMultiplicativeOperator op) {
        if (op instanceof StarMultiplicativeOperator o) append(o.getJINJA_STAR());
        else if (op instanceof SlashMultiplicativeOperator o) append(o.getJINJA_SLASH());
        else if (op instanceof FloorDivMultiplicativeOperator o) append(o.getJINJA_FLOORDIV());
        else if (op instanceof ModMultiplicativeOperator o) append(o.getJINJA_MOD());
    }

    private void generateJinjaPower(JinjaPower pow) {
        if (pow == null) return;
        generateJinjaUnary(pow.getBase());
        if (pow.getJINJA_POW() != null) {
            for (int i = 0; i < pow.getJINJA_POW().size(); i++) {
                append(" ** ");
                generateJinjaUnary(pow.getExponents().get(i));
            }
        }
    }

    private void generateJinjaUnary(JinjaUnary u) {
        if (u == null) return;
        if (u instanceof UnaryPrefixExpr pre) {
            JinjaUnaryPrefix p = pre.getJinjaUnaryPrefix();
            if (p != null) {
                generateJinjaUnaryOperator(p.getJinjaUnaryOperator());
                generateJinjaUnary(p.getJinjaUnary());
            }
        } else if (u instanceof PostfixExpr post) {
            generateJinjaPostfix(post.getJinjaPostfix());
        }
    }

    private void generateJinjaUnaryOperator(JinjaUnaryOperator op) {
        if (op instanceof PlusUnaryOperator o) append(o.getJINJA_PLUS());
        else if (op instanceof MinusUnaryOperator o) append(o.getJINJA_MINUS());
    }

    private void generateJinjaPostfix(JinjaPostfix post) {
        if (post == null) return;
        generateJinjaPrimary(post.getBase());
        if (post.getParts() != null) {
            for (JinjaPostfixPart p : post.getParts()) generateJinjaPostfixPart(p);
        }
    }

    private void generateJinjaPostfixPart(JinjaPostfixPart part) {
        if (part instanceof AttributeAccess a) {
            append(a.getJINJA_DOT());
            append(a.getJINJA_IDENTIFIER());
        } else if (part instanceof Subscript s) {
            append(s.getJINJA_LBRACK());
            generateJinjaExpr(s.getJinjaExpr());
            append(s.getJINJA_RBRACK());
        } else if (part instanceof FunctionCall f) {
            append(f.getJINJA_LPAREN());
            generateJinjaArgumentList(f.getJinjaArgumentList());
            append(f.getJINJA_RPAREN());
        } else if (part instanceof FilterApplication fi) {
            append(fi.getJINJA_PIPE());
            append(fi.getJINJA_IDENTIFIER());
            if (fi.getJINJA_LPAREN() != null) {
                append(fi.getJINJA_LPAREN());
                generateJinjaArgumentList(fi.getJinjaArgumentList());
                append(fi.getJINJA_RPAREN());
            }
        }
    }

    private void generateJinjaPrimary(JinjaPrimary p) {
        if (p instanceof IdentifierPrimary i) append(i.getJINJA_IDENTIFIER());
        else if (p instanceof StringPrimary s) append(s.getJINJA_STRING());
        else if (p instanceof IntegerPrimary i) append(i.getJINJA_INTEGER());
        else if (p instanceof FloatPrimary f) append(f.getJINJA_FLOAT());
        else if (p instanceof TruePrimary t) append(t.getJINJA_TRUE());
        else if (p instanceof FalsePrimary f) append(f.getJINJA_FALSE());
        else if (p instanceof NonePrimary n) append(n.getJINJA_NONE());
        else if (p instanceof ParenPrimary pp) {
            append(pp.getJINJA_LPAREN());
            generateJinjaExpr(pp.getJinjaExpr());
            append(pp.getJINJA_RPAREN());
        } else if (p instanceof ListPrimary lp) {
            append(lp.getJINJA_LBRACK());
            generateJinjaExprList(lp.getJinjaExprList());
            append(lp.getJINJA_RBRACK());
        } else if (p instanceof DictPrimary dp) {
            append(dp.getJINJA_LBRACE());
            generateJinjaDictEntryList(dp.getJinjaDictEntryList());
            append(dp.getJINJA_RBRACE());
        }
    }

    private void generateJinjaDictEntryList(JinjaDictEntryList list) {
        if (list == null || list.getItems() == null) return;
        for (int i = 0; i < list.getItems().size(); i++) {
            if (i > 0) append(", ");
            JinjaDictEntry e = list.getItems().get(i);
            generateJinjaExpr(e.getKey());
            append(e.getJINJA_COLON());
            generateJinjaExpr(e.getValue());
        }
    }

    private void generateJinjaArgumentList(JinjaArgumentList list) {
        if (list == null || list.getItems() == null) return;
        for (int i = 0; i < list.getItems().size(); i++) {
            if (i > 0) append(", ");
            JinjaArgument a = list.getItems().get(i);
            if (a instanceof KeywordArgument k) {
                append(k.getKey());
                append(k.getJINJA_ASSIGN());
                generateJinjaExpr(k.getValue());
            } else if (a instanceof PositionalArgument pa) {
                generateJinjaExpr(pa.getJinjaExpr());
            }
        }
    }

    // ============================================================
    // JinjaComment: {# ... #}
    // ============================================================
    private void generateJinjaComment(JinjaComment c) {
        if (c == null) return;
        append(c.getJINJA_COMMENT_OPEN());
        if (c.getText() != null) {
            for (String t : c.getText()) append(t);
        }
        append(c.getJINJA_COMMENT_CLOSE());
    }

    // ============================================================
    // JinjaSimpleStatement: {% extends/include/import/set ... %}
    // ============================================================
    private void generateJinjaSimpleStatement(JinjaSimpleStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        generateJinjaSimpleStatementInner(s.getJinjaSimpleStatementInner());
        append(s.getJINJA_STMT_CLOSE());
    }

    private void generateJinjaSimpleStatementInner(JinjaSimpleStatementInner inner) {
        if (inner instanceof ExtendsStatement e) {
            append(e.getJINJA_STMT_EXTENDS());
            append(" ");
            append(e.getModule());
        } else if (inner instanceof IncludeStatement i) {
            append(i.getJINJA_STMT_INCLUDE());
            append(" ");
            if (i.getJINJA_STRING() != null) append(i.getJINJA_STRING());
            else if (i.getJINJA_IDENTIFIER() != null) append(i.getJINJA_IDENTIFIER());
        } else if (inner instanceof ImportStatement i) {
            append(i.getJINJA_STMT_IMPORT());
            append(" ");
            append(i.getModule());
            if (i.getJINJA_STMT_AS() != null) {
                append(" ");
                append(i.getJINJA_STMT_AS());
                append(" ");
                append(i.getAlias());
            }
        } else if (inner instanceof FromImportStatement f) {
            append(f.getJINJA_STMT_FROM());
            append(" ");
            append(f.getModule());
            append(" ");
            append(f.getJINJA_STMT_IMPORT());
            append(" ");
            // ✅ getImportedNames() → List<String> — نمر عليها
            if (f.getImportedNames() != null) {
                for (int i = 0; i < f.getImportedNames().size(); i++) {
                    if (i > 0) append(", ");
                    append(f.getImportedNames().get(i));
                }
            }
        }
    }

    // ============================================================
    // JinjaIf
    // ============================================================
    private void generateJinjaIf(JinjaIfStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_IF());
        append(" ");
        generateJinjaExpr(s.getIfCondition());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getIfBody());

        // elif
        if (s.getElifConditions() != null) {
            for (int i = 0; i < s.getElifConditions().size(); i++) {
                append(s.getJINJA_STMT_OPEN());
                append("elif ");
                generateJinjaExpr(s.getElifConditions().get(i));
                append(" ");
                append(s.getJINJA_STMT_CLOSE());
                generateBody(s.getElifBodies().get(i));
            }
        }

        // else
        if (s.getJINJA_STMT_ELSE() != null) {
            append(s.getJINJA_STMT_OPEN());
            append("else");
            append(" ");
            append(s.getJINJA_STMT_CLOSE());
            generateBody(s.getElseBody());
        }

        // endif
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDIF());
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // JinjaFor
    // ============================================================
    private void generateJinjaFor(JinjaForStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_FOR());
        append(" ");
        generateJinjaForTarget(s.getTarget());
        append(" in ");
        generateJinjaExprList(s.getIterable());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());

        if (s.getJINJA_STMT_ELSE() != null) {
            append(s.getJINJA_STMT_OPEN());
            append("else");
            append(" ");
            append(s.getJINJA_STMT_CLOSE());
            generateBody(s.getElseBody());
        }

        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDFOR());
        append(s.getJINJA_STMT_CLOSE());
    }

    private void generateJinjaForTarget(JinjaForTarget t) {
        if (t == null || t.getItems() == null) return;
        // ✅ getItems() → List<JinjaExpr> — نمر عليها
        for (int i = 0; i < t.getItems().size(); i++) {
            if (i > 0) append(", ");
            generateJinjaExpr(t.getItems().get(i));
        }
    }

    // ============================================================
    // JinjaBlock
    // ============================================================
    private void generateJinjaBlock(JinjaBlockStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_BLOCK());
        append(" ");
        append(s.getBlockName());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDBLOCK());
        if (s.getCloseName() != null) {
            append(" ");
            append(s.getCloseName());
        }
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // JinjaSet
    // ============================================================
    private void generateJinjaSet(JinjaSetStatement s) {
        if (s == null) return;
        if (s instanceof InlineSetStatement inline) {
            append(inline.getJINJA_STMT_OPEN());
            append(inline.getJINJA_STMT_SET());
            append(" ");
            append(inline.getName());
            append(" ");
            append(inline.getJINJA_ASSIGN());
            append(" ");
            generateJinjaExpr(inline.getValue());
            append(" ");
            append(inline.getJINJA_STMT_CLOSE());
        } else if (s instanceof BlockSetStatement block) {
            append(block.getJINJA_STMT_OPEN());
            append(block.getJINJA_STMT_SET());
            append(" ");
            append(block.getName());
            append(" ");
            append(block.getJINJA_STMT_CLOSE());
            generateBody(block.getBody());
            append(block.getJINJA_STMT_OPEN());
            append(block.getJINJA_STMT_ENDSET());
            append(block.getJINJA_STMT_CLOSE());
        }
    }

    // ============================================================
    // JinjaWith
    // ============================================================
    private void generateJinjaWith(JinjaWithStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_WITH());
        append(" ");
        if (s.getItems() != null) {
            for (int i = 0; i < s.getItems().size(); i++) {
                if (i > 0) append(", ");
                generateJinjaWithItem(s.getItems().get(i));
            }
        }
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDWITH());
        append(s.getJINJA_STMT_CLOSE());
    }

    private void generateJinjaWithItem(JinjaWithItem item) {
        if (item instanceof AssignedWithItem a) {
            append(a.getName());
            append(a.getJINJA_ASSIGN());
            generateJinjaExpr(a.getValue());
        } else if (item instanceof SimpleWithItem s) {
            generateJinjaExpr(s.getValue());
        }
    }

    // ============================================================
    // JinjaMacro
    // ============================================================
    private void generateJinjaMacro(JinjaMacroStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_MACRO());
        append(" ");
        append(s.getName());
        append(s.getJINJA_LPAREN());
        // ✅ getItems() → List<String> — نمر عليها
        if (s.getParams() != null && s.getParams().getItems() != null) {
            List<String> items = s.getParams().getItems();
            for (int i = 0; i < items.size(); i++) {
                if (i > 0) append(", ");
                append(items.get(i));
            }
        }
        append(s.getJINJA_RPAREN());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDMACRO());
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // JinjaCall
    // ============================================================
    private void generateJinjaCall(JinjaCallStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_CALL());
        append(" ");
        append(s.getName());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDCALL());
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // JinjaFilter
    // ============================================================
    private void generateJinjaFilter(JinjaFilterStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_FILTER());
        append(" ");
        append(s.getName());
        append(" ");
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDFILTER());
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // JinjaRaw
    // ============================================================
    private void generateJinjaRaw(JinjaRawStatement s) {
        if (s == null) return;
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_RAW());
        append(s.getJINJA_STMT_CLOSE());
        generateBody(s.getBody());
        append(s.getJINJA_STMT_OPEN());
        append(s.getJINJA_STMT_ENDRAW());
        append(s.getJINJA_STMT_CLOSE());
    }

    // ============================================================
    // CSS Stylesheet
    // ============================================================
    private void generateStylesheet(CssStylesheet ss) {
        if (ss == null || ss.getRules() == null) return;
        for (CssRuleSet rule : ss.getRules()) generateCssRuleSet(rule);
    }

    private void generateCssRuleSet(CssRuleSet rule) {
        if (rule instanceof SelectorRule s) {
            generateCssSelectorPart(s.getSelectors());
            append(s.getOpenBrace());
            generateCssDeclarationList(s.getDecls());
            append(s.getCloseBrace());
        } else if (rule instanceof AtRule a) {
            append(a.getKeyword());
            if (a.getBody() != null) generateCssAtRuleBody(a.getBody());
        }
    }

    private void generateCssSelectorPart(CssSelectorPart part) {
        if (part == null || part.getAtoms() == null) return;
        for (CssSelectorAtom atom : part.getAtoms()) generateCssSelectorAtom(atom);
    }

    private void generateCssSelectorAtom(CssSelectorAtom atom) {
        if (atom instanceof CssIdentAtom a) append(a.getCSS_IDENT());
        else if (atom instanceof CssNumberAtom a) append(a.getCSS_NUMBER());
        else if (atom instanceof CssStringAtom a) append(a.getCSS_STRING());
        else if (atom instanceof CssHashAtom a) append(a.getCSS_HASH());
        else if (atom instanceof CssAtKeywordAtom a) append(a.getCSS_AT_KEYWORD());
        else if (atom instanceof CssVariableAtom a) append(a.getCSS_VARIABLE());
        else if (atom instanceof CssBangAtom a) append(a.getCSS_BANG());
        else if (atom instanceof CssPercentAtom a) append(a.getCSS_PERCENT());
        else if (atom instanceof ColonAtom a) append(a.getColon());
        else if (atom instanceof CommaAtom a) append(a.getComma());
        else if (atom instanceof DotAtom a) append(a.getDot());
        else if (atom instanceof PlusAtom a) append(a.getPlus());
        else if (atom instanceof MultiplyAtom a) append(a.getMultiply());
        else if (atom instanceof GreaterAtom a) append(a.getGreater());
        else if (atom instanceof TildeAtom a) append(a.getTilde());
        else if (atom instanceof PipeAtom a) append(a.getPipe());
        else if (atom instanceof ParenGroupAtom a) {
            append(a.getOpenParen());
            if (a.getCssSelectorAtom() != null) {
                for (CssSelectorAtom inner : a.getCssSelectorAtom()) generateCssSelectorAtom(inner);
            }
            append(a.getCloseParen());
        } else if (atom instanceof BracketGroupAtom a) {
            append(a.getOpenBracket());
            if (a.getCssSelectorAtom() != null) {
                for (CssSelectorAtom inner : a.getCssSelectorAtom()) generateCssSelectorAtom(inner);
            }
            append(a.getCloseBracket());
        } else if (atom instanceof FunctionCallAtom a) {
            append(a.getCSS_FUNCTION());
            if (a.getCssSelectorAtom() != null) {
                for (CssSelectorAtom inner : a.getCssSelectorAtom()) generateCssSelectorAtom(inner);
            }
            append(a.getCloseParen());
        }
    }

    private void generateCssDeclarationList(CssDeclarationList list) {
        if (list == null || list.getDecls() == null) return;
        for (CssDeclaration d : list.getDecls()) generateCssDeclaration(d);
    }

    private void generateCssDeclaration(CssDeclaration d) {
        if (d == null) return;
        generateCssProperty(d.getProperty());
        append(d.getColon());
        generateCssValue(d.getValue());
        append(";");
    }

    private void generateCssProperty(CssProperty p) {
        if (p instanceof IdentCssProperty i) append(i.getCSS_IDENT());
        else if (p instanceof VariableCssProperty v) append(v.getCSS_VARIABLE());
    }

    private void generateCssValue(CssValue v) {
        if (v == null || v.getParts() == null) return;
        for (CssValuePart p : v.getParts()) generateCssValuePart(p);
    }

    private void generateCssValuePart(CssValuePart p) {
        if (p instanceof CssIdentValue v) append(v.getCSS_IDENT());
        else if (p instanceof CssNumberValue v) append(v.getCSS_NUMBER());
        else if (p instanceof CssStringValue v) append(v.getCSS_STRING());
        else if (p instanceof CssHashValue v) append(v.getCSS_HASH());
        else if (p instanceof CssVariableValue v) append(v.getCSS_VARIABLE());
        else if (p instanceof CssBangValue v) append(v.getCSS_BANG());
        else if (p instanceof CssPercentValue v) append(v.getCSS_PERCENT());
        else if (p instanceof CssImportantValue v) append(v.getCSS_IMPORTANT());
        else if (p instanceof CommaValue v) append(v.getComma());
        else if (p instanceof DotValue v) append(v.getDot());
        else if (p instanceof PlusValue v) append(v.getPlus());
        else if (p instanceof MinusValue v) append(v.getMinus());
        else if (p instanceof MultiplyValue v) append(v.getMultiply());
        else if (p instanceof DivideValue v) append(v.getDivide());
        else if (p instanceof EqualValue v) append(v.getEqual());
        else if (p instanceof GreaterValue v) append(v.getGreater());
        else if (p instanceof TildeValue v) append(v.getTilde());
        else if (p instanceof PipeValue v) append(v.getPipe());
        else if (p instanceof ParenGroupValue v) {
            append(v.getOpenParen());
            if (v.getCssValuePart() != null) {
                for (CssValuePart inner : v.getCssValuePart()) generateCssValuePart(inner);
            }
            append(v.getCloseParen());
        } else if (p instanceof BracketGroupValue v) {
            append(v.getOpenBracket());
            if (v.getCssValuePart() != null) {
                for (CssValuePart inner : v.getCssValuePart()) generateCssValuePart(inner);
            }
            append(v.getCloseBracket());
        } else if (p instanceof FunctionCallValue v) {
            append(v.getCSS_FUNCTION());
            if (v.getCssValuePart() != null) {
                for (CssValuePart inner : v.getCssValuePart()) generateCssValuePart(inner);
            }
            append(v.getCloseParen());
        }
    }

    private void generateCssAtRuleBody(CssAtRuleBody body) {
        if (body == null) return;
        append(body.getOpenBrace());
        if (body.getCssAnyToken() != null) {
            for (CssAnyToken t : body.getCssAnyToken()) generateCssAnyToken(t);
        }
        append(body.getCloseBrace());
        if (body.getSemiColon() != null) append(body.getSemiColon());
    }

    private void generateCssAnyToken(CssAnyToken t) {
        if (t instanceof CssIdentToken tok) append(tok.getCSS_IDENT());
        else if (t instanceof CssNumberToken tok) append(tok.getCSS_NUMBER());
        else if (t instanceof CssStringToken tok) append(tok.getCSS_STRING());
        else if (t instanceof CssHashToken tok) append(tok.getCSS_HASH());
        else if (t instanceof CssAtKeywordToken tok) append(tok.getCSS_AT_KEYWORD());
        else if (t instanceof CssVariableToken tok) append(tok.getCSS_VARIABLE());
        else if (t instanceof CssBangToken tok) append(tok.getCSS_BANG());
        else if (t instanceof CssPercentToken tok) append(tok.getCSS_PERCENT());
        else if (t instanceof CssImportantToken tok) append(tok.getCSS_IMPORTANT());
        else if (t instanceof ColonToken tok) append(tok.getColon());
        else if (t instanceof CommaToken tok) append(tok.getComma());
        else if (t instanceof DotToken tok) append(tok.getDot());
        else if (t instanceof PlusToken tok) append(tok.getPlus());
        else if (t instanceof MinusToken tok) append(tok.getMinus());
        else if (t instanceof MultiplyToken tok) append(tok.getMultiply());
        else if (t instanceof DivideToken tok) append(tok.getDivide());
        else if (t instanceof EqualToken tok) append(tok.getEqual());
        else if (t instanceof GreaterToken tok) append(tok.getGreater());
        else if (t instanceof TildeToken tok) append(tok.getTilde());
        else if (t instanceof PipeToken tok) append(tok.getPipe());
        else if (t instanceof SemiColonToken tok) append(tok.getSemiColon());
        else if (t instanceof ParenGroupToken tok) {
            append(tok.getOpenParen());
            if (tok.getCssAnyToken() != null) {
                for (CssAnyToken inner : tok.getCssAnyToken()) generateCssAnyToken(inner);
            }
            append(tok.getCloseParen());
        } else if (t instanceof BracketGroupToken tok) {
            append(tok.getOpenBracket());
            if (tok.getCssAnyToken() != null) {
                for (CssAnyToken inner : tok.getCssAnyToken()) generateCssAnyToken(inner);
            }
            append(tok.getCloseBracket());
        } else if (t instanceof BraceGroupToken tok) {
            append(tok.getOpenBrace());
            if (tok.getCssAnyToken() != null) {
                for (CssAnyToken inner : tok.getCssAnyToken()) generateCssAnyToken(inner);
            }
            append(tok.getCloseBrace());
        } else if (t instanceof FunctionCallToken tok) {
            append(tok.getCSS_FUNCTION());
            if (tok.getCssAnyToken() != null) {
                for (CssAnyToken inner : tok.getCssAnyToken()) generateCssAnyToken(inner);
            }
            append(tok.getCloseParen());
        }
    }

    // ============================================================
    // Helpers
    // ============================================================
    private void append(String s) {
        if (s != null) out.append(s);
    }

    /** يدعم append(List<String>) أيضاً */
    private void append(List<String> list) {
        if (list == null) return;
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) out.append(", ");
            if (list.get(i) != null) out.append(list.get(i));
        }
    }
}