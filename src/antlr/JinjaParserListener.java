// Generated from C:/Users/HP/Desktop/complier flask/Flask Compiler/src/antlr/JinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JinjaParser}.
 */
public interface JinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JinjaParser#templateDocument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateDocument(JinjaParser.TemplateDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#templateDocument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateDocument(JinjaParser.TemplateDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void enterTemplateBody(JinjaParser.TemplateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#templateBody}.
	 * @param ctx the parse tree
	 */
	void exitTemplateBody(JinjaParser.TemplateBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MiscChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void enterMiscChunk(JinjaParser.MiscChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MiscChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void exitMiscChunk(JinjaParser.MiscChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void enterElementChunk(JinjaParser.ElementChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void exitElementChunk(JinjaParser.ElementChunkContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void enterJinjaChunk(JinjaParser.JinjaChunkContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaChunk}
	 * labeled alternative in {@link JinjaParser#templateChunk}.
	 * @param ctx the parse tree
	 */
	void exitJinjaChunk(JinjaParser.JinjaChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(JinjaParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(JinjaParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScriptletValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletValue(JinjaParser.ScriptletValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScriptletValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletValue(JinjaParser.ScriptletValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhitespaceValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterWhitespaceValue(JinjaParser.WhitespaceValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhitespaceValue}
	 * labeled alternative in {@link JinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitWhitespaceValue(JinjaParser.WhitespaceValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(JinjaParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(JinjaParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PairedElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPairedElement(JinjaParser.PairedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PairedElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPairedElement(JinjaParser.PairedElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterScriptletElement(JinjaParser.ScriptletElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ScriptletElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitScriptletElement(JinjaParser.ScriptletElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(JinjaParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleElement}
	 * labeled alternative in {@link JinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(JinjaParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(JinjaParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(JinjaParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChardataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void enterChardataItem(JinjaParser.ChardataItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChardataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void exitChardataItem(JinjaParser.ChardataItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElementItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void enterElementItem(JinjaParser.ElementItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElementItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void exitElementItem(JinjaParser.ElementItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CdataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void enterCdataItem(JinjaParser.CdataItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CdataItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void exitCdataItem(JinjaParser.CdataItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommentItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void enterCommentItem(JinjaParser.CommentItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommentItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void exitCommentItem(JinjaParser.CommentItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateJinjaItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void enterTemplateJinjaItem(JinjaParser.TemplateJinjaItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateJinjaItem}
	 * labeled alternative in {@link JinjaParser#htmlContentItem}.
	 * @param ctx the parse tree
	 */
	void exitTemplateJinjaItem(JinjaParser.TemplateJinjaItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(JinjaParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(JinjaParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedValue(JinjaParser.DoubleQuotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedValue(JinjaParser.DoubleQuotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuotedValue(JinjaParser.SingleQuotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleQuotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuotedValue(JinjaParser.SingleQuotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedValue(JinjaParser.UnquotedValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnquotedValue}
	 * labeled alternative in {@link JinjaParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedValue(JinjaParser.UnquotedValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedText(JinjaParser.DoubleQuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedText(JinjaParser.DoubleQuotedTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuotedText(JinjaParser.SingleQuotedTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleQuotedText}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuotedText(JinjaParser.SingleQuotedTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterDoubleQuotedLbrace(JinjaParser.DoubleQuotedLbraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitDoubleQuotedLbrace(JinjaParser.DoubleQuotedLbraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterSingleQuotedLbrace(JinjaParser.SingleQuotedLbraceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleQuotedLbrace}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitSingleQuotedLbrace(JinjaParser.SingleQuotedLbraceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeJinjaExpression}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void enterAttributeJinjaExpression(JinjaParser.AttributeJinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeJinjaExpression}
	 * labeled alternative in {@link JinjaParser#attributeValueContent}.
	 * @param ctx the parse tree
	 */
	void exitAttributeJinjaExpression(JinjaParser.AttributeJinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTextChardata(JinjaParser.HtmlTextChardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlTextChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTextChardata(JinjaParser.HtmlTextChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeaWsChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterSeaWsChardata(JinjaParser.SeaWsChardataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeaWsChardata}
	 * labeled alternative in {@link JinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitSeaWsChardata(JinjaParser.SeaWsChardataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommentMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterCommentMisc(JinjaParser.CommentMiscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommentMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitCommentMisc(JinjaParser.CommentMiscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChardataMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterChardataMisc(JinjaParser.ChardataMiscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChardataMisc}
	 * labeled alternative in {@link JinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitChardataMisc(JinjaParser.ChardataMiscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterRegularHtmlComment(JinjaParser.RegularHtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitRegularHtmlComment(JinjaParser.RegularHtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterConditionalHtmlComment(JinjaParser.ConditionalHtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalHtmlComment}
	 * labeled alternative in {@link JinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitConditionalHtmlComment(JinjaParser.ConditionalHtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExpressionNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpressionNode(JinjaParser.JinjaExpressionNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExpressionNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpressionNode(JinjaParser.JinjaExpressionNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCommentNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCommentNode(JinjaParser.JinjaCommentNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCommentNode}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCommentNode(JinjaParser.JinjaCommentNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSimpleStmt}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSimpleStmt(JinjaParser.JinjaSimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSimpleStmt}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSimpleStmt(JinjaParser.JinjaSimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIf(JinjaParser.JinjaIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIf}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIf(JinjaParser.JinjaIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFor(JinjaParser.JinjaForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFor}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFor(JinjaParser.JinjaForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(JinjaParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaBlock}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(JinjaParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaSet}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSet(JinjaParser.JinjaSetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaSet}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSet(JinjaParser.JinjaSetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaWith}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaWith(JinjaParser.JinjaWithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaWith}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaWith(JinjaParser.JinjaWithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaMacro}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMacro(JinjaParser.JinjaMacroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaMacro}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMacro(JinjaParser.JinjaMacroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaCall}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCall(JinjaParser.JinjaCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaCall}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCall(JinjaParser.JinjaCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaFilter}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilter(JinjaParser.JinjaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaFilter}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilter(JinjaParser.JinjaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaRaw}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void enterJinjaRaw(JinjaParser.JinjaRawContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaRaw}
	 * labeled alternative in {@link JinjaParser#templateJinja}.
	 * @param ctx the parse tree
	 */
	void exitJinjaRaw(JinjaParser.JinjaRawContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(JinjaParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaExprList}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprList(JinjaParser.JinjaExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaExprList}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprList(JinjaParser.JinjaExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpr(JinjaParser.JinjaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpr(JinjaParser.JinjaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaOrExpression(JinjaParser.JinjaOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaOrExpression(JinjaParser.JinjaOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAndExpression(JinjaParser.JinjaAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAndExpression(JinjaParser.JinjaAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(JinjaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(JinjaParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonExpression}
	 * labeled alternative in {@link JinjaParser#jinjaNotExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(JinjaParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaComparison}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComparison(JinjaParser.JinjaComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaComparison}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComparison(JinjaParser.JinjaComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterEqOperator(JinjaParser.EqOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitEqOperator(JinjaParser.EqOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotEqOperator(JinjaParser.NotEqOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotEqOperator(JinjaParser.NotEqOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterLtOperator(JinjaParser.LtOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitLtOperator(JinjaParser.LtOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterLteOperator(JinjaParser.LteOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitLteOperator(JinjaParser.LteOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterGtOperator(JinjaParser.GtOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GtOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitGtOperator(JinjaParser.GtOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterGteOperator(JinjaParser.GteOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GteOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitGteOperator(JinjaParser.GteOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterInOperator(JinjaParser.InOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitInOperator(JinjaParser.InOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterIsOperator(JinjaParser.IsOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsOperator}
	 * labeled alternative in {@link JinjaParser#jinjaComparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitIsOperator(JinjaParser.IsOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAdditive(JinjaParser.JinjaAdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaAdditive}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAdditive(JinjaParser.JinjaAdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaAdditiveTail}.
	 * @param ctx the parse tree
	 */
	void enterJinjaAdditiveTail(JinjaParser.JinjaAdditiveTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaAdditiveTail}.
	 * @param ctx the parse tree
	 */
	void exitJinjaAdditiveTail(JinjaParser.JinjaAdditiveTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusAdditiveOperator(JinjaParser.PlusAdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusAdditiveOperator(JinjaParser.PlusAdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusAdditiveOperator(JinjaParser.MinusAdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusAdditiveOperator(JinjaParser.MinusAdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TildeAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterTildeAdditiveOperator(JinjaParser.TildeAdditiveOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TildeAdditiveOperator}
	 * labeled alternative in {@link JinjaParser#jinjaAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitTildeAdditiveOperator(JinjaParser.TildeAdditiveOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMultiplicative(JinjaParser.JinjaMultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaMultiplicative}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMultiplicative(JinjaParser.JinjaMultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaMultiplicativeTail}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMultiplicativeTail(JinjaParser.JinjaMultiplicativeTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaMultiplicativeTail}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMultiplicativeTail(JinjaParser.JinjaMultiplicativeTailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterStarMultiplicativeOperator(JinjaParser.StarMultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitStarMultiplicativeOperator(JinjaParser.StarMultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlashMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterSlashMultiplicativeOperator(JinjaParser.SlashMultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlashMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitSlashMultiplicativeOperator(JinjaParser.SlashMultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloorDivMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterFloorDivMultiplicativeOperator(JinjaParser.FloorDivMultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloorDivMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitFloorDivMultiplicativeOperator(JinjaParser.FloorDivMultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterModMultiplicativeOperator(JinjaParser.ModMultiplicativeOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMultiplicativeOperator}
	 * labeled alternative in {@link JinjaParser#jinjaMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitModMultiplicativeOperator(JinjaParser.ModMultiplicativeOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaPower}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPower(JinjaParser.JinjaPowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaPower}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPower(JinjaParser.JinjaPowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPrefixExpr(JinjaParser.UnaryPrefixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPrefixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPrefixExpr(JinjaParser.UnaryPrefixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(JinjaParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostfixExpr}
	 * labeled alternative in {@link JinjaParser#jinjaUnary}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(JinjaParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaUnaryPrefix}.
	 * @param ctx the parse tree
	 */
	void enterJinjaUnaryPrefix(JinjaParser.JinjaUnaryPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaUnaryPrefix}.
	 * @param ctx the parse tree
	 */
	void exitJinjaUnaryPrefix(JinjaParser.JinjaUnaryPrefixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusUnaryOperator(JinjaParser.PlusUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusUnaryOperator(JinjaParser.PlusUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterMinusUnaryOperator(JinjaParser.MinusUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusUnaryOperator}
	 * labeled alternative in {@link JinjaParser#jinjaUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitMinusUnaryOperator(JinjaParser.MinusUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 */
	void enterJinjaPostfix(JinjaParser.JinjaPostfixContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaPostfix}.
	 * @param ctx the parse tree
	 */
	void exitJinjaPostfix(JinjaParser.JinjaPostfixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAccess(JinjaParser.AttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAccess(JinjaParser.AttributeAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(JinjaParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subscript}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(JinjaParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JinjaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterApplication}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void enterFilterApplication(JinjaParser.FilterApplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterApplication}
	 * labeled alternative in {@link JinjaParser#jinjaPostfixPart}.
	 * @param ctx the parse tree
	 */
	void exitFilterApplication(JinjaParser.FilterApplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrimary(JinjaParser.IdentifierPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrimary(JinjaParser.IdentifierPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitStringPrimary(JinjaParser.StringPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterIntegerPrimary(JinjaParser.IntegerPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitIntegerPrimary(JinjaParser.IntegerPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFloatPrimary(JinjaParser.FloatPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFloatPrimary(JinjaParser.FloatPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TruePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTruePrimary(JinjaParser.TruePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TruePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTruePrimary(JinjaParser.TruePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalsePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFalsePrimary(JinjaParser.FalsePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalsePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFalsePrimary(JinjaParser.FalsePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterNonePrimary(JinjaParser.NonePrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonePrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitNonePrimary(JinjaParser.NonePrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterParenPrimary(JinjaParser.ParenPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitParenPrimary(JinjaParser.ParenPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterListPrimary(JinjaParser.ListPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitListPrimary(JinjaParser.ListPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void enterDictPrimary(JinjaParser.DictPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictPrimary}
	 * labeled alternative in {@link JinjaParser#jinjaPrimary}.
	 * @param ctx the parse tree
	 */
	void exitDictPrimary(JinjaParser.DictPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterJinjaArgumentList(JinjaParser.JinjaArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitJinjaArgumentList(JinjaParser.JinjaArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgument(JinjaParser.KeywordArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgument(JinjaParser.KeywordArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArgument}
	 * labeled alternative in {@link JinjaParser#jinjaArgument}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgument(JinjaParser.PositionalArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaDictEntryList}.
	 * @param ctx the parse tree
	 */
	void enterJinjaDictEntryList(JinjaParser.JinjaDictEntryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaDictEntryList}.
	 * @param ctx the parse tree
	 */
	void exitJinjaDictEntryList(JinjaParser.JinjaDictEntryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaDictEntry}.
	 * @param ctx the parse tree
	 */
	void enterJinjaDictEntry(JinjaParser.JinjaDictEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaDictEntry}.
	 * @param ctx the parse tree
	 */
	void exitJinjaDictEntry(JinjaParser.JinjaDictEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaSimpleStatement(JinjaParser.JinjaSimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaSimpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaSimpleStatement(JinjaParser.JinjaSimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExtendsStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void enterExtendsStatement(JinjaParser.ExtendsStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExtendsStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void exitExtendsStatement(JinjaParser.ExtendsStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncludeStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(JinjaParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncludeStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(JinjaParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JinjaParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JinjaParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void enterFromImportStatement(JinjaParser.FromImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FromImportStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSimpleStatementInner}.
	 * @param ctx the parse tree
	 */
	void exitFromImportStatement(JinjaParser.FromImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaBlockStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockStatement(JinjaParser.JinjaBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaBlockStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockStatement(JinjaParser.JinjaBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfStatement(JinjaParser.JinjaIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfStatement(JinjaParser.JinjaIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForStatement(JinjaParser.JinjaForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaForStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForStatement(JinjaParser.JinjaForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaForTarget}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForTarget(JinjaParser.JinjaForTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaForTarget}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForTarget(JinjaParser.JinjaForTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 */
	void enterInlineSetStatement(JinjaParser.InlineSetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 */
	void exitInlineSetStatement(JinjaParser.InlineSetStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockSetStatement(JinjaParser.BlockSetStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockSetStatement}
	 * labeled alternative in {@link JinjaParser#jinjaSetStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockSetStatement(JinjaParser.BlockSetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaWithStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaWithStatement(JinjaParser.JinjaWithStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaWithStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaWithStatement(JinjaParser.JinjaWithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignedWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 */
	void enterAssignedWithItem(JinjaParser.AssignedWithItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignedWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 */
	void exitAssignedWithItem(JinjaParser.AssignedWithItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 */
	void enterSimpleWithItem(JinjaParser.SimpleWithItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleWithItem}
	 * labeled alternative in {@link JinjaParser#jinjaWithItem}.
	 * @param ctx the parse tree
	 */
	void exitSimpleWithItem(JinjaParser.SimpleWithItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaMacroStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMacroStatement(JinjaParser.JinjaMacroStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaMacroStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMacroStatement(JinjaParser.JinjaMacroStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaMacroParams}.
	 * @param ctx the parse tree
	 */
	void enterJinjaMacroParams(JinjaParser.JinjaMacroParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaMacroParams}.
	 * @param ctx the parse tree
	 */
	void exitJinjaMacroParams(JinjaParser.JinjaMacroParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaCallStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaCallStatement(JinjaParser.JinjaCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaCallStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaCallStatement(JinjaParser.JinjaCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaFilterStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilterStatement(JinjaParser.JinjaFilterStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaFilterStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilterStatement(JinjaParser.JinjaFilterStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaRawStatement}.
	 * @param ctx the parse tree
	 */
	void enterJinjaRawStatement(JinjaParser.JinjaRawStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaRawStatement}.
	 * @param ctx the parse tree
	 */
	void exitJinjaRawStatement(JinjaParser.JinjaRawStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(JinjaParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(JinjaParser.JinjaCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void enterCssStylesheet(JinjaParser.CssStylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssStylesheet}.
	 * @param ctx the parse tree
	 */
	void exitCssStylesheet(JinjaParser.CssStylesheetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 */
	void enterSelectorRule(JinjaParser.SelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 */
	void exitSelectorRule(JinjaParser.SelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(JinjaParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtRule}
	 * labeled alternative in {@link JinjaParser#cssRuleSet}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(JinjaParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssAtRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterCssAtRuleBody(JinjaParser.CssAtRuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssAtRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitCssAtRuleBody(JinjaParser.CssAtRuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorPart(JinjaParser.CssSelectorPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssSelectorPart}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorPart(JinjaParser.CssSelectorPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentAtom(JinjaParser.CssIdentAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentAtom(JinjaParser.CssIdentAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHashAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssHashAtom(JinjaParser.CssHashAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHashAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssHashAtom(JinjaParser.CssHashAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStringAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssStringAtom(JinjaParser.CssStringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStringAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssStringAtom(JinjaParser.CssStringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberAtom(JinjaParser.CssNumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberAtom(JinjaParser.CssNumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVariableAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssVariableAtom(JinjaParser.CssVariableAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVariableAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssVariableAtom(JinjaParser.CssVariableAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentAtom(JinjaParser.CssPercentAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentAtom(JinjaParser.CssPercentAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBangAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssBangAtom(JinjaParser.CssBangAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBangAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssBangAtom(JinjaParser.CssBangAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAtKeywordAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCssAtKeywordAtom(JinjaParser.CssAtKeywordAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAtKeywordAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCssAtKeywordAtom(JinjaParser.CssAtKeywordAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyAtom(JinjaParser.MultiplyAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyAtom(JinjaParser.MultiplyAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterDotAtom(JinjaParser.DotAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitDotAtom(JinjaParser.DotAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColonAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterColonAtom(JinjaParser.ColonAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColonAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitColonAtom(JinjaParser.ColonAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterPipeAtom(JinjaParser.PipeAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitPipeAtom(JinjaParser.PipeAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterGreaterAtom(JinjaParser.GreaterAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitGreaterAtom(JinjaParser.GreaterAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterPlusAtom(JinjaParser.PlusAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitPlusAtom(JinjaParser.PlusAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TildeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterTildeAtom(JinjaParser.TildeAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TildeAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitTildeAtom(JinjaParser.TildeAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterCommaAtom(JinjaParser.CommaAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitCommaAtom(JinjaParser.CommaAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallAtom(JinjaParser.FunctionCallAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallAtom(JinjaParser.FunctionCallAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterBracketGroupAtom(JinjaParser.BracketGroupAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitBracketGroupAtom(JinjaParser.BracketGroupAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void enterParenGroupAtom(JinjaParser.ParenGroupAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenGroupAtom}
	 * labeled alternative in {@link JinjaParser#cssSelectorAtom}.
	 * @param ctx the parse tree
	 */
	void exitParenGroupAtom(JinjaParser.ParenGroupAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentToken(JinjaParser.CssIdentTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentToken(JinjaParser.CssIdentTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberToken(JinjaParser.CssNumberTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberToken(JinjaParser.CssNumberTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStringToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssStringToken(JinjaParser.CssStringTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStringToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssStringToken(JinjaParser.CssStringTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHashToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssHashToken(JinjaParser.CssHashTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHashToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssHashToken(JinjaParser.CssHashTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVariableToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssVariableToken(JinjaParser.CssVariableTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVariableToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssVariableToken(JinjaParser.CssVariableTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentToken(JinjaParser.CssPercentTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentToken(JinjaParser.CssPercentTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBangToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssBangToken(JinjaParser.CssBangTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBangToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssBangToken(JinjaParser.CssBangTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportantToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssImportantToken(JinjaParser.CssImportantTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportantToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssImportantToken(JinjaParser.CssImportantTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssAtKeywordToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCssAtKeywordToken(JinjaParser.CssAtKeywordTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssAtKeywordToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCssAtKeywordToken(JinjaParser.CssAtKeywordTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallToken(JinjaParser.FunctionCallTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallToken(JinjaParser.FunctionCallTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterParenGroupToken(JinjaParser.ParenGroupTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitParenGroupToken(JinjaParser.ParenGroupTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterBracketGroupToken(JinjaParser.BracketGroupTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitBracketGroupToken(JinjaParser.BracketGroupTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BraceGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterBraceGroupToken(JinjaParser.BraceGroupTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BraceGroupToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitBraceGroupToken(JinjaParser.BraceGroupTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterCommaToken(JinjaParser.CommaTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitCommaToken(JinjaParser.CommaTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterColonToken(JinjaParser.ColonTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitColonToken(JinjaParser.ColonTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SemiColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterSemiColonToken(JinjaParser.SemiColonTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SemiColonToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitSemiColonToken(JinjaParser.SemiColonTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterPlusToken(JinjaParser.PlusTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitPlusToken(JinjaParser.PlusTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterMinusToken(JinjaParser.MinusTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitMinusToken(JinjaParser.MinusTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyToken(JinjaParser.MultiplyTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyToken(JinjaParser.MultiplyTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterDivideToken(JinjaParser.DivideTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitDivideToken(JinjaParser.DivideTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterEqualToken(JinjaParser.EqualTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitEqualToken(JinjaParser.EqualTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterDotToken(JinjaParser.DotTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitDotToken(JinjaParser.DotTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterPipeToken(JinjaParser.PipeTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitPipeToken(JinjaParser.PipeTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterGreaterToken(JinjaParser.GreaterTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitGreaterToken(JinjaParser.GreaterTokenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TildeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void enterTildeToken(JinjaParser.TildeTokenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TildeToken}
	 * labeled alternative in {@link JinjaParser#cssAnyToken}.
	 * @param ctx the parse tree
	 */
	void exitTildeToken(JinjaParser.TildeTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclarationList(JinjaParser.CssDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclarationList(JinjaParser.CssDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(JinjaParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(JinjaParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterIdentCssProperty(JinjaParser.IdentCssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitIdentCssProperty(JinjaParser.IdentCssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void enterVariableCssProperty(JinjaParser.VariableCssPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableCssProperty}
	 * labeled alternative in {@link JinjaParser#cssProperty}.
	 * @param ctx the parse tree
	 */
	void exitVariableCssProperty(JinjaParser.VariableCssPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JinjaParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void enterCssValue(JinjaParser.CssValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JinjaParser#cssValue}.
	 * @param ctx the parse tree
	 */
	void exitCssValue(JinjaParser.CssValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssIdentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssIdentValue(JinjaParser.CssIdentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssIdentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssIdentValue(JinjaParser.CssIdentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssNumberValue(JinjaParser.CssNumberValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssNumberValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssNumberValue(JinjaParser.CssNumberValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssStringValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssStringValue(JinjaParser.CssStringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssStringValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssStringValue(JinjaParser.CssStringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssHashValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssHashValue(JinjaParser.CssHashValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssHashValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssHashValue(JinjaParser.CssHashValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssVariableValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssVariableValue(JinjaParser.CssVariableValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssVariableValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssVariableValue(JinjaParser.CssVariableValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssPercentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssPercentValue(JinjaParser.CssPercentValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssPercentValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssPercentValue(JinjaParser.CssPercentValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssImportantValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssImportantValue(JinjaParser.CssImportantValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssImportantValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssImportantValue(JinjaParser.CssImportantValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBangValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCssBangValue(JinjaParser.CssBangValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBangValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCssBangValue(JinjaParser.CssBangValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallValue(JinjaParser.FunctionCallValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallValue(JinjaParser.FunctionCallValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterParenGroupValue(JinjaParser.ParenGroupValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitParenGroupValue(JinjaParser.ParenGroupValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterBracketGroupValue(JinjaParser.BracketGroupValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketGroupValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitBracketGroupValue(JinjaParser.BracketGroupValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterCommaValue(JinjaParser.CommaValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitCommaValue(JinjaParser.CommaValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterPlusValue(JinjaParser.PlusValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitPlusValue(JinjaParser.PlusValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterMinusValue(JinjaParser.MinusValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitMinusValue(JinjaParser.MinusValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplyValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyValue(JinjaParser.MultiplyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplyValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyValue(JinjaParser.MultiplyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivideValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterDivideValue(JinjaParser.DivideValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivideValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitDivideValue(JinjaParser.DivideValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterEqualValue(JinjaParser.EqualValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitEqualValue(JinjaParser.EqualValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DotValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterDotValue(JinjaParser.DotValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DotValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitDotValue(JinjaParser.DotValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterPipeValue(JinjaParser.PipeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitPipeValue(JinjaParser.PipeValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterGreaterValue(JinjaParser.GreaterValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitGreaterValue(JinjaParser.GreaterValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TildeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void enterTildeValue(JinjaParser.TildeValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TildeValue}
	 * labeled alternative in {@link JinjaParser#cssValuePart}.
	 * @param ctx the parse tree
	 */
	void exitTildeValue(JinjaParser.TildeValueContext ctx);
}