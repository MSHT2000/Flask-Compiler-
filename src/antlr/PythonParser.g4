/*
    Python grammar
    The MIT License (MIT)
    Copyright (c) 2021 Robert Einhorn

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
*/

/*
 * Project      : an ANTLR4 parser grammar for Python 3 programming language based on the official PEG grammar
 *                https://github.com/RobEin/ANTLR4-parser-for-Python-3.14
 * Developed by : Robert Einhorn
 *
 */

// Python 3.14.2  https://docs.python.org/3.14/reference/grammar.html#full-grammar-specification

parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

// STARTING RULES
// ==============

fileInput: statements? EOF;
interactive: statementNewline;
eval: expressions NEWLINE* EOF;
funcType: LPAR typeExpressions? RPAR RARROW expression NEWLINE* EOF;

// GENERAL STATEMENTS
// ==================

statements: statement+;

statement
    : compoundStmt    # CompoundStatement
    | simpleStmts     # SimpleStatements
    ;

singleCompoundStmt
    : compoundStmt
    ;

statementNewline
    : singleCompoundStmt NEWLINE  # CompoundStatementNewline
    | simpleStmts                 # SimpleStatementsNewline
    | NEWLINE                     # BlankLine
    | EOF                         # EndOfFile
    ;

simpleStmts
    : simpleStmt (SEMI simpleStmt)* SEMI? NEWLINE
    ;

// NOTE: assignment MUST precede expression, else parsing a simple assignment
// will throw a SyntaxError.

simpleStmt
    : assignment      # AssignmentStatement
    | typeAlias       # TypeAliasStatement
    | starExpressions # StarExpressionStatement
    | returnStmt      # ReturnStatement
    | importStmt      # ImportStatement
    | raiseStmt       # RaiseStatement
    | passStmt        # PassStatement
    | delStmt         # DeleteStatement
    | yieldStmt       # YieldStatement
    | assertStmt      # AssertStatement
    | breakStmt       # BreakStatement
    | continueStmt    # ContinueStatement
    | globalStmt      # GlobalStatement
    | nonlocalStmt    # NonlocalStatement
    ;

compoundStmt
    : functionDef  # FunctionDefinition
    | ifStmt       # IfStatement
    | classDef     # ClassDefinition
    | withStmt     # WithStatement
    | forStmt      # ForStatement
    | tryStmt      # TryStatement
    | whileStmt    # WhileStatement
    | matchStmt    # MatchStatement
    ;

// SIMPLE STATEMENTS
// =================
// NOTE: annotatedRhs may start with 'yield'; yieldExpr must start with 'yield'

assignment
    : name COLON expression (EQUAL annotatedRhs )?  # AnnotatedAssignmentName
    | (LPAR singleTarget RPAR | singleSubscriptAttributeTarget) COLON expression (EQUAL annotatedRhs )?  # AnnotatedAssignmentTarget
    | (starTargets EQUAL )+ annotatedRhs TYPE_COMMENT?  # ChainedAssignment
    | singleTarget augassign annotatedRhs  # AugmentedAssignment
    ;

annotatedRhs
    : yieldExpr        # YieldAnnotatedRhs
    | starExpressions  # StarExpressionsAnnotatedRhs
    ;

augassign
    : PLUSEQUAL        # PlusAssign
    | MINEQUAL         # MinusAssign
    | STAREQUAL        # StarAssign
    | ATEQUAL          # AtAssign
    | SLASHEQUAL       # SlashAssign
    | PERCENTEQUAL     # PercentAssign
    | AMPEREQUAL       # AmpersandAssign
    | VBAREQUAL        # VBarAssign
    | CIRCUMFLEXEQUAL  # CircumflexAssign
    | LEFTSHIFTEQUAL   # LeftShiftAssign
    | RIGHTSHIFTEQUAL  # RightShiftAssign
    | DOUBLESTAREQUAL  # DoubleStarAssign
    | DOUBLESLASHEQUAL # DoubleSlashAssign
    ;

returnStmt
    : RETURN starExpressions?;

raiseStmt
    : RAISE (expression (FROM expression )?)?;

passStmt
    : PASS;

breakStmt
    : BREAK;

continueStmt
    : CONTINUE;

