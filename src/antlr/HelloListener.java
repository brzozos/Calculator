// Generated from C:/Uczelnia/S5/PZ/Niedzialagramatyka/src\Hello.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HelloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
}