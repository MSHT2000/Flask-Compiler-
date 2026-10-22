/*
 * ===========================================================================
 *  JinjaLexer.g4
 * ===========================================================================
 *  ANTLR 4 lexer grammar for HTML5 + Jinja2 + CSS3 embedded in <style>.
 *
 *  FIXES
 *  -----
 *  1. JINJA_STMT mode: shared keywords (and, or, not, in, is, True, False,
 *     None) are now declared BEFORE JINJA_STMT_IDENTIFIER so they win the
 *     longest-match tie and are emitted as JINJA_* tokens.  Without this,
 *     `in` inside {% for … in … %} was emitted as JINJA_IDENTIFIER and the
 *     parser failed.
 *  2. HTML_TEXT excludes whitespace so SEA_WS handles it.
 *  3. ATTVALUE uses sub-modes for quoted values.
 * ===========================================================================
 */

lexer grammar JinjaLexer;

tokens {
    OpenBracket, CloseBracket, OpenParen, CloseParen, OpenBrace, CloseBrace,
    SemiColon, Colon, Dot, Multiply, Divide, Pipe, Underscore, Equal,
    Plus, Minus, Greater, Comma, Tilde,
    Includes, DashMatch, PrefixMatch, SuffixMatch, SubstringMatch
}

// ===========================================================================
// DEFAULT MODE : HTML
// ===========================================================================

HTML_COMMENT:              '<!--' .*? '-->'  -> channel(HIDDEN);
HTML_CONDITIONAL_COMMENT:  '<![' .*? ']>'    -> channel(HIDDEN);
XML_DECLARATION:           '<?xml' .*? '>'   -> channel(HIDDEN);
CDATA:                     '<![CDATA[' .*? ']]>' -> channel(HIDDEN);
DTD:                       '<!' .*? '>'      -> channel(HIDDEN);
SCRIPTLET:                 ( '<?' .*? '?>' | '<%' .*? '%>' ) -> channel(HIDDEN);

JINJA_EXPR_OPEN:    '{{' '-'? -> pushMode(JINJA_EXPR);
JINJA_STMT_OPEN:    '{%' '-'? -> pushMode(JINJA_STMT);
JINJA_COMMENT_OPEN: '{#'      -> pushMode(JINJA_COMMENT);

