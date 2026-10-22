$root = "C:\Users\Mohammed Shadi\IdeaProjects\Flask Compiler\src\AST\Jinja"
New-Item -ItemType Directory -Force -Path $root | Out-Null
$utf8 = New-Object System.Text.UTF8Encoding($false)
function W([string]$n, [string]$b) { [System.IO.File]::WriteAllText((Join-Path $root $n), $b, $utf8) }

function Gen($name, $parent, $kind, $fieldsRaw) {
    if ($kind -eq 'A') {
        W "$name.java" "package AST.Jinja;`r`npublic abstract class $name {`r`n}`r`n"
        return
    }
    $fields = if ($fieldsRaw) { $fieldsRaw -split '\|' } else { @() }
    $decls = @(); $params = @(); $assigns = @(); $accessors = @()
    foreach ($f in $fields) {
        if (-not $f.Trim()) { continue }
        $f = $f.Trim()
        $sp = $f.IndexOf(' ')
        $ftype = $f.Substring(0, $sp)
        $fname = $f.Substring($sp + 1)
        $decls += "    public $ftype $fname;"
        $params += "$ftype $fname"
        $assigns += "        this.$fname = $fname;"
        $cap = $fname.Substring(0,1).ToUpper() + $fname.Substring(1)
        $accessors += "    public $ftype get$cap() { return $fname; }"
        $accessors += "    public void set$cap($ftype $fname) { this.$fname = $fname; }"
    }
    $ext = if ($parent) { " extends $parent" } else { "" }
    $ctorArgs = if ($params.Count -gt 0) { ", " + ($params -join ', ') } else { "" }
    $sb = New-Object System.Text.StringBuilder
    [void]$sb.AppendLine("package AST.Jinja;")
    [void]$sb.AppendLine("import java.lang.String;")
    [void]$sb.AppendLine("import java.util.List;")
    [void]$sb.AppendLine("public class $name$ext {")
    [void]$sb.AppendLine("    public String nodeName;")
    [void]$sb.AppendLine("    public int lineNumber;")
    $decls | ForEach-Object { [void]$sb.AppendLine($_) }
    [void]$sb.AppendLine("    public $name() {")
    [void]$sb.AppendLine("    }")
    [void]$sb.AppendLine("    public $name(String nodeName, int lineNumber$ctorArgs) {")
    [void]$sb.AppendLine("        this.nodeName = nodeName;")
    [void]$sb.AppendLine("        this.lineNumber = lineNumber;")
    $assigns | ForEach-Object { [void]$sb.AppendLine($_) }
    [void]$sb.AppendLine("    }")
    [void]$sb.AppendLine("    public String getNodeName() { return nodeName; }")
    [void]$sb.AppendLine("    public void setNodeName(String nodeName) { this.nodeName = nodeName; }")
    [void]$sb.AppendLine("    public int getLineNumber() { return lineNumber; }")
    [void]$sb.AppendLine("    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }")
    $accessors | ForEach-Object { [void]$sb.AppendLine($_) }
    [void]$sb.AppendLine("    @Override")
    [void]$sb.AppendLine('    public String toString() { return ""; }')
    [void]$sb.AppendLine("}")
    W "$name.java" $sb.ToString()
}

# =============== TOP LEVEL ===============
Gen "TemplateDocument" "" "C" "TemplateBody body|String eof"
Gen "TemplateBody" "" "C" "List<TemplateChunk> chunks"
Gen "TemplateChunk" "" "A" ""
Gen "MiscChunk" "TemplateChunk" "C" "HtmlMisc htmlMisc"
Gen "ElementChunk" "TemplateChunk" "C" "HtmlElement htmlElement"
Gen "JinjaChunk" "TemplateChunk" "C" "TemplateJinja templateJinja"

