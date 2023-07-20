// Generated from .\src\main\java\simplejavacalculator\g.g4 by ANTLR 4.13.0
package simplejavacalculator;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(gParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(gParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(gParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(gParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(gParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(gParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(gParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(gParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(gParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(gParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(gParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(gParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(gParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(gParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(gParser.NumberContext ctx);
}