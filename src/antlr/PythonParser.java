package antlr;// Generated from C:/Users/Mohammed Shadi/IdeaProjects/Flask Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ENCODING=1, INDENT=2, DEDENT=3, TYPE_COMMENT=4, FSTRING_START=5, FSTRING_MIDDLE=6, 
		FSTRING_END=7, TSTRING_START=8, TSTRING_MIDDLE=9, TSTRING_END=10, BOM=11, 
		LPAR=12, LSQB=13, LBRACE=14, RPAR=15, RSQB=16, RBRACE=17, DOT=18, COLON=19, 
		COMMA=20, SEMI=21, PLUS=22, MINUS=23, STAR=24, SLASH=25, VBAR=26, AMPER=27, 
		LESS=28, GREATER=29, EQUAL=30, PERCENT=31, EQEQUAL=32, NOTEQUAL=33, LESSEQUAL=34, 
		GREATEREQUAL=35, TILDE=36, CIRCUMFLEX=37, LEFTSHIFT=38, RIGHTSHIFT=39, 
		DOUBLESTAR=40, PLUSEQUAL=41, MINEQUAL=42, STAREQUAL=43, SLASHEQUAL=44, 
		PERCENTEQUAL=45, AMPEREQUAL=46, VBAREQUAL=47, CIRCUMFLEXEQUAL=48, LEFTSHIFTEQUAL=49, 
		RIGHTSHIFTEQUAL=50, DOUBLESTAREQUAL=51, DOUBLESLASH=52, DOUBLESLASHEQUAL=53, 
		AT=54, ATEQUAL=55, RARROW=56, ELLIPSIS=57, COLONEQUAL=58, EXCLAMATION=59, 
		FALSE=60, AWAIT=61, ELSE=62, IMPORT=63, PASS=64, NONE=65, BREAK=66, EXCEPT=67, 
		IN=68, RAISE=69, TRUE=70, CLASS=71, FINALLY=72, IS=73, RETURN=74, AND=75, 
		CONTINUE=76, FOR=77, LAMBDA=78, TRY=79, AS=80, DEF=81, FROM=82, NONLOCAL=83, 
		WHILE=84, ASSERT=85, DEL=86, GLOBAL=87, NOT=88, WITH=89, ASYNC=90, ELIF=91, 
		IF=92, OR=93, YIELD=94, NAME_OR_TYPE=95, NAME_OR_MATCH=96, NAME_OR_CASE=97, 
		NAME_OR_WILDCARD=98, NAME=99, NUMBER=100, STRING=101, NEWLINE=102, COMMENT=103, 
		WS=104, EXPLICIT_LINE_JOINING=105, ERRORTOKEN=106;
	public static final int
		RULE_fileInput = 0, RULE_interactive = 1, RULE_eval = 2, RULE_funcType = 3, 
		RULE_statements = 4, RULE_statement = 5, RULE_singleCompoundStmt = 6, 
		RULE_statementNewline = 7, RULE_simpleStmts = 8, RULE_simpleStmt = 9, 
		RULE_compoundStmt = 10, RULE_assignment = 11, RULE_annotatedRhs = 12, 
		RULE_augassign = 13, RULE_returnStmt = 14, RULE_raiseStmt = 15, RULE_passStmt = 16, 
		RULE_breakStmt = 17, RULE_continueStmt = 18, RULE_globalStmt = 19, RULE_nonlocalStmt = 20, 
		RULE_delStmt = 21, RULE_yieldStmt = 22, RULE_assertStmt = 23, RULE_importStmt = 24, 
		RULE_importName = 25, RULE_importFrom = 26, RULE_importFromTargets = 27, 
		RULE_importFromAsNames = 28, RULE_importFromAsName = 29, RULE_dottedAsNames = 30, 
		RULE_dottedAsName = 31, RULE_dottedName = 32, RULE_block = 33, RULE_decorators = 34, 
		RULE_classDef = 35, RULE_classDefRaw = 36, RULE_functionDef = 37, RULE_functionDefRaw = 38, 
		RULE_params = 39, RULE_parameters = 40, RULE_slashNoDefault = 41, RULE_slashWithDefault = 42, 
		RULE_starEtc = 43, RULE_kwds = 44, RULE_paramNoDefault = 45, RULE_paramNoDefaultStarAnnotation = 46, 
		RULE_paramWithDefault = 47, RULE_paramMaybeDefault = 48, RULE_param = 49, 
		RULE_paramStarAnnotation = 50, RULE_annotation = 51, RULE_starAnnotation = 52, 
		RULE_defaultAssignment = 53, RULE_ifStmt = 54, RULE_elifStmt = 55, RULE_elseBlock = 56, 
		RULE_whileStmt = 57, RULE_forStmt = 58, RULE_withStmt = 59, RULE_withItem = 60, 
		RULE_tryStmt = 61, RULE_exceptBlock = 62, RULE_exceptStarBlock = 63, RULE_finallyBlock = 64, 
		RULE_matchStmt = 65, RULE_subjectExpr = 66, RULE_caseBlock = 67, RULE_guard = 68, 
		RULE_patterns = 69, RULE_pattern = 70, RULE_asPattern = 71, RULE_orPattern = 72, 
		RULE_closedPattern = 73, RULE_literalPattern = 74, RULE_literalExpr = 75, 
		RULE_complexNumber = 76, RULE_signedNumber = 77, RULE_signedRealNumber = 78, 
		RULE_realNumber = 79, RULE_imaginaryNumber = 80, RULE_capturePattern = 81, 
		RULE_patternCaptureTarget = 82, RULE_wildcardPattern = 83, RULE_valuePattern = 84, 
		RULE_attr = 85, RULE_nameOrAttr = 86, RULE_groupPattern = 87, RULE_sequencePattern = 88, 
		RULE_openSequencePattern = 89, RULE_maybeSequencePattern = 90, RULE_maybeStarPattern = 91, 
		RULE_starPattern = 92, RULE_mappingPattern = 93, RULE_itemsPattern = 94, 
		RULE_keyValuePattern = 95, RULE_doubleStarPattern = 96, RULE_classPattern = 97, 
		RULE_positionalPatterns = 98, RULE_keywordPatterns = 99, RULE_keywordPattern = 100, 
		RULE_typeAlias = 101, RULE_typeParams = 102, RULE_typeParamSeq = 103, 
		RULE_typeParam = 104, RULE_typeParamBound = 105, RULE_typeParamDefault = 106, 
		RULE_typeParamStarredDefault = 107, RULE_expressions = 108, RULE_expression = 109, 
		RULE_yieldExpr = 110, RULE_starExpressions = 111, RULE_starExpression = 112, 
		RULE_starNamedExpressions = 113, RULE_starNamedExpression = 114, RULE_assignmentExpression = 115, 
		RULE_namedExpression = 116, RULE_disjunction = 117, RULE_conjunction = 118, 
		RULE_inversion = 119, RULE_comparison = 120, RULE_compareOpBitwiseOrPair = 121, 
		RULE_eqBitwiseOr = 122, RULE_noteqBitwiseOr = 123, RULE_lteBitwiseOr = 124, 
		RULE_ltBitwiseOr = 125, RULE_gteBitwiseOr = 126, RULE_gtBitwiseOr = 127, 
		RULE_notinBitwiseOr = 128, RULE_inBitwiseOr = 129, RULE_isnotBitwiseOr = 130, 
		RULE_isBitwiseOr = 131, RULE_bitwiseOr = 132, RULE_bitwiseXor = 133, RULE_bitwiseAnd = 134, 
		RULE_shiftExpr = 135, RULE_sum = 136, RULE_term = 137, RULE_factor = 138, 
		RULE_power = 139, RULE_awaitPrimary = 140, RULE_primary = 141, RULE_slices = 142, 
		RULE_slice = 143, RULE_atom = 144, RULE_group = 145, RULE_lambdef = 146, 
		RULE_lambdaParams = 147, RULE_lambdaParameters = 148, RULE_lambdaSlashNoDefault = 149, 
		RULE_lambdaSlashWithDefault = 150, RULE_lambdaStarEtc = 151, RULE_lambdaKwds = 152, 
		RULE_lambdaParamNoDefault = 153, RULE_lambdaParamWithDefault = 154, RULE_lambdaParamMaybeDefault = 155, 
		RULE_lambdaParam = 156, RULE_fstringMiddle = 157, RULE_fstringReplacementField = 158, 
		RULE_fstringConversion = 159, RULE_fstringFullFormatSpec = 160, RULE_fstringFormatSpec = 161, 
		RULE_fstring = 162, RULE_tstringFormatSpec = 163, RULE_tstringFullFormatSpec = 164, 
		RULE_tstringReplacementField = 165, RULE_tstringMiddle = 166, RULE_tstring = 167, 
		RULE_string = 168, RULE_strings = 169, RULE_listLiteral = 170, RULE_tuple = 171, 
		RULE_set = 172, RULE_dict = 173, RULE_doubleStarredKvpairs = 174, RULE_doubleStarredKvpair = 175, 
		RULE_kvpair = 176, RULE_forIfClauses = 177, RULE_forIfClause = 178, RULE_listcomp = 179, 
		RULE_setcomp = 180, RULE_genexp = 181, RULE_dictcomp = 182, RULE_arguments = 183, 
		RULE_args = 184, RULE_kwargs = 185, RULE_starredExpression = 186, RULE_kwargOrStarred = 187, 
		RULE_kwargOrDoubleStarred = 188, RULE_starTargets = 189, RULE_starTargetsListSeq = 190, 
		RULE_starTargetsTupleSeq = 191, RULE_starTarget = 192, RULE_targetWithStarAtom = 193, 
		RULE_starAtom = 194, RULE_singleTarget = 195, RULE_singleSubscriptAttributeTarget = 196, 
		RULE_tPrimary = 197, RULE_delTargets = 198, RULE_delTarget = 199, RULE_delTAtom = 200, 
		RULE_typeExpressions = 201, RULE_funcTypeComment = 202, RULE_nameExceptUnderscore = 203, 
		RULE_name = 204;
	private static String[] makeRuleNames() {
		return new String[] {
			"fileInput", "interactive", "eval", "funcType", "statements", "statement", 
			"singleCompoundStmt", "statementNewline", "simpleStmts", "simpleStmt", 
			"compoundStmt", "assignment", "annotatedRhs", "augassign", "returnStmt", 
			"raiseStmt", "passStmt", "breakStmt", "continueStmt", "globalStmt", "nonlocalStmt", 
			"delStmt", "yieldStmt", "assertStmt", "importStmt", "importName", "importFrom", 
			"importFromTargets", "importFromAsNames", "importFromAsName", "dottedAsNames", 
			"dottedAsName", "dottedName", "block", "decorators", "classDef", "classDefRaw", 
			"functionDef", "functionDefRaw", "params", "parameters", "slashNoDefault", 
			"slashWithDefault", "starEtc", "kwds", "paramNoDefault", "paramNoDefaultStarAnnotation", 
			"paramWithDefault", "paramMaybeDefault", "param", "paramStarAnnotation", 
			"annotation", "starAnnotation", "defaultAssignment", "ifStmt", "elifStmt", 
			"elseBlock", "whileStmt", "forStmt", "withStmt", "withItem", "tryStmt", 
			"exceptBlock", "exceptStarBlock", "finallyBlock", "matchStmt", "subjectExpr", 
			"caseBlock", "guard", "patterns", "pattern", "asPattern", "orPattern", 
			"closedPattern", "literalPattern", "literalExpr", "complexNumber", "signedNumber", 
			"signedRealNumber", "realNumber", "imaginaryNumber", "capturePattern", 
			"patternCaptureTarget", "wildcardPattern", "valuePattern", "attr", "nameOrAttr", 
			"groupPattern", "sequencePattern", "openSequencePattern", "maybeSequencePattern", 
			"maybeStarPattern", "starPattern", "mappingPattern", "itemsPattern", 
			"keyValuePattern", "doubleStarPattern", "classPattern", "positionalPatterns", 
			"keywordPatterns", "keywordPattern", "typeAlias", "typeParams", "typeParamSeq", 
			"typeParam", "typeParamBound", "typeParamDefault", "typeParamStarredDefault", 
			"expressions", "expression", "yieldExpr", "starExpressions", "starExpression", 
			"starNamedExpressions", "starNamedExpression", "assignmentExpression", 
			"namedExpression", "disjunction", "conjunction", "inversion", "comparison", 
			"compareOpBitwiseOrPair", "eqBitwiseOr", "noteqBitwiseOr", "lteBitwiseOr", 
			"ltBitwiseOr", "gteBitwiseOr", "gtBitwiseOr", "notinBitwiseOr", "inBitwiseOr", 
			"isnotBitwiseOr", "isBitwiseOr", "bitwiseOr", "bitwiseXor", "bitwiseAnd", 
			"shiftExpr", "sum", "term", "factor", "power", "awaitPrimary", "primary", 
			"slices", "slice", "atom", "group", "lambdef", "lambdaParams", "lambdaParameters", 
			"lambdaSlashNoDefault", "lambdaSlashWithDefault", "lambdaStarEtc", "lambdaKwds", 
			"lambdaParamNoDefault", "lambdaParamWithDefault", "lambdaParamMaybeDefault", 
			"lambdaParam", "fstringMiddle", "fstringReplacementField", "fstringConversion", 
			"fstringFullFormatSpec", "fstringFormatSpec", "fstring", "tstringFormatSpec", 
			"tstringFullFormatSpec", "tstringReplacementField", "tstringMiddle", 
			"tstring", "string", "strings", "listLiteral", "tuple", "set", "dict", 
			"doubleStarredKvpairs", "doubleStarredKvpair", "kvpair", "forIfClauses", 
			"forIfClause", "listcomp", "setcomp", "genexp", "dictcomp", "arguments", 
			"args", "kwargs", "starredExpression", "kwargOrStarred", "kwargOrDoubleStarred", 
			"starTargets", "starTargetsListSeq", "starTargetsTupleSeq", "starTarget", 
			"targetWithStarAtom", "starAtom", "singleTarget", "singleSubscriptAttributeTarget", 
			"tPrimary", "delTargets", "delTarget", "delTAtom", "typeExpressions", 
			"funcTypeComment", "nameExceptUnderscore", "name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'\\uFEFF'", 
			"'('", "'['", null, "')'", "']'", null, "'.'", "':'", "','", "';'", "'+'", 
			"'-'", "'*'", "'/'", "'|'", "'&'", "'<'", "'>'", "'='", "'%'", "'=='", 
			"'!='", "'<='", "'>='", "'~'", "'^'", "'<<'", "'>>'", "'**'", "'+='", 
			"'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", 
			"'**='", "'//'", "'//='", "'@'", "'@='", "'->'", "'...'", "':='", "'!'", 
			"'False'", "'await'", "'else'", "'import'", "'pass'", "'None'", "'break'", 
			"'except'", "'in'", "'raise'", "'True'", "'class'", "'finally'", "'is'", 
			"'return'", "'and'", "'continue'", "'for'", "'lambda'", "'try'", "'as'", 
			"'def'", "'from'", "'nonlocal'", "'while'", "'assert'", "'del'", "'global'", 
			"'not'", "'with'", "'async'", "'elif'", "'if'", "'or'", "'yield'", "'type'", 
			"'match'", "'case'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ENCODING", "INDENT", "DEDENT", "TYPE_COMMENT", "FSTRING_START", 
			"FSTRING_MIDDLE", "FSTRING_END", "TSTRING_START", "TSTRING_MIDDLE", "TSTRING_END", 
			"BOM", "LPAR", "LSQB", "LBRACE", "RPAR", "RSQB", "RBRACE", "DOT", "COLON", 
			"COMMA", "SEMI", "PLUS", "MINUS", "STAR", "SLASH", "VBAR", "AMPER", "LESS", 
			"GREATER", "EQUAL", "PERCENT", "EQEQUAL", "NOTEQUAL", "LESSEQUAL", "GREATEREQUAL", 
			"TILDE", "CIRCUMFLEX", "LEFTSHIFT", "RIGHTSHIFT", "DOUBLESTAR", "PLUSEQUAL", 
			"MINEQUAL", "STAREQUAL", "SLASHEQUAL", "PERCENTEQUAL", "AMPEREQUAL", 
			"VBAREQUAL", "CIRCUMFLEXEQUAL", "LEFTSHIFTEQUAL", "RIGHTSHIFTEQUAL", 
			"DOUBLESTAREQUAL", "DOUBLESLASH", "DOUBLESLASHEQUAL", "AT", "ATEQUAL", 
			"RARROW", "ELLIPSIS", "COLONEQUAL", "EXCLAMATION", "FALSE", "AWAIT", 
			"ELSE", "IMPORT", "PASS", "NONE", "BREAK", "EXCEPT", "IN", "RAISE", "TRUE", 
			"CLASS", "FINALLY", "IS", "RETURN", "AND", "CONTINUE", "FOR", "LAMBDA", 
			"TRY", "AS", "DEF", "FROM", "NONLOCAL", "WHILE", "ASSERT", "DEL", "GLOBAL", 
			"NOT", "WITH", "ASYNC", "ELIF", "IF", "OR", "YIELD", "NAME_OR_TYPE", 
			"NAME_OR_MATCH", "NAME_OR_CASE", "NAME_OR_WILDCARD", "NAME", "NUMBER", 
			"STRING", "NEWLINE", "COMMENT", "WS", "EXPLICIT_LINE_JOINING", "ERRORTOKEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "antlr/PythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileInputContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public FileInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFileInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFileInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFileInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileInputContext fileInput() throws RecognitionException {
		FileInputContext _localctx = new FileInputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fileInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5602477867700031200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 274206749927L) != 0)) {
				{
				setState(410);
				statements();
				}
			}

			setState(413);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InteractiveContext extends ParserRuleContext {
		public StatementNewlineContext statementNewline() {
			return getRuleContext(StatementNewlineContext.class,0);
		}
		public InteractiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interactive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInteractive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInteractive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInteractive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteractiveContext interactive() throws RecognitionException {
		InteractiveContext _localctx = new InteractiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interactive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			statementNewline();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EvalContext extends ParserRuleContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public EvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvalContext eval() throws RecognitionException {
		EvalContext _localctx = new EvalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_eval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			expressions();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(418);
				match(NEWLINE);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncTypeContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode RARROW() { return getToken(PythonParser.RARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public TypeExpressionsContext typeExpressions() {
			return getRuleContext(TypeExpressionsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(LPAR);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602880870156890400L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(427);
				typeExpressions();
				}
			}

			setState(430);
			match(RPAR);
			setState(431);
			match(RARROW);
			setState(432);
			expression();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(433);
				match(NEWLINE);
				}
				}
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(439);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(441);
				statement();
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -5602477867700031200L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 274206749927L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementsContext extends StatementContext {
		public SimpleStmtsContext simpleStmts() {
			return getRuleContext(SimpleStmtsContext.class,0);
		}
		public SimpleStatementsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends StatementContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public CompoundStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CompoundStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				compoundStmt();
				}
				break;
			case 2:
				_localctx = new SimpleStatementsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				simpleStmts();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleCompoundStmtContext extends ParserRuleContext {
		public CompoundStmtContext compoundStmt() {
			return getRuleContext(CompoundStmtContext.class,0);
		}
		public SingleCompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCompoundStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleCompoundStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleCompoundStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleCompoundStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCompoundStmtContext singleCompoundStmt() throws RecognitionException {
		SingleCompoundStmtContext _localctx = new SingleCompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleCompoundStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			compoundStmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementNewlineContext extends ParserRuleContext {
		public StatementNewlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNewline; }
	 
		public StatementNewlineContext() { }
		public void copyFrom(StatementNewlineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndOfFileContext extends StatementNewlineContext {
		public TerminalNode EOF() { return getToken(PythonParser.EOF, 0); }
		public EndOfFileContext(StatementNewlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEndOfFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEndOfFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEndOfFile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlankLineContext extends StatementNewlineContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public BlankLineContext(StatementNewlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBlankLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBlankLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBlankLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementNewlineContext extends StatementNewlineContext {
		public SingleCompoundStmtContext singleCompoundStmt() {
			return getRuleContext(SingleCompoundStmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public CompoundStatementNewlineContext(StatementNewlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCompoundStatementNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCompoundStatementNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCompoundStatementNewline(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStatementsNewlineContext extends StatementNewlineContext {
		public SimpleStmtsContext simpleStmts() {
			return getRuleContext(SimpleStmtsContext.class,0);
		}
		public SimpleStatementsNewlineContext(StatementNewlineContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStatementsNewline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStatementsNewline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStatementsNewline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementNewlineContext statementNewline() throws RecognitionException {
		StatementNewlineContext _localctx = new StatementNewlineContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementNewline);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CompoundStatementNewlineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				singleCompoundStmt();
				setState(453);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new SimpleStatementsNewlineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				simpleStmts();
				}
				break;
			case 3:
				_localctx = new BlankLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(456);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new EndOfFileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(457);
				match(EOF);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtsContext extends ParserRuleContext {
		public List<SimpleStmtContext> simpleStmt() {
			return getRuleContexts(SimpleStmtContext.class);
		}
		public SimpleStmtContext simpleStmt(int i) {
			return getRuleContext(SimpleStmtContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PythonParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PythonParser.SEMI, i);
		}
		public SimpleStmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtsContext simpleStmts() throws RecognitionException {
		SimpleStmtsContext _localctx = new SimpleStmtsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleStmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			simpleStmt();
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(461);
					match(SEMI);
					setState(462);
					simpleStmt();
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(468);
				match(SEMI);
				}
			}

			setState(471);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStmtContext extends ParserRuleContext {
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
	 
		public SimpleStmtContext() { }
		public void copyFrom(SimpleStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldStatementContext extends SimpleStmtContext {
		public YieldStmtContext yieldStmt() {
			return getRuleContext(YieldStmtContext.class,0);
		}
		public YieldStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStatementContext extends SimpleStmtContext {
		public GlobalStmtContext globalStmt() {
			return getRuleContext(GlobalStmtContext.class,0);
		}
		public GlobalStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends SimpleStmtContext {
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public ImportStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeleteStatementContext extends SimpleStmtContext {
		public DelStmtContext delStmt() {
			return getRuleContext(DelStmtContext.class,0);
		}
		public DeleteStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDeleteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDeleteStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RaiseStatementContext extends SimpleStmtContext {
		public RaiseStmtContext raiseStmt() {
			return getRuleContext(RaiseStmtContext.class,0);
		}
		public RaiseStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaiseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaiseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRaiseStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends SimpleStmtContext {
		public BreakStmtContext breakStmt() {
			return getRuleContext(BreakStmtContext.class,0);
		}
		public BreakStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarExpressionStatementContext extends SimpleStmtContext {
		public StarExpressionsContext starExpressions() {
			return getRuleContext(StarExpressionsContext.class,0);
		}
		public StarExpressionStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends SimpleStmtContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeAliasStatementContext extends SimpleStmtContext {
		public TypeAliasContext typeAlias() {
			return getRuleContext(TypeAliasContext.class,0);
		}
		public TypeAliasStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeAliasStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeAliasStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeAliasStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends SimpleStmtContext {
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public ReturnStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssertStatementContext extends SimpleStmtContext {
		public AssertStmtContext assertStmt() {
			return getRuleContext(AssertStmtContext.class,0);
		}
		public AssertStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssertStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssertStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonlocalStatementContext extends SimpleStmtContext {
		public NonlocalStmtContext nonlocalStmt() {
			return getRuleContext(NonlocalStmtContext.class,0);
		}
		public NonlocalStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonlocalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonlocalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonlocalStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PassStatementContext extends SimpleStmtContext {
		public PassStmtContext passStmt() {
			return getRuleContext(PassStmtContext.class,0);
		}
		public PassStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPassStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPassStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends SimpleStmtContext {
		public ContinueStmtContext continueStmt() {
			return getRuleContext(ContinueStmtContext.class,0);
		}
		public ContinueStatementContext(SimpleStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleStmt);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				assignment();
				}
				break;
			case 2:
				_localctx = new TypeAliasStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				typeAlias();
				}
				break;
			case 3:
				_localctx = new StarExpressionStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(475);
				starExpressions();
				}
				break;
			case 4:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(476);
				returnStmt();
				}
				break;
			case 5:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				importStmt();
				}
				break;
			case 6:
				_localctx = new RaiseStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(478);
				raiseStmt();
				}
				break;
			case 7:
				_localctx = new PassStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(479);
				passStmt();
				}
				break;
			case 8:
				_localctx = new DeleteStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(480);
				delStmt();
				}
				break;
			case 9:
				_localctx = new YieldStatementContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(481);
				yieldStmt();
				}
				break;
			case 10:
				_localctx = new AssertStatementContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(482);
				assertStmt();
				}
				break;
			case 11:
				_localctx = new BreakStatementContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(483);
				breakStmt();
				}
				break;
			case 12:
				_localctx = new ContinueStatementContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(484);
				continueStmt();
				}
				break;
			case 13:
				_localctx = new GlobalStatementContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(485);
				globalStmt();
				}
				break;
			case 14:
				_localctx = new NonlocalStatementContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(486);
				nonlocalStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStmtContext extends ParserRuleContext {
		public CompoundStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStmt; }
	 
		public CompoundStmtContext() { }
		public void copyFrom(CompoundStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchStatementContext extends CompoundStmtContext {
		public MatchStmtContext matchStmt() {
			return getRuleContext(MatchStmtContext.class,0);
		}
		public MatchStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends CompoundStmtContext {
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public IfStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryStatementContext extends CompoundStmtContext {
		public TryStmtContext tryStmt() {
			return getRuleContext(TryStmtContext.class,0);
		}
		public TryStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends CompoundStmtContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public FunctionDefinitionContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends CompoundStmtContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public WhileStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefinitionContext extends CompoundStmtContext {
		public ClassDefContext classDef() {
			return getRuleContext(ClassDefContext.class,0);
		}
		public ClassDefinitionContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends CompoundStmtContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public ForStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WithStatementContext extends CompoundStmtContext {
		public WithStmtContext withStmt() {
			return getRuleContext(WithStmtContext.class,0);
		}
		public WithStatementContext(CompoundStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStmtContext compoundStmt() throws RecognitionException {
		CompoundStmtContext _localctx = new CompoundStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compoundStmt);
		try {
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new FunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				functionDef();
				}
				break;
			case 2:
				_localctx = new IfStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				ifStmt();
				}
				break;
			case 3:
				_localctx = new ClassDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(491);
				classDef();
				}
				break;
			case 4:
				_localctx = new WithStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(492);
				withStmt();
				}
				break;
			case 5:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				forStmt();
				}
				break;
			case 6:
				_localctx = new TryStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				tryStmt();
				}
				break;
			case 7:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(495);
				whileStmt();
				}
				break;
			case 8:
				_localctx = new MatchStatementContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(496);
				matchStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChainedAssignmentContext extends AssignmentContext {
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public List<StarTargetsContext> starTargets() {
			return getRuleContexts(StarTargetsContext.class);
		}
		public StarTargetsContext starTargets(int i) {
			return getRuleContext(StarTargetsContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(PythonParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PythonParser.EQUAL, i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ChainedAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterChainedAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitChainedAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitChainedAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AugmentedAssignmentContext extends AssignmentContext {
		public SingleTargetContext singleTarget() {
			return getRuleContext(SingleTargetContext.class,0);
		}
		public AugassignContext augassign() {
			return getRuleContext(AugassignContext.class,0);
		}
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public AugmentedAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAugmentedAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAugmentedAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAugmentedAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedAssignmentNameContext extends AssignmentContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public AnnotatedAssignmentNameContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotatedAssignmentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotatedAssignmentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotatedAssignmentName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedAssignmentTargetContext extends AssignmentContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public SingleTargetContext singleTarget() {
			return getRuleContext(SingleTargetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public SingleSubscriptAttributeTargetContext singleSubscriptAttributeTarget() {
			return getRuleContext(SingleSubscriptAttributeTargetContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public AnnotatedAssignmentTargetContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotatedAssignmentTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotatedAssignmentTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotatedAssignmentTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			int _alt;
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new AnnotatedAssignmentNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				name();
				setState(500);
				match(COLON);
				setState(501);
				expression();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(502);
					match(EQUAL);
					setState(503);
					annotatedRhs();
					}
				}

				}
				break;
			case 2:
				_localctx = new AnnotatedAssignmentTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(506);
					match(LPAR);
					setState(507);
					singleTarget();
					setState(508);
					match(RPAR);
					}
					break;
				case 2:
					{
					setState(510);
					singleSubscriptAttributeTarget();
					}
					break;
				}
				setState(513);
				match(COLON);
				setState(514);
				expression();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(515);
					match(EQUAL);
					setState(516);
					annotatedRhs();
					}
				}

				}
				break;
			case 3:
				_localctx = new ChainedAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(522); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(519);
						starTargets();
						setState(520);
						match(EQUAL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(524); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(526);
				annotatedRhs();
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(527);
					match(TYPE_COMMENT);
					}
				}

				}
				break;
			case 4:
				_localctx = new AugmentedAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(530);
				singleTarget();
				setState(531);
				augassign();
				setState(532);
				annotatedRhs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotatedRhsContext extends ParserRuleContext {
		public AnnotatedRhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotatedRhs; }
	 
		public AnnotatedRhsContext() { }
		public void copyFrom(AnnotatedRhsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class YieldAnnotatedRhsContext extends AnnotatedRhsContext {
		public YieldExprContext yieldExpr() {
			return getRuleContext(YieldExprContext.class,0);
		}
		public YieldAnnotatedRhsContext(AnnotatedRhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldAnnotatedRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldAnnotatedRhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldAnnotatedRhs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarExpressionsAnnotatedRhsContext extends AnnotatedRhsContext {
		public StarExpressionsContext starExpressions() {
			return getRuleContext(StarExpressionsContext.class,0);
		}
		public StarExpressionsAnnotatedRhsContext(AnnotatedRhsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarExpressionsAnnotatedRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarExpressionsAnnotatedRhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarExpressionsAnnotatedRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotatedRhsContext annotatedRhs() throws RecognitionException {
		AnnotatedRhsContext _localctx = new AnnotatedRhsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_annotatedRhs);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				_localctx = new YieldAnnotatedRhsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				yieldExpr();
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new StarExpressionsAnnotatedRhsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				starExpressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AugassignContext extends ParserRuleContext {
		public AugassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_augassign; }
	 
		public AugassignContext() { }
		public void copyFrom(AugassignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarAssignContext extends AugassignContext {
		public TerminalNode DOUBLESTAREQUAL() { return getToken(PythonParser.DOUBLESTAREQUAL, 0); }
		public DoubleStarAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusAssignContext extends AugassignContext {
		public TerminalNode MINEQUAL() { return getToken(PythonParser.MINEQUAL, 0); }
		public MinusAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMinusAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMinusAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMinusAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleSlashAssignContext extends AugassignContext {
		public TerminalNode DOUBLESLASHEQUAL() { return getToken(PythonParser.DOUBLESLASHEQUAL, 0); }
		public DoubleSlashAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleSlashAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleSlashAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleSlashAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LeftShiftAssignContext extends AugassignContext {
		public TerminalNode LEFTSHIFTEQUAL() { return getToken(PythonParser.LEFTSHIFTEQUAL, 0); }
		public LeftShiftAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLeftShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLeftShiftAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLeftShiftAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RightShiftAssignContext extends AugassignContext {
		public TerminalNode RIGHTSHIFTEQUAL() { return getToken(PythonParser.RIGHTSHIFTEQUAL, 0); }
		public RightShiftAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRightShiftAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRightShiftAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VBarAssignContext extends AugassignContext {
		public TerminalNode VBAREQUAL() { return getToken(PythonParser.VBAREQUAL, 0); }
		public VBarAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterVBarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitVBarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitVBarAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CircumflexAssignContext extends AugassignContext {
		public TerminalNode CIRCUMFLEXEQUAL() { return getToken(PythonParser.CIRCUMFLEXEQUAL, 0); }
		public CircumflexAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCircumflexAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCircumflexAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCircumflexAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AmpersandAssignContext extends AugassignContext {
		public TerminalNode AMPEREQUAL() { return getToken(PythonParser.AMPEREQUAL, 0); }
		public AmpersandAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAmpersandAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAmpersandAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAmpersandAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusAssignContext extends AugassignContext {
		public TerminalNode PLUSEQUAL() { return getToken(PythonParser.PLUSEQUAL, 0); }
		public PlusAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPlusAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPlusAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlusAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtAssignContext extends AugassignContext {
		public TerminalNode ATEQUAL() { return getToken(PythonParser.ATEQUAL, 0); }
		public AtAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashAssignContext extends AugassignContext {
		public TerminalNode SLASHEQUAL() { return getToken(PythonParser.SLASHEQUAL, 0); }
		public SlashAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlashAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlashAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlashAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PercentAssignContext extends AugassignContext {
		public TerminalNode PERCENTEQUAL() { return getToken(PythonParser.PERCENTEQUAL, 0); }
		public PercentAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPercentAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPercentAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPercentAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarAssignContext extends AugassignContext {
		public TerminalNode STAREQUAL() { return getToken(PythonParser.STAREQUAL, 0); }
		public StarAssignContext(AugassignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AugassignContext augassign() throws RecognitionException {
		AugassignContext _localctx = new AugassignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_augassign);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUSEQUAL:
				_localctx = new PlusAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				match(PLUSEQUAL);
				}
				break;
			case MINEQUAL:
				_localctx = new MinusAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(MINEQUAL);
				}
				break;
			case STAREQUAL:
				_localctx = new StarAssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(542);
				match(STAREQUAL);
				}
				break;
			case ATEQUAL:
				_localctx = new AtAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(543);
				match(ATEQUAL);
				}
				break;
			case SLASHEQUAL:
				_localctx = new SlashAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				match(SLASHEQUAL);
				}
				break;
			case PERCENTEQUAL:
				_localctx = new PercentAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(545);
				match(PERCENTEQUAL);
				}
				break;
			case AMPEREQUAL:
				_localctx = new AmpersandAssignContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(546);
				match(AMPEREQUAL);
				}
				break;
			case VBAREQUAL:
				_localctx = new VBarAssignContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(547);
				match(VBAREQUAL);
				}
				break;
			case CIRCUMFLEXEQUAL:
				_localctx = new CircumflexAssignContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(548);
				match(CIRCUMFLEXEQUAL);
				}
				break;
			case LEFTSHIFTEQUAL:
				_localctx = new LeftShiftAssignContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(549);
				match(LEFTSHIFTEQUAL);
				}
				break;
			case RIGHTSHIFTEQUAL:
				_localctx = new RightShiftAssignContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(550);
				match(RIGHTSHIFTEQUAL);
				}
				break;
			case DOUBLESTAREQUAL:
				_localctx = new DoubleStarAssignContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(551);
				match(DOUBLESTAREQUAL);
				}
				break;
			case DOUBLESLASHEQUAL:
				_localctx = new DoubleSlashAssignContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(552);
				match(DOUBLESLASHEQUAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(PythonParser.RETURN, 0); }
		public StarExpressionsContext starExpressions() {
			return getRuleContext(StarExpressionsContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(RETURN);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(556);
				starExpressions();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RaiseStmtContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(PythonParser.RAISE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public RaiseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raiseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRaiseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRaiseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRaiseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RaiseStmtContext raiseStmt() throws RecognitionException {
		RaiseStmtContext _localctx = new RaiseStmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_raiseStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(RAISE);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770628485408L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(560);
				expression();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(561);
					match(FROM);
					setState(562);
					expression();
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassStmtContext extends ParserRuleContext {
		public TerminalNode PASS() { return getToken(PythonParser.PASS, 0); }
		public PassStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPassStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPassStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPassStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassStmtContext passStmt() throws RecognitionException {
		PassStmtContext _localctx = new PassStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_passStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(PASS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(PythonParser.BREAK, 0); }
		public BreakStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStmtContext breakStmt() throws RecognitionException {
		BreakStmtContext _localctx = new BreakStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_breakStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(PythonParser.CONTINUE, 0); }
		public ContinueStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterContinueStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitContinueStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitContinueStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStmtContext continueStmt() throws RecognitionException {
		ContinueStmtContext _localctx = new ContinueStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_continueStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(CONTINUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalStmtContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(PythonParser.GLOBAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public GlobalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGlobalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGlobalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGlobalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobalStmtContext globalStmt() throws RecognitionException {
		GlobalStmtContext _localctx = new GlobalStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_globalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(GLOBAL);
			setState(574);
			name();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(575);
				match(COMMA);
				setState(576);
				name();
				}
				}
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NonlocalStmtContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(PythonParser.NONLOCAL, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public NonlocalStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocalStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonlocalStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonlocalStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonlocalStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonlocalStmtContext nonlocalStmt() throws RecognitionException {
		NonlocalStmtContext _localctx = new NonlocalStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nonlocalStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(NONLOCAL);
			setState(583);
			name();
			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(584);
				match(COMMA);
				setState(585);
				name();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelStmtContext extends ParserRuleContext {
		public TerminalNode DEL() { return getToken(PythonParser.DEL, 0); }
		public DelTargetsContext delTargets() {
			return getRuleContext(DelTargetsContext.class,0);
		}
		public DelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelStmtContext delStmt() throws RecognitionException {
		DelStmtContext _localctx = new DelStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_delStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(DEL);
			setState(592);
			delTargets();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class YieldStmtContext extends ParserRuleContext {
		public YieldExprContext yieldExpr() {
			return getRuleContext(YieldExprContext.class,0);
		}
		public YieldStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldStmtContext yieldStmt() throws RecognitionException {
		YieldStmtContext _localctx = new YieldStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_yieldStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			yieldExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssertStmtContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(PythonParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public AssertStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssertStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssertStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssertStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertStmtContext assertStmt() throws RecognitionException {
		AssertStmtContext _localctx = new AssertStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assertStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(ASSERT);
			setState(597);
			expression();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(598);
				match(COMMA);
				setState(599);
				expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStmtContext extends ParserRuleContext {
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
	 
		public ImportStmtContext() { }
		public void copyFrom(ImportStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameStatementContext extends ImportStmtContext {
		public ImportNameContext importName() {
			return getRuleContext(ImportNameContext.class,0);
		}
		public ImportNameStatementContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportNameStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportNameStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportNameStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromStatementContext extends ImportStmtContext {
		public ImportFromContext importFrom() {
			return getRuleContext(ImportFromContext.class,0);
		}
		public ImportFromStatementContext(ImportStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_importStmt);
		try {
			setState(604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				_localctx = new ImportNameStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				importName();
				}
				break;
			case FROM:
				_localctx = new ImportFromStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(603);
				importFrom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNameContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public DottedAsNamesContext dottedAsNames() {
			return getRuleContext(DottedAsNamesContext.class,0);
		}
		public ImportNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNameContext importName() throws RecognitionException {
		ImportNameContext _localctx = new ImportNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_importName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(IMPORT);
			setState(607);
			dottedAsNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromContext extends ParserRuleContext {
		public ImportFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFrom; }
	 
		public ImportFromContext() { }
		public void copyFrom(ImportFromContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromRelativeContext extends ImportFromContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public ImportFromTargetsContext importFromTargets() {
			return getRuleContext(ImportFromTargetsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(PythonParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(PythonParser.ELLIPSIS, i);
		}
		public ImportFromRelativeContext(ImportFromContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromRelative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromRelative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromRelative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromDottedContext extends ImportFromContext {
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode IMPORT() { return getToken(PythonParser.IMPORT, 0); }
		public ImportFromTargetsContext importFromTargets() {
			return getRuleContext(ImportFromTargetsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public List<TerminalNode> ELLIPSIS() { return getTokens(PythonParser.ELLIPSIS); }
		public TerminalNode ELLIPSIS(int i) {
			return getToken(PythonParser.ELLIPSIS, i);
		}
		public ImportFromDottedContext(ImportFromContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromDotted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromDotted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromDotted(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromContext importFrom() throws RecognitionException {
		ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importFrom);
		int _la;
		try {
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ImportFromDottedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(609);
				match(FROM);
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT || _la==ELLIPSIS) {
					{
					{
					setState(610);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(615);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(616);
				dottedName(0);
				setState(617);
				match(IMPORT);
				setState(618);
				importFromTargets();
				}
				break;
			case 2:
				_localctx = new ImportFromRelativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(FROM);
				setState(622); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(621);
					_la = _input.LA(1);
					if ( !(_la==DOT || _la==ELLIPSIS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(624); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DOT || _la==ELLIPSIS );
				setState(626);
				match(IMPORT);
				setState(627);
				importFromTargets();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromTargetsContext extends ParserRuleContext {
		public ImportFromTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromTargets; }
	 
		public ImportFromTargetsContext() { }
		public void copyFrom(ImportFromTargetsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromParenthesizedContext extends ImportFromTargetsContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public ImportFromAsNamesContext importFromAsNames() {
			return getRuleContext(ImportFromAsNamesContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ImportFromParenthesizedContext(ImportFromTargetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromParenthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromParenthesized(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromStarContext extends ImportFromTargetsContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ImportFromStarContext(ImportFromTargetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromNameListContext extends ImportFromTargetsContext {
		public ImportFromAsNamesContext importFromAsNames() {
			return getRuleContext(ImportFromAsNamesContext.class,0);
		}
		public ImportFromNameListContext(ImportFromTargetsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromTargetsContext importFromTargets() throws RecognitionException {
		ImportFromTargetsContext _localctx = new ImportFromTargetsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_importFromTargets);
		int _la;
		try {
			setState(639);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				_localctx = new ImportFromParenthesizedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				match(LPAR);
				setState(631);
				importFromAsNames();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(632);
					match(COMMA);
					}
				}

				setState(635);
				match(RPAR);
				}
				break;
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				_localctx = new ImportFromNameListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(637);
				importFromAsNames();
				}
				break;
			case STAR:
				_localctx = new ImportFromStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(638);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromAsNamesContext extends ParserRuleContext {
		public List<ImportFromAsNameContext> importFromAsName() {
			return getRuleContexts(ImportFromAsNameContext.class);
		}
		public ImportFromAsNameContext importFromAsName(int i) {
			return getRuleContext(ImportFromAsNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ImportFromAsNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromAsNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromAsNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromAsNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromAsNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromAsNamesContext importFromAsNames() throws RecognitionException {
		ImportFromAsNamesContext _localctx = new ImportFromAsNamesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_importFromAsNames);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			importFromAsName();
			setState(646);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(642);
					match(COMMA);
					setState(643);
					importFromAsName();
					}
					} 
				}
				setState(648);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportFromAsNameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public ImportFromAsNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromAsName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImportFromAsName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImportFromAsName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImportFromAsName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromAsNameContext importFromAsName() throws RecognitionException {
		ImportFromAsNameContext _localctx = new ImportFromAsNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_importFromAsName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			name();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(650);
				match(AS);
				setState(651);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedAsNamesContext extends ParserRuleContext {
		public List<DottedAsNameContext> dottedAsName() {
			return getRuleContexts(DottedAsNameContext.class);
		}
		public DottedAsNameContext dottedAsName(int i) {
			return getRuleContext(DottedAsNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DottedAsNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedAsNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDottedAsNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDottedAsNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDottedAsNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedAsNamesContext dottedAsNames() throws RecognitionException {
		DottedAsNamesContext _localctx = new DottedAsNamesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dottedAsNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			dottedAsName();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(655);
				match(COMMA);
				setState(656);
				dottedAsName();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedAsNameContext extends ParserRuleContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DottedAsNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedAsName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDottedAsName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDottedAsName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDottedAsName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedAsNameContext dottedAsName() throws RecognitionException {
		DottedAsNameContext _localctx = new DottedAsNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dottedAsName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			dottedName(0);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(663);
				match(AS);
				setState(664);
				name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedNameContext extends ParserRuleContext {
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
	 
		public DottedNameContext() { }
		public void copyFrom(DottedNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DottedNamePathContext extends DottedNameContext {
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public DottedNamePathContext(DottedNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDottedNamePath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDottedNamePath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDottedNamePath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleDottedNameContext extends DottedNameContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public SimpleDottedNameContext(DottedNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleDottedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleDottedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleDottedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		return dottedName(0);
	}

	private DottedNameContext dottedName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DottedNameContext _localctx = new DottedNameContext(_ctx, _parentState);
		DottedNameContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_dottedName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleDottedNameContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(668);
			name();
			}
			_ctx.stop = _input.LT(-1);
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DottedNamePathContext(new DottedNameContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dottedName);
					setState(670);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(671);
					match(DOT);
					setState(672);
					name();
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleBlockContext extends BlockContext {
		public SimpleStmtsContext simpleStmts() {
			return getRuleContext(SimpleStmtsContext.class,0);
		}
		public SimpleBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IndentedBlockContext extends BlockContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public IndentedBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIndentedBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIndentedBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIndentedBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				_localctx = new IndentedBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(NEWLINE);
				setState(679);
				match(INDENT);
				setState(680);
				statements();
				setState(681);
				match(DEDENT);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case IMPORT:
			case PASS:
			case NONE:
			case BREAK:
			case RAISE:
			case TRUE:
			case RETURN:
			case CONTINUE:
			case LAMBDA:
			case FROM:
			case NONLOCAL:
			case ASSERT:
			case DEL:
			case GLOBAL:
			case NOT:
			case YIELD:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new SimpleBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				simpleStmts();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorsContext extends ParserRuleContext {
		public List<TerminalNode> AT() { return getTokens(PythonParser.AT); }
		public TerminalNode AT(int i) {
			return getToken(PythonParser.AT, i);
		}
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PythonParser.NEWLINE, i);
		}
		public DecoratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecorators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecorators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecorators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorsContext decorators() throws RecognitionException {
		DecoratorsContext _localctx = new DecoratorsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_decorators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(686);
				match(AT);
				setState(687);
				namedExpression();
				setState(688);
				match(NEWLINE);
				}
				}
				setState(692); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefContext extends ParserRuleContext {
		public ClassDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDef; }
	 
		public ClassDefContext() { }
		public void copyFrom(ClassDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedClassDefinitionContext extends ClassDefContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public ClassDefRawContext classDefRaw() {
			return getRuleContext(ClassDefRawContext.class,0);
		}
		public DecoratedClassDefinitionContext(ClassDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecoratedClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecoratedClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecoratedClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UndecoratedClassDefinitionContext extends ClassDefContext {
		public ClassDefRawContext classDefRaw() {
			return getRuleContext(ClassDefRawContext.class,0);
		}
		public UndecoratedClassDefinitionContext(ClassDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUndecoratedClassDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUndecoratedClassDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUndecoratedClassDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefContext classDef() throws RecognitionException {
		ClassDefContext _localctx = new ClassDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_classDef);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new DecoratedClassDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				decorators();
				setState(695);
				classDefRaw();
				}
				break;
			case CLASS:
				_localctx = new UndecoratedClassDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				classDefRaw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDefRawContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(PythonParser.CLASS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeParamsContext typeParams() {
			return getRuleContext(TypeParamsContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassDefRawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDefRaw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassDefRaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassDefRaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassDefRaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDefRawContext classDefRaw() throws RecognitionException {
		ClassDefRawContext _localctx = new ClassDefRawContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classDefRaw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(CLASS);
			setState(701);
			name();
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB) {
				{
				setState(702);
				typeParams();
				}
			}

			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(705);
				match(LPAR);
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602880870156890400L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(706);
					arguments();
					}
				}

				setState(709);
				match(RPAR);
				}
			}

			setState(712);
			match(COLON);
			setState(713);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefContext extends ParserRuleContext {
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
	 
		public FunctionDefContext() { }
		public void copyFrom(FunctionDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecoratedFunctionDefinitionContext extends FunctionDefContext {
		public DecoratorsContext decorators() {
			return getRuleContext(DecoratorsContext.class,0);
		}
		public FunctionDefRawContext functionDefRaw() {
			return getRuleContext(FunctionDefRawContext.class,0);
		}
		public DecoratedFunctionDefinitionContext(FunctionDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDecoratedFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDecoratedFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDecoratedFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UndecoratedFunctionDefinitionContext extends FunctionDefContext {
		public FunctionDefRawContext functionDefRaw() {
			return getRuleContext(FunctionDefRawContext.class,0);
		}
		public UndecoratedFunctionDefinitionContext(FunctionDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUndecoratedFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUndecoratedFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUndecoratedFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_functionDef);
		try {
			setState(719);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new DecoratedFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(715);
				decorators();
				setState(716);
				functionDefRaw();
				}
				break;
			case DEF:
			case ASYNC:
				_localctx = new UndecoratedFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				functionDefRaw();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefRawContext extends ParserRuleContext {
		public FunctionDefRawContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefRaw; }
	 
		public FunctionDefRawContext() { }
		public void copyFrom(FunctionDefRawContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends FunctionDefRawContext {
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeParamsContext typeParams() {
			return getRuleContext(TypeParamsContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(PythonParser.RARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncTypeCommentContext funcTypeComment() {
			return getRuleContext(FuncTypeCommentContext.class,0);
		}
		public RegularFunctionContext(FunctionDefRawContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncFunctionContext extends FunctionDefRawContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode DEF() { return getToken(PythonParser.DEF, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TypeParamsContext typeParams() {
			return getRuleContext(TypeParamsContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(PythonParser.RARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncTypeCommentContext funcTypeComment() {
			return getRuleContext(FuncTypeCommentContext.class,0);
		}
		public AsyncFunctionContext(FunctionDefRawContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefRawContext functionDefRaw() throws RecognitionException {
		FunctionDefRawContext _localctx = new FunctionDefRawContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_functionDefRaw);
		int _la;
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				_localctx = new RegularFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(721);
				match(DEF);
				setState(722);
				name();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQB) {
					{
					setState(723);
					typeParams();
					}
				}

				setState(726);
				match(LPAR);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					setState(727);
					params();
					}
				}

				setState(730);
				match(RPAR);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(731);
					match(RARROW);
					setState(732);
					expression();
					}
				}

				setState(735);
				match(COLON);
				setState(737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(736);
					funcTypeComment();
					}
					break;
				}
				setState(739);
				block();
				}
				break;
			case ASYNC:
				_localctx = new AsyncFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(ASYNC);
				setState(742);
				match(DEF);
				setState(743);
				name();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQB) {
					{
					setState(744);
					typeParams();
					}
				}

				setState(747);
				match(LPAR);
				setState(749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					setState(748);
					params();
					}
				}

				setState(751);
				match(RPAR);
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(752);
					match(RARROW);
					setState(753);
					expression();
					}
				}

				setState(756);
				match(COLON);
				setState(758);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(757);
					funcTypeComment();
					}
					break;
				}
				setState(760);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularParametersContext extends ParametersContext {
		public List<ParamNoDefaultContext> paramNoDefault() {
			return getRuleContexts(ParamNoDefaultContext.class);
		}
		public ParamNoDefaultContext paramNoDefault(int i) {
			return getRuleContext(ParamNoDefaultContext.class,i);
		}
		public List<ParamWithDefaultContext> paramWithDefault() {
			return getRuleContexts(ParamWithDefaultContext.class);
		}
		public ParamWithDefaultContext paramWithDefault(int i) {
			return getRuleContext(ParamWithDefaultContext.class,i);
		}
		public StarEtcContext starEtc() {
			return getRuleContext(StarEtcContext.class,0);
		}
		public RegularParametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularParameters(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParametersContext extends ParametersContext {
		public StarEtcContext starEtc() {
			return getRuleContext(StarEtcContext.class,0);
		}
		public StarParametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParameters(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalOnlyWithSlashAndDefaultsContext extends ParametersContext {
		public SlashWithDefaultContext slashWithDefault() {
			return getRuleContext(SlashWithDefaultContext.class,0);
		}
		public List<ParamWithDefaultContext> paramWithDefault() {
			return getRuleContexts(ParamWithDefaultContext.class);
		}
		public ParamWithDefaultContext paramWithDefault(int i) {
			return getRuleContext(ParamWithDefaultContext.class,i);
		}
		public StarEtcContext starEtc() {
			return getRuleContext(StarEtcContext.class,0);
		}
		public PositionalOnlyWithSlashAndDefaultsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalOnlyWithSlashAndDefaults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalOnlyWithSlashAndDefaults(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalOnlyWithSlashAndDefaults(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalOnlyWithSlashContext extends ParametersContext {
		public SlashNoDefaultContext slashNoDefault() {
			return getRuleContext(SlashNoDefaultContext.class,0);
		}
		public List<ParamNoDefaultContext> paramNoDefault() {
			return getRuleContexts(ParamNoDefaultContext.class);
		}
		public ParamNoDefaultContext paramNoDefault(int i) {
			return getRuleContext(ParamNoDefaultContext.class,i);
		}
		public List<ParamWithDefaultContext> paramWithDefault() {
			return getRuleContexts(ParamWithDefaultContext.class);
		}
		public ParamWithDefaultContext paramWithDefault(int i) {
			return getRuleContext(ParamWithDefaultContext.class,i);
		}
		public StarEtcContext starEtc() {
			return getRuleContext(StarEtcContext.class,0);
		}
		public PositionalOnlyWithSlashContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalOnlyWithSlash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalOnlyWithSlash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalOnlyWithSlash(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParametersWithDefaultsContext extends ParametersContext {
		public List<ParamWithDefaultContext> paramWithDefault() {
			return getRuleContexts(ParamWithDefaultContext.class);
		}
		public ParamWithDefaultContext paramWithDefault(int i) {
			return getRuleContext(ParamWithDefaultContext.class,i);
		}
		public StarEtcContext starEtc() {
			return getRuleContext(StarEtcContext.class,0);
		}
		public ParametersWithDefaultsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParametersWithDefaults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParametersWithDefaults(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParametersWithDefaults(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameters);
		int _la;
		try {
			int _alt;
			setState(815);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new PositionalOnlyWithSlashContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				slashNoDefault();
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(767);
						paramNoDefault();
						}
						} 
					}
					setState(772);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(773);
					paramWithDefault();
					}
					}
					setState(778);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(779);
					starEtc();
					}
				}

				}
				break;
			case 2:
				_localctx = new PositionalOnlyWithSlashAndDefaultsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				slashWithDefault();
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(783);
					paramWithDefault();
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(789);
					starEtc();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegularParametersContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(793); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(792);
						paramNoDefault();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(795); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(797);
					paramWithDefault();
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(803);
					starEtc();
					}
				}

				}
				break;
			case 4:
				_localctx = new ParametersWithDefaultsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(807); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(806);
					paramWithDefault();
					}
					}
					setState(809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(811);
					starEtc();
					}
				}

				}
				break;
			case 5:
				_localctx = new StarParametersContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(814);
				starEtc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlashNoDefaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<ParamNoDefaultContext> paramNoDefault() {
			return getRuleContexts(ParamNoDefaultContext.class);
		}
		public ParamNoDefaultContext paramNoDefault(int i) {
			return getRuleContext(ParamNoDefaultContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public SlashNoDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slashNoDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlashNoDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlashNoDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlashNoDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashNoDefaultContext slashNoDefault() throws RecognitionException {
		SlashNoDefaultContext _localctx = new SlashNoDefaultContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_slashNoDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(817);
				paramNoDefault();
				}
				}
				setState(820); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
			setState(822);
			match(SLASH);
			setState(824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(823);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlashWithDefaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<ParamNoDefaultContext> paramNoDefault() {
			return getRuleContexts(ParamNoDefaultContext.class);
		}
		public ParamNoDefaultContext paramNoDefault(int i) {
			return getRuleContext(ParamNoDefaultContext.class,i);
		}
		public List<ParamWithDefaultContext> paramWithDefault() {
			return getRuleContexts(ParamWithDefaultContext.class);
		}
		public ParamWithDefaultContext paramWithDefault(int i) {
			return getRuleContext(ParamWithDefaultContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public SlashWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slashWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSlashWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSlashWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSlashWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlashWithDefaultContext slashWithDefault() throws RecognitionException {
		SlashWithDefaultContext _localctx = new SlashWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_slashWithDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(826);
					paramNoDefault();
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			setState(833); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(832);
				paramWithDefault();
				}
				}
				setState(835); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
			setState(837);
			match(SLASH);
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(838);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarEtcContext extends ParserRuleContext {
		public StarEtcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starEtc; }
	 
		public StarEtcContext() { }
		public void copyFrom(StarEtcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareStarParamContext extends StarEtcContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<ParamMaybeDefaultContext> paramMaybeDefault() {
			return getRuleContexts(ParamMaybeDefaultContext.class);
		}
		public ParamMaybeDefaultContext paramMaybeDefault(int i) {
			return getRuleContext(ParamMaybeDefaultContext.class,i);
		}
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public BareStarParamContext(StarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBareStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBareStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBareStarParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParamWithAnnotationContext extends StarEtcContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ParamNoDefaultStarAnnotationContext paramNoDefaultStarAnnotation() {
			return getRuleContext(ParamNoDefaultStarAnnotationContext.class,0);
		}
		public List<ParamMaybeDefaultContext> paramMaybeDefault() {
			return getRuleContexts(ParamMaybeDefaultContext.class);
		}
		public ParamMaybeDefaultContext paramMaybeDefault(int i) {
			return getRuleContext(ParamMaybeDefaultContext.class,i);
		}
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public StarParamWithAnnotationContext(StarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParamWithAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParamWithAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParamWithAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarParamContext extends StarEtcContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ParamNoDefaultContext paramNoDefault() {
			return getRuleContext(ParamNoDefaultContext.class,0);
		}
		public List<ParamMaybeDefaultContext> paramMaybeDefault() {
			return getRuleContexts(ParamMaybeDefaultContext.class);
		}
		public ParamMaybeDefaultContext paramMaybeDefault(int i) {
			return getRuleContext(ParamMaybeDefaultContext.class,i);
		}
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public StarParamContext(StarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordOnlyParamsContext extends StarEtcContext {
		public KwdsContext kwds() {
			return getRuleContext(KwdsContext.class,0);
		}
		public KeywordOnlyParamsContext(StarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeywordOnlyParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeywordOnlyParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordOnlyParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarEtcContext starEtc() throws RecognitionException {
		StarEtcContext _localctx = new StarEtcContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_starEtc);
		int _la;
		try {
			setState(874);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new StarParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				match(STAR);
				setState(842);
				paramNoDefault();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(843);
					paramMaybeDefault();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(849);
					kwds();
					}
				}

				}
				break;
			case 2:
				_localctx = new StarParamWithAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(STAR);
				setState(853);
				paramNoDefaultStarAnnotation();
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(854);
					paramMaybeDefault();
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(860);
					kwds();
					}
				}

				}
				break;
			case 3:
				_localctx = new BareStarParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(863);
				match(STAR);
				setState(864);
				match(COMMA);
				setState(866); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(865);
					paramMaybeDefault();
					}
					}
					setState(868); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(870);
					kwds();
					}
				}

				}
				break;
			case 4:
				_localctx = new KeywordOnlyParamsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(873);
				kwds();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KwdsContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public ParamNoDefaultContext paramNoDefault() {
			return getRuleContext(ParamNoDefaultContext.class,0);
		}
		public KwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKwds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKwds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKwds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwdsContext kwds() throws RecognitionException {
		KwdsContext _localctx = new KwdsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_kwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(DOUBLESTAR);
			setState(877);
			paramNoDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamNoDefaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ParamNoDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramNoDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamNoDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamNoDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamNoDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamNoDefaultContext paramNoDefault() throws RecognitionException {
		ParamNoDefaultContext _localctx = new ParamNoDefaultContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_paramNoDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			param();
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(880);
				match(COMMA);
				}
			}

			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(883);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamNoDefaultStarAnnotationContext extends ParserRuleContext {
		public ParamStarAnnotationContext paramStarAnnotation() {
			return getRuleContext(ParamStarAnnotationContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ParamNoDefaultStarAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramNoDefaultStarAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamNoDefaultStarAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamNoDefaultStarAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamNoDefaultStarAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamNoDefaultStarAnnotationContext paramNoDefaultStarAnnotation() throws RecognitionException {
		ParamNoDefaultStarAnnotationContext _localctx = new ParamNoDefaultStarAnnotationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_paramNoDefaultStarAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			paramStarAnnotation();
			setState(888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(887);
				match(COMMA);
				}
			}

			setState(891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(890);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamWithDefaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public DefaultAssignmentContext defaultAssignment() {
			return getRuleContext(DefaultAssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ParamWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamWithDefaultContext paramWithDefault() throws RecognitionException {
		ParamWithDefaultContext _localctx = new ParamWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_paramWithDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			param();
			setState(894);
			defaultAssignment();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(895);
				match(COMMA);
				}
			}

			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(898);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamMaybeDefaultContext extends ParserRuleContext {
		public ParamContext param() {
			return getRuleContext(ParamContext.class,0);
		}
		public DefaultAssignmentContext defaultAssignment() {
			return getRuleContext(DefaultAssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ParamMaybeDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramMaybeDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamMaybeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamMaybeDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamMaybeDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamMaybeDefaultContext paramMaybeDefault() throws RecognitionException {
		ParamMaybeDefaultContext _localctx = new ParamMaybeDefaultContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_paramMaybeDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901);
			param();
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(902);
				defaultAssignment();
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(905);
				match(COMMA);
				}
			}

			setState(909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(908);
				match(TYPE_COMMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			name();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(912);
				annotation();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamStarAnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StarAnnotationContext starAnnotation() {
			return getRuleContext(StarAnnotationContext.class,0);
		}
		public ParamStarAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramStarAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParamStarAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParamStarAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParamStarAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamStarAnnotationContext paramStarAnnotation() throws RecognitionException {
		ParamStarAnnotationContext _localctx = new ParamStarAnnotationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_paramStarAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			name();
			setState(916);
			starAnnotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			match(COLON);
			setState(919);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarAnnotationContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public StarExpressionContext starExpression() {
			return getRuleContext(StarExpressionContext.class,0);
		}
		public StarAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarAnnotationContext starAnnotation() throws RecognitionException {
		StarAnnotationContext _localctx = new StarAnnotationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_starAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(921);
			match(COLON);
			setState(922);
			starExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultAssignmentContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDefaultAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDefaultAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDefaultAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultAssignmentContext defaultAssignment() throws RecognitionException {
		DefaultAssignmentContext _localctx = new DefaultAssignmentContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_defaultAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(924);
			match(EQUAL);
			setState(925);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifStmtContext elifStmt() {
			return getRuleContext(ElifStmtContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			match(IF);
			setState(928);
			namedExpression();
			setState(929);
			match(COLON);
			setState(930);
			block();
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(931);
				elifStmt();
				}
				break;
			case EOF:
			case DEDENT:
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case AT:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case ELSE:
			case IMPORT:
			case PASS:
			case NONE:
			case BREAK:
			case RAISE:
			case TRUE:
			case CLASS:
			case RETURN:
			case CONTINUE:
			case FOR:
			case LAMBDA:
			case TRY:
			case DEF:
			case FROM:
			case NONLOCAL:
			case WHILE:
			case ASSERT:
			case DEL:
			case GLOBAL:
			case NOT:
			case WITH:
			case ASYNC:
			case IF:
			case YIELD:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
			case NEWLINE:
				{
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(932);
					elseBlock();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifStmtContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(PythonParser.ELIF, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifStmtContext elifStmt() {
			return getRuleContext(ElifStmtContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ElifStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElifStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElifStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElifStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifStmtContext elifStmt() throws RecognitionException {
		ElifStmtContext _localctx = new ElifStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_elifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			match(ELIF);
			setState(938);
			namedExpression();
			setState(939);
			match(COLON);
			setState(940);
			block();
			setState(945);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(941);
				elifStmt();
				}
				break;
			case EOF:
			case DEDENT:
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case STAR:
			case TILDE:
			case AT:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case ELSE:
			case IMPORT:
			case PASS:
			case NONE:
			case BREAK:
			case RAISE:
			case TRUE:
			case CLASS:
			case RETURN:
			case CONTINUE:
			case FOR:
			case LAMBDA:
			case TRY:
			case DEF:
			case FROM:
			case NONLOCAL:
			case WHILE:
			case ASSERT:
			case DEL:
			case GLOBAL:
			case NOT:
			case WITH:
			case ASYNC:
			case IF:
			case YIELD:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
			case NEWLINE:
				{
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(942);
					elseBlock();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(ELSE);
			setState(948);
			match(COLON);
			setState(949);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PythonParser.WHILE, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whileStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			match(WHILE);
			setState(952);
			namedExpression();
			setState(953);
			match(COLON);
			setState(954);
			block();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(955);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public StarTargetsContext starTargets() {
			return getRuleContext(StarTargetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public StarExpressionsContext starExpressions() {
			return getRuleContext(StarExpressionsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(958);
				match(ASYNC);
				}
			}

			setState(961);
			match(FOR);
			setState(962);
			starTargets();
			setState(963);
			match(IN);
			setState(964);
			starExpressions();
			setState(965);
			match(COLON);
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE_COMMENT) {
				{
				setState(966);
				match(TYPE_COMMENT);
				}
			}

			setState(969);
			block();
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(970);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithStmtContext extends ParserRuleContext {
		public WithStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withStmt; }
	 
		public WithStmtContext() { }
		public void copyFrom(WithStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularWithItemsContext extends WithStmtContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public List<WithItemContext> withItem() {
			return getRuleContexts(WithItemContext.class);
		}
		public WithItemContext withItem(int i) {
			return getRuleContext(WithItemContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public RegularWithItemsContext(WithStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularWithItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularWithItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularWithItems(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedWithItemsContext extends WithStmtContext {
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public List<WithItemContext> withItem() {
			return getRuleContexts(WithItemContext.class);
		}
		public WithItemContext withItem(int i) {
			return getRuleContext(WithItemContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public ParenthesizedWithItemsContext(WithStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenthesizedWithItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenthesizedWithItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenthesizedWithItems(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsyncParenthesizedWithItemsContext extends WithStmtContext {
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public TerminalNode WITH() { return getToken(PythonParser.WITH, 0); }
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public List<WithItemContext> withItem() {
			return getRuleContexts(WithItemContext.class);
		}
		public WithItemContext withItem(int i) {
			return getRuleContext(WithItemContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public AsyncParenthesizedWithItemsContext(WithStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsyncParenthesizedWithItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsyncParenthesizedWithItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsyncParenthesizedWithItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithStmtContext withStmt() throws RecognitionException {
		WithStmtContext _localctx = new WithStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_withStmt);
		int _la;
		try {
			int _alt;
			setState(1029);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				_localctx = new ParenthesizedWithItemsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				match(WITH);
				setState(974);
				match(LPAR);
				setState(975);
				withItem();
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(976);
						match(COMMA);
						setState(977);
						withItem();
						}
						} 
					}
					setState(982);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				}
				setState(984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(983);
					match(COMMA);
					}
				}

				setState(986);
				match(RPAR);
				setState(987);
				match(COLON);
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(988);
					match(TYPE_COMMENT);
					}
				}

				setState(991);
				block();
				}
				break;
			case 2:
				_localctx = new AsyncParenthesizedWithItemsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(993);
				match(ASYNC);
				setState(994);
				match(WITH);
				setState(995);
				match(LPAR);
				setState(996);
				withItem();
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(997);
						match(COMMA);
						setState(998);
						withItem();
						}
						} 
					}
					setState(1003);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				setState(1005);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1004);
					match(COMMA);
					}
				}

				setState(1007);
				match(RPAR);
				setState(1008);
				match(COLON);
				setState(1009);
				block();
				}
				break;
			case 3:
				_localctx = new RegularWithItemsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASYNC) {
					{
					setState(1011);
					match(ASYNC);
					}
				}

				setState(1014);
				match(WITH);
				setState(1015);
				withItem();
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1016);
					match(COMMA);
					setState(1017);
					withItem();
					}
					}
					setState(1022);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1023);
				match(COLON);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TYPE_COMMENT) {
					{
					setState(1024);
					match(TYPE_COMMENT);
					}
				}

				setState(1027);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WithItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public StarTargetContext starTarget() {
			return getRuleContext(StarTargetContext.class,0);
		}
		public WithItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWithItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWithItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWithItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithItemContext withItem() throws RecognitionException {
		WithItemContext _localctx = new WithItemContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_withItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			expression();
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1032);
				match(AS);
				setState(1033);
				starTarget();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryStmtContext extends ParserRuleContext {
		public TryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStmt; }
	 
		public TryStmtContext() { }
		public void copyFrom(TryStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryExceptContext extends TryStmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExceptBlockContext> exceptBlock() {
			return getRuleContexts(ExceptBlockContext.class);
		}
		public ExceptBlockContext exceptBlock(int i) {
			return getRuleContext(ExceptBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExceptContext(TryStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryExcept(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryExcept(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryExcept(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryExceptStarContext extends TryStmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExceptStarBlockContext> exceptStarBlock() {
			return getRuleContexts(ExceptStarBlockContext.class);
		}
		public ExceptStarBlockContext exceptStarBlock(int i) {
			return getRuleContext(ExceptStarBlockContext.class,i);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryExceptStarContext(TryStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryExceptStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryExceptStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryExceptStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TryFinallyContext extends TryStmtContext {
		public TerminalNode TRY() { return getToken(PythonParser.TRY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public TryFinallyContext(TryStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTryFinally(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTryFinally(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTryFinally(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryStmtContext tryStmt() throws RecognitionException {
		TryStmtContext _localctx = new TryStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_tryStmt);
		int _la;
		try {
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				_localctx = new TryFinallyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1036);
				match(TRY);
				setState(1037);
				match(COLON);
				setState(1038);
				block();
				setState(1039);
				finallyBlock();
				}
				break;
			case 2:
				_localctx = new TryExceptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1041);
				match(TRY);
				setState(1042);
				match(COLON);
				setState(1043);
				block();
				setState(1045); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1044);
					exceptBlock();
					}
					}
					setState(1047); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1049);
					elseBlock();
					}
				}

				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1052);
					finallyBlock();
					}
				}

				}
				break;
			case 3:
				_localctx = new TryExceptStarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1055);
				match(TRY);
				setState(1056);
				match(COLON);
				setState(1057);
				block();
				setState(1059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1058);
					exceptStarBlock();
					}
					}
					setState(1061); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==EXCEPT );
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1063);
					elseBlock();
					}
				}

				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(1066);
					finallyBlock();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptBlockContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExceptBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExceptBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExceptBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExceptBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptBlockContext exceptBlock() throws RecognitionException {
		ExceptBlockContext _localctx = new ExceptBlockContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_exceptBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			match(EXCEPT);
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1072);
				expression();
				setState(1075);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1073);
					match(AS);
					setState(1074);
					name();
					}
				}

				}
				break;
			case 2:
				{
				setState(1077);
				expressions();
				}
				break;
			}
			setState(1080);
			match(COLON);
			setState(1081);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExceptStarBlockContext extends ParserRuleContext {
		public TerminalNode EXCEPT() { return getToken(PythonParser.EXCEPT, 0); }
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExceptStarBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptStarBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExceptStarBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExceptStarBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExceptStarBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExceptStarBlockContext exceptStarBlock() throws RecognitionException {
		ExceptStarBlockContext _localctx = new ExceptStarBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exceptStarBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			match(EXCEPT);
			setState(1084);
			match(STAR);
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1085);
				expression();
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(1086);
					match(AS);
					setState(1087);
					name();
					}
				}

				}
				break;
			case 2:
				{
				setState(1090);
				expressions();
				}
				break;
			}
			setState(1093);
			match(COLON);
			setState(1094);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(PythonParser.FINALLY, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFinallyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFinallyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1096);
			match(FINALLY);
			setState(1097);
			match(COLON);
			setState(1098);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchStmtContext extends ParserRuleContext {
		public TerminalNode NAME_OR_MATCH() { return getToken(PythonParser.NAME_OR_MATCH, 0); }
		public SubjectExprContext subjectExpr() {
			return getRuleContext(SubjectExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(PythonParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(PythonParser.DEDENT, 0); }
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public MatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchStmtContext matchStmt() throws RecognitionException {
		MatchStmtContext _localctx = new MatchStmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_matchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(NAME_OR_MATCH);
			setState(1101);
			subjectExpr();
			setState(1102);
			match(COLON);
			setState(1103);
			match(NEWLINE);
			setState(1104);
			match(INDENT);
			setState(1106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1105);
				caseBlock();
				}
				}
				setState(1108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME_OR_CASE );
			setState(1110);
			match(DEDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubjectExprContext extends ParserRuleContext {
		public SubjectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subjectExpr; }
	 
		public SubjectExprContext() { }
		public void copyFrom(SubjectExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubjectExprSingleContext extends SubjectExprContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public SubjectExprSingleContext(SubjectExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubjectExprSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubjectExprSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubjectExprSingle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubjectExprMultipleContext extends SubjectExprContext {
		public StarNamedExpressionContext starNamedExpression() {
			return getRuleContext(StarNamedExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public StarNamedExpressionsContext starNamedExpressions() {
			return getRuleContext(StarNamedExpressionsContext.class,0);
		}
		public SubjectExprMultipleContext(SubjectExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubjectExprMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubjectExprMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubjectExprMultiple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectExprContext subjectExpr() throws RecognitionException {
		SubjectExprContext _localctx = new SubjectExprContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_subjectExpr);
		int _la;
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new SubjectExprMultipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				starNamedExpression();
				setState(1113);
				match(COMMA);
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(1114);
					starNamedExpressions();
					}
				}

				}
				break;
			case 2:
				_localctx = new SubjectExprSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1117);
				namedExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode NAME_OR_CASE() { return getToken(PythonParser.NAME_OR_CASE, 0); }
		public PatternsContext patterns() {
			return getRuleContext(PatternsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GuardContext guard() {
			return getRuleContext(GuardContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(NAME_OR_CASE);
			setState(1121);
			patterns();
			setState(1123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1122);
				guard();
				}
			}

			setState(1125);
			match(COLON);
			setState(1126);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_guard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1128);
			match(IF);
			setState(1129);
			namedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternsContext extends ParserRuleContext {
		public PatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patterns; }
	 
		public PatternsContext() { }
		public void copyFrom(PatternsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternsSequenceContext extends PatternsContext {
		public OpenSequencePatternContext openSequencePattern() {
			return getRuleContext(OpenSequencePatternContext.class,0);
		}
		public PatternsSequenceContext(PatternsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPatternsSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPatternsSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPatternsSequence(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PatternsSingleContext extends PatternsContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternsSingleContext(PatternsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPatternsSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPatternsSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPatternsSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternsContext patterns() throws RecognitionException {
		PatternsContext _localctx = new PatternsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_patterns);
		try {
			setState(1133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new PatternsSequenceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1131);
				openSequencePattern();
				}
				break;
			case 2:
				_localctx = new PatternsSingleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1132);
				pattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
	 
		public PatternContext() { }
		public void copyFrom(PatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsPatternMatchContext extends PatternContext {
		public AsPatternContext asPattern() {
			return getRuleContext(AsPatternContext.class,0);
		}
		public AsPatternMatchContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsPatternMatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsPatternMatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsPatternMatch(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrPatternAlternativesContext extends PatternContext {
		public OrPatternContext orPattern() {
			return getRuleContext(OrPatternContext.class,0);
		}
		public OrPatternAlternativesContext(PatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOrPatternAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOrPatternAlternatives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrPatternAlternatives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pattern);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new AsPatternMatchContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1135);
				asPattern();
				}
				break;
			case 2:
				_localctx = new OrPatternAlternativesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1136);
				orPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsPatternContext extends ParserRuleContext {
		public OrPatternContext orPattern() {
			return getRuleContext(OrPatternContext.class,0);
		}
		public TerminalNode AS() { return getToken(PythonParser.AS, 0); }
		public PatternCaptureTargetContext patternCaptureTarget() {
			return getRuleContext(PatternCaptureTargetContext.class,0);
		}
		public AsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsPatternContext asPattern() throws RecognitionException {
		AsPatternContext _localctx = new AsPatternContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_asPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			orPattern();
			setState(1140);
			match(AS);
			setState(1141);
			patternCaptureTarget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrPatternContext extends ParserRuleContext {
		public List<ClosedPatternContext> closedPattern() {
			return getRuleContexts(ClosedPatternContext.class);
		}
		public ClosedPatternContext closedPattern(int i) {
			return getRuleContext(ClosedPatternContext.class,i);
		}
		public List<TerminalNode> VBAR() { return getTokens(PythonParser.VBAR); }
		public TerminalNode VBAR(int i) {
			return getToken(PythonParser.VBAR, i);
		}
		public OrPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOrPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOrPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOrPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrPatternContext orPattern() throws RecognitionException {
		OrPatternContext _localctx = new OrPatternContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_orPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			closedPattern();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VBAR) {
				{
				{
				setState(1144);
				match(VBAR);
				setState(1145);
				closedPattern();
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClosedPatternContext extends ParserRuleContext {
		public ClosedPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closedPattern; }
	 
		public ClosedPatternContext() { }
		public void copyFrom(ClosedPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupClosedPatternContext extends ClosedPatternContext {
		public GroupPatternContext groupPattern() {
			return getRuleContext(GroupPatternContext.class,0);
		}
		public GroupClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroupClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroupClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGroupClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MappingClosedPatternContext extends ClosedPatternContext {
		public MappingPatternContext mappingPattern() {
			return getRuleContext(MappingPatternContext.class,0);
		}
		public MappingClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMappingClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMappingClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMappingClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralClosedPatternContext extends ClosedPatternContext {
		public LiteralPatternContext literalPattern() {
			return getRuleContext(LiteralPatternContext.class,0);
		}
		public LiteralClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLiteralClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLiteralClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLiteralClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassClosedPatternContext extends ClosedPatternContext {
		public ClassPatternContext classPattern() {
			return getRuleContext(ClassPatternContext.class,0);
		}
		public ClassClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildcardClosedPatternContext extends ClosedPatternContext {
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public WildcardClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWildcardClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWildcardClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWildcardClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueClosedPatternContext extends ClosedPatternContext {
		public ValuePatternContext valuePattern() {
			return getRuleContext(ValuePatternContext.class,0);
		}
		public ValueClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValueClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValueClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValueClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SequenceClosedPatternContext extends ClosedPatternContext {
		public SequencePatternContext sequencePattern() {
			return getRuleContext(SequencePatternContext.class,0);
		}
		public SequenceClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSequenceClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSequenceClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSequenceClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaptureClosedPatternContext extends ClosedPatternContext {
		public CapturePatternContext capturePattern() {
			return getRuleContext(CapturePatternContext.class,0);
		}
		public CaptureClosedPatternContext(ClosedPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCaptureClosedPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCaptureClosedPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCaptureClosedPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClosedPatternContext closedPattern() throws RecognitionException {
		ClosedPatternContext _localctx = new ClosedPatternContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_closedPattern);
		try {
			setState(1159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new LiteralClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1151);
				literalPattern();
				}
				break;
			case 2:
				_localctx = new CaptureClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1152);
				capturePattern();
				}
				break;
			case 3:
				_localctx = new WildcardClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1153);
				wildcardPattern();
				}
				break;
			case 4:
				_localctx = new ValueClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1154);
				valuePattern();
				}
				break;
			case 5:
				_localctx = new GroupClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1155);
				groupPattern();
				}
				break;
			case 6:
				_localctx = new SequenceClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1156);
				sequencePattern();
				}
				break;
			case 7:
				_localctx = new MappingClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1157);
				mappingPattern();
				}
				break;
			case 8:
				_localctx = new ClassClosedPatternContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1158);
				classPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPatternContext extends ParserRuleContext {
		public LiteralPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalPattern; }
	 
		public LiteralPatternContext() { }
		public void copyFrom(LiteralPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexNumberLiteralPatternContext extends LiteralPatternContext {
		public ComplexNumberContext complexNumber() {
			return getRuleContext(ComplexNumberContext.class,0);
		}
		public ComplexNumberLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComplexNumberLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComplexNumberLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexNumberLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralPatternContext extends LiteralPatternContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoneLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoneLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralPatternContext extends LiteralPatternContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralPatternContext extends LiteralPatternContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalseLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalseLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignedNumberLiteralPatternContext extends LiteralPatternContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSignedNumberLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSignedNumberLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSignedNumberLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralPatternContext extends LiteralPatternContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueLiteralPatternContext(LiteralPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrueLiteralPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrueLiteralPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueLiteralPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralPatternContext literalPattern() throws RecognitionException {
		LiteralPatternContext _localctx = new LiteralPatternContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_literalPattern);
		try {
			setState(1167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new SignedNumberLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1161);
				signedNumber();
				}
				break;
			case 2:
				_localctx = new ComplexNumberLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1162);
				complexNumber();
				}
				break;
			case 3:
				_localctx = new StringLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1163);
				strings();
				}
				break;
			case 4:
				_localctx = new NoneLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1164);
				match(NONE);
				}
				break;
			case 5:
				_localctx = new TrueLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1165);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new FalseLiteralPatternContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1166);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExprContext extends ParserRuleContext {
		public LiteralExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpr; }
	 
		public LiteralExprContext() { }
		public void copyFrom(LiteralExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueLiteralExprContext extends LiteralExprContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrueLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrueLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseLiteralExprContext extends LiteralExprContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalseLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalseLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralExprContext extends LiteralExprContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneLiteralExprContext extends LiteralExprContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoneLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoneLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComplexNumberLiteralExprContext extends LiteralExprContext {
		public ComplexNumberContext complexNumber() {
			return getRuleContext(ComplexNumberContext.class,0);
		}
		public ComplexNumberLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComplexNumberLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComplexNumberLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexNumberLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SignedNumberLiteralExprContext extends LiteralExprContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumberLiteralExprContext(LiteralExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSignedNumberLiteralExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSignedNumberLiteralExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSignedNumberLiteralExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralExprContext literalExpr() throws RecognitionException {
		LiteralExprContext _localctx = new LiteralExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_literalExpr);
		try {
			setState(1175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new SignedNumberLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1169);
				signedNumber();
				}
				break;
			case 2:
				_localctx = new ComplexNumberLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				complexNumber();
				}
				break;
			case 3:
				_localctx = new StringLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1171);
				strings();
				}
				break;
			case 4:
				_localctx = new NoneLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1172);
				match(NONE);
				}
				break;
			case 5:
				_localctx = new TrueLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1173);
				match(TRUE);
				}
				break;
			case 6:
				_localctx = new FalseLiteralExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1174);
				match(FALSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexNumberContext extends ParserRuleContext {
		public SignedRealNumberContext signedRealNumber() {
			return getRuleContext(SignedRealNumberContext.class,0);
		}
		public ImaginaryNumberContext imaginaryNumber() {
			return getRuleContext(ImaginaryNumberContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public ComplexNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComplexNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComplexNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComplexNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexNumberContext complexNumber() throws RecognitionException {
		ComplexNumberContext _localctx = new ComplexNumberContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_complexNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1177);
			signedRealNumber();
			setState(1178);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1179);
			imaginaryNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_signedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1181);
				match(MINUS);
				}
			}

			setState(1184);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SignedRealNumberContext extends ParserRuleContext {
		public RealNumberContext realNumber() {
			return getRuleContext(RealNumberContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public SignedRealNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedRealNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSignedRealNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSignedRealNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSignedRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedRealNumberContext signedRealNumber() throws RecognitionException {
		SignedRealNumberContext _localctx = new SignedRealNumberContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_signedRealNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(1186);
				match(MINUS);
				}
			}

			setState(1189);
			realNumber();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RealNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public RealNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRealNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRealNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRealNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RealNumberContext realNumber() throws RecognitionException {
		RealNumberContext _localctx = new RealNumberContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_realNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1191);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImaginaryNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public ImaginaryNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imaginaryNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterImaginaryNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitImaginaryNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitImaginaryNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImaginaryNumberContext imaginaryNumber() throws RecognitionException {
		ImaginaryNumberContext _localctx = new ImaginaryNumberContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_imaginaryNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CapturePatternContext extends ParserRuleContext {
		public PatternCaptureTargetContext patternCaptureTarget() {
			return getRuleContext(PatternCaptureTargetContext.class,0);
		}
		public CapturePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCapturePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCapturePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCapturePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapturePatternContext capturePattern() throws RecognitionException {
		CapturePatternContext _localctx = new CapturePatternContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_capturePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			patternCaptureTarget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternCaptureTargetContext extends ParserRuleContext {
		public NameExceptUnderscoreContext nameExceptUnderscore() {
			return getRuleContext(NameExceptUnderscoreContext.class,0);
		}
		public PatternCaptureTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternCaptureTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPatternCaptureTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPatternCaptureTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPatternCaptureTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternCaptureTargetContext patternCaptureTarget() throws RecognitionException {
		PatternCaptureTargetContext _localctx = new PatternCaptureTargetContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_patternCaptureTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1197);
			nameExceptUnderscore();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WildcardPatternContext extends ParserRuleContext {
		public TerminalNode NAME_OR_WILDCARD() { return getToken(PythonParser.NAME_OR_WILDCARD, 0); }
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWildcardPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWildcardPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(NAME_OR_WILDCARD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuePatternContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ValuePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterValuePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitValuePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitValuePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuePatternContext valuePattern() throws RecognitionException {
		ValuePatternContext _localctx = new ValuePatternContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_valuePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			attr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttrContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_attr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			name();
			setState(1206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1204);
				match(DOT);
				setState(1205);
				name();
				}
				}
				setState(1208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DOT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameOrAttrContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(PythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(PythonParser.DOT, i);
		}
		public NameOrAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameOrAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameOrAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameOrAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameOrAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameOrAttrContext nameOrAttr() throws RecognitionException {
		NameOrAttrContext _localctx = new NameOrAttrContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_nameOrAttr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			name();
			setState(1215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1211);
				match(DOT);
				setState(1212);
				name();
				}
				}
				setState(1217);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupPatternContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public GroupPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroupPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroupPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGroupPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupPatternContext groupPattern() throws RecognitionException {
		GroupPatternContext _localctx = new GroupPatternContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_groupPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(LPAR);
			setState(1219);
			pattern();
			setState(1220);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SequencePatternContext extends ParserRuleContext {
		public SequencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencePattern; }
	 
		public SequencePatternContext() { }
		public void copyFrom(SequencePatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleSequencePatternContext extends SequencePatternContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public OpenSequencePatternContext openSequencePattern() {
			return getRuleContext(OpenSequencePatternContext.class,0);
		}
		public TupleSequencePatternContext(SequencePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleSequencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleSequencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleSequencePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListSequencePatternContext extends SequencePatternContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public MaybeSequencePatternContext maybeSequencePattern() {
			return getRuleContext(MaybeSequencePatternContext.class,0);
		}
		public ListSequencePatternContext(SequencePatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListSequencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListSequencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListSequencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequencePatternContext sequencePattern() throws RecognitionException {
		SequencePatternContext _localctx = new SequencePatternContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_sequencePattern);
		int _la;
		try {
			setState(1232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQB:
				_localctx = new ListSequencePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1222);
				match(LSQB);
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504632041760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(1223);
					maybeSequencePattern();
					}
				}

				setState(1226);
				match(RSQB);
				}
				break;
			case LPAR:
				_localctx = new TupleSequencePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1227);
				match(LPAR);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504632041760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(1228);
					openSequencePattern();
					}
				}

				setState(1231);
				match(RPAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OpenSequencePatternContext extends ParserRuleContext {
		public MaybeStarPatternContext maybeStarPattern() {
			return getRuleContext(MaybeStarPatternContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public MaybeSequencePatternContext maybeSequencePattern() {
			return getRuleContext(MaybeSequencePatternContext.class,0);
		}
		public OpenSequencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openSequencePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterOpenSequencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitOpenSequencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitOpenSequencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenSequencePatternContext openSequencePattern() throws RecognitionException {
		OpenSequencePatternContext _localctx = new OpenSequencePatternContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_openSequencePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			maybeStarPattern();
			setState(1235);
			match(COMMA);
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504632041760L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
				{
				setState(1236);
				maybeSequencePattern();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeSequencePatternContext extends ParserRuleContext {
		public List<MaybeStarPatternContext> maybeStarPattern() {
			return getRuleContexts(MaybeStarPatternContext.class);
		}
		public MaybeStarPatternContext maybeStarPattern(int i) {
			return getRuleContext(MaybeStarPatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public MaybeSequencePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeSequencePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMaybeSequencePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMaybeSequencePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMaybeSequencePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeSequencePatternContext maybeSequencePattern() throws RecognitionException {
		MaybeSequencePatternContext _localctx = new MaybeSequencePatternContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_maybeSequencePattern);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			maybeStarPattern();
			setState(1244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1240);
					match(COMMA);
					setState(1241);
					maybeStarPattern();
					}
					} 
				}
				setState(1246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			}
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1247);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaybeStarPatternContext extends ParserRuleContext {
		public MaybeStarPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maybeStarPattern; }
	 
		public MaybeStarPatternContext() { }
		public void copyFrom(MaybeStarPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarMaybePatternContext extends MaybeStarPatternContext {
		public StarPatternContext starPattern() {
			return getRuleContext(StarPatternContext.class,0);
		}
		public StarMaybePatternContext(MaybeStarPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarMaybePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarMaybePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarMaybePattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularMaybePatternContext extends MaybeStarPatternContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public RegularMaybePatternContext(MaybeStarPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularMaybePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularMaybePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularMaybePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaybeStarPatternContext maybeStarPattern() throws RecognitionException {
		MaybeStarPatternContext _localctx = new MaybeStarPatternContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_maybeStarPattern);
		try {
			setState(1252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarMaybePatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1250);
				starPattern();
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case MINUS:
			case FALSE:
			case NONE:
			case TRUE:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new RegularMaybePatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1251);
				pattern();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarPatternContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StarPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarPatternContext starPattern() throws RecognitionException {
		StarPatternContext _localctx = new StarPatternContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_starPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			match(STAR);
			setState(1255);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MappingPatternContext extends ParserRuleContext {
		public MappingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mappingPattern; }
	 
		public MappingPatternContext() { }
		public void copyFrom(MappingPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyMappingPatternContext extends MappingPatternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public EmptyMappingPatternContext(MappingPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEmptyMappingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEmptyMappingPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEmptyMappingPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ItemsMappingPatternContext extends MappingPatternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public ItemsPatternContext itemsPattern() {
			return getRuleContext(ItemsPatternContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DoubleStarPatternContext doubleStarPattern() {
			return getRuleContext(DoubleStarPatternContext.class,0);
		}
		public ItemsMappingPatternContext(MappingPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterItemsMappingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitItemsMappingPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitItemsMappingPattern(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarMappingPatternContext extends MappingPatternContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public DoubleStarPatternContext doubleStarPattern() {
			return getRuleContext(DoubleStarPatternContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public DoubleStarMappingPatternContext(MappingPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarMappingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarMappingPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarMappingPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MappingPatternContext mappingPattern() throws RecognitionException {
		MappingPatternContext _localctx = new MappingPatternContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_mappingPattern);
		int _la;
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				_localctx = new EmptyMappingPatternContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(LBRACE);
				setState(1258);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new DoubleStarMappingPatternContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1259);
				match(LBRACE);
				setState(1260);
				doubleStarPattern();
				setState(1262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1261);
					match(COMMA);
					}
				}

				setState(1264);
				match(RBRACE);
				}
				break;
			case 3:
				_localctx = new ItemsMappingPatternContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1266);
				match(LBRACE);
				setState(1267);
				itemsPattern();
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1268);
					match(COMMA);
					setState(1269);
					doubleStarPattern();
					}
					break;
				}
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1272);
					match(COMMA);
					}
				}

				setState(1275);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemsPatternContext extends ParserRuleContext {
		public List<KeyValuePatternContext> keyValuePattern() {
			return getRuleContexts(KeyValuePatternContext.class);
		}
		public KeyValuePatternContext keyValuePattern(int i) {
			return getRuleContext(KeyValuePatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ItemsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterItemsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitItemsPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitItemsPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsPatternContext itemsPattern() throws RecognitionException {
		ItemsPatternContext _localctx = new ItemsPatternContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_itemsPattern);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			keyValuePattern();
			setState(1284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1280);
					match(COMMA);
					setState(1281);
					keyValuePattern();
					}
					} 
				}
				setState(1286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,139,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyValuePatternContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public LiteralExprContext literalExpr() {
			return getRuleContext(LiteralExprContext.class,0);
		}
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public KeyValuePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValuePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeyValuePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeyValuePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeyValuePattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValuePatternContext keyValuePattern() throws RecognitionException {
		KeyValuePatternContext _localctx = new KeyValuePatternContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_keyValuePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case TSTRING_START:
			case MINUS:
			case FALSE:
			case NONE:
			case TRUE:
			case NUMBER:
			case STRING:
				{
				setState(1287);
				literalExpr();
				}
				break;
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				{
				setState(1288);
				attr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1291);
			match(COLON);
			setState(1292);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarPatternContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public PatternCaptureTargetContext patternCaptureTarget() {
			return getRuleContext(PatternCaptureTargetContext.class,0);
		}
		public DoubleStarPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarPatternContext doubleStarPattern() throws RecognitionException {
		DoubleStarPatternContext _localctx = new DoubleStarPatternContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_doubleStarPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(DOUBLESTAR);
			setState(1295);
			patternCaptureTarget();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassPatternContext extends ParserRuleContext {
		public NameOrAttrContext nameOrAttr() {
			return getRuleContext(NameOrAttrContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public PositionalPatternsContext positionalPatterns() {
			return getRuleContext(PositionalPatternsContext.class,0);
		}
		public KeywordPatternsContext keywordPatterns() {
			return getRuleContext(KeywordPatternsContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ClassPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterClassPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitClassPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitClassPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassPatternContext classPattern() throws RecognitionException {
		ClassPatternContext _localctx = new ClassPatternContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_classPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			nameOrAttr();
			setState(1298);
			match(LPAR);
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1152921504615264544L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
				{
				setState(1305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1299);
					positionalPatterns();
					setState(1302);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						setState(1300);
						match(COMMA);
						setState(1301);
						keywordPatterns();
						}
						break;
					}
					}
					break;
				case 2:
					{
					setState(1304);
					keywordPatterns();
					}
					break;
				}
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1307);
					match(COMMA);
					}
				}

				}
			}

			setState(1312);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionalPatternsContext extends ParserRuleContext {
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public PositionalPatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionalPatterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionalPatternsContext positionalPatterns() throws RecognitionException {
		PositionalPatternsContext _localctx = new PositionalPatternsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_positionalPatterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1314);
			pattern();
			setState(1319);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1315);
					match(COMMA);
					setState(1316);
					pattern();
					}
					} 
				}
				setState(1321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordPatternsContext extends ParserRuleContext {
		public List<KeywordPatternContext> keywordPattern() {
			return getRuleContexts(KeywordPatternContext.class);
		}
		public KeywordPatternContext keywordPattern(int i) {
			return getRuleContext(KeywordPatternContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KeywordPatternsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordPatterns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeywordPatterns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeywordPatterns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordPatterns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordPatternsContext keywordPatterns() throws RecognitionException {
		KeywordPatternsContext _localctx = new KeywordPatternsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_keywordPatterns);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1322);
			keywordPattern();
			setState(1327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1323);
					match(COMMA);
					setState(1324);
					keywordPattern();
					}
					} 
				}
				setState(1329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordPatternContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public KeywordPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeywordPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeywordPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordPatternContext keywordPattern() throws RecognitionException {
		KeywordPatternContext _localctx = new KeywordPatternContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_keywordPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			name();
			setState(1331);
			match(EQUAL);
			setState(1332);
			pattern();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAliasContext extends ParserRuleContext {
		public TerminalNode NAME_OR_TYPE() { return getToken(PythonParser.NAME_OR_TYPE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeParamsContext typeParams() {
			return getRuleContext(TypeParamsContext.class,0);
		}
		public TypeAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAliasContext typeAlias() throws RecognitionException {
		TypeAliasContext _localctx = new TypeAliasContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_typeAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1334);
			match(NAME_OR_TYPE);
			setState(1335);
			name();
			setState(1337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQB) {
				{
				setState(1336);
				typeParams();
				}
			}

			setState(1339);
			match(EQUAL);
			setState(1340);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamsContext extends ParserRuleContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TypeParamSeqContext typeParamSeq() {
			return getRuleContext(TypeParamSeqContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public TypeParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamsContext typeParams() throws RecognitionException {
		TypeParamsContext _localctx = new TypeParamsContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_typeParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(LSQB);
			setState(1343);
			typeParamSeq();
			setState(1344);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamSeqContext extends ParserRuleContext {
		public List<TypeParamContext> typeParam() {
			return getRuleContexts(TypeParamContext.class);
		}
		public TypeParamContext typeParam(int i) {
			return getRuleContext(TypeParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TypeParamSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParamSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParamSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParamSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamSeqContext typeParamSeq() throws RecognitionException {
		TypeParamSeqContext _localctx = new TypeParamSeqContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_typeParamSeq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			typeParam();
			setState(1351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1347);
					match(COMMA);
					setState(1348);
					typeParam();
					}
					} 
				}
				setState(1353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			}
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1354);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamContext extends ParserRuleContext {
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
	 
		public TypeParamContext() { }
		public void copyFrom(TypeParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTypeParamContext extends TypeParamContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeParamStarredDefaultContext typeParamStarredDefault() {
			return getRuleContext(TypeParamStarredDefaultContext.class,0);
		}
		public StarTypeParamContext(TypeParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularTypeParamContext extends TypeParamContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeParamBoundContext typeParamBound() {
			return getRuleContext(TypeParamBoundContext.class,0);
		}
		public TypeParamDefaultContext typeParamDefault() {
			return getRuleContext(TypeParamDefaultContext.class,0);
		}
		public RegularTypeParamContext(TypeParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarTypeParamContext extends TypeParamContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeParamDefaultContext typeParamDefault() {
			return getRuleContext(TypeParamDefaultContext.class,0);
		}
		public DoubleStarTypeParamContext(TypeParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarTypeParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarTypeParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarTypeParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_typeParam);
		int _la;
		try {
			setState(1374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				_localctx = new RegularTypeParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				name();
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1358);
					typeParamBound();
					}
				}

				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1361);
					typeParamDefault();
					}
				}

				}
				break;
			case STAR:
				_localctx = new StarTypeParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1364);
				match(STAR);
				setState(1365);
				name();
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1366);
					typeParamStarredDefault();
					}
				}

				}
				break;
			case DOUBLESTAR:
				_localctx = new DoubleStarTypeParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1369);
				match(DOUBLESTAR);
				setState(1370);
				name();
				setState(1372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(1371);
					typeParamDefault();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamBoundContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeParamBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParamBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParamBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParamBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamBoundContext typeParamBound() throws RecognitionException {
		TypeParamBoundContext _localctx = new TypeParamBoundContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_typeParamBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(COLON);
			setState(1377);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamDefaultContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeParamDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParamDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParamDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParamDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamDefaultContext typeParamDefault() throws RecognitionException {
		TypeParamDefaultContext _localctx = new TypeParamDefaultContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_typeParamDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1379);
			match(EQUAL);
			setState(1380);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeParamStarredDefaultContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public StarExpressionContext starExpression() {
			return getRuleContext(StarExpressionContext.class,0);
		}
		public TypeParamStarredDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamStarredDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeParamStarredDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeParamStarredDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeParamStarredDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamStarredDefaultContext typeParamStarredDefault() throws RecognitionException {
		TypeParamStarredDefaultContext _localctx = new TypeParamStarredDefaultContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_typeParamStarredDefault);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			match(EQUAL);
			setState(1383);
			starExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_expressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			expression();
			setState(1390);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1386);
					match(COMMA);
					setState(1387);
					expression();
					}
					} 
				}
				setState(1392);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,155,_ctx);
			}
			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1393);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalExpressionContext extends ExpressionContext {
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode IF() { return getToken(PythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(PythonParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaExpressionContext extends ExpressionContext {
		public LambdefContext lambdef() {
			return getRuleContext(LambdefContext.class,0);
		}
		public LambdaExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_expression);
		int _la;
		try {
			setState(1405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new ConditionalExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				disjunction();
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1397);
					match(IF);
					setState(1398);
					disjunction();
					setState(1399);
					match(ELSE);
					setState(1400);
					expression();
					}
				}

				}
				break;
			case LAMBDA:
				_localctx = new LambdaExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1404);
				lambdef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class YieldExprContext extends ParserRuleContext {
		public TerminalNode YIELD() { return getToken(PythonParser.YIELD, 0); }
		public TerminalNode FROM() { return getToken(PythonParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StarExpressionsContext starExpressions() {
			return getRuleContext(StarExpressionsContext.class,0);
		}
		public YieldExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yieldExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterYieldExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitYieldExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitYieldExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YieldExprContext yieldExpr() throws RecognitionException {
		YieldExprContext _localctx = new YieldExprContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_yieldExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(YIELD);
			setState(1413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM:
				{
				setState(1408);
				match(FROM);
				setState(1409);
				expression();
				}
				break;
			case TYPE_COMMENT:
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case RPAR:
			case RBRACE:
			case COLON:
			case SEMI:
			case PLUS:
			case MINUS:
			case STAR:
			case EQUAL:
			case TILDE:
			case ELLIPSIS:
			case EXCLAMATION:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
			case NEWLINE:
				{
				setState(1411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(1410);
					starExpressions();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarExpressionsContext extends ParserRuleContext {
		public List<StarExpressionContext> starExpression() {
			return getRuleContexts(StarExpressionContext.class);
		}
		public StarExpressionContext starExpression(int i) {
			return getRuleContext(StarExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarExpressionsContext starExpressions() throws RecognitionException {
		StarExpressionsContext _localctx = new StarExpressionsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_starExpressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1415);
			starExpression();
			setState(1420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1416);
					match(COMMA);
					setState(1417);
					starExpression();
					}
					} 
				}
				setState(1422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1423);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarExpressionContext extends ParserRuleContext {
		public StarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starExpression; }
	 
		public StarExpressionContext() { }
		public void copyFrom(StarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarBitwiseOrContext extends StarExpressionContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public StarBitwiseOrContext(StarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularStarExpressionContext extends StarExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegularStarExpressionContext(StarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularStarExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularStarExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularStarExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarExpressionContext starExpression() throws RecognitionException {
		StarExpressionContext _localctx = new StarExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_starExpression);
		try {
			setState(1429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarBitwiseOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1426);
				match(STAR);
				setState(1427);
				bitwiseOr(0);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new RegularStarExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarNamedExpressionsContext extends ParserRuleContext {
		public List<StarNamedExpressionContext> starNamedExpression() {
			return getRuleContexts(StarNamedExpressionContext.class);
		}
		public StarNamedExpressionContext starNamedExpression(int i) {
			return getRuleContext(StarNamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarNamedExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starNamedExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarNamedExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarNamedExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarNamedExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarNamedExpressionsContext starNamedExpressions() throws RecognitionException {
		StarNamedExpressionsContext _localctx = new StarNamedExpressionsContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_starNamedExpressions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			starNamedExpression();
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1432);
					match(COMMA);
					setState(1433);
					starNamedExpression();
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,164,_ctx);
			}
			setState(1440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1439);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarNamedExpressionContext extends ParserRuleContext {
		public StarNamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starNamedExpression; }
	 
		public StarNamedExpressionContext() { }
		public void copyFrom(StarNamedExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularStarNamedExpressionContext extends StarNamedExpressionContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public RegularStarNamedExpressionContext(StarNamedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularStarNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularStarNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularStarNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarNamedExpressionBitwiseOrContext extends StarNamedExpressionContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public StarNamedExpressionBitwiseOrContext(StarNamedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarNamedExpressionBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarNamedExpressionBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarNamedExpressionBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarNamedExpressionContext starNamedExpression() throws RecognitionException {
		StarNamedExpressionContext _localctx = new StarNamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_starNamedExpression);
		try {
			setState(1445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new StarNamedExpressionBitwiseOrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1442);
				match(STAR);
				setState(1443);
				bitwiseOr(0);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new RegularStarNamedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1444);
				namedExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExpressionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode COLONEQUAL() { return getToken(PythonParser.COLONEQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_assignmentExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			name();
			setState(1448);
			match(COLONEQUAL);
			setState(1449);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamedExpressionContext extends ParserRuleContext {
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
	 
		public NamedExpressionContext() { }
		public void copyFrom(NamedExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularNamedExpressionContext extends NamedExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RegularNamedExpressionContext(NamedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedAssignmentExpressionContext extends NamedExpressionContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public NamedAssignmentExpressionContext(NamedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNamedAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNamedAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNamedAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_namedExpression);
		try {
			setState(1453);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				_localctx = new NamedAssignmentExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1451);
				assignmentExpression();
				}
				break;
			case 2:
				_localctx = new RegularNamedExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DisjunctionContext extends ParserRuleContext {
		public List<ConjunctionContext> conjunction() {
			return getRuleContexts(ConjunctionContext.class);
		}
		public ConjunctionContext conjunction(int i) {
			return getRuleContext(ConjunctionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(PythonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(PythonParser.OR, i);
		}
		public DisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisjunctionContext disjunction() throws RecognitionException {
		DisjunctionContext _localctx = new DisjunctionContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1455);
			conjunction();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(1456);
				match(OR);
				setState(1457);
				conjunction();
				}
				}
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConjunctionContext extends ParserRuleContext {
		public List<InversionContext> inversion() {
			return getRuleContexts(InversionContext.class);
		}
		public InversionContext inversion(int i) {
			return getRuleContext(InversionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(PythonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PythonParser.AND, i);
		}
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			inversion();
			setState(1468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(1464);
				match(AND);
				setState(1465);
				inversion();
				}
				}
				setState(1470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InversionContext extends ParserRuleContext {
		public InversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inversion; }
	 
		public InversionContext() { }
		public void copyFrom(InversionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInversionContext extends InversionContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public InversionContext inversion() {
			return getRuleContext(InversionContext.class,0);
		}
		public NotInversionContext(InversionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotInversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotInversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotInversion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonInversionContext extends InversionContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ComparisonInversionContext(InversionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparisonInversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparisonInversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparisonInversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InversionContext inversion() throws RecognitionException {
		InversionContext _localctx = new InversionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_inversion);
		try {
			setState(1474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				_localctx = new NotInversionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1471);
				match(NOT);
				setState(1472);
				inversion();
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new ComparisonInversionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public List<CompareOpBitwiseOrPairContext> compareOpBitwiseOrPair() {
			return getRuleContexts(CompareOpBitwiseOrPairContext.class);
		}
		public CompareOpBitwiseOrPairContext compareOpBitwiseOrPair(int i) {
			return getRuleContext(CompareOpBitwiseOrPairContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			bitwiseOr(0);
			setState(1480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 1152957788490563827L) != 0)) {
				{
				{
				setState(1477);
				compareOpBitwiseOrPair();
				}
				}
				setState(1482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompareOpBitwiseOrPairContext extends ParserRuleContext {
		public CompareOpBitwiseOrPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOpBitwiseOrPair; }
	 
		public CompareOpBitwiseOrPairContext() { }
		public void copyFrom(CompareOpBitwiseOrPairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNotComparisonContext extends CompareOpBitwiseOrPairContext {
		public IsnotBitwiseOrContext isnotBitwiseOr() {
			return getRuleContext(IsnotBitwiseOrContext.class,0);
		}
		public IsNotComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsNotComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsNotComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsNotComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsComparisonContext extends CompareOpBitwiseOrPairContext {
		public IsBitwiseOrContext isBitwiseOr() {
			return getRuleContext(IsBitwiseOrContext.class,0);
		}
		public IsComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessEqComparisonContext extends CompareOpBitwiseOrPairContext {
		public LteBitwiseOrContext lteBitwiseOr() {
			return getRuleContext(LteBitwiseOrContext.class,0);
		}
		public LessEqComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLessEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLessEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqComparisonContext extends CompareOpBitwiseOrPairContext {
		public EqBitwiseOrContext eqBitwiseOr() {
			return getRuleContext(EqBitwiseOrContext.class,0);
		}
		public EqComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterComparisonContext extends CompareOpBitwiseOrPairContext {
		public GtBitwiseOrContext gtBitwiseOr() {
			return getRuleContext(GtBitwiseOrContext.class,0);
		}
		public GreaterComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGreaterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGreaterComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterEqComparisonContext extends CompareOpBitwiseOrPairContext {
		public GteBitwiseOrContext gteBitwiseOr() {
			return getRuleContext(GteBitwiseOrContext.class,0);
		}
		public GreaterEqComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGreaterEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGreaterEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGreaterEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InComparisonContext extends CompareOpBitwiseOrPairContext {
		public InBitwiseOrContext inBitwiseOr() {
			return getRuleContext(InBitwiseOrContext.class,0);
		}
		public InComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotInComparisonContext extends CompareOpBitwiseOrPairContext {
		public NotinBitwiseOrContext notinBitwiseOr() {
			return getRuleContext(NotinBitwiseOrContext.class,0);
		}
		public NotInComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotInComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotInComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotInComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqComparisonContext extends CompareOpBitwiseOrPairContext {
		public NoteqBitwiseOrContext noteqBitwiseOr() {
			return getRuleContext(NoteqBitwiseOrContext.class,0);
		}
		public NotEqComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotEqComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotEqComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotEqComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessComparisonContext extends CompareOpBitwiseOrPairContext {
		public LtBitwiseOrContext ltBitwiseOr() {
			return getRuleContext(LtBitwiseOrContext.class,0);
		}
		public LessComparisonContext(CompareOpBitwiseOrPairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLessComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLessComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLessComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareOpBitwiseOrPairContext compareOpBitwiseOrPair() throws RecognitionException {
		CompareOpBitwiseOrPairContext _localctx = new CompareOpBitwiseOrPairContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_compareOpBitwiseOrPair);
		try {
			setState(1493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				_localctx = new EqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				eqBitwiseOr();
				}
				break;
			case 2:
				_localctx = new NotEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1484);
				noteqBitwiseOr();
				}
				break;
			case 3:
				_localctx = new LessEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1485);
				lteBitwiseOr();
				}
				break;
			case 4:
				_localctx = new LessComparisonContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1486);
				ltBitwiseOr();
				}
				break;
			case 5:
				_localctx = new GreaterEqComparisonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1487);
				gteBitwiseOr();
				}
				break;
			case 6:
				_localctx = new GreaterComparisonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1488);
				gtBitwiseOr();
				}
				break;
			case 7:
				_localctx = new NotInComparisonContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1489);
				notinBitwiseOr();
				}
				break;
			case 8:
				_localctx = new InComparisonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1490);
				inBitwiseOr();
				}
				break;
			case 9:
				_localctx = new IsNotComparisonContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1491);
				isnotBitwiseOr();
				}
				break;
			case 10:
				_localctx = new IsComparisonContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1492);
				isBitwiseOr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqBitwiseOrContext extends ParserRuleContext {
		public TerminalNode EQEQUAL() { return getToken(PythonParser.EQEQUAL, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public EqBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEqBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEqBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEqBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqBitwiseOrContext eqBitwiseOr() throws RecognitionException {
		EqBitwiseOrContext _localctx = new EqBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_eqBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			match(EQEQUAL);
			setState(1496);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoteqBitwiseOrContext extends ParserRuleContext {
		public TerminalNode NOTEQUAL() { return getToken(PythonParser.NOTEQUAL, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public NoteqBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noteqBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoteqBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoteqBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoteqBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteqBitwiseOrContext noteqBitwiseOr() throws RecognitionException {
		NoteqBitwiseOrContext _localctx = new NoteqBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_noteqBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			match(NOTEQUAL);
			setState(1499);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LteBitwiseOrContext extends ParserRuleContext {
		public TerminalNode LESSEQUAL() { return getToken(PythonParser.LESSEQUAL, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public LteBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lteBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLteBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLteBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLteBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LteBitwiseOrContext lteBitwiseOr() throws RecognitionException {
		LteBitwiseOrContext _localctx = new LteBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_lteBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1501);
			match(LESSEQUAL);
			setState(1502);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LtBitwiseOrContext extends ParserRuleContext {
		public TerminalNode LESS() { return getToken(PythonParser.LESS, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public LtBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ltBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLtBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLtBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLtBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LtBitwiseOrContext ltBitwiseOr() throws RecognitionException {
		LtBitwiseOrContext _localctx = new LtBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ltBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			match(LESS);
			setState(1505);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GteBitwiseOrContext extends ParserRuleContext {
		public TerminalNode GREATEREQUAL() { return getToken(PythonParser.GREATEREQUAL, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public GteBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gteBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGteBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGteBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGteBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GteBitwiseOrContext gteBitwiseOr() throws RecognitionException {
		GteBitwiseOrContext _localctx = new GteBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_gteBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			match(GREATEREQUAL);
			setState(1508);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GtBitwiseOrContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(PythonParser.GREATER, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public GtBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGtBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGtBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGtBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtBitwiseOrContext gtBitwiseOr() throws RecognitionException {
		GtBitwiseOrContext _localctx = new GtBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_gtBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(GREATER);
			setState(1511);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotinBitwiseOrContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public NotinBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notinBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNotinBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNotinBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNotinBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotinBitwiseOrContext notinBitwiseOr() throws RecognitionException {
		NotinBitwiseOrContext _localctx = new NotinBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_notinBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1513);
			match(NOT);
			setState(1514);
			match(IN);
			setState(1515);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InBitwiseOrContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public InBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InBitwiseOrContext inBitwiseOr() throws RecognitionException {
		InBitwiseOrContext _localctx = new InBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_inBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517);
			match(IN);
			setState(1518);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsnotBitwiseOrContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public TerminalNode NOT() { return getToken(PythonParser.NOT, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public IsnotBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isnotBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsnotBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsnotBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsnotBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsnotBitwiseOrContext isnotBitwiseOr() throws RecognitionException {
		IsnotBitwiseOrContext _localctx = new IsnotBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_isnotBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1520);
			match(IS);
			setState(1521);
			match(NOT);
			setState(1522);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsBitwiseOrContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(PythonParser.IS, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public IsBitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isBitwiseOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterIsBitwiseOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitIsBitwiseOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitIsBitwiseOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsBitwiseOrContext isBitwiseOr() throws RecognitionException {
		IsBitwiseOrContext _localctx = new IsBitwiseOrContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_isBitwiseOr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1524);
			match(IS);
			setState(1525);
			bitwiseOr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrContext extends ParserRuleContext {
		public BitwiseOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseOr; }
	 
		public BitwiseOrContext() { }
		public void copyFrom(BitwiseOrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXorOperandContext extends BitwiseOrContext {
		public BitwiseXorContext bitwiseXor() {
			return getRuleContext(BitwiseXorContext.class,0);
		}
		public BitwiseXorOperandContext(BitwiseOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseXorOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseXorOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseXorOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseOrExpressionContext extends BitwiseOrContext {
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public TerminalNode VBAR() { return getToken(PythonParser.VBAR, 0); }
		public BitwiseXorContext bitwiseXor() {
			return getRuleContext(BitwiseXorContext.class,0);
		}
		public BitwiseOrExpressionContext(BitwiseOrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseOrContext bitwiseOr() throws RecognitionException {
		return bitwiseOr(0);
	}

	private BitwiseOrContext bitwiseOr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitwiseOrContext _localctx = new BitwiseOrContext(_ctx, _parentState);
		BitwiseOrContext _prevctx = _localctx;
		int _startState = 264;
		enterRecursionRule(_localctx, 264, RULE_bitwiseOr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BitwiseXorOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1528);
			bitwiseXor(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1535);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitwiseOrExpressionContext(new BitwiseOrContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwiseOr);
					setState(1530);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1531);
					match(VBAR);
					setState(1532);
					bitwiseXor(0);
					}
					} 
				}
				setState(1537);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXorContext extends ParserRuleContext {
		public BitwiseXorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseXor; }
	 
		public BitwiseXorContext() { }
		public void copyFrom(BitwiseXorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseXorExpressionContext extends BitwiseXorContext {
		public BitwiseXorContext bitwiseXor() {
			return getRuleContext(BitwiseXorContext.class,0);
		}
		public TerminalNode CIRCUMFLEX() { return getToken(PythonParser.CIRCUMFLEX, 0); }
		public BitwiseAndContext bitwiseAnd() {
			return getRuleContext(BitwiseAndContext.class,0);
		}
		public BitwiseXorExpressionContext(BitwiseXorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseXorExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseXorExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndOperandContext extends BitwiseXorContext {
		public BitwiseAndContext bitwiseAnd() {
			return getRuleContext(BitwiseAndContext.class,0);
		}
		public BitwiseAndOperandContext(BitwiseXorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseAndOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseAndOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseAndOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseXorContext bitwiseXor() throws RecognitionException {
		return bitwiseXor(0);
	}

	private BitwiseXorContext bitwiseXor(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitwiseXorContext _localctx = new BitwiseXorContext(_ctx, _parentState);
		BitwiseXorContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_bitwiseXor, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BitwiseAndOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1539);
			bitwiseAnd(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitwiseXorExpressionContext(new BitwiseXorContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwiseXor);
					setState(1541);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1542);
					match(CIRCUMFLEX);
					setState(1543);
					bitwiseAnd(0);
					}
					} 
				}
				setState(1548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,174,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndContext extends ParserRuleContext {
		public BitwiseAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitwiseAnd; }
	 
		public BitwiseAndContext() { }
		public void copyFrom(BitwiseAndContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseAndExpressionContext extends BitwiseAndContext {
		public BitwiseAndContext bitwiseAnd() {
			return getRuleContext(BitwiseAndContext.class,0);
		}
		public TerminalNode AMPER() { return getToken(PythonParser.AMPER, 0); }
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public BitwiseAndExpressionContext(BitwiseAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExprOperandContext extends BitwiseAndContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public ShiftExprOperandContext(BitwiseAndContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShiftExprOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShiftExprOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitShiftExprOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitwiseAndContext bitwiseAnd() throws RecognitionException {
		return bitwiseAnd(0);
	}

	private BitwiseAndContext bitwiseAnd(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitwiseAndContext _localctx = new BitwiseAndContext(_ctx, _parentState);
		BitwiseAndContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_bitwiseAnd, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ShiftExprOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1550);
			shiftExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BitwiseAndExpressionContext(new BitwiseAndContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_bitwiseAnd);
					setState(1552);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1553);
					match(AMPER);
					setState(1554);
					shiftExpr(0);
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExprContext extends ParserRuleContext {
		public ShiftExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpr; }
	 
		public ShiftExprContext() { }
		public void copyFrom(ShiftExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumOperandContext extends ShiftExprContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public SumOperandContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSumOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSumOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSumOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShiftExpressionContext extends ShiftExprContext {
		public ShiftExprContext shiftExpr() {
			return getRuleContext(ShiftExprContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode LEFTSHIFT() { return getToken(PythonParser.LEFTSHIFT, 0); }
		public TerminalNode RIGHTSHIFT() { return getToken(PythonParser.RIGHTSHIFT, 0); }
		public ShiftExpressionContext(ShiftExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExprContext shiftExpr() throws RecognitionException {
		return shiftExpr(0);
	}

	private ShiftExprContext shiftExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExprContext _localctx = new ShiftExprContext(_ctx, _parentState);
		ShiftExprContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_shiftExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SumOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1561);
			sum(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1568);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ShiftExpressionContext(new ShiftExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_shiftExpr);
					setState(1563);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1564);
					_la = _input.LA(1);
					if ( !(_la==LEFTSHIFT || _la==RIGHTSHIFT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1565);
					sum(0);
					}
					} 
				}
				setState(1570);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumContext extends ParserRuleContext {
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
	 
		public SumContext() { }
		public void copyFrom(SumContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermOperandContext extends SumContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermOperandContext(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTermOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTermOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTermOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends SumContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public AdditiveExpressionContext(SumContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		return sum(0);
	}

	private SumContext sum(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SumContext _localctx = new SumContext(_ctx, _parentState);
		SumContext _prevctx = _localctx;
		int _startState = 272;
		enterRecursionRule(_localctx, 272, RULE_sum, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1572);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(1579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdditiveExpressionContext(new SumContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_sum);
					setState(1574);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1575);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1576);
					term(0);
					}
					} 
				}
				setState(1581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorOperandContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorOperandContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFactorOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFactorOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFactorOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public TerminalNode DOUBLESLASH() { return getToken(PythonParser.DOUBLESLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PythonParser.PERCENT, 0); }
		public TerminalNode AT() { return getToken(PythonParser.AT, 0); }
		public MultiplicativeExpressionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new FactorOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1583);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(1590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicativeExpressionContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(1585);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1586);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 22518000334667776L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1587);
					factor();
					}
					} 
				}
				setState(1592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerOperandContext extends FactorContext {
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public PowerOperandContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPowerOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPowerOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPowerOperand(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPlusContext extends FactorContext {
		public TerminalNode PLUS() { return getToken(PythonParser.PLUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryPlusContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUnaryPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUnaryPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUnaryPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryMinusContext extends FactorContext {
		public TerminalNode MINUS() { return getToken(PythonParser.MINUS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryMinusContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BitwiseNotContext extends FactorContext {
		public TerminalNode TILDE() { return getToken(PythonParser.TILDE, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public BitwiseNotContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBitwiseNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBitwiseNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBitwiseNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_factor);
		try {
			setState(1600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				_localctx = new UnaryPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1593);
				match(PLUS);
				setState(1594);
				factor();
				}
				break;
			case MINUS:
				_localctx = new UnaryMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				match(MINUS);
				setState(1596);
				factor();
				}
				break;
			case TILDE:
				_localctx = new BitwiseNotContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1597);
				match(TILDE);
				setState(1598);
				factor();
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new PowerOperandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1599);
				power();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ParserRuleContext {
		public AwaitPrimaryContext awaitPrimary() {
			return getRuleContext(AwaitPrimaryContext.class,0);
		}
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			awaitPrimary();
			setState(1605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1603);
				match(DOUBLESTAR);
				setState(1604);
				factor();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AwaitPrimaryContext extends ParserRuleContext {
		public AwaitPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_awaitPrimary; }
	 
		public AwaitPrimaryContext() { }
		public void copyFrom(AwaitPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AwaitExpressionContext extends AwaitPrimaryContext {
		public TerminalNode AWAIT() { return getToken(PythonParser.AWAIT, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public AwaitExpressionContext(AwaitPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAwaitExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAwaitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAwaitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryOperandContext extends AwaitPrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryOperandContext(AwaitPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrimaryOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrimaryOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrimaryOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AwaitPrimaryContext awaitPrimary() throws RecognitionException {
		AwaitPrimaryContext _localctx = new AwaitPrimaryContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_awaitPrimary);
		try {
			setState(1610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AWAIT:
				_localctx = new AwaitExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1607);
				match(AWAIT);
				setState(1608);
				primary(0);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case FALSE:
			case NONE:
			case TRUE:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new PrimaryOperandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1609);
				primary(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryWithAccessContext extends PrimaryContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryWithAccessContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPrimaryWithAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPrimaryWithAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPrimaryWithAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomOperandContext extends PrimaryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomOperandContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		return primary(0);
	}

	private PrimaryContext primary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryContext _localctx = new PrimaryContext(_ctx, _parentState);
		PrimaryContext _prevctx = _localctx;
		int _startState = 282;
		enterRecursionRule(_localctx, 282, RULE_primary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AtomOperandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1613);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(1632);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryWithAccessContext(new PrimaryContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_primary);
					setState(1615);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						setState(1616);
						match(DOT);
						setState(1617);
						name();
						}
						break;
					case 2:
						{
						setState(1618);
						genexp();
						}
						break;
					case 3:
						{
						setState(1619);
						match(LPAR);
						setState(1621);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602880870156890400L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
							{
							setState(1620);
							arguments();
							}
						}

						setState(1623);
						match(RPAR);
						}
						break;
					case 4:
						{
						setState(1624);
						match(LSQB);
						setState(1625);
						slices();
						setState(1626);
						match(RSQB);
						}
						break;
					}
					}
					} 
				}
				setState(1634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SlicesContext extends ParserRuleContext {
		public SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slices; }
	 
		public SlicesContext() { }
		public void copyFrom(SlicesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultipleSlicesContext extends SlicesContext {
		public List<SliceContext> slice() {
			return getRuleContexts(SliceContext.class);
		}
		public SliceContext slice(int i) {
			return getRuleContext(SliceContext.class,i);
		}
		public List<StarredExpressionContext> starredExpression() {
			return getRuleContexts(StarredExpressionContext.class);
		}
		public StarredExpressionContext starredExpression(int i) {
			return getRuleContext(StarredExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public MultipleSlicesContext(SlicesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMultipleSlices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMultipleSlices(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMultipleSlices(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleSliceContext extends SlicesContext {
		public SliceContext slice() {
			return getRuleContext(SliceContext.class,0);
		}
		public SingleSliceContext(SlicesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleSlice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleSlice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleSlice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SlicesContext slices() throws RecognitionException {
		SlicesContext _localctx = new SlicesContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_slices);
		int _la;
		try {
			int _alt;
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				_localctx = new SingleSliceContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1635);
				slice();
				}
				break;
			case 2:
				_localctx = new MultipleSlicesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FSTRING_START:
				case TSTRING_START:
				case LPAR:
				case LSQB:
				case LBRACE:
				case COLON:
				case PLUS:
				case MINUS:
				case TILDE:
				case ELLIPSIS:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case NAME_OR_TYPE:
				case NAME_OR_MATCH:
				case NAME_OR_CASE:
				case NAME_OR_WILDCARD:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(1636);
					slice();
					}
					break;
				case STAR:
					{
					setState(1637);
					starredExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1647);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1640);
						match(COMMA);
						setState(1643);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FSTRING_START:
						case TSTRING_START:
						case LPAR:
						case LSQB:
						case LBRACE:
						case COLON:
						case PLUS:
						case MINUS:
						case TILDE:
						case ELLIPSIS:
						case FALSE:
						case AWAIT:
						case NONE:
						case TRUE:
						case LAMBDA:
						case NOT:
						case NAME_OR_TYPE:
						case NAME_OR_MATCH:
						case NAME_OR_CASE:
						case NAME_OR_WILDCARD:
						case NAME:
						case NUMBER:
						case STRING:
							{
							setState(1641);
							slice();
							}
							break;
						case STAR:
							{
							setState(1642);
							starredExpression();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(1649);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
				}
				setState(1651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1650);
					match(COMMA);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SliceContext extends ParserRuleContext {
		public SliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slice; }
	 
		public SliceContext() { }
		public void copyFrom(SliceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceRangeContext extends SliceContext {
		public List<TerminalNode> COLON() { return getTokens(PythonParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(PythonParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SliceRangeContext(SliceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSliceRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSliceRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSliceRange(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceExpressionContext extends SliceContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public SliceExpressionContext(SliceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSliceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSliceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSliceExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SliceContext slice() throws RecognitionException {
		SliceContext _localctx = new SliceContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_slice);
		int _la;
		try {
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				_localctx = new SliceRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770628485408L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(1655);
					expression();
					}
				}

				setState(1658);
				match(COLON);
				setState(1660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770628485408L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(1659);
					expression();
					}
				}

				setState(1666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(1662);
					match(COLON);
					setState(1664);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770628485408L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
						{
						setState(1663);
						expression();
						}
					}

					}
				}

				}
				break;
			case 2:
				_localctx = new SliceExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1668);
				namedExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(PythonParser.TRUE, 0); }
		public TrueAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTrueAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTrueAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTrueAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseAtomContext extends AtomContext {
		public TerminalNode FALSE() { return getToken(PythonParser.FALSE, 0); }
		public FalseAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFalseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFalseAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFalseAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode NUMBER() { return getToken(PythonParser.NUMBER, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictSetAtomContext extends AtomContext {
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public DictcompContext dictcomp() {
			return getRuleContext(DictcompContext.class,0);
		}
		public SetcompContext setcomp() {
			return getRuleContext(SetcompContext.class,0);
		}
		public DictSetAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictSetAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictSetAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictSetAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomContext extends AtomContext {
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleGroupGenexpAtomContext extends AtomContext {
		public TupleContext tuple() {
			return getRuleContext(TupleContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TupleGroupGenexpAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleGroupGenexpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleGroupGenexpAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleGroupGenexpAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListAtomContext extends AtomContext {
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public ListcompContext listcomp() {
			return getRuleContext(ListcompContext.class,0);
		}
		public ListAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EllipsisAtomContext extends AtomContext {
		public TerminalNode ELLIPSIS() { return getToken(PythonParser.ELLIPSIS, 0); }
		public EllipsisAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterEllipsisAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitEllipsisAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitEllipsisAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameAtomContext extends AtomContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NoneAtomContext extends AtomContext {
		public TerminalNode NONE() { return getToken(PythonParser.NONE, 0); }
		public NoneAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNoneAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNoneAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNoneAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_atom);
		try {
			setState(1693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				_localctx = new NameAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				name();
				}
				break;
			case TRUE:
				_localctx = new TrueAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1673);
				match(FALSE);
				}
				break;
			case NONE:
				_localctx = new NoneAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1674);
				match(NONE);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case STRING:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1675);
				strings();
				}
				break;
			case NUMBER:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1676);
				match(NUMBER);
				}
				break;
			case LPAR:
				_localctx = new TupleGroupGenexpAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1677);
					tuple();
					}
					break;
				case 2:
					{
					setState(1678);
					group();
					}
					break;
				case 3:
					{
					setState(1679);
					genexp();
					}
					break;
				}
				}
				break;
			case LSQB:
				_localctx = new ListAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1684);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1682);
					listLiteral();
					}
					break;
				case 2:
					{
					setState(1683);
					listcomp();
					}
					break;
				}
				}
				break;
			case LBRACE:
				_localctx = new DictSetAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1686);
					dict();
					}
					break;
				case 2:
					{
					setState(1687);
					set();
					}
					break;
				case 3:
					{
					setState(1688);
					dictcomp();
					}
					break;
				case 4:
					{
					setState(1689);
					setcomp();
					}
					break;
				}
				}
				break;
			case ELLIPSIS:
				_localctx = new EllipsisAtomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1692);
				match(ELLIPSIS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public YieldExprContext yieldExpr() {
			return getRuleContext(YieldExprContext.class,0);
		}
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			match(LPAR);
			setState(1698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YIELD:
				{
				setState(1696);
				yieldExpr();
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				{
				setState(1697);
				namedExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1700);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdefContext extends ParserRuleContext {
		public TerminalNode LAMBDA() { return getToken(PythonParser.LAMBDA, 0); }
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaParamsContext lambdaParams() {
			return getRuleContext(LambdaParamsContext.class,0);
		}
		public LambdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdefContext lambdef() throws RecognitionException {
		LambdefContext _localctx = new LambdefContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_lambdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			match(LAMBDA);
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==DOUBLESTAR || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
				{
				setState(1703);
				lambdaParams();
				}
			}

			setState(1706);
			match(COLON);
			setState(1707);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamsContext extends ParserRuleContext {
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamsContext lambdaParams() throws RecognitionException {
		LambdaParamsContext _localctx = new LambdaParamsContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_lambdaParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			lambdaParameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParametersContext extends ParserRuleContext {
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
	 
		public LambdaParametersContext() { }
		public void copyFrom(LambdaParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalOnlyWithDefaultsLambdaParamsContext extends LambdaParametersContext {
		public LambdaSlashWithDefaultContext lambdaSlashWithDefault() {
			return getRuleContext(LambdaSlashWithDefaultContext.class,0);
		}
		public List<LambdaParamWithDefaultContext> lambdaParamWithDefault() {
			return getRuleContexts(LambdaParamWithDefaultContext.class);
		}
		public LambdaParamWithDefaultContext lambdaParamWithDefault(int i) {
			return getRuleContext(LambdaParamWithDefaultContext.class,i);
		}
		public LambdaStarEtcContext lambdaStarEtc() {
			return getRuleContext(LambdaStarEtcContext.class,0);
		}
		public PositionalOnlyWithDefaultsLambdaParamsContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalOnlyWithDefaultsLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalOnlyWithDefaultsLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalOnlyWithDefaultsLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarLambdaParamsContext extends LambdaParametersContext {
		public LambdaStarEtcContext lambdaStarEtc() {
			return getRuleContext(LambdaStarEtcContext.class,0);
		}
		public StarLambdaParamsContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamsWithDefaultsContext extends LambdaParametersContext {
		public List<LambdaParamWithDefaultContext> lambdaParamWithDefault() {
			return getRuleContexts(LambdaParamWithDefaultContext.class);
		}
		public LambdaParamWithDefaultContext lambdaParamWithDefault(int i) {
			return getRuleContext(LambdaParamWithDefaultContext.class,i);
		}
		public LambdaStarEtcContext lambdaStarEtc() {
			return getRuleContext(LambdaStarEtcContext.class,0);
		}
		public LambdaParamsWithDefaultsContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParamsWithDefaults(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParamsWithDefaults(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParamsWithDefaults(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalOnlyLambdaParamsContext extends LambdaParametersContext {
		public LambdaSlashNoDefaultContext lambdaSlashNoDefault() {
			return getRuleContext(LambdaSlashNoDefaultContext.class,0);
		}
		public List<LambdaParamNoDefaultContext> lambdaParamNoDefault() {
			return getRuleContexts(LambdaParamNoDefaultContext.class);
		}
		public LambdaParamNoDefaultContext lambdaParamNoDefault(int i) {
			return getRuleContext(LambdaParamNoDefaultContext.class,i);
		}
		public List<LambdaParamWithDefaultContext> lambdaParamWithDefault() {
			return getRuleContexts(LambdaParamWithDefaultContext.class);
		}
		public LambdaParamWithDefaultContext lambdaParamWithDefault(int i) {
			return getRuleContext(LambdaParamWithDefaultContext.class,i);
		}
		public LambdaStarEtcContext lambdaStarEtc() {
			return getRuleContext(LambdaStarEtcContext.class,0);
		}
		public PositionalOnlyLambdaParamsContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalOnlyLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalOnlyLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalOnlyLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularLambdaParamsContext extends LambdaParametersContext {
		public List<LambdaParamNoDefaultContext> lambdaParamNoDefault() {
			return getRuleContexts(LambdaParamNoDefaultContext.class);
		}
		public LambdaParamNoDefaultContext lambdaParamNoDefault(int i) {
			return getRuleContext(LambdaParamNoDefaultContext.class,i);
		}
		public List<LambdaParamWithDefaultContext> lambdaParamWithDefault() {
			return getRuleContexts(LambdaParamWithDefaultContext.class);
		}
		public LambdaParamWithDefaultContext lambdaParamWithDefault(int i) {
			return getRuleContext(LambdaParamWithDefaultContext.class,i);
		}
		public LambdaStarEtcContext lambdaStarEtc() {
			return getRuleContext(LambdaStarEtcContext.class,0);
		}
		public RegularLambdaParamsContext(LambdaParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularLambdaParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularLambdaParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularLambdaParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_lambdaParameters);
		int _la;
		try {
			int _alt;
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				_localctx = new PositionalOnlyLambdaParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1711);
				lambdaSlashNoDefault();
				setState(1715);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1712);
						lambdaParamNoDefault();
						}
						} 
					}
					setState(1717);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
				}
				setState(1721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(1718);
					lambdaParamWithDefault();
					}
					}
					setState(1723);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1724);
					lambdaStarEtc();
					}
				}

				}
				break;
			case 2:
				_localctx = new PositionalOnlyWithDefaultsLambdaParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1727);
				lambdaSlashWithDefault();
				setState(1731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(1728);
					lambdaParamWithDefault();
					}
					}
					setState(1733);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1734);
					lambdaStarEtc();
					}
				}

				}
				break;
			case 3:
				_localctx = new RegularLambdaParamsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1738); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1737);
						lambdaParamNoDefault();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1740); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(1742);
					lambdaParamWithDefault();
					}
					}
					setState(1747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1748);
					lambdaStarEtc();
					}
				}

				}
				break;
			case 4:
				_localctx = new LambdaParamsWithDefaultsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1752); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1751);
					lambdaParamWithDefault();
					}
					}
					setState(1754); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
				setState(1757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR || _la==DOUBLESTAR) {
					{
					setState(1756);
					lambdaStarEtc();
					}
				}

				}
				break;
			case 5:
				_localctx = new StarLambdaParamsContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1759);
				lambdaStarEtc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaSlashNoDefaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<LambdaParamNoDefaultContext> lambdaParamNoDefault() {
			return getRuleContexts(LambdaParamNoDefaultContext.class);
		}
		public LambdaParamNoDefaultContext lambdaParamNoDefault(int i) {
			return getRuleContext(LambdaParamNoDefaultContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaSlashNoDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaSlashNoDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaSlashNoDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaSlashNoDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaSlashNoDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaSlashNoDefaultContext lambdaSlashNoDefault() throws RecognitionException {
		LambdaSlashNoDefaultContext _localctx = new LambdaSlashNoDefaultContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_lambdaSlashNoDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1762);
				lambdaParamNoDefault();
				}
				}
				setState(1765); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
			setState(1767);
			match(SLASH);
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1768);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaSlashWithDefaultContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PythonParser.SLASH, 0); }
		public List<LambdaParamNoDefaultContext> lambdaParamNoDefault() {
			return getRuleContexts(LambdaParamNoDefaultContext.class);
		}
		public LambdaParamNoDefaultContext lambdaParamNoDefault(int i) {
			return getRuleContext(LambdaParamNoDefaultContext.class,i);
		}
		public List<LambdaParamWithDefaultContext> lambdaParamWithDefault() {
			return getRuleContexts(LambdaParamWithDefaultContext.class);
		}
		public LambdaParamWithDefaultContext lambdaParamWithDefault(int i) {
			return getRuleContext(LambdaParamWithDefaultContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaSlashWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaSlashWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaSlashWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaSlashWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaSlashWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaSlashWithDefaultContext lambdaSlashWithDefault() throws RecognitionException {
		LambdaSlashWithDefaultContext _localctx = new LambdaSlashWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_lambdaSlashWithDefault);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1771);
					lambdaParamNoDefault();
					}
					} 
				}
				setState(1776);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			setState(1778); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1777);
				lambdaParamWithDefault();
				}
				}
				setState(1780); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
			setState(1782);
			match(SLASH);
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1783);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaStarEtcContext extends ParserRuleContext {
		public LambdaStarEtcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaStarEtc; }
	 
		public LambdaStarEtcContext() { }
		public void copyFrom(LambdaStarEtcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareStarLambdaParamContext extends LambdaStarEtcContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public List<LambdaParamMaybeDefaultContext> lambdaParamMaybeDefault() {
			return getRuleContexts(LambdaParamMaybeDefaultContext.class);
		}
		public LambdaParamMaybeDefaultContext lambdaParamMaybeDefault(int i) {
			return getRuleContext(LambdaParamMaybeDefaultContext.class,i);
		}
		public LambdaKwdsContext lambdaKwds() {
			return getRuleContext(LambdaKwdsContext.class,0);
		}
		public BareStarLambdaParamContext(LambdaStarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterBareStarLambdaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitBareStarLambdaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitBareStarLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LambdaKeywordParamsContext extends LambdaStarEtcContext {
		public LambdaKwdsContext lambdaKwds() {
			return getRuleContext(LambdaKwdsContext.class,0);
		}
		public LambdaKeywordParamsContext(LambdaStarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaKeywordParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaKeywordParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaKeywordParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarLambdaParamContext extends LambdaStarEtcContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public LambdaParamNoDefaultContext lambdaParamNoDefault() {
			return getRuleContext(LambdaParamNoDefaultContext.class,0);
		}
		public List<LambdaParamMaybeDefaultContext> lambdaParamMaybeDefault() {
			return getRuleContexts(LambdaParamMaybeDefaultContext.class);
		}
		public LambdaParamMaybeDefaultContext lambdaParamMaybeDefault(int i) {
			return getRuleContext(LambdaParamMaybeDefaultContext.class,i);
		}
		public LambdaKwdsContext lambdaKwds() {
			return getRuleContext(LambdaKwdsContext.class,0);
		}
		public StarLambdaParamContext(LambdaStarEtcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarLambdaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarLambdaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaStarEtcContext lambdaStarEtc() throws RecognitionException {
		LambdaStarEtcContext _localctx = new LambdaStarEtcContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_lambdaStarEtc);
		int _la;
		try {
			setState(1808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				_localctx = new StarLambdaParamContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1786);
				match(STAR);
				setState(1787);
				lambdaParamNoDefault();
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0)) {
					{
					{
					setState(1788);
					lambdaParamMaybeDefault();
					}
					}
					setState(1793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1794);
					lambdaKwds();
					}
				}

				}
				break;
			case 2:
				_localctx = new BareStarLambdaParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1797);
				match(STAR);
				setState(1798);
				match(COMMA);
				setState(1800); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1799);
					lambdaParamMaybeDefault();
					}
					}
					setState(1802); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 31L) != 0) );
				setState(1805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOUBLESTAR) {
					{
					setState(1804);
					lambdaKwds();
					}
				}

				}
				break;
			case 3:
				_localctx = new LambdaKeywordParamsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1807);
				lambdaKwds();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaKwdsContext extends ParserRuleContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public LambdaParamNoDefaultContext lambdaParamNoDefault() {
			return getRuleContext(LambdaParamNoDefaultContext.class,0);
		}
		public LambdaKwdsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaKwds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaKwds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaKwds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaKwds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaKwdsContext lambdaKwds() throws RecognitionException {
		LambdaKwdsContext _localctx = new LambdaKwdsContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_lambdaKwds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(DOUBLESTAR);
			setState(1811);
			lambdaParamNoDefault();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamNoDefaultContext extends ParserRuleContext {
		public LambdaParamContext lambdaParam() {
			return getRuleContext(LambdaParamContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaParamNoDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParamNoDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParamNoDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParamNoDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParamNoDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamNoDefaultContext lambdaParamNoDefault() throws RecognitionException {
		LambdaParamNoDefaultContext _localctx = new LambdaParamNoDefaultContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_lambdaParamNoDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			lambdaParam();
			setState(1815);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1814);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamWithDefaultContext extends ParserRuleContext {
		public LambdaParamContext lambdaParam() {
			return getRuleContext(LambdaParamContext.class,0);
		}
		public DefaultAssignmentContext defaultAssignment() {
			return getRuleContext(DefaultAssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaParamWithDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParamWithDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParamWithDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParamWithDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParamWithDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamWithDefaultContext lambdaParamWithDefault() throws RecognitionException {
		LambdaParamWithDefaultContext _localctx = new LambdaParamWithDefaultContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_lambdaParamWithDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1817);
			lambdaParam();
			setState(1818);
			defaultAssignment();
			setState(1820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1819);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamMaybeDefaultContext extends ParserRuleContext {
		public LambdaParamContext lambdaParam() {
			return getRuleContext(LambdaParamContext.class,0);
		}
		public DefaultAssignmentContext defaultAssignment() {
			return getRuleContext(DefaultAssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public LambdaParamMaybeDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParamMaybeDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParamMaybeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParamMaybeDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParamMaybeDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamMaybeDefaultContext lambdaParamMaybeDefault() throws RecognitionException {
		LambdaParamMaybeDefaultContext _localctx = new LambdaParamMaybeDefaultContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_lambdaParamMaybeDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			lambdaParam();
			setState(1824);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1823);
				defaultAssignment();
				}
			}

			setState(1827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1826);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaParamContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LambdaParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterLambdaParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitLambdaParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitLambdaParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaParamContext lambdaParam() throws RecognitionException {
		LambdaParamContext _localctx = new LambdaParamContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_lambdaParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringMiddleContext extends ParserRuleContext {
		public FstringMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstringMiddle; }
	 
		public FstringMiddleContext() { }
		public void copyFrom(FstringMiddleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringReplacementFieldMiddleContext extends FstringMiddleContext {
		public FstringReplacementFieldContext fstringReplacementField() {
			return getRuleContext(FstringReplacementFieldContext.class,0);
		}
		public FStringReplacementFieldMiddleContext(FstringMiddleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFStringReplacementFieldMiddle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFStringReplacementFieldMiddle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringReplacementFieldMiddle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringMiddleTextContext extends FstringMiddleContext {
		public TerminalNode FSTRING_MIDDLE() { return getToken(PythonParser.FSTRING_MIDDLE, 0); }
		public FStringMiddleTextContext(FstringMiddleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFStringMiddleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFStringMiddleText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringMiddleText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringMiddleContext fstringMiddle() throws RecognitionException {
		FstringMiddleContext _localctx = new FstringMiddleContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_fstringMiddle);
		try {
			setState(1833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new FStringReplacementFieldMiddleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				fstringReplacementField();
				}
				break;
			case FSTRING_MIDDLE:
				_localctx = new FStringMiddleTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1832);
				match(FSTRING_MIDDLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringReplacementFieldContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public FstringConversionContext fstringConversion() {
			return getRuleContext(FstringConversionContext.class,0);
		}
		public FstringFullFormatSpecContext fstringFullFormatSpec() {
			return getRuleContext(FstringFullFormatSpecContext.class,0);
		}
		public FstringReplacementFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstringReplacementField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstringReplacementField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstringReplacementField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFstringReplacementField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringReplacementFieldContext fstringReplacementField() throws RecognitionException {
		FstringReplacementFieldContext _localctx = new FstringReplacementFieldContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_fstringReplacementField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(LBRACE);
			setState(1836);
			annotatedRhs();
			setState(1838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1837);
				match(EQUAL);
				}
			}

			setState(1841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(1840);
				fstringConversion();
				}
			}

			setState(1844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1843);
				fstringFullFormatSpec();
				}
			}

			setState(1846);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringConversionContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION() { return getToken(PythonParser.EXCLAMATION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FstringConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstringConversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstringConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstringConversion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFstringConversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringConversionContext fstringConversion() throws RecognitionException {
		FstringConversionContext _localctx = new FstringConversionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_fstringConversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(EXCLAMATION);
			setState(1849);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringFullFormatSpecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public List<FstringFormatSpecContext> fstringFormatSpec() {
			return getRuleContexts(FstringFormatSpecContext.class);
		}
		public FstringFormatSpecContext fstringFormatSpec(int i) {
			return getRuleContext(FstringFormatSpecContext.class,i);
		}
		public FstringFullFormatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstringFullFormatSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstringFullFormatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstringFullFormatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFstringFullFormatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringFullFormatSpecContext fstringFullFormatSpec() throws RecognitionException {
		FstringFullFormatSpecContext _localctx = new FstringFullFormatSpecContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_fstringFullFormatSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(COLON);
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1852);
				fstringFormatSpec();
				}
				}
				setState(1857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringFormatSpecContext extends ParserRuleContext {
		public FstringFormatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstringFormatSpec; }
	 
		public FstringFormatSpecContext() { }
		public void copyFrom(FstringFormatSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringFormatSpecTextContext extends FstringFormatSpecContext {
		public TerminalNode FSTRING_MIDDLE() { return getToken(PythonParser.FSTRING_MIDDLE, 0); }
		public FStringFormatSpecTextContext(FstringFormatSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFStringFormatSpecText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFStringFormatSpecText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringFormatSpecText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringFormatSpecReplacementFieldContext extends FstringFormatSpecContext {
		public FstringReplacementFieldContext fstringReplacementField() {
			return getRuleContext(FstringReplacementFieldContext.class,0);
		}
		public FStringFormatSpecReplacementFieldContext(FstringFormatSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFStringFormatSpecReplacementField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFStringFormatSpecReplacementField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringFormatSpecReplacementField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringFormatSpecContext fstringFormatSpec() throws RecognitionException {
		FstringFormatSpecContext _localctx = new FstringFormatSpecContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_fstringFormatSpec);
		try {
			setState(1860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_MIDDLE:
				_localctx = new FStringFormatSpecTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1858);
				match(FSTRING_MIDDLE);
				}
				break;
			case LBRACE:
				_localctx = new FStringFormatSpecReplacementFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1859);
				fstringReplacementField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FstringContext extends ParserRuleContext {
		public TerminalNode FSTRING_START() { return getToken(PythonParser.FSTRING_START, 0); }
		public TerminalNode FSTRING_END() { return getToken(PythonParser.FSTRING_END, 0); }
		public List<FstringMiddleContext> fstringMiddle() {
			return getRuleContexts(FstringMiddleContext.class);
		}
		public FstringMiddleContext fstringMiddle(int i) {
			return getRuleContext(FstringMiddleContext.class,i);
		}
		public FstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FstringContext fstring() throws RecognitionException {
		FstringContext _localctx = new FstringContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_fstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(FSTRING_START);
			setState(1866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1863);
				fstringMiddle();
				}
				}
				setState(1868);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1869);
			match(FSTRING_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TstringFormatSpecContext extends ParserRuleContext {
		public TstringFormatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tstringFormatSpec; }
	 
		public TstringFormatSpecContext() { }
		public void copyFrom(TstringFormatSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TStringFormatSpecReplacementFieldContext extends TstringFormatSpecContext {
		public TstringReplacementFieldContext tstringReplacementField() {
			return getRuleContext(TstringReplacementFieldContext.class,0);
		}
		public TStringFormatSpecReplacementFieldContext(TstringFormatSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTStringFormatSpecReplacementField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTStringFormatSpecReplacementField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTStringFormatSpecReplacementField(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TStringFormatSpecTextContext extends TstringFormatSpecContext {
		public TerminalNode TSTRING_MIDDLE() { return getToken(PythonParser.TSTRING_MIDDLE, 0); }
		public TStringFormatSpecTextContext(TstringFormatSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTStringFormatSpecText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTStringFormatSpecText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTStringFormatSpecText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TstringFormatSpecContext tstringFormatSpec() throws RecognitionException {
		TstringFormatSpecContext _localctx = new TstringFormatSpecContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tstringFormatSpec);
		try {
			setState(1873);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TSTRING_MIDDLE:
				_localctx = new TStringFormatSpecTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1871);
				match(TSTRING_MIDDLE);
				}
				break;
			case LBRACE:
				_localctx = new TStringFormatSpecReplacementFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1872);
				tstringReplacementField();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TstringFullFormatSpecContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public List<TstringFormatSpecContext> tstringFormatSpec() {
			return getRuleContexts(TstringFormatSpecContext.class);
		}
		public TstringFormatSpecContext tstringFormatSpec(int i) {
			return getRuleContext(TstringFormatSpecContext.class,i);
		}
		public TstringFullFormatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tstringFullFormatSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTstringFullFormatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTstringFullFormatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTstringFullFormatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TstringFullFormatSpecContext tstringFullFormatSpec() throws RecognitionException {
		TstringFullFormatSpecContext _localctx = new TstringFullFormatSpecContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_tstringFullFormatSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			match(COLON);
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1876);
				tstringFormatSpec();
				}
				}
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TstringReplacementFieldContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public AnnotatedRhsContext annotatedRhs() {
			return getRuleContext(AnnotatedRhsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public FstringConversionContext fstringConversion() {
			return getRuleContext(FstringConversionContext.class,0);
		}
		public TstringFullFormatSpecContext tstringFullFormatSpec() {
			return getRuleContext(TstringFullFormatSpecContext.class,0);
		}
		public TstringReplacementFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tstringReplacementField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTstringReplacementField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTstringReplacementField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTstringReplacementField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TstringReplacementFieldContext tstringReplacementField() throws RecognitionException {
		TstringReplacementFieldContext _localctx = new TstringReplacementFieldContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_tstringReplacementField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			match(LBRACE);
			setState(1883);
			annotatedRhs();
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(1884);
				match(EQUAL);
				}
			}

			setState(1888);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAMATION) {
				{
				setState(1887);
				fstringConversion();
				}
			}

			setState(1891);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1890);
				tstringFullFormatSpec();
				}
			}

			setState(1893);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TstringMiddleContext extends ParserRuleContext {
		public TstringMiddleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tstringMiddle; }
	 
		public TstringMiddleContext() { }
		public void copyFrom(TstringMiddleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TStringReplacementFieldMiddleContext extends TstringMiddleContext {
		public TstringReplacementFieldContext tstringReplacementField() {
			return getRuleContext(TstringReplacementFieldContext.class,0);
		}
		public TStringReplacementFieldMiddleContext(TstringMiddleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTStringReplacementFieldMiddle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTStringReplacementFieldMiddle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTStringReplacementFieldMiddle(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TStringMiddleTextContext extends TstringMiddleContext {
		public TerminalNode TSTRING_MIDDLE() { return getToken(PythonParser.TSTRING_MIDDLE, 0); }
		public TStringMiddleTextContext(TstringMiddleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTStringMiddleText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTStringMiddleText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTStringMiddleText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TstringMiddleContext tstringMiddle() throws RecognitionException {
		TstringMiddleContext _localctx = new TstringMiddleContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tstringMiddle);
		try {
			setState(1897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				_localctx = new TStringReplacementFieldMiddleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				tstringReplacementField();
				}
				break;
			case TSTRING_MIDDLE:
				_localctx = new TStringMiddleTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
				match(TSTRING_MIDDLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TstringContext extends ParserRuleContext {
		public TerminalNode TSTRING_START() { return getToken(PythonParser.TSTRING_START, 0); }
		public TerminalNode TSTRING_END() { return getToken(PythonParser.TSTRING_END, 0); }
		public List<TstringMiddleContext> tstringMiddle() {
			return getRuleContexts(TstringMiddleContext.class);
		}
		public TstringMiddleContext tstringMiddle(int i) {
			return getRuleContext(TstringMiddleContext.class,i);
		}
		public TstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TstringContext tstring() throws RecognitionException {
		TstringContext _localctx = new TstringContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_tstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			match(TSTRING_START);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TSTRING_MIDDLE || _la==LBRACE) {
				{
				{
				setState(1900);
				tstringMiddle();
				}
				}
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1906);
			match(TSTRING_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PythonParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringsContext extends ParserRuleContext {
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
	 
		public StringsContext() { }
		public void copyFrom(StringsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TStringStringsContext extends StringsContext {
		public List<TstringContext> tstring() {
			return getRuleContexts(TstringContext.class);
		}
		public TstringContext tstring(int i) {
			return getRuleContext(TstringContext.class,i);
		}
		public TStringStringsContext(StringsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTStringStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTStringStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTStringStrings(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FStringStringsContext extends StringsContext {
		public List<FstringContext> fstring() {
			return getRuleContexts(FstringContext.class);
		}
		public FstringContext fstring(int i) {
			return getRuleContext(FstringContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public FStringStringsContext(StringsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterFStringStrings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitFStringStrings(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitFStringStrings(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_strings);
		try {
			int _alt;
			setState(1921);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case STRING:
				_localctx = new FStringStringsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1912); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(1912);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FSTRING_START:
							{
							setState(1910);
							fstring();
							}
							break;
						case STRING:
							{
							setState(1911);
							string();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1914); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TSTRING_START:
				_localctx = new TStringStringsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1917); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1916);
						tstring();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1919); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public StarNamedExpressionsContext starNamedExpressions() {
			return getRuleContext(StarNamedExpressionsContext.class,0);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			match(LSQB);
			setState(1925);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(1924);
				starNamedExpressions();
				}
			}

			setState(1927);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public StarNamedExpressionContext starNamedExpression() {
			return getRuleContext(StarNamedExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public StarNamedExpressionsContext starNamedExpressions() {
			return getRuleContext(StarNamedExpressionsContext.class,0);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_tuple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(LPAR);
			setState(1935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(1930);
				starNamedExpression();
				setState(1931);
				match(COMMA);
				setState(1933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602879770645262624L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
					{
					setState(1932);
					starNamedExpressions();
					}
				}

				}
			}

			setState(1937);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public StarNamedExpressionsContext starNamedExpressions() {
			return getRuleContext(StarNamedExpressionsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			match(LBRACE);
			setState(1940);
			starNamedExpressions();
			setState(1941);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public DoubleStarredKvpairsContext doubleStarredKvpairs() {
			return getRuleContext(DoubleStarredKvpairsContext.class,0);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDict(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(LBRACE);
			setState(1945);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602880870140113184L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
				{
				setState(1944);
				doubleStarredKvpairs();
				}
			}

			setState(1947);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarredKvpairsContext extends ParserRuleContext {
		public List<DoubleStarredKvpairContext> doubleStarredKvpair() {
			return getRuleContexts(DoubleStarredKvpairContext.class);
		}
		public DoubleStarredKvpairContext doubleStarredKvpair(int i) {
			return getRuleContext(DoubleStarredKvpairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DoubleStarredKvpairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarredKvpairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarredKvpairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarredKvpairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarredKvpairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarredKvpairsContext doubleStarredKvpairs() throws RecognitionException {
		DoubleStarredKvpairsContext _localctx = new DoubleStarredKvpairsContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_doubleStarredKvpairs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			doubleStarredKvpair();
			setState(1954);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1950);
					match(COMMA);
					setState(1951);
					doubleStarredKvpair();
					}
					} 
				}
				setState(1956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
			}
			setState(1958);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1957);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarredKvpairContext extends ParserRuleContext {
		public DoubleStarredKvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleStarredKvpair; }
	 
		public DoubleStarredKvpairContext() { }
		public void copyFrom(DoubleStarredKvpairContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularKvpairContext extends DoubleStarredKvpairContext {
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public RegularKvpairContext(DoubleStarredKvpairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterRegularKvpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitRegularKvpair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitRegularKvpair(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarredKeyValueContext extends DoubleStarredKvpairContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public BitwiseOrContext bitwiseOr() {
			return getRuleContext(BitwiseOrContext.class,0);
		}
		public DoubleStarredKeyValueContext(DoubleStarredKvpairContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarredKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarredKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarredKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleStarredKvpairContext doubleStarredKvpair() throws RecognitionException {
		DoubleStarredKvpairContext _localctx = new DoubleStarredKvpairContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_doubleStarredKvpair);
		try {
			setState(1963);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLESTAR:
				_localctx = new DoubleStarredKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1960);
				match(DOUBLESTAR);
				setState(1961);
				bitwiseOr(0);
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new RegularKvpairContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				kvpair();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KvpairContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(PythonParser.COLON, 0); }
		public KvpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kvpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKvpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKvpair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKvpair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KvpairContext kvpair() throws RecognitionException {
		KvpairContext _localctx = new KvpairContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_kvpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			expression();
			setState(1966);
			match(COLON);
			setState(1967);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForIfClausesContext extends ParserRuleContext {
		public List<ForIfClauseContext> forIfClause() {
			return getRuleContexts(ForIfClauseContext.class);
		}
		public ForIfClauseContext forIfClause(int i) {
			return getRuleContext(ForIfClauseContext.class,i);
		}
		public ForIfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIfClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForIfClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForIfClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIfClausesContext forIfClauses() throws RecognitionException {
		ForIfClausesContext _localctx = new ForIfClausesContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_forIfClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1969);
				forIfClause();
				}
				}
				setState(1972); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FOR || _la==ASYNC );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForIfClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PythonParser.FOR, 0); }
		public StarTargetsContext starTargets() {
			return getRuleContext(StarTargetsContext.class,0);
		}
		public TerminalNode IN() { return getToken(PythonParser.IN, 0); }
		public List<DisjunctionContext> disjunction() {
			return getRuleContexts(DisjunctionContext.class);
		}
		public DisjunctionContext disjunction(int i) {
			return getRuleContext(DisjunctionContext.class,i);
		}
		public TerminalNode ASYNC() { return getToken(PythonParser.ASYNC, 0); }
		public List<TerminalNode> IF() { return getTokens(PythonParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PythonParser.IF, i);
		}
		public ForIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterForIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitForIfClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitForIfClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForIfClauseContext forIfClause() throws RecognitionException {
		ForIfClauseContext _localctx = new ForIfClauseContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_forIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASYNC) {
				{
				setState(1974);
				match(ASYNC);
				}
			}

			setState(1977);
			match(FOR);
			setState(1978);
			starTargets();
			setState(1979);
			match(IN);
			setState(1980);
			disjunction();
			setState(1985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF) {
				{
				{
				setState(1981);
				match(IF);
				setState(1982);
				disjunction();
				}
				}
				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListcompContext extends ParserRuleContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public ForIfClausesContext forIfClauses() {
			return getRuleContext(ForIfClausesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public ListcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListcompContext listcomp() throws RecognitionException {
		ListcompContext _localctx = new ListcompContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_listcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1988);
			match(LSQB);
			setState(1989);
			namedExpression();
			setState(1990);
			forIfClauses();
			setState(1991);
			match(RSQB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetcompContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public ForIfClausesContext forIfClauses() {
			return getRuleContext(ForIfClausesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public SetcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSetcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSetcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSetcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetcompContext setcomp() throws RecognitionException {
		SetcompContext _localctx = new SetcompContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_setcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(LBRACE);
			setState(1994);
			namedExpression();
			setState(1995);
			forIfClauses();
			setState(1996);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenexpContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public ForIfClausesContext forIfClauses() {
			return getRuleContext(ForIfClausesContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterGenexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitGenexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitGenexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenexpContext genexp() throws RecognitionException {
		GenexpContext _localctx = new GenexpContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_genexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1998);
			match(LPAR);
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(1999);
				assignmentExpression();
				}
				break;
			case 2:
				{
				setState(2000);
				expression();
				}
				break;
			}
			setState(2003);
			forIfClauses();
			setState(2004);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DictcompContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PythonParser.LBRACE, 0); }
		public KvpairContext kvpair() {
			return getRuleContext(KvpairContext.class,0);
		}
		public ForIfClausesContext forIfClauses() {
			return getRuleContext(ForIfClausesContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(PythonParser.RBRACE, 0); }
		public DictcompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictcomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDictcomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDictcomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDictcomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictcompContext dictcomp() throws RecognitionException {
		DictcompContext _localctx = new DictcompContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_dictcomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			match(LBRACE);
			setState(2007);
			kvpair();
			setState(2008);
			forIfClauses();
			setState(2009);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2011);
			args();
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2012);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	 
		public ArgsContext() { }
		public void copyFrom(ArgsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgsWithKwargsContext extends ArgsContext {
		public List<StarredExpressionContext> starredExpression() {
			return getRuleContexts(StarredExpressionContext.class);
		}
		public StarredExpressionContext starredExpression(int i) {
			return getRuleContext(StarredExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public List<AssignmentExpressionContext> assignmentExpression() {
			return getRuleContexts(AssignmentExpressionContext.class);
		}
		public AssignmentExpressionContext assignmentExpression(int i) {
			return getRuleContext(AssignmentExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PositionalArgsWithKwargsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPositionalArgsWithKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPositionalArgsWithKwargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPositionalArgsWithKwargs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgsContext extends ArgsContext {
		public KwargsContext kwargs() {
			return getRuleContext(KwargsContext.class,0);
		}
		public KeywordArgsContext(ArgsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterKeywordArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitKeywordArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitKeywordArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_args);
		try {
			int _alt;
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
			case 1:
				_localctx = new PositionalArgsWithKwargsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2020);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(2015);
					starredExpression();
					}
					break;
				case FSTRING_START:
				case TSTRING_START:
				case LPAR:
				case LSQB:
				case LBRACE:
				case PLUS:
				case MINUS:
				case TILDE:
				case ELLIPSIS:
				case FALSE:
				case AWAIT:
				case NONE:
				case TRUE:
				case LAMBDA:
				case NOT:
				case NAME_OR_TYPE:
				case NAME_OR_MATCH:
				case NAME_OR_CASE:
				case NAME_OR_WILDCARD:
				case NAME:
				case NUMBER:
				case STRING:
					{
					setState(2018);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
					case 1:
						{
						setState(2016);
						assignmentExpression();
						}
						break;
					case 2:
						{
						setState(2017);
						expression();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2032);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2022);
						match(COMMA);
						setState(2028);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(2023);
							starredExpression();
							}
							break;
						case FSTRING_START:
						case TSTRING_START:
						case LPAR:
						case LSQB:
						case LBRACE:
						case PLUS:
						case MINUS:
						case TILDE:
						case ELLIPSIS:
						case FALSE:
						case AWAIT:
						case NONE:
						case TRUE:
						case LAMBDA:
						case NOT:
						case NAME_OR_TYPE:
						case NAME_OR_MATCH:
						case NAME_OR_CASE:
						case NAME_OR_WILDCARD:
						case NAME:
						case NUMBER:
						case STRING:
							{
							setState(2026);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
							case 1:
								{
								setState(2024);
								assignmentExpression();
								}
								break;
							case 2:
								{
								setState(2025);
								expression();
								}
								break;
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						} 
					}
					setState(2034);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,260,_ctx);
				}
				setState(2037);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2035);
					match(COMMA);
					setState(2036);
					kwargs();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new KeywordArgsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2039);
				kwargs();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KwargsContext extends ParserRuleContext {
		public KwargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargs; }
	 
		public KwargsContext() { }
		public void copyFrom(KwargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarredKwargsContext extends KwargsContext {
		public List<KwargOrStarredContext> kwargOrStarred() {
			return getRuleContexts(KwargOrStarredContext.class);
		}
		public KwargOrStarredContext kwargOrStarred(int i) {
			return getRuleContext(KwargOrStarredContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public List<KwargOrDoubleStarredContext> kwargOrDoubleStarred() {
			return getRuleContexts(KwargOrDoubleStarredContext.class);
		}
		public KwargOrDoubleStarredContext kwargOrDoubleStarred(int i) {
			return getRuleContext(KwargOrDoubleStarredContext.class,i);
		}
		public StarredKwargsContext(KwargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarredKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarredKwargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarredKwargs(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarredKwargsContext extends KwargsContext {
		public List<KwargOrDoubleStarredContext> kwargOrDoubleStarred() {
			return getRuleContexts(KwargOrDoubleStarredContext.class);
		}
		public KwargOrDoubleStarredContext kwargOrDoubleStarred(int i) {
			return getRuleContext(KwargOrDoubleStarredContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DoubleStarredKwargsContext(KwargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarredKwargs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarredKwargs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarredKwargs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargsContext kwargs() throws RecognitionException {
		KwargsContext _localctx = new KwargsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_kwargs);
		try {
			int _alt;
			setState(2069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				_localctx = new StarredKwargsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2042);
				kwargOrStarred();
				setState(2047);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2043);
						match(COMMA);
						setState(2044);
						kwargOrStarred();
						}
						} 
					}
					setState(2049);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,263,_ctx);
				}
				setState(2059);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2050);
					match(COMMA);
					setState(2051);
					kwargOrDoubleStarred();
					setState(2056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2052);
							match(COMMA);
							setState(2053);
							kwargOrDoubleStarred();
							}
							} 
						}
						setState(2058);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DoubleStarredKwargsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				kwargOrDoubleStarred();
				setState(2066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2062);
						match(COMMA);
						setState(2063);
						kwargOrDoubleStarred();
						}
						} 
					}
					setState(2068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,266,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarredExpressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StarredExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starredExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarredExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarredExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarredExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarredExpressionContext starredExpression() throws RecognitionException {
		StarredExpressionContext _localctx = new StarredExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_starredExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2071);
			match(STAR);
			setState(2072);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KwargOrStarredContext extends ParserRuleContext {
		public KwargOrStarredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargOrStarred; }
	 
		public KwargOrStarredContext() { }
		public void copyFrom(KwargOrStarredContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarredArgContext extends KwargOrStarredContext {
		public StarredExpressionContext starredExpression() {
			return getRuleContext(StarredExpressionContext.class,0);
		}
		public StarredArgContext(KwargOrStarredContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarredArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarredArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarredArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedArgContext extends KwargOrStarredContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgContext(KwargOrStarredContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNamedArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNamedArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNamedArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargOrStarredContext kwargOrStarred() throws RecognitionException {
		KwargOrStarredContext _localctx = new KwargOrStarredContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_kwargOrStarred);
		try {
			setState(2079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				_localctx = new NamedArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2074);
				name();
				setState(2075);
				match(EQUAL);
				setState(2076);
				expression();
				}
				break;
			case STAR:
				_localctx = new StarredArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2078);
				starredExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KwargOrDoubleStarredContext extends ParserRuleContext {
		public KwargOrDoubleStarredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kwargOrDoubleStarred; }
	 
		public KwargOrDoubleStarredContext() { }
		public void copyFrom(KwargOrDoubleStarredContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedDoubleStarArgContext extends KwargOrDoubleStarredContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(PythonParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedDoubleStarArgContext(KwargOrDoubleStarredContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNamedDoubleStarArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNamedDoubleStarArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNamedDoubleStarArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarredArgContext extends KwargOrDoubleStarredContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoubleStarredArgContext(KwargOrDoubleStarredContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarredArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarredArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarredArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KwargOrDoubleStarredContext kwargOrDoubleStarred() throws RecognitionException {
		KwargOrDoubleStarredContext _localctx = new KwargOrDoubleStarredContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_kwargOrDoubleStarred);
		try {
			setState(2087);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
				_localctx = new NamedDoubleStarArgContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2081);
				name();
				setState(2082);
				match(EQUAL);
				setState(2083);
				expression();
				}
				break;
			case DOUBLESTAR:
				_localctx = new DoubleStarredArgContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2085);
				match(DOUBLESTAR);
				setState(2086);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetsContext extends ParserRuleContext {
		public List<StarTargetContext> starTarget() {
			return getRuleContexts(StarTargetContext.class);
		}
		public StarTargetContext starTarget(int i) {
			return getRuleContext(StarTargetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarTargetsContext starTargets() throws RecognitionException {
		StarTargetsContext _localctx = new StarTargetsContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_starTargets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2089);
			starTarget();
			setState(2094);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2090);
					match(COMMA);
					setState(2091);
					starTarget();
					}
					} 
				}
				setState(2096);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
			}
			setState(2098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2097);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetsListSeqContext extends ParserRuleContext {
		public List<StarTargetContext> starTarget() {
			return getRuleContexts(StarTargetContext.class);
		}
		public StarTargetContext starTarget(int i) {
			return getRuleContext(StarTargetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarTargetsListSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starTargetsListSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetsListSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetsListSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetsListSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarTargetsListSeqContext starTargetsListSeq() throws RecognitionException {
		StarTargetsListSeqContext _localctx = new StarTargetsListSeqContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_starTargetsListSeq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			starTarget();
			setState(2105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2101);
					match(COMMA);
					setState(2102);
					starTarget();
					}
					} 
				}
				setState(2107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,272,_ctx);
			}
			setState(2109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2108);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetsTupleSeqContext extends ParserRuleContext {
		public List<StarTargetContext> starTarget() {
			return getRuleContexts(StarTargetContext.class);
		}
		public StarTargetContext starTarget(int i) {
			return getRuleContext(StarTargetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public StarTargetsTupleSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starTargetsTupleSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTargetsTupleSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTargetsTupleSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTargetsTupleSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarTargetsTupleSeqContext starTargetsTupleSeq() throws RecognitionException {
		StarTargetsTupleSeqContext _localctx = new StarTargetsTupleSeqContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_starTargetsTupleSeq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			starTarget();
			setState(2122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2112);
				match(COMMA);
				}
				break;
			case 2:
				{
				setState(2115); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2113);
						match(COMMA);
						setState(2114);
						starTarget();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2117); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2119);
					match(COMMA);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarTargetContext extends ParserRuleContext {
		public StarTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starTarget; }
	 
		public StarTargetContext() { }
		public void copyFrom(StarTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleStarTargetContext extends StarTargetContext {
		public TargetWithStarAtomContext targetWithStarAtom() {
			return getRuleContext(TargetWithStarAtomContext.class,0);
		}
		public SimpleStarTargetContext(StarTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSimpleStarTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSimpleStarTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSimpleStarTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedStarTargetContext extends StarTargetContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public StarTargetContext starTarget() {
			return getRuleContext(StarTargetContext.class,0);
		}
		public NestedStarTargetContext(StarTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNestedStarTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNestedStarTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNestedStarTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarTargetContext starTarget() throws RecognitionException {
		StarTargetContext _localctx = new StarTargetContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_starTarget);
		try {
			setState(2127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				_localctx = new NestedStarTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2124);
				match(STAR);
				{
				setState(2125);
				starTarget();
				}
				}
				break;
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case ELLIPSIS:
			case FALSE:
			case NONE:
			case TRUE:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new SimpleStarTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2126);
				targetWithStarAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetWithStarAtomContext extends ParserRuleContext {
		public TargetWithStarAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetWithStarAtom; }
	 
		public TargetWithStarAtomContext() { }
		public void copyFrom(TargetWithStarAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributedStarTargetContext extends TargetWithStarAtomContext {
		public TPrimaryContext tPrimary() {
			return getRuleContext(TPrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public AttributedStarTargetContext(TargetWithStarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttributedStarTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttributedStarTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttributedStarTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicStarTargetContext extends TargetWithStarAtomContext {
		public StarAtomContext starAtom() {
			return getRuleContext(StarAtomContext.class,0);
		}
		public AtomicStarTargetContext(TargetWithStarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomicStarTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomicStarTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomicStarTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetWithStarAtomContext targetWithStarAtom() throws RecognitionException {
		TargetWithStarAtomContext _localctx = new TargetWithStarAtomContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_targetWithStarAtom);
		try {
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				_localctx = new AttributedStarTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2129);
				tPrimary(0);
				setState(2136);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(2130);
					match(DOT);
					setState(2131);
					name();
					}
					break;
				case LSQB:
					{
					setState(2132);
					match(LSQB);
					setState(2133);
					slices();
					setState(2134);
					match(RSQB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new AtomicStarTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2138);
				starAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StarAtomContext extends ParserRuleContext {
		public StarAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starAtom; }
	 
		public StarAtomContext() { }
		public void copyFrom(StarAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameStarAtomContext extends StarAtomContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameStarAtomContext(StarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameStarAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameStarAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleStarAtomContext extends StarAtomContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public StarTargetsTupleSeqContext starTargetsTupleSeq() {
			return getRuleContext(StarTargetsTupleSeqContext.class,0);
		}
		public TupleStarAtomContext(StarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleStarAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleStarAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListStarAtomContext extends StarAtomContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public StarTargetsListSeqContext starTargetsListSeq() {
			return getRuleContext(StarTargetsListSeqContext.class,0);
		}
		public ListStarAtomContext(StarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListStarAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListStarAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedStarAtomContext extends StarAtomContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TargetWithStarAtomContext targetWithStarAtom() {
			return getRuleContext(TargetWithStarAtomContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public ParenthesizedStarAtomContext(StarAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenthesizedStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenthesizedStarAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenthesizedStarAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarAtomContext starAtom() throws RecognitionException {
		StarAtomContext _localctx = new StarAtomContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_starAtom);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				_localctx = new NameStarAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2141);
				name();
				}
				break;
			case 2:
				_localctx = new ParenthesizedStarAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2142);
				match(LPAR);
				setState(2143);
				targetWithStarAtom();
				setState(2144);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new TupleStarAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2146);
				match(LPAR);
				setState(2148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297036692699509024L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(2147);
					starTargetsTupleSeq();
					}
				}

				setState(2150);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new ListStarAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2151);
				match(LSQB);
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297036692699509024L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(2152);
					starTargetsListSeq();
					}
				}

				setState(2155);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleTargetContext extends ParserRuleContext {
		public SingleTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTarget; }
	 
		public SingleTargetContext() { }
		public void copyFrom(SingleTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptAttributeTargetContext extends SingleTargetContext {
		public SingleSubscriptAttributeTargetContext singleSubscriptAttributeTarget() {
			return getRuleContext(SingleSubscriptAttributeTargetContext.class,0);
		}
		public SubscriptAttributeTargetContext(SingleTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSubscriptAttributeTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSubscriptAttributeTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSubscriptAttributeTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameTargetContext extends SingleTargetContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameTargetContext(SingleTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedTargetContext extends SingleTargetContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public SingleTargetContext singleTarget() {
			return getRuleContext(SingleTargetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public ParenthesizedTargetContext(SingleTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenthesizedTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenthesizedTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenthesizedTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTargetContext singleTarget() throws RecognitionException {
		SingleTargetContext _localctx = new SingleTargetContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_singleTarget);
		try {
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				_localctx = new SubscriptAttributeTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2158);
				singleSubscriptAttributeTarget();
				}
				break;
			case 2:
				_localctx = new NameTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2159);
				name();
				}
				break;
			case 3:
				_localctx = new ParenthesizedTargetContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2160);
				match(LPAR);
				setState(2161);
				singleTarget();
				setState(2162);
				match(RPAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleSubscriptAttributeTargetContext extends ParserRuleContext {
		public TPrimaryContext tPrimary() {
			return getRuleContext(TPrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public SingleSubscriptAttributeTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleSubscriptAttributeTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterSingleSubscriptAttributeTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitSingleSubscriptAttributeTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitSingleSubscriptAttributeTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleSubscriptAttributeTargetContext singleSubscriptAttributeTarget() throws RecognitionException {
		SingleSubscriptAttributeTargetContext _localctx = new SingleSubscriptAttributeTargetContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_singleSubscriptAttributeTarget);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			tPrimary(0);
			setState(2173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT:
				{
				setState(2167);
				match(DOT);
				setState(2168);
				name();
				}
				break;
			case LSQB:
				{
				setState(2169);
				match(LSQB);
				setState(2170);
				slices();
				setState(2171);
				match(RSQB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryContext extends ParserRuleContext {
		public TPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tPrimary; }
	 
		public TPrimaryContext() { }
		public void copyFrom(TPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryAtomContext extends TPrimaryContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TPrimaryAtomContext(TPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TPrimaryWithAccessContext extends TPrimaryContext {
		public TPrimaryContext tPrimary() {
			return getRuleContext(TPrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public GenexpContext genexp() {
			return getRuleContext(GenexpContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TPrimaryWithAccessContext(TPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTPrimaryWithAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTPrimaryWithAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTPrimaryWithAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TPrimaryContext tPrimary() throws RecognitionException {
		return tPrimary(0);
	}

	private TPrimaryContext tPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TPrimaryContext _localctx = new TPrimaryContext(_ctx, _parentState);
		TPrimaryContext _prevctx = _localctx;
		int _startState = 394;
		enterRecursionRule(_localctx, 394, RULE_tPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TPrimaryAtomContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2176);
			atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(2195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TPrimaryWithAccessContext(new TPrimaryContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_tPrimary);
					setState(2178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(2191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
					case 1:
						{
						setState(2179);
						match(DOT);
						setState(2180);
						name();
						}
						break;
					case 2:
						{
						setState(2181);
						match(LSQB);
						setState(2182);
						slices();
						setState(2183);
						match(RSQB);
						}
						break;
					case 3:
						{
						setState(2185);
						genexp();
						}
						break;
					case 4:
						{
						setState(2186);
						match(LPAR);
						setState(2188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3602880870156890400L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136373608481L) != 0)) {
							{
							setState(2187);
							arguments();
							}
						}

						setState(2190);
						match(RPAR);
						}
						break;
					}
					}
					} 
				}
				setState(2197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,287,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelTargetsContext extends ParserRuleContext {
		public List<DelTargetContext> delTarget() {
			return getRuleContexts(DelTargetContext.class);
		}
		public DelTargetContext delTarget(int i) {
			return getRuleContext(DelTargetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public DelTargetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delTargets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDelTargets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDelTargets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDelTargets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelTargetsContext delTargets() throws RecognitionException {
		DelTargetsContext _localctx = new DelTargetsContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_delTargets);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
			delTarget();
			setState(2203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2199);
					match(COMMA);
					setState(2200);
					delTarget();
					}
					} 
				}
				setState(2205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
			}
			setState(2207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(2206);
				match(COMMA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelTargetContext extends ParserRuleContext {
		public DelTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delTarget; }
	 
		public DelTargetContext() { }
		public void copyFrom(DelTargetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributedDelTargetContext extends DelTargetContext {
		public TPrimaryContext tPrimary() {
			return getRuleContext(TPrimaryContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PythonParser.DOT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public SlicesContext slices() {
			return getRuleContext(SlicesContext.class,0);
		}
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public AttributedDelTargetContext(DelTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAttributedDelTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAttributedDelTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAttributedDelTarget(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicDelTargetContext extends DelTargetContext {
		public DelTAtomContext delTAtom() {
			return getRuleContext(DelTAtomContext.class,0);
		}
		public AtomicDelTargetContext(DelTargetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterAtomicDelTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitAtomicDelTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitAtomicDelTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelTargetContext delTarget() throws RecognitionException {
		DelTargetContext _localctx = new DelTargetContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_delTarget);
		try {
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				_localctx = new AttributedDelTargetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2209);
				tPrimary(0);
				setState(2216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(2210);
					match(DOT);
					setState(2211);
					name();
					}
					break;
				case LSQB:
					{
					setState(2212);
					match(LSQB);
					setState(2213);
					slices();
					setState(2214);
					match(RSQB);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				_localctx = new AtomicDelTargetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2218);
				delTAtom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelTAtomContext extends ParserRuleContext {
		public DelTAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delTAtom; }
	 
		public DelTAtomContext() { }
		public void copyFrom(DelTAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListDelAtomContext extends DelTAtomContext {
		public TerminalNode LSQB() { return getToken(PythonParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(PythonParser.RSQB, 0); }
		public DelTargetsContext delTargets() {
			return getRuleContext(DelTargetsContext.class,0);
		}
		public ListDelAtomContext(DelTAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterListDelAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitListDelAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitListDelAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedDelAtomContext extends DelTAtomContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public DelTargetContext delTarget() {
			return getRuleContext(DelTargetContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public ParenthesizedDelAtomContext(DelTAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterParenthesizedDelAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitParenthesizedDelAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitParenthesizedDelAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleDelAtomContext extends DelTAtomContext {
		public TerminalNode LPAR() { return getToken(PythonParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(PythonParser.RPAR, 0); }
		public DelTargetsContext delTargets() {
			return getRuleContext(DelTargetsContext.class,0);
		}
		public TupleDelAtomContext(DelTAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTupleDelAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTupleDelAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTupleDelAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameDelAtomContext extends DelTAtomContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NameDelAtomContext(DelTAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNameDelAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNameDelAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNameDelAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelTAtomContext delTAtom() throws RecognitionException {
		DelTAtomContext _localctx = new DelTAtomContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_delTAtom);
		int _la;
		try {
			setState(2236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
			case 1:
				_localctx = new NameDelAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				name();
				}
				break;
			case 2:
				_localctx = new ParenthesizedDelAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(LPAR);
				setState(2223);
				delTarget();
				setState(2224);
				match(RPAR);
				}
				break;
			case 3:
				_localctx = new TupleDelAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2226);
				match(LPAR);
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297036692682731808L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(2227);
					delTargets();
					}
				}

				setState(2230);
				match(RPAR);
				}
				break;
			case 4:
				_localctx = new ListDelAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2231);
				match(LSQB);
				setState(2233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1297036692682731808L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 136365211681L) != 0)) {
					{
					setState(2232);
					delTargets();
					}
				}

				setState(2235);
				match(RSQB);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeExpressionsContext extends ParserRuleContext {
		public TypeExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpressions; }
	 
		public TypeExpressionsContext() { }
		public void copyFrom(TypeExpressionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeExpressionsWithStarContext extends TypeExpressionsContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PythonParser.COMMA, i);
		}
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public TypeExpressionsWithStarContext(TypeExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeExpressionsWithStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeExpressionsWithStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeExpressionsWithStar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarTypeExpressionContext extends TypeExpressionsContext {
		public TerminalNode STAR() { return getToken(PythonParser.STAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(PythonParser.COMMA, 0); }
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public StarTypeExpressionContext(TypeExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterStarTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitStarTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitStarTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleStarTypeExpressionContext extends TypeExpressionsContext {
		public TerminalNode DOUBLESTAR() { return getToken(PythonParser.DOUBLESTAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoubleStarTypeExpressionContext(TypeExpressionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterDoubleStarTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitDoubleStarTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitDoubleStarTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionsContext typeExpressions() throws RecognitionException {
		TypeExpressionsContext _localctx = new TypeExpressionsContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_typeExpressions);
		int _la;
		try {
			int _alt;
			setState(2269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FSTRING_START:
			case TSTRING_START:
			case LPAR:
			case LSQB:
			case LBRACE:
			case PLUS:
			case MINUS:
			case TILDE:
			case ELLIPSIS:
			case FALSE:
			case AWAIT:
			case NONE:
			case TRUE:
			case LAMBDA:
			case NOT:
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME_OR_WILDCARD:
			case NAME:
			case NUMBER:
			case STRING:
				_localctx = new TypeExpressionsWithStarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2238);
				expression();
				setState(2243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2239);
						match(COMMA);
						setState(2240);
						expression();
						}
						} 
					}
					setState(2245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
				}
				setState(2258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2246);
					match(COMMA);
					setState(2256);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(2247);
						match(STAR);
						setState(2248);
						expression();
						setState(2252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(2249);
							match(COMMA);
							setState(2250);
							match(DOUBLESTAR);
							setState(2251);
							expression();
							}
						}

						}
						break;
					case DOUBLESTAR:
						{
						setState(2254);
						match(DOUBLESTAR);
						setState(2255);
						expression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case STAR:
				_localctx = new StarTypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				match(STAR);
				setState(2261);
				expression();
				setState(2265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(2262);
					match(COMMA);
					setState(2263);
					match(DOUBLESTAR);
					setState(2264);
					expression();
					}
				}

				}
				break;
			case DOUBLESTAR:
				_localctx = new DoubleStarTypeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2267);
				match(DOUBLESTAR);
				setState(2268);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncTypeCommentContext extends ParserRuleContext {
		public FuncTypeCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcTypeComment; }
	 
		public FuncTypeCommentContext() { }
		public void copyFrom(FuncTypeCommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineFuncTypeCommentContext extends FuncTypeCommentContext {
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public InlineFuncTypeCommentContext(FuncTypeCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterInlineFuncTypeComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitInlineFuncTypeComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitInlineFuncTypeComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewlineFuncTypeCommentContext extends FuncTypeCommentContext {
		public TerminalNode NEWLINE() { return getToken(PythonParser.NEWLINE, 0); }
		public TerminalNode TYPE_COMMENT() { return getToken(PythonParser.TYPE_COMMENT, 0); }
		public NewlineFuncTypeCommentContext(FuncTypeCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNewlineFuncTypeComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNewlineFuncTypeComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNewlineFuncTypeComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeCommentContext funcTypeComment() throws RecognitionException {
		FuncTypeCommentContext _localctx = new FuncTypeCommentContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_funcTypeComment);
		try {
			setState(2274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEWLINE:
				_localctx = new NewlineFuncTypeCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2271);
				match(NEWLINE);
				setState(2272);
				match(TYPE_COMMENT);
				}
				break;
			case TYPE_COMMENT:
				_localctx = new InlineFuncTypeCommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2273);
				match(TYPE_COMMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameExceptUnderscoreContext extends ParserRuleContext {
		public NameExceptUnderscoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameExceptUnderscore; }
	 
		public NameExceptUnderscoreContext() { }
		public void copyFrom(NameExceptUnderscoreContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends NameExceptUnderscoreContext {
		public TerminalNode NAME_OR_TYPE() { return getToken(PythonParser.NAME_OR_TYPE, 0); }
		public TypeNameContext(NameExceptUnderscoreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseNameContext extends NameExceptUnderscoreContext {
		public TerminalNode NAME_OR_CASE() { return getToken(PythonParser.NAME_OR_CASE, 0); }
		public CaseNameContext(NameExceptUnderscoreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterCaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitCaseName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitCaseName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainNameContext extends NameExceptUnderscoreContext {
		public TerminalNode NAME() { return getToken(PythonParser.NAME, 0); }
		public PlainNameContext(NameExceptUnderscoreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterPlainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitPlainName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitPlainName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatchNameContext extends NameExceptUnderscoreContext {
		public TerminalNode NAME_OR_MATCH() { return getToken(PythonParser.NAME_OR_MATCH, 0); }
		public MatchNameContext(NameExceptUnderscoreContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterMatchName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitMatchName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitMatchName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameExceptUnderscoreContext nameExceptUnderscore() throws RecognitionException {
		NameExceptUnderscoreContext _localctx = new NameExceptUnderscoreContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_nameExceptUnderscore);
		try {
			setState(2280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new PlainNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2276);
				match(NAME);
				}
				break;
			case NAME_OR_TYPE:
				_localctx = new TypeNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2277);
				match(NAME_OR_TYPE);
				}
				break;
			case NAME_OR_MATCH:
				_localctx = new MatchNameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2278);
				match(NAME_OR_MATCH);
				}
				break;
			case NAME_OR_CASE:
				_localctx = new CaseNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2279);
				match(NAME_OR_CASE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	 
		public NameContext() { }
		public void copyFrom(NameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonWildcardNameContext extends NameContext {
		public NameExceptUnderscoreContext nameExceptUnderscore() {
			return getRuleContext(NameExceptUnderscoreContext.class,0);
		}
		public NonWildcardNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterNonWildcardName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitNonWildcardName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitNonWildcardName(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WildcardNameContext extends NameContext {
		public TerminalNode NAME_OR_WILDCARD() { return getToken(PythonParser.NAME_OR_WILDCARD, 0); }
		public WildcardNameContext(NameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).enterWildcardName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PythonParserListener ) ((PythonParserListener)listener).exitWildcardName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PythonParserVisitor ) return ((PythonParserVisitor<? extends T>)visitor).visitWildcardName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_name);
		try {
			setState(2284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME_OR_WILDCARD:
				_localctx = new WildcardNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2282);
				match(NAME_OR_WILDCARD);
				}
				break;
			case NAME_OR_TYPE:
			case NAME_OR_MATCH:
			case NAME_OR_CASE:
			case NAME:
				_localctx = new NonWildcardNameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2283);
				nameExceptUnderscore();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return dottedName_sempred((DottedNameContext)_localctx, predIndex);
		case 132:
			return bitwiseOr_sempred((BitwiseOrContext)_localctx, predIndex);
		case 133:
			return bitwiseXor_sempred((BitwiseXorContext)_localctx, predIndex);
		case 134:
			return bitwiseAnd_sempred((BitwiseAndContext)_localctx, predIndex);
		case 135:
			return shiftExpr_sempred((ShiftExprContext)_localctx, predIndex);
		case 136:
			return sum_sempred((SumContext)_localctx, predIndex);
		case 137:
			return term_sempred((TermContext)_localctx, predIndex);
		case 141:
			return primary_sempred((PrimaryContext)_localctx, predIndex);
		case 197:
			return tPrimary_sempred((TPrimaryContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dottedName_sempred(DottedNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwiseOr_sempred(BitwiseOrContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwiseXor_sempred(BitwiseXorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitwiseAnd_sempred(BitwiseAndContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean shiftExpr_sempred(ShiftExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean sum_sempred(SumContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean primary_sempred(PrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tPrimary_sempred(TPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001j\u08ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007m\u0002"+
		"n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007r\u0002"+
		"s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007w\u0002"+
		"x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007|\u0002"+
		"}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007\u0080"+
		"\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007\u0083"+
		"\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007\u0086"+
		"\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007\u0089"+
		"\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007\u008c"+
		"\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007\u008f"+
		"\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007\u0092"+
		"\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007\u0095"+
		"\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007\u0098"+
		"\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007\u009b"+
		"\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007\u009e"+
		"\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007\u00a1"+
		"\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007\u00a4"+
		"\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007\u00a7"+
		"\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007\u00aa"+
		"\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007\u00ad"+
		"\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007\u00b0"+
		"\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007\u00b3"+
		"\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007\u00b6"+
		"\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007\u00b9"+
		"\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007\u00bc"+
		"\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007\u00bf"+
		"\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007\u00c2"+
		"\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007\u00c5"+
		"\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007\u00c8"+
		"\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007\u00cb"+
		"\u0002\u00cc\u0007\u00cc\u0001\u0000\u0003\u0000\u019c\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002"+
		"\u01a4\b\u0002\n\u0002\f\u0002\u01a7\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u01ad\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u01b3\b\u0003\n\u0003\f\u0003\u01b6\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u01bb\b\u0004\u000b\u0004"+
		"\f\u0004\u01bc\u0001\u0005\u0001\u0005\u0003\u0005\u01c1\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u01cb\b\u0007\u0001\b\u0001\b\u0001\b\u0005"+
		"\b\u01d0\b\b\n\b\f\b\u01d3\t\b\u0001\b\u0003\b\u01d6\b\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u01e8\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u01f2\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u01f9"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0200\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0206\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u020b"+
		"\b\u000b\u000b\u000b\f\u000b\u020c\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0211\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0217\b\u000b\u0001\f\u0001\f\u0003\f\u021b\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u022a\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u022e"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0234"+
		"\b\u000f\u0003\u000f\u0236\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0242\b\u0013\n\u0013\f\u0013\u0245\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u024b\b\u0014\n"+
		"\u0014\f\u0014\u024e\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u0259\b\u0017\u0001\u0018\u0001\u0018\u0003\u0018\u025d\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u0264\b\u001a\n\u001a\f\u001a\u0267\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0004\u001a\u026f\b\u001a\u000b"+
		"\u001a\f\u001a\u0270\u0001\u001a\u0001\u001a\u0003\u001a\u0275\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u027a\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0280\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0005\u001c\u0285\b\u001c\n\u001c\f\u001c\u0288"+
		"\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u028d\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0292\b\u001e\n\u001e"+
		"\f\u001e\u0295\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u029a\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u02a2"+
		"\b \n \f \u02a5\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u02ad"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0004\"\u02b3\b\"\u000b\"\f\"\u02b4"+
		"\u0001#\u0001#\u0001#\u0001#\u0003#\u02bb\b#\u0001$\u0001$\u0001$\u0003"+
		"$\u02c0\b$\u0001$\u0001$\u0003$\u02c4\b$\u0001$\u0003$\u02c7\b$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003%\u02d0\b%\u0001&\u0001"+
		"&\u0001&\u0003&\u02d5\b&\u0001&\u0001&\u0003&\u02d9\b&\u0001&\u0001&\u0001"+
		"&\u0003&\u02de\b&\u0001&\u0001&\u0003&\u02e2\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u02ea\b&\u0001&\u0001&\u0003&\u02ee\b&\u0001&\u0001"+
		"&\u0001&\u0003&\u02f3\b&\u0001&\u0001&\u0003&\u02f7\b&\u0001&\u0001&\u0003"+
		"&\u02fb\b&\u0001\'\u0001\'\u0001(\u0001(\u0005(\u0301\b(\n(\f(\u0304\t"+
		"(\u0001(\u0005(\u0307\b(\n(\f(\u030a\t(\u0001(\u0003(\u030d\b(\u0001("+
		"\u0001(\u0005(\u0311\b(\n(\f(\u0314\t(\u0001(\u0003(\u0317\b(\u0001(\u0004"+
		"(\u031a\b(\u000b(\f(\u031b\u0001(\u0005(\u031f\b(\n(\f(\u0322\t(\u0001"+
		"(\u0003(\u0325\b(\u0001(\u0004(\u0328\b(\u000b(\f(\u0329\u0001(\u0003"+
		"(\u032d\b(\u0001(\u0003(\u0330\b(\u0001)\u0004)\u0333\b)\u000b)\f)\u0334"+
		"\u0001)\u0001)\u0003)\u0339\b)\u0001*\u0005*\u033c\b*\n*\f*\u033f\t*\u0001"+
		"*\u0004*\u0342\b*\u000b*\f*\u0343\u0001*\u0001*\u0003*\u0348\b*\u0001"+
		"+\u0001+\u0001+\u0005+\u034d\b+\n+\f+\u0350\t+\u0001+\u0003+\u0353\b+"+
		"\u0001+\u0001+\u0001+\u0005+\u0358\b+\n+\f+\u035b\t+\u0001+\u0003+\u035e"+
		"\b+\u0001+\u0001+\u0001+\u0004+\u0363\b+\u000b+\f+\u0364\u0001+\u0003"+
		"+\u0368\b+\u0001+\u0003+\u036b\b+\u0001,\u0001,\u0001,\u0001-\u0001-\u0003"+
		"-\u0372\b-\u0001-\u0003-\u0375\b-\u0001.\u0001.\u0003.\u0379\b.\u0001"+
		".\u0003.\u037c\b.\u0001/\u0001/\u0001/\u0003/\u0381\b/\u0001/\u0003/\u0384"+
		"\b/\u00010\u00010\u00030\u0388\b0\u00010\u00030\u038b\b0\u00010\u0003"+
		"0\u038e\b0\u00011\u00011\u00031\u0392\b1\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u03a6\b6\u00036\u03a8\b6\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00037\u03b0\b7\u00037\u03b2\b7\u00018\u00018\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u00039\u03bd\b9\u0001:\u0003"+
		":\u03c0\b:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u03c8\b:\u0001"+
		":\u0001:\u0003:\u03cc\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u03d3"+
		"\b;\n;\f;\u03d6\t;\u0001;\u0003;\u03d9\b;\u0001;\u0001;\u0001;\u0003;"+
		"\u03de\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0005"+
		";\u03e8\b;\n;\f;\u03eb\t;\u0001;\u0003;\u03ee\b;\u0001;\u0001;\u0001;"+
		"\u0001;\u0001;\u0003;\u03f5\b;\u0001;\u0001;\u0001;\u0001;\u0005;\u03fb"+
		"\b;\n;\f;\u03fe\t;\u0001;\u0001;\u0003;\u0402\b;\u0001;\u0001;\u0003;"+
		"\u0406\b;\u0001<\u0001<\u0001<\u0003<\u040b\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0004=\u0416\b=\u000b=\f=\u0417\u0001"+
		"=\u0003=\u041b\b=\u0001=\u0003=\u041e\b=\u0001=\u0001=\u0001=\u0001=\u0004"+
		"=\u0424\b=\u000b=\f=\u0425\u0001=\u0003=\u0429\b=\u0001=\u0003=\u042c"+
		"\b=\u0003=\u042e\b=\u0001>\u0001>\u0001>\u0001>\u0003>\u0434\b>\u0001"+
		">\u0003>\u0437\b>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u0441\b?\u0001?\u0003?\u0444\b?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0004A\u0453"+
		"\bA\u000bA\fA\u0454\u0001A\u0001A\u0001B\u0001B\u0001B\u0003B\u045c\b"+
		"B\u0001B\u0003B\u045f\bB\u0001C\u0001C\u0001C\u0003C\u0464\bC\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001E\u0001E\u0003E\u046e\bE\u0001F\u0001"+
		"F\u0003F\u0472\bF\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0005"+
		"H\u047b\bH\nH\fH\u047e\tH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0003I\u0488\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003"+
		"J\u0490\bJ\u0001K\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u0498\bK\u0001"+
		"L\u0001L\u0001L\u0001L\u0001M\u0003M\u049f\bM\u0001M\u0001M\u0001N\u0003"+
		"N\u04a4\bN\u0001N\u0001N\u0001O\u0001O\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"R\u0001R\u0001S\u0001S\u0001T\u0001T\u0001U\u0001U\u0001U\u0004U\u04b7"+
		"\bU\u000bU\fU\u04b8\u0001V\u0001V\u0001V\u0005V\u04be\bV\nV\fV\u04c1\t"+
		"V\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0003X\u04c9\bX\u0001X\u0001"+
		"X\u0001X\u0003X\u04ce\bX\u0001X\u0003X\u04d1\bX\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u04d6\bY\u0001Z\u0001Z\u0001Z\u0005Z\u04db\bZ\nZ\fZ\u04de\tZ\u0001Z"+
		"\u0003Z\u04e1\bZ\u0001[\u0001[\u0003[\u04e5\b[\u0001\\\u0001\\\u0001\\"+
		"\u0001]\u0001]\u0001]\u0001]\u0001]\u0003]\u04ef\b]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0003]\u04f7\b]\u0001]\u0003]\u04fa\b]\u0001]\u0001"+
		"]\u0003]\u04fe\b]\u0001^\u0001^\u0001^\u0005^\u0503\b^\n^\f^\u0506\t^"+
		"\u0001_\u0001_\u0003_\u050a\b_\u0001_\u0001_\u0001_\u0001`\u0001`\u0001"+
		"`\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u0517\ba\u0001a\u0003a\u051a"+
		"\ba\u0001a\u0003a\u051d\ba\u0003a\u051f\ba\u0001a\u0001a\u0001b\u0001"+
		"b\u0001b\u0005b\u0526\bb\nb\fb\u0529\tb\u0001c\u0001c\u0001c\u0005c\u052e"+
		"\bc\nc\fc\u0531\tc\u0001d\u0001d\u0001d\u0001d\u0001e\u0001e\u0001e\u0003"+
		"e\u053a\be\u0001e\u0001e\u0001e\u0001f\u0001f\u0001f\u0001f\u0001g\u0001"+
		"g\u0001g\u0005g\u0546\bg\ng\fg\u0549\tg\u0001g\u0003g\u054c\bg\u0001h"+
		"\u0001h\u0003h\u0550\bh\u0001h\u0003h\u0553\bh\u0001h\u0001h\u0001h\u0003"+
		"h\u0558\bh\u0001h\u0001h\u0001h\u0003h\u055d\bh\u0003h\u055f\bh\u0001"+
		"i\u0001i\u0001i\u0001j\u0001j\u0001j\u0001k\u0001k\u0001k\u0001l\u0001"+
		"l\u0001l\u0005l\u056d\bl\nl\fl\u0570\tl\u0001l\u0003l\u0573\bl\u0001m"+
		"\u0001m\u0001m\u0001m\u0001m\u0001m\u0003m\u057b\bm\u0001m\u0003m\u057e"+
		"\bm\u0001n\u0001n\u0001n\u0001n\u0003n\u0584\bn\u0003n\u0586\bn\u0001"+
		"o\u0001o\u0001o\u0005o\u058b\bo\no\fo\u058e\to\u0001o\u0003o\u0591\bo"+
		"\u0001p\u0001p\u0001p\u0003p\u0596\bp\u0001q\u0001q\u0001q\u0005q\u059b"+
		"\bq\nq\fq\u059e\tq\u0001q\u0003q\u05a1\bq\u0001r\u0001r\u0001r\u0003r"+
		"\u05a6\br\u0001s\u0001s\u0001s\u0001s\u0001t\u0001t\u0003t\u05ae\bt\u0001"+
		"u\u0001u\u0001u\u0005u\u05b3\bu\nu\fu\u05b6\tu\u0001v\u0001v\u0001v\u0005"+
		"v\u05bb\bv\nv\fv\u05be\tv\u0001w\u0001w\u0001w\u0003w\u05c3\bw\u0001x"+
		"\u0001x\u0005x\u05c7\bx\nx\fx\u05ca\tx\u0001y\u0001y\u0001y\u0001y\u0001"+
		"y\u0001y\u0001y\u0001y\u0001y\u0001y\u0003y\u05d6\by\u0001z\u0001z\u0001"+
		"z\u0001{\u0001{\u0001{\u0001|\u0001|\u0001|\u0001}\u0001}\u0001}\u0001"+
		"~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001"+
		"\u0080\u0001\u0080\u0001\u0080\u0001\u0081\u0001\u0081\u0001\u0081\u0001"+
		"\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001"+
		"\u0084\u0005\u0084\u05fe\b\u0084\n\u0084\f\u0084\u0601\t\u0084\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0005\u0085"+
		"\u0609\b\u0085\n\u0085\f\u0085\u060c\t\u0085\u0001\u0086\u0001\u0086\u0001"+
		"\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0005\u0086\u0614\b\u0086\n"+
		"\u0086\f\u0086\u0617\t\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001"+
		"\u0087\u0001\u0087\u0001\u0087\u0005\u0087\u061f\b\u0087\n\u0087\f\u0087"+
		"\u0622\t\u0087\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088\u0001\u0088"+
		"\u0001\u0088\u0005\u0088\u062a\b\u0088\n\u0088\f\u0088\u062d\t\u0088\u0001"+
		"\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0005"+
		"\u0089\u0635\b\u0089\n\u0089\f\u0089\u0638\t\u0089\u0001\u008a\u0001\u008a"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0003\u008a"+
		"\u0641\b\u008a\u0001\u008b\u0001\u008b\u0001\u008b\u0003\u008b\u0646\b"+
		"\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0003\u008c\u064b\b\u008c\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u0656\b\u008d\u0001\u008d\u0001"+
		"\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0003\u008d\u065d\b\u008d\u0005"+
		"\u008d\u065f\b\u008d\n\u008d\f\u008d\u0662\t\u008d\u0001\u008e\u0001\u008e"+
		"\u0001\u008e\u0003\u008e\u0667\b\u008e\u0001\u008e\u0001\u008e\u0001\u008e"+
		"\u0003\u008e\u066c\b\u008e\u0005\u008e\u066e\b\u008e\n\u008e\f\u008e\u0671"+
		"\t\u008e\u0001\u008e\u0003\u008e\u0674\b\u008e\u0003\u008e\u0676\b\u008e"+
		"\u0001\u008f\u0003\u008f\u0679\b\u008f\u0001\u008f\u0001\u008f\u0003\u008f"+
		"\u067d\b\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0681\b\u008f\u0003"+
		"\u008f\u0683\b\u008f\u0001\u008f\u0003\u008f\u0686\b\u008f\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0001\u0090\u0001\u0090\u0003\u0090\u0691\b\u0090\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u0695\b\u0090\u0001\u0090\u0001\u0090\u0001\u0090\u0001\u0090"+
		"\u0003\u0090\u069b\b\u0090\u0001\u0090\u0003\u0090\u069e\b\u0090\u0001"+
		"\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u06a3\b\u0091\u0001\u0091\u0001"+
		"\u0091\u0001\u0092\u0001\u0092\u0003\u0092\u06a9\b\u0092\u0001\u0092\u0001"+
		"\u0092\u0001\u0092\u0001\u0093\u0001\u0093\u0001\u0094\u0001\u0094\u0005"+
		"\u0094\u06b2\b\u0094\n\u0094\f\u0094\u06b5\t\u0094\u0001\u0094\u0005\u0094"+
		"\u06b8\b\u0094\n\u0094\f\u0094\u06bb\t\u0094\u0001\u0094\u0003\u0094\u06be"+
		"\b\u0094\u0001\u0094\u0001\u0094\u0005\u0094\u06c2\b\u0094\n\u0094\f\u0094"+
		"\u06c5\t\u0094\u0001\u0094\u0003\u0094\u06c8\b\u0094\u0001\u0094\u0004"+
		"\u0094\u06cb\b\u0094\u000b\u0094\f\u0094\u06cc\u0001\u0094\u0005\u0094"+
		"\u06d0\b\u0094\n\u0094\f\u0094\u06d3\t\u0094\u0001\u0094\u0003\u0094\u06d6"+
		"\b\u0094\u0001\u0094\u0004\u0094\u06d9\b\u0094\u000b\u0094\f\u0094\u06da"+
		"\u0001\u0094\u0003\u0094\u06de\b\u0094\u0001\u0094\u0003\u0094\u06e1\b"+
		"\u0094\u0001\u0095\u0004\u0095\u06e4\b\u0095\u000b\u0095\f\u0095\u06e5"+
		"\u0001\u0095\u0001\u0095\u0003\u0095\u06ea\b\u0095\u0001\u0096\u0005\u0096"+
		"\u06ed\b\u0096\n\u0096\f\u0096\u06f0\t\u0096\u0001\u0096\u0004\u0096\u06f3"+
		"\b\u0096\u000b\u0096\f\u0096\u06f4\u0001\u0096\u0001\u0096\u0003\u0096"+
		"\u06f9\b\u0096\u0001\u0097\u0001\u0097\u0001\u0097\u0005\u0097\u06fe\b"+
		"\u0097\n\u0097\f\u0097\u0701\t\u0097\u0001\u0097\u0003\u0097\u0704\b\u0097"+
		"\u0001\u0097\u0001\u0097\u0001\u0097\u0004\u0097\u0709\b\u0097\u000b\u0097"+
		"\f\u0097\u070a\u0001\u0097\u0003\u0097\u070e\b\u0097\u0001\u0097\u0003"+
		"\u0097\u0711\b\u0097\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0099\u0001"+
		"\u0099\u0003\u0099\u0718\b\u0099\u0001\u009a\u0001\u009a\u0001\u009a\u0003"+
		"\u009a\u071d\b\u009a\u0001\u009b\u0001\u009b\u0003\u009b\u0721\b\u009b"+
		"\u0001\u009b\u0003\u009b\u0724\b\u009b\u0001\u009c\u0001\u009c\u0001\u009d"+
		"\u0001\u009d\u0003\u009d\u072a\b\u009d\u0001\u009e\u0001\u009e\u0001\u009e"+
		"\u0003\u009e\u072f\b\u009e\u0001\u009e\u0003\u009e\u0732\b\u009e\u0001"+
		"\u009e\u0003\u009e\u0735\b\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001"+
		"\u009f\u0001\u009f\u0001\u00a0\u0001\u00a0\u0005\u00a0\u073e\b\u00a0\n"+
		"\u00a0\f\u00a0\u0741\t\u00a0\u0001\u00a1\u0001\u00a1\u0003\u00a1\u0745"+
		"\b\u00a1\u0001\u00a2\u0001\u00a2\u0005\u00a2\u0749\b\u00a2\n\u00a2\f\u00a2"+
		"\u074c\t\u00a2\u0001\u00a2\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0003\u00a3"+
		"\u0752\b\u00a3\u0001\u00a4\u0001\u00a4\u0005\u00a4\u0756\b\u00a4\n\u00a4"+
		"\f\u00a4\u0759\t\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a5\u0003\u00a5"+
		"\u075e\b\u00a5\u0001\u00a5\u0003\u00a5\u0761\b\u00a5\u0001\u00a5\u0003"+
		"\u00a5\u0764\b\u00a5\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0003"+
		"\u00a6\u076a\b\u00a6\u0001\u00a7\u0001\u00a7\u0005\u00a7\u076e\b\u00a7"+
		"\n\u00a7\f\u00a7\u0771\t\u00a7\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001"+
		"\u00a8\u0001\u00a9\u0001\u00a9\u0004\u00a9\u0779\b\u00a9\u000b\u00a9\f"+
		"\u00a9\u077a\u0001\u00a9\u0004\u00a9\u077e\b\u00a9\u000b\u00a9\f\u00a9"+
		"\u077f\u0003\u00a9\u0782\b\u00a9\u0001\u00aa\u0001\u00aa\u0003\u00aa\u0786"+
		"\b\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001"+
		"\u00ab\u0003\u00ab\u078e\b\u00ab\u0003\u00ab\u0790\b\u00ab\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ac\u0001\u00ad"+
		"\u0001\u00ad\u0003\u00ad\u079a\b\u00ad\u0001\u00ad\u0001\u00ad\u0001\u00ae"+
		"\u0001\u00ae\u0001\u00ae\u0005\u00ae\u07a1\b\u00ae\n\u00ae\f\u00ae\u07a4"+
		"\t\u00ae\u0001\u00ae\u0003\u00ae\u07a7\b\u00ae\u0001\u00af\u0001\u00af"+
		"\u0001\u00af\u0003\u00af\u07ac\b\u00af\u0001\u00b0\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b1\u0004\u00b1\u07b3\b\u00b1\u000b\u00b1\f\u00b1"+
		"\u07b4\u0001\u00b2\u0003\u00b2\u07b8\b\u00b2\u0001\u00b2\u0001\u00b2\u0001"+
		"\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0005\u00b2\u07c0\b\u00b2\n"+
		"\u00b2\f\u00b2\u07c3\t\u00b2\u0001\u00b3\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b3\u0001\u00b3\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001\u00b4\u0001"+
		"\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b5\u0003\u00b5\u07d2\b\u00b5\u0001"+
		"\u00b5\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b6\u0001\u00b6\u0001\u00b7\u0001\u00b7\u0003\u00b7\u07de\b\u00b7\u0001"+
		"\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u07e3\b\u00b8\u0003\u00b8\u07e5"+
		"\b\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u07eb"+
		"\b\u00b8\u0003\u00b8\u07ed\b\u00b8\u0005\u00b8\u07ef\b\u00b8\n\u00b8\f"+
		"\u00b8\u07f2\t\u00b8\u0001\u00b8\u0001\u00b8\u0003\u00b8\u07f6\b\u00b8"+
		"\u0001\u00b8\u0003\u00b8\u07f9\b\u00b8\u0001\u00b9\u0001\u00b9\u0001\u00b9"+
		"\u0005\u00b9\u07fe\b\u00b9\n\u00b9\f\u00b9\u0801\t\u00b9\u0001\u00b9\u0001"+
		"\u00b9\u0001\u00b9\u0001\u00b9\u0005\u00b9\u0807\b\u00b9\n\u00b9\f\u00b9"+
		"\u080a\t\u00b9\u0003\u00b9\u080c\b\u00b9\u0001\u00b9\u0001\u00b9\u0001"+
		"\u00b9\u0005\u00b9\u0811\b\u00b9\n\u00b9\f\u00b9\u0814\t\u00b9\u0003\u00b9"+
		"\u0816\b\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb"+
		"\u0001\u00bb\u0001\u00bb\u0001\u00bb\u0003\u00bb\u0820\b\u00bb\u0001\u00bc"+
		"\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0001\u00bc\u0003\u00bc"+
		"\u0828\b\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00bd\u0005\u00bd\u082d\b"+
		"\u00bd\n\u00bd\f\u00bd\u0830\t\u00bd\u0001\u00bd\u0003\u00bd\u0833\b\u00bd"+
		"\u0001\u00be\u0001\u00be\u0001\u00be\u0005\u00be\u0838\b\u00be\n\u00be"+
		"\f\u00be\u083b\t\u00be\u0001\u00be\u0003\u00be\u083e\b\u00be\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0004\u00bf\u0844\b\u00bf\u000b\u00bf"+
		"\f\u00bf\u0845\u0001\u00bf\u0003\u00bf\u0849\b\u00bf\u0003\u00bf\u084b"+
		"\b\u00bf\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0003\u00c0\u0850\b\u00c0"+
		"\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0001\u00c1"+
		"\u0001\u00c1\u0003\u00c1\u0859\b\u00c1\u0001\u00c1\u0003\u00c1\u085c\b"+
		"\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0001\u00c2\u0003\u00c2\u0865\b\u00c2\u0001\u00c2\u0001\u00c2\u0001"+
		"\u00c2\u0003\u00c2\u086a\b\u00c2\u0001\u00c2\u0003\u00c2\u086d\b\u00c2"+
		"\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3\u0001\u00c3"+
		"\u0003\u00c3\u0875\b\u00c3\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0001\u00c4"+
		"\u0001\u00c4\u0001\u00c4\u0001\u00c4\u0003\u00c4\u087e\b\u00c4\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5\u0001\u00c5"+
		"\u0003\u00c5\u088d\b\u00c5\u0001\u00c5\u0003\u00c5\u0890\b\u00c5\u0005"+
		"\u00c5\u0892\b\u00c5\n\u00c5\f\u00c5\u0895\t\u00c5\u0001\u00c6\u0001\u00c6"+
		"\u0001\u00c6\u0005\u00c6\u089a\b\u00c6\n\u00c6\f\u00c6\u089d\t\u00c6\u0001"+
		"\u00c6\u0003\u00c6\u08a0\b\u00c6\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0001"+
		"\u00c7\u0001\u00c7\u0001\u00c7\u0001\u00c7\u0003\u00c7\u08a9\b\u00c7\u0001"+
		"\u00c7\u0003\u00c7\u08ac\b\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u08b5\b\u00c8\u0001"+
		"\u00c8\u0001\u00c8\u0001\u00c8\u0003\u00c8\u08ba\b\u00c8\u0001\u00c8\u0003"+
		"\u00c8\u08bd\b\u00c8\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0005\u00c9\u08c2"+
		"\b\u00c9\n\u00c9\f\u00c9\u08c5\t\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9"+
		"\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u08cd\b\u00c9\u0001\u00c9"+
		"\u0001\u00c9\u0003\u00c9\u08d1\b\u00c9\u0003\u00c9\u08d3\b\u00c9\u0001"+
		"\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u08da"+
		"\b\u00c9\u0001\u00c9\u0001\u00c9\u0003\u00c9\u08de\b\u00c9\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00ca\u0003\u00ca\u08e3\b\u00ca\u0001\u00cb\u0001\u00cb"+
		"\u0001\u00cb\u0001\u00cb\u0003\u00cb\u08e9\b\u00cb\u0001\u00cc\u0001\u00cc"+
		"\u0003\u00cc\u08ed\b\u00cc\u0001\u00cc\u0000\t@\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u011a\u018a\u00cd\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u0000\u0004\u0002\u0000\u0012\u001299\u0001\u0000\u0016\u0017\u0001"+
		"\u0000&\'\u0004\u0000\u0018\u0019\u001f\u001f4466\u09b0\u0000\u019b\u0001"+
		"\u0000\u0000\u0000\u0002\u019f\u0001\u0000\u0000\u0000\u0004\u01a1\u0001"+
		"\u0000\u0000\u0000\u0006\u01aa\u0001\u0000\u0000\u0000\b\u01ba\u0001\u0000"+
		"\u0000\u0000\n\u01c0\u0001\u0000\u0000\u0000\f\u01c2\u0001\u0000\u0000"+
		"\u0000\u000e\u01ca\u0001\u0000\u0000\u0000\u0010\u01cc\u0001\u0000\u0000"+
		"\u0000\u0012\u01e7\u0001\u0000\u0000\u0000\u0014\u01f1\u0001\u0000\u0000"+
		"\u0000\u0016\u0216\u0001\u0000\u0000\u0000\u0018\u021a\u0001\u0000\u0000"+
		"\u0000\u001a\u0229\u0001\u0000\u0000\u0000\u001c\u022b\u0001\u0000\u0000"+
		"\u0000\u001e\u022f\u0001\u0000\u0000\u0000 \u0237\u0001\u0000\u0000\u0000"+
		"\"\u0239\u0001\u0000\u0000\u0000$\u023b\u0001\u0000\u0000\u0000&\u023d"+
		"\u0001\u0000\u0000\u0000(\u0246\u0001\u0000\u0000\u0000*\u024f\u0001\u0000"+
		"\u0000\u0000,\u0252\u0001\u0000\u0000\u0000.\u0254\u0001\u0000\u0000\u0000"+
		"0\u025c\u0001\u0000\u0000\u00002\u025e\u0001\u0000\u0000\u00004\u0274"+
		"\u0001\u0000\u0000\u00006\u027f\u0001\u0000\u0000\u00008\u0281\u0001\u0000"+
		"\u0000\u0000:\u0289\u0001\u0000\u0000\u0000<\u028e\u0001\u0000\u0000\u0000"+
		">\u0296\u0001\u0000\u0000\u0000@\u029b\u0001\u0000\u0000\u0000B\u02ac"+
		"\u0001\u0000\u0000\u0000D\u02b2\u0001\u0000\u0000\u0000F\u02ba\u0001\u0000"+
		"\u0000\u0000H\u02bc\u0001\u0000\u0000\u0000J\u02cf\u0001\u0000\u0000\u0000"+
		"L\u02fa\u0001\u0000\u0000\u0000N\u02fc\u0001\u0000\u0000\u0000P\u032f"+
		"\u0001\u0000\u0000\u0000R\u0332\u0001\u0000\u0000\u0000T\u033d\u0001\u0000"+
		"\u0000\u0000V\u036a\u0001\u0000\u0000\u0000X\u036c\u0001\u0000\u0000\u0000"+
		"Z\u036f\u0001\u0000\u0000\u0000\\\u0376\u0001\u0000\u0000\u0000^\u037d"+
		"\u0001\u0000\u0000\u0000`\u0385\u0001\u0000\u0000\u0000b\u038f\u0001\u0000"+
		"\u0000\u0000d\u0393\u0001\u0000\u0000\u0000f\u0396\u0001\u0000\u0000\u0000"+
		"h\u0399\u0001\u0000\u0000\u0000j\u039c\u0001\u0000\u0000\u0000l\u039f"+
		"\u0001\u0000\u0000\u0000n\u03a9\u0001\u0000\u0000\u0000p\u03b3\u0001\u0000"+
		"\u0000\u0000r\u03b7\u0001\u0000\u0000\u0000t\u03bf\u0001\u0000\u0000\u0000"+
		"v\u0405\u0001\u0000\u0000\u0000x\u0407\u0001\u0000\u0000\u0000z\u042d"+
		"\u0001\u0000\u0000\u0000|\u042f\u0001\u0000\u0000\u0000~\u043b\u0001\u0000"+
		"\u0000\u0000\u0080\u0448\u0001\u0000\u0000\u0000\u0082\u044c\u0001\u0000"+
		"\u0000\u0000\u0084\u045e\u0001\u0000\u0000\u0000\u0086\u0460\u0001\u0000"+
		"\u0000\u0000\u0088\u0468\u0001\u0000\u0000\u0000\u008a\u046d\u0001\u0000"+
		"\u0000\u0000\u008c\u0471\u0001\u0000\u0000\u0000\u008e\u0473\u0001\u0000"+
		"\u0000\u0000\u0090\u0477\u0001\u0000\u0000\u0000\u0092\u0487\u0001\u0000"+
		"\u0000\u0000\u0094\u048f\u0001\u0000\u0000\u0000\u0096\u0497\u0001\u0000"+
		"\u0000\u0000\u0098\u0499\u0001\u0000\u0000\u0000\u009a\u049e\u0001\u0000"+
		"\u0000\u0000\u009c\u04a3\u0001\u0000\u0000\u0000\u009e\u04a7\u0001\u0000"+
		"\u0000\u0000\u00a0\u04a9\u0001\u0000\u0000\u0000\u00a2\u04ab\u0001\u0000"+
		"\u0000\u0000\u00a4\u04ad\u0001\u0000\u0000\u0000\u00a6\u04af\u0001\u0000"+
		"\u0000\u0000\u00a8\u04b1\u0001\u0000\u0000\u0000\u00aa\u04b3\u0001\u0000"+
		"\u0000\u0000\u00ac\u04ba\u0001\u0000\u0000\u0000\u00ae\u04c2\u0001\u0000"+
		"\u0000\u0000\u00b0\u04d0\u0001\u0000\u0000\u0000\u00b2\u04d2\u0001\u0000"+
		"\u0000\u0000\u00b4\u04d7\u0001\u0000\u0000\u0000\u00b6\u04e4\u0001\u0000"+
		"\u0000\u0000\u00b8\u04e6\u0001\u0000\u0000\u0000\u00ba\u04fd\u0001\u0000"+
		"\u0000\u0000\u00bc\u04ff\u0001\u0000\u0000\u0000\u00be\u0509\u0001\u0000"+
		"\u0000\u0000\u00c0\u050e\u0001\u0000\u0000\u0000\u00c2\u0511\u0001\u0000"+
		"\u0000\u0000\u00c4\u0522\u0001\u0000\u0000\u0000\u00c6\u052a\u0001\u0000"+
		"\u0000\u0000\u00c8\u0532\u0001\u0000\u0000\u0000\u00ca\u0536\u0001\u0000"+
		"\u0000\u0000\u00cc\u053e\u0001\u0000\u0000\u0000\u00ce\u0542\u0001\u0000"+
		"\u0000\u0000\u00d0\u055e\u0001\u0000\u0000\u0000\u00d2\u0560\u0001\u0000"+
		"\u0000\u0000\u00d4\u0563\u0001\u0000\u0000\u0000\u00d6\u0566\u0001\u0000"+
		"\u0000\u0000\u00d8\u0569\u0001\u0000\u0000\u0000\u00da\u057d\u0001\u0000"+
		"\u0000\u0000\u00dc\u057f\u0001\u0000\u0000\u0000\u00de\u0587\u0001\u0000"+
		"\u0000\u0000\u00e0\u0595\u0001\u0000\u0000\u0000\u00e2\u0597\u0001\u0000"+
		"\u0000\u0000\u00e4\u05a5\u0001\u0000\u0000\u0000\u00e6\u05a7\u0001\u0000"+
		"\u0000\u0000\u00e8\u05ad\u0001\u0000\u0000\u0000\u00ea\u05af\u0001\u0000"+
		"\u0000\u0000\u00ec\u05b7\u0001\u0000\u0000\u0000\u00ee\u05c2\u0001\u0000"+
		"\u0000\u0000\u00f0\u05c4\u0001\u0000\u0000\u0000\u00f2\u05d5\u0001\u0000"+
		"\u0000\u0000\u00f4\u05d7\u0001\u0000\u0000\u0000\u00f6\u05da\u0001\u0000"+
		"\u0000\u0000\u00f8\u05dd\u0001\u0000\u0000\u0000\u00fa\u05e0\u0001\u0000"+
		"\u0000\u0000\u00fc\u05e3\u0001\u0000\u0000\u0000\u00fe\u05e6\u0001\u0000"+
		"\u0000\u0000\u0100\u05e9\u0001\u0000\u0000\u0000\u0102\u05ed\u0001\u0000"+
		"\u0000\u0000\u0104\u05f0\u0001\u0000\u0000\u0000\u0106\u05f4\u0001\u0000"+
		"\u0000\u0000\u0108\u05f7\u0001\u0000\u0000\u0000\u010a\u0602\u0001\u0000"+
		"\u0000\u0000\u010c\u060d\u0001\u0000\u0000\u0000\u010e\u0618\u0001\u0000"+
		"\u0000\u0000\u0110\u0623\u0001\u0000\u0000\u0000\u0112\u062e\u0001\u0000"+
		"\u0000\u0000\u0114\u0640\u0001\u0000\u0000\u0000\u0116\u0642\u0001\u0000"+
		"\u0000\u0000\u0118\u064a\u0001\u0000\u0000\u0000\u011a\u064c\u0001\u0000"+
		"\u0000\u0000\u011c\u0675\u0001\u0000\u0000\u0000\u011e\u0685\u0001\u0000"+
		"\u0000\u0000\u0120\u069d\u0001\u0000\u0000\u0000\u0122\u069f\u0001\u0000"+
		"\u0000\u0000\u0124\u06a6\u0001\u0000\u0000\u0000\u0126\u06ad\u0001\u0000"+
		"\u0000\u0000\u0128\u06e0\u0001\u0000\u0000\u0000\u012a\u06e3\u0001\u0000"+
		"\u0000\u0000\u012c\u06ee\u0001\u0000\u0000\u0000\u012e\u0710\u0001\u0000"+
		"\u0000\u0000\u0130\u0712\u0001\u0000\u0000\u0000\u0132\u0715\u0001\u0000"+
		"\u0000\u0000\u0134\u0719\u0001\u0000\u0000\u0000\u0136\u071e\u0001\u0000"+
		"\u0000\u0000\u0138\u0725\u0001\u0000\u0000\u0000\u013a\u0729\u0001\u0000"+
		"\u0000\u0000\u013c\u072b\u0001\u0000\u0000\u0000\u013e\u0738\u0001\u0000"+
		"\u0000\u0000\u0140\u073b\u0001\u0000\u0000\u0000\u0142\u0744\u0001\u0000"+
		"\u0000\u0000\u0144\u0746\u0001\u0000\u0000\u0000\u0146\u0751\u0001\u0000"+
		"\u0000\u0000\u0148\u0753\u0001\u0000\u0000\u0000\u014a\u075a\u0001\u0000"+
		"\u0000\u0000\u014c\u0769\u0001\u0000\u0000\u0000\u014e\u076b\u0001\u0000"+
		"\u0000\u0000\u0150\u0774\u0001\u0000\u0000\u0000\u0152\u0781\u0001\u0000"+
		"\u0000\u0000\u0154\u0783\u0001\u0000\u0000\u0000\u0156\u0789\u0001\u0000"+
		"\u0000\u0000\u0158\u0793\u0001\u0000\u0000\u0000\u015a\u0797\u0001\u0000"+
		"\u0000\u0000\u015c\u079d\u0001\u0000\u0000\u0000\u015e\u07ab\u0001\u0000"+
		"\u0000\u0000\u0160\u07ad\u0001\u0000\u0000\u0000\u0162\u07b2\u0001\u0000"+
		"\u0000\u0000\u0164\u07b7\u0001\u0000\u0000\u0000\u0166\u07c4\u0001\u0000"+
		"\u0000\u0000\u0168\u07c9\u0001\u0000\u0000\u0000\u016a\u07ce\u0001\u0000"+
		"\u0000\u0000\u016c\u07d6\u0001\u0000\u0000\u0000\u016e\u07db\u0001\u0000"+
		"\u0000\u0000\u0170\u07f8\u0001\u0000\u0000\u0000\u0172\u0815\u0001\u0000"+
		"\u0000\u0000\u0174\u0817\u0001\u0000\u0000\u0000\u0176\u081f\u0001\u0000"+
		"\u0000\u0000\u0178\u0827\u0001\u0000\u0000\u0000\u017a\u0829\u0001\u0000"+
		"\u0000\u0000\u017c\u0834\u0001\u0000\u0000\u0000\u017e\u083f\u0001\u0000"+
		"\u0000\u0000\u0180\u084f\u0001\u0000\u0000\u0000\u0182\u085b\u0001\u0000"+
		"\u0000\u0000\u0184\u086c\u0001\u0000\u0000\u0000\u0186\u0874\u0001\u0000"+
		"\u0000\u0000\u0188\u0876\u0001\u0000\u0000\u0000\u018a\u087f\u0001\u0000"+
		"\u0000\u0000\u018c\u0896\u0001\u0000\u0000\u0000\u018e\u08ab\u0001\u0000"+
		"\u0000\u0000\u0190\u08bc\u0001\u0000\u0000\u0000\u0192\u08dd\u0001\u0000"+
		"\u0000\u0000\u0194\u08e2\u0001\u0000\u0000\u0000\u0196\u08e8\u0001\u0000"+
		"\u0000\u0000\u0198\u08ec\u0001\u0000\u0000\u0000\u019a\u019c\u0003\b\u0004"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0000\u0000"+
		"\u0001\u019e\u0001\u0001\u0000\u0000\u0000\u019f\u01a0\u0003\u000e\u0007"+
		"\u0000\u01a0\u0003\u0001\u0000\u0000\u0000\u01a1\u01a5\u0003\u00d8l\u0000"+
		"\u01a2\u01a4\u0005f\u0000\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u01a9\u0005\u0000\u0000\u0001\u01a9"+
		"\u0005\u0001\u0000\u0000\u0000\u01aa\u01ac\u0005\f\u0000\u0000\u01ab\u01ad"+
		"\u0003\u0192\u00c9\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005\u000f\u0000\u0000\u01af\u01b0\u00058\u0000\u0000\u01b0\u01b4\u0003"+
		"\u00dam\u0000\u01b1\u01b3\u0005f\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u0000\u0000"+
		"\u0001\u01b8\u0007\u0001\u0000\u0000\u0000\u01b9\u01bb\u0003\n\u0005\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000"+
		"\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\t\u0001\u0000\u0000\u0000\u01be\u01c1\u0003\u0014\n\u0000\u01bf"+
		"\u01c1\u0003\u0010\b\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u000b\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0003\u0014\n\u0000\u01c3\r\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003"+
		"\f\u0006\u0000\u01c5\u01c6\u0005f\u0000\u0000\u01c6\u01cb\u0001\u0000"+
		"\u0000\u0000\u01c7\u01cb\u0003\u0010\b\u0000\u01c8\u01cb\u0005f\u0000"+
		"\u0000\u01c9\u01cb\u0005\u0000\u0000\u0001\u01ca\u01c4\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cb\u000f\u0001\u0000\u0000"+
		"\u0000\u01cc\u01d1\u0003\u0012\t\u0000\u01cd\u01ce\u0005\u0015\u0000\u0000"+
		"\u01ce\u01d0\u0003\u0012\t\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d1"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d5\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d6\u0005\u0015\u0000\u0000\u01d5"+
		"\u01d4\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005f\u0000\u0000\u01d8\u0011"+
		"\u0001\u0000\u0000\u0000\u01d9\u01e8\u0003\u0016\u000b\u0000\u01da\u01e8"+
		"\u0003\u00cae\u0000\u01db\u01e8\u0003\u00deo\u0000\u01dc\u01e8\u0003\u001c"+
		"\u000e\u0000\u01dd\u01e8\u00030\u0018\u0000\u01de\u01e8\u0003\u001e\u000f"+
		"\u0000\u01df\u01e8\u0003 \u0010\u0000\u01e0\u01e8\u0003*\u0015\u0000\u01e1"+
		"\u01e8\u0003,\u0016\u0000\u01e2\u01e8\u0003.\u0017\u0000\u01e3\u01e8\u0003"+
		"\"\u0011\u0000\u01e4\u01e8\u0003$\u0012\u0000\u01e5\u01e8\u0003&\u0013"+
		"\u0000\u01e6\u01e8\u0003(\u0014\u0000\u01e7\u01d9\u0001\u0000\u0000\u0000"+
		"\u01e7\u01da\u0001\u0000\u0000\u0000\u01e7\u01db\u0001\u0000\u0000\u0000"+
		"\u01e7\u01dc\u0001\u0000\u0000\u0000\u01e7\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e7\u01de\u0001\u0000\u0000\u0000\u01e7\u01df\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e0\u0001\u0000\u0000\u0000\u01e7\u01e1\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e7\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8\u0013\u0001\u0000\u0000\u0000"+
		"\u01e9\u01f2\u0003J%\u0000\u01ea\u01f2\u0003l6\u0000\u01eb\u01f2\u0003"+
		"F#\u0000\u01ec\u01f2\u0003v;\u0000\u01ed\u01f2\u0003t:\u0000\u01ee\u01f2"+
		"\u0003z=\u0000\u01ef\u01f2\u0003r9\u0000\u01f0\u01f2\u0003\u0082A\u0000"+
		"\u01f1\u01e9\u0001\u0000\u0000\u0000\u01f1\u01ea\u0001\u0000\u0000\u0000"+
		"\u01f1\u01eb\u0001\u0000\u0000\u0000\u01f1\u01ec\u0001\u0000\u0000\u0000"+
		"\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000"+
		"\u01f2\u0015\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003\u0198\u00cc\u0000"+
		"\u01f4\u01f5\u0005\u0013\u0000\u0000\u01f5\u01f8\u0003\u00dam\u0000\u01f6"+
		"\u01f7\u0005\u001e\u0000\u0000\u01f7\u01f9\u0003\u0018\f\u0000\u01f8\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u0217"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fb\u0005\f\u0000\u0000\u01fb\u01fc\u0003"+
		"\u0186\u00c3\u0000\u01fc\u01fd\u0005\u000f\u0000\u0000\u01fd\u0200\u0001"+
		"\u0000\u0000\u0000\u01fe\u0200\u0003\u0188\u00c4\u0000\u01ff\u01fa\u0001"+
		"\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001"+
		"\u0000\u0000\u0000\u0201\u0202\u0005\u0013\u0000\u0000\u0202\u0205\u0003"+
		"\u00dam\u0000\u0203\u0204\u0005\u001e\u0000\u0000\u0204\u0206\u0003\u0018"+
		"\f\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0217\u0001\u0000\u0000\u0000\u0207\u0208\u0003\u017a\u00bd"+
		"\u0000\u0208\u0209\u0005\u001e\u0000\u0000\u0209\u020b\u0001\u0000\u0000"+
		"\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000\u0000"+
		"\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u0210\u0003\u0018\f\u0000"+
		"\u020f\u0211\u0005\u0004\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0217\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0003\u0186\u00c3\u0000\u0213\u0214\u0003\u001a\r\u0000\u0214"+
		"\u0215\u0003\u0018\f\u0000\u0215\u0217\u0001\u0000\u0000\u0000\u0216\u01f3"+
		"\u0001\u0000\u0000\u0000\u0216\u01ff\u0001\u0000\u0000\u0000\u0216\u020a"+
		"\u0001\u0000\u0000\u0000\u0216\u0212\u0001\u0000\u0000\u0000\u0217\u0017"+
		"\u0001\u0000\u0000\u0000\u0218\u021b\u0003\u00dcn\u0000\u0219\u021b\u0003"+
		"\u00deo\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u0219\u0001\u0000"+
		"\u0000\u0000\u021b\u0019\u0001\u0000\u0000\u0000\u021c\u022a\u0005)\u0000"+
		"\u0000\u021d\u022a\u0005*\u0000\u0000\u021e\u022a\u0005+\u0000\u0000\u021f"+
		"\u022a\u00057\u0000\u0000\u0220\u022a\u0005,\u0000\u0000\u0221\u022a\u0005"+
		"-\u0000\u0000\u0222\u022a\u0005.\u0000\u0000\u0223\u022a\u0005/\u0000"+
		"\u0000\u0224\u022a\u00050\u0000\u0000\u0225\u022a\u00051\u0000\u0000\u0226"+
		"\u022a\u00052\u0000\u0000\u0227\u022a\u00053\u0000\u0000\u0228\u022a\u0005"+
		"5\u0000\u0000\u0229\u021c\u0001\u0000\u0000\u0000\u0229\u021d\u0001\u0000"+
		"\u0000\u0000\u0229\u021e\u0001\u0000\u0000\u0000\u0229\u021f\u0001\u0000"+
		"\u0000\u0000\u0229\u0220\u0001\u0000\u0000\u0000\u0229\u0221\u0001\u0000"+
		"\u0000\u0000\u0229\u0222\u0001\u0000\u0000\u0000\u0229\u0223\u0001\u0000"+
		"\u0000\u0000\u0229\u0224\u0001\u0000\u0000\u0000\u0229\u0225\u0001\u0000"+
		"\u0000\u0000\u0229\u0226\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000"+
		"\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u001b\u0001\u0000"+
		"\u0000\u0000\u022b\u022d\u0005J\u0000\u0000\u022c\u022e\u0003\u00deo\u0000"+
		"\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u001d\u0001\u0000\u0000\u0000\u022f\u0235\u0005E\u0000\u0000\u0230"+
		"\u0233\u0003\u00dam\u0000\u0231\u0232\u0005R\u0000\u0000\u0232\u0234\u0003"+
		"\u00dam\u0000\u0233\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000"+
		"\u0000\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u0230\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u001f\u0001\u0000"+
		"\u0000\u0000\u0237\u0238\u0005@\u0000\u0000\u0238!\u0001\u0000\u0000\u0000"+
		"\u0239\u023a\u0005B\u0000\u0000\u023a#\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0005L\u0000\u0000\u023c%\u0001\u0000\u0000\u0000\u023d\u023e\u0005W"+
		"\u0000\u0000\u023e\u0243\u0003\u0198\u00cc\u0000\u023f\u0240\u0005\u0014"+
		"\u0000\u0000\u0240\u0242\u0003\u0198\u00cc\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0242\u0245\u0001\u0000\u0000\u0000\u0243\u0241\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\'\u0001\u0000\u0000"+
		"\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0246\u0247\u0005S\u0000\u0000"+
		"\u0247\u024c\u0003\u0198\u00cc\u0000\u0248\u0249\u0005\u0014\u0000\u0000"+
		"\u0249\u024b\u0003\u0198\u00cc\u0000\u024a\u0248\u0001\u0000\u0000\u0000"+
		"\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000\u0000"+
		"\u024c\u024d\u0001\u0000\u0000\u0000\u024d)\u0001\u0000\u0000\u0000\u024e"+
		"\u024c\u0001\u0000\u0000\u0000\u024f\u0250\u0005V\u0000\u0000\u0250\u0251"+
		"\u0003\u018c\u00c6\u0000\u0251+\u0001\u0000\u0000\u0000\u0252\u0253\u0003"+
		"\u00dcn\u0000\u0253-\u0001\u0000\u0000\u0000\u0254\u0255\u0005U\u0000"+
		"\u0000\u0255\u0258\u0003\u00dam\u0000\u0256\u0257\u0005\u0014\u0000\u0000"+
		"\u0257\u0259\u0003\u00dam\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258"+
		"\u0259\u0001\u0000\u0000\u0000\u0259/\u0001\u0000\u0000\u0000\u025a\u025d"+
		"\u00032\u0019\u0000\u025b\u025d\u00034\u001a\u0000\u025c\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025d1\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0005?\u0000\u0000\u025f\u0260\u0003<\u001e\u0000\u0260"+
		"3\u0001\u0000\u0000\u0000\u0261\u0265\u0005R\u0000\u0000\u0262\u0264\u0007"+
		"\u0000\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264\u0267\u0001"+
		"\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0266\u0001"+
		"\u0000\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0003@ \u0000\u0269\u026a\u0005?\u0000"+
		"\u0000\u026a\u026b\u00036\u001b\u0000\u026b\u0275\u0001\u0000\u0000\u0000"+
		"\u026c\u026e\u0005R\u0000\u0000\u026d\u026f\u0007\u0000\u0000\u0000\u026e"+
		"\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270"+
		"\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271"+
		"\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0005?\u0000\u0000\u0273\u0275"+
		"\u00036\u001b\u0000\u0274\u0261\u0001\u0000\u0000\u0000\u0274\u026c\u0001"+
		"\u0000\u0000\u0000\u02755\u0001\u0000\u0000\u0000\u0276\u0277\u0005\f"+
		"\u0000\u0000\u0277\u0279\u00038\u001c\u0000\u0278\u027a\u0005\u0014\u0000"+
		"\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0005\u000f\u0000"+
		"\u0000\u027c\u0280\u0001\u0000\u0000\u0000\u027d\u0280\u00038\u001c\u0000"+
		"\u027e\u0280\u0005\u0018\u0000\u0000\u027f\u0276\u0001\u0000\u0000\u0000"+
		"\u027f\u027d\u0001\u0000\u0000\u0000\u027f\u027e\u0001\u0000\u0000\u0000"+
		"\u02807\u0001\u0000\u0000\u0000\u0281\u0286\u0003:\u001d\u0000\u0282\u0283"+
		"\u0005\u0014\u0000\u0000\u0283\u0285\u0003:\u001d\u0000\u0284\u0282\u0001"+
		"\u0000\u0000\u0000\u0285\u0288\u0001\u0000\u0000\u0000\u0286\u0284\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u02879\u0001\u0000"+
		"\u0000\u0000\u0288\u0286\u0001\u0000\u0000\u0000\u0289\u028c\u0003\u0198"+
		"\u00cc\u0000\u028a\u028b\u0005P\u0000\u0000\u028b\u028d\u0003\u0198\u00cc"+
		"\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000"+
		"\u0000\u028d;\u0001\u0000\u0000\u0000\u028e\u0293\u0003>\u001f\u0000\u028f"+
		"\u0290\u0005\u0014\u0000\u0000\u0290\u0292\u0003>\u001f\u0000\u0291\u028f"+
		"\u0001\u0000\u0000\u0000\u0292\u0295\u0001\u0000\u0000\u0000\u0293\u0291"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294=\u0001"+
		"\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000\u0296\u0299\u0003"+
		"@ \u0000\u0297\u0298\u0005P\u0000\u0000\u0298\u029a\u0003\u0198\u00cc"+
		"\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000"+
		"\u0000\u029a?\u0001\u0000\u0000\u0000\u029b\u029c\u0006 \uffff\uffff\u0000"+
		"\u029c\u029d\u0003\u0198\u00cc\u0000\u029d\u02a3\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\n\u0002\u0000\u0000\u029f\u02a0\u0005\u0012\u0000\u0000\u02a0"+
		"\u02a2\u0003\u0198\u00cc\u0000\u02a1\u029e\u0001\u0000\u0000\u0000\u02a2"+
		"\u02a5\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a4A\u0001\u0000\u0000\u0000\u02a5\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a6\u02a7\u0005f\u0000\u0000\u02a7\u02a8\u0005"+
		"\u0002\u0000\u0000\u02a8\u02a9\u0003\b\u0004\u0000\u02a9\u02aa\u0005\u0003"+
		"\u0000\u0000\u02aa\u02ad\u0001\u0000\u0000\u0000\u02ab\u02ad\u0003\u0010"+
		"\b\u0000\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000\u0000"+
		"\u0000\u02adC\u0001\u0000\u0000\u0000\u02ae\u02af\u00056\u0000\u0000\u02af"+
		"\u02b0\u0003\u00e8t\u0000\u02b0\u02b1\u0005f\u0000\u0000\u02b1\u02b3\u0001"+
		"\u0000\u0000\u0000\u02b2\u02ae\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b5\u0001"+
		"\u0000\u0000\u0000\u02b5E\u0001\u0000\u0000\u0000\u02b6\u02b7\u0003D\""+
		"\u0000\u02b7\u02b8\u0003H$\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9"+
		"\u02bb\u0003H$\u0000\u02ba\u02b6\u0001\u0000\u0000\u0000\u02ba\u02b9\u0001"+
		"\u0000\u0000\u0000\u02bbG\u0001\u0000\u0000\u0000\u02bc\u02bd\u0005G\u0000"+
		"\u0000\u02bd\u02bf\u0003\u0198\u00cc\u0000\u02be\u02c0\u0003\u00ccf\u0000"+
		"\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0\u02c6\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005\f\u0000\u0000\u02c2"+
		"\u02c4\u0003\u016e\u00b7\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c4\u0001\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c7\u0005\u000f\u0000\u0000\u02c6\u02c1\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0005\u0013\u0000\u0000\u02c9\u02ca\u0003B!\u0000\u02caI\u0001"+
		"\u0000\u0000\u0000\u02cb\u02cc\u0003D\"\u0000\u02cc\u02cd\u0003L&\u0000"+
		"\u02cd\u02d0\u0001\u0000\u0000\u0000\u02ce\u02d0\u0003L&\u0000\u02cf\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cf\u02ce\u0001\u0000\u0000\u0000\u02d0K\u0001"+
		"\u0000\u0000\u0000\u02d1\u02d2\u0005Q\u0000\u0000\u02d2\u02d4\u0003\u0198"+
		"\u00cc\u0000\u02d3\u02d5\u0003\u00ccf\u0000\u02d4\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d8\u0005\f\u0000\u0000\u02d7\u02d9\u0003N\'\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9"+
		"\u02da\u0001\u0000\u0000\u0000\u02da\u02dd\u0005\u000f\u0000\u0000\u02db"+
		"\u02dc\u00058\u0000\u0000\u02dc\u02de\u0003\u00dam\u0000\u02dd\u02db\u0001"+
		"\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001"+
		"\u0000\u0000\u0000\u02df\u02e1\u0005\u0013\u0000\u0000\u02e0\u02e2\u0003"+
		"\u0194\u00ca\u0000\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000\u02e3\u02e4\u0003"+
		"B!\u0000\u02e4\u02fb\u0001\u0000\u0000\u0000\u02e5\u02e6\u0005Z\u0000"+
		"\u0000\u02e6\u02e7\u0005Q\u0000\u0000\u02e7\u02e9\u0003\u0198\u00cc\u0000"+
		"\u02e8\u02ea\u0003\u00ccf\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02e9"+
		"\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ed\u0005\f\u0000\u0000\u02ec\u02ee\u0003N\'\u0000\u02ed\u02ec\u0001"+
		"\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0001"+
		"\u0000\u0000\u0000\u02ef\u02f2\u0005\u000f\u0000\u0000\u02f0\u02f1\u0005"+
		"8\u0000\u0000\u02f1\u02f3\u0003\u00dam\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f6\u0005\u0013\u0000\u0000\u02f5\u02f7\u0003\u0194\u00ca"+
		"\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0003B!\u0000\u02f9"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fa\u02d1\u0001\u0000\u0000\u0000\u02fa"+
		"\u02e5\u0001\u0000\u0000\u0000\u02fbM\u0001\u0000\u0000\u0000\u02fc\u02fd"+
		"\u0003P(\u0000\u02fdO\u0001\u0000\u0000\u0000\u02fe\u0302\u0003R)\u0000"+
		"\u02ff\u0301\u0003Z-\u0000\u0300\u02ff\u0001\u0000\u0000\u0000\u0301\u0304"+
		"\u0001\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0001\u0000\u0000\u0000\u0303\u0308\u0001\u0000\u0000\u0000\u0304\u0302"+
		"\u0001\u0000\u0000\u0000\u0305\u0307\u0003^/\u0000\u0306\u0305\u0001\u0000"+
		"\u0000\u0000\u0307\u030a\u0001\u0000\u0000\u0000\u0308\u0306\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030c\u0001\u0000"+
		"\u0000\u0000\u030a\u0308\u0001\u0000\u0000\u0000\u030b\u030d\u0003V+\u0000"+
		"\u030c\u030b\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000\u0000\u0000"+
		"\u030d\u0330\u0001\u0000\u0000\u0000\u030e\u0312\u0003T*\u0000\u030f\u0311"+
		"\u0003^/\u0000\u0310\u030f\u0001\u0000\u0000\u0000\u0311\u0314\u0001\u0000"+
		"\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000"+
		"\u0000\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000"+
		"\u0000\u0000\u0315\u0317\u0003V+\u0000\u0316\u0315\u0001\u0000\u0000\u0000"+
		"\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u0330\u0001\u0000\u0000\u0000"+
		"\u0318\u031a\u0003Z-\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u031a\u031b"+
		"\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c"+
		"\u0001\u0000\u0000\u0000\u031c\u0320\u0001\u0000\u0000\u0000\u031d\u031f"+
		"\u0003^/\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0322\u0001\u0000"+
		"\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321\u0001\u0000"+
		"\u0000\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322\u0320\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0003V+\u0000\u0324\u0323\u0001\u0000\u0000\u0000"+
		"\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0330\u0001\u0000\u0000\u0000"+
		"\u0326\u0328\u0003^/\u0000\u0327\u0326\u0001\u0000\u0000\u0000\u0328\u0329"+
		"\u0001\u0000\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a"+
		"\u0001\u0000\u0000\u0000\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u032d"+
		"\u0003V+\u0000\u032c\u032b\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000"+
		"\u0000\u0000\u032d\u0330\u0001\u0000\u0000\u0000\u032e\u0330\u0003V+\u0000"+
		"\u032f\u02fe\u0001\u0000\u0000\u0000\u032f\u030e\u0001\u0000\u0000\u0000"+
		"\u032f\u0319\u0001\u0000\u0000\u0000\u032f\u0327\u0001\u0000\u0000\u0000"+
		"\u032f\u032e\u0001\u0000\u0000\u0000\u0330Q\u0001\u0000\u0000\u0000\u0331"+
		"\u0333\u0003Z-\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333\u0334\u0001"+
		"\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001"+
		"\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000\u0336\u0338\u0005"+
		"\u0019\u0000\u0000\u0337\u0339\u0005\u0014\u0000\u0000\u0338\u0337\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339S\u0001\u0000"+
		"\u0000\u0000\u033a\u033c\u0003Z-\u0000\u033b\u033a\u0001\u0000\u0000\u0000"+
		"\u033c\u033f\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000"+
		"\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000"+
		"\u033f\u033d\u0001\u0000\u0000\u0000\u0340\u0342\u0003^/\u0000\u0341\u0340"+
		"\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344\u0345"+
		"\u0001\u0000\u0000\u0000\u0345\u0347\u0005\u0019\u0000\u0000\u0346\u0348"+
		"\u0005\u0014\u0000\u0000\u0347\u0346\u0001\u0000\u0000\u0000\u0347\u0348"+
		"\u0001\u0000\u0000\u0000\u0348U\u0001\u0000\u0000\u0000\u0349\u034a\u0005"+
		"\u0018\u0000\u0000\u034a\u034e\u0003Z-\u0000\u034b\u034d\u0003`0\u0000"+
		"\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u0350\u0001\u0000\u0000\u0000"+
		"\u034e\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f\u0352\u0001\u0000\u0000\u0000\u0350\u034e\u0001\u0000\u0000\u0000"+
		"\u0351\u0353\u0003X,\u0000\u0352\u0351\u0001\u0000\u0000\u0000\u0352\u0353"+
		"\u0001\u0000\u0000\u0000\u0353\u036b\u0001\u0000\u0000\u0000\u0354\u0355"+
		"\u0005\u0018\u0000\u0000\u0355\u0359\u0003\\.\u0000\u0356\u0358\u0003"+
		"`0\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0358\u035b\u0001\u0000\u0000"+
		"\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u0359\u035a\u0001\u0000\u0000"+
		"\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000"+
		"\u0000\u035c\u035e\u0003X,\u0000\u035d\u035c\u0001\u0000\u0000\u0000\u035d"+
		"\u035e\u0001\u0000\u0000\u0000\u035e\u036b\u0001\u0000\u0000\u0000\u035f"+
		"\u0360\u0005\u0018\u0000\u0000\u0360\u0362\u0005\u0014\u0000\u0000\u0361"+
		"\u0363\u0003`0\u0000\u0362\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001"+
		"\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001"+
		"\u0000\u0000\u0000\u0365\u0367\u0001\u0000\u0000\u0000\u0366\u0368\u0003"+
		"X,\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000\u0000"+
		"\u0000\u0368\u036b\u0001\u0000\u0000\u0000\u0369\u036b\u0003X,\u0000\u036a"+
		"\u0349\u0001\u0000\u0000\u0000\u036a\u0354\u0001\u0000\u0000\u0000\u036a"+
		"\u035f\u0001\u0000\u0000\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036b"+
		"W\u0001\u0000\u0000\u0000\u036c\u036d\u0005(\u0000\u0000\u036d\u036e\u0003"+
		"Z-\u0000\u036eY\u0001\u0000\u0000\u0000\u036f\u0371\u0003b1\u0000\u0370"+
		"\u0372\u0005\u0014\u0000\u0000\u0371\u0370\u0001\u0000\u0000\u0000\u0371"+
		"\u0372\u0001\u0000\u0000\u0000\u0372\u0374\u0001\u0000\u0000\u0000\u0373"+
		"\u0375\u0005\u0004\u0000\u0000\u0374\u0373\u0001\u0000\u0000\u0000\u0374"+
		"\u0375\u0001\u0000\u0000\u0000\u0375[\u0001\u0000\u0000\u0000\u0376\u0378"+
		"\u0003d2\u0000\u0377\u0379\u0005\u0014\u0000\u0000\u0378\u0377\u0001\u0000"+
		"\u0000\u0000\u0378\u0379\u0001\u0000\u0000\u0000\u0379\u037b\u0001\u0000"+
		"\u0000\u0000\u037a\u037c\u0005\u0004\u0000\u0000\u037b\u037a\u0001\u0000"+
		"\u0000\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c]\u0001\u0000\u0000"+
		"\u0000\u037d\u037e\u0003b1\u0000\u037e\u0380\u0003j5\u0000\u037f\u0381"+
		"\u0005\u0014\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381"+
		"\u0001\u0000\u0000\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u0384"+
		"\u0005\u0004\u0000\u0000\u0383\u0382\u0001\u0000\u0000\u0000\u0383\u0384"+
		"\u0001\u0000\u0000\u0000\u0384_\u0001\u0000\u0000\u0000\u0385\u0387\u0003"+
		"b1\u0000\u0386\u0388\u0003j5\u0000\u0387\u0386\u0001\u0000\u0000\u0000"+
		"\u0387\u0388\u0001\u0000\u0000\u0000\u0388\u038a\u0001\u0000\u0000\u0000"+
		"\u0389\u038b\u0005\u0014\u0000\u0000\u038a\u0389\u0001\u0000\u0000\u0000"+
		"\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038d\u0001\u0000\u0000\u0000"+
		"\u038c\u038e\u0005\u0004\u0000\u0000\u038d\u038c\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0001\u0000\u0000\u0000\u038ea\u0001\u0000\u0000\u0000\u038f"+
		"\u0391\u0003\u0198\u00cc\u0000\u0390\u0392\u0003f3\u0000\u0391\u0390\u0001"+
		"\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392c\u0001\u0000"+
		"\u0000\u0000\u0393\u0394\u0003\u0198\u00cc\u0000\u0394\u0395\u0003h4\u0000"+
		"\u0395e\u0001\u0000\u0000\u0000\u0396\u0397\u0005\u0013\u0000\u0000\u0397"+
		"\u0398\u0003\u00dam\u0000\u0398g\u0001\u0000\u0000\u0000\u0399\u039a\u0005"+
		"\u0013\u0000\u0000\u039a\u039b\u0003\u00e0p\u0000\u039bi\u0001\u0000\u0000"+
		"\u0000\u039c\u039d\u0005\u001e\u0000\u0000\u039d\u039e\u0003\u00dam\u0000"+
		"\u039ek\u0001\u0000\u0000\u0000\u039f\u03a0\u0005\\\u0000\u0000\u03a0"+
		"\u03a1\u0003\u00e8t\u0000\u03a1\u03a2\u0005\u0013\u0000\u0000\u03a2\u03a7"+
		"\u0003B!\u0000\u03a3\u03a8\u0003n7\u0000\u03a4\u03a6\u0003p8\u0000\u03a5"+
		"\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a8\u0001\u0000\u0000\u0000\u03a7\u03a3\u0001\u0000\u0000\u0000\u03a7"+
		"\u03a5\u0001\u0000\u0000\u0000\u03a8m\u0001\u0000\u0000\u0000\u03a9\u03aa"+
		"\u0005[\u0000\u0000\u03aa\u03ab\u0003\u00e8t\u0000\u03ab\u03ac\u0005\u0013"+
		"\u0000\u0000\u03ac\u03b1\u0003B!\u0000\u03ad\u03b2\u0003n7\u0000\u03ae"+
		"\u03b0\u0003p8\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03ad\u0001"+
		"\u0000\u0000\u0000\u03b1\u03af\u0001\u0000\u0000\u0000\u03b2o\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b4\u0005>\u0000\u0000\u03b4\u03b5\u0005\u0013\u0000"+
		"\u0000\u03b5\u03b6\u0003B!\u0000\u03b6q\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0005T\u0000\u0000\u03b8\u03b9\u0003\u00e8t\u0000\u03b9\u03ba\u0005"+
		"\u0013\u0000\u0000\u03ba\u03bc\u0003B!\u0000\u03bb\u03bd\u0003p8\u0000"+
		"\u03bc\u03bb\u0001\u0000\u0000\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000"+
		"\u03bds\u0001\u0000\u0000\u0000\u03be\u03c0\u0005Z\u0000\u0000\u03bf\u03be"+
		"\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005M\u0000\u0000\u03c2\u03c3\u0003"+
		"\u017a\u00bd\u0000\u03c3\u03c4\u0005D\u0000\u0000\u03c4\u03c5\u0003\u00de"+
		"o\u0000\u03c5\u03c7\u0005\u0013\u0000\u0000\u03c6\u03c8\u0005\u0004\u0000"+
		"\u0000\u03c7\u03c6\u0001\u0000\u0000\u0000\u03c7\u03c8\u0001\u0000\u0000"+
		"\u0000\u03c8\u03c9\u0001\u0000\u0000\u0000\u03c9\u03cb\u0003B!\u0000\u03ca"+
		"\u03cc\u0003p8\u0000\u03cb\u03ca\u0001\u0000\u0000\u0000\u03cb\u03cc\u0001"+
		"\u0000\u0000\u0000\u03ccu\u0001\u0000\u0000\u0000\u03cd\u03ce\u0005Y\u0000"+
		"\u0000\u03ce\u03cf\u0005\f\u0000\u0000\u03cf\u03d4\u0003x<\u0000\u03d0"+
		"\u03d1\u0005\u0014\u0000\u0000\u03d1\u03d3\u0003x<\u0000\u03d2\u03d0\u0001"+
		"\u0000\u0000\u0000\u03d3\u03d6\u0001\u0000\u0000\u0000\u03d4\u03d2\u0001"+
		"\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d8\u0001"+
		"\u0000\u0000\u0000\u03d6\u03d4\u0001\u0000\u0000\u0000\u03d7\u03d9\u0005"+
		"\u0014\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001"+
		"\u0000\u0000\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03db\u0005"+
		"\u000f\u0000\u0000\u03db\u03dd\u0005\u0013\u0000\u0000\u03dc\u03de\u0005"+
		"\u0004\u0000\u0000\u03dd\u03dc\u0001\u0000\u0000\u0000\u03dd\u03de\u0001"+
		"\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0\u0003"+
		"B!\u0000\u03e0\u0406\u0001\u0000\u0000\u0000\u03e1\u03e2\u0005Z\u0000"+
		"\u0000\u03e2\u03e3\u0005Y\u0000\u0000\u03e3\u03e4\u0005\f\u0000\u0000"+
		"\u03e4\u03e9\u0003x<\u0000\u03e5\u03e6\u0005\u0014\u0000\u0000\u03e6\u03e8"+
		"\u0003x<\u0000\u03e7\u03e5\u0001\u0000\u0000\u0000\u03e8\u03eb\u0001\u0000"+
		"\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9\u03ea\u0001\u0000"+
		"\u0000\u0000\u03ea\u03ed\u0001\u0000\u0000\u0000\u03eb\u03e9\u0001\u0000"+
		"\u0000\u0000\u03ec\u03ee\u0005\u0014\u0000\u0000\u03ed\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001\u0000"+
		"\u0000\u0000\u03ef\u03f0\u0005\u000f\u0000\u0000\u03f0\u03f1\u0005\u0013"+
		"\u0000\u0000\u03f1\u03f2\u0003B!\u0000\u03f2\u0406\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f5\u0005Z\u0000\u0000\u03f4\u03f3\u0001\u0000\u0000\u0000\u03f4"+
		"\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6"+
		"\u03f7\u0005Y\u0000\u0000\u03f7\u03fc\u0003x<\u0000\u03f8\u03f9\u0005"+
		"\u0014\u0000\u0000\u03f9\u03fb\u0003x<\u0000\u03fa\u03f8\u0001\u0000\u0000"+
		"\u0000\u03fb\u03fe\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fc\u03fd\u0001\u0000\u0000\u0000\u03fd\u03ff\u0001\u0000\u0000"+
		"\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03ff\u0401\u0005\u0013\u0000"+
		"\u0000\u0400\u0402\u0005\u0004\u0000\u0000\u0401\u0400\u0001\u0000\u0000"+
		"\u0000\u0401\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0404\u0003B!\u0000\u0404\u0406\u0001\u0000\u0000\u0000\u0405"+
		"\u03cd\u0001\u0000\u0000\u0000\u0405\u03e1\u0001\u0000\u0000\u0000\u0405"+
		"\u03f4\u0001\u0000\u0000\u0000\u0406w\u0001\u0000\u0000\u0000\u0407\u040a"+
		"\u0003\u00dam\u0000\u0408\u0409\u0005P\u0000\u0000\u0409\u040b\u0003\u0180"+
		"\u00c0\u0000\u040a\u0408\u0001\u0000\u0000\u0000\u040a\u040b\u0001\u0000"+
		"\u0000\u0000\u040by\u0001\u0000\u0000\u0000\u040c\u040d\u0005O\u0000\u0000"+
		"\u040d\u040e\u0005\u0013\u0000\u0000\u040e\u040f\u0003B!\u0000\u040f\u0410"+
		"\u0003\u0080@\u0000\u0410\u042e\u0001\u0000\u0000\u0000\u0411\u0412\u0005"+
		"O\u0000\u0000\u0412\u0413\u0005\u0013\u0000\u0000\u0413\u0415\u0003B!"+
		"\u0000\u0414\u0416\u0003|>\u0000\u0415\u0414\u0001\u0000\u0000\u0000\u0416"+
		"\u0417\u0001\u0000\u0000\u0000\u0417\u0415\u0001\u0000\u0000\u0000\u0417"+
		"\u0418\u0001\u0000\u0000\u0000\u0418\u041a\u0001\u0000\u0000\u0000\u0419"+
		"\u041b\u0003p8\u0000\u041a\u0419\u0001\u0000\u0000\u0000\u041a\u041b\u0001"+
		"\u0000\u0000\u0000\u041b\u041d\u0001\u0000\u0000\u0000\u041c\u041e\u0003"+
		"\u0080@\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041d\u041e\u0001\u0000"+
		"\u0000\u0000\u041e\u042e\u0001\u0000\u0000\u0000\u041f\u0420\u0005O\u0000"+
		"\u0000\u0420\u0421\u0005\u0013\u0000\u0000\u0421\u0423\u0003B!\u0000\u0422"+
		"\u0424\u0003~?\u0000\u0423\u0422\u0001\u0000\u0000\u0000\u0424\u0425\u0001"+
		"\u0000\u0000\u0000\u0425\u0423\u0001\u0000\u0000\u0000\u0425\u0426\u0001"+
		"\u0000\u0000\u0000\u0426\u0428\u0001\u0000\u0000\u0000\u0427\u0429\u0003"+
		"p8\u0000\u0428\u0427\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000"+
		"\u0000\u0429\u042b\u0001\u0000\u0000\u0000\u042a\u042c\u0003\u0080@\u0000"+
		"\u042b\u042a\u0001\u0000\u0000\u0000\u042b\u042c\u0001\u0000\u0000\u0000"+
		"\u042c\u042e\u0001\u0000\u0000\u0000\u042d\u040c\u0001\u0000\u0000\u0000"+
		"\u042d\u0411\u0001\u0000\u0000\u0000\u042d\u041f\u0001\u0000\u0000\u0000"+
		"\u042e{\u0001\u0000\u0000\u0000\u042f\u0436\u0005C\u0000\u0000\u0430\u0433"+
		"\u0003\u00dam\u0000\u0431\u0432\u0005P\u0000\u0000\u0432\u0434\u0003\u0198"+
		"\u00cc\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0433\u0434\u0001\u0000"+
		"\u0000\u0000\u0434\u0437\u0001\u0000\u0000\u0000\u0435\u0437\u0003\u00d8"+
		"l\u0000\u0436\u0430\u0001\u0000\u0000\u0000\u0436\u0435\u0001\u0000\u0000"+
		"\u0000\u0436\u0437\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000"+
		"\u0000\u0438\u0439\u0005\u0013\u0000\u0000\u0439\u043a\u0003B!\u0000\u043a"+
		"}\u0001\u0000\u0000\u0000\u043b\u043c\u0005C\u0000\u0000\u043c\u0443\u0005"+
		"\u0018\u0000\u0000\u043d\u0440\u0003\u00dam\u0000\u043e\u043f\u0005P\u0000"+
		"\u0000\u043f\u0441\u0003\u0198\u00cc\u0000\u0440\u043e\u0001\u0000\u0000"+
		"\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0444\u0001\u0000\u0000"+
		"\u0000\u0442\u0444\u0003\u00d8l\u0000\u0443\u043d\u0001\u0000\u0000\u0000"+
		"\u0443\u0442\u0001\u0000\u0000\u0000\u0444\u0445\u0001\u0000\u0000\u0000"+
		"\u0445\u0446\u0005\u0013\u0000\u0000\u0446\u0447\u0003B!\u0000\u0447\u007f"+
		"\u0001\u0000\u0000\u0000\u0448\u0449\u0005H\u0000\u0000\u0449\u044a\u0005"+
		"\u0013\u0000\u0000\u044a\u044b\u0003B!\u0000\u044b\u0081\u0001\u0000\u0000"+
		"\u0000\u044c\u044d\u0005`\u0000\u0000\u044d\u044e\u0003\u0084B\u0000\u044e"+
		"\u044f\u0005\u0013\u0000\u0000\u044f\u0450\u0005f\u0000\u0000\u0450\u0452"+
		"\u0005\u0002\u0000\u0000\u0451\u0453\u0003\u0086C\u0000\u0452\u0451\u0001"+
		"\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454\u0452\u0001"+
		"\u0000\u0000\u0000\u0454\u0455\u0001\u0000\u0000\u0000\u0455\u0456\u0001"+
		"\u0000\u0000\u0000\u0456\u0457\u0005\u0003\u0000\u0000\u0457\u0083\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u0003\u00e4r\u0000\u0459\u045b\u0005\u0014"+
		"\u0000\u0000\u045a\u045c\u0003\u00e2q\u0000\u045b\u045a\u0001\u0000\u0000"+
		"\u0000\u045b\u045c\u0001\u0000\u0000\u0000\u045c\u045f\u0001\u0000\u0000"+
		"\u0000\u045d\u045f\u0003\u00e8t\u0000\u045e\u0458\u0001\u0000\u0000\u0000"+
		"\u045e\u045d\u0001\u0000\u0000\u0000\u045f\u0085\u0001\u0000\u0000\u0000"+
		"\u0460\u0461\u0005a\u0000\u0000\u0461\u0463\u0003\u008aE\u0000\u0462\u0464"+
		"\u0003\u0088D\u0000\u0463\u0462\u0001\u0000\u0000\u0000\u0463\u0464\u0001"+
		"\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u0466\u0005"+
		"\u0013\u0000\u0000\u0466\u0467\u0003B!\u0000\u0467\u0087\u0001\u0000\u0000"+
		"\u0000\u0468\u0469\u0005\\\u0000\u0000\u0469\u046a\u0003\u00e8t\u0000"+
		"\u046a\u0089\u0001\u0000\u0000\u0000\u046b\u046e\u0003\u00b2Y\u0000\u046c"+
		"\u046e\u0003\u008cF\u0000\u046d\u046b\u0001\u0000\u0000\u0000\u046d\u046c"+
		"\u0001\u0000\u0000\u0000\u046e\u008b\u0001\u0000\u0000\u0000\u046f\u0472"+
		"\u0003\u008eG\u0000\u0470\u0472\u0003\u0090H\u0000\u0471\u046f\u0001\u0000"+
		"\u0000\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0472\u008d\u0001\u0000"+
		"\u0000\u0000\u0473\u0474\u0003\u0090H\u0000\u0474\u0475\u0005P\u0000\u0000"+
		"\u0475\u0476\u0003\u00a4R\u0000\u0476\u008f\u0001\u0000\u0000\u0000\u0477"+
		"\u047c\u0003\u0092I\u0000\u0478\u0479\u0005\u001a\u0000\u0000\u0479\u047b"+
		"\u0003\u0092I\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u047e\u0001"+
		"\u0000\u0000\u0000\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047d\u0001"+
		"\u0000\u0000\u0000\u047d\u0091\u0001\u0000\u0000\u0000\u047e\u047c\u0001"+
		"\u0000\u0000\u0000\u047f\u0488\u0003\u0094J\u0000\u0480\u0488\u0003\u00a2"+
		"Q\u0000\u0481\u0488\u0003\u00a6S\u0000\u0482\u0488\u0003\u00a8T\u0000"+
		"\u0483\u0488\u0003\u00aeW\u0000\u0484\u0488\u0003\u00b0X\u0000\u0485\u0488"+
		"\u0003\u00ba]\u0000\u0486\u0488\u0003\u00c2a\u0000\u0487\u047f\u0001\u0000"+
		"\u0000\u0000\u0487\u0480\u0001\u0000\u0000\u0000\u0487\u0481\u0001\u0000"+
		"\u0000\u0000\u0487\u0482\u0001\u0000\u0000\u0000\u0487\u0483\u0001\u0000"+
		"\u0000\u0000\u0487\u0484\u0001\u0000\u0000\u0000\u0487\u0485\u0001\u0000"+
		"\u0000\u0000\u0487\u0486\u0001\u0000\u0000\u0000\u0488\u0093\u0001\u0000"+
		"\u0000\u0000\u0489\u0490\u0003\u009aM\u0000\u048a\u0490\u0003\u0098L\u0000"+
		"\u048b\u0490\u0003\u0152\u00a9\u0000\u048c\u0490\u0005A\u0000\u0000\u048d"+
		"\u0490\u0005F\u0000\u0000\u048e\u0490\u0005<\u0000\u0000\u048f\u0489\u0001"+
		"\u0000\u0000\u0000\u048f\u048a\u0001\u0000\u0000\u0000\u048f\u048b\u0001"+
		"\u0000\u0000\u0000\u048f\u048c\u0001\u0000\u0000\u0000\u048f\u048d\u0001"+
		"\u0000\u0000\u0000\u048f\u048e\u0001\u0000\u0000\u0000\u0490\u0095\u0001"+
		"\u0000\u0000\u0000\u0491\u0498\u0003\u009aM\u0000\u0492\u0498\u0003\u0098"+
		"L\u0000\u0493\u0498\u0003\u0152\u00a9\u0000\u0494\u0498\u0005A\u0000\u0000"+
		"\u0495\u0498\u0005F\u0000\u0000\u0496\u0498\u0005<\u0000\u0000\u0497\u0491"+
		"\u0001\u0000\u0000\u0000\u0497\u0492\u0001\u0000\u0000\u0000\u0497\u0493"+
		"\u0001\u0000\u0000\u0000\u0497\u0494\u0001\u0000\u0000\u0000\u0497\u0495"+
		"\u0001\u0000\u0000\u0000\u0497\u0496\u0001\u0000\u0000\u0000\u0498\u0097"+
		"\u0001\u0000\u0000\u0000\u0499\u049a\u0003\u009cN\u0000\u049a\u049b\u0007"+
		"\u0001\u0000\u0000\u049b\u049c\u0003\u00a0P\u0000\u049c\u0099\u0001\u0000"+
		"\u0000\u0000\u049d\u049f\u0005\u0017\u0000\u0000\u049e\u049d\u0001\u0000"+
		"\u0000\u0000\u049e\u049f\u0001\u0000\u0000\u0000\u049f\u04a0\u0001\u0000"+
		"\u0000\u0000\u04a0\u04a1\u0005d\u0000\u0000\u04a1\u009b\u0001\u0000\u0000"+
		"\u0000\u04a2\u04a4\u0005\u0017\u0000\u0000\u04a3\u04a2\u0001\u0000\u0000"+
		"\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a5\u04a6\u0003\u009eO\u0000\u04a6\u009d\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a8\u0005d\u0000\u0000\u04a8\u009f\u0001\u0000\u0000\u0000\u04a9"+
		"\u04aa\u0005d\u0000\u0000\u04aa\u00a1\u0001\u0000\u0000\u0000\u04ab\u04ac"+
		"\u0003\u00a4R\u0000\u04ac\u00a3\u0001\u0000\u0000\u0000\u04ad\u04ae\u0003"+
		"\u0196\u00cb\u0000\u04ae\u00a5\u0001\u0000\u0000\u0000\u04af\u04b0\u0005"+
		"b\u0000\u0000\u04b0\u00a7\u0001\u0000\u0000\u0000\u04b1\u04b2\u0003\u00aa"+
		"U\u0000\u04b2\u00a9\u0001\u0000\u0000\u0000\u04b3\u04b6\u0003\u0198\u00cc"+
		"\u0000\u04b4\u04b5\u0005\u0012\u0000\u0000\u04b5\u04b7\u0003\u0198\u00cc"+
		"\u0000\u04b6\u04b4\u0001\u0000\u0000\u0000\u04b7\u04b8\u0001\u0000\u0000"+
		"\u0000\u04b8\u04b6\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000"+
		"\u0000\u04b9\u00ab\u0001\u0000\u0000\u0000\u04ba\u04bf\u0003\u0198\u00cc"+
		"\u0000\u04bb\u04bc\u0005\u0012\u0000\u0000\u04bc\u04be\u0003\u0198\u00cc"+
		"\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04be\u04c1\u0001\u0000\u0000"+
		"\u0000\u04bf\u04bd\u0001\u0000\u0000\u0000\u04bf\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c0\u00ad\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c3\u0005\f\u0000\u0000\u04c3\u04c4\u0003\u008cF\u0000"+
		"\u04c4\u04c5\u0005\u000f\u0000\u0000\u04c5\u00af\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c8\u0005\r\u0000\u0000\u04c7\u04c9\u0003\u00b4Z\u0000\u04c8"+
		"\u04c7\u0001\u0000\u0000\u0000\u04c8\u04c9\u0001\u0000\u0000\u0000\u04c9"+
		"\u04ca\u0001\u0000\u0000\u0000\u04ca\u04d1\u0005\u0010\u0000\u0000\u04cb"+
		"\u04cd\u0005\f\u0000\u0000\u04cc\u04ce\u0003\u00b2Y\u0000\u04cd\u04cc"+
		"\u0001\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04cf"+
		"\u0001\u0000\u0000\u0000\u04cf\u04d1\u0005\u000f\u0000\u0000\u04d0\u04c6"+
		"\u0001\u0000\u0000\u0000\u04d0\u04cb\u0001\u0000\u0000\u0000\u04d1\u00b1"+
		"\u0001\u0000\u0000\u0000\u04d2\u04d3\u0003\u00b6[\u0000\u04d3\u04d5\u0005"+
		"\u0014\u0000\u0000\u04d4\u04d6\u0003\u00b4Z\u0000\u04d5\u04d4\u0001\u0000"+
		"\u0000\u0000\u04d5\u04d6\u0001\u0000\u0000\u0000\u04d6\u00b3\u0001\u0000"+
		"\u0000\u0000\u04d7\u04dc\u0003\u00b6[\u0000\u04d8\u04d9\u0005\u0014\u0000"+
		"\u0000\u04d9\u04db\u0003\u00b6[\u0000\u04da\u04d8\u0001\u0000\u0000\u0000"+
		"\u04db\u04de\u0001\u0000\u0000\u0000\u04dc\u04da\u0001\u0000\u0000\u0000"+
		"\u04dc\u04dd\u0001\u0000\u0000\u0000\u04dd\u04e0\u0001\u0000\u0000\u0000"+
		"\u04de\u04dc\u0001\u0000\u0000\u0000\u04df\u04e1\u0005\u0014\u0000\u0000"+
		"\u04e0\u04df\u0001\u0000\u0000\u0000\u04e0\u04e1\u0001\u0000\u0000\u0000"+
		"\u04e1\u00b5\u0001\u0000\u0000\u0000\u04e2\u04e5\u0003\u00b8\\\u0000\u04e3"+
		"\u04e5\u0003\u008cF\u0000\u04e4\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e3"+
		"\u0001\u0000\u0000\u0000\u04e5\u00b7\u0001\u0000\u0000\u0000\u04e6\u04e7"+
		"\u0005\u0018\u0000\u0000\u04e7\u04e8\u0003\u0198\u00cc\u0000\u04e8\u00b9"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ea\u0005\u000e\u0000\u0000\u04ea\u04fe"+
		"\u0005\u0011\u0000\u0000\u04eb\u04ec\u0005\u000e\u0000\u0000\u04ec\u04ee"+
		"\u0003\u00c0`\u0000\u04ed\u04ef\u0005\u0014\u0000\u0000\u04ee\u04ed\u0001"+
		"\u0000\u0000\u0000\u04ee\u04ef\u0001\u0000\u0000\u0000\u04ef\u04f0\u0001"+
		"\u0000\u0000\u0000\u04f0\u04f1\u0005\u0011\u0000\u0000\u04f1\u04fe\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f3\u0005\u000e\u0000\u0000\u04f3\u04f6\u0003"+
		"\u00bc^\u0000\u04f4\u04f5\u0005\u0014\u0000\u0000\u04f5\u04f7\u0003\u00c0"+
		"`\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f9\u0001\u0000\u0000\u0000\u04f8\u04fa\u0005\u0014\u0000"+
		"\u0000\u04f9\u04f8\u0001\u0000\u0000\u0000\u04f9\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u04fc\u0005\u0011\u0000"+
		"\u0000\u04fc\u04fe\u0001\u0000\u0000\u0000\u04fd\u04e9\u0001\u0000\u0000"+
		"\u0000\u04fd\u04eb\u0001\u0000\u0000\u0000\u04fd\u04f2\u0001\u0000\u0000"+
		"\u0000\u04fe\u00bb\u0001\u0000\u0000\u0000\u04ff\u0504\u0003\u00be_\u0000"+
		"\u0500\u0501\u0005\u0014\u0000\u0000\u0501\u0503\u0003\u00be_\u0000\u0502"+
		"\u0500\u0001\u0000\u0000\u0000\u0503\u0506\u0001\u0000\u0000\u0000\u0504"+
		"\u0502\u0001\u0000\u0000\u0000\u0504\u0505\u0001\u0000\u0000\u0000\u0505"+
		"\u00bd\u0001\u0000\u0000\u0000\u0506\u0504\u0001\u0000\u0000\u0000\u0507"+
		"\u050a\u0003\u0096K\u0000\u0508\u050a\u0003\u00aaU\u0000\u0509\u0507\u0001"+
		"\u0000\u0000\u0000\u0509\u0508\u0001\u0000\u0000\u0000\u050a\u050b\u0001"+
		"\u0000\u0000\u0000\u050b\u050c\u0005\u0013\u0000\u0000\u050c\u050d\u0003"+
		"\u008cF\u0000\u050d\u00bf\u0001\u0000\u0000\u0000\u050e\u050f\u0005(\u0000"+
		"\u0000\u050f\u0510\u0003\u00a4R\u0000\u0510\u00c1\u0001\u0000\u0000\u0000"+
		"\u0511\u0512\u0003\u00acV\u0000\u0512\u051e\u0005\f\u0000\u0000\u0513"+
		"\u0516\u0003\u00c4b\u0000\u0514\u0515\u0005\u0014\u0000\u0000\u0515\u0517"+
		"\u0003\u00c6c\u0000\u0516\u0514\u0001\u0000\u0000\u0000\u0516\u0517\u0001"+
		"\u0000\u0000\u0000\u0517\u051a\u0001\u0000\u0000\u0000\u0518\u051a\u0003"+
		"\u00c6c\u0000\u0519\u0513\u0001\u0000\u0000\u0000\u0519\u0518\u0001\u0000"+
		"\u0000\u0000\u051a\u051c\u0001\u0000\u0000\u0000\u051b\u051d\u0005\u0014"+
		"\u0000\u0000\u051c\u051b\u0001\u0000\u0000\u0000\u051c\u051d\u0001\u0000"+
		"\u0000\u0000\u051d\u051f\u0001\u0000\u0000\u0000\u051e\u0519\u0001\u0000"+
		"\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u0520\u0001\u0000"+
		"\u0000\u0000\u0520\u0521\u0005\u000f\u0000\u0000\u0521\u00c3\u0001\u0000"+
		"\u0000\u0000\u0522\u0527\u0003\u008cF\u0000\u0523\u0524\u0005\u0014\u0000"+
		"\u0000\u0524\u0526\u0003\u008cF\u0000\u0525\u0523\u0001\u0000\u0000\u0000"+
		"\u0526\u0529\u0001\u0000\u0000\u0000\u0527\u0525\u0001\u0000\u0000\u0000"+
		"\u0527\u0528\u0001\u0000\u0000\u0000\u0528\u00c5\u0001\u0000\u0000\u0000"+
		"\u0529\u0527\u0001\u0000\u0000\u0000\u052a\u052f\u0003\u00c8d\u0000\u052b"+
		"\u052c\u0005\u0014\u0000\u0000\u052c\u052e\u0003\u00c8d\u0000\u052d\u052b"+
		"\u0001\u0000\u0000\u0000\u052e\u0531\u0001\u0000\u0000\u0000\u052f\u052d"+
		"\u0001\u0000\u0000\u0000\u052f\u0530\u0001\u0000\u0000\u0000\u0530\u00c7"+
		"\u0001\u0000\u0000\u0000\u0531\u052f\u0001\u0000\u0000\u0000\u0532\u0533"+
		"\u0003\u0198\u00cc\u0000\u0533\u0534\u0005\u001e\u0000\u0000\u0534\u0535"+
		"\u0003\u008cF\u0000\u0535\u00c9\u0001\u0000\u0000\u0000\u0536\u0537\u0005"+
		"_\u0000\u0000\u0537\u0539\u0003\u0198\u00cc\u0000\u0538\u053a\u0003\u00cc"+
		"f\u0000\u0539\u0538\u0001\u0000\u0000\u0000\u0539\u053a\u0001\u0000\u0000"+
		"\u0000\u053a\u053b\u0001\u0000\u0000\u0000\u053b\u053c\u0005\u001e\u0000"+
		"\u0000\u053c\u053d\u0003\u00dam\u0000\u053d\u00cb\u0001\u0000\u0000\u0000"+
		"\u053e\u053f\u0005\r\u0000\u0000\u053f\u0540\u0003\u00ceg\u0000\u0540"+
		"\u0541\u0005\u0010\u0000\u0000\u0541\u00cd\u0001\u0000\u0000\u0000\u0542"+
		"\u0547\u0003\u00d0h\u0000\u0543\u0544\u0005\u0014\u0000\u0000\u0544\u0546"+
		"\u0003\u00d0h\u0000\u0545\u0543\u0001\u0000\u0000\u0000\u0546\u0549\u0001"+
		"\u0000\u0000\u0000\u0547\u0545\u0001\u0000\u0000\u0000\u0547\u0548\u0001"+
		"\u0000\u0000\u0000\u0548\u054b\u0001\u0000\u0000\u0000\u0549\u0547\u0001"+
		"\u0000\u0000\u0000\u054a\u054c\u0005\u0014\u0000\u0000\u054b\u054a\u0001"+
		"\u0000\u0000\u0000\u054b\u054c\u0001\u0000\u0000\u0000\u054c\u00cf\u0001"+
		"\u0000\u0000\u0000\u054d\u054f\u0003\u0198\u00cc\u0000\u054e\u0550\u0003"+
		"\u00d2i\u0000\u054f\u054e\u0001\u0000\u0000\u0000\u054f\u0550\u0001\u0000"+
		"\u0000\u0000\u0550\u0552\u0001\u0000\u0000\u0000\u0551\u0553\u0003\u00d4"+
		"j\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553\u0001\u0000\u0000"+
		"\u0000\u0553\u055f\u0001\u0000\u0000\u0000\u0554\u0555\u0005\u0018\u0000"+
		"\u0000\u0555\u0557\u0003\u0198\u00cc\u0000\u0556\u0558\u0003\u00d6k\u0000"+
		"\u0557\u0556\u0001\u0000\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000"+
		"\u0558\u055f\u0001\u0000\u0000\u0000\u0559\u055a\u0005(\u0000\u0000\u055a"+
		"\u055c\u0003\u0198\u00cc\u0000\u055b\u055d\u0003\u00d4j\u0000\u055c\u055b"+
		"\u0001\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055f"+
		"\u0001\u0000\u0000\u0000\u055e\u054d\u0001\u0000\u0000\u0000\u055e\u0554"+
		"\u0001\u0000\u0000\u0000\u055e\u0559\u0001\u0000\u0000\u0000\u055f\u00d1"+
		"\u0001\u0000\u0000\u0000\u0560\u0561\u0005\u0013\u0000\u0000\u0561\u0562"+
		"\u0003\u00dam\u0000\u0562\u00d3\u0001\u0000\u0000\u0000\u0563\u0564\u0005"+
		"\u001e\u0000\u0000\u0564\u0565\u0003\u00dam\u0000\u0565\u00d5\u0001\u0000"+
		"\u0000\u0000\u0566\u0567\u0005\u001e\u0000\u0000\u0567\u0568\u0003\u00e0"+
		"p\u0000\u0568\u00d7\u0001\u0000\u0000\u0000\u0569\u056e\u0003\u00dam\u0000"+
		"\u056a\u056b\u0005\u0014\u0000\u0000\u056b\u056d\u0003\u00dam\u0000\u056c"+
		"\u056a\u0001\u0000\u0000\u0000\u056d\u0570\u0001\u0000\u0000\u0000\u056e"+
		"\u056c\u0001\u0000\u0000\u0000\u056e\u056f\u0001\u0000\u0000\u0000\u056f"+
		"\u0572\u0001\u0000\u0000\u0000\u0570\u056e\u0001\u0000\u0000\u0000\u0571"+
		"\u0573\u0005\u0014\u0000\u0000\u0572\u0571\u0001\u0000\u0000\u0000\u0572"+
		"\u0573\u0001\u0000\u0000\u0000\u0573\u00d9\u0001\u0000\u0000\u0000\u0574"+
		"\u057a\u0003\u00eau\u0000\u0575\u0576\u0005\\\u0000\u0000\u0576\u0577"+
		"\u0003\u00eau\u0000\u0577\u0578\u0005>\u0000\u0000\u0578\u0579\u0003\u00da"+
		"m\u0000\u0579\u057b\u0001\u0000\u0000\u0000\u057a\u0575\u0001\u0000\u0000"+
		"\u0000\u057a\u057b\u0001\u0000\u0000\u0000\u057b\u057e\u0001\u0000\u0000"+
		"\u0000\u057c\u057e\u0003\u0124\u0092\u0000\u057d\u0574\u0001\u0000\u0000"+
		"\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057e\u00db\u0001\u0000\u0000"+
		"\u0000\u057f\u0585\u0005^\u0000\u0000\u0580\u0581\u0005R\u0000\u0000\u0581"+
		"\u0586\u0003\u00dam\u0000\u0582\u0584\u0003\u00deo\u0000\u0583\u0582\u0001"+
		"\u0000\u0000\u0000\u0583\u0584\u0001\u0000\u0000\u0000\u0584\u0586\u0001"+
		"\u0000\u0000\u0000\u0585\u0580\u0001\u0000\u0000\u0000\u0585\u0583\u0001"+
		"\u0000\u0000\u0000\u0586\u00dd\u0001\u0000\u0000\u0000\u0587\u058c\u0003"+
		"\u00e0p\u0000\u0588\u0589\u0005\u0014\u0000\u0000\u0589\u058b\u0003\u00e0"+
		"p\u0000\u058a\u0588\u0001\u0000\u0000\u0000\u058b\u058e\u0001\u0000\u0000"+
		"\u0000\u058c\u058a\u0001\u0000\u0000\u0000\u058c\u058d\u0001\u0000\u0000"+
		"\u0000\u058d\u0590\u0001\u0000\u0000\u0000\u058e\u058c\u0001\u0000\u0000"+
		"\u0000\u058f\u0591\u0005\u0014\u0000\u0000\u0590\u058f\u0001\u0000\u0000"+
		"\u0000\u0590\u0591\u0001\u0000\u0000\u0000\u0591\u00df\u0001\u0000\u0000"+
		"\u0000\u0592\u0593\u0005\u0018\u0000\u0000\u0593\u0596\u0003\u0108\u0084"+
		"\u0000\u0594\u0596\u0003\u00dam\u0000\u0595\u0592\u0001\u0000\u0000\u0000"+
		"\u0595\u0594\u0001\u0000\u0000\u0000\u0596\u00e1\u0001\u0000\u0000\u0000"+
		"\u0597\u059c\u0003\u00e4r\u0000\u0598\u0599\u0005\u0014\u0000\u0000\u0599"+
		"\u059b\u0003\u00e4r\u0000\u059a\u0598\u0001\u0000\u0000\u0000\u059b\u059e"+
		"\u0001\u0000\u0000\u0000\u059c\u059a\u0001\u0000\u0000\u0000\u059c\u059d"+
		"\u0001\u0000\u0000\u0000\u059d\u05a0\u0001\u0000\u0000\u0000\u059e\u059c"+
		"\u0001\u0000\u0000\u0000\u059f\u05a1\u0005\u0014\u0000\u0000\u05a0\u059f"+
		"\u0001\u0000\u0000\u0000\u05a0\u05a1\u0001\u0000\u0000\u0000\u05a1\u00e3"+
		"\u0001\u0000\u0000\u0000\u05a2\u05a3\u0005\u0018\u0000\u0000\u05a3\u05a6"+
		"\u0003\u0108\u0084\u0000\u05a4\u05a6\u0003\u00e8t\u0000\u05a5\u05a2\u0001"+
		"\u0000\u0000\u0000\u05a5\u05a4\u0001\u0000\u0000\u0000\u05a6\u00e5\u0001"+
		"\u0000\u0000\u0000\u05a7\u05a8\u0003\u0198\u00cc\u0000\u05a8\u05a9\u0005"+
		":\u0000\u0000\u05a9\u05aa\u0003\u00dam\u0000\u05aa\u00e7\u0001\u0000\u0000"+
		"\u0000\u05ab\u05ae\u0003\u00e6s\u0000\u05ac\u05ae\u0003\u00dam\u0000\u05ad"+
		"\u05ab\u0001\u0000\u0000\u0000\u05ad\u05ac\u0001\u0000\u0000\u0000\u05ae"+
		"\u00e9\u0001\u0000\u0000\u0000\u05af\u05b4\u0003\u00ecv\u0000\u05b0\u05b1"+
		"\u0005]\u0000\u0000\u05b1\u05b3\u0003\u00ecv\u0000\u05b2\u05b0\u0001\u0000"+
		"\u0000\u0000\u05b3\u05b6\u0001\u0000\u0000\u0000\u05b4\u05b2\u0001\u0000"+
		"\u0000\u0000\u05b4\u05b5\u0001\u0000\u0000\u0000\u05b5\u00eb\u0001\u0000"+
		"\u0000\u0000\u05b6\u05b4\u0001\u0000\u0000\u0000\u05b7\u05bc\u0003\u00ee"+
		"w\u0000\u05b8\u05b9\u0005K\u0000\u0000\u05b9\u05bb\u0003\u00eew\u0000"+
		"\u05ba\u05b8\u0001\u0000\u0000\u0000\u05bb\u05be\u0001\u0000\u0000\u0000"+
		"\u05bc\u05ba\u0001\u0000\u0000\u0000\u05bc\u05bd\u0001\u0000\u0000\u0000"+
		"\u05bd\u00ed\u0001\u0000\u0000\u0000\u05be\u05bc\u0001\u0000\u0000\u0000"+
		"\u05bf\u05c0\u0005X\u0000\u0000\u05c0\u05c3\u0003\u00eew\u0000\u05c1\u05c3"+
		"\u0003\u00f0x\u0000\u05c2\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c1\u0001"+
		"\u0000\u0000\u0000\u05c3\u00ef\u0001\u0000\u0000\u0000\u05c4\u05c8\u0003"+
		"\u0108\u0084\u0000\u05c5\u05c7\u0003\u00f2y\u0000\u05c6\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c7\u05ca\u0001\u0000\u0000\u0000\u05c8\u05c6\u0001\u0000"+
		"\u0000\u0000\u05c8\u05c9\u0001\u0000\u0000\u0000\u05c9\u00f1\u0001\u0000"+
		"\u0000\u0000\u05ca\u05c8\u0001\u0000\u0000\u0000\u05cb\u05d6\u0003\u00f4"+
		"z\u0000\u05cc\u05d6\u0003\u00f6{\u0000\u05cd\u05d6\u0003\u00f8|\u0000"+
		"\u05ce\u05d6\u0003\u00fa}\u0000\u05cf\u05d6\u0003\u00fc~\u0000\u05d0\u05d6"+
		"\u0003\u00fe\u007f\u0000\u05d1\u05d6\u0003\u0100\u0080\u0000\u05d2\u05d6"+
		"\u0003\u0102\u0081\u0000\u05d3\u05d6\u0003\u0104\u0082\u0000\u05d4\u05d6"+
		"\u0003\u0106\u0083\u0000\u05d5\u05cb\u0001\u0000\u0000\u0000\u05d5\u05cc"+
		"\u0001\u0000\u0000\u0000\u05d5\u05cd\u0001\u0000\u0000\u0000\u05d5\u05ce"+
		"\u0001\u0000\u0000\u0000\u05d5\u05cf\u0001\u0000\u0000\u0000\u05d5\u05d0"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d1\u0001\u0000\u0000\u0000\u05d5\u05d2"+
		"\u0001\u0000\u0000\u0000\u05d5\u05d3\u0001\u0000\u0000\u0000\u05d5\u05d4"+
		"\u0001\u0000\u0000\u0000\u05d6\u00f3\u0001\u0000\u0000\u0000\u05d7\u05d8"+
		"\u0005 \u0000\u0000\u05d8\u05d9\u0003\u0108\u0084\u0000\u05d9\u00f5\u0001"+
		"\u0000\u0000\u0000\u05da\u05db\u0005!\u0000\u0000\u05db\u05dc\u0003\u0108"+
		"\u0084\u0000\u05dc\u00f7\u0001\u0000\u0000\u0000\u05dd\u05de\u0005\"\u0000"+
		"\u0000\u05de\u05df\u0003\u0108\u0084\u0000\u05df\u00f9\u0001\u0000\u0000"+
		"\u0000\u05e0\u05e1\u0005\u001c\u0000\u0000\u05e1\u05e2\u0003\u0108\u0084"+
		"\u0000\u05e2\u00fb\u0001\u0000\u0000\u0000\u05e3\u05e4\u0005#\u0000\u0000"+
		"\u05e4\u05e5\u0003\u0108\u0084\u0000\u05e5\u00fd\u0001\u0000\u0000\u0000"+
		"\u05e6\u05e7\u0005\u001d\u0000\u0000\u05e7\u05e8\u0003\u0108\u0084\u0000"+
		"\u05e8\u00ff\u0001\u0000\u0000\u0000\u05e9\u05ea\u0005X\u0000\u0000\u05ea"+
		"\u05eb\u0005D\u0000\u0000\u05eb\u05ec\u0003\u0108\u0084\u0000\u05ec\u0101"+
		"\u0001\u0000\u0000\u0000\u05ed\u05ee\u0005D\u0000\u0000\u05ee\u05ef\u0003"+
		"\u0108\u0084\u0000\u05ef\u0103\u0001\u0000\u0000\u0000\u05f0\u05f1\u0005"+
		"I\u0000\u0000\u05f1\u05f2\u0005X\u0000\u0000\u05f2\u05f3\u0003\u0108\u0084"+
		"\u0000\u05f3\u0105\u0001\u0000\u0000\u0000\u05f4\u05f5\u0005I\u0000\u0000"+
		"\u05f5\u05f6\u0003\u0108\u0084\u0000\u05f6\u0107\u0001\u0000\u0000\u0000"+
		"\u05f7\u05f8\u0006\u0084\uffff\uffff\u0000\u05f8\u05f9\u0003\u010a\u0085"+
		"\u0000\u05f9\u05ff\u0001\u0000\u0000\u0000\u05fa\u05fb\n\u0002\u0000\u0000"+
		"\u05fb\u05fc\u0005\u001a\u0000\u0000\u05fc\u05fe\u0003\u010a\u0085\u0000"+
		"\u05fd\u05fa\u0001\u0000\u0000\u0000\u05fe\u0601\u0001\u0000\u0000\u0000"+
		"\u05ff\u05fd\u0001\u0000\u0000\u0000\u05ff\u0600\u0001\u0000\u0000\u0000"+
		"\u0600\u0109\u0001\u0000\u0000\u0000\u0601\u05ff\u0001\u0000\u0000\u0000"+
		"\u0602\u0603\u0006\u0085\uffff\uffff\u0000\u0603\u0604\u0003\u010c\u0086"+
		"\u0000\u0604\u060a\u0001\u0000\u0000\u0000\u0605\u0606\n\u0002\u0000\u0000"+
		"\u0606\u0607\u0005%\u0000\u0000\u0607\u0609\u0003\u010c\u0086\u0000\u0608"+
		"\u0605\u0001\u0000\u0000\u0000\u0609\u060c\u0001\u0000\u0000\u0000\u060a"+
		"\u0608\u0001\u0000\u0000\u0000\u060a\u060b\u0001\u0000\u0000\u0000\u060b"+
		"\u010b\u0001\u0000\u0000\u0000\u060c\u060a\u0001\u0000\u0000\u0000\u060d"+
		"\u060e\u0006\u0086\uffff\uffff\u0000\u060e\u060f\u0003\u010e\u0087\u0000"+
		"\u060f\u0615\u0001\u0000\u0000\u0000\u0610\u0611\n\u0002\u0000\u0000\u0611"+
		"\u0612\u0005\u001b\u0000\u0000\u0612\u0614\u0003\u010e\u0087\u0000\u0613"+
		"\u0610\u0001\u0000\u0000\u0000\u0614\u0617\u0001\u0000\u0000\u0000\u0615"+
		"\u0613\u0001\u0000\u0000\u0000\u0615\u0616\u0001\u0000\u0000\u0000\u0616"+
		"\u010d\u0001\u0000\u0000\u0000\u0617\u0615\u0001\u0000\u0000\u0000\u0618"+
		"\u0619\u0006\u0087\uffff\uffff\u0000\u0619\u061a\u0003\u0110\u0088\u0000"+
		"\u061a\u0620\u0001\u0000\u0000\u0000\u061b\u061c\n\u0002\u0000\u0000\u061c"+
		"\u061d\u0007\u0002\u0000\u0000\u061d\u061f\u0003\u0110\u0088\u0000\u061e"+
		"\u061b\u0001\u0000\u0000\u0000\u061f\u0622\u0001\u0000\u0000\u0000\u0620"+
		"\u061e\u0001\u0000\u0000\u0000\u0620\u0621\u0001\u0000\u0000\u0000\u0621"+
		"\u010f\u0001\u0000\u0000\u0000\u0622\u0620\u0001\u0000\u0000\u0000\u0623"+
		"\u0624\u0006\u0088\uffff\uffff\u0000\u0624\u0625\u0003\u0112\u0089\u0000"+
		"\u0625\u062b\u0001\u0000\u0000\u0000\u0626\u0627\n\u0002\u0000\u0000\u0627"+
		"\u0628\u0007\u0001\u0000\u0000\u0628\u062a\u0003\u0112\u0089\u0000\u0629"+
		"\u0626\u0001\u0000\u0000\u0000\u062a\u062d\u0001\u0000\u0000\u0000\u062b"+
		"\u0629\u0001\u0000\u0000\u0000\u062b\u062c\u0001\u0000\u0000\u0000\u062c"+
		"\u0111\u0001\u0000\u0000\u0000\u062d\u062b\u0001\u0000\u0000\u0000\u062e"+
		"\u062f\u0006\u0089\uffff\uffff\u0000\u062f\u0630\u0003\u0114\u008a\u0000"+
		"\u0630\u0636\u0001\u0000\u0000\u0000\u0631\u0632\n\u0002\u0000\u0000\u0632"+
		"\u0633\u0007\u0003\u0000\u0000\u0633\u0635\u0003\u0114\u008a\u0000\u0634"+
		"\u0631\u0001\u0000\u0000\u0000\u0635\u0638\u0001\u0000\u0000\u0000\u0636"+
		"\u0634\u0001\u0000\u0000\u0000\u0636\u0637\u0001\u0000\u0000\u0000\u0637"+
		"\u0113\u0001\u0000\u0000\u0000\u0638\u0636\u0001\u0000\u0000\u0000\u0639"+
		"\u063a\u0005\u0016\u0000\u0000\u063a\u0641\u0003\u0114\u008a\u0000\u063b"+
		"\u063c\u0005\u0017\u0000\u0000\u063c\u0641\u0003\u0114\u008a\u0000\u063d"+
		"\u063e\u0005$\u0000\u0000\u063e\u0641\u0003\u0114\u008a\u0000\u063f\u0641"+
		"\u0003\u0116\u008b\u0000\u0640\u0639\u0001\u0000\u0000\u0000\u0640\u063b"+
		"\u0001\u0000\u0000\u0000\u0640\u063d\u0001\u0000\u0000\u0000\u0640\u063f"+
		"\u0001\u0000\u0000\u0000\u0641\u0115\u0001\u0000\u0000\u0000\u0642\u0645"+
		"\u0003\u0118\u008c\u0000\u0643\u0644\u0005(\u0000\u0000\u0644\u0646\u0003"+
		"\u0114\u008a\u0000\u0645\u0643\u0001\u0000\u0000\u0000\u0645\u0646\u0001"+
		"\u0000\u0000\u0000\u0646\u0117\u0001\u0000\u0000\u0000\u0647\u0648\u0005"+
		"=\u0000\u0000\u0648\u064b\u0003\u011a\u008d\u0000\u0649\u064b\u0003\u011a"+
		"\u008d\u0000\u064a\u0647\u0001\u0000\u0000\u0000\u064a\u0649\u0001\u0000"+
		"\u0000\u0000\u064b\u0119\u0001\u0000\u0000\u0000\u064c\u064d\u0006\u008d"+
		"\uffff\uffff\u0000\u064d\u064e\u0003\u0120\u0090\u0000\u064e\u0660\u0001"+
		"\u0000\u0000\u0000\u064f\u065c\n\u0002\u0000\u0000\u0650\u0651\u0005\u0012"+
		"\u0000\u0000\u0651\u065d\u0003\u0198\u00cc\u0000\u0652\u065d\u0003\u016a"+
		"\u00b5\u0000\u0653\u0655\u0005\f\u0000\u0000\u0654\u0656\u0003\u016e\u00b7"+
		"\u0000\u0655\u0654\u0001\u0000\u0000\u0000\u0655\u0656\u0001\u0000\u0000"+
		"\u0000\u0656\u0657\u0001\u0000\u0000\u0000\u0657\u065d\u0005\u000f\u0000"+
		"\u0000\u0658\u0659\u0005\r\u0000\u0000\u0659\u065a\u0003\u011c\u008e\u0000"+
		"\u065a\u065b\u0005\u0010\u0000\u0000\u065b\u065d\u0001\u0000\u0000\u0000"+
		"\u065c\u0650\u0001\u0000\u0000\u0000\u065c\u0652\u0001\u0000\u0000\u0000"+
		"\u065c\u0653\u0001\u0000\u0000\u0000\u065c\u0658\u0001\u0000\u0000\u0000"+
		"\u065d\u065f\u0001\u0000\u0000\u0000\u065e\u064f\u0001\u0000\u0000\u0000"+
		"\u065f\u0662\u0001\u0000\u0000\u0000\u0660\u065e\u0001\u0000\u0000\u0000"+
		"\u0660\u0661\u0001\u0000\u0000\u0000\u0661\u011b\u0001\u0000\u0000\u0000"+
		"\u0662\u0660\u0001\u0000\u0000\u0000\u0663\u0676\u0003\u011e\u008f\u0000"+
		"\u0664\u0667\u0003\u011e\u008f\u0000\u0665\u0667\u0003\u0174\u00ba\u0000"+
		"\u0666\u0664\u0001\u0000\u0000\u0000\u0666\u0665\u0001\u0000\u0000\u0000"+
		"\u0667\u066f\u0001\u0000\u0000\u0000\u0668\u066b\u0005\u0014\u0000\u0000"+
		"\u0669\u066c\u0003\u011e\u008f\u0000\u066a\u066c\u0003\u0174\u00ba\u0000"+
		"\u066b\u0669\u0001\u0000\u0000\u0000\u066b\u066a\u0001\u0000\u0000\u0000"+
		"\u066c\u066e\u0001\u0000\u0000\u0000\u066d\u0668\u0001\u0000\u0000\u0000"+
		"\u066e\u0671\u0001\u0000\u0000\u0000\u066f\u066d\u0001\u0000\u0000\u0000"+
		"\u066f\u0670\u0001\u0000\u0000\u0000\u0670\u0673\u0001\u0000\u0000\u0000"+
		"\u0671\u066f\u0001\u0000\u0000\u0000\u0672\u0674\u0005\u0014\u0000\u0000"+
		"\u0673\u0672\u0001\u0000\u0000\u0000\u0673\u0674\u0001\u0000\u0000\u0000"+
		"\u0674\u0676\u0001\u0000\u0000\u0000\u0675\u0663\u0001\u0000\u0000\u0000"+
		"\u0675\u0666\u0001\u0000\u0000\u0000\u0676\u011d\u0001\u0000\u0000\u0000"+
		"\u0677\u0679\u0003\u00dam\u0000\u0678\u0677\u0001\u0000\u0000\u0000\u0678"+
		"\u0679\u0001\u0000\u0000\u0000\u0679\u067a\u0001\u0000\u0000\u0000\u067a"+
		"\u067c\u0005\u0013\u0000\u0000\u067b\u067d\u0003\u00dam\u0000\u067c\u067b"+
		"\u0001\u0000\u0000\u0000\u067c\u067d\u0001\u0000\u0000\u0000\u067d\u0682"+
		"\u0001\u0000\u0000\u0000\u067e\u0680\u0005\u0013\u0000\u0000\u067f\u0681"+
		"\u0003\u00dam\u0000\u0680\u067f\u0001\u0000\u0000\u0000\u0680\u0681\u0001"+
		"\u0000\u0000\u0000\u0681\u0683\u0001\u0000\u0000\u0000\u0682\u067e\u0001"+
		"\u0000\u0000\u0000\u0682\u0683\u0001\u0000\u0000\u0000\u0683\u0686\u0001"+
		"\u0000\u0000\u0000\u0684\u0686\u0003\u00e8t\u0000\u0685\u0678\u0001\u0000"+
		"\u0000\u0000\u0685\u0684\u0001\u0000\u0000\u0000\u0686\u011f\u0001\u0000"+
		"\u0000\u0000\u0687\u069e\u0003\u0198\u00cc\u0000\u0688\u069e\u0005F\u0000"+
		"\u0000\u0689\u069e\u0005<\u0000\u0000\u068a\u069e\u0005A\u0000\u0000\u068b"+
		"\u069e\u0003\u0152\u00a9\u0000\u068c\u069e\u0005d\u0000\u0000\u068d\u0691"+
		"\u0003\u0156\u00ab\u0000\u068e\u0691\u0003\u0122\u0091\u0000\u068f\u0691"+
		"\u0003\u016a\u00b5\u0000\u0690\u068d\u0001\u0000\u0000\u0000\u0690\u068e"+
		"\u0001\u0000\u0000\u0000\u0690\u068f\u0001\u0000\u0000\u0000\u0691\u069e"+
		"\u0001\u0000\u0000\u0000\u0692\u0695\u0003\u0154\u00aa\u0000\u0693\u0695"+
		"\u0003\u0166\u00b3\u0000\u0694\u0692\u0001\u0000\u0000\u0000\u0694\u0693"+
		"\u0001\u0000\u0000\u0000\u0695\u069e\u0001\u0000\u0000\u0000\u0696\u069b"+
		"\u0003\u015a\u00ad\u0000\u0697\u069b\u0003\u0158\u00ac\u0000\u0698\u069b"+
		"\u0003\u016c\u00b6\u0000\u0699\u069b\u0003\u0168\u00b4\u0000\u069a\u0696"+
		"\u0001\u0000\u0000\u0000\u069a\u0697\u0001\u0000\u0000\u0000\u069a\u0698"+
		"\u0001\u0000\u0000\u0000\u069a\u0699\u0001\u0000\u0000\u0000\u069b\u069e"+
		"\u0001\u0000\u0000\u0000\u069c\u069e\u00059\u0000\u0000\u069d\u0687\u0001"+
		"\u0000\u0000\u0000\u069d\u0688\u0001\u0000\u0000\u0000\u069d\u0689\u0001"+
		"\u0000\u0000\u0000\u069d\u068a\u0001\u0000\u0000\u0000\u069d\u068b\u0001"+
		"\u0000\u0000\u0000\u069d\u068c\u0001\u0000\u0000\u0000\u069d\u0690\u0001"+
		"\u0000\u0000\u0000\u069d\u0694\u0001\u0000\u0000\u0000\u069d\u069a\u0001"+
		"\u0000\u0000\u0000\u069d\u069c\u0001\u0000\u0000\u0000\u069e\u0121\u0001"+
		"\u0000\u0000\u0000\u069f\u06a2\u0005\f\u0000\u0000\u06a0\u06a3\u0003\u00dc"+
		"n\u0000\u06a1\u06a3\u0003\u00e8t\u0000\u06a2\u06a0\u0001\u0000\u0000\u0000"+
		"\u06a2\u06a1\u0001\u0000\u0000\u0000\u06a3\u06a4\u0001\u0000\u0000\u0000"+
		"\u06a4\u06a5\u0005\u000f\u0000\u0000\u06a5\u0123\u0001\u0000\u0000\u0000"+
		"\u06a6\u06a8\u0005N\u0000\u0000\u06a7\u06a9\u0003\u0126\u0093\u0000\u06a8"+
		"\u06a7\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9"+
		"\u06aa\u0001\u0000\u0000\u0000\u06aa\u06ab\u0005\u0013\u0000\u0000\u06ab"+
		"\u06ac\u0003\u00dam\u0000\u06ac\u0125\u0001\u0000\u0000\u0000\u06ad\u06ae"+
		"\u0003\u0128\u0094\u0000\u06ae\u0127\u0001\u0000\u0000\u0000\u06af\u06b3"+
		"\u0003\u012a\u0095\u0000\u06b0\u06b2\u0003\u0132\u0099\u0000\u06b1\u06b0"+
		"\u0001\u0000\u0000\u0000\u06b2\u06b5\u0001\u0000\u0000\u0000\u06b3\u06b1"+
		"\u0001\u0000\u0000\u0000\u06b3\u06b4\u0001\u0000\u0000\u0000\u06b4\u06b9"+
		"\u0001\u0000\u0000\u0000\u06b5\u06b3\u0001\u0000\u0000\u0000\u06b6\u06b8"+
		"\u0003\u0134\u009a\u0000\u06b7\u06b6\u0001\u0000\u0000\u0000\u06b8\u06bb"+
		"\u0001\u0000\u0000\u0000\u06b9\u06b7\u0001\u0000\u0000\u0000\u06b9\u06ba"+
		"\u0001\u0000\u0000\u0000\u06ba\u06bd\u0001\u0000\u0000\u0000\u06bb\u06b9"+
		"\u0001\u0000\u0000\u0000\u06bc\u06be\u0003\u012e\u0097\u0000\u06bd\u06bc"+
		"\u0001\u0000\u0000\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be\u06e1"+
		"\u0001\u0000\u0000\u0000\u06bf\u06c3\u0003\u012c\u0096\u0000\u06c0\u06c2"+
		"\u0003\u0134\u009a\u0000\u06c1\u06c0\u0001\u0000\u0000\u0000\u06c2\u06c5"+
		"\u0001\u0000\u0000\u0000\u06c3\u06c1\u0001\u0000\u0000\u0000\u06c3\u06c4"+
		"\u0001\u0000\u0000\u0000\u06c4\u06c7\u0001\u0000\u0000\u0000\u06c5\u06c3"+
		"\u0001\u0000\u0000\u0000\u06c6\u06c8\u0003\u012e\u0097\u0000\u06c7\u06c6"+
		"\u0001\u0000\u0000\u0000\u06c7\u06c8\u0001\u0000\u0000\u0000\u06c8\u06e1"+
		"\u0001\u0000\u0000\u0000\u06c9\u06cb\u0003\u0132\u0099\u0000\u06ca\u06c9"+
		"\u0001\u0000\u0000\u0000\u06cb\u06cc\u0001\u0000\u0000\u0000\u06cc\u06ca"+
		"\u0001\u0000\u0000\u0000\u06cc\u06cd\u0001\u0000\u0000\u0000\u06cd\u06d1"+
		"\u0001\u0000\u0000\u0000\u06ce\u06d0\u0003\u0134\u009a\u0000\u06cf\u06ce"+
		"\u0001\u0000\u0000\u0000\u06d0\u06d3\u0001\u0000\u0000\u0000\u06d1\u06cf"+
		"\u0001\u0000\u0000\u0000\u06d1\u06d2\u0001\u0000\u0000\u0000\u06d2\u06d5"+
		"\u0001\u0000\u0000\u0000\u06d3\u06d1\u0001\u0000\u0000\u0000\u06d4\u06d6"+
		"\u0003\u012e\u0097\u0000\u06d5\u06d4\u0001\u0000\u0000\u0000\u06d5\u06d6"+
		"\u0001\u0000\u0000\u0000\u06d6\u06e1\u0001\u0000\u0000\u0000\u06d7\u06d9"+
		"\u0003\u0134\u009a\u0000\u06d8\u06d7\u0001\u0000\u0000\u0000\u06d9\u06da"+
		"\u0001\u0000\u0000\u0000\u06da\u06d8\u0001\u0000\u0000\u0000\u06da\u06db"+
		"\u0001\u0000\u0000\u0000\u06db\u06dd\u0001\u0000\u0000\u0000\u06dc\u06de"+
		"\u0003\u012e\u0097\u0000\u06dd\u06dc\u0001\u0000\u0000\u0000\u06dd\u06de"+
		"\u0001\u0000\u0000\u0000\u06de\u06e1\u0001\u0000\u0000\u0000\u06df\u06e1"+
		"\u0003\u012e\u0097\u0000\u06e0\u06af\u0001\u0000\u0000\u0000\u06e0\u06bf"+
		"\u0001\u0000\u0000\u0000\u06e0\u06ca\u0001\u0000\u0000\u0000\u06e0\u06d8"+
		"\u0001\u0000\u0000\u0000\u06e0\u06df\u0001\u0000\u0000\u0000\u06e1\u0129"+
		"\u0001\u0000\u0000\u0000\u06e2\u06e4\u0003\u0132\u0099\u0000\u06e3\u06e2"+
		"\u0001\u0000\u0000\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06e3"+
		"\u0001\u0000\u0000\u0000\u06e5\u06e6\u0001\u0000\u0000\u0000\u06e6\u06e7"+
		"\u0001\u0000\u0000\u0000\u06e7\u06e9\u0005\u0019\u0000\u0000\u06e8\u06ea"+
		"\u0005\u0014\u0000\u0000\u06e9\u06e8\u0001\u0000\u0000\u0000\u06e9\u06ea"+
		"\u0001\u0000\u0000\u0000\u06ea\u012b\u0001\u0000\u0000\u0000\u06eb\u06ed"+
		"\u0003\u0132\u0099\u0000\u06ec\u06eb\u0001\u0000\u0000\u0000\u06ed\u06f0"+
		"\u0001\u0000\u0000\u0000\u06ee\u06ec\u0001\u0000\u0000\u0000\u06ee\u06ef"+
		"\u0001\u0000\u0000\u0000\u06ef\u06f2\u0001\u0000\u0000\u0000\u06f0\u06ee"+
		"\u0001\u0000\u0000\u0000\u06f1\u06f3\u0003\u0134\u009a\u0000\u06f2\u06f1"+
		"\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000\u06f4\u06f2"+
		"\u0001\u0000\u0000\u0000\u06f4\u06f5\u0001\u0000\u0000\u0000\u06f5\u06f6"+
		"\u0001\u0000\u0000\u0000\u06f6\u06f8\u0005\u0019\u0000\u0000\u06f7\u06f9"+
		"\u0005\u0014\u0000\u0000\u06f8\u06f7\u0001\u0000\u0000\u0000\u06f8\u06f9"+
		"\u0001\u0000\u0000\u0000\u06f9\u012d\u0001\u0000\u0000\u0000\u06fa\u06fb"+
		"\u0005\u0018\u0000\u0000\u06fb\u06ff\u0003\u0132\u0099\u0000\u06fc\u06fe"+
		"\u0003\u0136\u009b\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fe\u0701"+
		"\u0001\u0000\u0000\u0000\u06ff\u06fd\u0001\u0000\u0000\u0000\u06ff\u0700"+
		"\u0001\u0000\u0000\u0000\u0700\u0703\u0001\u0000\u0000\u0000\u0701\u06ff"+
		"\u0001\u0000\u0000\u0000\u0702\u0704\u0003\u0130\u0098\u0000\u0703\u0702"+
		"\u0001\u0000\u0000\u0000\u0703\u0704\u0001\u0000\u0000\u0000\u0704\u0711"+
		"\u0001\u0000\u0000\u0000\u0705\u0706\u0005\u0018\u0000\u0000\u0706\u0708"+
		"\u0005\u0014\u0000\u0000\u0707\u0709\u0003\u0136\u009b\u0000\u0708\u0707"+
		"\u0001\u0000\u0000\u0000\u0709\u070a\u0001\u0000\u0000\u0000\u070a\u0708"+
		"\u0001\u0000\u0000\u0000\u070a\u070b\u0001\u0000\u0000\u0000\u070b\u070d"+
		"\u0001\u0000\u0000\u0000\u070c\u070e\u0003\u0130\u0098\u0000\u070d\u070c"+
		"\u0001\u0000\u0000\u0000\u070d\u070e\u0001\u0000\u0000\u0000\u070e\u0711"+
		"\u0001\u0000\u0000\u0000\u070f\u0711\u0003\u0130\u0098\u0000\u0710\u06fa"+
		"\u0001\u0000\u0000\u0000\u0710\u0705\u0001\u0000\u0000\u0000\u0710\u070f"+
		"\u0001\u0000\u0000\u0000\u0711\u012f\u0001\u0000\u0000\u0000\u0712\u0713"+
		"\u0005(\u0000\u0000\u0713\u0714\u0003\u0132\u0099\u0000\u0714\u0131\u0001"+
		"\u0000\u0000\u0000\u0715\u0717\u0003\u0138\u009c\u0000\u0716\u0718\u0005"+
		"\u0014\u0000\u0000\u0717\u0716\u0001\u0000\u0000\u0000\u0717\u0718\u0001"+
		"\u0000\u0000\u0000\u0718\u0133\u0001\u0000\u0000\u0000\u0719\u071a\u0003"+
		"\u0138\u009c\u0000\u071a\u071c\u0003j5\u0000\u071b\u071d\u0005\u0014\u0000"+
		"\u0000\u071c\u071b\u0001\u0000\u0000\u0000\u071c\u071d\u0001\u0000\u0000"+
		"\u0000\u071d\u0135\u0001\u0000\u0000\u0000\u071e\u0720\u0003\u0138\u009c"+
		"\u0000\u071f\u0721\u0003j5\u0000\u0720\u071f\u0001\u0000\u0000\u0000\u0720"+
		"\u0721\u0001\u0000\u0000\u0000\u0721\u0723\u0001\u0000\u0000\u0000\u0722"+
		"\u0724\u0005\u0014\u0000\u0000\u0723\u0722\u0001\u0000\u0000\u0000\u0723"+
		"\u0724\u0001\u0000\u0000\u0000\u0724\u0137\u0001\u0000\u0000\u0000\u0725"+
		"\u0726\u0003\u0198\u00cc\u0000\u0726\u0139\u0001\u0000\u0000\u0000\u0727"+
		"\u072a\u0003\u013c\u009e\u0000\u0728\u072a\u0005\u0006\u0000\u0000\u0729"+
		"\u0727\u0001\u0000\u0000\u0000\u0729\u0728\u0001\u0000\u0000\u0000\u072a"+
		"\u013b\u0001\u0000\u0000\u0000\u072b\u072c\u0005\u000e\u0000\u0000\u072c"+
		"\u072e\u0003\u0018\f\u0000\u072d\u072f\u0005\u001e\u0000\u0000\u072e\u072d"+
		"\u0001\u0000\u0000\u0000\u072e\u072f\u0001\u0000\u0000\u0000\u072f\u0731"+
		"\u0001\u0000\u0000\u0000\u0730\u0732\u0003\u013e\u009f\u0000\u0731\u0730"+
		"\u0001\u0000\u0000\u0000\u0731\u0732\u0001\u0000\u0000\u0000\u0732\u0734"+
		"\u0001\u0000\u0000\u0000\u0733\u0735\u0003\u0140\u00a0\u0000\u0734\u0733"+
		"\u0001\u0000\u0000\u0000\u0734\u0735\u0001\u0000\u0000\u0000\u0735\u0736"+
		"\u0001\u0000\u0000\u0000\u0736\u0737\u0005\u0011\u0000\u0000\u0737\u013d"+
		"\u0001\u0000\u0000\u0000\u0738\u0739\u0005;\u0000\u0000\u0739\u073a\u0003"+
		"\u0198\u00cc\u0000\u073a\u013f\u0001\u0000\u0000\u0000\u073b\u073f\u0005"+
		"\u0013\u0000\u0000\u073c\u073e\u0003\u0142\u00a1\u0000\u073d\u073c\u0001"+
		"\u0000\u0000\u0000\u073e\u0741\u0001\u0000\u0000\u0000\u073f\u073d\u0001"+
		"\u0000\u0000\u0000\u073f\u0740\u0001\u0000\u0000\u0000\u0740\u0141\u0001"+
		"\u0000\u0000\u0000\u0741\u073f\u0001\u0000\u0000\u0000\u0742\u0745\u0005"+
		"\u0006\u0000\u0000\u0743\u0745\u0003\u013c\u009e\u0000\u0744\u0742\u0001"+
		"\u0000\u0000\u0000\u0744\u0743\u0001\u0000\u0000\u0000\u0745\u0143\u0001"+
		"\u0000\u0000\u0000\u0746\u074a\u0005\u0005\u0000\u0000\u0747\u0749\u0003"+
		"\u013a\u009d\u0000\u0748\u0747\u0001\u0000\u0000\u0000\u0749\u074c\u0001"+
		"\u0000\u0000\u0000\u074a\u0748\u0001\u0000\u0000\u0000\u074a\u074b\u0001"+
		"\u0000\u0000\u0000\u074b\u074d\u0001\u0000\u0000\u0000\u074c\u074a\u0001"+
		"\u0000\u0000\u0000\u074d\u074e\u0005\u0007\u0000\u0000\u074e\u0145\u0001"+
		"\u0000\u0000\u0000\u074f\u0752\u0005\t\u0000\u0000\u0750\u0752\u0003\u014a"+
		"\u00a5\u0000\u0751\u074f\u0001\u0000\u0000\u0000\u0751\u0750\u0001\u0000"+
		"\u0000\u0000\u0752\u0147\u0001\u0000\u0000\u0000\u0753\u0757\u0005\u0013"+
		"\u0000\u0000\u0754\u0756\u0003\u0146\u00a3\u0000\u0755\u0754\u0001\u0000"+
		"\u0000\u0000\u0756\u0759\u0001\u0000\u0000\u0000\u0757\u0755\u0001\u0000"+
		"\u0000\u0000\u0757\u0758\u0001\u0000\u0000\u0000\u0758\u0149\u0001\u0000"+
		"\u0000\u0000\u0759\u0757\u0001\u0000\u0000\u0000\u075a\u075b\u0005\u000e"+
		"\u0000\u0000\u075b\u075d\u0003\u0018\f\u0000\u075c\u075e\u0005\u001e\u0000"+
		"\u0000\u075d\u075c\u0001\u0000\u0000\u0000\u075d\u075e\u0001\u0000\u0000"+
		"\u0000\u075e\u0760\u0001\u0000\u0000\u0000\u075f\u0761\u0003\u013e\u009f"+
		"\u0000\u0760\u075f\u0001\u0000\u0000\u0000\u0760\u0761\u0001\u0000\u0000"+
		"\u0000\u0761\u0763\u0001\u0000\u0000\u0000\u0762\u0764\u0003\u0148\u00a4"+
		"\u0000\u0763\u0762\u0001\u0000\u0000\u0000\u0763\u0764\u0001\u0000\u0000"+
		"\u0000\u0764\u0765\u0001\u0000\u0000\u0000\u0765\u0766\u0005\u0011\u0000"+
		"\u0000\u0766\u014b\u0001\u0000\u0000\u0000\u0767\u076a\u0003\u014a\u00a5"+
		"\u0000\u0768\u076a\u0005\t\u0000\u0000\u0769\u0767\u0001\u0000\u0000\u0000"+
		"\u0769\u0768\u0001\u0000\u0000\u0000\u076a\u014d\u0001\u0000\u0000\u0000"+
		"\u076b\u076f\u0005\b\u0000\u0000\u076c\u076e\u0003\u014c\u00a6\u0000\u076d"+
		"\u076c\u0001\u0000\u0000\u0000\u076e\u0771\u0001\u0000\u0000\u0000\u076f"+
		"\u076d\u0001\u0000\u0000\u0000\u076f\u0770\u0001\u0000\u0000\u0000\u0770"+
		"\u0772\u0001\u0000\u0000\u0000\u0771\u076f\u0001\u0000\u0000\u0000\u0772"+
		"\u0773\u0005\n\u0000\u0000\u0773\u014f\u0001\u0000\u0000\u0000\u0774\u0775"+
		"\u0005e\u0000\u0000\u0775\u0151\u0001\u0000\u0000\u0000\u0776\u0779\u0003"+
		"\u0144\u00a2\u0000\u0777\u0779\u0003\u0150\u00a8\u0000\u0778\u0776\u0001"+
		"\u0000\u0000\u0000\u0778\u0777\u0001\u0000\u0000\u0000\u0779\u077a\u0001"+
		"\u0000\u0000\u0000\u077a\u0778\u0001\u0000\u0000\u0000\u077a\u077b\u0001"+
		"\u0000\u0000\u0000\u077b\u0782\u0001\u0000\u0000\u0000\u077c\u077e\u0003"+
		"\u014e\u00a7\u0000\u077d\u077c\u0001\u0000\u0000\u0000\u077e\u077f\u0001"+
		"\u0000\u0000\u0000\u077f\u077d\u0001\u0000\u0000\u0000\u077f\u0780\u0001"+
		"\u0000\u0000\u0000\u0780\u0782\u0001\u0000\u0000\u0000\u0781\u0778\u0001"+
		"\u0000\u0000\u0000\u0781\u077d\u0001\u0000\u0000\u0000\u0782\u0153\u0001"+
		"\u0000\u0000\u0000\u0783\u0785\u0005\r\u0000\u0000\u0784\u0786\u0003\u00e2"+
		"q\u0000\u0785\u0784\u0001\u0000\u0000\u0000\u0785\u0786\u0001\u0000\u0000"+
		"\u0000\u0786\u0787\u0001\u0000\u0000\u0000\u0787\u0788\u0005\u0010\u0000"+
		"\u0000\u0788\u0155\u0001\u0000\u0000\u0000\u0789\u078f\u0005\f\u0000\u0000"+
		"\u078a\u078b\u0003\u00e4r\u0000\u078b\u078d\u0005\u0014\u0000\u0000\u078c"+
		"\u078e\u0003\u00e2q\u0000\u078d\u078c\u0001\u0000\u0000\u0000\u078d\u078e"+
		"\u0001\u0000\u0000\u0000\u078e\u0790\u0001\u0000\u0000\u0000\u078f\u078a"+
		"\u0001\u0000\u0000\u0000\u078f\u0790\u0001\u0000\u0000\u0000\u0790\u0791"+
		"\u0001\u0000\u0000\u0000\u0791\u0792\u0005\u000f\u0000\u0000\u0792\u0157"+
		"\u0001\u0000\u0000\u0000\u0793\u0794\u0005\u000e\u0000\u0000\u0794\u0795"+
		"\u0003\u00e2q\u0000\u0795\u0796\u0005\u0011\u0000\u0000\u0796\u0159\u0001"+
		"\u0000\u0000\u0000\u0797\u0799\u0005\u000e\u0000\u0000\u0798\u079a\u0003"+
		"\u015c\u00ae\u0000\u0799\u0798\u0001\u0000\u0000\u0000\u0799\u079a\u0001"+
		"\u0000\u0000\u0000\u079a\u079b\u0001\u0000\u0000\u0000\u079b\u079c\u0005"+
		"\u0011\u0000\u0000\u079c\u015b\u0001\u0000\u0000\u0000\u079d\u07a2\u0003"+
		"\u015e\u00af\u0000\u079e\u079f\u0005\u0014\u0000\u0000\u079f\u07a1\u0003"+
		"\u015e\u00af\u0000\u07a0\u079e\u0001\u0000\u0000\u0000\u07a1\u07a4\u0001"+
		"\u0000\u0000\u0000\u07a2\u07a0\u0001\u0000\u0000\u0000\u07a2\u07a3\u0001"+
		"\u0000\u0000\u0000\u07a3\u07a6\u0001\u0000\u0000\u0000\u07a4\u07a2\u0001"+
		"\u0000\u0000\u0000\u07a5\u07a7\u0005\u0014\u0000\u0000\u07a6\u07a5\u0001"+
		"\u0000\u0000\u0000\u07a6\u07a7\u0001\u0000\u0000\u0000\u07a7\u015d\u0001"+
		"\u0000\u0000\u0000\u07a8\u07a9\u0005(\u0000\u0000\u07a9\u07ac\u0003\u0108"+
		"\u0084\u0000\u07aa\u07ac\u0003\u0160\u00b0\u0000\u07ab\u07a8\u0001\u0000"+
		"\u0000\u0000\u07ab\u07aa\u0001\u0000\u0000\u0000\u07ac\u015f\u0001\u0000"+
		"\u0000\u0000\u07ad\u07ae\u0003\u00dam\u0000\u07ae\u07af\u0005\u0013\u0000"+
		"\u0000\u07af\u07b0\u0003\u00dam\u0000\u07b0\u0161\u0001\u0000\u0000\u0000"+
		"\u07b1\u07b3\u0003\u0164\u00b2\u0000\u07b2\u07b1\u0001\u0000\u0000\u0000"+
		"\u07b3\u07b4\u0001\u0000\u0000\u0000\u07b4\u07b2\u0001\u0000\u0000\u0000"+
		"\u07b4\u07b5\u0001\u0000\u0000\u0000\u07b5\u0163\u0001\u0000\u0000\u0000"+
		"\u07b6\u07b8\u0005Z\u0000\u0000\u07b7\u07b6\u0001\u0000\u0000\u0000\u07b7"+
		"\u07b8\u0001\u0000\u0000\u0000\u07b8\u07b9\u0001\u0000\u0000\u0000\u07b9"+
		"\u07ba\u0005M\u0000\u0000\u07ba\u07bb\u0003\u017a\u00bd\u0000\u07bb\u07bc"+
		"\u0005D\u0000\u0000\u07bc\u07c1\u0003\u00eau\u0000\u07bd\u07be\u0005\\"+
		"\u0000\u0000\u07be\u07c0\u0003\u00eau\u0000\u07bf\u07bd\u0001\u0000\u0000"+
		"\u0000\u07c0\u07c3\u0001\u0000\u0000\u0000\u07c1\u07bf\u0001\u0000\u0000"+
		"\u0000\u07c1\u07c2\u0001\u0000\u0000\u0000\u07c2\u0165\u0001\u0000\u0000"+
		"\u0000\u07c3\u07c1\u0001\u0000\u0000\u0000\u07c4\u07c5\u0005\r\u0000\u0000"+
		"\u07c5\u07c6\u0003\u00e8t\u0000\u07c6\u07c7\u0003\u0162\u00b1\u0000\u07c7"+
		"\u07c8\u0005\u0010\u0000\u0000\u07c8\u0167\u0001\u0000\u0000\u0000\u07c9"+
		"\u07ca\u0005\u000e\u0000\u0000\u07ca\u07cb\u0003\u00e8t\u0000\u07cb\u07cc"+
		"\u0003\u0162\u00b1\u0000\u07cc\u07cd\u0005\u0011\u0000\u0000\u07cd\u0169"+
		"\u0001\u0000\u0000\u0000\u07ce\u07d1\u0005\f\u0000\u0000\u07cf\u07d2\u0003"+
		"\u00e6s\u0000\u07d0\u07d2\u0003\u00dam\u0000\u07d1\u07cf\u0001\u0000\u0000"+
		"\u0000\u07d1\u07d0\u0001\u0000\u0000\u0000\u07d2\u07d3\u0001\u0000\u0000"+
		"\u0000\u07d3\u07d4\u0003\u0162\u00b1\u0000\u07d4\u07d5\u0005\u000f\u0000"+
		"\u0000\u07d5\u016b\u0001\u0000\u0000\u0000\u07d6\u07d7\u0005\u000e\u0000"+
		"\u0000\u07d7\u07d8\u0003\u0160\u00b0\u0000\u07d8\u07d9\u0003\u0162\u00b1"+
		"\u0000\u07d9\u07da\u0005\u0011\u0000\u0000\u07da\u016d\u0001\u0000\u0000"+
		"\u0000\u07db\u07dd\u0003\u0170\u00b8\u0000\u07dc\u07de\u0005\u0014\u0000"+
		"\u0000\u07dd\u07dc\u0001\u0000\u0000\u0000\u07dd\u07de\u0001\u0000\u0000"+
		"\u0000\u07de\u016f\u0001\u0000\u0000\u0000\u07df\u07e5\u0003\u0174\u00ba"+
		"\u0000\u07e0\u07e3\u0003\u00e6s\u0000\u07e1\u07e3\u0003\u00dam\u0000\u07e2"+
		"\u07e0\u0001\u0000\u0000\u0000\u07e2\u07e1\u0001\u0000\u0000\u0000\u07e3"+
		"\u07e5\u0001\u0000\u0000\u0000\u07e4\u07df\u0001\u0000\u0000\u0000\u07e4"+
		"\u07e2\u0001\u0000\u0000\u0000\u07e5\u07f0\u0001\u0000\u0000\u0000\u07e6"+
		"\u07ec\u0005\u0014\u0000\u0000\u07e7\u07ed\u0003\u0174\u00ba\u0000\u07e8"+
		"\u07eb\u0003\u00e6s\u0000\u07e9\u07eb\u0003\u00dam\u0000\u07ea\u07e8\u0001"+
		"\u0000\u0000\u0000\u07ea\u07e9\u0001\u0000\u0000\u0000\u07eb\u07ed\u0001"+
		"\u0000\u0000\u0000\u07ec\u07e7\u0001\u0000\u0000\u0000\u07ec\u07ea\u0001"+
		"\u0000\u0000\u0000\u07ed\u07ef\u0001\u0000\u0000\u0000\u07ee\u07e6\u0001"+
		"\u0000\u0000\u0000\u07ef\u07f2\u0001\u0000\u0000\u0000\u07f0\u07ee\u0001"+
		"\u0000\u0000\u0000\u07f0\u07f1\u0001\u0000\u0000\u0000\u07f1\u07f5\u0001"+
		"\u0000\u0000\u0000\u07f2\u07f0\u0001\u0000\u0000\u0000\u07f3\u07f4\u0005"+
		"\u0014\u0000\u0000\u07f4\u07f6\u0003\u0172\u00b9\u0000\u07f5\u07f3\u0001"+
		"\u0000\u0000\u0000\u07f5\u07f6\u0001\u0000\u0000\u0000\u07f6\u07f9\u0001"+
		"\u0000\u0000\u0000\u07f7\u07f9\u0003\u0172\u00b9\u0000\u07f8\u07e4\u0001"+
		"\u0000\u0000\u0000\u07f8\u07f7\u0001\u0000\u0000\u0000\u07f9\u0171\u0001"+
		"\u0000\u0000\u0000\u07fa\u07ff\u0003\u0176\u00bb\u0000\u07fb\u07fc\u0005"+
		"\u0014\u0000\u0000\u07fc\u07fe\u0003\u0176\u00bb\u0000\u07fd\u07fb\u0001"+
		"\u0000\u0000\u0000\u07fe\u0801\u0001\u0000\u0000\u0000\u07ff\u07fd\u0001"+
		"\u0000\u0000\u0000\u07ff\u0800\u0001\u0000\u0000\u0000\u0800\u080b\u0001"+
		"\u0000\u0000\u0000\u0801\u07ff\u0001\u0000\u0000\u0000\u0802\u0803\u0005"+
		"\u0014\u0000\u0000\u0803\u0808\u0003\u0178\u00bc\u0000\u0804\u0805\u0005"+
		"\u0014\u0000\u0000\u0805\u0807\u0003\u0178\u00bc\u0000\u0806\u0804\u0001"+
		"\u0000\u0000\u0000\u0807\u080a\u0001\u0000\u0000\u0000\u0808\u0806\u0001"+
		"\u0000\u0000\u0000\u0808\u0809\u0001\u0000\u0000\u0000\u0809\u080c\u0001"+
		"\u0000\u0000\u0000\u080a\u0808\u0001\u0000\u0000\u0000\u080b\u0802\u0001"+
		"\u0000\u0000\u0000\u080b\u080c\u0001\u0000\u0000\u0000\u080c\u0816\u0001"+
		"\u0000\u0000\u0000\u080d\u0812\u0003\u0178\u00bc\u0000\u080e\u080f\u0005"+
		"\u0014\u0000\u0000\u080f\u0811\u0003\u0178\u00bc\u0000\u0810\u080e\u0001"+
		"\u0000\u0000\u0000\u0811\u0814\u0001\u0000\u0000\u0000\u0812\u0810\u0001"+
		"\u0000\u0000\u0000\u0812\u0813\u0001\u0000\u0000\u0000\u0813\u0816\u0001"+
		"\u0000\u0000\u0000\u0814\u0812\u0001\u0000\u0000\u0000\u0815\u07fa\u0001"+
		"\u0000\u0000\u0000\u0815\u080d\u0001\u0000\u0000\u0000\u0816\u0173\u0001"+
		"\u0000\u0000\u0000\u0817\u0818\u0005\u0018\u0000\u0000\u0818\u0819\u0003"+
		"\u00dam\u0000\u0819\u0175\u0001\u0000\u0000\u0000\u081a\u081b\u0003\u0198"+
		"\u00cc\u0000\u081b\u081c\u0005\u001e\u0000\u0000\u081c\u081d\u0003\u00da"+
		"m\u0000\u081d\u0820\u0001\u0000\u0000\u0000\u081e\u0820\u0003\u0174\u00ba"+
		"\u0000\u081f\u081a\u0001\u0000\u0000\u0000\u081f\u081e\u0001\u0000\u0000"+
		"\u0000\u0820\u0177\u0001\u0000\u0000\u0000\u0821\u0822\u0003\u0198\u00cc"+
		"\u0000\u0822\u0823\u0005\u001e\u0000\u0000\u0823\u0824\u0003\u00dam\u0000"+
		"\u0824\u0828\u0001\u0000\u0000\u0000\u0825\u0826\u0005(\u0000\u0000\u0826"+
		"\u0828\u0003\u00dam\u0000\u0827\u0821\u0001\u0000\u0000\u0000\u0827\u0825"+
		"\u0001\u0000\u0000\u0000\u0828\u0179\u0001\u0000\u0000\u0000\u0829\u082e"+
		"\u0003\u0180\u00c0\u0000\u082a\u082b\u0005\u0014\u0000\u0000\u082b\u082d"+
		"\u0003\u0180\u00c0\u0000\u082c\u082a\u0001\u0000\u0000\u0000\u082d\u0830"+
		"\u0001\u0000\u0000\u0000\u082e\u082c\u0001\u0000\u0000\u0000\u082e\u082f"+
		"\u0001\u0000\u0000\u0000\u082f\u0832\u0001\u0000\u0000\u0000\u0830\u082e"+
		"\u0001\u0000\u0000\u0000\u0831\u0833\u0005\u0014\u0000\u0000\u0832\u0831"+
		"\u0001\u0000\u0000\u0000\u0832\u0833\u0001\u0000\u0000\u0000\u0833\u017b"+
		"\u0001\u0000\u0000\u0000\u0834\u0839\u0003\u0180\u00c0\u0000\u0835\u0836"+
		"\u0005\u0014\u0000\u0000\u0836\u0838\u0003\u0180\u00c0\u0000\u0837\u0835"+
		"\u0001\u0000\u0000\u0000\u0838\u083b\u0001\u0000\u0000\u0000\u0839\u0837"+
		"\u0001\u0000\u0000\u0000\u0839\u083a\u0001\u0000\u0000\u0000\u083a\u083d"+
		"\u0001\u0000\u0000\u0000\u083b\u0839\u0001\u0000\u0000\u0000\u083c\u083e"+
		"\u0005\u0014\u0000\u0000\u083d\u083c\u0001\u0000\u0000\u0000\u083d\u083e"+
		"\u0001\u0000\u0000\u0000\u083e\u017d\u0001\u0000\u0000\u0000\u083f\u084a"+
		"\u0003\u0180\u00c0\u0000\u0840\u084b\u0005\u0014\u0000\u0000\u0841\u0842"+
		"\u0005\u0014\u0000\u0000\u0842\u0844\u0003\u0180\u00c0\u0000\u0843\u0841"+
		"\u0001\u0000\u0000\u0000\u0844\u0845\u0001\u0000\u0000\u0000\u0845\u0843"+
		"\u0001\u0000\u0000\u0000\u0845\u0846\u0001\u0000\u0000\u0000\u0846\u0848"+
		"\u0001\u0000\u0000\u0000\u0847\u0849\u0005\u0014\u0000\u0000\u0848\u0847"+
		"\u0001\u0000\u0000\u0000\u0848\u0849\u0001\u0000\u0000\u0000\u0849\u084b"+
		"\u0001\u0000\u0000\u0000\u084a\u0840\u0001\u0000\u0000\u0000\u084a\u0843"+
		"\u0001\u0000\u0000\u0000\u084b\u017f\u0001\u0000\u0000\u0000\u084c\u084d"+
		"\u0005\u0018\u0000\u0000\u084d\u0850\u0003\u0180\u00c0\u0000\u084e\u0850"+
		"\u0003\u0182\u00c1\u0000\u084f\u084c\u0001\u0000\u0000\u0000\u084f\u084e"+
		"\u0001\u0000\u0000\u0000\u0850\u0181\u0001\u0000\u0000\u0000\u0851\u0858"+
		"\u0003\u018a\u00c5\u0000\u0852\u0853\u0005\u0012\u0000\u0000\u0853\u0859"+
		"\u0003\u0198\u00cc\u0000\u0854\u0855\u0005\r\u0000\u0000\u0855\u0856\u0003"+
		"\u011c\u008e\u0000\u0856\u0857\u0005\u0010\u0000\u0000\u0857\u0859\u0001"+
		"\u0000\u0000\u0000\u0858\u0852\u0001\u0000\u0000\u0000\u0858\u0854\u0001"+
		"\u0000\u0000\u0000\u0859\u085c\u0001\u0000\u0000\u0000\u085a\u085c\u0003"+
		"\u0184\u00c2\u0000\u085b\u0851\u0001\u0000\u0000\u0000\u085b\u085a\u0001"+
		"\u0000\u0000\u0000\u085c\u0183\u0001\u0000\u0000\u0000\u085d\u086d\u0003"+
		"\u0198\u00cc\u0000\u085e\u085f\u0005\f\u0000\u0000\u085f\u0860\u0003\u0182"+
		"\u00c1\u0000\u0860\u0861\u0005\u000f\u0000\u0000\u0861\u086d\u0001\u0000"+
		"\u0000\u0000\u0862\u0864\u0005\f\u0000\u0000\u0863\u0865\u0003\u017e\u00bf"+
		"\u0000\u0864\u0863\u0001\u0000\u0000\u0000\u0864\u0865\u0001\u0000\u0000"+
		"\u0000\u0865\u0866\u0001\u0000\u0000\u0000\u0866\u086d\u0005\u000f\u0000"+
		"\u0000\u0867\u0869\u0005\r\u0000\u0000\u0868\u086a\u0003\u017c\u00be\u0000"+
		"\u0869\u0868\u0001\u0000\u0000\u0000\u0869\u086a\u0001\u0000\u0000\u0000"+
		"\u086a\u086b\u0001\u0000\u0000\u0000\u086b\u086d\u0005\u0010\u0000\u0000"+
		"\u086c\u085d\u0001\u0000\u0000\u0000\u086c\u085e\u0001\u0000\u0000\u0000"+
		"\u086c\u0862\u0001\u0000\u0000\u0000\u086c\u0867\u0001\u0000\u0000\u0000"+
		"\u086d\u0185\u0001\u0000\u0000\u0000\u086e\u0875\u0003\u0188\u00c4\u0000"+
		"\u086f\u0875\u0003\u0198\u00cc\u0000\u0870\u0871\u0005\f\u0000\u0000\u0871"+
		"\u0872\u0003\u0186\u00c3\u0000\u0872\u0873\u0005\u000f\u0000\u0000\u0873"+
		"\u0875\u0001\u0000\u0000\u0000\u0874\u086e\u0001\u0000\u0000\u0000\u0874"+
		"\u086f\u0001\u0000\u0000\u0000\u0874\u0870\u0001\u0000\u0000\u0000\u0875"+
		"\u0187\u0001\u0000\u0000\u0000\u0876\u087d\u0003\u018a\u00c5\u0000\u0877"+
		"\u0878\u0005\u0012\u0000\u0000\u0878\u087e\u0003\u0198\u00cc\u0000\u0879"+
		"\u087a\u0005\r\u0000\u0000\u087a\u087b\u0003\u011c\u008e\u0000\u087b\u087c"+
		"\u0005\u0010\u0000\u0000\u087c\u087e\u0001\u0000\u0000\u0000\u087d\u0877"+
		"\u0001\u0000\u0000\u0000\u087d\u0879\u0001\u0000\u0000\u0000\u087e\u0189"+
		"\u0001\u0000\u0000\u0000\u087f\u0880\u0006\u00c5\uffff\uffff\u0000\u0880"+
		"\u0881\u0003\u0120\u0090\u0000\u0881\u0893\u0001\u0000\u0000\u0000\u0882"+
		"\u088f\n\u0002\u0000\u0000\u0883\u0884\u0005\u0012\u0000\u0000\u0884\u0890"+
		"\u0003\u0198\u00cc\u0000\u0885\u0886\u0005\r\u0000\u0000\u0886\u0887\u0003"+
		"\u011c\u008e\u0000\u0887\u0888\u0005\u0010\u0000\u0000\u0888\u0890\u0001"+
		"\u0000\u0000\u0000\u0889\u0890\u0003\u016a\u00b5\u0000\u088a\u088c\u0005"+
		"\f\u0000\u0000\u088b\u088d\u0003\u016e\u00b7\u0000\u088c\u088b\u0001\u0000"+
		"\u0000\u0000\u088c\u088d\u0001\u0000\u0000\u0000\u088d\u088e\u0001\u0000"+
		"\u0000\u0000\u088e\u0890\u0005\u000f\u0000\u0000\u088f\u0883\u0001\u0000"+
		"\u0000\u0000\u088f\u0885\u0001\u0000\u0000\u0000\u088f\u0889\u0001\u0000"+
		"\u0000\u0000\u088f\u088a\u0001\u0000\u0000\u0000\u0890\u0892\u0001\u0000"+
		"\u0000\u0000\u0891\u0882\u0001\u0000\u0000\u0000\u0892\u0895\u0001\u0000"+
		"\u0000\u0000\u0893\u0891\u0001\u0000\u0000\u0000\u0893\u0894\u0001\u0000"+
		"\u0000\u0000\u0894\u018b\u0001\u0000\u0000\u0000\u0895\u0893\u0001\u0000"+
		"\u0000\u0000\u0896\u089b\u0003\u018e\u00c7\u0000\u0897\u0898\u0005\u0014"+
		"\u0000\u0000\u0898\u089a\u0003\u018e\u00c7\u0000\u0899\u0897\u0001\u0000"+
		"\u0000\u0000\u089a\u089d\u0001\u0000\u0000\u0000\u089b\u0899\u0001\u0000"+
		"\u0000\u0000\u089b\u089c\u0001\u0000\u0000\u0000\u089c\u089f\u0001\u0000"+
		"\u0000\u0000\u089d\u089b\u0001\u0000\u0000\u0000\u089e\u08a0\u0005\u0014"+
		"\u0000\u0000\u089f\u089e\u0001\u0000\u0000\u0000\u089f\u08a0\u0001\u0000"+
		"\u0000\u0000\u08a0\u018d\u0001\u0000\u0000\u0000\u08a1\u08a8\u0003\u018a"+
		"\u00c5\u0000\u08a2\u08a3\u0005\u0012\u0000\u0000\u08a3\u08a9\u0003\u0198"+
		"\u00cc\u0000\u08a4\u08a5\u0005\r\u0000\u0000\u08a5\u08a6\u0003\u011c\u008e"+
		"\u0000\u08a6\u08a7\u0005\u0010\u0000\u0000\u08a7\u08a9\u0001\u0000\u0000"+
		"\u0000\u08a8\u08a2\u0001\u0000\u0000\u0000\u08a8\u08a4\u0001\u0000\u0000"+
		"\u0000\u08a9\u08ac\u0001\u0000\u0000\u0000\u08aa\u08ac\u0003\u0190\u00c8"+
		"\u0000\u08ab\u08a1\u0001\u0000\u0000\u0000\u08ab\u08aa\u0001\u0000\u0000"+
		"\u0000\u08ac\u018f\u0001\u0000\u0000\u0000\u08ad\u08bd\u0003\u0198\u00cc"+
		"\u0000\u08ae\u08af\u0005\f\u0000\u0000\u08af\u08b0\u0003\u018e\u00c7\u0000"+
		"\u08b0\u08b1\u0005\u000f\u0000\u0000\u08b1\u08bd\u0001\u0000\u0000\u0000"+
		"\u08b2\u08b4\u0005\f\u0000\u0000\u08b3\u08b5\u0003\u018c\u00c6\u0000\u08b4"+
		"\u08b3\u0001\u0000\u0000\u0000\u08b4\u08b5\u0001\u0000\u0000\u0000\u08b5"+
		"\u08b6\u0001\u0000\u0000\u0000\u08b6\u08bd\u0005\u000f\u0000\u0000\u08b7"+
		"\u08b9\u0005\r\u0000\u0000\u08b8\u08ba\u0003\u018c\u00c6\u0000\u08b9\u08b8"+
		"\u0001\u0000\u0000\u0000\u08b9\u08ba\u0001\u0000\u0000\u0000\u08ba\u08bb"+
		"\u0001\u0000\u0000\u0000\u08bb\u08bd\u0005\u0010\u0000\u0000\u08bc\u08ad"+
		"\u0001\u0000\u0000\u0000\u08bc\u08ae\u0001\u0000\u0000\u0000\u08bc\u08b2"+
		"\u0001\u0000\u0000\u0000\u08bc\u08b7\u0001\u0000\u0000\u0000\u08bd\u0191"+
		"\u0001\u0000\u0000\u0000\u08be\u08c3\u0003\u00dam\u0000\u08bf\u08c0\u0005"+
		"\u0014\u0000\u0000\u08c0\u08c2\u0003\u00dam\u0000\u08c1\u08bf\u0001\u0000"+
		"\u0000\u0000\u08c2\u08c5\u0001\u0000\u0000\u0000\u08c3\u08c1\u0001\u0000"+
		"\u0000\u0000\u08c3\u08c4\u0001\u0000\u0000\u0000\u08c4\u08d2\u0001\u0000"+
		"\u0000\u0000\u08c5\u08c3\u0001\u0000\u0000\u0000\u08c6\u08d0\u0005\u0014"+
		"\u0000\u0000\u08c7\u08c8\u0005\u0018\u0000\u0000\u08c8\u08cc\u0003\u00da"+
		"m\u0000\u08c9\u08ca\u0005\u0014\u0000\u0000\u08ca\u08cb\u0005(\u0000\u0000"+
		"\u08cb\u08cd\u0003\u00dam\u0000\u08cc\u08c9\u0001\u0000\u0000\u0000\u08cc"+
		"\u08cd\u0001\u0000\u0000\u0000\u08cd\u08d1\u0001\u0000\u0000\u0000\u08ce"+
		"\u08cf\u0005(\u0000\u0000\u08cf\u08d1\u0003\u00dam\u0000\u08d0\u08c7\u0001"+
		"\u0000\u0000\u0000\u08d0\u08ce\u0001\u0000\u0000\u0000\u08d1\u08d3\u0001"+
		"\u0000\u0000\u0000\u08d2\u08c6\u0001\u0000\u0000\u0000\u08d2\u08d3\u0001"+
		"\u0000\u0000\u0000\u08d3\u08de\u0001\u0000\u0000\u0000\u08d4\u08d5\u0005"+
		"\u0018\u0000\u0000\u08d5\u08d9\u0003\u00dam\u0000\u08d6\u08d7\u0005\u0014"+
		"\u0000\u0000\u08d7\u08d8\u0005(\u0000\u0000\u08d8\u08da\u0003\u00dam\u0000"+
		"\u08d9\u08d6\u0001\u0000\u0000\u0000\u08d9\u08da\u0001\u0000\u0000\u0000"+
		"\u08da\u08de\u0001\u0000\u0000\u0000\u08db\u08dc\u0005(\u0000\u0000\u08dc"+
		"\u08de\u0003\u00dam\u0000\u08dd\u08be\u0001\u0000\u0000\u0000\u08dd\u08d4"+
		"\u0001\u0000\u0000\u0000\u08dd\u08db\u0001\u0000\u0000\u0000\u08de\u0193"+
		"\u0001\u0000\u0000\u0000\u08df\u08e0\u0005f\u0000\u0000\u08e0\u08e3\u0005"+
		"\u0004\u0000\u0000\u08e1\u08e3\u0005\u0004\u0000\u0000\u08e2\u08df\u0001"+
		"\u0000\u0000\u0000\u08e2\u08e1\u0001\u0000\u0000\u0000\u08e3\u0195\u0001"+
		"\u0000\u0000\u0000\u08e4\u08e9\u0005c\u0000\u0000\u08e5\u08e9\u0005_\u0000"+
		"\u0000\u08e6\u08e9\u0005`\u0000\u0000\u08e7\u08e9\u0005a\u0000\u0000\u08e8"+
		"\u08e4\u0001\u0000\u0000\u0000\u08e8\u08e5\u0001\u0000\u0000\u0000\u08e8"+
		"\u08e6\u0001\u0000\u0000\u0000\u08e8\u08e7\u0001\u0000\u0000\u0000\u08e9"+
		"\u0197\u0001\u0000\u0000\u0000\u08ea\u08ed\u0005b\u0000\u0000\u08eb\u08ed"+
		"\u0003\u0196\u00cb\u0000\u08ec\u08ea\u0001\u0000\u0000\u0000\u08ec\u08eb"+
		"\u0001\u0000\u0000\u0000\u08ed\u0199\u0001\u0000\u0000\u0000\u0130\u019b"+
		"\u01a5\u01ac\u01b4\u01bc\u01c0\u01ca\u01d1\u01d5\u01e7\u01f1\u01f8\u01ff"+
		"\u0205\u020c\u0210\u0216\u021a\u0229\u022d\u0233\u0235\u0243\u024c\u0258"+
		"\u025c\u0265\u0270\u0274\u0279\u027f\u0286\u028c\u0293\u0299\u02a3\u02ac"+
		"\u02b4\u02ba\u02bf\u02c3\u02c6\u02cf\u02d4\u02d8\u02dd\u02e1\u02e9\u02ed"+
		"\u02f2\u02f6\u02fa\u0302\u0308\u030c\u0312\u0316\u031b\u0320\u0324\u0329"+
		"\u032c\u032f\u0334\u0338\u033d\u0343\u0347\u034e\u0352\u0359\u035d\u0364"+
		"\u0367\u036a\u0371\u0374\u0378\u037b\u0380\u0383\u0387\u038a\u038d\u0391"+
		"\u03a5\u03a7\u03af\u03b1\u03bc\u03bf\u03c7\u03cb\u03d4\u03d8\u03dd\u03e9"+
		"\u03ed\u03f4\u03fc\u0401\u0405\u040a\u0417\u041a\u041d\u0425\u0428\u042b"+
		"\u042d\u0433\u0436\u0440\u0443\u0454\u045b\u045e\u0463\u046d\u0471\u047c"+
		"\u0487\u048f\u0497\u049e\u04a3\u04b8\u04bf\u04c8\u04cd\u04d0\u04d5\u04dc"+
		"\u04e0\u04e4\u04ee\u04f6\u04f9\u04fd\u0504\u0509\u0516\u0519\u051c\u051e"+
		"\u0527\u052f\u0539\u0547\u054b\u054f\u0552\u0557\u055c\u055e\u056e\u0572"+
		"\u057a\u057d\u0583\u0585\u058c\u0590\u0595\u059c\u05a0\u05a5\u05ad\u05b4"+
		"\u05bc\u05c2\u05c8\u05d5\u05ff\u060a\u0615\u0620\u062b\u0636\u0640\u0645"+
		"\u064a\u0655\u065c\u0660\u0666\u066b\u066f\u0673\u0675\u0678\u067c\u0680"+
		"\u0682\u0685\u0690\u0694\u069a\u069d\u06a2\u06a8\u06b3\u06b9\u06bd\u06c3"+
		"\u06c7\u06cc\u06d1\u06d5\u06da\u06dd\u06e0\u06e5\u06e9\u06ee\u06f4\u06f8"+
		"\u06ff\u0703\u070a\u070d\u0710\u0717\u071c\u0720\u0723\u0729\u072e\u0731"+
		"\u0734\u073f\u0744\u074a\u0751\u0757\u075d\u0760\u0763\u0769\u076f\u0778"+
		"\u077a\u077f\u0781\u0785\u078d\u078f\u0799\u07a2\u07a6\u07ab\u07b4\u07b7"+
		"\u07c1\u07d1\u07dd\u07e2\u07e4\u07ea\u07ec\u07f0\u07f5\u07f8\u07ff\u0808"+
		"\u080b\u0812\u0815\u081f\u0827\u082e\u0832\u0839\u083d\u0845\u0848\u084a"+
		"\u084f\u0858\u085b\u0864\u0869\u086c\u0874\u087d\u088c\u088f\u0893\u089b"+
		"\u089f\u08a8\u08ab\u08b4\u08b9\u08bc\u08c3\u08cc\u08d0\u08d2\u08d9\u08dd"+
		"\u08e2\u08e8\u08ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}