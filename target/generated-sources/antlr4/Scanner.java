// Generated from Scanner.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Scanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, INTLITERAL=2, CHARLITERAL=3, STRINGLITERAL=4, BOOLEANLITERAL=5, 
		IDENTIFIER=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"COMMENT", "INTLITERAL", "CHARLITERAL", "STRINGLITERAL", "BOOLEANLITERAL", 
		"IDENTIFIER", "LETTER", "DIGIT", "WS"
	};


	public Scanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Scanner.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\t\u0092\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2"+
		"\3\2\3\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\3\2\5\2)\n\2\3\2\3\2\3\3\6\3.\n\3\r\3\16\3/\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\5\3\5\7\5B\n\5\f\5\16\5"+
		"E\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6R\n\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3"+
		"\b\3\t\3\t\3\n\6\n\u008d\n\n\r\n\16\n\u008e\3\n\3\n\2\2\13\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\2\21\2\23\t\3\2\6\4\2\f\f\17\17\3\2$$\4\2C\\c|\5\2\13"+
		"\f\16\17\"\"\u00a1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\3(\3\2\2\2\5-\3\2\2\2\7=\3\2\2\2\t?"+
		"\3\2\2\2\13Q\3\2\2\2\r\u0085\3\2\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2"+
		"\23\u008c\3\2\2\2\25\26\7\61\2\2\26\27\7\61\2\2\27\33\3\2\2\2\30\32\n"+
		"\2\2\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34)\3\2"+
		"\2\2\35\33\3\2\2\2\36\37\7\61\2\2\37#\7,\2\2 \"\13\2\2\2! \3\2\2\2\"%"+
		"\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7,\2\2\')\7\61\2\2"+
		"(\25\3\2\2\2(\36\3\2\2\2)*\3\2\2\2*+\b\2\2\2+\4\3\2\2\2,.\5\21\t\2-,\3"+
		"\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\6\3\2\2\2\61\62\7)\2\2\62\63"+
		"\5\17\b\2\63\64\7)\2\2\64>\3\2\2\2\65\66\7)\2\2\66\67\7^\2\2\678\13\2"+
		"\2\28>\7)\2\29:\7)\2\2:;\5\21\t\2;<\7)\2\2<>\3\2\2\2=\61\3\2\2\2=\65\3"+
		"\2\2\2=9\3\2\2\2>\b\3\2\2\2?C\7$\2\2@B\n\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3"+
		"\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7$\2\2G\n\3\2\2\2HI\7v\2\2IJ\7"+
		"t\2\2JK\7w\2\2KR\7g\2\2LM\7h\2\2MN\7c\2\2NO\7n\2\2OP\7u\2\2PR\7g\2\2Q"+
		"H\3\2\2\2QL\3\2\2\2R\f\3\2\2\2ST\7d\2\2TU\7q\2\2UV\7q\2\2VW\7n\2\2WX\7"+
		"g\2\2XY\7c\2\2Y\u0086\7p\2\2Z[\7e\2\2[\\\7c\2\2\\]\7n\2\2]^\7n\2\2^_\7"+
		"q\2\2_`\7w\2\2`\u0086\7v\2\2ab\7e\2\2bc\7n\2\2cd\7c\2\2de\7u\2\2e\u0086"+
		"\7u\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2i\u0086\7g\2\2jk\7k\2\2k\u0086\7h\2"+
		"\2lm\7k\2\2mn\7p\2\2n\u0086\7v\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2"+
		"st\7t\2\2t\u0086\7p\2\2uv\7h\2\2vw\7q\2\2w\u0086\7t\2\2xy\7d\2\2yz\7t"+
		"\2\2z{\7g\2\2{|\7c\2\2|\u0086\7m\2\2}~\7e\2\2~\177\7q\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7v\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0086\7g\2\2\u0085S\3\2\2\2\u0085Z\3\2\2\2\u0085a\3\2\2"+
		"\2\u0085f\3\2\2\2\u0085j\3\2\2\2\u0085l\3\2\2\2\u0085o\3\2\2\2\u0085u"+
		"\3\2\2\2\u0085x\3\2\2\2\u0085}\3\2\2\2\u0086\16\3\2\2\2\u0087\u0088\t"+
		"\4\2\2\u0088\20\3\2\2\2\u0089\u008a\4\62;\2\u008a\22\3\2\2\2\u008b\u008d"+
		"\t\5\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b\n\2\2\u0091\24\3\2\2"+
		"\2\f\2\33#(/=CQ\u0085\u008e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}