globalStmt: GLOBAL name (COMMA name)*;

nonlocalStmt: NONLOCAL name (COMMA name)*;

delStmt
    : DEL delTargets;

yieldStmt: yieldExpr;

assertStmt: ASSERT expression (COMMA expression )?;

importStmt
    : importName  # ImportNameStatement
    | importFrom  # ImportFromStatement
    ;

// Import statements
// -----------------

importName: IMPORT dottedAsNames;
// note below: the (DOT | ELLIPSIS) is necessary because ELLIPSIS is tokenized as ELLIPSIS
importFrom
    : FROM (DOT | ELLIPSIS)* dottedName IMPORT importFromTargets  # ImportFromDotted
    | FROM (DOT | ELLIPSIS)+ IMPORT importFromTargets             # ImportFromRelative
    ;

importFromTargets
    : LPAR importFromAsNames COMMA? RPAR  # ImportFromParenthesized
    | importFromAsNames                   # ImportFromNameList
    | STAR                                # ImportFromStar
    ;

importFromAsNames
    : importFromAsName (COMMA importFromAsName)*
    ;

importFromAsName
    : name (AS name )?
    ;

dottedAsNames
    : dottedAsName (COMMA dottedAsName)*
    ;

dottedAsName
    : dottedName (AS name )?
    ;

dottedName
    : dottedName DOT name  # DottedNamePath
    | name                 # SimpleDottedName
    ;

// COMPOUND STATEMENTS
// ===================

// Common elements
// ---------------

block
    : NEWLINE INDENT statements DEDENT  # IndentedBlock
    | simpleStmts                       # SimpleBlock
    ;

decorators: (AT namedExpression NEWLINE )+;

// Class definitions
// -----------------

classDef
    : decorators classDefRaw  # DecoratedClassDefinition
    | classDefRaw             # UndecoratedClassDefinition
    ;

classDefRaw
    : CLASS name typeParams? (LPAR arguments? RPAR )? COLON block;

// Function definitions
// --------------------

functionDef
    : decorators functionDefRaw  # DecoratedFunctionDefinition
    | functionDefRaw             # UndecoratedFunctionDefinition
    ;

functionDefRaw
    : DEF name typeParams? LPAR params? RPAR (RARROW expression )? COLON funcTypeComment? block  # RegularFunction
    | ASYNC DEF name typeParams? LPAR params? RPAR (RARROW expression )? COLON funcTypeComment? block  # AsyncFunction
    ;

// Function parameters
// -------------------

params
    : parameters;

parameters
    : slashNoDefault paramNoDefault* paramWithDefault* starEtc?  # PositionalOnlyWithSlash
    | slashWithDefault paramWithDefault* starEtc?                # PositionalOnlyWithSlashAndDefaults
    | paramNoDefault+ paramWithDefault* starEtc?                 # RegularParameters
    | paramWithDefault+ starEtc?                                 # ParametersWithDefaults
    | starEtc                                                    # StarParameters
    ;

// Some duplication here because we can't write (COMMA | {isCurrentTokenType(RPAR)}?),
// which is because we don't support empty alternatives (yet).

slashNoDefault
    : paramNoDefault+ SLASH COMMA?
    ;
slashWithDefault
    : paramNoDefault* paramWithDefault+ SLASH COMMA?
    ;

starEtc
    : STAR paramNoDefault paramMaybeDefault* kwds?              # StarParam
    | STAR paramNoDefaultStarAnnotation paramMaybeDefault* kwds? # StarParamWithAnnotation
    | STAR COMMA paramMaybeDefault+ kwds?                       # BareStarParam
    | kwds                                                      # KeywordOnlyParams
    ;

kwds
    : DOUBLESTAR paramNoDefault;

// One parameter.  This *includes* a following comma and type comment.
//
// There are three styles:
// - No defaultAssignment
// - With defaultAssignment
// - Maybe with defaultAssignment
//
// There are two alternative forms of each, to deal with type comments:
// - Ends in a comma followed by an optional type comment
// - No comma, optional type comment, must be followed by close paren
// The latter form is for a final parameter without trailing comma.
//

paramNoDefault
    : param COMMA? TYPE_COMMENT?
    ;

