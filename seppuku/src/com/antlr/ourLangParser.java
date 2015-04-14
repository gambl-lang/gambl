// Generated from ourLang.g4 by ANTLR 4.5
package com.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, IMPORT=29, IF=30, ELSE=31, WHILE=32, 
		FOR=33, PFOR=34, MATRIX=35, VECTOR=36, INT=37, INTNUM=38, FLOAT=39, FLOATNUM=40, 
		BOOL=41, BOOLVAL=42, VOID=43, STRING=44, SIGN=45, PRINT=46, ID=47, LIBRARY=48, 
		WS=49, NL=50, COMMENT=51, LINE_COMMENT=52;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_importing = 2, RULE_controlblock = 3, 
		RULE_loop = 4, RULE_block = 5, RULE_conditionalExpression = 6, RULE_functiondeclaration = 7, 
		RULE_functionbody = 8, RULE_functionreturn = 9, RULE_parameterlist = 10, 
		RULE_parameter = 11, RULE_functioncall = 12, RULE_argumentlist = 13, RULE_expression = 14, 
		RULE_assignment = 15, RULE_valassignment = 16, RULE_collectionassignment = 17, 
		RULE_declaration = 18, RULE_datatype = 19, RULE_complexdatatype = 20, 
		RULE_functiondatatype = 21, RULE_value = 22, RULE_collectionEntrance = 23, 
		RULE_valueList = 24, RULE_constantList = 25, RULE_entranceCoordinate = 26, 
		RULE_collectiontype = 27, RULE_postUnaryOperator = 28, RULE_assignmentOperator = 29, 
		RULE_conditionalOperator = 30, RULE_constant = 31;
	public static final String[] ruleNames = {
		"topLevel", "statement", "importing", "controlblock", "loop", "block", 
		"conditionalExpression", "functiondeclaration", "functionbody", "functionreturn", 
		"parameterlist", "parameter", "functioncall", "argumentlist", "expression", 
		"assignment", "valassignment", "collectionassignment", "declaration", 
		"datatype", "complexdatatype", "functiondatatype", "value", "collectionEntrance", 
		"valueList", "constantList", "entranceCoordinate", "collectiontype", "postUnaryOperator", 
		"assignmentOperator", "conditionalOperator", "constant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", 
		"'return'", "','", "'*'", "'/'", "'%'", "'+'", "'='", "'['", "']'", "'++'", 
		"'--'", "'+='", "'-='", "'*='", "'/='", "'=='", "'!='", "'<='", "'>='", 
		null, "'if'", "'else'", "'while'", "'for'", "'pfor'", "'matrix'", "'vector'", 
		null, null, null, null, "'bool'", null, "'void'", null, "'-'", "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "IMPORT", "IF", "ELSE", "WHILE", "FOR", 
		"PFOR", "MATRIX", "VECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", "BOOL", 
		"BOOLVAL", "VOID", "STRING", "SIGN", "PRINT", "ID", "LIBRARY", "WS", "NL", 
		"COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ourLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ourLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ourLangParser.EOF, 0); }
		public List<ImportingContext> importing() {
			return getRuleContexts(ImportingContext.class);
		}
		public ImportingContext importing(int i) {
			return getRuleContext(ImportingContext.class,i);
		}
		public List<FunctiondeclarationContext> functiondeclaration() {
			return getRuleContexts(FunctiondeclarationContext.class);
		}
		public FunctiondeclarationContext functiondeclaration(int i) {
			return getRuleContext(FunctiondeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitTopLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topLevel);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(64);
				importing();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					functiondeclaration();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PFOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ControlblockContext controlblock() {
			return getRuleContext(ControlblockContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				assignment();
				setState(85);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				declaration();
				setState(88);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				functioncall();
				setState(91);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				controlblock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				loop();
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

	public static class ImportingContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ourLangParser.IMPORT, 0); }
		public TerminalNode LIBRARY() { return getToken(ourLangParser.LIBRARY, 0); }
		public ImportingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importing; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitImporting(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportingContext importing() throws RecognitionException {
		ImportingContext _localctx = new ImportingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IMPORT);
			setState(98);
			match(T__1);
			setState(99);
			match(LIBRARY);
			setState(100);
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

	public static class ControlblockContext extends ParserRuleContext {
		public BlockContext ifBlock;
		public BlockContext elseIfBlock;
		public BlockContext elseBlock;
		public List<TerminalNode> IF() { return getTokens(ourLangParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ourLangParser.IF, i);
		}
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(ourLangParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(ourLangParser.ELSE, i);
		}
		public ControlblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitControlblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlblockContext controlblock() throws RecognitionException {
		ControlblockContext _localctx = new ControlblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_controlblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(IF);
			setState(103);
			match(T__3);
			setState(104);
			conditionalExpression(0);
			setState(105);
			match(T__4);
			setState(106);
			((ControlblockContext)_localctx).ifBlock = block();
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(ELSE);
					setState(108);
					match(IF);
					setState(109);
					match(T__3);
					setState(110);
					conditionalExpression(0);
					setState(111);
					match(T__4);
					setState(112);
					((ControlblockContext)_localctx).elseIfBlock = block();
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(121);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(119);
				match(ELSE);
				setState(120);
				((ControlblockContext)_localctx).elseBlock = block();
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

	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileLoopContext extends LoopContext {
		public BlockContext whileBlock;
		public TerminalNode WHILE() { return getToken(ourLangParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public WhileLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoopContext extends LoopContext {
		public BlockContext forBlock;
		public TerminalNode FOR() { return getToken(ourLangParser.FOR, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ForLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PforLoopContext extends LoopContext {
		public BlockContext pforBlock;
		public TerminalNode PFOR() { return getToken(ourLangParser.PFOR, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PforLoopContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPforLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loop);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(WHILE);
				setState(124);
				match(T__3);
				setState(127);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(125);
					conditionalExpression(0);
					}
					break;
				case 2:
					{
					setState(126);
					match(BOOLVAL);
					}
					break;
				}
				setState(129);
				match(T__4);
				setState(130);
				((WhileLoopContext)_localctx).whileBlock = block();
				}
				break;
			case FOR:
				_localctx = new ForLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(FOR);
				setState(132);
				match(T__3);
				setState(135);
				switch (_input.LA(1)) {
				case MATRIX:
				case VECTOR:
				case INT:
				case FLOAT:
				case BOOL:
					{
					setState(133);
					declaration();
					}
					break;
				case ID:
					{
					setState(134);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137);
				match(T__0);
				setState(138);
				conditionalExpression(0);
				setState(139);
				match(T__0);
				setState(140);
				expression(0);
				setState(141);
				match(T__4);
				setState(142);
				((ForLoopContext)_localctx).forBlock = block();
				}
				break;
			case PFOR:
				_localctx = new PforLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(PFOR);
				setState(145);
				match(T__3);
				setState(148);
				switch (_input.LA(1)) {
				case MATRIX:
				case VECTOR:
				case INT:
				case FLOAT:
				case BOOL:
					{
					setState(146);
					declaration();
					}
					break;
				case ID:
					{
					setState(147);
					assignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150);
				match(T__0);
				setState(151);
				conditionalExpression(0);
				setState(152);
				match(T__0);
				setState(153);
				expression(0);
				setState(154);
				match(T__4);
				setState(155);
				((PforLoopContext)_localctx).pforBlock = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__5);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PFOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	 
		public ConditionalExpressionContext() { }
		public void copyFrom(ConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiAndCondExprContext extends ConditionalExpressionContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public MultiAndCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiAndCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCondExprContext extends ConditionalExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public SingleCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitSingleCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiOrCondExprContext extends ConditionalExpressionContext {
		public List<ConditionalExpressionContext> conditionalExpression() {
			return getRuleContexts(ConditionalExpressionContext.class);
		}
		public ConditionalExpressionContext conditionalExpression(int i) {
			return getRuleContext(ConditionalExpressionContext.class,i);
		}
		public MultiOrCondExprContext(ConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMultiOrCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		return conditionalExpression(0);
	}

	private ConditionalExpressionContext conditionalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, _parentState);
		ConditionalExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_conditionalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleCondExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(169);
			expression(0);
			setState(170);
			conditionalOperator();
			setState(171);
			expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(179);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultiAndCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(173);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(174);
						match(T__7);
						setState(175);
						conditionalExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new MultiOrCondExprContext(new ConditionalExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExpression);
						setState(176);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(177);
						match(T__8);
						setState(178);
						conditionalExpression(3);
						}
						break;
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public FunctiondatatypeContext functiondatatype() {
			return getRuleContext(FunctiondatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			functiondatatype();
			setState(185);
			match(ID);
			setState(186);
			match(T__3);
			setState(187);
			parameterlist();
			setState(188);
			match(T__4);
			setState(189);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionreturnContext functionreturn() {
			return getRuleContext(FunctionreturnContext.class,0);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionbody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__5);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PFOR) | (1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL) | (1L << PRINT) | (1L << ID))) != 0)) {
				{
				{
				setState(192);
				statement();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(198);
				functionreturn();
				}
			}

			setState(201);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionreturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionreturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionreturn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctionreturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionreturnContext functionreturn() throws RecognitionException {
		FunctionreturnContext _localctx = new FunctionreturnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionreturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__9);
			setState(204);
			expression(0);
			setState(205);
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParameterlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameterlist);
		int _la;
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MATRIX) | (1L << VECTOR) | (1L << INT) | (1L << FLOAT) | (1L << BOOL))) != 0)) {
					{
					setState(207);
					parameter();
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__10) {
						{
						{
						setState(208);
						match(T__10);
						setState(209);
						parameter();
						}
						}
						setState(214);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				{
				setState(220);
				datatype();
				}
				break;
			case MATRIX:
			case VECTOR:
				{
				setState(221);
				complexdatatype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctioncallContext extends ParserRuleContext {
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
	 
		public FunctioncallContext() { }
		public void copyFrom(FunctioncallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CustomFuncContext extends FunctioncallContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public CustomFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCustomFunc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFuncContext extends FunctioncallContext {
		public TerminalNode PRINT() { return getToken(ourLangParser.PRINT, 0); }
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public PrintFuncContext(FunctioncallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPrintFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functioncall);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new CustomFuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				setState(227);
				match(T__3);
				setState(228);
				argumentlist();
				setState(229);
				match(T__4);
				}
				break;
			case PRINT:
				_localctx = new PrintFuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(PRINT);
				setState(232);
				match(T__3);
				setState(233);
				argumentlist();
				setState(234);
				match(T__4);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STRING() { return getToken(ourLangParser.STRING, 0); }
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitArgumentlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_argumentlist);
		int _la;
		try {
			setState(248);
			switch (_input.LA(1)) {
			case T__3:
			case T__16:
			case INTNUM:
			case FLOATNUM:
			case BOOLVAL:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				expression(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(239);
					match(T__10);
					setState(240);
					expression(0);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(STRING);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
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
	public static class ValueExprContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIDExprContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public PostIDExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostIDExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(251);
				match(T__3);
				setState(252);
				expression(0);
				setState(253);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255);
				value();
				}
				break;
			case 3:
				{
				_localctx = new PostIDExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(256);
				match(ID);
				setState(257);
				postUnaryOperator();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new MulExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(261);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(262);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(264);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==SIGN) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(265);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ValassignmentContext valassignment() {
			return getRuleContext(ValassignmentContext.class,0);
		}
		public CollectionassignmentContext collectionassignment() {
			return getRuleContext(CollectionassignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				valassignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				collectionassignment();
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

	public static class ValassignmentContext extends ParserRuleContext {
		public ValassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valassignment; }
	 
		public ValassignmentContext() { }
		public void copyFrom(ValassignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostUnaryAssignmentContext extends ValassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public PostUnaryOperatorContext postUnaryOperator() {
			return getRuleContext(PostUnaryOperatorContext.class,0);
		}
		public PostUnaryAssignmentContext(ValassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostUnaryAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StdAssignmentContext extends ValassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public StdAssignmentContext(ValassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitStdAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValassignmentContext valassignment() throws RecognitionException {
		ValassignmentContext _localctx = new ValassignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valassignment);
		try {
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new StdAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ID);
				setState(276);
				assignmentOperator();
				setState(279);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(277);
					expression(0);
					}
					break;
				case 2:
					{
					setState(278);
					match(BOOLVAL);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new PostUnaryAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(ID);
				setState(282);
				postUnaryOperator();
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

	public static class CollectionassignmentContext extends ParserRuleContext {
		public CollectionassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionassignment; }
	 
		public CollectionassignmentContext() { }
		public void copyFrom(CollectionassignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EntireCollectionAssignmentContext extends CollectionassignmentContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EntireCollectionAssignmentContext(CollectionassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitEntireCollectionAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectionEntranceAssignmentContext extends CollectionassignmentContext {
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CollectionEntranceAssignmentContext(CollectionassignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionEntranceAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionassignmentContext collectionassignment() throws RecognitionException {
		CollectionassignmentContext _localctx = new CollectionassignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_collectionassignment);
		try {
			setState(292);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new EntireCollectionAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(ID);
				setState(286);
				match(T__15);
				setState(287);
				expression(0);
				}
				break;
			case 2:
				_localctx = new CollectionEntranceAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				collectionEntrance();
				setState(289);
				assignmentOperator();
				setState(290);
				expression(0);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimitiveDeclContext extends DeclarationContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimitiveDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPrimitiveDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexDeclContext extends DeclarationContext {
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ComplexDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitComplexDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaration);
		try {
			setState(304);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				_localctx = new PrimitiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				datatype();
				setState(295);
				match(ID);
				setState(296);
				match(T__15);
				setState(297);
				expression(0);
				}
				break;
			case MATRIX:
			case VECTOR:
				_localctx = new ComplexDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				complexdatatype();
				setState(300);
				match(ID);
				setState(301);
				match(T__15);
				setState(302);
				expression(0);
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	 
		public DatatypeContext() { }
		public void copyFrom(DatatypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanContext extends DatatypeContext {
		public TerminalNode BOOL() { return getToken(ourLangParser.BOOL, 0); }
		public BooleanContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatingpointContext extends DatatypeContext {
		public TerminalNode FLOAT() { return getToken(ourLangParser.FLOAT, 0); }
		public FloatingpointContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFloatingpoint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends DatatypeContext {
		public TerminalNode INT() { return getToken(ourLangParser.INT, 0); }
		public IntegerContext(DatatypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_datatype);
		try {
			setState(309);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatingpointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(FLOAT);
				}
				break;
			case BOOL:
				_localctx = new BooleanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(BOOL);
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

	public static class ComplexdatatypeContext extends ParserRuleContext {
		public CollectiontypeContext collectiontype() {
			return getRuleContext(CollectiontypeContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ComplexdatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexdatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitComplexdatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexdatatypeContext complexdatatype() throws RecognitionException {
		ComplexdatatypeContext _localctx = new ComplexdatatypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_complexdatatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			collectiontype();
			setState(312);
			match(T__1);
			setState(313);
			datatype();
			setState(314);
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

	public static class FunctiondatatypeContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public ComplexdatatypeContext complexdatatype() {
			return getRuleContext(ComplexdatatypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(ourLangParser.VOID, 0); }
		public FunctiondatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondatatype; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitFunctiondatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondatatypeContext functiondatatype() throws RecognitionException {
		FunctiondatatypeContext _localctx = new FunctiondatatypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_functiondatatype);
		try {
			setState(319);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				datatype();
				}
				break;
			case MATRIX:
			case VECTOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				complexdatatype();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(VOID);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValIDContext extends ValueContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public ValIDContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValID(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFuncCallContext extends ValueContext {
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public ValFuncCallContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValListContext extends ValueContext {
		public List<ValueListContext> valueList() {
			return getRuleContexts(ValueListContext.class);
		}
		public ValueListContext valueList(int i) {
			return getRuleContext(ValueListContext.class,i);
		}
		public ValListContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCollectionEntranceContext extends ValueContext {
		public CollectionEntranceContext collectionEntrance() {
			return getRuleContext(CollectionEntranceContext.class,0);
		}
		public ValCollectionEntranceContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValConstantContext extends ValueContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ValConstantContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public TerminalNode BOOLVAL() { return getToken(ourLangParser.BOOLVAL, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ValIDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(ID);
				}
				break;
			case 2:
				_localctx = new ValConstantContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				constant();
				}
				break;
			case 3:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(T__16);
				setState(324);
				valueList();
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(325);
					match(T__0);
					setState(326);
					valueList();
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(T__17);
				}
				break;
			case 4:
				_localctx = new ValFuncCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				functioncall();
				}
				break;
			case 5:
				_localctx = new ValCollectionEntranceContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(335);
				collectionEntrance();
				}
				break;
			case 6:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(336);
				match(BOOLVAL);
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

	public static class CollectionEntranceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ourLangParser.ID, 0); }
		public EntranceCoordinateContext entranceCoordinate() {
			return getRuleContext(EntranceCoordinateContext.class,0);
		}
		public CollectionEntranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionEntrance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionEntrance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionEntranceContext collectionEntrance() throws RecognitionException {
		CollectionEntranceContext _localctx = new CollectionEntranceContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_collectionEntrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ID);
			setState(340);
			match(T__16);
			setState(341);
			entranceCoordinate();
			setState(342);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			value();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(345);
				match(T__10);
				setState(346);
				value();
				}
				}
				setState(351);
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

	public static class ConstantListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			constant();
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(353);
				match(T__10);
				setState(354);
				constant();
				}
				}
				setState(359);
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

	public static class EntranceCoordinateContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EntranceCoordinateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entranceCoordinate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitEntranceCoordinate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntranceCoordinateContext entranceCoordinate() throws RecognitionException {
		EntranceCoordinateContext _localctx = new EntranceCoordinateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_entranceCoordinate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			value();
			setState(363);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(361);
				match(T__10);
				setState(362);
				value();
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

	public static class CollectiontypeContext extends ParserRuleContext {
		public CollectiontypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectiontype; }
	 
		public CollectiontypeContext() { }
		public void copyFrom(CollectiontypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CollectionVectorContext extends CollectiontypeContext {
		public TerminalNode VECTOR() { return getToken(ourLangParser.VECTOR, 0); }
		public CollectionVectorContext(CollectiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionVector(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollectionMatrixContext extends CollectiontypeContext {
		public TerminalNode MATRIX() { return getToken(ourLangParser.MATRIX, 0); }
		public CollectionMatrixContext(CollectiontypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitCollectionMatrix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectiontypeContext collectiontype() throws RecognitionException {
		CollectiontypeContext _localctx = new CollectiontypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_collectiontype);
		try {
			setState(367);
			switch (_input.LA(1)) {
			case MATRIX:
				_localctx = new CollectionMatrixContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(MATRIX);
				}
				break;
			case VECTOR:
				_localctx = new CollectionVectorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(VECTOR);
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

	public static class PostUnaryOperatorContext extends ParserRuleContext {
		public PostUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postUnaryOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitPostUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostUnaryOperatorContext postUnaryOperator() throws RecognitionException {
		PostUnaryOperatorContext _localctx = new PostUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_postUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConditionalOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTNUM() { return getToken(ourLangParser.INTNUM, 0); }
		public TerminalNode FLOATNUM() { return getToken(ourLangParser.FLOATNUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ourLangVisitor ) return ((ourLangVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !(_la==INTNUM || _la==FLOATNUM) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return conditionalExpression_sempred((ConditionalExpressionContext)_localctx, predIndex);
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditionalExpression_sempred(ConditionalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u017c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\3\2\7\2P\n"+
		"\2\f\2\16\2S\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3b\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5u\n\5\f\5\16\5x\13\5\3\5\3\5\5\5|\n\5\3\6\3\6\3\6\3\6\5\6"+
		"\u0082\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u0097\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a0"+
		"\n\6\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u00c4\n\n\f\n\16\n\u00c7\13\n\3\n\5\n"+
		"\u00ca\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d5\n\f\f\f\16"+
		"\f\u00d8\13\f\5\f\u00da\n\f\3\f\5\f\u00dd\n\f\3\r\3\r\5\r\u00e1\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n"+
		"\16\3\17\3\17\3\17\7\17\u00f4\n\17\f\17\16\17\u00f7\13\17\3\17\3\17\5"+
		"\17\u00fb\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0105\n\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u010d\n\20\f\20\16\20\u0110\13\20"+
		"\3\21\3\21\5\21\u0114\n\21\3\22\3\22\3\22\3\22\5\22\u011a\n\22\3\22\3"+
		"\22\5\22\u011e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0127\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0133\n\24\3\25"+
		"\3\25\3\25\5\25\u0138\n\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\5\27"+
		"\u0142\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u014a\n\30\f\30\16\30\u014d"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\5\30\u0154\n\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\7\32\u015e\n\32\f\32\16\32\u0161\13\32\3\33\3\33\3"+
		"\33\7\33\u0166\n\33\f\33\16\33\u0169\13\33\3\34\3\34\3\34\5\34\u016e\n"+
		"\34\3\35\3\35\5\35\u0172\n\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\4\16"+
		"\36\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@\2\b\3\2\16\20\4\2\21\21//\3\2\25\26\4\2\22\22\27\32\4\2\4\5\33\36\4"+
		"\2((**\u018d\2E\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\bh\3\2\2\2\n\u009f\3\2\2"+
		"\2\f\u00a1\3\2\2\2\16\u00aa\3\2\2\2\20\u00ba\3\2\2\2\22\u00c1\3\2\2\2"+
		"\24\u00cd\3\2\2\2\26\u00dc\3\2\2\2\30\u00e0\3\2\2\2\32\u00ee\3\2\2\2\34"+
		"\u00fa\3\2\2\2\36\u0104\3\2\2\2 \u0113\3\2\2\2\"\u011d\3\2\2\2$\u0126"+
		"\3\2\2\2&\u0132\3\2\2\2(\u0137\3\2\2\2*\u0139\3\2\2\2,\u0141\3\2\2\2."+
		"\u0153\3\2\2\2\60\u0155\3\2\2\2\62\u015a\3\2\2\2\64\u0162\3\2\2\2\66\u016a"+
		"\3\2\2\28\u0171\3\2\2\2:\u0173\3\2\2\2<\u0175\3\2\2\2>\u0177\3\2\2\2@"+
		"\u0179\3\2\2\2BD\5\6\4\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FK\3\2"+
		"\2\2GE\3\2\2\2HJ\5\20\t\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LQ\3"+
		"\2\2\2MK\3\2\2\2NP\5\4\3\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SQ\3\2\2\2TU\7\2\2\3U\3\3\2\2\2VW\5 \21\2WX\7\3\2\2Xb\3\2\2\2YZ"+
		"\5&\24\2Z[\7\3\2\2[b\3\2\2\2\\]\5\32\16\2]^\7\3\2\2^b\3\2\2\2_b\5\b\5"+
		"\2`b\5\n\6\2aV\3\2\2\2aY\3\2\2\2a\\\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\5\3\2"+
		"\2\2cd\7\37\2\2de\7\4\2\2ef\7\62\2\2fg\7\5\2\2g\7\3\2\2\2hi\7 \2\2ij\7"+
		"\6\2\2jk\5\16\b\2kl\7\7\2\2lv\5\f\7\2mn\7!\2\2no\7 \2\2op\7\6\2\2pq\5"+
		"\16\b\2qr\7\7\2\2rs\5\f\7\2su\3\2\2\2tm\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw"+
		"\3\2\2\2w{\3\2\2\2xv\3\2\2\2yz\7!\2\2z|\5\f\7\2{y\3\2\2\2{|\3\2\2\2|\t"+
		"\3\2\2\2}~\7\"\2\2~\u0081\7\6\2\2\177\u0082\5\16\b\2\u0080\u0082\7,\2"+
		"\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\7\7\2\2\u0084\u00a0\5\f\7\2\u0085\u0086\7#\2\2\u0086\u0089\7\6\2\2\u0087"+
		"\u008a\5&\24\2\u0088\u008a\5 \21\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\3\2\2\u008c\u008d\5\16\b\2\u008d"+
		"\u008e\7\3\2\2\u008e\u008f\5\36\20\2\u008f\u0090\7\7\2\2\u0090\u0091\5"+
		"\f\7\2\u0091\u00a0\3\2\2\2\u0092\u0093\7$\2\2\u0093\u0096\7\6\2\2\u0094"+
		"\u0097\5&\24\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\3\2\2\u0099\u009a\5\16\b\2\u009a"+
		"\u009b\7\3\2\2\u009b\u009c\5\36\20\2\u009c\u009d\7\7\2\2\u009d\u009e\5"+
		"\f\7\2\u009e\u00a0\3\2\2\2\u009f}\3\2\2\2\u009f\u0085\3\2\2\2\u009f\u0092"+
		"\3\2\2\2\u00a0\13\3\2\2\2\u00a1\u00a5\7\b\2\2\u00a2\u00a4\5\4\3\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9"+
		"\r\3\2\2\2\u00aa\u00ab\b\b\1\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\5> \2"+
		"\u00ad\u00ae\5\36\20\2\u00ae\u00b7\3\2\2\2\u00af\u00b0\f\5\2\2\u00b0\u00b1"+
		"\7\n\2\2\u00b1\u00b6\5\16\b\6\u00b2\u00b3\f\4\2\2\u00b3\u00b4\7\13\2\2"+
		"\u00b4\u00b6\5\16\b\5\u00b5\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\17\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\5,\27\2\u00bb\u00bc\7\61\2\2\u00bc\u00bd\7"+
		"\6\2\2\u00bd\u00be\5\26\f\2\u00be\u00bf\7\7\2\2\u00bf\u00c0\5\22\n\2\u00c0"+
		"\21\3\2\2\2\u00c1\u00c5\7\b\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c2\3\2\2"+
		"\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\5\24\13\2\u00c9\u00c8\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7\t\2\2\u00cc\23"+
		"\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\u00cf\5\36\20\2\u00cf\u00d0\7\3\2\2"+
		"\u00d0\25\3\2\2\2\u00d1\u00d6\5\30\r\2\u00d2\u00d3\7\r\2\2\u00d3\u00d5"+
		"\5\30\r\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00d1"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\27\3\2\2\2\u00de\u00e1\5(\25"+
		"\2\u00df\u00e1\5*\26\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\7\61\2\2\u00e3\31\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5"+
		"\u00e6\7\6\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e8\7\7\2\2\u00e8\u00ef\3"+
		"\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7\6\2\2\u00eb\u00ec\5\34\17\2"+
		"\u00ec\u00ed\7\7\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e4\3\2\2\2\u00ee\u00e9"+
		"\3\2\2\2\u00ef\33\3\2\2\2\u00f0\u00f5\5\36\20\2\u00f1\u00f2\7\r\2\2\u00f2"+
		"\u00f4\5\36\20\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3"+
		"\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00fb\7.\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f8\3\2"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fb\35\3\2\2\2\u00fc\u00fd\b\20\1\2\u00fd\u00fe"+
		"\7\6\2\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\7\7\2\2\u0100\u0105\3\2\2\2"+
		"\u0101\u0105\5.\30\2\u0102\u0103\7\61\2\2\u0103\u0105\5:\36\2\u0104\u00fc"+
		"\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010e\3\2\2\2\u0106"+
		"\u0107\f\7\2\2\u0107\u0108\t\2\2\2\u0108\u010d\5\36\20\b\u0109\u010a\f"+
		"\6\2\2\u010a\u010b\t\3\2\2\u010b\u010d\5\36\20\7\u010c\u0106\3\2\2\2\u010c"+
		"\u0109\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\37\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0114\5\"\22\2\u0112\u0114"+
		"\5$\23\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114!\3\2\2\2\u0115"+
		"\u0116\7\61\2\2\u0116\u0119\5<\37\2\u0117\u011a\5\36\20\2\u0118\u011a"+
		"\7,\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011e\3\2\2\2\u011b"+
		"\u011c\7\61\2\2\u011c\u011e\5:\36\2\u011d\u0115\3\2\2\2\u011d\u011b\3"+
		"\2\2\2\u011e#\3\2\2\2\u011f\u0120\7\61\2\2\u0120\u0121\7\22\2\2\u0121"+
		"\u0127\5\36\20\2\u0122\u0123\5\60\31\2\u0123\u0124\5<\37\2\u0124\u0125"+
		"\5\36\20\2\u0125\u0127\3\2\2\2\u0126\u011f\3\2\2\2\u0126\u0122\3\2\2\2"+
		"\u0127%\3\2\2\2\u0128\u0129\5(\25\2\u0129\u012a\7\61\2\2\u012a\u012b\7"+
		"\22\2\2\u012b\u012c\5\36\20\2\u012c\u0133\3\2\2\2\u012d\u012e\5*\26\2"+
		"\u012e\u012f\7\61\2\2\u012f\u0130\7\22\2\2\u0130\u0131\5\36\20\2\u0131"+
		"\u0133\3\2\2\2\u0132\u0128\3\2\2\2\u0132\u012d\3\2\2\2\u0133\'\3\2\2\2"+
		"\u0134\u0138\7\'\2\2\u0135\u0138\7)\2\2\u0136\u0138\7+\2\2\u0137\u0134"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138)\3\2\2\2\u0139"+
		"\u013a\58\35\2\u013a\u013b\7\4\2\2\u013b\u013c\5(\25\2\u013c\u013d\7\5"+
		"\2\2\u013d+\3\2\2\2\u013e\u0142\5(\25\2\u013f\u0142\5*\26\2\u0140\u0142"+
		"\7-\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"-\3\2\2\2\u0143\u0154\7\61\2\2\u0144\u0154\5@!\2\u0145\u0146\7\23\2\2"+
		"\u0146\u014b\5\62\32\2\u0147\u0148\7\3\2\2\u0148\u014a\5\62\32\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\24\2\2\u014f"+
		"\u0154\3\2\2\2\u0150\u0154\5\32\16\2\u0151\u0154\5\60\31\2\u0152\u0154"+
		"\7,\2\2\u0153\u0143\3\2\2\2\u0153\u0144\3\2\2\2\u0153\u0145\3\2\2\2\u0153"+
		"\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2\2\2\u0154/\3\2\2\2"+
		"\u0155\u0156\7\61\2\2\u0156\u0157\7\23\2\2\u0157\u0158\5\66\34\2\u0158"+
		"\u0159\7\24\2\2\u0159\61\3\2\2\2\u015a\u015f\5.\30\2\u015b\u015c\7\r\2"+
		"\2\u015c\u015e\5.\30\2\u015d\u015b\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u0160\3\2\2\2\u0160\63\3\2\2\2\u0161\u015f\3\2\2\2\u0162"+
		"\u0167\5@!\2\u0163\u0164\7\r\2\2\u0164\u0166\5@!\2\u0165\u0163\3\2\2\2"+
		"\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\65"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016d\5.\30\2\u016b\u016c\7\r\2\2\u016c"+
		"\u016e\5.\30\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\67\3\2\2"+
		"\2\u016f\u0172\7%\2\2\u0170\u0172\7&\2\2\u0171\u016f\3\2\2\2\u0171\u0170"+
		"\3\2\2\2\u01729\3\2\2\2\u0173\u0174\t\4\2\2\u0174;\3\2\2\2\u0175\u0176"+
		"\t\5\2\2\u0176=\3\2\2\2\u0177\u0178\t\6\2\2\u0178?\3\2\2\2\u0179\u017a"+
		"\t\7\2\2\u017aA\3\2\2\2(EKQav{\u0081\u0089\u0096\u009f\u00a5\u00b5\u00b7"+
		"\u00c5\u00c9\u00d6\u00d9\u00dc\u00e0\u00ee\u00f5\u00fa\u0104\u010c\u010e"+
		"\u0113\u0119\u011d\u0126\u0132\u0137\u0141\u014b\u0153\u015f\u0167\u016d"+
		"\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}