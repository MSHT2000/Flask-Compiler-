        /*
 * ===========================================================================
 *  JinjaParser.g4
 * ===========================================================================
 *  ANTLR 4 parser grammar for HTML5 + Jinja2 + CSS3.
 *  Requires: JinjaLexer.g4 (generate it FIRST)
 *
 *  LABELS
 *  ------
 *  * Labeled Alternatives (# Name) on rules with two or more semantically
 *    distinct alternatives that did not already have one:
 *        attributeValue, attributeValueContent, jinjaWithItem
 *  * Labeled Elements (field=rule, items+=rule) on rules where accessing
 *    a child by position would be confusing:
 *        binary-operator rules, postfix chains, block statements with
 *        multiple template bodies, CSS declaration/value rules, etc.
 *
 *  The parsing logic is unchanged; labels are purely a code-generation aid.
 * ===========================================================================
 */

parser grammar JinjaParser;

options { tokenVocab=JinjaLexer; }

// =========================================================================
// ENTRY POINT
// =========================================================================

templateDocument : body=templateBody EOF ;

templateBody : chunks+=templateChunk* ;

templateChunk
    : htmlMisc              # MiscChunk
    | htmlElement           # ElementChunk
    | templateJinja         # JinjaChunk
    ;

// =========================================================================
// HTML
// =========================================================================

htmlDocument
    : scriptletOrSeaWs* XML_DECLARATION? scriptletOrSeaWs*
      DTD? scriptletOrSeaWs* htmlElements*
    ;
scriptletOrSeaWs
    : SCRIPTLET  #ScriptletValue
    | SEA_WS     #WhitespaceValue
    ;

htmlElements : htmlMisc* htmlElement htmlMisc* ;

htmlElement
    : TAG_OPEN tagName=TAG_NAME attributes+=htmlAttribute*
      ( TAG_CLOSE (content=htmlContent
                   TAG_OPEN TAG_SLASH closeName=TAG_NAME TAG_CLOSE)?
      | TAG_SLASH_CLOSE
      )                                                # PairedElement
    | SCRIPTLET                                        # ScriptletElement
    | STYLE_OPEN stylesheet=cssStylesheet CSS_END      # StyleElement
    ;

//->
htmlContent
    : htmlContentItem*
    ;

htmlContentItem
    : htmlChardata   #ChardataItem
    | htmlElement    #ElementItem
    | CDATA          #CdataItem
    | htmlComment    #CommentItem
    | templateJinja  #TemplateJinjaItem;

htmlAttribute : name=TAG_NAME (TAG_EQUALS value=attributeValue)? ;

attributeValue
    : ATTVALUE_OPEN_DQ attributeValueContent* ATTVALUE_DQ_CLOSE   # DoubleQuotedValue
    | ATTVALUE_OPEN_SQ attributeValueContent* ATTVALUE_SQ_CLOSE   # SingleQuotedValue
    | ATTVALUE_UNQUOTED                                            # UnquotedValue
    ;

attributeValueContent
    : ATTVALUE_DQ_TEXT             # DoubleQuotedText
    | ATTVALUE_SQ_TEXT             # SingleQuotedText
    | ATTVALUE_DQ_LBRACE           # DoubleQuotedLbrace
    | ATTVALUE_SQ_LBRACE           # SingleQuotedLbrace
    | jinjaExpression              # AttributeJinjaExpression
    ;

htmlChardata
    : HTML_TEXT  #HtmlTextChardata
    | SEA_WS     #SeaWsChardata
    ;

htmlMisc
    : htmlComment   #CommentMisc
    | htmlChardata  #ChardataMisc
    ;

htmlComment
    : HTML_COMMENT              #RegularHtmlComment
    | HTML_CONDITIONAL_COMMENT  #ConditionalHtmlComment
    ;

// =========================================================================
// JINJA dispatcher
// =========================================================================

templateJinja
    : jinjaExpression       # JinjaExpressionNode
    | jinjaComment          # JinjaCommentNode
    | jinjaSimpleStatement  # JinjaSimpleStmt
    | jinjaIfStatement      # JinjaIf
    | jinjaForStatement     # JinjaFor
    | jinjaBlockStatement   # JinjaBlock
    | jinjaSetStatement     # JinjaSet
    | jinjaWithStatement    # JinjaWith
    | jinjaMacroStatement   # JinjaMacro
    | jinjaCallStatement    # JinjaCall
    | jinjaFilterStatement  # JinjaFilter
    | jinjaRawStatement     # JinjaRaw;

