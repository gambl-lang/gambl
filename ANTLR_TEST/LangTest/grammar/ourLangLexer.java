// Generated from ourLang.g4 by ANTLR 4.5
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ourLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, IMPORT=24, 
		IF=25, ELSE=26, WHILE=27, FOR=28, MATRIX=29, ROWVECTOR=30, COLVECTOR=31, 
		INT=32, INTNUM=33, FLOAT=34, FLOATNUM=35, BOOL=36, BOOLVAL=37, STRING=38, 
		SIGN=39, ID=40, LIBRARY=41, WS=42, NL=43, COMMENT=44, LINE_COMMENT=45;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "IMPORT", "IF", 
		"ELSE", "WHILE", "FOR", "MATRIX", "ROWVECTOR", "COLVECTOR", "INT", "INTNUM", 
		"FLOAT", "FLOATNUM", "BOOL", "BOOLVAL", "STRING", "SIGN", "ID", "LIBRARY", 
		"WS", "NL", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'void'", "'return'", 
		"','", "'+'", "'*'", "'/'", "'='", "'['", "']'", "'%'", "'++'", "'--'", 
		"'=='", "'!='", "'<='", "'>='", null, "'if'", "'else'", "'while'", "'for'", 
		"'matrix'", null, null, "'int'", null, "'float'", null, "'bool'", null, 
		null, "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IMPORT", "IF", "ELSE", "WHILE", "FOR", "MATRIX", "ROWVECTOR", "COLVECTOR", 
		"INT", "INTNUM", "FLOAT", "FLOATNUM", "BOOL", "BOOLVAL", "STRING", "SIGN", 
		"ID", "LIBRARY", "WS", "NL", "COMMENT", "LINE_COMMENT"
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


	public ourLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ourLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2/\u0164\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u00a7\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u00cf\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00de\n \3!\3!\3"+
		"!\3!\3\"\3\"\5\"\u00e6\n\"\3\"\3\"\7\"\u00ea\n\"\f\"\16\"\u00ed\13\"\5"+
		"\"\u00ef\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\5$\u00fb\n$\3$\3$\7$\u00ff"+
		"\n$\f$\16$\u0102\13$\3$\5$\u0105\n$\3$\3$\7$\u0109\n$\f$\16$\u010c\13"+
		"$\3$\5$\u010f\n$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u011f\n"+
		"&\3\'\3\'\7\'\u0123\n\'\f\'\16\'\u0126\13\'\3\'\3\'\3(\3(\3)\3)\7)\u012e"+
		"\n)\f)\16)\u0131\13)\3*\6*\u0134\n*\r*\16*\u0135\3*\5*\u0139\n*\3*\7*"+
		"\u013c\n*\f*\16*\u013f\13*\3+\6+\u0142\n+\r+\16+\u0143\3+\3+\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\7-\u0150\n-\f-\16-\u0153\13-\3-\3-\3-\3-\3-\3.\3.\3.\3"+
		".\7.\u015e\n.\f.\16.\u0161\13.\3.\3.\4\u0124\u0151\2/\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2"+
		"\13\13\"\"\6\2\f\f\17\17\"\"~~\4\2\f\f\17\17\u0177\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3"+
		"\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2\2\2\23p\3\2\2\2\25w\3\2\2\2\27y"+
		"\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177\3\2\2\2\37\u0081\3\2\2\2!\u0083"+
		"\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'\u008a\3\2\2\2)\u008d\3\2\2\2"+
		"+\u0090\3\2\2\2-\u0093\3\2\2\2/\u0096\3\2\2\2\61\u00a6\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00ab\3\2\2\2\67\u00b0\3\2\2\29\u00b6\3\2\2\2;\u00ba\3\2\2"+
		"\2=\u00ce\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00ee\3\2\2\2E\u00f0"+
		"\3\2\2\2G\u010e\3\2\2\2I\u0110\3\2\2\2K\u011e\3\2\2\2M\u0120\3\2\2\2O"+
		"\u0129\3\2\2\2Q\u012b\3\2\2\2S\u0133\3\2\2\2U\u0141\3\2\2\2W\u0147\3\2"+
		"\2\2Y\u014b\3\2\2\2[\u0159\3\2\2\2]^\7=\2\2^\4\3\2\2\2_`\7>\2\2`\6\3\2"+
		"\2\2ab\7@\2\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7}"+
		"\2\2h\16\3\2\2\2ij\7\177\2\2j\20\3\2\2\2kl\7x\2\2lm\7q\2\2mn\7k\2\2no"+
		"\7f\2\2o\22\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7v\2\2st\7w\2\2tu\7t\2\2uv\7p"+
		"\2\2v\24\3\2\2\2wx\7.\2\2x\26\3\2\2\2yz\7-\2\2z\30\3\2\2\2{|\7,\2\2|\32"+
		"\3\2\2\2}~\7\61\2\2~\34\3\2\2\2\177\u0080\7?\2\2\u0080\36\3\2\2\2\u0081"+
		"\u0082\7]\2\2\u0082 \3\2\2\2\u0083\u0084\7_\2\2\u0084\"\3\2\2\2\u0085"+
		"\u0086\7\'\2\2\u0086$\3\2\2\2\u0087\u0088\7-\2\2\u0088\u0089\7-\2\2\u0089"+
		"&\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7/\2\2\u008c(\3\2\2\2\u008d\u008e"+
		"\7?\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7?\2\2\u0092,\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095.\3"+
		"\2\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\60\3\2\2\2\u0099\u009a"+
		"\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7n\2\2\u009d"+
		"\u009e\7w\2\2\u009e\u009f\7f\2\2\u009f\u00a7\7g\2\2\u00a0\u00a1\7k\2\2"+
		"\u00a1\u00a2\7o\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5"+
		"\7t\2\2\u00a5\u00a7\7v\2\2\u00a6\u0099\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7"+
		"\62\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa\64\3\2\2\2\u00ab"+
		"\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7g\2\2"+
		"\u00af\66\3\2\2\2\u00b0\u00b1\7y\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7"+
		"k\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7g\2\2\u00b58\3\2\2\2\u00b6\u00b7"+
		"\7h\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7t\2\2\u00b9:\3\2\2\2\u00ba\u00bb"+
		"\7o\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7v\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7z\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7y\2\2\u00c4\u00c5\7x\2\2\u00c5\u00c6\7g\2\2"+
		"\u00c6\u00c7\7e\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7q\2\2\u00c9\u00cf"+
		"\7t\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7x\2\2\u00cc\u00cd\7g\2\2\u00cd"+
		"\u00cf\7e\2\2\u00ce\u00c1\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf>\3\2\2\2\u00d0"+
		"\u00d1\7e\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7x\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8"+
		"\7q\2\2\u00d8\u00de\7t\2\2\u00d9\u00da\7e\2\2\u00da\u00db\7x\2\2\u00db"+
		"\u00dc\7g\2\2\u00dc\u00de\7e\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d9\3\2\2"+
		"\2\u00de@\3\2\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7"+
		"v\2\2\u00e2B\3\2\2\2\u00e3\u00ef\7\62\2\2\u00e4\u00e6\5O(\2\u00e5\u00e4"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00eb\t\2\2\2\u00e8"+
		"\u00ea\t\3\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00e3\3\2\2\2\u00ee\u00e5\3\2\2\2\u00efD\3\2\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		"\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7v\2\2"+
		"\u00f5F\3\2\2\2\u00f6\u00f7\7\62\2\2\u00f7\u00f8\7\60\2\2\u00f8\u010f"+
		"\7\62\2\2\u00f9\u00fb\5O(\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u0104\3\2\2\2\u00fc\u0100\t\2\2\2\u00fd\u00ff\t\3\2\2\u00fe\u00fd\3\2"+
		"\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0105\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7\62\2\2\u0104\u00fc\3"+
		"\2\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\7\60\2\2\u0107"+
		"\u0109\t\3\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010f\t\2\2\2\u010e\u00f6\3\2\2\2\u010e\u00fa\3\2\2\2\u010fH\3\2\2\2"+
		"\u0110\u0111\7d\2\2\u0111\u0112\7q\2\2\u0112\u0113\7q\2\2\u0113\u0114"+
		"\7n\2\2\u0114J\3\2\2\2\u0115\u0116\7V\2\2\u0116\u0117\7t\2\2\u0117\u0118"+
		"\7w\2\2\u0118\u011f\7g\2\2\u0119\u011a\7H\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7n\2\2\u011c\u011d\7u\2\2\u011d\u011f\7g\2\2\u011e\u0115\3\2\2"+
		"\2\u011e\u0119\3\2\2\2\u011fL\3\2\2\2\u0120\u0124\7$\2\2\u0121\u0123\13"+
		"\2\2\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7$"+
		"\2\2\u0128N\3\2\2\2\u0129\u012a\7/\2\2\u012aP\3\2\2\2\u012b\u012f\t\4"+
		"\2\2\u012c\u012e\t\5\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130R\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0132\u0134\t\5\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0139\7\60\2\2"+
		"\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u013c"+
		"\t\5\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013eT\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0142\t\6\2\2"+
		"\u0141\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144"+
		"\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b+\2\2\u0146V\3\2\2\2\u0147\u0148"+
		"\t\7\2\2\u0148\u0149\3\2\2\2\u0149\u014a\b,\2\2\u014aX\3\2\2\2\u014b\u014c"+
		"\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151\3\2\2\2\u014e\u0150\13\2\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154\u0155\7,\2\2\u0155"+
		"\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b-\2\2\u0158Z\3\2\2\2"+
		"\u0159\u015a\7\61\2\2\u015a\u015b\7\61\2\2\u015b\u015f\3\2\2\2\u015c\u015e"+
		"\n\b\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2\2\2\u0162\u0163\b."+
		"\2\2\u0163\\\3\2\2\2\27\2\u00a6\u00ce\u00dd\u00e5\u00eb\u00ee\u00fa\u0100"+
		"\u0104\u010a\u010e\u011e\u0124\u012f\u0135\u0138\u013d\u0143\u0151\u015f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}