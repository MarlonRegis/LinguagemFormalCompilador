// Generated from Field.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FieldLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Name=13, Int=14, Real=15, WS=16, NL=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "Name", "Int", "Real", "WS", "NL"
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


	public FieldLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Field.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u014c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\6\16\u012f\n\16\r\16\16\16\u0130"+
		"\3\17\6\17\u0134\n\17\r\17\16\17\u0135\3\20\6\20\u0139\n\20\r\20\16\20"+
		"\u013a\3\20\3\20\6\20\u013f\n\20\r\20\16\20\u0140\3\21\6\21\u0144\n\21"+
		"\r\21\16\21\u0145\3\22\5\22\u0149\n\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\4\5\2\"\"C\\c|\4\2\13\13\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5G\3\2\2\2\7"+
		"d\3\2\2\2\to\3\2\2\2\13~\3\2\2\2\r\u0097\3\2\2\2\17\u009f\3\2\2\2\21\u00ae"+
		"\3\2\2\2\23\u00c3\3\2\2\2\25\u00e7\3\2\2\2\27\u00f9\3\2\2\2\31\u011e\3"+
		"\2\2\2\33\u012e\3\2\2\2\35\u0133\3\2\2\2\37\u0138\3\2\2\2!\u0143\3\2\2"+
		"\2#\u0148\3\2\2\2%&\7\"\2\2&\'\7r\2\2\'(\7c\2\2()\7t\2\2)*\7v\2\2*+\7"+
		"k\2\2+,\7f\2\2,-\7c\2\2-.\7\"\2\2./\7f\2\2/\60\7g\2\2\60\61\7\"\2\2\61"+
		"\62\7s\2\2\62\63\7w\2\2\63\64\7c\2\2\64\65\7f\2\2\65\66\7t\2\2\66\67\7"+
		"k\2\2\678\7d\2\289\7q\2\29:\7n\2\2:;\7\"\2\2;<\7g\2\2<=\7o\2\2=>\7\"\2"+
		"\2>?\7j\2\2?@\7q\2\2@A\7i\2\2AB\7y\2\2BC\7c\2\2CD\7t\2\2DE\7v\2\2EF\7"+
		"u\2\2F\4\3\2\2\2GH\7E\2\2HI\7c\2\2IJ\7f\2\2JK\7c\2\2KL\7\"\2\2LM\7v\2"+
		"\2MN\7k\2\2NO\7o\2\2OP\7g\2\2PQ\7\"\2\2QR\7u\2\2RS\7g\2\2ST\7t\2\2TU\7"+
		"c\2\2UV\7\"\2\2VW\7e\2\2WX\7q\2\2XY\7o\2\2YZ\7r\2\2Z[\7q\2\2[\\\7u\2\2"+
		"\\]\7v\2\2]^\7q\2\2^_\7\"\2\2_`\7r\2\2`a\7q\2\2ab\7t\2\2bc\7\"\2\2c\6"+
		"\3\2\2\2de\7\"\2\2ef\7l\2\2fg\7q\2\2gh\7i\2\2hi\7c\2\2ij\7f\2\2jk\7q\2"+
		"\2kl\7t\2\2lm\7g\2\2mn\7u\2\2n\b\3\2\2\2op\7Q\2\2pq\7\"\2\2qr\7v\2\2r"+
		"s\7k\2\2st\7o\2\2tu\7g\2\2uv\7\"\2\2vw\7i\2\2wx\7c\2\2xy\7p\2\2yz\7j\2"+
		"\2z{\7q\2\2{|\7w\2\2|}\7\"\2\2}\n\3\2\2\2~\177\7\"\2\2\177\u0080\7c\2"+
		"\2\u0080\u0081\7r\2\2\u0081\u0082\7q\2\2\u0082\u0083\7u\2\2\u0083\u0084"+
		"\7\"\2\2\u0084\u0085\7c\2\2\u0085\u0086\7t\2\2\u0086\u0087\7t\2\2\u0087"+
		"\u0088\7g\2\2\u0088\u0089\7o\2\2\u0089\u008a\7g\2\2\u008a\u008b\7\u00e9"+
		"\2\2\u008b\u008c\7q\2\2\u008c\u008d\7\"\2\2\u008d\u008e\7s\2\2\u008e\u008f"+
		"\7w\2\2\u008f\u0090\7g\2\2\u0090\u0091\7\"\2\2\u0091\u0092\7x\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7n\2\2\u0094\u0095\7g\2\2\u0095\u0096\7\"\2"+
		"\2\u0096\f\3\2\2\2\u0097\u0098\7\"\2\2\u0098\u0099\7r\2\2\u0099\u009a"+
		"\7q\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7u\2\2\u009e\16\3\2\2\2\u009f\u00a0\7Q\2\2\u00a0\u00a1\7\"\2\2"+
		"\u00a1\u00a2\7v\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7o\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7w\2\2"+
		"\u00ac\u00ad\7\"\2\2\u00ad\20\3\2\2\2\u00ae\u00af\7\"\2\2\u00af\u00b0"+
		"\7r\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7q\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6\7\"\2\2\u00b6\u00b7\7f\2"+
		"\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7\"\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb"+
		"\7q\2\2\u00bb\u00bc\7v\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be"+
		"\u00bf\7\"\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7\"\2"+
		"\2\u00c2\22\3\2\2\2\u00c3\u00c4\7F\2\2\u00c4\u00c5\7w\2\2\u00c5\u00c6"+
		"\7o\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7f\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7x\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1"+
		"\7w\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7c\2\2\u00d4"+
		"\u00d5\7t\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7{\2\2\u00d7\u00d8\7\"\2"+
		"\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7\"\2\2\u00da\u00db\7o\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7n\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7k\2\2\u00df"+
		"\u00e0\7r\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7e\2\2"+
		"\u00e3\u00e4\7q\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7\"\2\2\u00e6\24\3"+
		"\2\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7g\2\2\u00ea"+
		"\u00eb\7|\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7\"\2"+
		"\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2"+
		"\7r\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5"+
		"\u00f6\7q\2\2\u00f6\u00f7\7u\2\2\u00f7\u00f8\7\"\2\2\u00f8\26\3\2\2\2"+
		"\u00f9\u00fa\7F\2\2\u00fa\u00fb\7w\2\2\u00fb\u00fc\7o\2\2\u00fc\u00fd"+
		"\7d\2\2\u00fd\u00fe\7n\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7f\2\2\u0100"+
		"\u0101\7q\2\2\u0101\u0102\7t\2\2\u0102\u0103\7g\2\2\u0103\u0104\7\"\2"+
		"\2\u0104\u0105\7x\2\2\u0105\u0106\7k\2\2\u0106\u0107\7w\2\2\u0107\u0108"+
		"\7\"\2\2\u0108\u0109\7v\2\2\u0109\u010a\7q\2\2\u010a\u010b\7o\2\2\u010b"+
		"\u010c\7\"\2\2\u010c\u010d\7t\2\2\u010d\u010e\7k\2\2\u010e\u010f\7f\2"+
		"\2\u010f\u0110\7f\2\2\u0110\u0111\7n\2\2\u0111\u0112\7g\2\2\u0112\u0113"+
		"\7\"\2\2\u0113\u0114\7g\2\2\u0114\u0115\7\"\2\2\u0115\u0116\7f\2\2\u0116"+
		"\u0117\7k\2\2\u0117\u0118\7x\2\2\u0118\u0119\7k\2\2\u0119\u011a\7f\2\2"+
		"\u011a\u011b\7k\2\2\u011b\u011c\7w\2\2\u011c\u011d\7\"\2\2\u011d\30\3"+
		"\2\2\2\u011e\u011f\7H\2\2\u011f\u0120\7k\2\2\u0120\u0121\7o\2\2\u0121"+
		"\u0122\7\"\2\2\u0122\u0123\7f\2\2\u0123\u0124\7g\2\2\u0124\u0125\7\"\2"+
		"\2\u0125\u0126\7r\2\2\u0126\u0127\7c\2\2\u0127\u0128\7t\2\2\u0128\u0129"+
		"\7v\2\2\u0129\u012a\7k\2\2\u012a\u012b\7f\2\2\u012b\u012c\7c\2\2\u012c"+
		"\32\3\2\2\2\u012d\u012f\t\2\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\34\3\2\2\2\u0132\u0134"+
		"\4\62;\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\36\3\2\2\2\u0137\u0139\5\35\17\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\7\60\2\2\u013d\u013f\5\35\17\2\u013e\u013d"+
		"\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		" \3\2\2\2\u0142\u0144\t\3\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2"+
		"\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\"\3\2\2\2\u0147\u0149\7"+
		"\17\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\7\f\2\2\u014b$\3\2\2\2\t\2\u0130\u0135\u013a\u0140\u0145\u0148"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}