paramNoDefaultStarAnnotation
    : paramStarAnnotation COMMA? TYPE_COMMENT?
    ;

paramWithDefault
    : param defaultAssignment COMMA? TYPE_COMMENT?
    ;

paramMaybeDefault
    : param defaultAssignment? COMMA? TYPE_COMMENT?
    ;

param: name annotation?
     ;

paramStarAnnotation: name starAnnotation
                     ;

annotation: COLON expression
          ;

starAnnotation: COLON starExpression
               ;

defaultAssignment: EQUAL expression
                  ;

// If statement
// ------------

ifStmt
    : IF namedExpression COLON block (elifStmt | elseBlock?)
    ;
elifStmt
    : ELIF namedExpression COLON block (elifStmt | elseBlock?)
    ;
elseBlock
    : ELSE COLON block;

// While statement
// ---------------

whileStmt
    : WHILE namedExpression COLON block elseBlock?;

// For statement
// -------------

forStmt
    : ASYNC? FOR starTargets IN starExpressions COLON TYPE_COMMENT? block elseBlock?
    ;

// With statement
// --------------

withStmt
    : WITH LPAR withItem (COMMA withItem)* COMMA? RPAR COLON TYPE_COMMENT? block  # ParenthesizedWithItems
    | ASYNC WITH LPAR withItem (COMMA withItem)* COMMA? RPAR COLON block          # AsyncParenthesizedWithItems
    | ASYNC? WITH withItem (COMMA withItem)* COLON TYPE_COMMENT? block            # RegularWithItems
    ;

withItem
    : expression (AS starTarget)?
    ;

// Try statement
// -------------

tryStmt
    : TRY COLON block finallyBlock                          # TryFinally
    | TRY COLON block exceptBlock+ elseBlock? finallyBlock? # TryExcept
    | TRY COLON block exceptStarBlock+ elseBlock? finallyBlock? # TryExceptStar
    ;

// Except statement
// ----------------

exceptBlock
    : EXCEPT (expression (AS name )? | expressions)? COLON block
    ;

exceptStarBlock
    : EXCEPT STAR (expression (AS name )? | expressions) COLON block
    ;

finallyBlock
    : FINALLY COLON block;

// Match statement
// ---------------

matchStmt
    : NAME_OR_MATCH subjectExpr COLON NEWLINE INDENT caseBlock+ DEDENT;

subjectExpr
    : starNamedExpression COMMA starNamedExpressions?  # SubjectExprMultiple
    | namedExpression                                  # SubjectExprSingle
    ;

caseBlock
    : NAME_OR_CASE patterns guard? COLON block;

guard: IF namedExpression;

patterns
    : openSequencePattern  # PatternsSequence
    | pattern              # PatternsSingle
    ;

pattern
    : asPattern  # AsPatternMatch
    | orPattern  # OrPatternAlternatives
    ;

asPattern
    : orPattern AS patternCaptureTarget;

orPattern
    : closedPattern (VBAR closedPattern)*;

closedPattern
    : literalPattern   # LiteralClosedPattern
    | capturePattern   # CaptureClosedPattern
    | wildcardPattern  # WildcardClosedPattern
    | valuePattern     # ValueClosedPattern
    | groupPattern     # GroupClosedPattern
    | sequencePattern  # SequenceClosedPattern
    | mappingPattern   # MappingClosedPattern
    | classPattern     # ClassClosedPattern
    ;

// Literal patterns are used for equality and identity constraints
literalPattern
    : signedNumber   # SignedNumberLiteralPattern
    | complexNumber  # ComplexNumberLiteralPattern
    | strings        # StringLiteralPattern
    | NONE           # NoneLiteralPattern
    | TRUE           # TrueLiteralPattern
    | FALSE          # FalseLiteralPattern
    ;

// Literal expressions are used to restrict permitted mapping pattern keys
literalExpr
    : signedNumber   # SignedNumberLiteralExpr
    | complexNumber  # ComplexNumberLiteralExpr
    | strings        # StringLiteralExpr
    | NONE           # NoneLiteralExpr
    | TRUE           # TrueLiteralExpr
    | FALSE          # FalseLiteralExpr
    ;

