// Generated from C:/Uczelnia/S5/PZ/Niedzialagramatyka/src\Hello.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WhiteSpace=3, DEC=4, HEX=5, OCT=6, ADD=7, SUB=8, MUL=9, 
		DIV=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "WhiteSpace", "DEC", "HEX", 
		"OCT", "ADD", "SUB", "MUL", "DIV"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", null, null, null, null, "'+'", "'-'", "'*'", "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "WhiteSpace", "DEC", "HEX", "OCT", "ADD", "SUB", "MUL", 
		"DIV"
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fQ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\6\6&\n\6\r"+
		"\6\16\6\'\3\6\3\6\3\7\3\7\7\7.\n\7\f\7\16\7\61\13\7\3\7\3\7\5\7\65\n\7"+
		"\3\b\3\b\3\b\7\b:\n\b\f\b\16\b=\13\b\3\b\3\b\3\t\3\t\7\tC\n\t\f\t\16\t"+
		"F\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\2\2\16\3\3\5\4\7\2\t"+
		"\2\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\3\2\t\3\2\63;\3\2\62;\7\2\63"+
		"\63\65\65\67\6799;;\4\2\62;CH\n\2\63\63\65\65\67\6799;;DDFFHH\3\2\629"+
		"\6\2\63\63\65\65\67\6799\2T\2\3\3\2\2\2\2\5\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2\13%"+
		"\3\2\2\2\r\64\3\2\2\2\17\66\3\2\2\2\21@\3\2\2\2\23I\3\2\2\2\25K\3\2\2"+
		"\2\27M\3\2\2\2\31O\3\2\2\2\33\34\7*\2\2\34\4\3\2\2\2\35\36\7+\2\2\36\6"+
		"\3\2\2\2\37 \7\"\2\2 \b\3\2\2\2!\"\7\13\2\2\"\n\3\2\2\2#&\5\7\4\2$&\5"+
		"\t\5\2%#\3\2\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2"+
		")*\b\6\2\2*\f\3\2\2\2+/\t\2\2\2,.\t\3\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2"+
		"\2\2/\60\3\2\2\2\60\62\3\2\2\2\61/\3\2\2\2\62\65\t\4\2\2\63\65\t\4\2\2"+
		"\64+\3\2\2\2\64\63\3\2\2\2\65\16\3\2\2\2\66\67\7\62\2\2\67;\7z\2\28:\t"+
		"\5\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\t"+
		"\6\2\2?\20\3\2\2\2@D\7\62\2\2AC\t\7\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\t\b\2\2H\22\3\2\2\2IJ\7-\2\2J\24\3\2"+
		"\2\2KL\7/\2\2L\26\3\2\2\2MN\7,\2\2N\30\3\2\2\2OP\7\61\2\2P\32\3\2\2\2"+
		"\n\2%\'/\649;D\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}


}