// =========================================================================
// JINJA EXPRESSIONS
// =========================================================================

jinjaExpression : JINJA_EXPR_OPEN exprs=jinjaExprList JINJA_EXPR_CLOSE ;

jinjaExprList : items+=jinjaExpr (JINJA_COMMA items+=jinjaExpr)* ;

jinjaExpr
    : trueExpr=jinjaOrExpression
      ( JINJA_IF condition=jinjaOrExpression JINJA_ELSE falseExpr=jinjaExpr )?
    ;

jinjaOrExpression
    : first=jinjaAndExpression (JINJA_OR operands+=jinjaAndExpression)*
    ;

jinjaAndExpression
    : first=jinjaNotExpression (JINJA_AND operands+=jinjaNotExpression)*
    ;

jinjaNotExpression
    : JINJA_NOT jinjaNotExpression   # NotExpression
    | jinjaComparison                # ComparisonExpression
    ;

jinjaComparison
    : first=jinjaAdditive
      ( operators+=jinjaComparisonOperator operands+=jinjaAdditive )*
    ;

jinjaComparisonOperator
    : JINJA_EQ   #EqOperator
    | JINJA_NEQ  #NotEqOperator
    | JINJA_LT   #LtOperator
    | JINJA_LE   #LteOperator
    | JINJA_GT   #GtOperator
    | JINJA_GE   #GteOperator
    | JINJA_IN   #InOperator
    | JINJA_IS   #IsOperator
    ;

jinjaAdditive
    : jinjaMultiplicative jinjaAdditiveTail*
    ;

jinjaAdditiveTail
    : jinjaAdditiveOperator jinjaMultiplicative
    ;

jinjaAdditiveOperator
    : JINJA_PLUS   #PlusAdditiveOperator
    | JINJA_MINUS  #MinusAdditiveOperator
    | JINJA_TILDE  #TildeAdditiveOperator;

jinjaMultiplicative
    : jinjaPower jinjaMultiplicativeTail*
    ;

jinjaMultiplicativeTail
    : jinjaMultiplicativeOperator jinjaPower
    ;

jinjaMultiplicativeOperator
    : JINJA_STAR      #StarMultiplicativeOperator
    | JINJA_SLASH     #SlashMultiplicativeOperator
    | JINJA_FLOORDIV  #FloorDivMultiplicativeOperator
    | JINJA_MOD       #ModMultiplicativeOperator;

jinjaPower
    : base=jinjaUnary (JINJA_POW exponents+=jinjaUnary)*
    ;

jinjaUnary
    : jinjaUnaryPrefix  #UnaryPrefixExpr
    | jinjaPostfix      #PostfixExpr;

jinjaUnaryPrefix
    : jinjaUnaryOperator jinjaUnary
    ;

jinjaUnaryOperator
    : JINJA_PLUS   #PlusUnaryOperator
    | JINJA_MINUS  #MinusUnaryOperator;

jinjaPostfix : base=jinjaPrimary parts+=jinjaPostfixPart* ;

jinjaPostfixPart
    : JINJA_DOT JINJA_IDENTIFIER                                # AttributeAccess
    | JINJA_LBRACK jinjaExpr JINJA_RBRACK                       # Subscript
    | JINJA_LPAREN jinjaArgumentList? JINJA_RPAREN              # FunctionCall
    | JINJA_PIPE JINJA_IDENTIFIER (JINJA_LPAREN jinjaArgumentList? JINJA_RPAREN)?  # FilterApplication
    ;

jinjaPrimary
    : JINJA_IDENTIFIER                                # IdentifierPrimary
    | JINJA_STRING                                    # StringPrimary
    | JINJA_INTEGER                                   # IntegerPrimary
    | JINJA_FLOAT                                     # FloatPrimary
    | JINJA_TRUE                                      # TruePrimary
    | JINJA_FALSE                                     # FalsePrimary
    | JINJA_NONE                                      # NonePrimary
    | JINJA_LPAREN jinjaExpr JINJA_RPAREN             # ParenPrimary
    | JINJA_LBRACK jinjaExprList? JINJA_RBRACK        # ListPrimary
    | JINJA_LBRACE jinjaDictEntryList? JINJA_RBRACE   # DictPrimary
    ;

jinjaArgumentList : items+=jinjaArgument (JINJA_COMMA items+=jinjaArgument)* ;

jinjaArgument
    : key=JINJA_IDENTIFIER JINJA_ASSIGN value=jinjaExpr   # KeywordArgument
    | jinjaExpr                                            # PositionalArgument
    ;