complexNumber
    : signedRealNumber (PLUS | MINUS) imaginaryNumber
    ;

signedNumber
    : MINUS? NUMBER
    ;

signedRealNumber
    : MINUS? realNumber
    ;

realNumber
    : NUMBER;

imaginaryNumber
    : NUMBER;

capturePattern
    : patternCaptureTarget;

patternCaptureTarget
    : nameExceptUnderscore;

wildcardPattern
    : NAME_OR_WILDCARD;

valuePattern
    : attr;

attr
    : name (DOT name)+
    ;
nameOrAttr
    : name (DOT name)*
    ;

groupPattern
    : LPAR pattern RPAR;

sequencePattern
    : LSQB maybeSequencePattern? RSQB  # ListSequencePattern
    | LPAR openSequencePattern? RPAR   # TupleSequencePattern
    ;

openSequencePattern
    : maybeStarPattern COMMA maybeSequencePattern?;

maybeSequencePattern
    : maybeStarPattern (COMMA maybeStarPattern)* COMMA?;

maybeStarPattern
    : starPattern  # StarMaybePattern
    | pattern      # RegularMaybePattern
    ;

starPattern
    : STAR name
    ;

mappingPattern
    : LBRACE RBRACE                                      # EmptyMappingPattern
    | LBRACE doubleStarPattern COMMA? RBRACE             # DoubleStarMappingPattern
    | LBRACE itemsPattern (COMMA doubleStarPattern)? COMMA? RBRACE # ItemsMappingPattern
    ;

itemsPattern
    : keyValuePattern (COMMA keyValuePattern)*;

keyValuePattern
    : (literalExpr | attr) COLON pattern;

doubleStarPattern
    : DOUBLESTAR patternCaptureTarget;

classPattern
    : nameOrAttr LPAR ((positionalPatterns (COMMA keywordPatterns)? | keywordPatterns) COMMA?)? RPAR
    ;

positionalPatterns
    : pattern (COMMA pattern)*;


keywordPatterns
    : keywordPattern (COMMA keywordPattern)*;

keywordPattern
    : name EQUAL pattern;

// Type statement
// --------------
typeAlias
    : NAME_OR_TYPE name typeParams? EQUAL expression;

// Type parameter declaration
// --------------------------

typeParams
    : LSQB typeParamSeq  RSQB;

typeParamSeq: typeParam (COMMA typeParam)* COMMA?;

typeParam
    : name typeParamBound? typeParamDefault?       # RegularTypeParam
    | STAR  name typeParamStarredDefault?          # StarTypeParam
    | DOUBLESTAR name typeParamDefault?            # DoubleStarTypeParam
    ;

typeParamBound: COLON expression;

typeParamDefault: EQUAL expression;

typeParamStarredDefault: EQUAL starExpression;

// EXPRESSIONS
// -----------

expressions
    : expression (COMMA expression )* COMMA?
    ;

expression
    : disjunction (IF disjunction ELSE expression)?  # ConditionalExpression
    | lambdef                                        # LambdaExpression
    ;

yieldExpr
    : YIELD (FROM expression | starExpressions?)
    ;

starExpressions
    : starExpression (COMMA starExpression )* COMMA?
    ;

//*
    starExpression
        : STAR bitwiseOr  # StarBitwiseOr
        | expression      # RegularStarExpression
        ;

        starNamedExpressions: starNamedExpression (COMMA starNamedExpression)* COMMA?;

    starNamedExpression
        : STAR bitwiseOr      # StarNamedExpressionBitwiseOr
        | namedExpression     # RegularStarNamedExpression
        ;

assignmentExpression
    : name COLONEQUAL expression;

namedExpression
    : assignmentExpression  # NamedAssignmentExpression
    | expression            # RegularNamedExpression
    ;

disjunction
    : conjunction (OR conjunction )*
    ;

conjunction
    : inversion (AND inversion )*
    ;

inversion
    : NOT inversion  # NotInversion
    | comparison     # ComparisonInversion
    ;

// Comparison operators
// --------------------

