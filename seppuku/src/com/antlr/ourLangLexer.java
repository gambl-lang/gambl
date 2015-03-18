// Generated from ourLang.g4 by ANTLR 4.5
package com.antlr;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, IMPORT=29, IF=30, ELSE=31, WHILE=32, 
		FOR=33, MATRIX=34, ROWVECTOR=35, COLVECTOR=36, INT=37, INTNUM=38, FLOAT=39, 
		FLOATNUM=40, BOOL=41, BOOLVAL=42, VOID=43, STRING=44, SIGN=45, ID=46, 
		LIBRARY=47, PRINT=48, WS=49, NL=50, COMMENT=51, LINE_COMMENT=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "IMPORT", "IF", "ELSE", "WHILE", "FOR", "MATRIX", 
		"ROWVECTOR", "COLVECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", "BOOL", 
		"BOOLVAL", "VOID", "STRING", "SIGN", "ID", "LIBRARY", "PRINT", "WS", "NL", 
		"COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'<'", "'>'", "'('", "')'", "'{'", "'}'", "'&&'", "'||'", 
		"'return'", "','", "'*'", "'/'", "'%'", "'+'", "'='", "'['", "']'", "'++'", 
		"'--'", "'+='", "'-='", "'*='", "'/='", "'=='", "'!='", "'<='", "'>='", 
		null, "'if'", "'else'", "'while'", "'for'", "'matrix'", null, null, null, 
		null, null, null, "'bool'", null, "'void'", null, "'-'", null, null, "'print'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "IMPORT", "IF", "ELSE", "WHILE", "FOR", 
		"MATRIX", "ROWVECTOR", "COLVECTOR", "INT", "INTNUM", "FLOAT", "FLOATNUM", 
		"BOOL", "BOOLVAL", "VOID", "STRING", "SIGN", "ID", "LIBRARY", "PRINT", 
		"WS", "NL", "COMMENT", "LINE_COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u01b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\5\36\u00c2\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3"+
		"$\3$\5$\u00ea\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00f9\n%\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u010d\n&\3\'\3"+
		"\'\5\'\u0111\n\'\3\'\3\'\7\'\u0115\n\'\f\'\16\'\u0118\13\'\5\'\u011a\n"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\5(\u0136\n(\3)\3)\3)\3)\5)\u013c\n)\3)\3)\7)\u0140\n)\f)\16"+
		")\u0143\13)\3)\5)\u0146\n)\3)\3)\7)\u014a\n)\f)\16)\u014d\13)\3)\5)\u0150"+
		"\n)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0160\n+\3,\3,\3,\3,"+
		"\3,\3-\3-\7-\u0169\n-\f-\16-\u016c\13-\3-\3-\3.\3.\3/\3/\7/\u0174\n/\f"+
		"/\16/\u0177\13/\3\60\6\60\u017a\n\60\r\60\16\60\u017b\3\60\5\60\u017f"+
		"\n\60\3\60\7\60\u0182\n\60\f\60\16\60\u0185\13\60\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\6\62\u018e\n\62\r\62\16\62\u018f\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\7\64\u019c\n\64\f\64\16\64\u019f\13\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\7\65\u01aa\n\65\f\65\16\65"+
		"\u01ad\13\65\3\65\3\65\4\u016a\u019d\2\66\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66\3\2\t\3\2\63;\3\2\62;\5\2C\\aac|"+
		"\6\2\62;C\\aac|\4\2\13\13\"\"\6\2\f\f\17\17\"\"~~\4\2\f\f\17\17\u01c9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5m\3\2\2"+
		"\2\7o\3\2\2\2\tq\3\2\2\2\13s\3\2\2\2\ru\3\2\2\2\17w\3\2\2\2\21y\3\2\2"+
		"\2\23|\3\2\2\2\25\177\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008a"+
		"\3\2\2\2\35\u008c\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0092\3\2\2"+
		"\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0099\3\2\2\2+\u009c\3\2\2\2-\u009f"+
		"\3\2\2\2/\u00a2\3\2\2\2\61\u00a5\3\2\2\2\63\u00a8\3\2\2\2\65\u00ab\3\2"+
		"\2\2\67\u00ae\3\2\2\29\u00b1\3\2\2\2;\u00c1\3\2\2\2=\u00c3\3\2\2\2?\u00c6"+
		"\3\2\2\2A\u00cb\3\2\2\2C\u00d1\3\2\2\2E\u00d5\3\2\2\2G\u00e9\3\2\2\2I"+
		"\u00f8\3\2\2\2K\u010c\3\2\2\2M\u0119\3\2\2\2O\u0135\3\2\2\2Q\u014f\3\2"+
		"\2\2S\u0151\3\2\2\2U\u015f\3\2\2\2W\u0161\3\2\2\2Y\u0166\3\2\2\2[\u016f"+
		"\3\2\2\2]\u0171\3\2\2\2_\u0179\3\2\2\2a\u0186\3\2\2\2c\u018d\3\2\2\2e"+
		"\u0193\3\2\2\2g\u0197\3\2\2\2i\u01a5\3\2\2\2kl\7=\2\2l\4\3\2\2\2mn\7>"+
		"\2\2n\6\3\2\2\2op\7@\2\2p\b\3\2\2\2qr\7*\2\2r\n\3\2\2\2st\7+\2\2t\f\3"+
		"\2\2\2uv\7}\2\2v\16\3\2\2\2wx\7\177\2\2x\20\3\2\2\2yz\7(\2\2z{\7(\2\2"+
		"{\22\3\2\2\2|}\7~\2\2}~\7~\2\2~\24\3\2\2\2\177\u0080\7t\2\2\u0080\u0081"+
		"\7g\2\2\u0081\u0082\7v\2\2\u0082\u0083\7w\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7p\2\2\u0085\26\3\2\2\2\u0086\u0087\7.\2\2\u0087\30\3\2\2\2\u0088"+
		"\u0089\7,\2\2\u0089\32\3\2\2\2\u008a\u008b\7\61\2\2\u008b\34\3\2\2\2\u008c"+
		"\u008d\7\'\2\2\u008d\36\3\2\2\2\u008e\u008f\7-\2\2\u008f \3\2\2\2\u0090"+
		"\u0091\7?\2\2\u0091\"\3\2\2\2\u0092\u0093\7]\2\2\u0093$\3\2\2\2\u0094"+
		"\u0095\7_\2\2\u0095&\3\2\2\2\u0096\u0097\7-\2\2\u0097\u0098\7-\2\2\u0098"+
		"(\3\2\2\2\u0099\u009a\7/\2\2\u009a\u009b\7/\2\2\u009b*\3\2\2\2\u009c\u009d"+
		"\7-\2\2\u009d\u009e\7?\2\2\u009e,\3\2\2\2\u009f\u00a0\7/\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1.\3\2\2\2\u00a2\u00a3\7,\2\2\u00a3\u00a4\7?\2\2\u00a4\60"+
		"\3\2\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00a7\7?\2\2\u00a7\62\3\2\2\2\u00a8"+
		"\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa\64\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"8\3\2\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b3\7?\2\2\u00b3:\3\2\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7n\2\2\u00b8"+
		"\u00b9\7w\2\2\u00b9\u00ba\7f\2\2\u00ba\u00c2\7g\2\2\u00bb\u00bc\7k\2\2"+
		"\u00bc\u00bd\7o\2\2\u00bd\u00be\7r\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0"+
		"\7t\2\2\u00c0\u00c2\7v\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c2"+
		"<\3\2\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7h\2\2\u00c5>\3\2\2\2\u00c6\u00c7"+
		"\7g\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"@\3\2\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7j\2\2\u00cd\u00ce\7k\2\2\u00ce"+
		"\u00cf\7n\2\2\u00cf\u00d0\7g\2\2\u00d0B\3\2\2\2\u00d1\u00d2\7h\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7t\2\2\u00d4D\3\2\2\2\u00d5\u00d6\7o\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9\u00da\7k\2\2"+
		"\u00da\u00db\7z\2\2\u00dbF\3\2\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7q\2"+
		"\2\u00de\u00df\7y\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7g\2\2\u00e1\u00e2"+
		"\7e\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7q\2\2\u00e4\u00ea\7t\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7x\2\2\u00e7\u00e8\7g\2\2\u00e8\u00ea\7e\2\2"+
		"\u00e9\u00dc\3\2\2\2\u00e9\u00e5\3\2\2\2\u00eaH\3\2\2\2\u00eb\u00ec\7"+
		"e\2\2\u00ec\u00ed\7q\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7x\2\2\u00ef\u00f0"+
		"\7g\2\2\u00f0\u00f1\7e\2\2\u00f1\u00f2\7v\2\2\u00f2\u00f3\7q\2\2\u00f3"+
		"\u00f9\7t\2\2\u00f4\u00f5\7e\2\2\u00f5\u00f6\7x\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\u00f9\7e\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9J\3\2"+
		"\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u010d\7v\2\2\u00fd\u00fe"+
		"\7k\2\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7\63\2\2\u0101"+
		"\u010d\78\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u0105\7v\2\2"+
		"\u0105\u0106\7\65\2\2\u0106\u010d\7\64\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7v\2\2\u010a\u010b\78\2\2\u010b\u010d\7\66\2\2\u010c"+
		"\u00fa\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0107\3\2"+
		"\2\2\u010dL\3\2\2\2\u010e\u011a\7\62\2\2\u010f\u0111\5[.\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0116\t\2\2\2\u0113"+
		"\u0115\t\3\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0116\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u010e\3\2\2\2\u0119\u0110\3\2\2\2\u011aN\3\2\2\2\u011b\u011c\7h\2\2\u011c"+
		"\u011d\7n\2\2\u011d\u011e\7q\2\2\u011e\u011f\7c\2\2\u011f\u0136\7v\2\2"+
		"\u0120\u0121\7h\2\2\u0121\u0122\7n\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7c\2\2\u0124\u0125\7v\2\2\u0125\u0126\7\63\2\2\u0126\u0136\78\2\2\u0127"+
		"\u0128\7h\2\2\u0128\u0129\7n\2\2\u0129\u012a\7q\2\2\u012a\u012b\7c\2\2"+
		"\u012b\u012c\7v\2\2\u012c\u012d\7\65\2\2\u012d\u0136\7\64\2\2\u012e\u012f"+
		"\7h\2\2\u012f\u0130\7n\2\2\u0130\u0131\7q\2\2\u0131\u0132\7c\2\2\u0132"+
		"\u0133\7v\2\2\u0133\u0134\78\2\2\u0134\u0136\7\66\2\2\u0135\u011b\3\2"+
		"\2\2\u0135\u0120\3\2\2\2\u0135\u0127\3\2\2\2\u0135\u012e\3\2\2\2\u0136"+
		"P\3\2\2\2\u0137\u0138\7\62\2\2\u0138\u0139\7\60\2\2\u0139\u0150\7\62\2"+
		"\2\u013a\u013c\5[.\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u0145"+
		"\3\2\2\2\u013d\u0141\t\2\2\2\u013e\u0140\t\3\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0146\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0146\7\62\2\2\u0145\u013d\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u014b\7\60\2\2\u0148\u014a\t"+
		"\3\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0150\t\2"+
		"\2\2\u014f\u0137\3\2\2\2\u014f\u013b\3\2\2\2\u0150R\3\2\2\2\u0151\u0152"+
		"\7d\2\2\u0152\u0153\7q\2\2\u0153\u0154\7q\2\2\u0154\u0155\7n\2\2\u0155"+
		"T\3\2\2\2\u0156\u0157\7v\2\2\u0157\u0158\7t\2\2\u0158\u0159\7w\2\2\u0159"+
		"\u0160\7g\2\2\u015a\u015b\7h\2\2\u015b\u015c\7c\2\2\u015c\u015d\7n\2\2"+
		"\u015d\u015e\7u\2\2\u015e\u0160\7g\2\2\u015f\u0156\3\2\2\2\u015f\u015a"+
		"\3\2\2\2\u0160V\3\2\2\2\u0161\u0162\7x\2\2\u0162\u0163\7q\2\2\u0163\u0164"+
		"\7k\2\2\u0164\u0165\7f\2\2\u0165X\3\2\2\2\u0166\u016a\7$\2\2\u0167\u0169"+
		"\13\2\2\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u016b\3\2\2\2"+
		"\u016a\u0168\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u016e"+
		"\7$\2\2\u016eZ\3\2\2\2\u016f\u0170\7/\2\2\u0170\\\3\2\2\2\u0171\u0175"+
		"\t\4\2\2\u0172\u0174\t\5\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176^\3\2\2\2\u0177\u0175\3\2\2\2"+
		"\u0178\u017a\t\5\2\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0179"+
		"\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d\u017f\7\60\2\2"+
		"\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0183\3\2\2\2\u0180\u0182"+
		"\t\5\2\2\u0181\u0180\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184`\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7r\2\2\u0187"+
		"\u0188\7t\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b\7v\2\2"+
		"\u018bb\3\2\2\2\u018c\u018e\t\6\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3"+
		"\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0192\b\62\2\2\u0192d\3\2\2\2\u0193\u0194\t\7\2\2\u0194\u0195\3\2\2\2"+
		"\u0195\u0196\b\63\2\2\u0196f\3\2\2\2\u0197\u0198\7\61\2\2\u0198\u0199"+
		"\7,\2\2\u0199\u019d\3\2\2\2\u019a\u019c\13\2\2\2\u019b\u019a\3\2\2\2\u019c"+
		"\u019f\3\2\2\2\u019d\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\3\2"+
		"\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7,\2\2\u01a1\u01a2\7\61\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a4\b\64\2\2\u01a4h\3\2\2\2\u01a5\u01a6\7\61\2"+
		"\2\u01a6\u01a7\7\61\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01aa\n\b\2\2\u01a9"+
		"\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01af\b\65\2\2\u01af"+
		"j\3\2\2\2\31\2\u00c1\u00e9\u00f8\u010c\u0110\u0116\u0119\u0135\u013b\u0141"+
		"\u0145\u014b\u014f\u015f\u016a\u0175\u017b\u017e\u0183\u018f\u019d\u01ab"+
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