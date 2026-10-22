// Generated from C:/Users/HP/Desktop/complier flask/Flask Compiler/src/antlr/JinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JinjaParser#templateDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateDocument(JinjaParser.TemplateDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#templateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateBody(JinjaParser.TemplateBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MiscChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMiscChunk(JinjaParser.MiscChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementChunk(JinjaParser.ElementChunkContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaChunk(JinjaParser.JinjaChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(JinjaParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScriptletValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletValue(JinjaParser.ScriptletValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhitespaceValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhitespaceValue(JinjaParser.WhitespaceValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(JinjaParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PairedElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedElement(JinjaParser.PairedElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletElement(JinjaParser.ScriptletElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(JinjaParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(JinjaParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChardataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardataItem(JinjaParser.ChardataItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ElementItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementItem(JinjaParser.ElementItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CdataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdataItem(JinjaParser.CdataItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommentItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentItem(JinjaParser.CommentItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateJinjaItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateJinjaItem(JinjaParser.TemplateJinjaItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(JinjaParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedValue(JinjaParser.DoubleQuotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedValue(JinjaParser.SingleQuotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedValue(JinjaParser.UnquotedValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedText(JinjaParser.DoubleQuotedTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedText(JinjaParser.SingleQuotedTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleQuotedLbrace(JinjaParser.DoubleQuotedLbraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleQuotedLbrace(JinjaParser.SingleQuotedLbraceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeJinjaExpression}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeJinjaExpression(JinjaParser.AttributeJinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTextChardata(JinjaParser.HtmlTextChardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeaWsChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeaWsChardata(JinjaParser.SeaWsChardataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommentMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentMisc(JinjaParser.CommentMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChardataMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChardataMisc(JinjaParser.ChardataMiscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularHtmlComment(JinjaParser.RegularHtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalHtmlComment(JinjaParser.ConditionalHtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExpressionNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpressionNode(JinjaParser.JinjaExpressionNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCommentNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCommentNode(JinjaParser.JinjaCommentNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaSimpleStmt}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSimpleStmt(JinjaParser.JinjaSimpleStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIf(JinjaParser.JinjaIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFor(JinjaParser.JinjaForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(JinjaParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaSet}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSet(JinjaParser.JinjaSetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaWith}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaWith(JinjaParser.JinjaWithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaMacro}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMacro(JinjaParser.JinjaMacroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaCall}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCall(JinjaParser.JinjaCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaFilter}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilter(JinjaParser.JinjaFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaRaw}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaRaw(JinjaParser.JinjaRawContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprList(JinjaParser.JinjaExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpr(JinjaParser.JinjaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaOrExpression(JinjaParser.JinjaOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAndExpression(JinjaParser.JinjaAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(JinjaParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaComparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComparison(JinjaParser.JinjaComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOperator(JinjaParser.EqOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqOperator(JinjaParser.NotEqOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOperator(JinjaParser.LtOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteOperator(JinjaParser.LteOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtOperator(JinjaParser.GtOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteOperator(JinjaParser.GteOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(JinjaParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(JinjaParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAdditive(JinjaParser.JinjaAdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaAdditiveTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaAdditiveTail(JinjaParser.JinjaAdditiveTailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAdditiveOperator(JinjaParser.PlusAdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAdditiveOperator(JinjaParser.MinusAdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TildeAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeAdditiveOperator(JinjaParser.TildeAdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMultiplicative(JinjaParser.JinjaMultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaMultiplicativeTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMultiplicativeTail(JinjaParser.JinjaMultiplicativeTailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarMultiplicativeOperator(JinjaParser.StarMultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlashMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashMultiplicativeOperator(JinjaParser.SlashMultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloorDivMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloorDivMultiplicativeOperator(JinjaParser.FloorDivMultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMultiplicativeOperator(JinjaParser.ModMultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaPower}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPower(JinjaParser.JinjaPowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPrefixExpr(JinjaParser.UnaryPrefixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(JinjaParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaUnaryPrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaUnaryPrefix(JinjaParser.JinjaUnaryPrefixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusUnaryOperator(JinjaParser.PlusUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusUnaryOperator(JinjaParser.MinusUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaPostfix(JinjaParser.JinjaPostfixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAccess(JinjaParser.AttributeAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(JinjaParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterApplication}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterApplication(JinjaParser.FilterApplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPrimary(JinjaParser.IdentifierPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerPrimary(JinjaParser.IntegerPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatPrimary(JinjaParser.FloatPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TruePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruePrimary(JinjaParser.TruePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalsePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalsePrimary(JinjaParser.FalsePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonePrimary(JinjaParser.NonePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenPrimary(JinjaParser.ParenPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPrimary(JinjaParser.ListPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictPrimary(JinjaParser.DictPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaArgumentList(JinjaParser.JinjaArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgument(JinjaParser.KeywordArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaDictEntryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaDictEntryList(JinjaParser.JinjaDictEntryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaDictEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaDictEntry(JinjaParser.JinjaDictEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaSimpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaSimpleStatement(JinjaParser.JinjaSimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExtendsStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtendsStatement(JinjaParser.ExtendsStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IncludeStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeStatement(JinjaParser.IncludeStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(JinjaParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImportStatement(JinjaParser.FromImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaBlockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockStatement(JinjaParser.JinjaBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfStatement(JinjaParser.JinjaIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForStatement(JinjaParser.JinjaForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaForTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForTarget(JinjaParser.JinjaForTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineSetStatement(JinjaParser.InlineSetStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockSetStatement(JinjaParser.BlockSetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaWithStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaWithStatement(JinjaParser.JinjaWithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignedWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignedWithItem(JinjaParser.AssignedWithItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleWithItem(JinjaParser.SimpleWithItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaMacroStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMacroStatement(JinjaParser.JinjaMacroStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaMacroParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaMacroParams(JinjaParser.JinjaMacroParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaCallStatement(JinjaParser.JinjaCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaFilterStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilterStatement(JinjaParser.JinjaFilterStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaRawStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaRawStatement(JinjaParser.JinjaRawStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(JinjaParser.JinjaCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssStylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStylesheet(JinjaParser.CssStylesheetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorRule(JinjaParser.SelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtRule(JinjaParser.AtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssAtRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtRuleBody(JinjaParser.CssAtRuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorPart(JinjaParser.CssSelectorPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentAtom(JinjaParser.CssIdentAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHashAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHashAtom(JinjaParser.CssHashAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringAtom(JinjaParser.CssStringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberAtom(JinjaParser.CssNumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVariableAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariableAtom(JinjaParser.CssVariableAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentAtom(JinjaParser.CssPercentAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBangAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBangAtom(JinjaParser.CssBangAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAtKeywordAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtKeywordAtom(JinjaParser.CssAtKeywordAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyAtom(JinjaParser.MultiplyAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotAtom(JinjaParser.DotAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonAtom(JinjaParser.ColonAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeAtom(JinjaParser.PipeAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterAtom(JinjaParser.GreaterAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAtom(JinjaParser.PlusAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TildeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeAtom(JinjaParser.TildeAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaAtom(JinjaParser.CommaAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallAtom(JinjaParser.FunctionCallAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketGroupAtom(JinjaParser.BracketGroupAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenGroupAtom(JinjaParser.ParenGroupAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentToken(JinjaParser.CssIdentTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberToken(JinjaParser.CssNumberTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringToken(JinjaParser.CssStringTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHashToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHashToken(JinjaParser.CssHashTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVariableToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariableToken(JinjaParser.CssVariableTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentToken(JinjaParser.CssPercentTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBangToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBangToken(JinjaParser.CssBangTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportantToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportantToken(JinjaParser.CssImportantTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssAtKeywordToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssAtKeywordToken(JinjaParser.CssAtKeywordTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallToken(JinjaParser.FunctionCallTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenGroupToken(JinjaParser.ParenGroupTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketGroupToken(JinjaParser.BracketGroupTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BraceGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraceGroupToken(JinjaParser.BraceGroupTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaToken(JinjaParser.CommaTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColonToken(JinjaParser.ColonTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SemiColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemiColonToken(JinjaParser.SemiColonTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusToken(JinjaParser.PlusTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusToken(JinjaParser.MinusTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyToken(JinjaParser.MultiplyTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideToken(JinjaParser.DivideTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToken(JinjaParser.EqualTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotToken(JinjaParser.DotTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeToken(JinjaParser.PipeTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterToken(JinjaParser.GreaterTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TildeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeToken(JinjaParser.TildeTokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclarationList(JinjaParser.CssDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(JinjaParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentCssProperty(JinjaParser.IdentCssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableCssProperty(JinjaParser.VariableCssPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JinjaParser#cssValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValue(JinjaParser.CssValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssIdentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssIdentValue(JinjaParser.CssIdentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssNumberValue(JinjaParser.CssNumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssStringValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssStringValue(JinjaParser.CssStringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssHashValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssHashValue(JinjaParser.CssHashValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssVariableValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssVariableValue(JinjaParser.CssVariableValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssPercentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssPercentValue(JinjaParser.CssPercentValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssImportantValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImportantValue(JinjaParser.CssImportantValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBangValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBangValue(JinjaParser.CssBangValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallValue(JinjaParser.FunctionCallValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenGroupValue(JinjaParser.ParenGroupValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketGroupValue(JinjaParser.BracketGroupValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaValue(JinjaParser.CommaValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusValue(JinjaParser.PlusValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusValue(JinjaParser.MinusValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplyValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyValue(JinjaParser.MultiplyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DivideValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideValue(JinjaParser.DivideValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualValue(JinjaParser.EqualValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotValue(JinjaParser.DotValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeValue(JinjaParser.PipeValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterValue(JinjaParser.GreaterValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TildeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTildeValue(JinjaParser.TildeValueContext ctx);
}