# =============== HTML ===============
Gen "HtmlDocument" "" "C" "List<ScriptletOrSeaWs> scriptletOrSeaWs1|String xmlDeclaration|List<ScriptletOrSeaWs> scriptletOrSeaWs2|String dtd|List<ScriptletOrSeaWs> scriptletOrSeaWs3|List<HtmlElements> htmlElements"
Gen "ScriptletOrSeaWs" "" "A" ""
Gen "ScriptletValue" "ScriptletOrSeaWs" "C" "String scriptlet"
Gen "WhitespaceValue" "ScriptletOrSeaWs" "C" "String seaWs"
Gen "HtmlElements" "" "C" "List<HtmlMisc> htmlMisc1|HtmlElement htmlElement|List<HtmlMisc> htmlMisc2"
Gen "HtmlElement" "" "A" ""
Gen "PairedElement" "HtmlElement" "C" "String tagOpen|String tagName|List<HtmlAttribute> attributes|String tagClose|HtmlContent content|String tagOpen2|String tagSlash|String closeName|String tagClose2|String tagSlashClose"
Gen "ScriptletElement" "HtmlElement" "C" "String scriptlet"
Gen "StyleElement" "HtmlElement" "C" "String styleOpen|CssStylesheet stylesheet|String cssEnd"
Gen "HtmlContent" "" "C" "List<HtmlContentItem> htmlContentItem"
Gen "HtmlContentItem" "" "A" ""
Gen "ChardataItem" "HtmlContentItem" "C" "HtmlChardata htmlChardata"
Gen "ElementItem" "HtmlContentItem" "C" "HtmlElement htmlElement"
Gen "CdataItem" "HtmlContentItem" "C" "String cdata"
Gen "CommentItem" "HtmlContentItem" "C" "HtmlComment htmlComment"
Gen "TemplateJinjaItem" "HtmlContentItem" "C" "TemplateJinja templateJinja"
Gen "HtmlAttribute" "" "C" "String name|String tagEquals|AttributeValue value"
Gen "AttributeValue" "" "A" ""
Gen "DoubleQuotedValue" "AttributeValue" "C" "String attvalueOpenDq|List<AttributeValueContent> attributeValueContent|String attvalueDqClose"
Gen "SingleQuotedValue" "AttributeValue" "C" "String attvalueOpenSq|List<AttributeValueContent> attributeValueContent|String attvalueSqClose"
Gen "UnquotedValue" "AttributeValue" "C" "String attvalueUnquoted"
Gen "AttributeValueContent" "" "A" ""
Gen "DoubleQuotedText" "AttributeValueContent" "C" "String attvalueDqText"
Gen "SingleQuotedText" "AttributeValueContent" "C" "String attvalueSqText"
Gen "DoubleQuotedLbrace" "AttributeValueContent" "C" "String attvalueDqLbrace"
Gen "SingleQuotedLbrace" "AttributeValueContent" "C" "String attvalueSqLbrace"
Gen "AttributeJinjaExpression" "AttributeValueContent" "C" "JinjaExpression jinjaExpression"
Gen "HtmlChardata" "" "A" ""
Gen "HtmlTextChardata" "HtmlChardata" "C" "String htmlText"
Gen "SeaWsChardata" "HtmlChardata" "C" "String seaWs"
Gen "HtmlMisc" "" "A" ""
Gen "CommentMisc" "HtmlMisc" "C" "HtmlComment htmlComment"
Gen "ChardataMisc" "HtmlMisc" "C" "HtmlChardata htmlChardata"
Gen "HtmlComment" "" "A" ""
Gen "RegularHtmlComment" "HtmlComment" "C" "String htmlComment"
Gen "ConditionalHtmlComment" "HtmlComment" "C" "String htmlConditionalComment"

# =============== JINJA dispatcher ===============
Gen "TemplateJinja" "" "A" ""
Gen "JinjaExpressionNode" "TemplateJinja" "C" "JinjaExpression jinjaExpression"
Gen "JinjaCommentNode" "TemplateJinja" "C" "JinjaComment jinjaComment"
Gen "JinjaSimpleStmt" "TemplateJinja" "C" "JinjaSimpleStatement jinjaSimpleStatement"
Gen "JinjaIf" "TemplateJinja" "C" "JinjaIfStatement jinjaIfStatement"
Gen "JinjaFor" "TemplateJinja" "C" "JinjaForStatement jinjaForStatement"
Gen "JinjaBlock" "TemplateJinja" "C" "JinjaBlockStatement jinjaBlockStatement"
Gen "JinjaSet" "TemplateJinja" "C" "JinjaSetStatement jinjaSetStatement"
Gen "JinjaWith" "TemplateJinja" "C" "JinjaWithStatement jinjaWithStatement"
Gen "JinjaMacro" "TemplateJinja" "C" "JinjaMacroStatement jinjaMacroStatement"
Gen "JinjaCall" "TemplateJinja" "C" "JinjaCallStatement jinjaCallStatement"
Gen "JinjaFilter" "TemplateJinja" "C" "JinjaFilterStatement jinjaFilterStatement"
Gen "JinjaRaw" "TemplateJinja" "C" "JinjaRawStatement jinjaRawStatement"