jinjaDictEntryList : items+=jinjaDictEntry (JINJA_COMMA items+=jinjaDictEntry)* ;

jinjaDictEntry : key=jinjaExpr JINJA_COLON value=jinjaExpr ;

// =========================================================================
// JINJA STATEMENTS
// =========================================================================

jinjaSimpleStatement
    : JINJA_STMT_OPEN jinjaSimpleStatementInner JINJA_STMT_CLOSE
    ;

jinjaSimpleStatementInner
    : JINJA_STMT_EXTENDS module=JINJA_STRING
        # ExtendsStatement
    | JINJA_STMT_INCLUDE (JINJA_STRING | JINJA_IDENTIFIER)
        # IncludeStatement
    | JINJA_STMT_IMPORT module=JINJA_STRING (JINJA_STMT_AS alias=JINJA_IDENTIFIER)?
        # ImportStatement
    | JINJA_STMT_FROM module=JINJA_STRING JINJA_STMT_IMPORT
      (importedNames+=JINJA_IDENTIFIER
       (JINJA_COMMA importedNames+=JINJA_IDENTIFIER)*)
        # FromImportStatement
    ;

jinjaBlockStatement
    : JINJA_STMT_OPEN JINJA_STMT_BLOCK blockName=JINJA_IDENTIFIER JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDBLOCK closeName=JINJA_IDENTIFIER? JINJA_STMT_CLOSE
    ;

jinjaIfStatement
    : JINJA_STMT_OPEN JINJA_STMT_IF ifCondition=jinjaExpr JINJA_STMT_CLOSE
      ifBody=templateBody
      ( JINJA_STMT_OPEN JINJA_STMT_ELIF elifConditions+=jinjaExpr JINJA_STMT_CLOSE
        elifBodies+=templateBody )*
      ( JINJA_STMT_OPEN JINJA_STMT_ELSE JINJA_STMT_CLOSE
        elseBody=templateBody )?
      JINJA_STMT_OPEN JINJA_STMT_ENDIF JINJA_STMT_CLOSE
    ;

jinjaForStatement
    : JINJA_STMT_OPEN JINJA_STMT_FOR target=jinjaForTarget JINJA_IN iterable=jinjaExprList
      JINJA_STMT_RECURSIVE?
      JINJA_STMT_CLOSE
      body=templateBody
      ( JINJA_STMT_OPEN JINJA_STMT_ELSE JINJA_STMT_CLOSE
        elseBody=templateBody )?
      JINJA_STMT_OPEN JINJA_STMT_ENDFOR JINJA_STMT_CLOSE
    ;

jinjaForTarget : items+=jinjaExpr (JINJA_COMMA items+=jinjaExpr)* ;

jinjaSetStatement
    : JINJA_STMT_OPEN JINJA_STMT_SET name=JINJA_IDENTIFIER JINJA_ASSIGN value=jinjaExpr JINJA_STMT_CLOSE
        # InlineSetStatement
    | JINJA_STMT_OPEN JINJA_STMT_SET name=JINJA_IDENTIFIER JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDSET JINJA_STMT_CLOSE
        # BlockSetStatement
    ;

jinjaWithStatement
    : JINJA_STMT_OPEN JINJA_STMT_WITH items+=jinjaWithItem
      (JINJA_COMMA items+=jinjaWithItem)* JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDWITH JINJA_STMT_CLOSE
    ;

jinjaWithItem
    : name=JINJA_IDENTIFIER JINJA_ASSIGN value=jinjaExpr   # AssignedWithItem
    | value=jinjaExpr                                       # SimpleWithItem
    ;

jinjaMacroStatement
    : JINJA_STMT_OPEN JINJA_STMT_MACRO name=JINJA_IDENTIFIER
      JINJA_LPAREN params=jinjaMacroParams? JINJA_RPAREN JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDMACRO JINJA_STMT_CLOSE
    ;

jinjaMacroParams : items+=JINJA_IDENTIFIER (JINJA_COMMA items+=JINJA_IDENTIFIER)* ;

jinjaCallStatement
    : JINJA_STMT_OPEN JINJA_STMT_CALL name=JINJA_IDENTIFIER JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDCALL JINJA_STMT_CLOSE
    ;

jinjaFilterStatement
    : JINJA_STMT_OPEN JINJA_STMT_FILTER name=JINJA_IDENTIFIER JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDFILTER JINJA_STMT_CLOSE
    ;

jinjaRawStatement
    : JINJA_STMT_OPEN JINJA_STMT_RAW JINJA_STMT_CLOSE
      body=templateBody
      JINJA_STMT_OPEN JINJA_STMT_ENDRAW JINJA_STMT_CLOSE
    ;

