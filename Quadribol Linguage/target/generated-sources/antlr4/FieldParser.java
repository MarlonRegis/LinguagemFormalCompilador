// Generated from Field.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FieldParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Name=13, Int=14, Real=15, WS=16, NL=17;
	public static final int
		RULE_field = 0, RULE_quadribol_match = 1, RULE_quadribol_players = 2, 
		RULE_addpoint_match = 3, RULE_losepoint_match = 4, RULE_multpoint_match = 5, 
		RULE_divpoint_match = 6, RULE_end_match = 7;
	public static final String[] ruleNames = {
		"field", "quadribol_match", "quadribol_players", "addpoint_match", "losepoint_match", 
		"multpoint_match", "divpoint_match", "end_match"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' partida de quadribol em hogwarts'", "'Cada time sera composto por '", 
		"' jogadores'", "'O time ganhou '", "' apos arreme\u00E7o que vale '", 
		"' pontos'", "'O time perdeu '", "' pontos do total de '", "'Dumbledore viu harry e multiplicou '", 
		"' vezes os pontos '", "'Dumbledore viu tom riddle e dividiu '", "'Fim de partida'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Name", "Int", "Real", "WS", "NL"
	};
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
	public String getGrammarFileName() { return "Field.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FieldParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FieldParser.EOF, 0); }
		public List<Quadribol_matchContext> quadribol_match() {
			return getRuleContexts(Quadribol_matchContext.class);
		}
		public Quadribol_matchContext quadribol_match(int i) {
			return getRuleContext(Quadribol_matchContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(FieldParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(FieldParser.NL, i);
		}
		public List<Quadribol_playersContext> quadribol_players() {
			return getRuleContexts(Quadribol_playersContext.class);
		}
		public Quadribol_playersContext quadribol_players(int i) {
			return getRuleContext(Quadribol_playersContext.class,i);
		}
		public List<Losepoint_matchContext> losepoint_match() {
			return getRuleContexts(Losepoint_matchContext.class);
		}
		public Losepoint_matchContext losepoint_match(int i) {
			return getRuleContext(Losepoint_matchContext.class,i);
		}
		public Addpoint_matchContext addpoint_match() {
			return getRuleContext(Addpoint_matchContext.class,0);
		}
		public Multpoint_matchContext multpoint_match() {
			return getRuleContext(Multpoint_matchContext.class,0);
		}
		public Divpoint_matchContext divpoint_match() {
			return getRuleContext(Divpoint_matchContext.class,0);
		}
		public End_matchContext end_match() {
			return getRuleContext(End_matchContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				quadribol_match();
				setState(17);
				match(NL);
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int || _la==Real );
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				quadribol_players();
				setState(24);
				match(NL);
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(30);
				losepoint_match();
				setState(31);
				match(NL);
				}
				break;
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(35);
				addpoint_match();
				setState(36);
				match(NL);
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(40);
				losepoint_match();
				setState(41);
				match(NL);
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(45);
				multpoint_match();
				setState(46);
				match(NL);
				}
			}

			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(50);
				divpoint_match();
				setState(51);
				match(NL);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(55);
				end_match();
				setState(56);
				match(NL);
				}
			}

			setState(60);
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

	public static class Quadribol_matchContext extends ParserRuleContext {
		public Token value;
		public TerminalNode Int() { return getToken(FieldParser.Int, 0); }
		public TerminalNode Real() { return getToken(FieldParser.Real, 0); }
		public Quadribol_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadribol_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterQuadribol_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitQuadribol_match(this);
		}
	}

	public final Quadribol_matchContext quadribol_match() throws RecognitionException {
		Quadribol_matchContext _localctx = new Quadribol_matchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_quadribol_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((Quadribol_matchContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Quadribol_matchContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(63);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Quadribol_playersContext extends ParserRuleContext {
		public Token quant;
		public TerminalNode Int() { return getToken(FieldParser.Int, 0); }
		public Quadribol_playersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quadribol_players; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterQuadribol_players(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitQuadribol_players(this);
		}
	}

	public final Quadribol_playersContext quadribol_players() throws RecognitionException {
		Quadribol_playersContext _localctx = new Quadribol_playersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_quadribol_players);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__1);
			setState(66);
			((Quadribol_playersContext)_localctx).quant = match(Int);
			setState(67);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Addpoint_matchContext extends ParserRuleContext {
		public Token value1;
		public Token value2;
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public List<TerminalNode> Real() { return getTokens(FieldParser.Real); }
		public TerminalNode Real(int i) {
			return getToken(FieldParser.Real, i);
		}
		public Addpoint_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addpoint_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterAddpoint_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitAddpoint_match(this);
		}
	}

	public final Addpoint_matchContext addpoint_match() throws RecognitionException {
		Addpoint_matchContext _localctx = new Addpoint_matchContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_addpoint_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__3);
			setState(70);
			((Addpoint_matchContext)_localctx).value1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Addpoint_matchContext)_localctx).value1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(T__4);
			setState(72);
			((Addpoint_matchContext)_localctx).value2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Addpoint_matchContext)_localctx).value2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(73);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Losepoint_matchContext extends ParserRuleContext {
		public Token value1;
		public Token value2;
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public List<TerminalNode> Real() { return getTokens(FieldParser.Real); }
		public TerminalNode Real(int i) {
			return getToken(FieldParser.Real, i);
		}
		public Losepoint_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_losepoint_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterLosepoint_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitLosepoint_match(this);
		}
	}

	public final Losepoint_matchContext losepoint_match() throws RecognitionException {
		Losepoint_matchContext _localctx = new Losepoint_matchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_losepoint_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__6);
			setState(76);
			((Losepoint_matchContext)_localctx).value1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Losepoint_matchContext)_localctx).value1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			match(T__7);
			setState(78);
			((Losepoint_matchContext)_localctx).value2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Losepoint_matchContext)_localctx).value2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(79);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multpoint_matchContext extends ParserRuleContext {
		public Token value1;
		public Token value2;
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public List<TerminalNode> Real() { return getTokens(FieldParser.Real); }
		public TerminalNode Real(int i) {
			return getToken(FieldParser.Real, i);
		}
		public Multpoint_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multpoint_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterMultpoint_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitMultpoint_match(this);
		}
	}

	public final Multpoint_matchContext multpoint_match() throws RecognitionException {
		Multpoint_matchContext _localctx = new Multpoint_matchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_multpoint_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__8);
			setState(82);
			((Multpoint_matchContext)_localctx).value1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Multpoint_matchContext)_localctx).value1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(83);
			match(T__9);
			setState(84);
			((Multpoint_matchContext)_localctx).value2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Multpoint_matchContext)_localctx).value2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Divpoint_matchContext extends ParserRuleContext {
		public Token value1;
		public Token value2;
		public List<TerminalNode> Int() { return getTokens(FieldParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(FieldParser.Int, i);
		}
		public List<TerminalNode> Real() { return getTokens(FieldParser.Real); }
		public TerminalNode Real(int i) {
			return getToken(FieldParser.Real, i);
		}
		public Divpoint_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divpoint_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterDivpoint_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitDivpoint_match(this);
		}
	}

	public final Divpoint_matchContext divpoint_match() throws RecognitionException {
		Divpoint_matchContext _localctx = new Divpoint_matchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_divpoint_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__10);
			setState(87);
			((Divpoint_matchContext)_localctx).value1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Divpoint_matchContext)_localctx).value1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(88);
			match(T__9);
			setState(89);
			((Divpoint_matchContext)_localctx).value2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Real) ) {
				((Divpoint_matchContext)_localctx).value2 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class End_matchContext extends ParserRuleContext {
		public End_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).enterEnd_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FieldListener ) ((FieldListener)listener).exitEnd_match(this);
		}
	}

	public final End_matchContext end_match() throws RecognitionException {
		End_matchContext _localctx = new End_matchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_end_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\5\2)\n\2\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\3\2\5\2\63\n\2\3"+
		"\2\3\2\3\2\5\28\n\2\3\2\3\2\3\2\5\2=\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\3\3\2\20"+
		"\21\2_\2\25\3\2\2\2\4@\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fS\3\2"+
		"\2\2\16X\3\2\2\2\20]\3\2\2\2\22\23\5\4\3\2\23\24\7\23\2\2\24\26\3\2\2"+
		"\2\25\22\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\34\3\2\2"+
		"\2\31\32\5\6\4\2\32\33\7\23\2\2\33\35\3\2\2\2\34\31\3\2\2\2\35\36\3\2"+
		"\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37#\3\2\2\2 !\5\n\6\2!\"\7\23\2\2\"$"+
		"\3\2\2\2# \3\2\2\2#$\3\2\2\2$(\3\2\2\2%&\5\b\5\2&\'\7\23\2\2\')\3\2\2"+
		"\2(%\3\2\2\2()\3\2\2\2)-\3\2\2\2*+\5\n\6\2+,\7\23\2\2,.\3\2\2\2-*\3\2"+
		"\2\2-.\3\2\2\2.\62\3\2\2\2/\60\5\f\7\2\60\61\7\23\2\2\61\63\3\2\2\2\62"+
		"/\3\2\2\2\62\63\3\2\2\2\63\67\3\2\2\2\64\65\5\16\b\2\65\66\7\23\2\2\66"+
		"8\3\2\2\2\67\64\3\2\2\2\678\3\2\2\28<\3\2\2\29:\5\20\t\2:;\7\23\2\2;="+
		"\3\2\2\2<9\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\2\2\3?\3\3\2\2\2@A\t\2\2\2"+
		"AB\7\3\2\2B\5\3\2\2\2CD\7\4\2\2DE\7\20\2\2EF\7\5\2\2F\7\3\2\2\2GH\7\6"+
		"\2\2HI\t\2\2\2IJ\7\7\2\2JK\t\2\2\2KL\7\b\2\2L\t\3\2\2\2MN\7\t\2\2NO\t"+
		"\2\2\2OP\7\n\2\2PQ\t\2\2\2QR\7\b\2\2R\13\3\2\2\2ST\7\13\2\2TU\t\2\2\2"+
		"UV\7\f\2\2VW\t\2\2\2W\r\3\2\2\2XY\7\r\2\2YZ\t\2\2\2Z[\7\f\2\2[\\\t\2\2"+
		"\2\\\17\3\2\2\2]^\7\16\2\2^\21\3\2\2\2\n\27\36#(-\62\67<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}