# =============== JINJA EXPRESSIONS ===============
Gen "JinjaExpression" "" "C" "String jinjaExprOpen|JinjaExprList exprs|String jinjaExprClose"
Gen "JinjaExprList" "" "C" "List<JinjaExpr> items"
Gen "JinjaExpr" "" "C" "JinjaOrExpression trueExpr|String jinjaIf|JinjaOrExpression condition|String jinjaElse|JinjaExpr falseExpr"
Gen "JinjaOrExpression" "" "C" "JinjaAndExpression first|List<JinjaAndExpression> operands"
Gen "JinjaAndExpression" "" "C" "JinjaNotExpression first|List<JinjaNotExpression> operands"
Gen "JinjaNotExpression" "" "A" ""
Gen "NotExpression" "JinjaNotExpression" "C" "String jinjaNot|JinjaNotExpression jinjaNotExpression"
Gen "ComparisonExpression" "JinjaNotExpression" "C" "JinjaComparison jinjaComparison"
Gen "JinjaComparison" "" "C" "JinjaAdditive first|List<JinjaComparisonOperator> operators|List<JinjaAdditive> operands"
Gen "JinjaComparisonOperator" "" "A" ""
Gen "EqOperator" "JinjaComparisonOperator" "C" "String jinjaEq"
Gen "NotEqOperator" "JinjaComparisonOperator" "C" "String jinjaNeq"
Gen "LtOperator" "JinjaComparisonOperator" "C" "String jinjaLt"
Gen "LteOperator" "JinjaComparisonOperator" "C" "String jinjaLte"
Gen "GtOperator" "JinjaComparisonOperator" "C" "String jinjaGt"
Gen "GteOperator" "JinjaComparisonOperator" "C" "String jinjaGte"
Gen "InOperator" "JinjaComparisonOperator" "C" "String jinjaIn"
Gen "IsOperator" "JinjaComparisonOperator" "C" "String jinjaIs"
Gen "JinjaAdditive" "" "C" "JinjaMultiplicative jinjaMultiplicative|List<JinjaAdditiveTail> jinjaAdditiveTail"
Gen "JinjaAdditiveTail" "" "C" "JinjaAdditiveOperator jinjaAdditiveOperator|JinjaMultiplicative jinjaMultiplicative"
Gen "JinjaAdditiveOperator" "" "A" ""
Gen "PlusAdditiveOperator" "JinjaAdditiveOperator" "C" "String jinjaPlus"
Gen "MinusAdditiveOperator" "JinjaAdditiveOperator" "C" "String jinjaMinus"
Gen "TildeAdditiveOperator" "JinjaAdditiveOperator" "C" "String jinjaTilde"
Gen "JinjaMultiplicative" "" "C" "JinjaPower jinjaPower|List<JinjaMultiplicativeTail> jinjaMultiplicativeTail"
Gen "JinjaMultiplicativeTail" "" "C" "JinjaMultiplicativeOperator jinjaMultiplicativeOperator|JinjaPower jinjaPower"
Gen "JinjaMultiplicativeOperator" "" "A" ""
Gen "StarMultiplicativeOperator" "JinjaMultiplicativeOperator" "C" "String jinjaStar"
Gen "SlashMultiplicativeOperator" "JinjaMultiplicativeOperator" "C" "String jinjaSlash"
Gen "FloorDivMultiplicativeOperator" "JinjaMultiplicativeOperator" "C" "String jinjaFloorDiv"
Gen "ModMultiplicativeOperator" "JinjaMultiplicativeOperator" "C" "String jinjaMod"
Gen "JinjaPower" "" "C" "JinjaUnary base|List<JinjaUnary> exponents"
Gen "JinjaUnary" "" "A" ""
Gen "UnaryPrefixExpr" "JinjaUnary" "C" "JinjaUnaryPrefix jinjaUnaryPrefix"
Gen "PostfixExpr" "JinjaUnary" "C" "JinjaPostfix jinjaPostfix"
Gen "JinjaUnaryPrefix" "" "C" "JinjaUnaryOperator jinjaUnaryOperator|JinjaUnary jinjaUnary"
Gen "JinjaUnaryOperator" "" "A" ""
Gen "PlusUnaryOperator" "JinjaUnaryOperator" "C" "String jinjaPlus"
Gen "MinusUnaryOperator" "JinjaUnaryOperator" "C" "String jinjaMinus"
Gen "JinjaPostfix" "" "C" "JinjaPrimary base|List<JinjaPostfixPart> parts"
Gen "JinjaPostfixPart" "" "A" ""
Gen "AttributeAccess" "JinjaPostfixPart" "C" "String jinjaDot|String jinjaIdentifier"
Gen "Subscript" "JinjaPostfixPart" "C" "String jinjaLbrack|JinjaExpr jinjaExpr|String jinjaRbrack"
Gen "FunctionCall" "JinjaPostfixPart" "C" "String jinjaLparen|JinjaArgumentList jinjaArgumentList|String jinjaRparen"
Gen "FilterApplication" "JinjaPostfixPart" "C" "String jinjaPipe|String jinjaIdentifier|String jinjaLparen|JinjaArgumentList jinjaArgumentList|String jinjaRparen"
Gen "JinjaPrimary" "" "A" ""
Gen "IdentifierPrimary" "JinjaPrimary" "C" "String jinjaIdentifier"
Gen "StringPrimary" "JinjaPrimary" "C" "String jinjaString"
Gen "IntegerPrimary" "JinjaPrimary" "C" "String jinjaInteger"
Gen "FloatPrimary" "JinjaPrimary" "C" "String jinjaFloat"
Gen "TruePrimary" "JinjaPrimary" "C" "String jinjaTrue"
Gen "FalsePrimary" "JinjaPrimary" "C" "String jinjaFalse"
Gen "NonePrimary" "JinjaPrimary" "C" "String jinjaNone"
Gen "ParenPrimary" "JinjaPrimary" "C" "String jinjaLparen|JinjaExpr jinjaExpr|String jinjaRparen"
Gen "ListPrimary" "JinjaPrimary" "C" "String jinjaLbrack|JinjaExprList jinjaExprList|String jinjaRbrack"
Gen "DictPrimary" "JinjaPrimary" "C" "String jinjaLbrace|JinjaDictEntryList jinjaDictEntryList|String jinjaRbrace"
Gen "JinjaArgumentList" "" "C" "List<JinjaArgument> items"
Gen "JinjaArgument" "" "A" ""
Gen "KeywordArgument" "JinjaArgument" "C" "String key|String jinjaAssign|JinjaExpr value"
Gen "PositionalArgument" "JinjaArgument" "C" "JinjaExpr jinjaExpr"
Gen "JinjaDictEntryList" "" "C" "List<JinjaDictEntry> items"
Gen "JinjaDictEntry" "" "C" "JinjaExpr key|String jinjaColon|JinjaExpr value"