// =========================================================================
// JINJA COMMENTS
// =========================================================================

jinjaComment
    : JINJA_COMMENT_OPEN text+=JINJA_COMMENT_TEXT* JINJA_COMMENT_CLOSE
    ;

// =========================================================================
// CSS
// =========================================================================

cssStylesheet : rules+=cssRuleSet* ;

cssRuleSet
    : selectors=cssSelectorPart OpenBrace decls=cssDeclarationList? CloseBrace
        # SelectorRule
    | keyword=CSS_AT_KEYWORD body=cssAtRuleBody
        # AtRule
    ;

cssAtRuleBody
    : cssAnyToken* (OpenBrace cssAnyToken* CloseBrace | SemiColon)
    ;

cssSelectorPart : atoms+=cssSelectorAtom+ ;

cssSelectorAtom
    : CSS_IDENT        #CssIdentAtom
    | CSS_HASH         #CssHashAtom
    | CSS_STRING       #CssStringAtom
    | CSS_NUMBER       #CssNumberAtom
    | CSS_VARIABLE     #CssVariableAtom
    | CSS_PERCENT      #CssPercentAtom
    | CSS_BANG         #CssBangAtom
    | CSS_AT_KEYWORD   #CssAtKeywordAtom
    | Multiply         #MultiplyAtom
    | Dot              #DotAtom
    | Colon            #ColonAtom
    | Pipe             #PipeAtom
    | Greater          #GreaterAtom
    | Plus             #PlusAtom
    | Tilde            #TildeAtom
    | Comma            #CommaAtom
    | CSS_FUNCTION cssSelectorAtom* CloseParen   #FunctionCallAtom
    | OpenBracket cssSelectorAtom* CloseBracket  #BracketGroupAtom
    | OpenParen cssSelectorAtom* CloseParen      #ParenGroupAtom
    ;

cssAnyToken
    : CSS_IDENT       #CssIdentToken
    | CSS_NUMBER      #CssNumberToken
    | CSS_STRING      #CssStringToken
    | CSS_HASH        #CssHashToken
    | CSS_VARIABLE    #CssVariableToken
    | CSS_PERCENT     #CssPercentToken
    | CSS_BANG        #CssBangToken
    | CSS_IMPORTANT   #CssImportantToken
    | CSS_AT_KEYWORD  #CssAtKeywordToken
    | CSS_FUNCTION cssAnyToken* CloseParen   #FunctionCallToken
    | OpenParen cssAnyToken* CloseParen      #ParenGroupToken
    | OpenBracket cssAnyToken* CloseBracket  #BracketGroupToken
    | OpenBrace cssAnyToken* CloseBrace      #BraceGroupToken
    | Comma      #CommaToken
    | Colon      #ColonToken
    | SemiColon  #SemiColonToken
    | Plus       #PlusToken
    | Minus      #MinusToken
    | Multiply   #MultiplyToken
    | Divide     #DivideToken
    | Equal      #EqualToken
    | Dot        #DotToken
    | Pipe       #PipeToken
    | Greater    #GreaterToken
    | Tilde      #TildeToken;

cssDeclarationList
    : decls+=cssDeclaration (SemiColon decls+=cssDeclaration?)*
    ;

cssDeclaration : property=cssProperty Colon value=cssValue ;

    cssProperty
        : CSS_IDENT     #IdentCssProperty
        | CSS_VARIABLE  #VariableCssProperty;

cssValue : parts+=cssValuePart+ ;

cssValuePart
    : CSS_IDENT       #CssIdentValue
    | CSS_NUMBER      #CssNumberValue
    | CSS_STRING      #CssStringValue
    | CSS_HASH        #CssHashValue
    | CSS_VARIABLE    #CssVariableValue
    | CSS_PERCENT     #CssPercentValue
    | CSS_IMPORTANT   #CssImportantValue
    | CSS_BANG        #CssBangValue
    | CSS_FUNCTION cssValuePart* CloseParen   #FunctionCallValue
    | OpenParen cssValuePart* CloseParen      #ParenGroupValue
    | OpenBracket cssValuePart* CloseBracket  #BracketGroupValue
    | Comma      #CommaValue
    | Plus       #PlusValue
    | Minus      #MinusValue
    | Multiply   #MultiplyValue
    | Divide     #DivideValue
    | Equal      #EqualValue
    | Dot        #DotValue
    | Pipe       #PipeValue
    | Greater    #GreaterValue
    | Tilde      #TildeValue;