STYLE_OPEN:  '<style' .*? '>' -> pushMode(CSS_MODE);
TAG_OPEN:    '<'               -> pushMode(TAG);
HTML_TEXT:   ~[ \t\r\n<{]+;

SEA_WS: (' ' | '\t' | '\r'? '\n')+;

// ===========================================================================
// TAG MODE
// ===========================================================================
mode TAG;

TAG_CLOSE:       '>'  -> popMode;
TAG_SLASH_CLOSE: '/>' -> popMode;
TAG_SLASH:       '/';
TAG_EQUALS:      '='  -> pushMode(ATTVALUE);
TAG_NAME:        TAG_NameStartChar TAG_NameChar*;
TAG_WHITESPACE:  [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];
fragment DIGIT:    [0-9];
fragment TAG_NameChar:
    TAG_NameStartChar | '-' | '_' | '.' | DIGIT
    | '\u00B7' | '\u0300'..'\u036F' | '\u203F'..'\u2040'
;
fragment TAG_NameStartChar:
    [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
;

// ===========================================================================
// ATTVALUE MODE
// ===========================================================================
mode ATTVALUE;

ATTVALUE_OPEN_DQ:  '"'  -> pushMode(ATTVALUE_DQ);
ATTVALUE_OPEN_SQ:  '\'' -> pushMode(ATTVALUE_SQ);
ATTVALUE_UNQUOTED: ~[ \t\r\n"'>=<`]+ -> popMode;
ATTVALUE_SPACE:    [ \t\r\n]+ -> skip;

mode ATTVALUE_DQ;
ATTVALUE_DQ_CLOSE: '"'                -> popMode, popMode;
ATTVALUE_DQ_JINJA: '{{' '-'?          -> type(JINJA_EXPR_OPEN), pushMode(JINJA_EXPR);
ATTVALUE_DQ_TEXT:  ~["{]+;
ATTVALUE_DQ_LBRACE: '{';

mode ATTVALUE_SQ;
ATTVALUE_SQ_CLOSE: '\''               -> popMode, popMode;
ATTVALUE_SQ_JINJA: '{{' '-'?          -> type(JINJA_EXPR_OPEN), pushMode(JINJA_EXPR);
ATTVALUE_SQ_TEXT:  ~['{]+;
ATTVALUE_SQ_LBRACE: '{';

// ===========================================================================
// JINJA_EXPR MODE : inside {{ ... }}
// ===========================================================================
mode JINJA_EXPR;

JINJA_EXPR_CLOSE: '-'? '}}' -> popMode;

JINJA_DOT:      '.';
JINJA_COMMA:    ',';
JINJA_COLON:    ':';
JINJA_SEMI:     ';';
JINJA_LPAREN:   '(';
JINJA_RPAREN:   ')';
JINJA_LBRACK:   '[';
JINJA_RBRACK:   ']';
JINJA_LBRACE:   '{';
JINJA_RBRACE:   '}';
JINJA_PIPE:     '|';
JINJA_TILDE:    '~';
JINJA_QUESTION: '?';
JINJA_ASSIGN:   '=';
JINJA_EQ:       '==';
JINJA_NEQ:      '!=';
JINJA_LT:       '<';
JINJA_LE:       '<=';
JINJA_GT:       '>';
JINJA_GE:       '>=';
JINJA_PLUS:     '+';
JINJA_MINUS:    '-';
JINJA_STAR:     '*';
JINJA_SLASH:    '/';
JINJA_FLOORDIV: '//';
JINJA_MOD:      '%';
JINJA_POW:      '**';

JINJA_TRUE:  'True';
JINJA_FALSE: 'False';
JINJA_NONE:  'None';
JINJA_AND:   'and';
JINJA_OR:    'or';
JINJA_NOT:   'not';
JINJA_IN:    'in';
JINJA_IS:    'is';
JINJA_IF:    'if';
JINJA_ELSE:  'else';
JINJA_FOR:   'for';
JINJA_LOOP:  'loop';
JINJA_SUPER: 'super';
JINJA_SELF:  'self';
JINJA_VARARGS: 'varargs';
JINJA_KWARGS:  'kwargs';
JINJA_FILTER:  'filter';
JINJA_TEST:    'test';

JINJA_FUNCTION: 'range' | 'dict' | 'lipsum' | 'cycler' | 'joiner' | 'namespace';

JINJA_STRING:  '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';
JINJA_INTEGER: [0-9]+;
JINJA_FLOAT:   [0-9]+ '.' [0-9]* | '.' [0-9]+;
JINJA_IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

JINJA_WS: [ \t\r\n]+ -> channel(HIDDEN);

// ===========================================================================
// JINJA_STMT MODE : inside {% ... %}
// ===========================================================================
mode JINJA_STMT;

JINJA_STMT_CLOSE: '-'? '%}' -> popMode;

// --- Statement-specific keywords (must precede IDENTIFIER) ---
JINJA_STMT_BLOCK:      'block';
JINJA_STMT_ENDBLOCK:   'endblock';
JINJA_STMT_EXTENDS:    'extends';
JINJA_STMT_INCLUDE:    'include';
JINJA_STMT_IMPORT:     'import';
JINJA_STMT_FROM:       'from';
JINJA_STMT_AS:         'as';
JINJA_STMT_WITH:       'with';
JINJA_STMT_ENDWITH:    'endwith';
JINJA_STMT_SET:        'set';
JINJA_STMT_ENDSET:     'endset';
JINJA_STMT_MACRO:      'macro';
JINJA_STMT_ENDMACRO:   'endmacro';
JINJA_STMT_CALL:       'call';
JINJA_STMT_ENDCALL:    'endcall';
JINJA_STMT_FILTER:     'filter';
JINJA_STMT_ENDFILTER:  'endfilter';
JINJA_STMT_RAW:        'raw';
JINJA_STMT_ENDRAW:     'endraw';
JINJA_STMT_IF:         'if';
JINJA_STMT_ELIF:       'elif';
JINJA_STMT_ELSE:       'else';
JINJA_STMT_ENDIF:      'endif';
JINJA_STMT_FOR:        'for';
JINJA_STMT_ENDFOR:     'endfor';
JINJA_STMT_RECURSIVE:  'recursive';
JINJA_STMT_AUTOESCAPE: 'autoescape';
JINJA_STMT_ENDAUTOESCAPE: 'endautoescape';
JINJA_STMT_TRANS:      'trans';
JINJA_STMT_ENDTRANS:   'endtrans';
JINJA_STMT_PLURALIZE:  'pluralize';

// --- Shared keywords: MUST precede IDENTIFIER so they win the tie ---
JINJA_STMT_AND:   'and'   -> type(JINJA_AND);
JINJA_STMT_OR:    'or'    -> type(JINJA_OR);
JINJA_STMT_NOT:   'not'   -> type(JINJA_NOT);
JINJA_STMT_IN:    'in'    -> type(JINJA_IN);
JINJA_STMT_IS:    'is'    -> type(JINJA_IS);
JINJA_STMT_TRUE:  'True'  -> type(JINJA_TRUE);
JINJA_STMT_FALSE: 'False' -> type(JINJA_FALSE);
JINJA_STMT_NONE:  'None'  -> type(JINJA_NONE);

// --- Shared literals / identifiers (AFTER keywords) ---
JINJA_STMT_IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*  -> type(JINJA_IDENTIFIER);

JINJA_STMT_STRING:
    ( '"' (~["\\] | '\\' .)* '"'
    | '\'' (~['\\] | '\\' .)* '\''
    )                                          -> type(JINJA_STRING);

JINJA_STMT_INTEGER: [0-9]+                     -> type(JINJA_INTEGER);

JINJA_STMT_FLOAT:
    ( [0-9]+ '.' [0-9]* | '.' [0-9]+ )         -> type(JINJA_FLOAT);

// --- Shared punctuation ---
JINJA_STMT_LPAREN:    '('  -> type(JINJA_LPAREN);
JINJA_STMT_RPAREN:    ')'  -> type(JINJA_RPAREN);
JINJA_STMT_LBRACK:    '['  -> type(JINJA_LBRACK);
JINJA_STMT_RBRACK:    ']'  -> type(JINJA_RBRACK);
JINJA_STMT_LBRACE:    '{'  -> type(JINJA_LBRACE);
JINJA_STMT_RBRACE:    '}'  -> type(JINJA_RBRACE);
JINJA_STMT_DOT:       '.'  -> type(JINJA_DOT);
JINJA_STMT_COMMA:     ','  -> type(JINJA_COMMA);
JINJA_STMT_COLON:     ':'  -> type(JINJA_COLON);
JINJA_STMT_SEMI:      ';'  -> type(JINJA_SEMI);
JINJA_STMT_PIPE:      '|'  -> type(JINJA_PIPE);
JINJA_STMT_TILDE:     '~'  -> type(JINJA_TILDE);
JINJA_STMT_QUESTION:  '?'  -> type(JINJA_QUESTION);
JINJA_STMT_ASSIGN:    '='  -> type(JINJA_ASSIGN);
JINJA_STMT_EQ:        '==' -> type(JINJA_EQ);
JINJA_STMT_NEQ:       '!=' -> type(JINJA_NEQ);
JINJA_STMT_LT:        '<'  -> type(JINJA_LT);
JINJA_STMT_LE:        '<=' -> type(JINJA_LE);
JINJA_STMT_GT:        '>'  -> type(JINJA_GT);
JINJA_STMT_GE:        '>=' -> type(JINJA_GE);
JINJA_STMT_PLUS:      '+'  -> type(JINJA_PLUS);
JINJA_STMT_MINUS:     '-'  -> type(JINJA_MINUS);
JINJA_STMT_STAR:      '*'  -> type(JINJA_STAR);
JINJA_STMT_SLASH:     '/'  -> type(JINJA_SLASH);
JINJA_STMT_FLOORDIV:  '//' -> type(JINJA_FLOORDIV);
JINJA_STMT_MOD:       '%'  -> type(JINJA_MOD);
JINJA_STMT_POW:       '**' -> type(JINJA_POW);

JINJA_STMT_WS: [ \t\r\n]+ -> channel(HIDDEN);

// ===========================================================================
// JINJA_COMMENT MODE
// ===========================================================================
mode JINJA_COMMENT;

JINJA_COMMENT_CLOSE: '#}' -> popMode;
JINJA_COMMENT_TEXT:  .;

// ===========================================================================
// CSS_MODE
// ===========================================================================
mode CSS_MODE;

CSS_OPEN_BRACKET:  '[' -> type(OpenBracket);
CSS_CLOSE_BRACKET: ']' -> type(CloseBracket);
CSS_OPEN_PAREN:    '(' -> type(OpenParen);
CSS_CLOSE_PAREN:   ')' -> type(CloseParen);
CSS_OPEN_BRACE:    '{' -> type(OpenBrace);
CSS_CLOSE_BRACE:   '}' -> type(CloseBrace);
CSS_SEMI:          ';' -> type(SemiColon);
CSS_COLON:         ':' -> type(Colon);
CSS_DOT:           '.' -> type(Dot);
CSS_MULTIPLY:      '*' -> type(Multiply);
CSS_DIVIDE:        '/' -> type(Divide);
CSS_PIPE:          '|' -> type(Pipe);
CSS_UNDERSCORE:    '_' -> type(Underscore);
CSS_EQ:            '=' -> type(Equal);

CSS_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
CSS_SPACE:   [ \t\r\n\f]+  -> channel(HIDDEN);

CSS_STRING:   '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';
CSS_NUMBER:   [0-9]+ | [0-9]* '.' [0-9]+;
CSS_HASH:     '#' [a-zA-Z0-9_-]+;
CSS_IDENT:    '-'? [a-zA-Z_] [a-zA-Z0-9_-]*;
CSS_FUNCTION: [a-zA-Z_] [a-zA-Z0-9_-]* '(';
CSS_AT_KEYWORD: '@' [a-zA-Z-]+;
CSS_VARIABLE: '--' [a-zA-Z_] [a-zA-Z0-9_-]*;
CSS_IMPORTANT: '!' [ \t]* 'important';
CSS_PERCENT:  '%';
CSS_BANG:     '!';

CSS_PLUS:    '+' -> type(Plus);
CSS_MINUS:   '-' -> type(Minus);
CSS_GREATER: '>' -> type(Greater);
CSS_COMMA:   ',' -> type(Comma);
CSS_TILDE:   '~' -> type(Tilde);

CSS_INCLUDES:       '~=' -> type(Includes);
CSS_DASHMATCH:      '|=' -> type(DashMatch);
CSS_PREFIXMATCH:    '^=' -> type(PrefixMatch);
CSS_SUFFIXMATCH:    '$=' -> type(SuffixMatch);
CSS_SUBSTRINGMATCH: '*=' -> type(SubstringMatch);

CSS_END: '</style>' -> popMode;

// ===========================================================================
// Catch-all
// ===========================================================================
mode DEFAULT_MODE;

UNEXPECTED_CHAR: . -> channel(HIDDEN);