# =============== JINJA STATEMENTS ===============
Gen "JinjaSimpleStatement" "" "C" "String jinjaStmtOpen|JinjaSimpleStatementInner jinjaSimpleStatementInner|String jinjaStmtClose"
Gen "JinjaSimpleStatementInner" "" "A" ""
Gen "ExtendsStatement" "JinjaSimpleStatementInner" "C" "String jinjaStmtExtends|String module"
Gen "IncludeStatement" "JinjaSimpleStatementInner" "C" "String jinjaStmtInclude|String jinjaString|String jinjaIdentifier"
Gen "ImportStatement" "JinjaSimpleStatementInner" "C" "String jinjaStmtImport|String module|String jinjaStmtAs|String alias"
Gen "FromImportStatement" "JinjaSimpleStatementInner" "C" "String jinjaStmtFrom|String module|String jinjaStmtImport|List<String> importedNames"
Gen "JinjaBlockStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtBlock|String blockName|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndblock|String closeName|String jinjaStmtClose2"
Gen "JinjaIfStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtIf|JinjaExpr ifCondition|String jinjaStmtClose|TemplateBody ifBody|List<JinjaExpr> elifConditions|List<TemplateBody> elifBodies|TemplateBody elseBody|String jinjaStmtOpen2|String jinjaStmtEndif|String jinjaStmtClose2"
Gen "JinjaForStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtFor|JinjaForTarget target|String jinjaIn|JinjaExprList iterable|String jinjaStmtRecursive|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtElse|String jinjaStmtClose2|TemplateBody elseBody|String jinjaStmtOpen3|String jinjaStmtEndfor|String jinjaStmtClose3"
Gen "JinjaForTarget" "" "C" "List<JinjaExpr> items"
Gen "JinjaSetStatement" "" "A" ""
Gen "InlineSetStatement" "JinjaSetStatement" "C" "String jinjaStmtOpen|String jinjaStmtSet|String name|String jinjaAssign|JinjaExpr value|String jinjaStmtClose"
Gen "BlockSetStatement" "JinjaSetStatement" "C" "String jinjaStmtOpen|String jinjaStmtSet|String name|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndset|String jinjaStmtClose2"
Gen "JinjaWithStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtWith|List<JinjaWithItem> items|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndwith|String jinjaStmtClose2"
Gen "JinjaWithItem" "" "A" ""
Gen "AssignedWithItem" "JinjaWithItem" "C" "String name|String jinjaAssign|JinjaExpr value"
Gen "SimpleWithItem" "JinjaWithItem" "C" "JinjaExpr value"
Gen "JinjaMacroStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtMacro|String name|String jinjaLparen|JinjaMacroParams params|String jinjaRparen|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndmacro|String jinjaStmtClose2"
Gen "JinjaMacroParams" "" "C" "List<String> items"
Gen "JinjaCallStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtCall|String name|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndcall|String jinjaStmtClose2"
Gen "JinjaFilterStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtFilter|String name|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndfilter|String jinjaStmtClose2"
Gen "JinjaRawStatement" "" "C" "String jinjaStmtOpen|String jinjaStmtRaw|String jinjaStmtClose|TemplateBody body|String jinjaStmtOpen2|String jinjaStmtEndraw|String jinjaStmtClose2"
Gen "JinjaComment" "" "C" "String jinjaCommentOpen|List<String> text|String jinjaCommentClose"

