// Generated from Field.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FieldParser}.
 */
public interface FieldListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FieldParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(FieldParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(FieldParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#quadribol_match}.
	 * @param ctx the parse tree
	 */
	void enterQuadribol_match(FieldParser.Quadribol_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#quadribol_match}.
	 * @param ctx the parse tree
	 */
	void exitQuadribol_match(FieldParser.Quadribol_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#quadribol_players}.
	 * @param ctx the parse tree
	 */
	void enterQuadribol_players(FieldParser.Quadribol_playersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#quadribol_players}.
	 * @param ctx the parse tree
	 */
	void exitQuadribol_players(FieldParser.Quadribol_playersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#addpoint_match}.
	 * @param ctx the parse tree
	 */
	void enterAddpoint_match(FieldParser.Addpoint_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#addpoint_match}.
	 * @param ctx the parse tree
	 */
	void exitAddpoint_match(FieldParser.Addpoint_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#losepoint_match}.
	 * @param ctx the parse tree
	 */
	void enterLosepoint_match(FieldParser.Losepoint_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#losepoint_match}.
	 * @param ctx the parse tree
	 */
	void exitLosepoint_match(FieldParser.Losepoint_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#multpoint_match}.
	 * @param ctx the parse tree
	 */
	void enterMultpoint_match(FieldParser.Multpoint_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#multpoint_match}.
	 * @param ctx the parse tree
	 */
	void exitMultpoint_match(FieldParser.Multpoint_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#divpoint_match}.
	 * @param ctx the parse tree
	 */
	void enterDivpoint_match(FieldParser.Divpoint_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#divpoint_match}.
	 * @param ctx the parse tree
	 */
	void exitDivpoint_match(FieldParser.Divpoint_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link FieldParser#end_match}.
	 * @param ctx the parse tree
	 */
	void enterEnd_match(FieldParser.End_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link FieldParser#end_match}.
	 * @param ctx the parse tree
	 */
	void exitEnd_match(FieldParser.End_matchContext ctx);
}