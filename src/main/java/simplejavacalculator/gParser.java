// Generated from .\src\main\java\simplejavacalculator\g.g4 by ANTLR 4.13.0
package simplejavacalculator;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, DIGIT=12, ID=13, FUNCTION=14, LPAREN=15, RPAREN=16, 
		PLUS=17, MINUS=18, MULTIPLY=19, DIVIDE=20, POWER=21, WS=22;
	public static final int
		RULE_expression = 0, RULE_term = 1, RULE_factor = 2, RULE_unary = 3, RULE_power = 4, 
		RULE_primary = 5, RULE_primaryExpression = 6, RULE_functionCall = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"expression", "term", "factor", "unary", "power", "primary", "primaryExpression", 
			"functionCall", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'square'", "'sqrt'", "'1'", "'cos'", "'sin'", "'tan'", "'log'", 
			"'rate'", "'abs'", "'ln'", "'.'", null, null, null, "'('", "')'", "'+'", 
			"'-'", "'*'", "'/'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"DIGIT", "ID", "FUNCTION", "LPAREN", "RPAREN", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "POWER", "WS"
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
	public String getGrammarFileName() { return "g.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			term();
			setState(23);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(19);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(20);
					term();
					}
					} 
				}
				setState(25);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(gParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(gParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(gParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(gParser.DIVIDE, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			factor();
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(27);
					_la = _input.LA(1);
					if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(28);
					factor();
					}
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
	public static class FactorContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_factor);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				power();
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(gParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitUnary(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unary);
		int _la;
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(39);
				unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				primary();
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
	public static class PowerContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public List<TerminalNode> POWER() { return getTokens(gParser.POWER); }
		public TerminalNode POWER(int i) {
			return getToken(gParser.POWER, i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_power);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			primary();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					match(POWER);
					setState(45);
					primary();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
	public static class PrimaryContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(gParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(gParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(gParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(gParser.MINUS, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(gParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(gParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(gParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(gParser.DIVIDE, i);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_primary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			primaryExpression();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(53);
					primaryExpression();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primaryExpression);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(LPAREN);
				setState(62);
				expression();
				setState(63);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(MINUS);
				setState(66);
				primaryExpression();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(gParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(gParser.RPAREN, 0); }
		public TerminalNode DIVIDE() { return getToken(gParser.DIVIDE, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(T__0);
				setState(70);
				match(LPAREN);
				setState(71);
				expression();
				setState(72);
				match(RPAREN);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__1);
				setState(75);
				match(LPAREN);
				setState(76);
				expression();
				setState(77);
				match(RPAREN);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__2);
				setState(80);
				match(DIVIDE);
				setState(81);
				expression();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(T__3);
				setState(83);
				match(LPAREN);
				setState(84);
				expression();
				setState(85);
				match(RPAREN);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				match(T__4);
				setState(88);
				match(LPAREN);
				setState(89);
				expression();
				setState(90);
				match(RPAREN);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				match(T__5);
				setState(93);
				match(LPAREN);
				setState(94);
				expression();
				setState(95);
				match(RPAREN);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				match(T__6);
				setState(98);
				match(LPAREN);
				setState(99);
				expression();
				setState(100);
				match(RPAREN);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				match(T__7);
				setState(103);
				match(LPAREN);
				setState(104);
				expression();
				setState(105);
				match(RPAREN);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(107);
				match(T__8);
				setState(108);
				match(LPAREN);
				setState(109);
				expression();
				setState(110);
				match(RPAREN);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 10);
				{
				setState(112);
				match(T__9);
				setState(113);
				match(LPAREN);
				setState(114);
				expression();
				setState(115);
				match(RPAREN);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(gParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(gParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(gParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gListener ) ((gListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(119);
				match(MINUS);
				}
			}

			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				match(DIGIT);
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(127);
				match(T__10);
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(128);
					match(DIGIT);
					}
					}
					setState(131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u0016"+
		"\b\u0000\n\u0000\f\u0000\u0019\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0003\u0002%\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003*\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004/\b\u0004"+
		"\n\u0004\f\u00042\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"7\b\u0005\n\u0005\f\u0005:\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"D\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007v\b\u0007\u0001\b\u0003\by\b\b\u0001\b\u0004\b"+
		"|\b\b\u000b\b\f\b}\u0001\b\u0001\b\u0004\b\u0082\b\b\u000b\b\f\b\u0083"+
		"\u0003\b\u0086\b\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014"+
		"\u0001\u0000\u0011\u0014\u0094\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006)\u0001"+
		"\u0000\u0000\u0000\b+\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000\u0000"+
		"\fC\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010x\u0001"+
		"\u0000\u0000\u0000\u0012\u0017\u0003\u0002\u0001\u0000\u0013\u0014\u0007"+
		"\u0000\u0000\u0000\u0014\u0016\u0003\u0002\u0001\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0016\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0001\u0000\u0000\u0000\u0018\u0001\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u001f\u0003"+
		"\u0004\u0002\u0000\u001b\u001c\u0007\u0001\u0000\u0000\u001c\u001e\u0003"+
		"\u0004\u0002\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e!\u0001\u0000"+
		"\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000"+
		"\u0000 \u0003\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\""+
		"%\u0003\u0006\u0003\u0000#%\u0003\b\u0004\u0000$\"\u0001\u0000\u0000\u0000"+
		"$#\u0001\u0000\u0000\u0000%\u0005\u0001\u0000\u0000\u0000&\'\u0007\u0000"+
		"\u0000\u0000\'*\u0003\u0006\u0003\u0000(*\u0003\n\u0005\u0000)&\u0001"+
		"\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0007\u0001\u0000\u0000"+
		"\u0000+0\u0003\n\u0005\u0000,-\u0005\u0015\u0000\u0000-/\u0003\n\u0005"+
		"\u0000.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000"+
		"\u0000\u000001\u0001\u0000\u0000\u00001\t\u0001\u0000\u0000\u000020\u0001"+
		"\u0000\u0000\u000038\u0003\f\u0006\u000045\u0007\u0002\u0000\u000057\u0003"+
		"\f\u0006\u000064\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009\u000b\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000;D\u0003\u0010\b\u0000<D\u0003\u000e\u0007"+
		"\u0000=>\u0005\u000f\u0000\u0000>?\u0003\u0000\u0000\u0000?@\u0005\u0010"+
		"\u0000\u0000@D\u0001\u0000\u0000\u0000AB\u0005\u0012\u0000\u0000BD\u0003"+
		"\f\u0006\u0000C;\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000C=\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D\r\u0001\u0000\u0000\u0000"+
		"EF\u0005\u0001\u0000\u0000FG\u0005\u000f\u0000\u0000GH\u0003\u0000\u0000"+
		"\u0000HI\u0005\u0010\u0000\u0000Iv\u0001\u0000\u0000\u0000JK\u0005\u0002"+
		"\u0000\u0000KL\u0005\u000f\u0000\u0000LM\u0003\u0000\u0000\u0000MN\u0005"+
		"\u0010\u0000\u0000Nv\u0001\u0000\u0000\u0000OP\u0005\u0003\u0000\u0000"+
		"PQ\u0005\u0014\u0000\u0000Qv\u0003\u0000\u0000\u0000RS\u0005\u0004\u0000"+
		"\u0000ST\u0005\u000f\u0000\u0000TU\u0003\u0000\u0000\u0000UV\u0005\u0010"+
		"\u0000\u0000Vv\u0001\u0000\u0000\u0000WX\u0005\u0005\u0000\u0000XY\u0005"+
		"\u000f\u0000\u0000YZ\u0003\u0000\u0000\u0000Z[\u0005\u0010\u0000\u0000"+
		"[v\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\u000f\u0000"+
		"\u0000^_\u0003\u0000\u0000\u0000_`\u0005\u0010\u0000\u0000`v\u0001\u0000"+
		"\u0000\u0000ab\u0005\u0007\u0000\u0000bc\u0005\u000f\u0000\u0000cd\u0003"+
		"\u0000\u0000\u0000de\u0005\u0010\u0000\u0000ev\u0001\u0000\u0000\u0000"+
		"fg\u0005\b\u0000\u0000gh\u0005\u000f\u0000\u0000hi\u0003\u0000\u0000\u0000"+
		"ij\u0005\u0010\u0000\u0000jv\u0001\u0000\u0000\u0000kl\u0005\t\u0000\u0000"+
		"lm\u0005\u000f\u0000\u0000mn\u0003\u0000\u0000\u0000no\u0005\u0010\u0000"+
		"\u0000ov\u0001\u0000\u0000\u0000pq\u0005\n\u0000\u0000qr\u0005\u000f\u0000"+
		"\u0000rs\u0003\u0000\u0000\u0000st\u0005\u0010\u0000\u0000tv\u0001\u0000"+
		"\u0000\u0000uE\u0001\u0000\u0000\u0000uJ\u0001\u0000\u0000\u0000uO\u0001"+
		"\u0000\u0000\u0000uR\u0001\u0000\u0000\u0000uW\u0001\u0000\u0000\u0000"+
		"u\\\u0001\u0000\u0000\u0000ua\u0001\u0000\u0000\u0000uf\u0001\u0000\u0000"+
		"\u0000uk\u0001\u0000\u0000\u0000up\u0001\u0000\u0000\u0000v\u000f\u0001"+
		"\u0000\u0000\u0000wy\u0005\u0012\u0000\u0000xw\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000z|\u0005\f\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u0085\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0005\u000b\u0000\u0000\u0080\u0082\u0005\f\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086"+
		"\u0001\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0001\u0000\u0000\u0000\u0086\u0011\u0001\u0000\u0000\u0000\f\u0017\u001f"+
		"$)08Cux}\u0083\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}