comparison
    : bitwiseOr compareOpBitwiseOrPair*
    ;

    compareOpBitwiseOrPair
        : eqBitwiseOr     # EqComparison
        | noteqBitwiseOr  # NotEqComparison
        | lteBitwiseOr    # LessEqComparison
        | ltBitwiseOr     # LessComparison
        | gteBitwiseOr    # GreaterEqComparison
        | gtBitwiseOr     # GreaterComparison
        | notinBitwiseOr  # NotInComparison
        | inBitwiseOr     # InComparison
        | isnotBitwiseOr  # IsNotComparison
        | isBitwiseOr     # IsComparison
        ;

eqBitwiseOr: EQEQUAL bitwiseOr;

noteqBitwiseOr
    : NOTEQUAL bitwiseOr
    ;

lteBitwiseOr: LESSEQUAL bitwiseOr;

ltBitwiseOr: LESS bitwiseOr;

gteBitwiseOr: GREATEREQUAL bitwiseOr;

gtBitwiseOr: GREATER bitwiseOr;

notinBitwiseOr: NOT IN bitwiseOr;

inBitwiseOr: IN bitwiseOr;

isnotBitwiseOr: IS NOT bitwiseOr;

isBitwiseOr: IS bitwiseOr;

// Bitwise operators
// -----------------

bitwiseOr
    : bitwiseOr VBAR bitwiseXor  # BitwiseOrExpression
    | bitwiseXor                 # BitwiseXorOperand
    ;

       bitwiseXor
           : bitwiseXor CIRCUMFLEX bitwiseAnd  # BitwiseXorExpression
           | bitwiseAnd                        # BitwiseAndOperand
           ;

bitwiseAnd
    : bitwiseAnd AMPER shiftExpr  # BitwiseAndExpression
    | shiftExpr                   # ShiftExprOperand
    ;

shiftExpr
   : shiftExpr (LEFTSHIFT | RIGHTSHIFT) sum  # ShiftExpression
   | sum                                     # SumOperand
   ;

// Arithmetic operators
// --------------------

sum
   : sum (PLUS | MINUS) term  # AdditiveExpression
   | term                     # TermOperand
   ;

term
    : term (STAR | SLASH | DOUBLESLASH | PERCENT | AT) factor  # MultiplicativeExpression
    | factor                                                   # FactorOperand
    ;

factor
    : PLUS factor   # UnaryPlus
    | MINUS factor  # UnaryMinus
    | TILDE factor  # BitwiseNot
    | power             # PowerOperand
    ;

power
    : awaitPrimary (DOUBLESTAR factor)?
    ;

// Primary elements
// ----------------

// Primary elements are things like "obj.something.something", "obj[something]", "obj(something)", "obj" ...

awaitPrimary
    : AWAIT primary  # AwaitExpression
    | primary        # PrimaryOperand
    ;

    primary
        : primary (DOT name | genexp | LPAR arguments? RPAR | LSQB slices RSQB)  # PrimaryWithAccess
        | atom                                                                   # AtomOperand
        ;

slices
   : slice  # SingleSlice
   | (slice | starredExpression) (COMMA (slice | starredExpression))* COMMA?  # MultipleSlices
   ;

slice
    : expression? COLON expression? (COLON expression? )?  # SliceRange
    | namedExpression                                      # SliceExpression
    ;

atom
    : name                       # NameAtom
    | TRUE                       # TrueAtom
    | FALSE                      # FalseAtom
    | NONE                       # NoneAtom
    | strings                    # StringAtom
    | NUMBER                     # NumberAtom
    | (tuple | group | genexp)   # TupleGroupGenexpAtom
    | (listLiteral | listcomp)          # ListAtom
    | (dict | set | dictcomp | setcomp)  # DictSetAtom
    | ELLIPSIS                   # EllipsisAtom
    ;

group
    : LPAR (yieldExpr | namedExpression) RPAR;

// Lambda functions
// ----------------

lambdef
    : LAMBDA lambdaParams? COLON expression;

lambdaParams
    : lambdaParameters;

