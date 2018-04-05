package antlr;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class Main {
    private static final DecimalFormat _format = new DecimalFormat();

    static {
        DecimalFormatSymbols _symbols = new DecimalFormatSymbols();
        _symbols.setDecimalSeparator('.');
        _symbols.setGroupingSeparator(Character.MIN_VALUE);
        _format.setDecimalFormatSymbols(_symbols);
    }

    public static void main(String[] args) {
        CharStream charStream;
        HelloLexer lexer;
        TokenStream tokenStream;
        HelloParser parser;
        ParseTree tree;
        int errors;
        double result;
        TreeEvaluationVisitor visitor;
        HelloLexerListener hl;

        Scanner scan = new Scanner(System.in);
        String input = "1/2+3g";
        System.out.println("Enter equation:");
        input = scan.nextLine();
        while(!input.contains("exit")){
            charStream = CharStreams.fromString(input);
            lexer = new HelloLexer(charStream);
            //List<ANTLRErrorListener> l = lexer.getErrorListeners();
            hl = new HelloLexerListener();
            lexer.removeErrorListeners();
            lexer.addErrorListener(hl);

            tokenStream = new CommonTokenStream(lexer);
            parser = new HelloParser(tokenStream);
            parser.setBuildParseTree(true);
            try{
                tree = parser.expr();

                errors = parser.getNumberOfSyntaxErrors();
                //System.out.println("Number of errors: " + errors);

                if(errors == 0 && hl.getLexerErrors()==0) {

                    System.out.println(tree.toStringTree(parser));
                    visitor = new TreeEvaluationVisitor();
                    result = visitor.visit(tree);
                    System.out.println("Result: " + result);
                }
            }catch (StringIndexOutOfBoundsException e){
                System.out.println("Syntax error");
            }catch (RecognitionException e){
                System.out.println("Syntax error");
            }
            System.out.println("Enter equation:");
            input = scan.nextLine();
        }
    }

    static double parseDEC(String text) throws ParseException {
        return Long.decode(text);
    }
    static double parseHEX(String text) throws ParseException {
        return Long.decode(text);
    }
    static double parseOCT(String text) throws ParseException {
        return Long.parseLong(text, 8);
    }





}
