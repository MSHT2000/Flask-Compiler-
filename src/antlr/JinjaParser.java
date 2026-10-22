// Generated from C:/Users/HP/Desktop/complier flask/Flask Compiler/src/antlr/JinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class JinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenBracket=1, CloseBracket=2, OpenParen=3, CloseParen=4, OpenBrace=5, 
		CloseBrace=6, SemiColon=7, Colon=8, Dot=9, Multiply=10, Divide=11, Pipe=12, 
		Underscore=13, Equal=14, Plus=15, Minus=16, Greater=17, Comma=18, Tilde=19, 
		Includes=20, DashMatch=21, PrefixMatch=22, SuffixMatch=23, SubstringMatch=24, 
		HTML_COMMENT=25, HTML_CONDITIONAL_COMMENT=26, XML_DECLARATION=27, CDATA=28, 
		DTD=29, SCRIPTLET=30, JINJA_EXPR_OPEN=31, JINJA_STMT_OPEN=32, JINJA_COMMENT_OPEN=33, 
		STYLE_OPEN=34, TAG_OPEN=35, HTML_TEXT=36, SEA_WS=37, TAG_CLOSE=38, TAG_SLASH_CLOSE=39, 
		TAG_SLASH=40, TAG_EQUALS=41, TAG_NAME=42, TAG_WHITESPACE=43, ATTVALUE_OPEN_DQ=44, 
		ATTVALUE_OPEN_SQ=45, ATTVALUE_UNQUOTED=46, ATTVALUE_SPACE=47, ATTVALUE_DQ_CLOSE=48, 
		ATTVALUE_DQ_TEXT=49, ATTVALUE_DQ_LBRACE=50, ATTVALUE_SQ_CLOSE=51, ATTVALUE_SQ_TEXT=52, 
		ATTVALUE_SQ_LBRACE=53, JINJA_EXPR_CLOSE=54, JINJA_DOT=55, JINJA_COMMA=56, 
		JINJA_COLON=57, JINJA_SEMI=58, JINJA_LPAREN=59, JINJA_RPAREN=60, JINJA_LBRACK=61, 
		JINJA_RBRACK=62, JINJA_LBRACE=63, JINJA_RBRACE=64, JINJA_PIPE=65, JINJA_TILDE=66, 
		JINJA_QUESTION=67, JINJA_ASSIGN=68, JINJA_EQ=69, JINJA_NEQ=70, JINJA_LT=71, 
		JINJA_LE=72, JINJA_GT=73, JINJA_GE=74, JINJA_PLUS=75, JINJA_MINUS=76, 
		JINJA_STAR=77, JINJA_SLASH=78, JINJA_FLOORDIV=79, JINJA_MOD=80, JINJA_POW=81, 
		JINJA_TRUE=82, JINJA_FALSE=83, JINJA_NONE=84, JINJA_AND=85, JINJA_OR=86, 
		JINJA_NOT=87, JINJA_IN=88, JINJA_IS=89, JINJA_IF=90, JINJA_ELSE=91, JINJA_FOR=92, 
		JINJA_LOOP=93, JINJA_SUPER=94, JINJA_SELF=95, JINJA_VARARGS=96, JINJA_KWARGS=97, 
		JINJA_FILTER=98, JINJA_TEST=99, JINJA_FUNCTION=100, JINJA_STRING=101, 
		JINJA_INTEGER=102, JINJA_FLOAT=103, JINJA_IDENTIFIER=104, JINJA_WS=105, 
		JINJA_STMT_CLOSE=106, JINJA_STMT_BLOCK=107, JINJA_STMT_ENDBLOCK=108, JINJA_STMT_EXTENDS=109, 
		JINJA_STMT_INCLUDE=110, JINJA_STMT_IMPORT=111, JINJA_STMT_FROM=112, JINJA_STMT_AS=113, 
		JINJA_STMT_WITH=114, JINJA_STMT_ENDWITH=115, JINJA_STMT_SET=116, JINJA_STMT_ENDSET=117, 
		JINJA_STMT_MACRO=118, JINJA_STMT_ENDMACRO=119, JINJA_STMT_CALL=120, JINJA_STMT_ENDCALL=121, 
		JINJA_STMT_FILTER=122, JINJA_STMT_ENDFILTER=123, JINJA_STMT_RAW=124, JINJA_STMT_ENDRAW=125, 
		JINJA_STMT_IF=126, JINJA_STMT_ELIF=127, JINJA_STMT_ELSE=128, JINJA_STMT_ENDIF=129, 
		JINJA_STMT_FOR=130, JINJA_STMT_ENDFOR=131, JINJA_STMT_RECURSIVE=132, JINJA_STMT_AUTOESCAPE=133, 
		JINJA_STMT_ENDAUTOESCAPE=134, JINJA_STMT_TRANS=135, JINJA_STMT_ENDTRANS=136, 
		JINJA_STMT_PLURALIZE=137, JINJA_STMT_WS=138, JINJA_COMMENT_CLOSE=139, 
		JINJA_COMMENT_TEXT=140, CSS_COMMENT=141, CSS_SPACE=142, CSS_STRING=143, 
		CSS_NUMBER=144, CSS_HASH=145, CSS_IDENT=146, CSS_FUNCTION=147, CSS_AT_KEYWORD=148, 
		CSS_VARIABLE=149, CSS_IMPORTANT=150, CSS_PERCENT=151, CSS_BANG=152, CSS_END=153, 
		UNEXPECTED_CHAR=154, CSS_UNDERSCORE=155, CSS_INCLUDES=156, CSS_DASHMATCH=157, 
		CSS_PREFIXMATCH=158, CSS_SUFFIXMATCH=159, CSS_SUBSTRINGMATCH=160;
	public static final int
		RULE_templateDocument = 0, RULE_templateBody = 1, RULE_templateChunk = 2, 
		RULE_htmlDocument = 3, RULE_scriptletOrSeaWs = 4, RULE_htmlElements = 5, 
		RULE_htmlElement = 6, RULE_htmlContent = 7, RULE_htmlContentItem = 8, 
		RULE_htmlAttribute = 9, RULE_attributeValue = 10, RULE_attributeValueContent = 11, 
		RULE_htmlChardata = 12, RULE_htmlMisc = 13, RULE_htmlComment = 14, RULE_templateJinja = 15, 
		RULE_jinjaExpression = 16, RULE_jinjaExprList = 17, RULE_jinjaExpr = 18, 
		RULE_jinjaOrExpression = 19, RULE_jinjaAndExpression = 20, RULE_jinjaNotExpression = 21, 
		RULE_jinjaComparison = 22, RULE_jinjaComparisonOperator = 23, RULE_jinjaAdditive = 24, 
		RULE_jinjaAdditiveTail = 25, RULE_jinjaAdditiveOperator = 26, RULE_jinjaMultiplicative = 27, 
		RULE_jinjaMultiplicativeTail = 28, RULE_jinjaMultiplicativeOperator = 29, 
		RULE_jinjaPower = 30, RULE_jinjaUnary = 31, RULE_jinjaUnaryPrefix = 32, 
		RULE_jinjaUnaryOperator = 33, RULE_jinjaPostfix = 34, RULE_jinjaPostfixPart = 35, 
		RULE_jinjaPrimary = 36, RULE_jinjaArgumentList = 37, RULE_jinjaArgument = 38, 
		RULE_jinjaDictEntryList = 39, RULE_jinjaDictEntry = 40, RULE_jinjaSimpleStatement = 41, 
		RULE_jinjaSimpleStatementInner = 42, RULE_jinjaBlockStatement = 43, RULE_jinjaIfStatement = 44, 
		RULE_jinjaForStatement = 45, RULE_jinjaForTarget = 46, RULE_jinjaSetStatement = 47, 
		RULE_jinjaWithStatement = 48, RULE_jinjaWithItem = 49, RULE_jinjaMacroStatement = 50, 
		RULE_jinjaMacroParams = 51, RULE_jinjaCallStatement = 52, RULE_jinjaFilterStatement = 53, 
		RULE_jinjaRawStatement = 54, RULE_jinjaComment = 55, RULE_cssStylesheet = 56, 
		RULE_cssRuleSet = 57, RULE_cssAtRuleBody = 58, RULE_cssSelectorPart = 59, 
		RULE_cssSelectorAtom = 60, RULE_cssAnyToken = 61, RULE_cssDeclarationList = 62, 
		RULE_cssDeclaration = 63, RULE_cssProperty = 64, RULE_cssValue = 65, RULE_cssValuePart = 66;
	private static String[] makeRuleNames() {
		return new String[] {
			"templateDocument", "templateBody", "templateChunk", "htmlDocument", 
			"scriptletOrSeaWs", "htmlElements", "htmlElement", "htmlContent", "htmlContentItem", 
			"htmlAttribute", "attributeValue", "attributeValueContent", "htmlChardata", 
			"htmlMisc", "htmlComment", "templateJinja", "jinjaExpression", "jinjaExprList", 
			"jinjaExpr", "jinjaOrExpression", "jinjaAndExpression", "jinjaNotExpression", 
			"jinjaComparison", "jinjaComparisonOperator", "jinjaAdditive", "jinjaAdditiveTail", 
			"jinjaAdditiveOperator", "jinjaMultiplicative", "jinjaMultiplicativeTail", 
			"jinjaMultiplicativeOperator", "jinjaPower", "jinjaUnary", "jinjaUnaryPrefix", 
			"jinjaUnaryOperator", "jinjaPostfix", "jinjaPostfixPart", "jinjaPrimary", 
			"jinjaArgumentList", "jinjaArgument", "jinjaDictEntryList", "jinjaDictEntry", 
			"jinjaSimpleStatement", "jinjaSimpleStatementInner", "jinjaBlockStatement", 
			"jinjaIfStatement", "jinjaForStatement", "jinjaForTarget", "jinjaSetStatement", 
			"jinjaWithStatement", "jinjaWithItem", "jinjaMacroStatement", "jinjaMacroParams", 
			"jinjaCallStatement", "jinjaFilterStatement", "jinjaRawStatement", "jinjaComment", 
			"cssStylesheet", "cssRuleSet", "cssAtRuleBody", "cssSelectorPart", "cssSelectorAtom", 
			"cssAnyToken", "cssDeclarationList", "cssDeclaration", "cssProperty", 
			"cssValue", "cssValuePart"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'{#'", null, null, 
			null, null, null, "'/>'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'loop'", "'super'", 
			"'self'", "'varargs'", "'kwargs'", null, "'test'", null, null, null, 
			null, null, null, null, "'block'", "'endblock'", "'extends'", "'include'", 
			"'import'", "'from'", "'as'", "'with'", "'endwith'", "'set'", "'endset'", 
			"'macro'", "'endmacro'", "'call'", "'endcall'", null, "'endfilter'", 
			"'raw'", "'endraw'", null, "'elif'", null, "'endif'", null, "'endfor'", 
			"'recursive'", "'autoescape'", "'endautoescape'", "'trans'", "'endtrans'", 
			"'pluralize'", null, "'#}'", null, null, null, null, null, null, null, 
			null, null, null, null, null, "'!'", "'</style>'", null, "'_'", "'~='", 
			"'|='", "'^='", "'$='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Colon", "Dot", "Multiply", "Divide", "Pipe", 
			"Underscore", "Equal", "Plus", "Minus", "Greater", "Comma", "Tilde", 
			"Includes", "DashMatch", "PrefixMatch", "SuffixMatch", "SubstringMatch", 
			"HTML_COMMENT", "HTML_CONDITIONAL_COMMENT", "XML_DECLARATION", "CDATA", 
			"DTD", "SCRIPTLET", "JINJA_EXPR_OPEN", "JINJA_STMT_OPEN", "JINJA_COMMENT_OPEN", 
			"STYLE_OPEN", "TAG_OPEN", "HTML_TEXT", "SEA_WS", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "ATTVALUE_OPEN_DQ", 
			"ATTVALUE_OPEN_SQ", "ATTVALUE_UNQUOTED", "ATTVALUE_SPACE", "ATTVALUE_DQ_CLOSE", 
			"ATTVALUE_DQ_TEXT", "ATTVALUE_DQ_LBRACE", "ATTVALUE_SQ_CLOSE", "ATTVALUE_SQ_TEXT", 
			"ATTVALUE_SQ_LBRACE", "JINJA_EXPR_CLOSE", "JINJA_DOT", "JINJA_COMMA", 
			"JINJA_COLON", "JINJA_SEMI", "JINJA_LPAREN", "JINJA_RPAREN", "JINJA_LBRACK", 
			"JINJA_RBRACK", "JINJA_LBRACE", "JINJA_RBRACE", "JINJA_PIPE", "JINJA_TILDE", 
			"JINJA_QUESTION", "JINJA_ASSIGN", "JINJA_EQ", "JINJA_NEQ", "JINJA_LT", 
			"JINJA_LE", "JINJA_GT", "JINJA_GE", "JINJA_PLUS", "JINJA_MINUS", "JINJA_STAR", 
			"JINJA_SLASH", "JINJA_FLOORDIV", "JINJA_MOD", "JINJA_POW", "JINJA_TRUE", 
			"JINJA_FALSE", "JINJA_NONE", "JINJA_AND", "JINJA_OR", "JINJA_NOT", "JINJA_IN", 
			"JINJA_IS", "JINJA_IF", "JINJA_ELSE", "JINJA_FOR", "JINJA_LOOP", "JINJA_SUPER", 
			"JINJA_SELF", "JINJA_VARARGS", "JINJA_KWARGS", "JINJA_FILTER", "JINJA_TEST", 
			"JINJA_FUNCTION", "JINJA_STRING", "JINJA_INTEGER", "JINJA_FLOAT", "JINJA_IDENTIFIER", 
			"JINJA_WS", "JINJA_STMT_CLOSE", "JINJA_STMT_BLOCK", "JINJA_STMT_ENDBLOCK", 
			"JINJA_STMT_EXTENDS", "JINJA_STMT_INCLUDE", "JINJA_STMT_IMPORT", "JINJA_STMT_FROM", 
			"JINJA_STMT_AS", "JINJA_STMT_WITH", "JINJA_STMT_ENDWITH", "JINJA_STMT_SET", 
			"JINJA_STMT_ENDSET", "JINJA_STMT_MACRO", "JINJA_STMT_ENDMACRO", "JINJA_STMT_CALL", 
			"JINJA_STMT_ENDCALL", "JINJA_STMT_FILTER", "JINJA_STMT_ENDFILTER", "JINJA_STMT_RAW", 
			"JINJA_STMT_ENDRAW", "JINJA_STMT_IF", "JINJA_STMT_ELIF", "JINJA_STMT_ELSE", 
			"JINJA_STMT_ENDIF", "JINJA_STMT_FOR", "JINJA_STMT_ENDFOR", "JINJA_STMT_RECURSIVE", 
			"JINJA_STMT_AUTOESCAPE", "JINJA_STMT_ENDAUTOESCAPE", "JINJA_STMT_TRANS", 
			"JINJA_STMT_ENDTRANS", "JINJA_STMT_PLURALIZE", "JINJA_STMT_WS", "JINJA_COMMENT_CLOSE", 
			"JINJA_COMMENT_TEXT", "CSS_COMMENT", "CSS_SPACE", "CSS_STRING", "CSS_NUMBER", 
			"CSS_HASH", "CSS_IDENT", "CSS_FUNCTION", "CSS_AT_KEYWORD", "CSS_VARIABLE", 
			"CSS_IMPORTANT", "CSS_PERCENT", "CSS_BANG", "CSS_END", "UNEXPECTED_CHAR", 
			"CSS_UNDERSCORE", "CSS_INCLUDES", "CSS_DASHMATCH", "CSS_PREFIXMATCH", 
			"CSS_SUFFIXMATCH", "CSS_SUBSTRINGMATCH"
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
	public String getGrammarFileName() { return "JinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemplateDocumentContext extends ParserRuleContext {
		public TemplateBodyContext body;
		public TerminalNode EOF() { return getToken(JinjaParser.EOF, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public TemplateDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTemplateDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTemplateDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTemplateDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateDocumentContext templateDocument() throws RecognitionException {
		TemplateDocumentContext _localctx = new TemplateDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_templateDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((TemplateDocumentContext)_localctx).body = templateBody();
			setState(135);
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
	public static class TemplateBodyContext extends ParserRuleContext {
		public TemplateChunkContext templateChunk;
		public List<TemplateChunkContext> chunks = new ArrayList<TemplateChunkContext>();
		public List<TemplateChunkContext> templateChunk() {
			return getRuleContexts(TemplateChunkContext.class);
		}
		public TemplateChunkContext templateChunk(int i) {
			return getRuleContext(TemplateChunkContext.class,i);
		}
		public TemplateBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTemplateBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTemplateBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTemplateBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateBodyContext templateBody() throws RecognitionException {
		TemplateBodyContext _localctx = new TemplateBodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templateBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					((TemplateBodyContext)_localctx).templateChunk = templateChunk();
					((TemplateBodyContext)_localctx).chunks.add(((TemplateBodyContext)_localctx).templateChunk);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
	public static class TemplateChunkContext extends ParserRuleContext {
		public TemplateChunkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateChunk; }
	 
		public TemplateChunkContext() { }
		public void copyFrom(TemplateChunkContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementChunkContext extends TemplateChunkContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ElementChunkContext(TemplateChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElementChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElementChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElementChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaChunkContext extends TemplateChunkContext {
		public TemplateJinjaContext templateJinja() {
			return getRuleContext(TemplateJinjaContext.class,0);
		}
		public JinjaChunkContext(TemplateChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaChunk(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MiscChunkContext extends TemplateChunkContext {
		public HtmlMiscContext htmlMisc() {
			return getRuleContext(HtmlMiscContext.class,0);
		}
		public MiscChunkContext(TemplateChunkContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMiscChunk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMiscChunk(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMiscChunk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateChunkContext templateChunk() throws RecognitionException {
		TemplateChunkContext _localctx = new TemplateChunkContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_templateChunk);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
			case HTML_TEXT:
			case SEA_WS:
				_localctx = new MiscChunkContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				htmlMisc();
				}
				break;
			case SCRIPTLET:
			case STYLE_OPEN:
			case TAG_OPEN:
				_localctx = new ElementChunkContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				htmlElement();
				}
				break;
			case JINJA_EXPR_OPEN:
			case JINJA_STMT_OPEN:
			case JINJA_COMMENT_OPEN:
				_localctx = new JinjaChunkContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				templateJinja();
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
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public TerminalNode XML_DECLARATION() { return getToken(JinjaParser.XML_DECLARATION, 0); }
		public TerminalNode DTD() { return getToken(JinjaParser.DTD, 0); }
		public List<HtmlElementsContext> htmlElements() {
			return getRuleContexts(HtmlElementsContext.class);
		}
		public HtmlElementsContext htmlElements(int i) {
			return getRuleContext(HtmlElementsContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(148);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==XML_DECLARATION) {
				{
				setState(154);
				match(XML_DECLARATION);
				}
			}

			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DTD) {
				{
				setState(163);
				match(DTD);
				}
			}

			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(166);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 258872442880L) != 0)) {
				{
				{
				setState(172);
				htmlElements();
				}
				}
				setState(177);
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
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
	 
		public ScriptletOrSeaWsContext() { }
		public void copyFrom(ScriptletOrSeaWsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletValueContext extends ScriptletOrSeaWsContext {
		public TerminalNode SCRIPTLET() { return getToken(JinjaParser.SCRIPTLET, 0); }
		public ScriptletValueContext(ScriptletOrSeaWsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterScriptletValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitScriptletValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitScriptletValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhitespaceValueContext extends ScriptletOrSeaWsContext {
		public TerminalNode SEA_WS() { return getToken(JinjaParser.SEA_WS, 0); }
		public WhitespaceValueContext(ScriptletOrSeaWsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterWhitespaceValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitWhitespaceValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitWhitespaceValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptletOrSeaWs);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SCRIPTLET:
				_localctx = new ScriptletValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(SCRIPTLET);
				}
				break;
			case SEA_WS:
				_localctx = new WhitespaceValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(SEA_WS);
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
	public static class HtmlElementsContext extends ParserRuleContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public HtmlElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementsContext htmlElements() throws RecognitionException {
		HtmlElementsContext _localctx = new HtmlElementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlElements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 206259093504L) != 0)) {
				{
				{
				setState(182);
				htmlMisc();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			htmlElement();
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(189);
					htmlMisc();
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class HtmlElementContext extends ParserRuleContext {
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
	 
		public HtmlElementContext() { }
		public void copyFrom(HtmlElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ScriptletElementContext extends HtmlElementContext {
		public TerminalNode SCRIPTLET() { return getToken(JinjaParser.SCRIPTLET, 0); }
		public ScriptletElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterScriptletElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitScriptletElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitScriptletElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PairedElementContext extends HtmlElementContext {
		public Token tagName;
		public HtmlAttributeContext htmlAttribute;
		public List<HtmlAttributeContext> attributes = new ArrayList<HtmlAttributeContext>();
		public HtmlContentContext content;
		public Token closeName;
		public List<TerminalNode> TAG_OPEN() { return getTokens(JinjaParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(JinjaParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(JinjaParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(JinjaParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(JinjaParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(JinjaParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(JinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH() { return getToken(JinjaParser.TAG_SLASH, 0); }
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public PairedElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPairedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPairedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPairedElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleElementContext extends HtmlElementContext {
		public CssStylesheetContext stylesheet;
		public TerminalNode STYLE_OPEN() { return getToken(JinjaParser.STYLE_OPEN, 0); }
		public TerminalNode CSS_END() { return getToken(JinjaParser.CSS_END, 0); }
		public CssStylesheetContext cssStylesheet() {
			return getRuleContext(CssStylesheetContext.class,0);
		}
		public StyleElementContext(HtmlElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlElement);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_OPEN:
				_localctx = new PairedElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(TAG_OPEN);
				setState(196);
				((PairedElementContext)_localctx).tagName = match(TAG_NAME);
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(197);
					((PairedElementContext)_localctx).htmlAttribute = htmlAttribute();
					((PairedElementContext)_localctx).attributes.add(((PairedElementContext)_localctx).htmlAttribute);
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(203);
					match(TAG_CLOSE);
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(204);
						((PairedElementContext)_localctx).content = htmlContent();
						setState(205);
						match(TAG_OPEN);
						setState(206);
						match(TAG_SLASH);
						setState(207);
						((PairedElementContext)_localctx).closeName = match(TAG_NAME);
						setState(208);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(212);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SCRIPTLET:
				_localctx = new ScriptletElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(SCRIPTLET);
				}
				break;
			case STYLE_OPEN:
				_localctx = new StyleElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(STYLE_OPEN);
				setState(217);
				((StyleElementContext)_localctx).stylesheet = cssStylesheet();
				setState(218);
				match(CSS_END);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlContentItemContext> htmlContentItem() {
			return getRuleContexts(HtmlContentItemContext.class);
		}
		public HtmlContentItemContext htmlContentItem(int i) {
			return getRuleContext(HtmlContentItemContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(222);
					htmlContentItem();
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class HtmlContentItemContext extends ParserRuleContext {
		public HtmlContentItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContentItem; }
	 
		public HtmlContentItemContext() { }
		public void copyFrom(HtmlContentItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ElementItemContext extends HtmlContentItemContext {
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public ElementItemContext(HtmlContentItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterElementItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitElementItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitElementItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChardataItemContext extends HtmlContentItemContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public ChardataItemContext(HtmlContentItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterChardataItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitChardataItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitChardataItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentItemContext extends HtmlContentItemContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public CommentItemContext(HtmlContentItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCommentItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCommentItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCommentItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateJinjaItemContext extends HtmlContentItemContext {
		public TemplateJinjaContext templateJinja() {
			return getRuleContext(TemplateJinjaContext.class,0);
		}
		public TemplateJinjaItemContext(HtmlContentItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTemplateJinjaItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTemplateJinjaItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTemplateJinjaItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CdataItemContext extends HtmlContentItemContext {
		public TerminalNode CDATA() { return getToken(JinjaParser.CDATA, 0); }
		public CdataItemContext(HtmlContentItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCdataItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCdataItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCdataItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentItemContext htmlContentItem() throws RecognitionException {
		HtmlContentItemContext _localctx = new HtmlContentItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_htmlContentItem);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
			case SEA_WS:
				_localctx = new ChardataItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				htmlChardata();
				}
				break;
			case SCRIPTLET:
			case STYLE_OPEN:
			case TAG_OPEN:
				_localctx = new ElementItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				htmlElement();
				}
				break;
			case CDATA:
				_localctx = new CdataItemContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(CDATA);
				}
				break;
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new CommentItemContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				htmlComment();
				}
				break;
			case JINJA_EXPR_OPEN:
			case JINJA_STMT_OPEN:
			case JINJA_COMMENT_OPEN:
				_localctx = new TemplateJinjaItemContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				templateJinja();
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public Token name;
		public AttributeValueContext value;
		public TerminalNode TAG_NAME() { return getToken(JinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(JinjaParser.TAG_EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((HtmlAttributeContext)_localctx).name = match(TAG_NAME);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(236);
				match(TAG_EQUALS);
				setState(237);
				((HtmlAttributeContext)_localctx).value = attributeValue();
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
	public static class AttributeValueContext extends ParserRuleContext {
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
	 
		public AttributeValueContext() { }
		public void copyFrom(AttributeValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnquotedValueContext extends AttributeValueContext {
		public TerminalNode ATTVALUE_UNQUOTED() { return getToken(JinjaParser.ATTVALUE_UNQUOTED, 0); }
		public UnquotedValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterUnquotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitUnquotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitUnquotedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedValueContext extends AttributeValueContext {
		public TerminalNode ATTVALUE_OPEN_DQ() { return getToken(JinjaParser.ATTVALUE_OPEN_DQ, 0); }
		public TerminalNode ATTVALUE_DQ_CLOSE() { return getToken(JinjaParser.ATTVALUE_DQ_CLOSE, 0); }
		public List<AttributeValueContentContext> attributeValueContent() {
			return getRuleContexts(AttributeValueContentContext.class);
		}
		public AttributeValueContentContext attributeValueContent(int i) {
			return getRuleContext(AttributeValueContentContext.class,i);
		}
		public DoubleQuotedValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDoubleQuotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDoubleQuotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDoubleQuotedValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleQuotedValueContext extends AttributeValueContext {
		public TerminalNode ATTVALUE_OPEN_SQ() { return getToken(JinjaParser.ATTVALUE_OPEN_SQ, 0); }
		public TerminalNode ATTVALUE_SQ_CLOSE() { return getToken(JinjaParser.ATTVALUE_SQ_CLOSE, 0); }
		public List<AttributeValueContentContext> attributeValueContent() {
			return getRuleContexts(AttributeValueContentContext.class);
		}
		public AttributeValueContentContext attributeValueContent(int i) {
			return getRuleContext(AttributeValueContentContext.class,i);
		}
		public SingleQuotedValueContext(AttributeValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSingleQuotedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSingleQuotedValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSingleQuotedValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attributeValue);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTVALUE_OPEN_DQ:
				_localctx = new DoubleQuotedValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				match(ATTVALUE_OPEN_DQ);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15199650889859072L) != 0)) {
					{
					{
					setState(241);
					attributeValueContent();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(247);
				match(ATTVALUE_DQ_CLOSE);
				}
				break;
			case ATTVALUE_OPEN_SQ:
				_localctx = new SingleQuotedValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(ATTVALUE_OPEN_SQ);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15199650889859072L) != 0)) {
					{
					{
					setState(249);
					attributeValueContent();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(ATTVALUE_SQ_CLOSE);
				}
				break;
			case ATTVALUE_UNQUOTED:
				_localctx = new UnquotedValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(ATTVALUE_UNQUOTED);
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
	public static class AttributeValueContentContext extends ParserRuleContext {
		public AttributeValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValueContent; }
	 
		public AttributeValueContentContext() { }
		public void copyFrom(AttributeValueContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleQuotedLbraceContext extends AttributeValueContentContext {
		public TerminalNode ATTVALUE_SQ_LBRACE() { return getToken(JinjaParser.ATTVALUE_SQ_LBRACE, 0); }
		public SingleQuotedLbraceContext(AttributeValueContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSingleQuotedLbrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSingleQuotedLbrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSingleQuotedLbrace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeJinjaExpressionContext extends AttributeValueContentContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public AttributeJinjaExpressionContext(AttributeValueContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterAttributeJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitAttributeJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitAttributeJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SingleQuotedTextContext extends AttributeValueContentContext {
		public TerminalNode ATTVALUE_SQ_TEXT() { return getToken(JinjaParser.ATTVALUE_SQ_TEXT, 0); }
		public SingleQuotedTextContext(AttributeValueContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSingleQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSingleQuotedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSingleQuotedText(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedLbraceContext extends AttributeValueContentContext {
		public TerminalNode ATTVALUE_DQ_LBRACE() { return getToken(JinjaParser.ATTVALUE_DQ_LBRACE, 0); }
		public DoubleQuotedLbraceContext(AttributeValueContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDoubleQuotedLbrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDoubleQuotedLbrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDoubleQuotedLbrace(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleQuotedTextContext extends AttributeValueContentContext {
		public TerminalNode ATTVALUE_DQ_TEXT() { return getToken(JinjaParser.ATTVALUE_DQ_TEXT, 0); }
		public DoubleQuotedTextContext(AttributeValueContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDoubleQuotedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDoubleQuotedText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDoubleQuotedText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContentContext attributeValueContent() throws RecognitionException {
		AttributeValueContentContext _localctx = new AttributeValueContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attributeValueContent);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ATTVALUE_DQ_TEXT:
				_localctx = new DoubleQuotedTextContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(ATTVALUE_DQ_TEXT);
				}
				break;
			case ATTVALUE_SQ_TEXT:
				_localctx = new SingleQuotedTextContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(ATTVALUE_SQ_TEXT);
				}
				break;
			case ATTVALUE_DQ_LBRACE:
				_localctx = new DoubleQuotedLbraceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(ATTVALUE_DQ_LBRACE);
				}
				break;
			case ATTVALUE_SQ_LBRACE:
				_localctx = new SingleQuotedLbraceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(ATTVALUE_SQ_LBRACE);
				}
				break;
			case JINJA_EXPR_OPEN:
				_localctx = new AttributeJinjaExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(263);
				jinjaExpression();
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
	public static class HtmlChardataContext extends ParserRuleContext {
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
	 
		public HtmlChardataContext() { }
		public void copyFrom(HtmlChardataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeaWsChardataContext extends HtmlChardataContext {
		public TerminalNode SEA_WS() { return getToken(JinjaParser.SEA_WS, 0); }
		public SeaWsChardataContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSeaWsChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSeaWsChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSeaWsChardata(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTextChardataContext extends HtmlChardataContext {
		public TerminalNode HTML_TEXT() { return getToken(JinjaParser.HTML_TEXT, 0); }
		public HtmlTextChardataContext(HtmlChardataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterHtmlTextChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitHtmlTextChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitHtmlTextChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_htmlChardata);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TEXT:
				_localctx = new HtmlTextChardataContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(HTML_TEXT);
				}
				break;
			case SEA_WS:
				_localctx = new SeaWsChardataContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(SEA_WS);
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
	 
		public HtmlMiscContext() { }
		public void copyFrom(HtmlMiscContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommentMiscContext extends HtmlMiscContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public CommentMiscContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCommentMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCommentMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCommentMisc(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChardataMiscContext extends HtmlMiscContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public ChardataMiscContext(HtmlMiscContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterChardataMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitChardataMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitChardataMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_htmlMisc);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new CommentMiscContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				htmlComment();
				}
				break;
			case HTML_TEXT:
			case SEA_WS:
				_localctx = new ChardataMiscContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				htmlChardata();
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
	 
		public HtmlCommentContext() { }
		public void copyFrom(HtmlCommentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalHtmlCommentContext extends HtmlCommentContext {
		public TerminalNode HTML_CONDITIONAL_COMMENT() { return getToken(JinjaParser.HTML_CONDITIONAL_COMMENT, 0); }
		public ConditionalHtmlCommentContext(HtmlCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterConditionalHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitConditionalHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitConditionalHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RegularHtmlCommentContext extends HtmlCommentContext {
		public TerminalNode HTML_COMMENT() { return getToken(JinjaParser.HTML_COMMENT, 0); }
		public RegularHtmlCommentContext(HtmlCommentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterRegularHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitRegularHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitRegularHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_htmlComment);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				_localctx = new RegularHtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(HTML_COMMENT);
				}
				break;
			case HTML_CONDITIONAL_COMMENT:
				_localctx = new ConditionalHtmlCommentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(HTML_CONDITIONAL_COMMENT);
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
	public static class TemplateJinjaContext extends ParserRuleContext {
		public TemplateJinjaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateJinja; }
	 
		public TemplateJinjaContext() { }
		public void copyFrom(TemplateJinjaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSetContext extends TemplateJinjaContext {
		public JinjaSetStatementContext jinjaSetStatement() {
			return getRuleContext(JinjaSetStatementContext.class,0);
		}
		public JinjaSetContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaSet(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaSimpleStmtContext extends TemplateJinjaContext {
		public JinjaSimpleStatementContext jinjaSimpleStatement() {
			return getRuleContext(JinjaSimpleStatementContext.class,0);
		}
		public JinjaSimpleStmtContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaSimpleStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaSimpleStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaMacroContext extends TemplateJinjaContext {
		public JinjaMacroStatementContext jinjaMacroStatement() {
			return getRuleContext(JinjaMacroStatementContext.class,0);
		}
		public JinjaMacroContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaMacro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaMacro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaMacro(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCommentNodeContext extends TemplateJinjaContext {
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public JinjaCommentNodeContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaCommentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaCommentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaCommentNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaFilterContext extends TemplateJinjaContext {
		public JinjaFilterStatementContext jinjaFilterStatement() {
			return getRuleContext(JinjaFilterStatementContext.class,0);
		}
		public JinjaFilterContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionNodeContext extends TemplateJinjaContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaExpressionNodeContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExpressionNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExpressionNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExpressionNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaIfContext extends TemplateJinjaContext {
		public JinjaIfStatementContext jinjaIfStatement() {
			return getRuleContext(JinjaIfStatementContext.class,0);
		}
		public JinjaIfContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaIf(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaBlockContext extends TemplateJinjaContext {
		public JinjaBlockStatementContext jinjaBlockStatement() {
			return getRuleContext(JinjaBlockStatementContext.class,0);
		}
		public JinjaBlockContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaCallContext extends TemplateJinjaContext {
		public JinjaCallStatementContext jinjaCallStatement() {
			return getRuleContext(JinjaCallStatementContext.class,0);
		}
		public JinjaCallContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaForContext extends TemplateJinjaContext {
		public JinjaForStatementContext jinjaForStatement() {
			return getRuleContext(JinjaForStatementContext.class,0);
		}
		public JinjaForContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaWithContext extends TemplateJinjaContext {
		public JinjaWithStatementContext jinjaWithStatement() {
			return getRuleContext(JinjaWithStatementContext.class,0);
		}
		public JinjaWithContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaWith(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JinjaRawContext extends TemplateJinjaContext {
		public JinjaRawStatementContext jinjaRawStatement() {
			return getRuleContext(JinjaRawStatementContext.class,0);
		}
		public JinjaRawContext(TemplateJinjaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaRaw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaRaw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaRaw(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateJinjaContext templateJinja() throws RecognitionException {
		TemplateJinjaContext _localctx = new TemplateJinjaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_templateJinja);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new JinjaExpressionNodeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				jinjaExpression();
				}
				break;
			case 2:
				_localctx = new JinjaCommentNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				jinjaComment();
				}
				break;
			case 3:
				_localctx = new JinjaSimpleStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				jinjaSimpleStatement();
				}
				break;
			case 4:
				_localctx = new JinjaIfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				jinjaIfStatement();
				}
				break;
			case 5:
				_localctx = new JinjaForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				jinjaForStatement();
				}
				break;
			case 6:
				_localctx = new JinjaBlockContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				jinjaBlockStatement();
				}
				break;
			case 7:
				_localctx = new JinjaSetContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				jinjaSetStatement();
				}
				break;
			case 8:
				_localctx = new JinjaWithContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				jinjaWithStatement();
				}
				break;
			case 9:
				_localctx = new JinjaMacroContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				jinjaMacroStatement();
				}
				break;
			case 10:
				_localctx = new JinjaCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(287);
				jinjaCallStatement();
				}
				break;
			case 11:
				_localctx = new JinjaFilterContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				jinjaFilterStatement();
				}
				break;
			case 12:
				_localctx = new JinjaRawContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(289);
				jinjaRawStatement();
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public JinjaExprListContext exprs;
		public TerminalNode JINJA_EXPR_OPEN() { return getToken(JinjaParser.JINJA_EXPR_OPEN, 0); }
		public TerminalNode JINJA_EXPR_CLOSE() { return getToken(JinjaParser.JINJA_EXPR_CLOSE, 0); }
		public JinjaExprListContext jinjaExprList() {
			return getRuleContext(JinjaExprListContext.class,0);
		}
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(JINJA_EXPR_OPEN);
			setState(293);
			((JinjaExpressionContext)_localctx).exprs = jinjaExprList();
			setState(294);
			match(JINJA_EXPR_CLOSE);
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
	public static class JinjaExprListContext extends ParserRuleContext {
		public JinjaExprContext jinjaExpr;
		public List<JinjaExprContext> items = new ArrayList<JinjaExprContext>();
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprListContext jinjaExprList() throws RecognitionException {
		JinjaExprListContext _localctx = new JinjaExprListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jinjaExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			((JinjaExprListContext)_localctx).jinjaExpr = jinjaExpr();
			((JinjaExprListContext)_localctx).items.add(((JinjaExprListContext)_localctx).jinjaExpr);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(297);
				match(JINJA_COMMA);
				setState(298);
				((JinjaExprListContext)_localctx).jinjaExpr = jinjaExpr();
				((JinjaExprListContext)_localctx).items.add(((JinjaExprListContext)_localctx).jinjaExpr);
				}
				}
				setState(303);
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
	public static class JinjaExprContext extends ParserRuleContext {
		public JinjaOrExpressionContext trueExpr;
		public JinjaOrExpressionContext condition;
		public JinjaExprContext falseExpr;
		public List<JinjaOrExpressionContext> jinjaOrExpression() {
			return getRuleContexts(JinjaOrExpressionContext.class);
		}
		public JinjaOrExpressionContext jinjaOrExpression(int i) {
			return getRuleContext(JinjaOrExpressionContext.class,i);
		}
		public TerminalNode JINJA_IF() { return getToken(JinjaParser.JINJA_IF, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(JinjaParser.JINJA_ELSE, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public JinjaExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExprContext jinjaExpr() throws RecognitionException {
		JinjaExprContext _localctx = new JinjaExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jinjaExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			((JinjaExprContext)_localctx).trueExpr = jinjaOrExpression();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IF) {
				{
				setState(305);
				match(JINJA_IF);
				setState(306);
				((JinjaExprContext)_localctx).condition = jinjaOrExpression();
				setState(307);
				match(JINJA_ELSE);
				setState(308);
				((JinjaExprContext)_localctx).falseExpr = jinjaExpr();
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
	public static class JinjaOrExpressionContext extends ParserRuleContext {
		public JinjaAndExpressionContext first;
		public JinjaAndExpressionContext jinjaAndExpression;
		public List<JinjaAndExpressionContext> operands = new ArrayList<JinjaAndExpressionContext>();
		public List<JinjaAndExpressionContext> jinjaAndExpression() {
			return getRuleContexts(JinjaAndExpressionContext.class);
		}
		public JinjaAndExpressionContext jinjaAndExpression(int i) {
			return getRuleContext(JinjaAndExpressionContext.class,i);
		}
		public List<TerminalNode> JINJA_OR() { return getTokens(JinjaParser.JINJA_OR); }
		public TerminalNode JINJA_OR(int i) {
			return getToken(JinjaParser.JINJA_OR, i);
		}
		public JinjaOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaOrExpressionContext jinjaOrExpression() throws RecognitionException {
		JinjaOrExpressionContext _localctx = new JinjaOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jinjaOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((JinjaOrExpressionContext)_localctx).first = jinjaAndExpression();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_OR) {
				{
				{
				setState(313);
				match(JINJA_OR);
				setState(314);
				((JinjaOrExpressionContext)_localctx).jinjaAndExpression = jinjaAndExpression();
				((JinjaOrExpressionContext)_localctx).operands.add(((JinjaOrExpressionContext)_localctx).jinjaAndExpression);
				}
				}
				setState(319);
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
	public static class JinjaAndExpressionContext extends ParserRuleContext {
		public JinjaNotExpressionContext first;
		public JinjaNotExpressionContext jinjaNotExpression;
		public List<JinjaNotExpressionContext> operands = new ArrayList<JinjaNotExpressionContext>();
		public List<JinjaNotExpressionContext> jinjaNotExpression() {
			return getRuleContexts(JinjaNotExpressionContext.class);
		}
		public JinjaNotExpressionContext jinjaNotExpression(int i) {
			return getRuleContext(JinjaNotExpressionContext.class,i);
		}
		public List<TerminalNode> JINJA_AND() { return getTokens(JinjaParser.JINJA_AND); }
		public TerminalNode JINJA_AND(int i) {
			return getToken(JinjaParser.JINJA_AND, i);
		}
		public JinjaAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAndExpressionContext jinjaAndExpression() throws RecognitionException {
		JinjaAndExpressionContext _localctx = new JinjaAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jinjaAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			((JinjaAndExpressionContext)_localctx).first = jinjaNotExpression();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_AND) {
				{
				{
				setState(321);
				match(JINJA_AND);
				setState(322);
				((JinjaAndExpressionContext)_localctx).jinjaNotExpression = jinjaNotExpression();
				((JinjaAndExpressionContext)_localctx).operands.add(((JinjaAndExpressionContext)_localctx).jinjaNotExpression);
				}
				}
				setState(327);
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
	public static class JinjaNotExpressionContext extends ParserRuleContext {
		public JinjaNotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaNotExpression; }
	 
		public JinjaNotExpressionContext() { }
		public void copyFrom(JinjaNotExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonExpressionContext extends JinjaNotExpressionContext {
		public JinjaComparisonContext jinjaComparison() {
			return getRuleContext(JinjaComparisonContext.class,0);
		}
		public ComparisonExpressionContext(JinjaNotExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends JinjaNotExpressionContext {
		public TerminalNode JINJA_NOT() { return getToken(JinjaParser.JINJA_NOT, 0); }
		public JinjaNotExpressionContext jinjaNotExpression() {
			return getRuleContext(JinjaNotExpressionContext.class,0);
		}
		public NotExpressionContext(JinjaNotExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaNotExpressionContext jinjaNotExpression() throws RecognitionException {
		JinjaNotExpressionContext _localctx = new JinjaNotExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jinjaNotExpression);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NOT:
				_localctx = new NotExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(JINJA_NOT);
				setState(329);
				jinjaNotExpression();
				}
				break;
			case JINJA_LPAREN:
			case JINJA_LBRACK:
			case JINJA_LBRACE:
			case JINJA_PLUS:
			case JINJA_MINUS:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_NONE:
			case JINJA_STRING:
			case JINJA_INTEGER:
			case JINJA_FLOAT:
			case JINJA_IDENTIFIER:
				_localctx = new ComparisonExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				jinjaComparison();
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
	public static class JinjaComparisonContext extends ParserRuleContext {
		public JinjaAdditiveContext first;
		public JinjaComparisonOperatorContext jinjaComparisonOperator;
		public List<JinjaComparisonOperatorContext> operators = new ArrayList<JinjaComparisonOperatorContext>();
		public JinjaAdditiveContext jinjaAdditive;
		public List<JinjaAdditiveContext> operands = new ArrayList<JinjaAdditiveContext>();
		public List<JinjaAdditiveContext> jinjaAdditive() {
			return getRuleContexts(JinjaAdditiveContext.class);
		}
		public JinjaAdditiveContext jinjaAdditive(int i) {
			return getRuleContext(JinjaAdditiveContext.class,i);
		}
		public List<JinjaComparisonOperatorContext> jinjaComparisonOperator() {
			return getRuleContexts(JinjaComparisonOperatorContext.class);
		}
		public JinjaComparisonOperatorContext jinjaComparisonOperator(int i) {
			return getRuleContext(JinjaComparisonOperatorContext.class,i);
		}
		public JinjaComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaComparisonContext jinjaComparison() throws RecognitionException {
		JinjaComparisonContext _localctx = new JinjaComparisonContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jinjaComparison);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			((JinjaComparisonContext)_localctx).first = jinjaAdditive();
			setState(339);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(334);
					((JinjaComparisonContext)_localctx).jinjaComparisonOperator = jinjaComparisonOperator();
					((JinjaComparisonContext)_localctx).operators.add(((JinjaComparisonContext)_localctx).jinjaComparisonOperator);
					setState(335);
					((JinjaComparisonContext)_localctx).jinjaAdditive = jinjaAdditive();
					((JinjaComparisonContext)_localctx).operands.add(((JinjaComparisonContext)_localctx).jinjaAdditive);
					}
					} 
				}
				setState(341);
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
	public static class JinjaComparisonOperatorContext extends ParserRuleContext {
		public JinjaComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComparisonOperator; }
	 
		public JinjaComparisonOperatorContext() { }
		public void copyFrom(JinjaComparisonOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_LE() { return getToken(JinjaParser.JINJA_LE, 0); }
		public LteOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLteOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLteOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLteOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_GT() { return getToken(JinjaParser.JINJA_GT, 0); }
		public GtOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterGtOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitGtOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitGtOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_IN() { return getToken(JinjaParser.JINJA_IN, 0); }
		public InOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterInOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitInOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitInOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_EQ() { return getToken(JinjaParser.JINJA_EQ, 0); }
		public EqOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterEqOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitEqOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitEqOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_GE() { return getToken(JinjaParser.JINJA_GE, 0); }
		public GteOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterGteOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitGteOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitGteOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_LT() { return getToken(JinjaParser.JINJA_LT, 0); }
		public LtOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterLtOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitLtOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitLtOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_NEQ() { return getToken(JinjaParser.JINJA_NEQ, 0); }
		public NotEqOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNotEqOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNotEqOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNotEqOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsOperatorContext extends JinjaComparisonOperatorContext {
		public TerminalNode JINJA_IS() { return getToken(JinjaParser.JINJA_IS, 0); }
		public IsOperatorContext(JinjaComparisonOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIsOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIsOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIsOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaComparisonOperatorContext jinjaComparisonOperator() throws RecognitionException {
		JinjaComparisonOperatorContext _localctx = new JinjaComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jinjaComparisonOperator);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EQ:
				_localctx = new EqOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(JINJA_EQ);
				}
				break;
			case JINJA_NEQ:
				_localctx = new NotEqOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(JINJA_NEQ);
				}
				break;
			case JINJA_LT:
				_localctx = new LtOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(JINJA_LT);
				}
				break;
			case JINJA_LE:
				_localctx = new LteOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(JINJA_LE);
				}
				break;
			case JINJA_GT:
				_localctx = new GtOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				match(JINJA_GT);
				}
				break;
			case JINJA_GE:
				_localctx = new GteOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				match(JINJA_GE);
				}
				break;
			case JINJA_IN:
				_localctx = new InOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				match(JINJA_IN);
				}
				break;
			case JINJA_IS:
				_localctx = new IsOperatorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
				match(JINJA_IS);
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
	public static class JinjaAdditiveContext extends ParserRuleContext {
		public JinjaMultiplicativeContext jinjaMultiplicative() {
			return getRuleContext(JinjaMultiplicativeContext.class,0);
		}
		public List<JinjaAdditiveTailContext> jinjaAdditiveTail() {
			return getRuleContexts(JinjaAdditiveTailContext.class);
		}
		public JinjaAdditiveTailContext jinjaAdditiveTail(int i) {
			return getRuleContext(JinjaAdditiveTailContext.class,i);
		}
		public JinjaAdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAdditive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAdditiveContext jinjaAdditive() throws RecognitionException {
		JinjaAdditiveContext _localctx = new JinjaAdditiveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jinjaAdditive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			jinjaMultiplicative();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 1537L) != 0)) {
				{
				{
				setState(353);
				jinjaAdditiveTail();
				}
				}
				setState(358);
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
	public static class JinjaAdditiveTailContext extends ParserRuleContext {
		public JinjaAdditiveOperatorContext jinjaAdditiveOperator() {
			return getRuleContext(JinjaAdditiveOperatorContext.class,0);
		}
		public JinjaMultiplicativeContext jinjaMultiplicative() {
			return getRuleContext(JinjaMultiplicativeContext.class,0);
		}
		public JinjaAdditiveTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAdditiveTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaAdditiveTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaAdditiveTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaAdditiveTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAdditiveTailContext jinjaAdditiveTail() throws RecognitionException {
		JinjaAdditiveTailContext _localctx = new JinjaAdditiveTailContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jinjaAdditiveTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			jinjaAdditiveOperator();
			setState(360);
			jinjaMultiplicative();
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
	public static class JinjaAdditiveOperatorContext extends ParserRuleContext {
		public JinjaAdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaAdditiveOperator; }
	 
		public JinjaAdditiveOperatorContext() { }
		public void copyFrom(JinjaAdditiveOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusAdditiveOperatorContext extends JinjaAdditiveOperatorContext {
		public TerminalNode JINJA_PLUS() { return getToken(JinjaParser.JINJA_PLUS, 0); }
		public PlusAdditiveOperatorContext(JinjaAdditiveOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPlusAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPlusAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPlusAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeAdditiveOperatorContext extends JinjaAdditiveOperatorContext {
		public TerminalNode JINJA_TILDE() { return getToken(JinjaParser.JINJA_TILDE, 0); }
		public TildeAdditiveOperatorContext(JinjaAdditiveOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTildeAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTildeAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTildeAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusAdditiveOperatorContext extends JinjaAdditiveOperatorContext {
		public TerminalNode JINJA_MINUS() { return getToken(JinjaParser.JINJA_MINUS, 0); }
		public MinusAdditiveOperatorContext(JinjaAdditiveOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMinusAdditiveOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMinusAdditiveOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMinusAdditiveOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaAdditiveOperatorContext jinjaAdditiveOperator() throws RecognitionException {
		JinjaAdditiveOperatorContext _localctx = new JinjaAdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jinjaAdditiveOperator);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_PLUS:
				_localctx = new PlusAdditiveOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(JINJA_PLUS);
				}
				break;
			case JINJA_MINUS:
				_localctx = new MinusAdditiveOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				match(JINJA_MINUS);
				}
				break;
			case JINJA_TILDE:
				_localctx = new TildeAdditiveOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				match(JINJA_TILDE);
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
	public static class JinjaMultiplicativeContext extends ParserRuleContext {
		public JinjaPowerContext jinjaPower() {
			return getRuleContext(JinjaPowerContext.class,0);
		}
		public List<JinjaMultiplicativeTailContext> jinjaMultiplicativeTail() {
			return getRuleContexts(JinjaMultiplicativeTailContext.class);
		}
		public JinjaMultiplicativeTailContext jinjaMultiplicativeTail(int i) {
			return getRuleContext(JinjaMultiplicativeTailContext.class,i);
		}
		public JinjaMultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMultiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMultiplicativeContext jinjaMultiplicative() throws RecognitionException {
		JinjaMultiplicativeContext _localctx = new JinjaMultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jinjaMultiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			jinjaPower();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) {
				{
				{
				setState(368);
				jinjaMultiplicativeTail();
				}
				}
				setState(373);
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
	public static class JinjaMultiplicativeTailContext extends ParserRuleContext {
		public JinjaMultiplicativeOperatorContext jinjaMultiplicativeOperator() {
			return getRuleContext(JinjaMultiplicativeOperatorContext.class,0);
		}
		public JinjaPowerContext jinjaPower() {
			return getRuleContext(JinjaPowerContext.class,0);
		}
		public JinjaMultiplicativeTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMultiplicativeTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaMultiplicativeTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaMultiplicativeTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaMultiplicativeTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMultiplicativeTailContext jinjaMultiplicativeTail() throws RecognitionException {
		JinjaMultiplicativeTailContext _localctx = new JinjaMultiplicativeTailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jinjaMultiplicativeTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			jinjaMultiplicativeOperator();
			setState(375);
			jinjaPower();
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
	public static class JinjaMultiplicativeOperatorContext extends ParserRuleContext {
		public JinjaMultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMultiplicativeOperator; }
	 
		public JinjaMultiplicativeOperatorContext() { }
		public void copyFrom(JinjaMultiplicativeOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloorDivMultiplicativeOperatorContext extends JinjaMultiplicativeOperatorContext {
		public TerminalNode JINJA_FLOORDIV() { return getToken(JinjaParser.JINJA_FLOORDIV, 0); }
		public FloorDivMultiplicativeOperatorContext(JinjaMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFloorDivMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFloorDivMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFloorDivMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModMultiplicativeOperatorContext extends JinjaMultiplicativeOperatorContext {
		public TerminalNode JINJA_MOD() { return getToken(JinjaParser.JINJA_MOD, 0); }
		public ModMultiplicativeOperatorContext(JinjaMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterModMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitModMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitModMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SlashMultiplicativeOperatorContext extends JinjaMultiplicativeOperatorContext {
		public TerminalNode JINJA_SLASH() { return getToken(JinjaParser.JINJA_SLASH, 0); }
		public SlashMultiplicativeOperatorContext(JinjaMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSlashMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSlashMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSlashMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StarMultiplicativeOperatorContext extends JinjaMultiplicativeOperatorContext {
		public TerminalNode JINJA_STAR() { return getToken(JinjaParser.JINJA_STAR, 0); }
		public StarMultiplicativeOperatorContext(JinjaMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStarMultiplicativeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStarMultiplicativeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStarMultiplicativeOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMultiplicativeOperatorContext jinjaMultiplicativeOperator() throws RecognitionException {
		JinjaMultiplicativeOperatorContext _localctx = new JinjaMultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_jinjaMultiplicativeOperator);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_STAR:
				_localctx = new StarMultiplicativeOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(JINJA_STAR);
				}
				break;
			case JINJA_SLASH:
				_localctx = new SlashMultiplicativeOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(JINJA_SLASH);
				}
				break;
			case JINJA_FLOORDIV:
				_localctx = new FloorDivMultiplicativeOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(JINJA_FLOORDIV);
				}
				break;
			case JINJA_MOD:
				_localctx = new ModMultiplicativeOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(JINJA_MOD);
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
	public static class JinjaPowerContext extends ParserRuleContext {
		public JinjaUnaryContext base;
		public JinjaUnaryContext jinjaUnary;
		public List<JinjaUnaryContext> exponents = new ArrayList<JinjaUnaryContext>();
		public List<JinjaUnaryContext> jinjaUnary() {
			return getRuleContexts(JinjaUnaryContext.class);
		}
		public JinjaUnaryContext jinjaUnary(int i) {
			return getRuleContext(JinjaUnaryContext.class,i);
		}
		public List<TerminalNode> JINJA_POW() { return getTokens(JinjaParser.JINJA_POW); }
		public TerminalNode JINJA_POW(int i) {
			return getToken(JinjaParser.JINJA_POW, i);
		}
		public JinjaPowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPowerContext jinjaPower() throws RecognitionException {
		JinjaPowerContext _localctx = new JinjaPowerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_jinjaPower);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			((JinjaPowerContext)_localctx).base = jinjaUnary();
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_POW) {
				{
				{
				setState(384);
				match(JINJA_POW);
				setState(385);
				((JinjaPowerContext)_localctx).jinjaUnary = jinjaUnary();
				((JinjaPowerContext)_localctx).exponents.add(((JinjaPowerContext)_localctx).jinjaUnary);
				}
				}
				setState(390);
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
	public static class JinjaUnaryContext extends ParserRuleContext {
		public JinjaUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaUnary; }
	 
		public JinjaUnaryContext() { }
		public void copyFrom(JinjaUnaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostfixExprContext extends JinjaUnaryContext {
		public JinjaPostfixContext jinjaPostfix() {
			return getRuleContext(JinjaPostfixContext.class,0);
		}
		public PostfixExprContext(JinjaUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPostfixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPostfixExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryPrefixExprContext extends JinjaUnaryContext {
		public JinjaUnaryPrefixContext jinjaUnaryPrefix() {
			return getRuleContext(JinjaUnaryPrefixContext.class,0);
		}
		public UnaryPrefixExprContext(JinjaUnaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterUnaryPrefixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitUnaryPrefixExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitUnaryPrefixExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaUnaryContext jinjaUnary() throws RecognitionException {
		JinjaUnaryContext _localctx = new JinjaUnaryContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_jinjaUnary);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_PLUS:
			case JINJA_MINUS:
				_localctx = new UnaryPrefixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				jinjaUnaryPrefix();
				}
				break;
			case JINJA_LPAREN:
			case JINJA_LBRACK:
			case JINJA_LBRACE:
			case JINJA_TRUE:
			case JINJA_FALSE:
			case JINJA_NONE:
			case JINJA_STRING:
			case JINJA_INTEGER:
			case JINJA_FLOAT:
			case JINJA_IDENTIFIER:
				_localctx = new PostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				jinjaPostfix();
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
	public static class JinjaUnaryPrefixContext extends ParserRuleContext {
		public JinjaUnaryOperatorContext jinjaUnaryOperator() {
			return getRuleContext(JinjaUnaryOperatorContext.class,0);
		}
		public JinjaUnaryContext jinjaUnary() {
			return getRuleContext(JinjaUnaryContext.class,0);
		}
		public JinjaUnaryPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaUnaryPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaUnaryPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaUnaryPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaUnaryPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaUnaryPrefixContext jinjaUnaryPrefix() throws RecognitionException {
		JinjaUnaryPrefixContext _localctx = new JinjaUnaryPrefixContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_jinjaUnaryPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			jinjaUnaryOperator();
			setState(396);
			jinjaUnary();
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
	public static class JinjaUnaryOperatorContext extends ParserRuleContext {
		public JinjaUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaUnaryOperator; }
	 
		public JinjaUnaryOperatorContext() { }
		public void copyFrom(JinjaUnaryOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusUnaryOperatorContext extends JinjaUnaryOperatorContext {
		public TerminalNode JINJA_MINUS() { return getToken(JinjaParser.JINJA_MINUS, 0); }
		public MinusUnaryOperatorContext(JinjaUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMinusUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMinusUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMinusUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusUnaryOperatorContext extends JinjaUnaryOperatorContext {
		public TerminalNode JINJA_PLUS() { return getToken(JinjaParser.JINJA_PLUS, 0); }
		public PlusUnaryOperatorContext(JinjaUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPlusUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPlusUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPlusUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaUnaryOperatorContext jinjaUnaryOperator() throws RecognitionException {
		JinjaUnaryOperatorContext _localctx = new JinjaUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_jinjaUnaryOperator);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_PLUS:
				_localctx = new PlusUnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(JINJA_PLUS);
				}
				break;
			case JINJA_MINUS:
				_localctx = new MinusUnaryOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(JINJA_MINUS);
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
	public static class JinjaPostfixContext extends ParserRuleContext {
		public JinjaPrimaryContext base;
		public JinjaPostfixPartContext jinjaPostfixPart;
		public List<JinjaPostfixPartContext> parts = new ArrayList<JinjaPostfixPartContext>();
		public JinjaPrimaryContext jinjaPrimary() {
			return getRuleContext(JinjaPrimaryContext.class,0);
		}
		public List<JinjaPostfixPartContext> jinjaPostfixPart() {
			return getRuleContexts(JinjaPostfixPartContext.class);
		}
		public JinjaPostfixPartContext jinjaPostfixPart(int i) {
			return getRuleContext(JinjaPostfixPartContext.class,i);
		}
		public JinjaPostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPostfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPostfixContext jinjaPostfix() throws RecognitionException {
		JinjaPostfixContext _localctx = new JinjaPostfixContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jinjaPostfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			((JinjaPostfixContext)_localctx).base = jinjaPrimary();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & 1105L) != 0)) {
				{
				{
				setState(403);
				((JinjaPostfixContext)_localctx).jinjaPostfixPart = jinjaPostfixPart();
				((JinjaPostfixContext)_localctx).parts.add(((JinjaPostfixContext)_localctx).jinjaPostfixPart);
				}
				}
				setState(408);
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
	public static class JinjaPostfixPartContext extends ParserRuleContext {
		public JinjaPostfixPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPostfixPart; }
	 
		public JinjaPostfixPartContext() { }
		public void copyFrom(JinjaPostfixPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterApplicationContext extends JinjaPostfixPartContext {
		public TerminalNode JINJA_PIPE() { return getToken(JinjaParser.JINJA_PIPE, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(JinjaParser.JINJA_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(JinjaParser.JINJA_RPAREN, 0); }
		public JinjaArgumentListContext jinjaArgumentList() {
			return getRuleContext(JinjaArgumentListContext.class,0);
		}
		public FilterApplicationContext(JinjaPostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFilterApplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFilterApplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFilterApplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends JinjaPostfixPartContext {
		public TerminalNode JINJA_LBRACK() { return getToken(JinjaParser.JINJA_LBRACK, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public TerminalNode JINJA_RBRACK() { return getToken(JinjaParser.JINJA_RBRACK, 0); }
		public SubscriptContext(JinjaPostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeAccessContext extends JinjaPostfixPartContext {
		public TerminalNode JINJA_DOT() { return getToken(JinjaParser.JINJA_DOT, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public AttributeAccessContext(JinjaPostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterAttributeAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitAttributeAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitAttributeAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends JinjaPostfixPartContext {
		public TerminalNode JINJA_LPAREN() { return getToken(JinjaParser.JINJA_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(JinjaParser.JINJA_RPAREN, 0); }
		public JinjaArgumentListContext jinjaArgumentList() {
			return getRuleContext(JinjaArgumentListContext.class,0);
		}
		public FunctionCallContext(JinjaPostfixPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPostfixPartContext jinjaPostfixPart() throws RecognitionException {
		JinjaPostfixPartContext _localctx = new JinjaPostfixPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_jinjaPostfixPart);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_DOT:
				_localctx = new AttributeAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				match(JINJA_DOT);
				setState(410);
				match(JINJA_IDENTIFIER);
				}
				break;
			case JINJA_LBRACK:
				_localctx = new SubscriptContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				match(JINJA_LBRACK);
				setState(412);
				jinjaExpr();
				setState(413);
				match(JINJA_RBRACK);
				}
				break;
			case JINJA_LPAREN:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				match(JINJA_LPAREN);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 65971025018901L) != 0)) {
					{
					setState(416);
					jinjaArgumentList();
					}
				}

				setState(419);
				match(JINJA_RPAREN);
				}
				break;
			case JINJA_PIPE:
				_localctx = new FilterApplicationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				match(JINJA_PIPE);
				setState(421);
				match(JINJA_IDENTIFIER);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(422);
					match(JINJA_LPAREN);
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 65971025018901L) != 0)) {
						{
						setState(423);
						jinjaArgumentList();
						}
					}

					setState(426);
					match(JINJA_RPAREN);
					}
					break;
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
	public static class JinjaPrimaryContext extends ParserRuleContext {
		public JinjaPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaPrimary; }
	 
		public JinjaPrimaryContext() { }
		public void copyFrom(JinjaPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NonePrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_NONE() { return getToken(JinjaParser.JINJA_NONE, 0); }
		public NonePrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterNonePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitNonePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitNonePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_FLOAT() { return getToken(JinjaParser.JINJA_FLOAT, 0); }
		public FloatPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFloatPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFloatPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFloatPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_LBRACK() { return getToken(JinjaParser.JINJA_LBRACK, 0); }
		public TerminalNode JINJA_RBRACK() { return getToken(JinjaParser.JINJA_RBRACK, 0); }
		public JinjaExprListContext jinjaExprList() {
			return getRuleContext(JinjaExprListContext.class,0);
		}
		public ListPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterListPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitListPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitListPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public StringPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterStringPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitStringPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitStringPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TruePrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_TRUE() { return getToken(JinjaParser.JINJA_TRUE, 0); }
		public TruePrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTruePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTruePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTruePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public IdentifierPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIdentifierPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIdentifierPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIdentifierPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_INTEGER() { return getToken(JinjaParser.JINJA_INTEGER, 0); }
		public IntegerPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIntegerPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIntegerPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIntegerPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_LPAREN() { return getToken(JinjaParser.JINJA_LPAREN, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public TerminalNode JINJA_RPAREN() { return getToken(JinjaParser.JINJA_RPAREN, 0); }
		public ParenPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterParenPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitParenPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitParenPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalsePrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_FALSE() { return getToken(JinjaParser.JINJA_FALSE, 0); }
		public FalsePrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFalsePrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFalsePrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFalsePrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DictPrimaryContext extends JinjaPrimaryContext {
		public TerminalNode JINJA_LBRACE() { return getToken(JinjaParser.JINJA_LBRACE, 0); }
		public TerminalNode JINJA_RBRACE() { return getToken(JinjaParser.JINJA_RBRACE, 0); }
		public JinjaDictEntryListContext jinjaDictEntryList() {
			return getRuleContext(JinjaDictEntryListContext.class,0);
		}
		public DictPrimaryContext(JinjaPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDictPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDictPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDictPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaPrimaryContext jinjaPrimary() throws RecognitionException {
		JinjaPrimaryContext _localctx = new JinjaPrimaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_jinjaPrimary);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_IDENTIFIER:
				_localctx = new IdentifierPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(JINJA_IDENTIFIER);
				}
				break;
			case JINJA_STRING:
				_localctx = new StringPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				match(JINJA_STRING);
				}
				break;
			case JINJA_INTEGER:
				_localctx = new IntegerPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(JINJA_INTEGER);
				}
				break;
			case JINJA_FLOAT:
				_localctx = new FloatPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(JINJA_FLOAT);
				}
				break;
			case JINJA_TRUE:
				_localctx = new TruePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(435);
				match(JINJA_TRUE);
				}
				break;
			case JINJA_FALSE:
				_localctx = new FalsePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(JINJA_FALSE);
				}
				break;
			case JINJA_NONE:
				_localctx = new NonePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				match(JINJA_NONE);
				}
				break;
			case JINJA_LPAREN:
				_localctx = new ParenPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(438);
				match(JINJA_LPAREN);
				setState(439);
				jinjaExpr();
				setState(440);
				match(JINJA_RPAREN);
				}
				break;
			case JINJA_LBRACK:
				_localctx = new ListPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(442);
				match(JINJA_LBRACK);
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 65971025018901L) != 0)) {
					{
					setState(443);
					jinjaExprList();
					}
				}

				setState(446);
				match(JINJA_RBRACK);
				}
				break;
			case JINJA_LBRACE:
				_localctx = new DictPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(447);
				match(JINJA_LBRACE);
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 65971025018901L) != 0)) {
					{
					setState(448);
					jinjaDictEntryList();
					}
				}

				setState(451);
				match(JINJA_RBRACE);
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
	public static class JinjaArgumentListContext extends ParserRuleContext {
		public JinjaArgumentContext jinjaArgument;
		public List<JinjaArgumentContext> items = new ArrayList<JinjaArgumentContext>();
		public List<JinjaArgumentContext> jinjaArgument() {
			return getRuleContexts(JinjaArgumentContext.class);
		}
		public JinjaArgumentContext jinjaArgument(int i) {
			return getRuleContext(JinjaArgumentContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaArgumentListContext jinjaArgumentList() throws RecognitionException {
		JinjaArgumentListContext _localctx = new JinjaArgumentListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_jinjaArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			((JinjaArgumentListContext)_localctx).jinjaArgument = jinjaArgument();
			((JinjaArgumentListContext)_localctx).items.add(((JinjaArgumentListContext)_localctx).jinjaArgument);
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(455);
				match(JINJA_COMMA);
				setState(456);
				((JinjaArgumentListContext)_localctx).jinjaArgument = jinjaArgument();
				((JinjaArgumentListContext)_localctx).items.add(((JinjaArgumentListContext)_localctx).jinjaArgument);
				}
				}
				setState(461);
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
	public static class JinjaArgumentContext extends ParserRuleContext {
		public JinjaArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaArgument; }
	 
		public JinjaArgumentContext() { }
		public void copyFrom(JinjaArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PositionalArgumentContext extends JinjaArgumentContext {
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public PositionalArgumentContext(JinjaArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KeywordArgumentContext extends JinjaArgumentContext {
		public Token key;
		public JinjaExprContext value;
		public TerminalNode JINJA_ASSIGN() { return getToken(JinjaParser.JINJA_ASSIGN, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public KeywordArgumentContext(JinjaArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterKeywordArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitKeywordArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitKeywordArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaArgumentContext jinjaArgument() throws RecognitionException {
		JinjaArgumentContext _localctx = new JinjaArgumentContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_jinjaArgument);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				_localctx = new KeywordArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				((KeywordArgumentContext)_localctx).key = match(JINJA_IDENTIFIER);
				setState(463);
				match(JINJA_ASSIGN);
				setState(464);
				((KeywordArgumentContext)_localctx).value = jinjaExpr();
				}
				break;
			case 2:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				jinjaExpr();
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
	public static class JinjaDictEntryListContext extends ParserRuleContext {
		public JinjaDictEntryContext jinjaDictEntry;
		public List<JinjaDictEntryContext> items = new ArrayList<JinjaDictEntryContext>();
		public List<JinjaDictEntryContext> jinjaDictEntry() {
			return getRuleContexts(JinjaDictEntryContext.class);
		}
		public JinjaDictEntryContext jinjaDictEntry(int i) {
			return getRuleContext(JinjaDictEntryContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaDictEntryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaDictEntryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaDictEntryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaDictEntryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaDictEntryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaDictEntryListContext jinjaDictEntryList() throws RecognitionException {
		JinjaDictEntryListContext _localctx = new JinjaDictEntryListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jinjaDictEntryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			((JinjaDictEntryListContext)_localctx).jinjaDictEntry = jinjaDictEntry();
			((JinjaDictEntryListContext)_localctx).items.add(((JinjaDictEntryListContext)_localctx).jinjaDictEntry);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(469);
				match(JINJA_COMMA);
				setState(470);
				((JinjaDictEntryListContext)_localctx).jinjaDictEntry = jinjaDictEntry();
				((JinjaDictEntryListContext)_localctx).items.add(((JinjaDictEntryListContext)_localctx).jinjaDictEntry);
				}
				}
				setState(475);
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
	public static class JinjaDictEntryContext extends ParserRuleContext {
		public JinjaExprContext key;
		public JinjaExprContext value;
		public TerminalNode JINJA_COLON() { return getToken(JinjaParser.JINJA_COLON, 0); }
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public JinjaDictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaDictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaDictEntryContext jinjaDictEntry() throws RecognitionException {
		JinjaDictEntryContext _localctx = new JinjaDictEntryContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_jinjaDictEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			((JinjaDictEntryContext)_localctx).key = jinjaExpr();
			setState(477);
			match(JINJA_COLON);
			setState(478);
			((JinjaDictEntryContext)_localctx).value = jinjaExpr();
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
	public static class JinjaSimpleStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_OPEN() { return getToken(JinjaParser.JINJA_STMT_OPEN, 0); }
		public JinjaSimpleStatementInnerContext jinjaSimpleStatementInner() {
			return getRuleContext(JinjaSimpleStatementInnerContext.class,0);
		}
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(JinjaParser.JINJA_STMT_CLOSE, 0); }
		public JinjaSimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSimpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaSimpleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaSimpleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSimpleStatementContext jinjaSimpleStatement() throws RecognitionException {
		JinjaSimpleStatementContext _localctx = new JinjaSimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_jinjaSimpleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(JINJA_STMT_OPEN);
			setState(481);
			jinjaSimpleStatementInner();
			setState(482);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaSimpleStatementInnerContext extends ParserRuleContext {
		public JinjaSimpleStatementInnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSimpleStatementInner; }
	 
		public JinjaSimpleStatementInnerContext() { }
		public void copyFrom(JinjaSimpleStatementInnerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromImportStatementContext extends JinjaSimpleStatementInnerContext {
		public Token module;
		public Token JINJA_IDENTIFIER;
		public List<Token> importedNames = new ArrayList<Token>();
		public TerminalNode JINJA_STMT_FROM() { return getToken(JinjaParser.JINJA_STMT_FROM, 0); }
		public TerminalNode JINJA_STMT_IMPORT() { return getToken(JinjaParser.JINJA_STMT_IMPORT, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public List<TerminalNode> JINJA_IDENTIFIER() { return getTokens(JinjaParser.JINJA_IDENTIFIER); }
		public TerminalNode JINJA_IDENTIFIER(int i) {
			return getToken(JinjaParser.JINJA_IDENTIFIER, i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public FromImportStatementContext(JinjaSimpleStatementInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFromImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFromImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFromImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncludeStatementContext extends JinjaSimpleStatementInnerContext {
		public TerminalNode JINJA_STMT_INCLUDE() { return getToken(JinjaParser.JINJA_STMT_INCLUDE, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public IncludeStatementContext(JinjaSimpleStatementInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIncludeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIncludeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIncludeStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExtendsStatementContext extends JinjaSimpleStatementInnerContext {
		public Token module;
		public TerminalNode JINJA_STMT_EXTENDS() { return getToken(JinjaParser.JINJA_STMT_EXTENDS, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public ExtendsStatementContext(JinjaSimpleStatementInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterExtendsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitExtendsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitExtendsStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends JinjaSimpleStatementInnerContext {
		public Token module;
		public Token alias;
		public TerminalNode JINJA_STMT_IMPORT() { return getToken(JinjaParser.JINJA_STMT_IMPORT, 0); }
		public TerminalNode JINJA_STRING() { return getToken(JinjaParser.JINJA_STRING, 0); }
		public TerminalNode JINJA_STMT_AS() { return getToken(JinjaParser.JINJA_STMT_AS, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public ImportStatementContext(JinjaSimpleStatementInnerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSimpleStatementInnerContext jinjaSimpleStatementInner() throws RecognitionException {
		JinjaSimpleStatementInnerContext _localctx = new JinjaSimpleStatementInnerContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_jinjaSimpleStatementInner);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_STMT_EXTENDS:
				_localctx = new ExtendsStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(JINJA_STMT_EXTENDS);
				setState(485);
				((ExtendsStatementContext)_localctx).module = match(JINJA_STRING);
				}
				break;
			case JINJA_STMT_INCLUDE:
				_localctx = new IncludeStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(JINJA_STMT_INCLUDE);
				setState(487);
				_la = _input.LA(1);
				if ( !(_la==JINJA_STRING || _la==JINJA_IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case JINJA_STMT_IMPORT:
				_localctx = new ImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				match(JINJA_STMT_IMPORT);
				setState(489);
				((ImportStatementContext)_localctx).module = match(JINJA_STRING);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==JINJA_STMT_AS) {
					{
					setState(490);
					match(JINJA_STMT_AS);
					setState(491);
					((ImportStatementContext)_localctx).alias = match(JINJA_IDENTIFIER);
					}
				}

				}
				break;
			case JINJA_STMT_FROM:
				_localctx = new FromImportStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(JINJA_STMT_FROM);
				setState(495);
				((FromImportStatementContext)_localctx).module = match(JINJA_STRING);
				setState(496);
				match(JINJA_STMT_IMPORT);
				{
				setState(497);
				((FromImportStatementContext)_localctx).JINJA_IDENTIFIER = match(JINJA_IDENTIFIER);
				((FromImportStatementContext)_localctx).importedNames.add(((FromImportStatementContext)_localctx).JINJA_IDENTIFIER);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==JINJA_COMMA) {
					{
					{
					setState(498);
					match(JINJA_COMMA);
					setState(499);
					((FromImportStatementContext)_localctx).JINJA_IDENTIFIER = match(JINJA_IDENTIFIER);
					((FromImportStatementContext)_localctx).importedNames.add(((FromImportStatementContext)_localctx).JINJA_IDENTIFIER);
					}
					}
					setState(504);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class JinjaBlockStatementContext extends ParserRuleContext {
		public Token blockName;
		public TemplateBodyContext body;
		public Token closeName;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_BLOCK() { return getToken(JinjaParser.JINJA_STMT_BLOCK, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDBLOCK() { return getToken(JinjaParser.JINJA_STMT_ENDBLOCK, 0); }
		public List<TerminalNode> JINJA_IDENTIFIER() { return getTokens(JinjaParser.JINJA_IDENTIFIER); }
		public TerminalNode JINJA_IDENTIFIER(int i) {
			return getToken(JinjaParser.JINJA_IDENTIFIER, i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaBlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaBlockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaBlockStatementContext jinjaBlockStatement() throws RecognitionException {
		JinjaBlockStatementContext _localctx = new JinjaBlockStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_jinjaBlockStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(JINJA_STMT_OPEN);
			setState(508);
			match(JINJA_STMT_BLOCK);
			setState(509);
			((JinjaBlockStatementContext)_localctx).blockName = match(JINJA_IDENTIFIER);
			setState(510);
			match(JINJA_STMT_CLOSE);
			setState(511);
			((JinjaBlockStatementContext)_localctx).body = templateBody();
			setState(512);
			match(JINJA_STMT_OPEN);
			setState(513);
			match(JINJA_STMT_ENDBLOCK);
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IDENTIFIER) {
				{
				setState(514);
				((JinjaBlockStatementContext)_localctx).closeName = match(JINJA_IDENTIFIER);
				}
			}

			setState(517);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaIfStatementContext extends ParserRuleContext {
		public JinjaExprContext ifCondition;
		public TemplateBodyContext ifBody;
		public JinjaExprContext jinjaExpr;
		public List<JinjaExprContext> elifConditions = new ArrayList<JinjaExprContext>();
		public TemplateBodyContext templateBody;
		public List<TemplateBodyContext> elifBodies = new ArrayList<TemplateBodyContext>();
		public TemplateBodyContext elseBody;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_IF() { return getToken(JinjaParser.JINJA_STMT_IF, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDIF() { return getToken(JinjaParser.JINJA_STMT_ENDIF, 0); }
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<TemplateBodyContext> templateBody() {
			return getRuleContexts(TemplateBodyContext.class);
		}
		public TemplateBodyContext templateBody(int i) {
			return getRuleContext(TemplateBodyContext.class,i);
		}
		public List<TerminalNode> JINJA_STMT_ELIF() { return getTokens(JinjaParser.JINJA_STMT_ELIF); }
		public TerminalNode JINJA_STMT_ELIF(int i) {
			return getToken(JinjaParser.JINJA_STMT_ELIF, i);
		}
		public TerminalNode JINJA_STMT_ELSE() { return getToken(JinjaParser.JINJA_STMT_ELSE, 0); }
		public JinjaIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaIfStatementContext jinjaIfStatement() throws RecognitionException {
		JinjaIfStatementContext _localctx = new JinjaIfStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_jinjaIfStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(JINJA_STMT_OPEN);
			setState(520);
			match(JINJA_STMT_IF);
			setState(521);
			((JinjaIfStatementContext)_localctx).ifCondition = jinjaExpr();
			setState(522);
			match(JINJA_STMT_CLOSE);
			setState(523);
			((JinjaIfStatementContext)_localctx).ifBody = templateBody();
			setState(532);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(524);
					match(JINJA_STMT_OPEN);
					setState(525);
					match(JINJA_STMT_ELIF);
					setState(526);
					((JinjaIfStatementContext)_localctx).jinjaExpr = jinjaExpr();
					((JinjaIfStatementContext)_localctx).elifConditions.add(((JinjaIfStatementContext)_localctx).jinjaExpr);
					setState(527);
					match(JINJA_STMT_CLOSE);
					setState(528);
					((JinjaIfStatementContext)_localctx).templateBody = templateBody();
					((JinjaIfStatementContext)_localctx).elifBodies.add(((JinjaIfStatementContext)_localctx).templateBody);
					}
					} 
				}
				setState(534);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(539);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(535);
				match(JINJA_STMT_OPEN);
				setState(536);
				match(JINJA_STMT_ELSE);
				setState(537);
				match(JINJA_STMT_CLOSE);
				setState(538);
				((JinjaIfStatementContext)_localctx).elseBody = templateBody();
				}
				break;
			}
			setState(541);
			match(JINJA_STMT_OPEN);
			setState(542);
			match(JINJA_STMT_ENDIF);
			setState(543);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaForStatementContext extends ParserRuleContext {
		public JinjaForTargetContext target;
		public JinjaExprListContext iterable;
		public TemplateBodyContext body;
		public TemplateBodyContext elseBody;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_FOR() { return getToken(JinjaParser.JINJA_STMT_FOR, 0); }
		public TerminalNode JINJA_IN() { return getToken(JinjaParser.JINJA_IN, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDFOR() { return getToken(JinjaParser.JINJA_STMT_ENDFOR, 0); }
		public JinjaForTargetContext jinjaForTarget() {
			return getRuleContext(JinjaForTargetContext.class,0);
		}
		public JinjaExprListContext jinjaExprList() {
			return getRuleContext(JinjaExprListContext.class,0);
		}
		public List<TemplateBodyContext> templateBody() {
			return getRuleContexts(TemplateBodyContext.class);
		}
		public TemplateBodyContext templateBody(int i) {
			return getRuleContext(TemplateBodyContext.class,i);
		}
		public TerminalNode JINJA_STMT_RECURSIVE() { return getToken(JinjaParser.JINJA_STMT_RECURSIVE, 0); }
		public TerminalNode JINJA_STMT_ELSE() { return getToken(JinjaParser.JINJA_STMT_ELSE, 0); }
		public JinjaForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForStatementContext jinjaForStatement() throws RecognitionException {
		JinjaForStatementContext _localctx = new JinjaForStatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_jinjaForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(JINJA_STMT_OPEN);
			setState(546);
			match(JINJA_STMT_FOR);
			setState(547);
			((JinjaForStatementContext)_localctx).target = jinjaForTarget();
			setState(548);
			match(JINJA_IN);
			setState(549);
			((JinjaForStatementContext)_localctx).iterable = jinjaExprList();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_STMT_RECURSIVE) {
				{
				setState(550);
				match(JINJA_STMT_RECURSIVE);
				}
			}

			setState(553);
			match(JINJA_STMT_CLOSE);
			setState(554);
			((JinjaForStatementContext)_localctx).body = templateBody();
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(555);
				match(JINJA_STMT_OPEN);
				setState(556);
				match(JINJA_STMT_ELSE);
				setState(557);
				match(JINJA_STMT_CLOSE);
				setState(558);
				((JinjaForStatementContext)_localctx).elseBody = templateBody();
				}
				break;
			}
			setState(561);
			match(JINJA_STMT_OPEN);
			setState(562);
			match(JINJA_STMT_ENDFOR);
			setState(563);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaForTargetContext extends ParserRuleContext {
		public JinjaExprContext jinjaExpr;
		public List<JinjaExprContext> items = new ArrayList<JinjaExprContext>();
		public List<JinjaExprContext> jinjaExpr() {
			return getRuleContexts(JinjaExprContext.class);
		}
		public JinjaExprContext jinjaExpr(int i) {
			return getRuleContext(JinjaExprContext.class,i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaForTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaForTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaForTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaForTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaForTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaForTargetContext jinjaForTarget() throws RecognitionException {
		JinjaForTargetContext _localctx = new JinjaForTargetContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jinjaForTarget);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			((JinjaForTargetContext)_localctx).jinjaExpr = jinjaExpr();
			((JinjaForTargetContext)_localctx).items.add(((JinjaForTargetContext)_localctx).jinjaExpr);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(566);
				match(JINJA_COMMA);
				setState(567);
				((JinjaForTargetContext)_localctx).jinjaExpr = jinjaExpr();
				((JinjaForTargetContext)_localctx).items.add(((JinjaForTargetContext)_localctx).jinjaExpr);
				}
				}
				setState(572);
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
	public static class JinjaSetStatementContext extends ParserRuleContext {
		public JinjaSetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaSetStatement; }
	 
		public JinjaSetStatementContext() { }
		public void copyFrom(JinjaSetStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InlineSetStatementContext extends JinjaSetStatementContext {
		public Token name;
		public JinjaExprContext value;
		public TerminalNode JINJA_STMT_OPEN() { return getToken(JinjaParser.JINJA_STMT_OPEN, 0); }
		public TerminalNode JINJA_STMT_SET() { return getToken(JinjaParser.JINJA_STMT_SET, 0); }
		public TerminalNode JINJA_ASSIGN() { return getToken(JinjaParser.JINJA_ASSIGN, 0); }
		public TerminalNode JINJA_STMT_CLOSE() { return getToken(JinjaParser.JINJA_STMT_CLOSE, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public InlineSetStatementContext(JinjaSetStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterInlineSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitInlineSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitInlineSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockSetStatementContext extends JinjaSetStatementContext {
		public Token name;
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_SET() { return getToken(JinjaParser.JINJA_STMT_SET, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDSET() { return getToken(JinjaParser.JINJA_STMT_ENDSET, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public BlockSetStatementContext(JinjaSetStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBlockSetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBlockSetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBlockSetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaSetStatementContext jinjaSetStatement() throws RecognitionException {
		JinjaSetStatementContext _localctx = new JinjaSetStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jinjaSetStatement);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new InlineSetStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(JINJA_STMT_OPEN);
				setState(574);
				match(JINJA_STMT_SET);
				setState(575);
				((InlineSetStatementContext)_localctx).name = match(JINJA_IDENTIFIER);
				setState(576);
				match(JINJA_ASSIGN);
				setState(577);
				((InlineSetStatementContext)_localctx).value = jinjaExpr();
				setState(578);
				match(JINJA_STMT_CLOSE);
				}
				break;
			case 2:
				_localctx = new BlockSetStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(JINJA_STMT_OPEN);
				setState(581);
				match(JINJA_STMT_SET);
				setState(582);
				((BlockSetStatementContext)_localctx).name = match(JINJA_IDENTIFIER);
				setState(583);
				match(JINJA_STMT_CLOSE);
				setState(584);
				((BlockSetStatementContext)_localctx).body = templateBody();
				setState(585);
				match(JINJA_STMT_OPEN);
				setState(586);
				match(JINJA_STMT_ENDSET);
				setState(587);
				match(JINJA_STMT_CLOSE);
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
	public static class JinjaWithStatementContext extends ParserRuleContext {
		public JinjaWithItemContext jinjaWithItem;
		public List<JinjaWithItemContext> items = new ArrayList<JinjaWithItemContext>();
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_WITH() { return getToken(JinjaParser.JINJA_STMT_WITH, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDWITH() { return getToken(JinjaParser.JINJA_STMT_ENDWITH, 0); }
		public List<JinjaWithItemContext> jinjaWithItem() {
			return getRuleContexts(JinjaWithItemContext.class);
		}
		public JinjaWithItemContext jinjaWithItem(int i) {
			return getRuleContext(JinjaWithItemContext.class,i);
		}
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaWithStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaWithStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaWithStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaWithStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaWithStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaWithStatementContext jinjaWithStatement() throws RecognitionException {
		JinjaWithStatementContext _localctx = new JinjaWithStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jinjaWithStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(JINJA_STMT_OPEN);
			setState(592);
			match(JINJA_STMT_WITH);
			setState(593);
			((JinjaWithStatementContext)_localctx).jinjaWithItem = jinjaWithItem();
			((JinjaWithStatementContext)_localctx).items.add(((JinjaWithStatementContext)_localctx).jinjaWithItem);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(594);
				match(JINJA_COMMA);
				setState(595);
				((JinjaWithStatementContext)_localctx).jinjaWithItem = jinjaWithItem();
				((JinjaWithStatementContext)_localctx).items.add(((JinjaWithStatementContext)_localctx).jinjaWithItem);
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			match(JINJA_STMT_CLOSE);
			setState(602);
			((JinjaWithStatementContext)_localctx).body = templateBody();
			setState(603);
			match(JINJA_STMT_OPEN);
			setState(604);
			match(JINJA_STMT_ENDWITH);
			setState(605);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaWithItemContext extends ParserRuleContext {
		public JinjaWithItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaWithItem; }
	 
		public JinjaWithItemContext() { }
		public void copyFrom(JinjaWithItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignedWithItemContext extends JinjaWithItemContext {
		public Token name;
		public JinjaExprContext value;
		public TerminalNode JINJA_ASSIGN() { return getToken(JinjaParser.JINJA_ASSIGN, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public AssignedWithItemContext(JinjaWithItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterAssignedWithItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitAssignedWithItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitAssignedWithItem(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleWithItemContext extends JinjaWithItemContext {
		public JinjaExprContext value;
		public JinjaExprContext jinjaExpr() {
			return getRuleContext(JinjaExprContext.class,0);
		}
		public SimpleWithItemContext(JinjaWithItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSimpleWithItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSimpleWithItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSimpleWithItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaWithItemContext jinjaWithItem() throws RecognitionException {
		JinjaWithItemContext _localctx = new JinjaWithItemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_jinjaWithItem);
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				_localctx = new AssignedWithItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				((AssignedWithItemContext)_localctx).name = match(JINJA_IDENTIFIER);
				setState(608);
				match(JINJA_ASSIGN);
				setState(609);
				((AssignedWithItemContext)_localctx).value = jinjaExpr();
				}
				break;
			case 2:
				_localctx = new SimpleWithItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(610);
				((SimpleWithItemContext)_localctx).value = jinjaExpr();
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
	public static class JinjaMacroStatementContext extends ParserRuleContext {
		public Token name;
		public JinjaMacroParamsContext params;
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_MACRO() { return getToken(JinjaParser.JINJA_STMT_MACRO, 0); }
		public TerminalNode JINJA_LPAREN() { return getToken(JinjaParser.JINJA_LPAREN, 0); }
		public TerminalNode JINJA_RPAREN() { return getToken(JinjaParser.JINJA_RPAREN, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDMACRO() { return getToken(JinjaParser.JINJA_STMT_ENDMACRO, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaMacroParamsContext jinjaMacroParams() {
			return getRuleContext(JinjaMacroParamsContext.class,0);
		}
		public JinjaMacroStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMacroStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaMacroStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaMacroStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaMacroStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMacroStatementContext jinjaMacroStatement() throws RecognitionException {
		JinjaMacroStatementContext _localctx = new JinjaMacroStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_jinjaMacroStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(JINJA_STMT_OPEN);
			setState(614);
			match(JINJA_STMT_MACRO);
			setState(615);
			((JinjaMacroStatementContext)_localctx).name = match(JINJA_IDENTIFIER);
			setState(616);
			match(JINJA_LPAREN);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JINJA_IDENTIFIER) {
				{
				setState(617);
				((JinjaMacroStatementContext)_localctx).params = jinjaMacroParams();
				}
			}

			setState(620);
			match(JINJA_RPAREN);
			setState(621);
			match(JINJA_STMT_CLOSE);
			setState(622);
			((JinjaMacroStatementContext)_localctx).body = templateBody();
			setState(623);
			match(JINJA_STMT_OPEN);
			setState(624);
			match(JINJA_STMT_ENDMACRO);
			setState(625);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaMacroParamsContext extends ParserRuleContext {
		public Token JINJA_IDENTIFIER;
		public List<Token> items = new ArrayList<Token>();
		public List<TerminalNode> JINJA_IDENTIFIER() { return getTokens(JinjaParser.JINJA_IDENTIFIER); }
		public TerminalNode JINJA_IDENTIFIER(int i) {
			return getToken(JinjaParser.JINJA_IDENTIFIER, i);
		}
		public List<TerminalNode> JINJA_COMMA() { return getTokens(JinjaParser.JINJA_COMMA); }
		public TerminalNode JINJA_COMMA(int i) {
			return getToken(JinjaParser.JINJA_COMMA, i);
		}
		public JinjaMacroParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaMacroParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaMacroParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaMacroParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaMacroParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaMacroParamsContext jinjaMacroParams() throws RecognitionException {
		JinjaMacroParamsContext _localctx = new JinjaMacroParamsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_jinjaMacroParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			((JinjaMacroParamsContext)_localctx).JINJA_IDENTIFIER = match(JINJA_IDENTIFIER);
			((JinjaMacroParamsContext)_localctx).items.add(((JinjaMacroParamsContext)_localctx).JINJA_IDENTIFIER);
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMA) {
				{
				{
				setState(628);
				match(JINJA_COMMA);
				setState(629);
				((JinjaMacroParamsContext)_localctx).JINJA_IDENTIFIER = match(JINJA_IDENTIFIER);
				((JinjaMacroParamsContext)_localctx).items.add(((JinjaMacroParamsContext)_localctx).JINJA_IDENTIFIER);
				}
				}
				setState(634);
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
	public static class JinjaCallStatementContext extends ParserRuleContext {
		public Token name;
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_CALL() { return getToken(JinjaParser.JINJA_STMT_CALL, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDCALL() { return getToken(JinjaParser.JINJA_STMT_ENDCALL, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCallStatementContext jinjaCallStatement() throws RecognitionException {
		JinjaCallStatementContext _localctx = new JinjaCallStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_jinjaCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(JINJA_STMT_OPEN);
			setState(636);
			match(JINJA_STMT_CALL);
			setState(637);
			((JinjaCallStatementContext)_localctx).name = match(JINJA_IDENTIFIER);
			setState(638);
			match(JINJA_STMT_CLOSE);
			setState(639);
			((JinjaCallStatementContext)_localctx).body = templateBody();
			setState(640);
			match(JINJA_STMT_OPEN);
			setState(641);
			match(JINJA_STMT_ENDCALL);
			setState(642);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaFilterStatementContext extends ParserRuleContext {
		public Token name;
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_FILTER() { return getToken(JinjaParser.JINJA_STMT_FILTER, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDFILTER() { return getToken(JinjaParser.JINJA_STMT_ENDFILTER, 0); }
		public TerminalNode JINJA_IDENTIFIER() { return getToken(JinjaParser.JINJA_IDENTIFIER, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaFilterStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaFilterStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaFilterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaFilterStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaFilterStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaFilterStatementContext jinjaFilterStatement() throws RecognitionException {
		JinjaFilterStatementContext _localctx = new JinjaFilterStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_jinjaFilterStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			match(JINJA_STMT_OPEN);
			setState(645);
			match(JINJA_STMT_FILTER);
			setState(646);
			((JinjaFilterStatementContext)_localctx).name = match(JINJA_IDENTIFIER);
			setState(647);
			match(JINJA_STMT_CLOSE);
			setState(648);
			((JinjaFilterStatementContext)_localctx).body = templateBody();
			setState(649);
			match(JINJA_STMT_OPEN);
			setState(650);
			match(JINJA_STMT_ENDFILTER);
			setState(651);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaRawStatementContext extends ParserRuleContext {
		public TemplateBodyContext body;
		public List<TerminalNode> JINJA_STMT_OPEN() { return getTokens(JinjaParser.JINJA_STMT_OPEN); }
		public TerminalNode JINJA_STMT_OPEN(int i) {
			return getToken(JinjaParser.JINJA_STMT_OPEN, i);
		}
		public TerminalNode JINJA_STMT_RAW() { return getToken(JinjaParser.JINJA_STMT_RAW, 0); }
		public List<TerminalNode> JINJA_STMT_CLOSE() { return getTokens(JinjaParser.JINJA_STMT_CLOSE); }
		public TerminalNode JINJA_STMT_CLOSE(int i) {
			return getToken(JinjaParser.JINJA_STMT_CLOSE, i);
		}
		public TerminalNode JINJA_STMT_ENDRAW() { return getToken(JinjaParser.JINJA_STMT_ENDRAW, 0); }
		public TemplateBodyContext templateBody() {
			return getRuleContext(TemplateBodyContext.class,0);
		}
		public JinjaRawStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaRawStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaRawStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaRawStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaRawStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaRawStatementContext jinjaRawStatement() throws RecognitionException {
		JinjaRawStatementContext _localctx = new JinjaRawStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_jinjaRawStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(JINJA_STMT_OPEN);
			setState(654);
			match(JINJA_STMT_RAW);
			setState(655);
			match(JINJA_STMT_CLOSE);
			setState(656);
			((JinjaRawStatementContext)_localctx).body = templateBody();
			setState(657);
			match(JINJA_STMT_OPEN);
			setState(658);
			match(JINJA_STMT_ENDRAW);
			setState(659);
			match(JINJA_STMT_CLOSE);
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public Token JINJA_COMMENT_TEXT;
		public List<Token> text = new ArrayList<Token>();
		public TerminalNode JINJA_COMMENT_OPEN() { return getToken(JinjaParser.JINJA_COMMENT_OPEN, 0); }
		public TerminalNode JINJA_COMMENT_CLOSE() { return getToken(JinjaParser.JINJA_COMMENT_CLOSE, 0); }
		public List<TerminalNode> JINJA_COMMENT_TEXT() { return getTokens(JinjaParser.JINJA_COMMENT_TEXT); }
		public TerminalNode JINJA_COMMENT_TEXT(int i) {
			return getToken(JinjaParser.JINJA_COMMENT_TEXT, i);
		}
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_jinjaComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(JINJA_COMMENT_OPEN);
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JINJA_COMMENT_TEXT) {
				{
				{
				setState(662);
				((JinjaCommentContext)_localctx).JINJA_COMMENT_TEXT = match(JINJA_COMMENT_TEXT);
				((JinjaCommentContext)_localctx).text.add(((JinjaCommentContext)_localctx).JINJA_COMMENT_TEXT);
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			match(JINJA_COMMENT_CLOSE);
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
	public static class CssStylesheetContext extends ParserRuleContext {
		public CssRuleSetContext cssRuleSet;
		public List<CssRuleSetContext> rules = new ArrayList<CssRuleSetContext>();
		public List<CssRuleSetContext> cssRuleSet() {
			return getRuleContexts(CssRuleSetContext.class);
		}
		public CssRuleSetContext cssRuleSet(int i) {
			return getRuleContext(CssRuleSetContext.class,i);
		}
		public CssStylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssStylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssStylesheetContext cssStylesheet() throws RecognitionException {
		CssStylesheetContext _localctx = new CssStylesheetContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cssStylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 956170L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 895L) != 0)) {
				{
				{
				setState(670);
				((CssStylesheetContext)_localctx).cssRuleSet = cssRuleSet();
				((CssStylesheetContext)_localctx).rules.add(((CssStylesheetContext)_localctx).cssRuleSet);
				}
				}
				setState(675);
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
	public static class CssRuleSetContext extends ParserRuleContext {
		public CssRuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRuleSet; }
	 
		public CssRuleSetContext() { }
		public void copyFrom(CssRuleSetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorRuleContext extends CssRuleSetContext {
		public CssSelectorPartContext selectors;
		public CssDeclarationListContext decls;
		public TerminalNode OpenBrace() { return getToken(JinjaParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaParser.CloseBrace, 0); }
		public CssSelectorPartContext cssSelectorPart() {
			return getRuleContext(CssSelectorPartContext.class,0);
		}
		public CssDeclarationListContext cssDeclarationList() {
			return getRuleContext(CssDeclarationListContext.class,0);
		}
		public SelectorRuleContext(CssRuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSelectorRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSelectorRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSelectorRule(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends CssRuleSetContext {
		public Token keyword;
		public CssAtRuleBodyContext body;
		public TerminalNode CSS_AT_KEYWORD() { return getToken(JinjaParser.CSS_AT_KEYWORD, 0); }
		public CssAtRuleBodyContext cssAtRuleBody() {
			return getRuleContext(CssAtRuleBodyContext.class,0);
		}
		public AtRuleContext(CssRuleSetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleSetContext cssRuleSet() throws RecognitionException {
		CssRuleSetContext _localctx = new CssRuleSetContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cssRuleSet);
		int _la;
		try {
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				_localctx = new SelectorRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				((SelectorRuleContext)_localctx).selectors = cssSelectorPart();
				setState(677);
				match(OpenBrace);
				setState(679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_IDENT || _la==CSS_VARIABLE) {
					{
					setState(678);
					((SelectorRuleContext)_localctx).decls = cssDeclarationList();
					}
				}

				setState(681);
				match(CloseBrace);
				}
				break;
			case 2:
				_localctx = new AtRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				((AtRuleContext)_localctx).keyword = match(CSS_AT_KEYWORD);
				setState(684);
				((AtRuleContext)_localctx).body = cssAtRuleBody();
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
	public static class CssAtRuleBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(JinjaParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(JinjaParser.SemiColon, 0); }
		public List<CssAnyTokenContext> cssAnyToken() {
			return getRuleContexts(CssAnyTokenContext.class);
		}
		public CssAnyTokenContext cssAnyToken(int i) {
			return getRuleContext(CssAnyTokenContext.class,i);
		}
		public CssAtRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAtRuleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssAtRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssAtRuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssAtRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAtRuleBodyContext cssAtRuleBody() throws RecognitionException {
		CssAtRuleBodyContext _localctx = new CssAtRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cssAtRuleBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					cssAnyToken();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBrace:
				{
				setState(693);
				match(OpenBrace);
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040298L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1023L) != 0)) {
					{
					{
					setState(694);
					cssAnyToken();
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				match(CloseBrace);
				}
				break;
			case SemiColon:
				{
				setState(701);
				match(SemiColon);
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
	public static class CssSelectorPartContext extends ParserRuleContext {
		public CssSelectorAtomContext cssSelectorAtom;
		public List<CssSelectorAtomContext> atoms = new ArrayList<CssSelectorAtomContext>();
		public List<CssSelectorAtomContext> cssSelectorAtom() {
			return getRuleContexts(CssSelectorAtomContext.class);
		}
		public CssSelectorAtomContext cssSelectorAtom(int i) {
			return getRuleContext(CssSelectorAtomContext.class,i);
		}
		public CssSelectorPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssSelectorPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssSelectorPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssSelectorPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorPartContext cssSelectorPart() throws RecognitionException {
		CssSelectorPartContext _localctx = new CssSelectorPartContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cssSelectorPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(704);
				((CssSelectorPartContext)_localctx).cssSelectorAtom = cssSelectorAtom();
				((CssSelectorPartContext)_localctx).atoms.add(((CssSelectorPartContext)_localctx).cssSelectorAtom);
				}
				}
				setState(707); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 956170L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 895L) != 0) );
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
	public static class CssSelectorAtomContext extends ParserRuleContext {
		public CssSelectorAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssSelectorAtom; }
	 
		public CssSelectorAtomContext() { }
		public void copyFrom(CssSelectorAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaParser.CSS_NUMBER, 0); }
		public CssNumberAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssNumberAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssNumberAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_IDENT() { return getToken(JinjaParser.CSS_IDENT, 0); }
		public CssIdentAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssIdentAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssIdentAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssIdentAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_VARIABLE() { return getToken(JinjaParser.CSS_VARIABLE, 0); }
		public CssVariableAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssVariableAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssVariableAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssVariableAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketGroupAtomContext extends CssSelectorAtomContext {
		public TerminalNode OpenBracket() { return getToken(JinjaParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(JinjaParser.CloseBracket, 0); }
		public List<CssSelectorAtomContext> cssSelectorAtom() {
			return getRuleContexts(CssSelectorAtomContext.class);
		}
		public CssSelectorAtomContext cssSelectorAtom(int i) {
			return getRuleContext(CssSelectorAtomContext.class,i);
		}
		public BracketGroupAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBracketGroupAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBracketGroupAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBracketGroupAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeAtomContext extends CssSelectorAtomContext {
		public TerminalNode Pipe() { return getToken(JinjaParser.Pipe, 0); }
		public PipeAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPipeAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPipeAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPipeAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotAtomContext extends CssSelectorAtomContext {
		public TerminalNode Dot() { return getToken(JinjaParser.Dot, 0); }
		public DotAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDotAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDotAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDotAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBangAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_BANG() { return getToken(JinjaParser.CSS_BANG, 0); }
		public CssBangAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssBangAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssBangAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssBangAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeAtomContext extends CssSelectorAtomContext {
		public TerminalNode Tilde() { return getToken(JinjaParser.Tilde, 0); }
		public TildeAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTildeAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTildeAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTildeAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyAtomContext extends CssSelectorAtomContext {
		public TerminalNode Multiply() { return getToken(JinjaParser.Multiply, 0); }
		public MultiplyAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMultiplyAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMultiplyAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMultiplyAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterAtomContext extends CssSelectorAtomContext {
		public TerminalNode Greater() { return getToken(JinjaParser.Greater, 0); }
		public GreaterAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterGreaterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitGreaterAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitGreaterAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaAtomContext extends CssSelectorAtomContext {
		public TerminalNode Comma() { return getToken(JinjaParser.Comma, 0); }
		public CommaAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCommaAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCommaAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCommaAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_FUNCTION() { return getToken(JinjaParser.CSS_FUNCTION, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssSelectorAtomContext> cssSelectorAtom() {
			return getRuleContexts(CssSelectorAtomContext.class);
		}
		public CssSelectorAtomContext cssSelectorAtom(int i) {
			return getRuleContext(CssSelectorAtomContext.class,i);
		}
		public FunctionCallAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFunctionCallAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFunctionCallAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFunctionCallAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusAtomContext extends CssSelectorAtomContext {
		public TerminalNode Plus() { return getToken(JinjaParser.Plus, 0); }
		public PlusAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPlusAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPlusAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPlusAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_PERCENT() { return getToken(JinjaParser.CSS_PERCENT, 0); }
		public CssPercentAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssPercentAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssPercentAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssPercentAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonAtomContext extends CssSelectorAtomContext {
		public TerminalNode Colon() { return getToken(JinjaParser.Colon, 0); }
		public ColonAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterColonAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitColonAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitColonAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenGroupAtomContext extends CssSelectorAtomContext {
		public TerminalNode OpenParen() { return getToken(JinjaParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssSelectorAtomContext> cssSelectorAtom() {
			return getRuleContexts(CssSelectorAtomContext.class);
		}
		public CssSelectorAtomContext cssSelectorAtom(int i) {
			return getRuleContext(CssSelectorAtomContext.class,i);
		}
		public ParenGroupAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterParenGroupAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitParenGroupAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitParenGroupAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtKeywordAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_AT_KEYWORD() { return getToken(JinjaParser.CSS_AT_KEYWORD, 0); }
		public CssAtKeywordAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssAtKeywordAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssAtKeywordAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssAtKeywordAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHashAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_HASH() { return getToken(JinjaParser.CSS_HASH, 0); }
		public CssHashAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssHashAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssHashAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssHashAtom(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringAtomContext extends CssSelectorAtomContext {
		public TerminalNode CSS_STRING() { return getToken(JinjaParser.CSS_STRING, 0); }
		public CssStringAtomContext(CssSelectorAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssStringAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssStringAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssSelectorAtomContext cssSelectorAtom() throws RecognitionException {
		CssSelectorAtomContext _localctx = new CssSelectorAtomContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cssSelectorAtom);
		int _la;
		try {
			setState(749);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new CssIdentAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				match(CSS_IDENT);
				}
				break;
			case CSS_HASH:
				_localctx = new CssHashAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(CSS_HASH);
				}
				break;
			case CSS_STRING:
				_localctx = new CssStringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				match(CSS_STRING);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				match(CSS_NUMBER);
				}
				break;
			case CSS_VARIABLE:
				_localctx = new CssVariableAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				match(CSS_VARIABLE);
				}
				break;
			case CSS_PERCENT:
				_localctx = new CssPercentAtomContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				match(CSS_PERCENT);
				}
				break;
			case CSS_BANG:
				_localctx = new CssBangAtomContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				match(CSS_BANG);
				}
				break;
			case CSS_AT_KEYWORD:
				_localctx = new CssAtKeywordAtomContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
				match(CSS_AT_KEYWORD);
				}
				break;
			case Multiply:
				_localctx = new MultiplyAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				match(Multiply);
				}
				break;
			case Dot:
				_localctx = new DotAtomContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(718);
				match(Dot);
				}
				break;
			case Colon:
				_localctx = new ColonAtomContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(719);
				match(Colon);
				}
				break;
			case Pipe:
				_localctx = new PipeAtomContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(720);
				match(Pipe);
				}
				break;
			case Greater:
				_localctx = new GreaterAtomContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(721);
				match(Greater);
				}
				break;
			case Plus:
				_localctx = new PlusAtomContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(722);
				match(Plus);
				}
				break;
			case Tilde:
				_localctx = new TildeAtomContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(723);
				match(Tilde);
				}
				break;
			case Comma:
				_localctx = new CommaAtomContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(724);
				match(Comma);
				}
				break;
			case CSS_FUNCTION:
				_localctx = new FunctionCallAtomContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(725);
				match(CSS_FUNCTION);
				setState(729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 956170L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 895L) != 0)) {
					{
					{
					setState(726);
					cssSelectorAtom();
					}
					}
					setState(731);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(732);
				match(CloseParen);
				}
				break;
			case OpenBracket:
				_localctx = new BracketGroupAtomContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(733);
				match(OpenBracket);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 956170L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 895L) != 0)) {
					{
					{
					setState(734);
					cssSelectorAtom();
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(740);
				match(CloseBracket);
				}
				break;
			case OpenParen:
				_localctx = new ParenGroupAtomContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(741);
				match(OpenParen);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 956170L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 895L) != 0)) {
					{
					{
					setState(742);
					cssSelectorAtom();
					}
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(748);
				match(CloseParen);
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
	public static class CssAnyTokenContext extends ParserRuleContext {
		public CssAnyTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssAnyToken; }
	 
		public CssAnyTokenContext() { }
		public void copyFrom(CssAnyTokenContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualTokenContext extends CssAnyTokenContext {
		public TerminalNode Equal() { return getToken(JinjaParser.Equal, 0); }
		public EqualTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterEqualToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitEqualToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitEqualToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideTokenContext extends CssAnyTokenContext {
		public TerminalNode Divide() { return getToken(JinjaParser.Divide, 0); }
		public DivideTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDivideToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDivideToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDivideToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterTokenContext extends CssAnyTokenContext {
		public TerminalNode Greater() { return getToken(JinjaParser.Greater, 0); }
		public GreaterTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterGreaterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitGreaterToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitGreaterToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SemiColonTokenContext extends CssAnyTokenContext {
		public TerminalNode SemiColon() { return getToken(JinjaParser.SemiColon, 0); }
		public SemiColonTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterSemiColonToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitSemiColonToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitSemiColonToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportantTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_IMPORTANT() { return getToken(JinjaParser.CSS_IMPORTANT, 0); }
		public CssImportantTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssImportantToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssImportantToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssImportantToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBangTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_BANG() { return getToken(JinjaParser.CSS_BANG, 0); }
		public CssBangTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssBangToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssBangToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssBangToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssAtKeywordTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_AT_KEYWORD() { return getToken(JinjaParser.CSS_AT_KEYWORD, 0); }
		public CssAtKeywordTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssAtKeywordToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssAtKeywordToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssAtKeywordToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaTokenContext extends CssAnyTokenContext {
		public TerminalNode Comma() { return getToken(JinjaParser.Comma, 0); }
		public CommaTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCommaToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCommaToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCommaToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_VARIABLE() { return getToken(JinjaParser.CSS_VARIABLE, 0); }
		public CssVariableTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssVariableToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssVariableToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssVariableToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BraceGroupTokenContext extends CssAnyTokenContext {
		public TerminalNode OpenBrace() { return getToken(JinjaParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(JinjaParser.CloseBrace, 0); }
		public List<CssAnyTokenContext> cssAnyToken() {
			return getRuleContexts(CssAnyTokenContext.class);
		}
		public CssAnyTokenContext cssAnyToken(int i) {
			return getRuleContext(CssAnyTokenContext.class,i);
		}
		public BraceGroupTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBraceGroupToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBraceGroupToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBraceGroupToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeTokenContext extends CssAnyTokenContext {
		public TerminalNode Tilde() { return getToken(JinjaParser.Tilde, 0); }
		public TildeTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTildeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTildeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTildeToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_IDENT() { return getToken(JinjaParser.CSS_IDENT, 0); }
		public CssIdentTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssIdentToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssIdentToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssIdentToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHashTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_HASH() { return getToken(JinjaParser.CSS_HASH, 0); }
		public CssHashTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssHashToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssHashToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssHashToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_PERCENT() { return getToken(JinjaParser.CSS_PERCENT, 0); }
		public CssPercentTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssPercentToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssPercentToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssPercentToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketGroupTokenContext extends CssAnyTokenContext {
		public TerminalNode OpenBracket() { return getToken(JinjaParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(JinjaParser.CloseBracket, 0); }
		public List<CssAnyTokenContext> cssAnyToken() {
			return getRuleContexts(CssAnyTokenContext.class);
		}
		public CssAnyTokenContext cssAnyToken(int i) {
			return getRuleContext(CssAnyTokenContext.class,i);
		}
		public BracketGroupTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBracketGroupToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBracketGroupToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBracketGroupToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeTokenContext extends CssAnyTokenContext {
		public TerminalNode Pipe() { return getToken(JinjaParser.Pipe, 0); }
		public PipeTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPipeToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPipeToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPipeToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenGroupTokenContext extends CssAnyTokenContext {
		public TerminalNode OpenParen() { return getToken(JinjaParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssAnyTokenContext> cssAnyToken() {
			return getRuleContexts(CssAnyTokenContext.class);
		}
		public CssAnyTokenContext cssAnyToken(int i) {
			return getRuleContext(CssAnyTokenContext.class,i);
		}
		public ParenGroupTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterParenGroupToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitParenGroupToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitParenGroupToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaParser.CSS_NUMBER, 0); }
		public CssNumberTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssNumberToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssNumberToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssNumberToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusTokenContext extends CssAnyTokenContext {
		public TerminalNode Plus() { return getToken(JinjaParser.Plus, 0); }
		public PlusTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPlusToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPlusToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPlusToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyTokenContext extends CssAnyTokenContext {
		public TerminalNode Multiply() { return getToken(JinjaParser.Multiply, 0); }
		public MultiplyTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMultiplyToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMultiplyToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMultiplyToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotTokenContext extends CssAnyTokenContext {
		public TerminalNode Dot() { return getToken(JinjaParser.Dot, 0); }
		public DotTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDotToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDotToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDotToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ColonTokenContext extends CssAnyTokenContext {
		public TerminalNode Colon() { return getToken(JinjaParser.Colon, 0); }
		public ColonTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterColonToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitColonToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitColonToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_FUNCTION() { return getToken(JinjaParser.CSS_FUNCTION, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssAnyTokenContext> cssAnyToken() {
			return getRuleContexts(CssAnyTokenContext.class);
		}
		public CssAnyTokenContext cssAnyToken(int i) {
			return getRuleContext(CssAnyTokenContext.class,i);
		}
		public FunctionCallTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFunctionCallToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFunctionCallToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFunctionCallToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusTokenContext extends CssAnyTokenContext {
		public TerminalNode Minus() { return getToken(JinjaParser.Minus, 0); }
		public MinusTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMinusToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMinusToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMinusToken(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringTokenContext extends CssAnyTokenContext {
		public TerminalNode CSS_STRING() { return getToken(JinjaParser.CSS_STRING, 0); }
		public CssStringTokenContext(CssAnyTokenContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssStringToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssStringToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssStringToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssAnyTokenContext cssAnyToken() throws RecognitionException {
		CssAnyTokenContext _localctx = new CssAnyTokenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cssAnyToken);
		int _la;
		try {
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new CssIdentTokenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(751);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumberTokenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(CSS_NUMBER);
				}
				break;
			case CSS_STRING:
				_localctx = new CssStringTokenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(753);
				match(CSS_STRING);
				}
				break;
			case CSS_HASH:
				_localctx = new CssHashTokenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(754);
				match(CSS_HASH);
				}
				break;
			case CSS_VARIABLE:
				_localctx = new CssVariableTokenContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(755);
				match(CSS_VARIABLE);
				}
				break;
			case CSS_PERCENT:
				_localctx = new CssPercentTokenContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(756);
				match(CSS_PERCENT);
				}
				break;
			case CSS_BANG:
				_localctx = new CssBangTokenContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(757);
				match(CSS_BANG);
				}
				break;
			case CSS_IMPORTANT:
				_localctx = new CssImportantTokenContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(758);
				match(CSS_IMPORTANT);
				}
				break;
			case CSS_AT_KEYWORD:
				_localctx = new CssAtKeywordTokenContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(759);
				match(CSS_AT_KEYWORD);
				}
				break;
			case CSS_FUNCTION:
				_localctx = new FunctionCallTokenContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(760);
				match(CSS_FUNCTION);
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040298L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1023L) != 0)) {
					{
					{
					setState(761);
					cssAnyToken();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(767);
				match(CloseParen);
				}
				break;
			case OpenParen:
				_localctx = new ParenGroupTokenContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(768);
				match(OpenParen);
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040298L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1023L) != 0)) {
					{
					{
					setState(769);
					cssAnyToken();
					}
					}
					setState(774);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(775);
				match(CloseParen);
				}
				break;
			case OpenBracket:
				_localctx = new BracketGroupTokenContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(776);
				match(OpenBracket);
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040298L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1023L) != 0)) {
					{
					{
					setState(777);
					cssAnyToken();
					}
					}
					setState(782);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(783);
				match(CloseBracket);
				}
				break;
			case OpenBrace:
				_localctx = new BraceGroupTokenContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(784);
				match(OpenBrace);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1040298L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 1023L) != 0)) {
					{
					{
					setState(785);
					cssAnyToken();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791);
				match(CloseBrace);
				}
				break;
			case Comma:
				_localctx = new CommaTokenContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(792);
				match(Comma);
				}
				break;
			case Colon:
				_localctx = new ColonTokenContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(793);
				match(Colon);
				}
				break;
			case SemiColon:
				_localctx = new SemiColonTokenContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(794);
				match(SemiColon);
				}
				break;
			case Plus:
				_localctx = new PlusTokenContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(795);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusTokenContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(796);
				match(Minus);
				}
				break;
			case Multiply:
				_localctx = new MultiplyTokenContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(797);
				match(Multiply);
				}
				break;
			case Divide:
				_localctx = new DivideTokenContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(798);
				match(Divide);
				}
				break;
			case Equal:
				_localctx = new EqualTokenContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(799);
				match(Equal);
				}
				break;
			case Dot:
				_localctx = new DotTokenContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(800);
				match(Dot);
				}
				break;
			case Pipe:
				_localctx = new PipeTokenContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(801);
				match(Pipe);
				}
				break;
			case Greater:
				_localctx = new GreaterTokenContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(802);
				match(Greater);
				}
				break;
			case Tilde:
				_localctx = new TildeTokenContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(803);
				match(Tilde);
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
	public static class CssDeclarationListContext extends ParserRuleContext {
		public CssDeclarationContext cssDeclaration;
		public List<CssDeclarationContext> decls = new ArrayList<CssDeclarationContext>();
		public List<CssDeclarationContext> cssDeclaration() {
			return getRuleContexts(CssDeclarationContext.class);
		}
		public CssDeclarationContext cssDeclaration(int i) {
			return getRuleContext(CssDeclarationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(JinjaParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(JinjaParser.SemiColon, i);
		}
		public CssDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationListContext cssDeclarationList() throws RecognitionException {
		CssDeclarationListContext _localctx = new CssDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cssDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			((CssDeclarationListContext)_localctx).cssDeclaration = cssDeclaration();
			((CssDeclarationListContext)_localctx).decls.add(((CssDeclarationListContext)_localctx).cssDeclaration);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(807);
				match(SemiColon);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CSS_IDENT || _la==CSS_VARIABLE) {
					{
					setState(808);
					((CssDeclarationListContext)_localctx).cssDeclaration = cssDeclaration();
					((CssDeclarationListContext)_localctx).decls.add(((CssDeclarationListContext)_localctx).cssDeclaration);
					}
				}

				}
				}
				setState(815);
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
	public static class CssDeclarationContext extends ParserRuleContext {
		public CssPropertyContext property;
		public CssValueContext value;
		public TerminalNode Colon() { return getToken(JinjaParser.Colon, 0); }
		public CssPropertyContext cssProperty() {
			return getRuleContext(CssPropertyContext.class,0);
		}
		public CssValueContext cssValue() {
			return getRuleContext(CssValueContext.class,0);
		}
		public CssDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssDeclarationContext cssDeclaration() throws RecognitionException {
		CssDeclarationContext _localctx = new CssDeclarationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cssDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			((CssDeclarationContext)_localctx).property = cssProperty();
			setState(817);
			match(Colon);
			setState(818);
			((CssDeclarationContext)_localctx).value = cssValue();
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
	public static class CssPropertyContext extends ParserRuleContext {
		public CssPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssProperty; }
	 
		public CssPropertyContext() { }
		public void copyFrom(CssPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentCssPropertyContext extends CssPropertyContext {
		public TerminalNode CSS_IDENT() { return getToken(JinjaParser.CSS_IDENT, 0); }
		public IdentCssPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterIdentCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitIdentCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitIdentCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableCssPropertyContext extends CssPropertyContext {
		public TerminalNode CSS_VARIABLE() { return getToken(JinjaParser.CSS_VARIABLE, 0); }
		public VariableCssPropertyContext(CssPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterVariableCssProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitVariableCssProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitVariableCssProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssPropertyContext cssProperty() throws RecognitionException {
		CssPropertyContext _localctx = new CssPropertyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cssProperty);
		try {
			setState(822);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new IdentCssPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(820);
				match(CSS_IDENT);
				}
				break;
			case CSS_VARIABLE:
				_localctx = new VariableCssPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(821);
				match(CSS_VARIABLE);
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
	public static class CssValueContext extends ParserRuleContext {
		public CssValuePartContext cssValuePart;
		public List<CssValuePartContext> parts = new ArrayList<CssValuePartContext>();
		public List<CssValuePartContext> cssValuePart() {
			return getRuleContexts(CssValuePartContext.class);
		}
		public CssValuePartContext cssValuePart(int i) {
			return getRuleContext(CssValuePartContext.class,i);
		}
		public CssValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValueContext cssValue() throws RecognitionException {
		CssValueContext _localctx = new CssValueContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cssValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(825); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(824);
				((CssValueContext)_localctx).cssValuePart = cssValuePart();
				((CssValueContext)_localctx).parts.add(((CssValueContext)_localctx).cssValuePart);
				}
				}
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1039882L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 991L) != 0) );
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
	public static class CssValuePartContext extends ParserRuleContext {
		public CssValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssValuePart; }
	 
		public CssValuePartContext() { }
		public void copyFrom(CssValuePartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TildeValueContext extends CssValuePartContext {
		public TerminalNode Tilde() { return getToken(JinjaParser.Tilde, 0); }
		public TildeValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterTildeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitTildeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitTildeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssIdentValueContext extends CssValuePartContext {
		public TerminalNode CSS_IDENT() { return getToken(JinjaParser.CSS_IDENT, 0); }
		public CssIdentValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssIdentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssIdentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssIdentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketGroupValueContext extends CssValuePartContext {
		public TerminalNode OpenBracket() { return getToken(JinjaParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(JinjaParser.CloseBracket, 0); }
		public List<CssValuePartContext> cssValuePart() {
			return getRuleContexts(CssValuePartContext.class);
		}
		public CssValuePartContext cssValuePart(int i) {
			return getRuleContext(CssValuePartContext.class,i);
		}
		public BracketGroupValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterBracketGroupValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitBracketGroupValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitBracketGroupValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterValueContext extends CssValuePartContext {
		public TerminalNode Greater() { return getToken(JinjaParser.Greater, 0); }
		public GreaterValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterGreaterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitGreaterValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitGreaterValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualValueContext extends CssValuePartContext {
		public TerminalNode Equal() { return getToken(JinjaParser.Equal, 0); }
		public EqualValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterEqualValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitEqualValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitEqualValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommaValueContext extends CssValuePartContext {
		public TerminalNode Comma() { return getToken(JinjaParser.Comma, 0); }
		public CommaValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCommaValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCommaValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCommaValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusValueContext extends CssValuePartContext {
		public TerminalNode Minus() { return getToken(JinjaParser.Minus, 0); }
		public MinusValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMinusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMinusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMinusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssStringValueContext extends CssValuePartContext {
		public TerminalNode CSS_STRING() { return getToken(JinjaParser.CSS_STRING, 0); }
		public CssStringValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivideValueContext extends CssValuePartContext {
		public TerminalNode Divide() { return getToken(JinjaParser.Divide, 0); }
		public DivideValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDivideValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDivideValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDivideValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallValueContext extends CssValuePartContext {
		public TerminalNode CSS_FUNCTION() { return getToken(JinjaParser.CSS_FUNCTION, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssValuePartContext> cssValuePart() {
			return getRuleContexts(CssValuePartContext.class);
		}
		public CssValuePartContext cssValuePart(int i) {
			return getRuleContext(CssValuePartContext.class,i);
		}
		public FunctionCallValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterFunctionCallValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitFunctionCallValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitFunctionCallValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenGroupValueContext extends CssValuePartContext {
		public TerminalNode OpenParen() { return getToken(JinjaParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(JinjaParser.CloseParen, 0); }
		public List<CssValuePartContext> cssValuePart() {
			return getRuleContexts(CssValuePartContext.class);
		}
		public CssValuePartContext cssValuePart(int i) {
			return getRuleContext(CssValuePartContext.class,i);
		}
		public ParenGroupValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterParenGroupValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitParenGroupValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitParenGroupValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusValueContext extends CssValuePartContext {
		public TerminalNode Plus() { return getToken(JinjaParser.Plus, 0); }
		public PlusValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPlusValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPlusValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPlusValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssNumberValueContext extends CssValuePartContext {
		public TerminalNode CSS_NUMBER() { return getToken(JinjaParser.CSS_NUMBER, 0); }
		public CssNumberValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssHashValueContext extends CssValuePartContext {
		public TerminalNode CSS_HASH() { return getToken(JinjaParser.CSS_HASH, 0); }
		public CssHashValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssHashValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssHashValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssHashValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotValueContext extends CssValuePartContext {
		public TerminalNode Dot() { return getToken(JinjaParser.Dot, 0); }
		public DotValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterDotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitDotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitDotValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeValueContext extends CssValuePartContext {
		public TerminalNode Pipe() { return getToken(JinjaParser.Pipe, 0); }
		public PipeValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterPipeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitPipeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitPipeValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssImportantValueContext extends CssValuePartContext {
		public TerminalNode CSS_IMPORTANT() { return getToken(JinjaParser.CSS_IMPORTANT, 0); }
		public CssImportantValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssImportantValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssImportantValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssImportantValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyValueContext extends CssValuePartContext {
		public TerminalNode Multiply() { return getToken(JinjaParser.Multiply, 0); }
		public MultiplyValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterMultiplyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitMultiplyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitMultiplyValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssPercentValueContext extends CssValuePartContext {
		public TerminalNode CSS_PERCENT() { return getToken(JinjaParser.CSS_PERCENT, 0); }
		public CssPercentValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssPercentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssPercentValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssPercentValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssVariableValueContext extends CssValuePartContext {
		public TerminalNode CSS_VARIABLE() { return getToken(JinjaParser.CSS_VARIABLE, 0); }
		public CssVariableValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CssBangValueContext extends CssValuePartContext {
		public TerminalNode CSS_BANG() { return getToken(JinjaParser.CSS_BANG, 0); }
		public CssBangValueContext(CssValuePartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).enterCssBangValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JinjaParserListener ) ((JinjaParserListener)listener).exitCssBangValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JinjaParserVisitor ) return ((JinjaParserVisitor<? extends T>)visitor).visitCssBangValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssValuePartContext cssValuePart() throws RecognitionException {
		CssValuePartContext _localctx = new CssValuePartContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cssValuePart);
		int _la;
		try {
			setState(871);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CSS_IDENT:
				_localctx = new CssIdentValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				_localctx = new CssNumberValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(830);
				match(CSS_NUMBER);
				}
				break;
			case CSS_STRING:
				_localctx = new CssStringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(831);
				match(CSS_STRING);
				}
				break;
			case CSS_HASH:
				_localctx = new CssHashValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(832);
				match(CSS_HASH);
				}
				break;
			case CSS_VARIABLE:
				_localctx = new CssVariableValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				match(CSS_VARIABLE);
				}
				break;
			case CSS_PERCENT:
				_localctx = new CssPercentValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(834);
				match(CSS_PERCENT);
				}
				break;
			case CSS_IMPORTANT:
				_localctx = new CssImportantValueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(835);
				match(CSS_IMPORTANT);
				}
				break;
			case CSS_BANG:
				_localctx = new CssBangValueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(836);
				match(CSS_BANG);
				}
				break;
			case CSS_FUNCTION:
				_localctx = new FunctionCallValueContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(837);
				match(CSS_FUNCTION);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1039882L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 991L) != 0)) {
					{
					{
					setState(838);
					cssValuePart();
					}
					}
					setState(843);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(844);
				match(CloseParen);
				}
				break;
			case OpenParen:
				_localctx = new ParenGroupValueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(845);
				match(OpenParen);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1039882L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 991L) != 0)) {
					{
					{
					setState(846);
					cssValuePart();
					}
					}
					setState(851);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(852);
				match(CloseParen);
				}
				break;
			case OpenBracket:
				_localctx = new BracketGroupValueContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(853);
				match(OpenBracket);
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1039882L) != 0) || ((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 991L) != 0)) {
					{
					{
					setState(854);
					cssValuePart();
					}
					}
					setState(859);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(860);
				match(CloseBracket);
				}
				break;
			case Comma:
				_localctx = new CommaValueContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(861);
				match(Comma);
				}
				break;
			case Plus:
				_localctx = new PlusValueContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(862);
				match(Plus);
				}
				break;
			case Minus:
				_localctx = new MinusValueContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(863);
				match(Minus);
				}
				break;
			case Multiply:
				_localctx = new MultiplyValueContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(864);
				match(Multiply);
				}
				break;
			case Divide:
				_localctx = new DivideValueContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(865);
				match(Divide);
				}
				break;
			case Equal:
				_localctx = new EqualValueContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(866);
				match(Equal);
				}
				break;
			case Dot:
				_localctx = new DotValueContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(867);
				match(Dot);
				}
				break;
			case Pipe:
				_localctx = new PipeValueContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(868);
				match(Pipe);
				}
				break;
			case Greater:
				_localctx = new GreaterValueContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(869);
				match(Greater);
				}
				break;
			case Tilde:
				_localctx = new TildeValueContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(870);
				match(Tilde);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00a0\u036a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0005\u0001\u008b\b\u0001\n\u0001\f\u0001\u008e\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0093\b\u0002\u0001\u0003\u0005\u0003"+
		"\u0096\b\u0003\n\u0003\f\u0003\u0099\t\u0003\u0001\u0003\u0003\u0003\u009c"+
		"\b\u0003\u0001\u0003\u0005\u0003\u009f\b\u0003\n\u0003\f\u0003\u00a2\t"+
		"\u0003\u0001\u0003\u0003\u0003\u00a5\b\u0003\u0001\u0003\u0005\u0003\u00a8"+
		"\b\u0003\n\u0003\f\u0003\u00ab\t\u0003\u0001\u0003\u0005\u0003\u00ae\b"+
		"\u0003\n\u0003\f\u0003\u00b1\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00b5\b\u0004\u0001\u0005\u0005\u0005\u00b8\b\u0005\n\u0005\f\u0005\u00bb"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005\n\u0005\f\u0005"+
		"\u00c2\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00c7\b"+
		"\u0006\n\u0006\f\u0006\u00ca\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d3\b\u0006"+
		"\u0001\u0006\u0003\u0006\u00d6\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00dd\b\u0006\u0001\u0007\u0005\u0007"+
		"\u00e0\b\u0007\n\u0007\f\u0007\u00e3\t\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00ea\b\b\u0001\t\u0001\t\u0001\t\u0003\t\u00ef\b\t"+
		"\u0001\n\u0001\n\u0005\n\u00f3\b\n\n\n\f\n\u00f6\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00fb\b\n\n\n\f\n\u00fe\t\n\u0001\n\u0001\n\u0003\n\u0102\b"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0109\b\u000b\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\r\u0001\r\u0003"+
		"\r\u0111\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u0115\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0123\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u012c\b\u0011\n\u0011\f\u0011\u012f"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u0137\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u013c\b\u0013\n\u0013\f\u0013\u013f\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0144\b\u0014\n\u0014\f\u0014\u0147\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014c\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0152\b\u0016\n\u0016\f\u0016"+
		"\u0155\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u015f\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0163\b\u0018\n\u0018\f\u0018\u0166\t\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u016e\b\u001a\u0001\u001b\u0001\u001b\u0005\u001b\u0172\b\u001b"+
		"\n\u001b\f\u001b\u0175\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u017e\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0183\b\u001e\n\u001e\f\u001e"+
		"\u0186\t\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u018a\b\u001f\u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0003!\u0191\b!\u0001\"\u0001\"\u0005\""+
		"\u0195\b\"\n\"\f\"\u0198\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u01a2\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u01a9\b#\u0001#\u0003#\u01ac\b#\u0003#\u01ae\b#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u01bd\b$\u0001$\u0001$\u0001$\u0003$\u01c2\b$\u0001$\u0003$\u01c5"+
		"\b$\u0001%\u0001%\u0001%\u0005%\u01ca\b%\n%\f%\u01cd\t%\u0001&\u0001&"+
		"\u0001&\u0001&\u0003&\u01d3\b&\u0001\'\u0001\'\u0001\'\u0005\'\u01d8\b"+
		"\'\n\'\f\'\u01db\t\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)"+
		"\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u01ed\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01f5\b*\n"+
		"*\f*\u01f8\t*\u0003*\u01fa\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u0204\b+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0213\b,\n,"+
		"\f,\u0216\t,\u0001,\u0001,\u0001,\u0001,\u0003,\u021c\b,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0228"+
		"\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0230\b-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u0239\b.\n.\f.\u023c\t.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u024e\b/\u00010\u00010\u0001"+
		"0\u00010\u00010\u00050\u0255\b0\n0\f0\u0258\t0\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00011\u00011\u00011\u00011\u00031\u0264\b1\u00012\u0001"+
		"2\u00012\u00012\u00012\u00032\u026b\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00053\u0277\b3\n3\f3\u027a\t3\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u0001"+
		"5\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00057\u0298\b7\n7"+
		"\f7\u029b\t7\u00017\u00017\u00018\u00058\u02a0\b8\n8\f8\u02a3\t8\u0001"+
		"9\u00019\u00019\u00039\u02a8\b9\u00019\u00019\u00019\u00019\u00039\u02ae"+
		"\b9\u0001:\u0005:\u02b1\b:\n:\f:\u02b4\t:\u0001:\u0001:\u0005:\u02b8\b"+
		":\n:\f:\u02bb\t:\u0001:\u0001:\u0003:\u02bf\b:\u0001;\u0004;\u02c2\b;"+
		"\u000b;\f;\u02c3\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0005<\u02d8\b<\n<\f<\u02db\t<\u0001<\u0001<\u0001<\u0005<\u02e0\b<"+
		"\n<\f<\u02e3\t<\u0001<\u0001<\u0001<\u0005<\u02e8\b<\n<\f<\u02eb\t<\u0001"+
		"<\u0003<\u02ee\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0005=\u02fb\b=\n=\f=\u02fe\t=\u0001=\u0001=\u0001"+
		"=\u0005=\u0303\b=\n=\f=\u0306\t=\u0001=\u0001=\u0001=\u0005=\u030b\b="+
		"\n=\f=\u030e\t=\u0001=\u0001=\u0001=\u0005=\u0313\b=\n=\f=\u0316\t=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0003=\u0325\b=\u0001>\u0001>\u0001>\u0003>\u032a\b>\u0005"+
		">\u032c\b>\n>\f>\u032f\t>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0003"+
		"@\u0337\b@\u0001A\u0004A\u033a\bA\u000bA\fA\u033b\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u0348\bB\nB"+
		"\fB\u034b\tB\u0001B\u0001B\u0001B\u0005B\u0350\bB\nB\fB\u0353\tB\u0001"+
		"B\u0001B\u0001B\u0005B\u0358\bB\nB\fB\u035b\tB\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u0368\bB\u0001"+
		"B\u0000\u0000C\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0000\u0001\u0002\u0000eehh\u03e3\u0000\u0086"+
		"\u0001\u0000\u0000\u0000\u0002\u008c\u0001\u0000\u0000\u0000\u0004\u0092"+
		"\u0001\u0000\u0000\u0000\u0006\u0097\u0001\u0000\u0000\u0000\b\u00b4\u0001"+
		"\u0000\u0000\u0000\n\u00b9\u0001\u0000\u0000\u0000\f\u00dc\u0001\u0000"+
		"\u0000\u0000\u000e\u00e1\u0001\u0000\u0000\u0000\u0010\u00e9\u0001\u0000"+
		"\u0000\u0000\u0012\u00eb\u0001\u0000\u0000\u0000\u0014\u0101\u0001\u0000"+
		"\u0000\u0000\u0016\u0108\u0001\u0000\u0000\u0000\u0018\u010c\u0001\u0000"+
		"\u0000\u0000\u001a\u0110\u0001\u0000\u0000\u0000\u001c\u0114\u0001\u0000"+
		"\u0000\u0000\u001e\u0122\u0001\u0000\u0000\u0000 \u0124\u0001\u0000\u0000"+
		"\u0000\"\u0128\u0001\u0000\u0000\u0000$\u0130\u0001\u0000\u0000\u0000"+
		"&\u0138\u0001\u0000\u0000\u0000(\u0140\u0001\u0000\u0000\u0000*\u014b"+
		"\u0001\u0000\u0000\u0000,\u014d\u0001\u0000\u0000\u0000.\u015e\u0001\u0000"+
		"\u0000\u00000\u0160\u0001\u0000\u0000\u00002\u0167\u0001\u0000\u0000\u0000"+
		"4\u016d\u0001\u0000\u0000\u00006\u016f\u0001\u0000\u0000\u00008\u0176"+
		"\u0001\u0000\u0000\u0000:\u017d\u0001\u0000\u0000\u0000<\u017f\u0001\u0000"+
		"\u0000\u0000>\u0189\u0001\u0000\u0000\u0000@\u018b\u0001\u0000\u0000\u0000"+
		"B\u0190\u0001\u0000\u0000\u0000D\u0192\u0001\u0000\u0000\u0000F\u01ad"+
		"\u0001\u0000\u0000\u0000H\u01c4\u0001\u0000\u0000\u0000J\u01c6\u0001\u0000"+
		"\u0000\u0000L\u01d2\u0001\u0000\u0000\u0000N\u01d4\u0001\u0000\u0000\u0000"+
		"P\u01dc\u0001\u0000\u0000\u0000R\u01e0\u0001\u0000\u0000\u0000T\u01f9"+
		"\u0001\u0000\u0000\u0000V\u01fb\u0001\u0000\u0000\u0000X\u0207\u0001\u0000"+
		"\u0000\u0000Z\u0221\u0001\u0000\u0000\u0000\\\u0235\u0001\u0000\u0000"+
		"\u0000^\u024d\u0001\u0000\u0000\u0000`\u024f\u0001\u0000\u0000\u0000b"+
		"\u0263\u0001\u0000\u0000\u0000d\u0265\u0001\u0000\u0000\u0000f\u0273\u0001"+
		"\u0000\u0000\u0000h\u027b\u0001\u0000\u0000\u0000j\u0284\u0001\u0000\u0000"+
		"\u0000l\u028d\u0001\u0000\u0000\u0000n\u0295\u0001\u0000\u0000\u0000p"+
		"\u02a1\u0001\u0000\u0000\u0000r\u02ad\u0001\u0000\u0000\u0000t\u02b2\u0001"+
		"\u0000\u0000\u0000v\u02c1\u0001\u0000\u0000\u0000x\u02ed\u0001\u0000\u0000"+
		"\u0000z\u0324\u0001\u0000\u0000\u0000|\u0326\u0001\u0000\u0000\u0000~"+
		"\u0330\u0001\u0000\u0000\u0000\u0080\u0336\u0001\u0000\u0000\u0000\u0082"+
		"\u0339\u0001\u0000\u0000\u0000\u0084\u0367\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0003\u0002\u0001\u0000\u0087\u0088\u0005\u0000\u0000\u0001\u0088"+
		"\u0001\u0001\u0000\u0000\u0000\u0089\u008b\u0003\u0004\u0002\u0000\u008a"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u0003\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f"+
		"\u0093\u0003\u001a\r\u0000\u0090\u0093\u0003\f\u0006\u0000\u0091\u0093"+
		"\u0003\u001e\u000f\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090"+
		"\u0001\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0005"+
		"\u0001\u0000\u0000\u0000\u0094\u0096\u0003\b\u0004\u0000\u0095\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009c\u0005"+
		"\u001b\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001"+
		"\u0000\u0000\u0000\u009c\u00a0\u0001\u0000\u0000\u0000\u009d\u009f\u0003"+
		"\b\u0004\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a5\u0005\u001d\u0000\u0000\u00a4\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\u0003\b\u0004\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00af\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003\n\u0005\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u0007\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b5\u0005\u001e\u0000\u0000\u00b3\u00b5\u0005%\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\t\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00c0"+
		"\u0003\f\u0006\u0000\u00bd\u00bf\u0003\u001a\r\u0000\u00be\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u000b\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005"+
		"#\u0000\u0000\u00c4\u00c8\u0005*\u0000\u0000\u00c5\u00c7\u0003\u0012\t"+
		"\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000"+
		"\u0000\u00c9\u00d5\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00cb\u00d2\u0005&\u0000\u0000\u00cc\u00cd\u0003\u000e\u0007\u0000"+
		"\u00cd\u00ce\u0005#\u0000\u0000\u00ce\u00cf\u0005(\u0000\u0000\u00cf\u00d0"+
		"\u0005*\u0000\u0000\u00d0\u00d1\u0005&\u0000\u0000\u00d1\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d6\u0005\'\u0000"+
		"\u0000\u00d5\u00cb\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00dd\u0001\u0000\u0000\u0000\u00d7\u00dd\u0005\u001e\u0000"+
		"\u0000\u00d8\u00d9\u0005\"\u0000\u0000\u00d9\u00da\u0003p8\u0000\u00da"+
		"\u00db\u0005\u0099\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00c3\u0001\u0000\u0000\u0000\u00dc\u00d7\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d8\u0001\u0000\u0000\u0000\u00dd\r\u0001\u0000\u0000\u0000\u00de\u00e0"+
		"\u0003\u0010\b\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e2\u000f\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e4\u00ea\u0003\u0018\f\u0000\u00e5\u00ea\u0003\f"+
		"\u0006\u0000\u00e6\u00ea\u0005\u001c\u0000\u0000\u00e7\u00ea\u0003\u001c"+
		"\u000e\u0000\u00e8\u00ea\u0003\u001e\u000f\u0000\u00e9\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000"+
		"\u0000\u0000\u00ea\u0011\u0001\u0000\u0000\u0000\u00eb\u00ee\u0005*\u0000"+
		"\u0000\u00ec\u00ed\u0005)\u0000\u0000\u00ed\u00ef\u0003\u0014\n\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u0013\u0001\u0000\u0000\u0000\u00f0\u00f4\u0005,\u0000\u0000\u00f1"+
		"\u00f3\u0003\u0016\u000b\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f7\u0102\u00050\u0000\u0000\u00f8\u00fc"+
		"\u0005-\u0000\u0000\u00f9\u00fb\u0003\u0016\u000b\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0102\u0005"+
		"3\u0000\u0000\u0100\u0102\u0005.\u0000\u0000\u0101\u00f0\u0001\u0000\u0000"+
		"\u0000\u0101\u00f8\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0015\u0001\u0000\u0000\u0000\u0103\u0109\u00051\u0000\u0000"+
		"\u0104\u0109\u00054\u0000\u0000\u0105\u0109\u00052\u0000\u0000\u0106\u0109"+
		"\u00055\u0000\u0000\u0107\u0109\u0003 \u0010\u0000\u0108\u0103\u0001\u0000"+
		"\u0000\u0000\u0108\u0104\u0001\u0000\u0000\u0000\u0108\u0105\u0001\u0000"+
		"\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0107\u0001\u0000"+
		"\u0000\u0000\u0109\u0017\u0001\u0000\u0000\u0000\u010a\u010d\u0005$\u0000"+
		"\u0000\u010b\u010d\u0005%\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u0019\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0003\u001c\u000e\u0000\u010f\u0111\u0003\u0018\f\u0000\u0110"+
		"\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111"+
		"\u001b\u0001\u0000\u0000\u0000\u0112\u0115\u0005\u0019\u0000\u0000\u0113"+
		"\u0115\u0005\u001a\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114"+
		"\u0113\u0001\u0000\u0000\u0000\u0115\u001d\u0001\u0000\u0000\u0000\u0116"+
		"\u0123\u0003 \u0010\u0000\u0117\u0123\u0003n7\u0000\u0118\u0123\u0003"+
		"R)\u0000\u0119\u0123\u0003X,\u0000\u011a\u0123\u0003Z-\u0000\u011b\u0123"+
		"\u0003V+\u0000\u011c\u0123\u0003^/\u0000\u011d\u0123\u0003`0\u0000\u011e"+
		"\u0123\u0003d2\u0000\u011f\u0123\u0003h4\u0000\u0120\u0123\u0003j5\u0000"+
		"\u0121\u0123\u0003l6\u0000\u0122\u0116\u0001\u0000\u0000\u0000\u0122\u0117"+
		"\u0001\u0000\u0000\u0000\u0122\u0118\u0001\u0000\u0000\u0000\u0122\u0119"+
		"\u0001\u0000\u0000\u0000\u0122\u011a\u0001\u0000\u0000\u0000\u0122\u011b"+
		"\u0001\u0000\u0000\u0000\u0122\u011c\u0001\u0000\u0000\u0000\u0122\u011d"+
		"\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000\u0000\u0000\u0122\u011f"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u001f\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u001f\u0000\u0000\u0125\u0126\u0003\"\u0011\u0000\u0126\u0127\u0005"+
		"6\u0000\u0000\u0127!\u0001\u0000\u0000\u0000\u0128\u012d\u0003$\u0012"+
		"\u0000\u0129\u012a\u00058\u0000\u0000\u012a\u012c\u0003$\u0012\u0000\u012b"+
		"\u0129\u0001\u0000\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"#\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0136"+
		"\u0003&\u0013\u0000\u0131\u0132\u0005Z\u0000\u0000\u0132\u0133\u0003&"+
		"\u0013\u0000\u0133\u0134\u0005[\u0000\u0000\u0134\u0135\u0003$\u0012\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0131\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137%\u0001\u0000\u0000\u0000\u0138"+
		"\u013d\u0003(\u0014\u0000\u0139\u013a\u0005V\u0000\u0000\u013a\u013c\u0003"+
		"(\u0014\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000"+
		"\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\'\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000"+
		"\u0000\u0140\u0145\u0003*\u0015\u0000\u0141\u0142\u0005U\u0000\u0000\u0142"+
		"\u0144\u0003*\u0015\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0147"+
		"\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146"+
		"\u0001\u0000\u0000\u0000\u0146)\u0001\u0000\u0000\u0000\u0147\u0145\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005W\u0000\u0000\u0149\u014c\u0003*\u0015"+
		"\u0000\u014a\u014c\u0003,\u0016\u0000\u014b\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014c+\u0001\u0000\u0000\u0000\u014d"+
		"\u0153\u00030\u0018\u0000\u014e\u014f\u0003.\u0017\u0000\u014f\u0150\u0003"+
		"0\u0018\u0000\u0150\u0152\u0001\u0000\u0000\u0000\u0151\u014e\u0001\u0000"+
		"\u0000\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000"+
		"\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154-\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u015f\u0005E\u0000\u0000"+
		"\u0157\u015f\u0005F\u0000\u0000\u0158\u015f\u0005G\u0000\u0000\u0159\u015f"+
		"\u0005H\u0000\u0000\u015a\u015f\u0005I\u0000\u0000\u015b\u015f\u0005J"+
		"\u0000\u0000\u015c\u015f\u0005X\u0000\u0000\u015d\u015f\u0005Y\u0000\u0000"+
		"\u015e\u0156\u0001\u0000\u0000\u0000\u015e\u0157\u0001\u0000\u0000\u0000"+
		"\u015e\u0158\u0001\u0000\u0000\u0000\u015e\u0159\u0001\u0000\u0000\u0000"+
		"\u015e\u015a\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000"+
		"\u015e\u015c\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000"+
		"\u015f/\u0001\u0000\u0000\u0000\u0160\u0164\u00036\u001b\u0000\u0161\u0163"+
		"\u00032\u0019\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0166\u0001"+
		"\u0000\u0000\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001"+
		"\u0000\u0000\u0000\u01651\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u00034\u001a\u0000\u0168\u0169\u00036\u001b\u0000"+
		"\u01693\u0001\u0000\u0000\u0000\u016a\u016e\u0005K\u0000\u0000\u016b\u016e"+
		"\u0005L\u0000\u0000\u016c\u016e\u0005B\u0000\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000"+
		"\u0000\u0000\u016e5\u0001\u0000\u0000\u0000\u016f\u0173\u0003<\u001e\u0000"+
		"\u0170\u0172\u00038\u001c\u0000\u0171\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0001\u0000\u0000\u0000\u01747\u0001\u0000\u0000\u0000\u0175\u0173"+
		"\u0001\u0000\u0000\u0000\u0176\u0177\u0003:\u001d\u0000\u0177\u0178\u0003"+
		"<\u001e\u0000\u01789\u0001\u0000\u0000\u0000\u0179\u017e\u0005M\u0000"+
		"\u0000\u017a\u017e\u0005N\u0000\u0000\u017b\u017e\u0005O\u0000\u0000\u017c"+
		"\u017e\u0005P\u0000\u0000\u017d\u0179\u0001\u0000\u0000\u0000\u017d\u017a"+
		"\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017c"+
		"\u0001\u0000\u0000\u0000\u017e;\u0001\u0000\u0000\u0000\u017f\u0184\u0003"+
		">\u001f\u0000\u0180\u0181\u0005Q\u0000\u0000\u0181\u0183\u0003>\u001f"+
		"\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000"+
		"\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000"+
		"\u0000\u0185=\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000"+
		"\u0187\u018a\u0003@ \u0000\u0188\u018a\u0003D\"\u0000\u0189\u0187\u0001"+
		"\u0000\u0000\u0000\u0189\u0188\u0001\u0000\u0000\u0000\u018a?\u0001\u0000"+
		"\u0000\u0000\u018b\u018c\u0003B!\u0000\u018c\u018d\u0003>\u001f\u0000"+
		"\u018dA\u0001\u0000\u0000\u0000\u018e\u0191\u0005K\u0000\u0000\u018f\u0191"+
		"\u0005L\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u018f\u0001"+
		"\u0000\u0000\u0000\u0191C\u0001\u0000\u0000\u0000\u0192\u0196\u0003H$"+
		"\u0000\u0193\u0195\u0003F#\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196"+
		"\u0197\u0001\u0000\u0000\u0000\u0197E\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u00057\u0000\u0000\u019a\u01ae\u0005"+
		"h\u0000\u0000\u019b\u019c\u0005=\u0000\u0000\u019c\u019d\u0003$\u0012"+
		"\u0000\u019d\u019e\u0005>\u0000\u0000\u019e\u01ae\u0001\u0000\u0000\u0000"+
		"\u019f\u01a1\u0005;\u0000\u0000\u01a0\u01a2\u0003J%\u0000\u01a1\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a3\u01ae\u0005<\u0000\u0000\u01a4\u01a5\u0005"+
		"A\u0000\u0000\u01a5\u01ab\u0005h\u0000\u0000\u01a6\u01a8\u0005;\u0000"+
		"\u0000\u01a7\u01a9\u0003J%\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0005<\u0000\u0000\u01ab\u01a6\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000\u0000\u0000\u01ad\u0199"+
		"\u0001\u0000\u0000\u0000\u01ad\u019b\u0001\u0000\u0000\u0000\u01ad\u019f"+
		"\u0001\u0000\u0000\u0000\u01ad\u01a4\u0001\u0000\u0000\u0000\u01aeG\u0001"+
		"\u0000\u0000\u0000\u01af\u01c5\u0005h\u0000\u0000\u01b0\u01c5\u0005e\u0000"+
		"\u0000\u01b1\u01c5\u0005f\u0000\u0000\u01b2\u01c5\u0005g\u0000\u0000\u01b3"+
		"\u01c5\u0005R\u0000\u0000\u01b4\u01c5\u0005S\u0000\u0000\u01b5\u01c5\u0005"+
		"T\u0000\u0000\u01b6\u01b7\u0005;\u0000\u0000\u01b7\u01b8\u0003$\u0012"+
		"\u0000\u01b8\u01b9\u0005<\u0000\u0000\u01b9\u01c5\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bc\u0005=\u0000\u0000\u01bb\u01bd\u0003\"\u0011\u0000\u01bc"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd"+
		"\u01be\u0001\u0000\u0000\u0000\u01be\u01c5\u0005>\u0000\u0000\u01bf\u01c1"+
		"\u0005?\u0000\u0000\u01c0\u01c2\u0003N\'\u0000\u01c1\u01c0\u0001\u0000"+
		"\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c5\u0005@\u0000\u0000\u01c4\u01af\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b0\u0001\u0000\u0000\u0000\u01c4\u01b1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b2\u0001\u0000\u0000\u0000\u01c4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b4\u0001\u0000\u0000\u0000\u01c4\u01b5\u0001\u0000\u0000"+
		"\u0000\u01c4\u01b6\u0001\u0000\u0000\u0000\u01c4\u01ba\u0001\u0000\u0000"+
		"\u0000\u01c4\u01bf\u0001\u0000\u0000\u0000\u01c5I\u0001\u0000\u0000\u0000"+
		"\u01c6\u01cb\u0003L&\u0000\u01c7\u01c8\u00058\u0000\u0000\u01c8\u01ca"+
		"\u0003L&\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000"+
		"\u0000\u0000\u01ccK\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0005h\u0000\u0000\u01cf\u01d0\u0005D\u0000\u0000\u01d0"+
		"\u01d3\u0003$\u0012\u0000\u01d1\u01d3\u0003$\u0012\u0000\u01d2\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000\u01d3M\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d9\u0003P(\u0000\u01d5\u01d6\u00058\u0000\u0000"+
		"\u01d6\u01d8\u0003P(\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d8\u01db"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01da"+
		"\u0001\u0000\u0000\u0000\u01daO\u0001\u0000\u0000\u0000\u01db\u01d9\u0001"+
		"\u0000\u0000\u0000\u01dc\u01dd\u0003$\u0012\u0000\u01dd\u01de\u00059\u0000"+
		"\u0000\u01de\u01df\u0003$\u0012\u0000\u01dfQ\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005 \u0000\u0000\u01e1\u01e2\u0003T*\u0000\u01e2\u01e3\u0005"+
		"j\u0000\u0000\u01e3S\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005m\u0000"+
		"\u0000\u01e5\u01fa\u0005e\u0000\u0000\u01e6\u01e7\u0005n\u0000\u0000\u01e7"+
		"\u01fa\u0007\u0000\u0000\u0000\u01e8\u01e9\u0005o\u0000\u0000\u01e9\u01ec"+
		"\u0005e\u0000\u0000\u01ea\u01eb\u0005q\u0000\u0000\u01eb\u01ed\u0005h"+
		"\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000"+
		"\u0000\u0000\u01ed\u01fa\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005p\u0000"+
		"\u0000\u01ef\u01f0\u0005e\u0000\u0000\u01f0\u01f1\u0005o\u0000\u0000\u01f1"+
		"\u01f6\u0005h\u0000\u0000\u01f2\u01f3\u00058\u0000\u0000\u01f3\u01f5\u0005"+
		"h\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000"+
		"\u0000\u0000\u01f7\u01fa\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01e4\u0001\u0000\u0000\u0000\u01f9\u01e6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01e8\u0001\u0000\u0000\u0000\u01f9\u01ee\u0001\u0000"+
		"\u0000\u0000\u01faU\u0001\u0000\u0000\u0000\u01fb\u01fc\u0005 \u0000\u0000"+
		"\u01fc\u01fd\u0005k\u0000\u0000\u01fd\u01fe\u0005h\u0000\u0000\u01fe\u01ff"+
		"\u0005j\u0000\u0000\u01ff\u0200\u0003\u0002\u0001\u0000\u0200\u0201\u0005"+
		" \u0000\u0000\u0201\u0203\u0005l\u0000\u0000\u0202\u0204\u0005h\u0000"+
		"\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205\u0206\u0005j\u0000\u0000"+
		"\u0206W\u0001\u0000\u0000\u0000\u0207\u0208\u0005 \u0000\u0000\u0208\u0209"+
		"\u0005~\u0000\u0000\u0209\u020a\u0003$\u0012\u0000\u020a\u020b\u0005j"+
		"\u0000\u0000\u020b\u0214\u0003\u0002\u0001\u0000\u020c\u020d\u0005 \u0000"+
		"\u0000\u020d\u020e\u0005\u007f\u0000\u0000\u020e\u020f\u0003$\u0012\u0000"+
		"\u020f\u0210\u0005j\u0000\u0000\u0210\u0211\u0003\u0002\u0001\u0000\u0211"+
		"\u0213\u0001\u0000\u0000\u0000\u0212\u020c\u0001\u0000\u0000\u0000\u0213"+
		"\u0216\u0001\u0000\u0000\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214"+
		"\u0215\u0001\u0000\u0000\u0000\u0215\u021b\u0001\u0000\u0000\u0000\u0216"+
		"\u0214\u0001\u0000\u0000\u0000\u0217\u0218\u0005 \u0000\u0000\u0218\u0219"+
		"\u0005\u0080\u0000\u0000\u0219\u021a\u0005j\u0000\u0000\u021a\u021c\u0003"+
		"\u0002\u0001\u0000\u021b\u0217\u0001\u0000\u0000\u0000\u021b\u021c\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0005"+
		" \u0000\u0000\u021e\u021f\u0005\u0081\u0000\u0000\u021f\u0220\u0005j\u0000"+
		"\u0000\u0220Y\u0001\u0000\u0000\u0000\u0221\u0222\u0005 \u0000\u0000\u0222"+
		"\u0223\u0005\u0082\u0000\u0000\u0223\u0224\u0003\\.\u0000\u0224\u0225"+
		"\u0005X\u0000\u0000\u0225\u0227\u0003\"\u0011\u0000\u0226\u0228\u0005"+
		"\u0084\u0000\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001"+
		"\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229\u022a\u0005"+
		"j\u0000\u0000\u022a\u022f\u0003\u0002\u0001\u0000\u022b\u022c\u0005 \u0000"+
		"\u0000\u022c\u022d\u0005\u0080\u0000\u0000\u022d\u022e\u0005j\u0000\u0000"+
		"\u022e\u0230\u0003\u0002\u0001\u0000\u022f\u022b\u0001\u0000\u0000\u0000"+
		"\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005 \u0000\u0000\u0232\u0233\u0005\u0083\u0000\u0000\u0233"+
		"\u0234\u0005j\u0000\u0000\u0234[\u0001\u0000\u0000\u0000\u0235\u023a\u0003"+
		"$\u0012\u0000\u0236\u0237\u00058\u0000\u0000\u0237\u0239\u0003$\u0012"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000"+
		"\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b]\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\u0005 \u0000\u0000\u023e\u023f\u0005t\u0000\u0000\u023f\u0240"+
		"\u0005h\u0000\u0000\u0240\u0241\u0005D\u0000\u0000\u0241\u0242\u0003$"+
		"\u0012\u0000\u0242\u0243\u0005j\u0000\u0000\u0243\u024e\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005 \u0000\u0000\u0245\u0246\u0005t\u0000\u0000\u0246"+
		"\u0247\u0005h\u0000\u0000\u0247\u0248\u0005j\u0000\u0000\u0248\u0249\u0003"+
		"\u0002\u0001\u0000\u0249\u024a\u0005 \u0000\u0000\u024a\u024b\u0005u\u0000"+
		"\u0000\u024b\u024c\u0005j\u0000\u0000\u024c\u024e\u0001\u0000\u0000\u0000"+
		"\u024d\u023d\u0001\u0000\u0000\u0000\u024d\u0244\u0001\u0000\u0000\u0000"+
		"\u024e_\u0001\u0000\u0000\u0000\u024f\u0250\u0005 \u0000\u0000\u0250\u0251"+
		"\u0005r\u0000\u0000\u0251\u0256\u0003b1\u0000\u0252\u0253\u00058\u0000"+
		"\u0000\u0253\u0255\u0003b1\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255"+
		"\u0258\u0001\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256"+
		"\u0257\u0001\u0000\u0000\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258"+
		"\u0256\u0001\u0000\u0000\u0000\u0259\u025a\u0005j\u0000\u0000\u025a\u025b"+
		"\u0003\u0002\u0001\u0000\u025b\u025c\u0005 \u0000\u0000\u025c\u025d\u0005"+
		"s\u0000\u0000\u025d\u025e\u0005j\u0000\u0000\u025ea\u0001\u0000\u0000"+
		"\u0000\u025f\u0260\u0005h\u0000\u0000\u0260\u0261\u0005D\u0000\u0000\u0261"+
		"\u0264\u0003$\u0012\u0000\u0262\u0264\u0003$\u0012\u0000\u0263\u025f\u0001"+
		"\u0000\u0000\u0000\u0263\u0262\u0001\u0000\u0000\u0000\u0264c\u0001\u0000"+
		"\u0000\u0000\u0265\u0266\u0005 \u0000\u0000\u0266\u0267\u0005v\u0000\u0000"+
		"\u0267\u0268\u0005h\u0000\u0000\u0268\u026a\u0005;\u0000\u0000\u0269\u026b"+
		"\u0003f3\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000"+
		"\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005<\u0000"+
		"\u0000\u026d\u026e\u0005j\u0000\u0000\u026e\u026f\u0003\u0002\u0001\u0000"+
		"\u026f\u0270\u0005 \u0000\u0000\u0270\u0271\u0005w\u0000\u0000\u0271\u0272"+
		"\u0005j\u0000\u0000\u0272e\u0001\u0000\u0000\u0000\u0273\u0278\u0005h"+
		"\u0000\u0000\u0274\u0275\u00058\u0000\u0000\u0275\u0277\u0005h\u0000\u0000"+
		"\u0276\u0274\u0001\u0000\u0000\u0000\u0277\u027a\u0001\u0000\u0000\u0000"+
		"\u0278\u0276\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000"+
		"\u0279g\u0001\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0005 \u0000\u0000\u027c\u027d\u0005x\u0000\u0000\u027d\u027e\u0005"+
		"h\u0000\u0000\u027e\u027f\u0005j\u0000\u0000\u027f\u0280\u0003\u0002\u0001"+
		"\u0000\u0280\u0281\u0005 \u0000\u0000\u0281\u0282\u0005y\u0000\u0000\u0282"+
		"\u0283\u0005j\u0000\u0000\u0283i\u0001\u0000\u0000\u0000\u0284\u0285\u0005"+
		" \u0000\u0000\u0285\u0286\u0005z\u0000\u0000\u0286\u0287\u0005h\u0000"+
		"\u0000\u0287\u0288\u0005j\u0000\u0000\u0288\u0289\u0003\u0002\u0001\u0000"+
		"\u0289\u028a\u0005 \u0000\u0000\u028a\u028b\u0005{\u0000\u0000\u028b\u028c"+
		"\u0005j\u0000\u0000\u028ck\u0001\u0000\u0000\u0000\u028d\u028e\u0005 "+
		"\u0000\u0000\u028e\u028f\u0005|\u0000\u0000\u028f\u0290\u0005j\u0000\u0000"+
		"\u0290\u0291\u0003\u0002\u0001\u0000\u0291\u0292\u0005 \u0000\u0000\u0292"+
		"\u0293\u0005}\u0000\u0000\u0293\u0294\u0005j\u0000\u0000\u0294m\u0001"+
		"\u0000\u0000\u0000\u0295\u0299\u0005!\u0000\u0000\u0296\u0298\u0005\u008c"+
		"\u0000\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0298\u029b\u0001\u0000"+
		"\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000"+
		"\u0000\u0000\u029a\u029c\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0005\u008b\u0000\u0000\u029do\u0001\u0000\u0000"+
		"\u0000\u029e\u02a0\u0003r9\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a1\u029f\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u0001\u0000\u0000\u0000\u02a2q\u0001\u0000\u0000\u0000\u02a3\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0003v;\u0000\u02a5\u02a7\u0005\u0005"+
		"\u0000\u0000\u02a6\u02a8\u0003|>\u0000\u02a7\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0005\u0006\u0000\u0000\u02aa\u02ae\u0001\u0000\u0000\u0000"+
		"\u02ab\u02ac\u0005\u0094\u0000\u0000\u02ac\u02ae\u0003t:\u0000\u02ad\u02a4"+
		"\u0001\u0000\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000\u0000\u02aes\u0001"+
		"\u0000\u0000\u0000\u02af\u02b1\u0003z=\u0000\u02b0\u02af\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02be\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b9\u0005\u0005\u0000"+
		"\u0000\u02b6\u02b8\u0003z=\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bc\u0001\u0000\u0000\u0000\u02bb"+
		"\u02b9\u0001\u0000\u0000\u0000\u02bc\u02bf\u0005\u0006\u0000\u0000\u02bd"+
		"\u02bf\u0005\u0007\u0000\u0000\u02be\u02b5\u0001\u0000\u0000\u0000\u02be"+
		"\u02bd\u0001\u0000\u0000\u0000\u02bfu\u0001\u0000\u0000\u0000\u02c0\u02c2"+
		"\u0003x<\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000"+
		"\u0000\u0000\u02c3\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c4w\u0001\u0000\u0000\u0000\u02c5\u02ee\u0005\u0092\u0000"+
		"\u0000\u02c6\u02ee\u0005\u0091\u0000\u0000\u02c7\u02ee\u0005\u008f\u0000"+
		"\u0000\u02c8\u02ee\u0005\u0090\u0000\u0000\u02c9\u02ee\u0005\u0095\u0000"+
		"\u0000\u02ca\u02ee\u0005\u0097\u0000\u0000\u02cb\u02ee\u0005\u0098\u0000"+
		"\u0000\u02cc\u02ee\u0005\u0094\u0000\u0000\u02cd\u02ee\u0005\n\u0000\u0000"+
		"\u02ce\u02ee\u0005\t\u0000\u0000\u02cf\u02ee\u0005\b\u0000\u0000\u02d0"+
		"\u02ee\u0005\f\u0000\u0000\u02d1\u02ee\u0005\u0011\u0000\u0000\u02d2\u02ee"+
		"\u0005\u000f\u0000\u0000\u02d3\u02ee\u0005\u0013\u0000\u0000\u02d4\u02ee"+
		"\u0005\u0012\u0000\u0000\u02d5\u02d9\u0005\u0093\u0000\u0000\u02d6\u02d8"+
		"\u0003x<\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000"+
		"\u0000\u0000\u02da\u02dc\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000"+
		"\u0000\u0000\u02dc\u02ee\u0005\u0004\u0000\u0000\u02dd\u02e1\u0005\u0001"+
		"\u0000\u0000\u02de\u02e0\u0003x<\u0000\u02df\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e3\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000"+
		"\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e4\u02ee\u0005\u0002\u0000\u0000"+
		"\u02e5\u02e9\u0005\u0003\u0000\u0000\u02e6\u02e8\u0003x<\u0000\u02e7\u02e6"+
		"\u0001\u0000\u0000\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ec"+
		"\u0001\u0000\u0000\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ee"+
		"\u0005\u0004\u0000\u0000\u02ed\u02c5\u0001\u0000\u0000\u0000\u02ed\u02c6"+
		"\u0001\u0000\u0000\u0000\u02ed\u02c7\u0001\u0000\u0000\u0000\u02ed\u02c8"+
		"\u0001\u0000\u0000\u0000\u02ed\u02c9\u0001\u0000\u0000\u0000\u02ed\u02ca"+
		"\u0001\u0000\u0000\u0000\u02ed\u02cb\u0001\u0000\u0000\u0000\u02ed\u02cc"+
		"\u0001\u0000\u0000\u0000\u02ed\u02cd\u0001\u0000\u0000\u0000\u02ed\u02ce"+
		"\u0001\u0000\u0000\u0000\u02ed\u02cf\u0001\u0000\u0000\u0000\u02ed\u02d0"+
		"\u0001\u0000\u0000\u0000\u02ed\u02d1\u0001\u0000\u0000\u0000\u02ed\u02d2"+
		"\u0001\u0000\u0000\u0000\u02ed\u02d3\u0001\u0000\u0000\u0000\u02ed\u02d4"+
		"\u0001\u0000\u0000\u0000\u02ed\u02d5\u0001\u0000\u0000\u0000\u02ed\u02dd"+
		"\u0001\u0000\u0000\u0000\u02ed\u02e5\u0001\u0000\u0000\u0000\u02eey\u0001"+
		"\u0000\u0000\u0000\u02ef\u0325\u0005\u0092\u0000\u0000\u02f0\u0325\u0005"+
		"\u0090\u0000\u0000\u02f1\u0325\u0005\u008f\u0000\u0000\u02f2\u0325\u0005"+
		"\u0091\u0000\u0000\u02f3\u0325\u0005\u0095\u0000\u0000\u02f4\u0325\u0005"+
		"\u0097\u0000\u0000\u02f5\u0325\u0005\u0098\u0000\u0000\u02f6\u0325\u0005"+
		"\u0096\u0000\u0000\u02f7\u0325\u0005\u0094\u0000\u0000\u02f8\u02fc\u0005"+
		"\u0093\u0000\u0000\u02f9\u02fb\u0003z=\u0000\u02fa\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fa\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02ff\u0325\u0005\u0004\u0000"+
		"\u0000\u0300\u0304\u0005\u0003\u0000\u0000\u0301\u0303\u0003z=\u0000\u0302"+
		"\u0301\u0001\u0000\u0000\u0000\u0303\u0306\u0001\u0000\u0000\u0000\u0304"+
		"\u0302\u0001\u0000\u0000\u0000\u0304\u0305\u0001\u0000\u0000\u0000\u0305"+
		"\u0307\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0307"+
		"\u0325\u0005\u0004\u0000\u0000\u0308\u030c\u0005\u0001\u0000\u0000\u0309"+
		"\u030b\u0003z=\u0000\u030a\u0309\u0001\u0000\u0000\u0000\u030b\u030e\u0001"+
		"\u0000\u0000\u0000\u030c\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u030f\u0001\u0000\u0000\u0000\u030e\u030c\u0001"+
		"\u0000\u0000\u0000\u030f\u0325\u0005\u0002\u0000\u0000\u0310\u0314\u0005"+
		"\u0005\u0000\u0000\u0311\u0313\u0003z=\u0000\u0312\u0311\u0001\u0000\u0000"+
		"\u0000\u0313\u0316\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0001\u0000\u0000\u0000\u0315\u0317\u0001\u0000\u0000"+
		"\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0317\u0325\u0005\u0006\u0000"+
		"\u0000\u0318\u0325\u0005\u0012\u0000\u0000\u0319\u0325\u0005\b\u0000\u0000"+
		"\u031a\u0325\u0005\u0007\u0000\u0000\u031b\u0325\u0005\u000f\u0000\u0000"+
		"\u031c\u0325\u0005\u0010\u0000\u0000\u031d\u0325\u0005\n\u0000\u0000\u031e"+
		"\u0325\u0005\u000b\u0000\u0000\u031f\u0325\u0005\u000e\u0000\u0000\u0320"+
		"\u0325\u0005\t\u0000\u0000\u0321\u0325\u0005\f\u0000\u0000\u0322\u0325"+
		"\u0005\u0011\u0000\u0000\u0323\u0325\u0005\u0013\u0000\u0000\u0324\u02ef"+
		"\u0001\u0000\u0000\u0000\u0324\u02f0\u0001\u0000\u0000\u0000\u0324\u02f1"+
		"\u0001\u0000\u0000\u0000\u0324\u02f2\u0001\u0000\u0000\u0000\u0324\u02f3"+
		"\u0001\u0000\u0000\u0000\u0324\u02f4\u0001\u0000\u0000\u0000\u0324\u02f5"+
		"\u0001\u0000\u0000\u0000\u0324\u02f6\u0001\u0000\u0000\u0000\u0324\u02f7"+
		"\u0001\u0000\u0000\u0000\u0324\u02f8\u0001\u0000\u0000\u0000\u0324\u0300"+
		"\u0001\u0000\u0000\u0000\u0324\u0308\u0001\u0000\u0000\u0000\u0324\u0310"+
		"\u0001\u0000\u0000\u0000\u0324\u0318\u0001\u0000\u0000\u0000\u0324\u0319"+
		"\u0001\u0000\u0000\u0000\u0324\u031a\u0001\u0000\u0000\u0000\u0324\u031b"+
		"\u0001\u0000\u0000\u0000\u0324\u031c\u0001\u0000\u0000\u0000\u0324\u031d"+
		"\u0001\u0000\u0000\u0000\u0324\u031e\u0001\u0000\u0000\u0000\u0324\u031f"+
		"\u0001\u0000\u0000\u0000\u0324\u0320\u0001\u0000\u0000\u0000\u0324\u0321"+
		"\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000\u0000\u0324\u0323"+
		"\u0001\u0000\u0000\u0000\u0325{\u0001\u0000\u0000\u0000\u0326\u032d\u0003"+
		"~?\u0000\u0327\u0329\u0005\u0007\u0000\u0000\u0328\u032a\u0003~?\u0000"+
		"\u0329\u0328\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000\u0000\u0000"+
		"\u032a\u032c\u0001\u0000\u0000\u0000\u032b\u0327\u0001\u0000\u0000\u0000"+
		"\u032c\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000"+
		"\u032d\u032e\u0001\u0000\u0000\u0000\u032e}\u0001\u0000\u0000\u0000\u032f"+
		"\u032d\u0001\u0000\u0000\u0000\u0330\u0331\u0003\u0080@\u0000\u0331\u0332"+
		"\u0005\b\u0000\u0000\u0332\u0333\u0003\u0082A\u0000\u0333\u007f\u0001"+
		"\u0000\u0000\u0000\u0334\u0337\u0005\u0092\u0000\u0000\u0335\u0337\u0005"+
		"\u0095\u0000\u0000\u0336\u0334\u0001\u0000\u0000\u0000\u0336\u0335\u0001"+
		"\u0000\u0000\u0000\u0337\u0081\u0001\u0000\u0000\u0000\u0338\u033a\u0003"+
		"\u0084B\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000"+
		"\u0000\u0000\u033c\u0083\u0001\u0000\u0000\u0000\u033d\u0368\u0005\u0092"+
		"\u0000\u0000\u033e\u0368\u0005\u0090\u0000\u0000\u033f\u0368\u0005\u008f"+
		"\u0000\u0000\u0340\u0368\u0005\u0091\u0000\u0000\u0341\u0368\u0005\u0095"+
		"\u0000\u0000\u0342\u0368\u0005\u0097\u0000\u0000\u0343\u0368\u0005\u0096"+
		"\u0000\u0000\u0344\u0368\u0005\u0098\u0000\u0000\u0345\u0349\u0005\u0093"+
		"\u0000\u0000\u0346\u0348\u0003\u0084B\u0000\u0347\u0346\u0001\u0000\u0000"+
		"\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000"+
		"\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034c\u0001\u0000\u0000"+
		"\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u0368\u0005\u0004\u0000"+
		"\u0000\u034d\u0351\u0005\u0003\u0000\u0000\u034e\u0350\u0003\u0084B\u0000"+
		"\u034f\u034e\u0001\u0000\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000"+
		"\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000"+
		"\u0352\u0354\u0001\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000"+
		"\u0354\u0368\u0005\u0004\u0000\u0000\u0355\u0359\u0005\u0001\u0000\u0000"+
		"\u0356\u0358\u0003\u0084B\u0000\u0357\u0356\u0001\u0000\u0000\u0000\u0358"+
		"\u035b\u0001\u0000\u0000\u0000\u0359\u0357\u0001\u0000\u0000\u0000\u0359"+
		"\u035a\u0001\u0000\u0000\u0000\u035a\u035c\u0001\u0000\u0000\u0000\u035b"+
		"\u0359\u0001\u0000\u0000\u0000\u035c\u0368\u0005\u0002\u0000\u0000\u035d"+
		"\u0368\u0005\u0012\u0000\u0000\u035e\u0368\u0005\u000f\u0000\u0000\u035f"+
		"\u0368\u0005\u0010\u0000\u0000\u0360\u0368\u0005\n\u0000\u0000\u0361\u0368"+
		"\u0005\u000b\u0000\u0000\u0362\u0368\u0005\u000e\u0000\u0000\u0363\u0368"+
		"\u0005\t\u0000\u0000\u0364\u0368\u0005\f\u0000\u0000\u0365\u0368\u0005"+
		"\u0011\u0000\u0000\u0366\u0368\u0005\u0013\u0000\u0000\u0367\u033d\u0001"+
		"\u0000\u0000\u0000\u0367\u033e\u0001\u0000\u0000\u0000\u0367\u033f\u0001"+
		"\u0000\u0000\u0000\u0367\u0340\u0001\u0000\u0000\u0000\u0367\u0341\u0001"+
		"\u0000\u0000\u0000\u0367\u0342\u0001\u0000\u0000\u0000\u0367\u0343\u0001"+
		"\u0000\u0000\u0000\u0367\u0344\u0001\u0000\u0000\u0000\u0367\u0345\u0001"+
		"\u0000\u0000\u0000\u0367\u034d\u0001\u0000\u0000\u0000\u0367\u0355\u0001"+
		"\u0000\u0000\u0000\u0367\u035d\u0001\u0000\u0000\u0000\u0367\u035e\u0001"+
		"\u0000\u0000\u0000\u0367\u035f\u0001\u0000\u0000\u0000\u0367\u0360\u0001"+
		"\u0000\u0000\u0000\u0367\u0361\u0001\u0000\u0000\u0000\u0367\u0362\u0001"+
		"\u0000\u0000\u0000\u0367\u0363\u0001\u0000\u0000\u0000\u0367\u0364\u0001"+
		"\u0000\u0000\u0000\u0367\u0365\u0001\u0000\u0000\u0000\u0367\u0366\u0001"+
		"\u0000\u0000\u0000\u0368\u0085\u0001\u0000\u0000\u0000Z\u008c\u0092\u0097"+
		"\u009b\u00a0\u00a4\u00a9\u00af\u00b4\u00b9\u00c0\u00c8\u00d2\u00d5\u00dc"+
		"\u00e1\u00e9\u00ee\u00f4\u00fc\u0101\u0108\u010c\u0110\u0114\u0122\u012d"+
		"\u0136\u013d\u0145\u014b\u0153\u015e\u0164\u016d\u0173\u017d\u0184\u0189"+
		"\u0190\u0196\u01a1\u01a8\u01ab\u01ad\u01bc\u01c1\u01c4\u01cb\u01d2\u01d9"+
		"\u01ec\u01f6\u01f9\u0203\u0214\u021b\u0227\u022f\u023a\u024d\u0256\u0263"+
		"\u026a\u0278\u0299\u02a1\u02a7\u02ad\u02b2\u02b9\u02be\u02c3\u02d9\u02e1"+
		"\u02e9\u02ed\u02fc\u0304\u030c\u0314\u0324\u0329\u032d\u0336\u033b\u0349"+
		"\u0351\u0359\u0367";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}