// lambdaParameters etc. duplicates parameters but without annotations
// or type comments, and if there's no comma after a parameter, we expect
// a colon, not a close parenthesis.  (For more, see parameters above.)
//
lambdaParameters
   : lambdaSlashNoDefault lambdaParamNoDefault* lambdaParamWithDefault* lambdaStarEtc?  # PositionalOnlyLambdaParams
   | lambdaSlashWithDefault lambdaParamWithDefault* lambdaStarEtc?                     # PositionalOnlyWithDefaultsLambdaParams
   | lambdaParamNoDefault+ lambdaParamWithDefault* lambdaStarEtc?                      # RegularLambdaParams
   | lambdaParamWithDefault+ lambdaStarEtc?                                            # LambdaParamsWithDefaults
   | lambdaStarEtc                                                                     # StarLambdaParams
   ;

lambdaSlashNoDefault
    : lambdaParamNoDefault+ SLASH COMMA?
    ;

lambdaSlashWithDefault
    : lambdaParamNoDefault* lambdaParamWithDefault+ SLASH COMMA?
    ;

lambdaStarEtc
   : STAR lambdaParamNoDefault lambdaParamMaybeDefault* lambdaKwds?  # StarLambdaParam
   | STAR COMMA lambdaParamMaybeDefault+ lambdaKwds?                 # BareStarLambdaParam
   | lambdaKwds                                                      # LambdaKeywordParams
   ;

lambdaKwds
    : DOUBLESTAR lambdaParamNoDefault;

lambdaParamNoDefault
    : lambdaParam COMMA?
    ;

    lambdaParamWithDefault
        : lambdaParam defaultAssignment COMMA?
        ;

lambdaParamMaybeDefault
    : lambdaParam defaultAssignment? COMMA?
    ;

lambdaParam: name;

// LITERALS
// ========
//----->
fstringMiddle
     : fstringReplacementField  # FStringReplacementFieldMiddle
     | FSTRING_MIDDLE            # FStringMiddleText
     ;

fstringReplacementField
    : LBRACE annotatedRhs EQUAL? fstringConversion? fstringFullFormatSpec? RBRACE
    ;

fstringConversion
    : EXCLAMATION name
    ;

fstringFullFormatSpec
    : COLON fstringFormatSpec*;

fstringFormatSpec
  : FSTRING_MIDDLE            # FStringFormatSpecText
  | fstringReplacementField   # FStringFormatSpecReplacementField
  ;

fstring
    : FSTRING_START fstringMiddle* FSTRING_END;

tstringFormatSpec
    : TSTRING_MIDDLE            # TStringFormatSpecText
    | tstringReplacementField   # TStringFormatSpecReplacementField
    ;

tstringFullFormatSpec
    : COLON tstringFormatSpec*;

tstringReplacementField
    : LBRACE annotatedRhs EQUAL? fstringConversion? tstringFullFormatSpec? RBRACE;

tstringMiddle
   : tstringReplacementField  # TStringReplacementFieldMiddle
   | TSTRING_MIDDLE            # TStringMiddleText
   ;

tstring
    : TSTRING_START tstringMiddle* TSTRING_END;

string: STRING;

strings
    : (fstring|string)+  # FStringStrings
    | tstring+           # TStringStrings
    ;

listLiteral : LSQB starNamedExpressions? RSQB;

    tuple
        : LPAR (starNamedExpression COMMA starNamedExpressions?  )? RPAR;

set: LBRACE starNamedExpressions RBRACE;

// Dicts
// -----

dict
    : LBRACE doubleStarredKvpairs? RBRACE;

doubleStarredKvpairs: doubleStarredKvpair (COMMA doubleStarredKvpair)* COMMA?;

doubleStarredKvpair
    : DOUBLESTAR bitwiseOr  # DoubleStarredKeyValue
    | kvpair                # RegularKvpair
    ;

kvpair: expression COLON expression;

// Comprehensions & Generators
// ---------------------------

forIfClauses
    : forIfClause+;

forIfClause
    : ASYNC? FOR starTargets IN disjunction (IF disjunction )*
    ;

listcomp
    : LSQB namedExpression forIfClauses RSQB;

setcomp
    : LBRACE namedExpression forIfClauses RBRACE;

genexp
    : LPAR ( assignmentExpression | expression) forIfClauses RPAR;

dictcomp
    : LBRACE kvpair forIfClauses RBRACE;

// FUNCTION CALL ARGUMENTS
// =======================

arguments
    : args COMMA?;

