package antlr;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class HelloLexerListener implements org.antlr.v4.runtime.ANTLRErrorListener {
    private int _lexerErrors = 0;

    public int getLexerErrors() {
        return _lexerErrors;
    }

    public void setLexerErrors(int _lexerErrors) {
        this._lexerErrors = _lexerErrors;
    }


    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e) {
        if(_lexerErrors==0)System.out.println("Syntax error");
        _lexerErrors++;

    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