# =============== CSS ===============
Gen "CssStylesheet" "" "C" "List<CssRuleSet> rules"
Gen "CssRuleSet" "" "A" ""
Gen "SelectorRule" "CssRuleSet" "C" "CssSelectorPart selectors|String openBrace|CssDeclarationList decls|String closeBrace"
Gen "AtRule" "CssRuleSet" "C" "String keyword|CssAtRuleBody body"
Gen "CssAtRuleBody" "" "C" "List<CssAnyToken> cssAnyToken1|String openBrace|List<CssAnyToken> cssAnyToken2|String closeBrace|String semiColon"
Gen "CssSelectorPart" "" "C" "List<CssSelectorAtom> atoms"
Gen "CssSelectorAtom" "" "A" ""
Gen "CssIdentAtom" "CssSelectorAtom" "C" "String cssIdent"
Gen "CssHashAtom" "CssSelectorAtom" "C" "String cssHash"
Gen "CssStringAtom" "CssSelectorAtom" "C" "String cssString"
Gen "CssNumberAtom" "CssSelectorAtom" "C" "String cssNumber"
Gen "CssVariableAtom" "CssSelectorAtom" "C" "String cssVariable"
Gen "CssPercentAtom" "CssSelectorAtom" "C" "String cssPercent"
Gen "CssBangAtom" "CssSelectorAtom" "C" "String cssBang"
Gen "CssAtKeywordAtom" "CssSelectorAtom" "C" "String cssAtKeyword"
Gen "MultiplyAtom" "CssSelectorAtom" "C" "String multiply"
Gen "DotAtom" "CssSelectorAtom" "C" "String dot"
Gen "ColonAtom" "CssSelectorAtom" "C" "String colon"
Gen "PipeAtom" "CssSelectorAtom" "C" "String pipe"
Gen "GreaterAtom" "CssSelectorAtom" "C" "String greater"
Gen "PlusAtom" "CssSelectorAtom" "C" "String plus"
Gen "TildeAtom" "CssSelectorAtom" "C" "String tilde"
Gen "CommaAtom" "CssSelectorAtom" "C" "String comma"
Gen "FunctionCallAtom" "CssSelectorAtom" "C" "String cssFunction|List<CssSelectorAtom> cssSelectorAtom|String closeParen"
Gen "BracketGroupAtom" "CssSelectorAtom" "C" "String openBracket|List<CssSelectorAtom> cssSelectorAtom|String closeBracket"
Gen "ParenGroupAtom" "CssSelectorAtom" "C" "String openParen|List<CssSelectorAtom> cssSelectorAtom|String closeParen"
Gen "CssAnyToken" "" "A" ""
Gen "CssIdentToken" "CssAnyToken" "C" "String cssIdent"
Gen "CssNumberToken" "CssAnyToken" "C" "String cssNumber"
Gen "CssStringToken" "CssAnyToken" "C" "String cssString"
Gen "CssHashToken" "CssAnyToken" "C" "String cssHash"
Gen "CssVariableToken" "CssAnyToken" "C" "String cssVariable"
Gen "CssPercentToken" "CssAnyToken" "C" "String cssPercent"
Gen "CssBangToken" "CssAnyToken" "C" "String cssBang"
Gen "CssImportantToken" "CssAnyToken" "C" "String cssImportant"
Gen "CssAtKeywordToken" "CssAnyToken" "C" "String cssAtKeyword"
Gen "FunctionCallToken" "CssAnyToken" "C" "String cssFunction|List<CssAnyToken> cssAnyToken|String closeParen"
Gen "ParenGroupToken" "CssAnyToken" "C" "String openParen|List<CssAnyToken> cssAnyToken|String closeParen"
Gen "BracketGroupToken" "CssAnyToken" "C" "String openBracket|List<CssAnyToken> cssAnyToken|String closeBracket"
Gen "BraceGroupToken" "CssAnyToken" "C" "String openBrace|List<CssAnyToken> cssAnyToken|String closeBrace"
Gen "CommaToken" "CssAnyToken" "C" "String comma"
Gen "ColonToken" "CssAnyToken" "C" "String colon"
Gen "SemiColonToken" "CssAnyToken" "C" "String semiColon"
Gen "PlusToken" "CssAnyToken" "C" "String plus"
Gen "MinusToken" "CssAnyToken" "C" "String minus"
Gen "MultiplyToken" "CssAnyToken" "C" "String multiply"
Gen "DivideToken" "CssAnyToken" "C" "String divide"
Gen "EqualToken" "CssAnyToken" "C" "String equal"
Gen "DotToken" "CssAnyToken" "C" "String dot"
Gen "PipeToken" "CssAnyToken" "C" "String pipe"
Gen "GreaterToken" "CssAnyToken" "C" "String greater"
Gen "TildeToken" "CssAnyToken" "C" "String tilde"
Gen "CssDeclarationList" "" "C" "List<CssDeclaration> decls"
Gen "CssDeclaration" "" "C" "CssProperty property|String colon|CssValue value"
Gen "CssProperty" "" "A" ""
Gen "IdentCssProperty" "CssProperty" "C" "String cssIdent"
Gen "VariableCssProperty" "CssProperty" "C" "String cssVariable"
Gen "CssValue" "" "C" "List<CssValuePart> parts"
Gen "CssValuePart" "" "A" ""
Gen "CssIdentValue" "CssValuePart" "C" "String cssIdent"
Gen "CssNumberValue" "CssValuePart" "C" "String cssNumber"
Gen "CssStringValue" "CssValuePart" "C" "String cssString"
Gen "CssHashValue" "CssValuePart" "C" "String cssHash"
Gen "CssVariableValue" "CssValuePart" "C" "String cssVariable"
Gen "CssPercentValue" "CssValuePart" "C" "String cssPercent"
Gen "CssImportantValue" "CssValuePart" "C" "String cssImportant"
Gen "CssBangValue" "CssValuePart" "C" "String cssBang"
Gen "FunctionCallValue" "CssValuePart" "C" "String cssFunction|List<CssValuePart> cssValuePart|String closeParen"
Gen "ParenGroupValue" "CssValuePart" "C" "String openParen|List<CssValuePart> cssValuePart|String closeParen"
Gen "BracketGroupValue" "CssValuePart" "C" "String openBracket|List<CssValuePart> cssValuePart|String closeBracket"
Gen "CommaValue" "CssValuePart" "C" "String comma"
Gen "PlusValue" "CssValuePart" "C" "String plus"
Gen "MinusValue" "CssValuePart" "C" "String minus"
Gen "MultiplyValue" "CssValuePart" "C" "String multiply"
Gen "DivideValue" "CssValuePart" "C" "String divide"
Gen "EqualValue" "CssValuePart" "C" "String equal"
Gen "DotValue" "CssValuePart" "C" "String dot"
Gen "PipeValue" "CssValuePart" "C" "String pipe"
Gen "GreaterValue" "CssValuePart" "C" "String greater"
Gen "TildeValue" "CssValuePart" "C" "String tilde"

Write-Host ""
Write-Host "Done. All .java files written to $root"