args
    : (starredExpression | ( assignmentExpression | expression)) (COMMA (starredExpression | ( assignmentExpression | expression)))* (COMMA kwargs )?  # PositionalArgsWithKwargs
    | kwargs  # KeywordArgs
    ;

kwargs
    : kwargOrStarred (COMMA kwargOrStarred)* (COMMA kwargOrDoubleStarred (COMMA kwargOrDoubleStarred)*)?  # StarredKwargs
    | kwargOrDoubleStarred (COMMA kwargOrDoubleStarred)*  # DoubleStarredKwargs
    ;
//^
    starredExpression
        : STAR expression;

kwargOrStarred
    : name EQUAL expression  # NamedArg
    | starredExpression      # StarredArg
    ;

kwargOrDoubleStarred
    : name EQUAL expression  # NamedDoubleStarArg
    | DOUBLESTAR expression  # DoubleStarredArg
    ;

// ASSIGNMENT TARGETS
// ==================

// Generic targets
// ---------------

// NOTE: starTargets may contain *bitwiseOr, targets may not.
starTargets
    : starTarget (COMMA starTarget )* COMMA?
    ;

starTargetsListSeq: starTarget (COMMA starTarget)* COMMA?;

    starTargetsTupleSeq
        : starTarget (COMMA | (COMMA starTarget )+ COMMA?)
        ;

starTarget
    : STAR (starTarget)      # NestedStarTarget
    | targetWithStarAtom     # SimpleStarTarget
    ;

targetWithStarAtom
    : tPrimary (DOT name | LSQB slices RSQB)  # AttributedStarTarget
    | starAtom                                # AtomicStarTarget
    ;

starAtom
    : name                              # NameStarAtom
    | LPAR targetWithStarAtom RPAR      # ParenthesizedStarAtom
    | LPAR starTargetsTupleSeq? RPAR    # TupleStarAtom
    | LSQB starTargetsListSeq? RSQB     # ListStarAtom
    ;

singleTarget
    : singleSubscriptAttributeTarget  # SubscriptAttributeTarget
    | name                            # NameTarget
    | LPAR singleTarget RPAR          # ParenthesizedTarget
    ;

singleSubscriptAttributeTarget
    : tPrimary (DOT name | LSQB slices RSQB)
    ;

tPrimary
   : tPrimary (DOT name | LSQB slices RSQB | genexp | LPAR arguments? RPAR)  # TPrimaryWithAccess
   | atom                                                                     # TPrimaryAtom
   ;

// Targets for del statements
// --------------------------

delTargets: delTarget (COMMA delTarget)* COMMA?;

delTarget
    : tPrimary (DOT name | LSQB slices RSQB)  # AttributedDelTarget
    | delTAtom                                # AtomicDelTarget
    ;

    delTAtom
        : name                      # NameDelAtom
        | LPAR delTarget RPAR       # ParenthesizedDelAtom
        | LPAR delTargets? RPAR     # TupleDelAtom
        | LSQB delTargets? RSQB     # ListDelAtom
        ;

// TYPING ELEMENTS
// ---------------

// typeExpressions allow */** but ignore them
typeExpressions
    : expression (COMMA expression)* (COMMA (STAR expression (COMMA DOUBLESTAR expression)? | DOUBLESTAR expression))?  # TypeExpressionsWithStar
    | STAR expression (COMMA DOUBLESTAR expression)?  # StarTypeExpression
    | DOUBLESTAR expression                           # DoubleStarTypeExpression
    ;

funcTypeComment
    : NEWLINE TYPE_COMMENT  # NewlineFuncTypeComment
    | TYPE_COMMENT          # InlineFuncTypeComment
    ;

// *** related to soft keywords: https://docs.python.org/3.14/reference/lexical_analysis.html#soft-keywords
   nameExceptUnderscore
       : NAME          # PlainName
       | NAME_OR_TYPE  # TypeName
       | NAME_OR_MATCH # MatchName
       | NAME_OR_CASE  # CaseName
       ;

// ***** Always use name rule instead of NAME token in this grammar *****
name
    : NAME_OR_WILDCARD     # WildcardName
    | nameExceptUnderscore # NonWildcardName
    ;

// ========================= END OF THE GRAMMAR ===========================