// Generated from C:/Git/Sourcecode/ANTLR_TEST/LangTest/grammar\test.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, MATRIX=19, INT=20, INTNUM=21, FLOAT=22, FLOATNUM=23, SIGN=24, 
		ID=25, WS=26, COMMENT=27, LINE_COMMENT=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "MATRIX", "INT", "INTNUM", "FLOAT", "FLOATNUM", "SIGN", "ID", 
		"WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "''", "'('", "')'", "'='", "'<'", "'>'", "'['", "']'", "','", 
		"'rowvector'", "'colvector'", "'+'", "'*'", "'/'", "'%'", "'++'", "'--'", 
		"'matrix'", "'int'", null, "'float'", null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "MATRIX", "INT", "INTNUM", "FLOAT", 
		"FLOATNUM", "SIGN", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26~\n\26"+
		"\3\26\3\26\7\26\u0082\n\26\f\26\16\26\u0085\13\26\5\26\u0087\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0093\n\30\3\30\3\30"+
		"\7\30\u0097\n\30\f\30\16\30\u009a\13\30\3\30\5\30\u009d\n\30\3\30\3\30"+
		"\7\30\u00a1\n\30\f\30\16\30\u00a4\13\30\3\30\5\30\u00a7\n\30\3\31\3\31"+
		"\3\32\6\32\u00ac\n\32\r\32\16\32\u00ad\3\33\6\33\u00b1\n\33\r\33\16\33"+
		"\u00b2\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00bb\n\34\f\34\16\34\u00be"+
		"\13\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\7\35\u00c9\n\35\f"+
		"\35\16\35\u00cc\13\35\3\35\3\35\3\u00bc\2\36\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\5\5\2C\\aac|\5\2\13\f\"\""+
		"~~\4\2\f\f\17\17\u00d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7>\3\2\2\2\t@\3\2\2\2\13B\3\2"+
		"\2\2\rD\3\2\2\2\17F\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27N\3"+
		"\2\2\2\31X\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#j\3\2"+
		"\2\2%m\3\2\2\2\'p\3\2\2\2)w\3\2\2\2+\u0086\3\2\2\2-\u0088\3\2\2\2/\u00a6"+
		"\3\2\2\2\61\u00a8\3\2\2\2\63\u00ab\3\2\2\2\65\u00b0\3\2\2\2\67\u00b6\3"+
		"\2\2\29\u00c4\3\2\2\2;<\7=\2\2<\4\3\2\2\2>?\7*\2\2?\b\3\2\2\2@A\7+\2\2"+
		"A\n\3\2\2\2BC\7?\2\2C\f\3\2\2\2DE\7>\2\2E\16\3\2\2\2FG\7@\2\2G\20\3\2"+
		"\2\2HI\7]\2\2I\22\3\2\2\2JK\7_\2\2K\24\3\2\2\2LM\7.\2\2M\26\3\2\2\2NO"+
		"\7t\2\2OP\7q\2\2PQ\7y\2\2QR\7x\2\2RS\7g\2\2ST\7e\2\2TU\7v\2\2UV\7q\2\2"+
		"VW\7t\2\2W\30\3\2\2\2XY\7e\2\2YZ\7q\2\2Z[\7n\2\2[\\\7x\2\2\\]\7g\2\2]"+
		"^\7e\2\2^_\7v\2\2_`\7q\2\2`a\7t\2\2a\32\3\2\2\2bc\7-\2\2c\34\3\2\2\2d"+
		"e\7,\2\2e\36\3\2\2\2fg\7\61\2\2g \3\2\2\2hi\7\'\2\2i\"\3\2\2\2jk\7-\2"+
		"\2kl\7-\2\2l$\3\2\2\2mn\7/\2\2no\7/\2\2o&\3\2\2\2pq\7o\2\2qr\7c\2\2rs"+
		"\7v\2\2st\7t\2\2tu\7k\2\2uv\7z\2\2v(\3\2\2\2wx\7k\2\2xy\7p\2\2yz\7v\2"+
		"\2z*\3\2\2\2{\u0087\7\62\2\2|~\5\61\31\2}|\3\2\2\2}~\3\2\2\2~\177\3\2"+
		"\2\2\177\u0083\4\63;\2\u0080\u0082\4\62;\2\u0081\u0080\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086{\3\2\2\2\u0086}\3\2\2\2\u0087,\3\2\2\2\u0088\u0089"+
		"\7h\2\2\u0089\u008a\7n\2\2\u008a\u008b\7q\2\2\u008b\u008c\7c\2\2\u008c"+
		"\u008d\7v\2\2\u008d.\3\2\2\2\u008e\u008f\7\62\2\2\u008f\u0090\7\60\2\2"+
		"\u0090\u00a7\7\62\2\2\u0091\u0093\5\61\31\2\u0092\u0091\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009c\3\2\2\2\u0094\u0098\4\63;\2\u0095\u0097\4\62"+
		";\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009d\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\62"+
		"\2\2\u009c\u0094\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a2\7\60\2\2\u009f\u00a1\4\62;\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u00a7\4\63;\2\u00a6\u008e\3\2\2\2\u00a6\u0092\3\2"+
		"\2\2\u00a7\60\3\2\2\2\u00a8\u00a9\7/\2\2\u00a9\62\3\2\2\2\u00aa\u00ac"+
		"\t\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad"+
		"\u00ae\3\2\2\2\u00ae\64\3\2\2\2\u00af\u00b1\t\3\2\2\u00b0\u00af\3\2\2"+
		"\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b5\b\33\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7\61\2\2\u00b7"+
		"\u00b8\7,\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00bb\13\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\7,\2\2\u00c0\u00c1\7\61"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\34\2\2\u00c38\3\2\2\2\u00c4\u00c5"+
		"\7\61\2\2\u00c5\u00c6\7\61\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\n\4\2\2"+
		"\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\b\35\2\2"+
		"\u00ce:\3\2\2\2\17\2}\u0083\u0086\u0092\u0098\u009c\u00a2\u00a6\u00ad"+
		"\u00b2\u00bc\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}