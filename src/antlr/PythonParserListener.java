package antlr;// Generated from C:/Users/Mohammed Shadi/IdeaProjects/Flask Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#fileInput}.
	 * @param ctx the parse tree
	 */
	void enterFileInput(PythonParser.FileInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fileInput}.
	 * @param ctx the parse tree
	 */
	void exitFileInput(PythonParser.FileInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#interactive}.
	 * @param ctx the parse tree
	 */
	void enterInteractive(PythonParser.InteractiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#interactive}.
	 * @param ctx the parse tree
	 */
	void exitInteractive(PythonParser.InteractiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#eval}.
	 * @param ctx the parse tree
	 */
	void enterEval(PythonParser.EvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#eval}.
	 * @param ctx the parse tree
	 */
	void exitEval(PythonParser.EvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(PythonParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(PythonParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PythonParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PythonParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatements}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatements(PythonParser.SimpleStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatements}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatements(PythonParser.SimpleStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#singleCompoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterSingleCompoundStmt(PythonParser.SingleCompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#singleCompoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitSingleCompoundStmt(PythonParser.SingleCompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStatementNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatementNewline(PythonParser.CompoundStatementNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStatementNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatementNewline(PythonParser.CompoundStatementNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStatementsNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatementsNewline(PythonParser.SimpleStatementsNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStatementsNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatementsNewline(PythonParser.SimpleStatementsNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlankLine}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void enterBlankLine(PythonParser.BlankLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlankLine}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void exitBlankLine(PythonParser.BlankLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EndOfFile}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void enterEndOfFile(PythonParser.EndOfFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EndOfFile}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 */
	void exitEndOfFile(PythonParser.EndOfFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#simpleStmts}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmts(PythonParser.SimpleStmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#simpleStmts}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmts(PythonParser.SimpleStmtsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeAliasStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeAliasStatement(PythonParser.TypeAliasStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeAliasStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeAliasStatement(PythonParser.TypeAliasStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarExpressionStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterStarExpressionStatement(PythonParser.StarExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarExpressionStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitStarExpressionStatement(PythonParser.StarExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStatement(PythonParser.RaiseStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStatement(PythonParser.RaiseStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeleteStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(PythonParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeleteStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(PythonParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStatement(PythonParser.YieldStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStatement(PythonParser.YieldStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(PythonParser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(PythonParser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonlocalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStatement(PythonParser.NonlocalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonlocalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStatement(PythonParser.NonlocalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(PythonParser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(PythonParser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void enterMatchStatement(PythonParser.MatchStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 */
	void exitMatchStatement(PythonParser.MatchStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedAssignmentName}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedAssignmentName(PythonParser.AnnotatedAssignmentNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedAssignmentName}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedAssignmentName(PythonParser.AnnotatedAssignmentNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnnotatedAssignmentTarget}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAnnotatedAssignmentTarget(PythonParser.AnnotatedAssignmentTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnnotatedAssignmentTarget}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAnnotatedAssignmentTarget(PythonParser.AnnotatedAssignmentTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ChainedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterChainedAssignment(PythonParser.ChainedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ChainedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitChainedAssignment(PythonParser.ChainedAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AugmentedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AugmentedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YieldAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 */
	void enterYieldAnnotatedRhs(PythonParser.YieldAnnotatedRhsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YieldAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 */
	void exitYieldAnnotatedRhs(PythonParser.YieldAnnotatedRhsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarExpressionsAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 */
	void enterStarExpressionsAnnotatedRhs(PythonParser.StarExpressionsAnnotatedRhsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarExpressionsAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 */
	void exitStarExpressionsAnnotatedRhs(PythonParser.StarExpressionsAnnotatedRhsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterPlusAssign(PythonParser.PlusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitPlusAssign(PythonParser.PlusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterMinusAssign(PythonParser.MinusAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitMinusAssign(PythonParser.MinusAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterStarAssign(PythonParser.StarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitStarAssign(PythonParser.StarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAtAssign(PythonParser.AtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAtAssign(PythonParser.AtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterSlashAssign(PythonParser.SlashAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitSlashAssign(PythonParser.SlashAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PercentAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterPercentAssign(PythonParser.PercentAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PercentAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitPercentAssign(PythonParser.PercentAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AmpersandAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAmpersandAssign(PythonParser.AmpersandAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AmpersandAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAmpersandAssign(PythonParser.AmpersandAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VBarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterVBarAssign(PythonParser.VBarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VBarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitVBarAssign(PythonParser.VBarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CircumflexAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterCircumflexAssign(PythonParser.CircumflexAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CircumflexAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitCircumflexAssign(PythonParser.CircumflexAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LeftShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterLeftShiftAssign(PythonParser.LeftShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LeftShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitLeftShiftAssign(PythonParser.LeftShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RightShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(PythonParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RightShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(PythonParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarAssign(PythonParser.DoubleStarAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarAssign(PythonParser.DoubleStarAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleSlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterDoubleSlashAssign(PythonParser.DoubleSlashAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleSlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitDoubleSlashAssign(PythonParser.DoubleSlashAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#passStmt}.
	 * @param ctx the parse tree
	 */
	void enterPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#passStmt}.
	 * @param ctx the parse tree
	 */
	void exitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#breakStmt}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#continueStmt}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#globalStmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#delStmt}.
	 * @param ctx the parse tree
	 */
	void enterDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#delStmt}.
	 * @param ctx the parse tree
	 */
	void exitDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void enterYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 */
	void exitYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assertStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportNameStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportNameStatement(PythonParser.ImportNameStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportNameStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportNameStatement(PythonParser.ImportNameStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportFromStatement(PythonParser.ImportFromStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportFromStatement(PythonParser.ImportFromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importName}.
	 * @param ctx the parse tree
	 */
	void enterImportName(PythonParser.ImportNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importName}.
	 * @param ctx the parse tree
	 */
	void exitImportName(PythonParser.ImportNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromDotted}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFromDotted(PythonParser.ImportFromDottedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromDotted}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFromDotted(PythonParser.ImportFromDottedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromRelative}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void enterImportFromRelative(PythonParser.ImportFromRelativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromRelative}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 */
	void exitImportFromRelative(PythonParser.ImportFromRelativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromParenthesized}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void enterImportFromParenthesized(PythonParser.ImportFromParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromParenthesized}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void exitImportFromParenthesized(PythonParser.ImportFromParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromNameList}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void enterImportFromNameList(PythonParser.ImportFromNameListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromNameList}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void exitImportFromNameList(PythonParser.ImportFromNameListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromStar}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void enterImportFromStar(PythonParser.ImportFromStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromStar}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 */
	void exitImportFromStar(PythonParser.ImportFromStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importFromAsNames}.
	 * @param ctx the parse tree
	 */
	void enterImportFromAsNames(PythonParser.ImportFromAsNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importFromAsNames}.
	 * @param ctx the parse tree
	 */
	void exitImportFromAsNames(PythonParser.ImportFromAsNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importFromAsName}.
	 * @param ctx the parse tree
	 */
	void enterImportFromAsName(PythonParser.ImportFromAsNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importFromAsName}.
	 * @param ctx the parse tree
	 */
	void exitImportFromAsName(PythonParser.ImportFromAsNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedAsNames}.
	 * @param ctx the parse tree
	 */
	void enterDottedAsNames(PythonParser.DottedAsNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedAsNames}.
	 * @param ctx the parse tree
	 */
	void exitDottedAsNames(PythonParser.DottedAsNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dottedAsName}.
	 * @param ctx the parse tree
	 */
	void enterDottedAsName(PythonParser.DottedAsNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dottedAsName}.
	 * @param ctx the parse tree
	 */
	void exitDottedAsName(PythonParser.DottedAsNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DottedNamePath}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterDottedNamePath(PythonParser.DottedNamePathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DottedNamePath}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitDottedNamePath(PythonParser.DottedNamePathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleDottedName}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDottedName(PythonParser.SimpleDottedNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleDottedName}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDottedName(PythonParser.SimpleDottedNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterSimpleBlock(PythonParser.SimpleBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitSimpleBlock(PythonParser.SimpleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedClassDefinition(PythonParser.DecoratedClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedClassDefinition(PythonParser.DecoratedClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterUndecoratedClassDefinition(PythonParser.UndecoratedClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitUndecoratedClassDefinition(PythonParser.UndecoratedClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classDefRaw}.
	 * @param ctx the parse tree
	 */
	void enterClassDefRaw(PythonParser.ClassDefRawContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classDefRaw}.
	 * @param ctx the parse tree
	 */
	void exitClassDefRaw(PythonParser.ClassDefRawContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterDecoratedFunctionDefinition(PythonParser.DecoratedFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitDecoratedFunctionDefinition(PythonParser.DecoratedFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UndecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterUndecoratedFunctionDefinition(PythonParser.UndecoratedFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UndecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitUndecoratedFunctionDefinition(PythonParser.UndecoratedFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(PythonParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(PythonParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsyncFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 */
	void enterAsyncFunction(PythonParser.AsyncFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 */
	void exitAsyncFunction(PythonParser.AsyncFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(PythonParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(PythonParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalOnlyWithSlash}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalOnlyWithSlash(PythonParser.PositionalOnlyWithSlashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalOnlyWithSlash}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalOnlyWithSlash(PythonParser.PositionalOnlyWithSlashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalOnlyWithSlashAndDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalOnlyWithSlashAndDefaults(PythonParser.PositionalOnlyWithSlashAndDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalOnlyWithSlashAndDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalOnlyWithSlashAndDefaults(PythonParser.PositionalOnlyWithSlashAndDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterRegularParameters(PythonParser.RegularParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitRegularParameters(PythonParser.RegularParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParametersWithDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParametersWithDefaults(PythonParser.ParametersWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParametersWithDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParametersWithDefaults(PythonParser.ParametersWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterStarParameters(PythonParser.StarParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitStarParameters(PythonParser.StarParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#slashNoDefault}.
	 * @param ctx the parse tree
	 */
	void enterSlashNoDefault(PythonParser.SlashNoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#slashNoDefault}.
	 * @param ctx the parse tree
	 */
	void exitSlashNoDefault(PythonParser.SlashNoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#slashWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterSlashWithDefault(PythonParser.SlashWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#slashWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitSlashWithDefault(PythonParser.SlashWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void enterStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void exitStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarParamWithAnnotation}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void enterStarParamWithAnnotation(PythonParser.StarParamWithAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarParamWithAnnotation}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void exitStarParamWithAnnotation(PythonParser.StarParamWithAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BareStarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void enterBareStarParam(PythonParser.BareStarParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BareStarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void exitBareStarParam(PythonParser.BareStarParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordOnlyParams}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void enterKeywordOnlyParams(PythonParser.KeywordOnlyParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordOnlyParams}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 */
	void exitKeywordOnlyParams(PythonParser.KeywordOnlyParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#kwds}.
	 * @param ctx the parse tree
	 */
	void enterKwds(PythonParser.KwdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#kwds}.
	 * @param ctx the parse tree
	 */
	void exitKwds(PythonParser.KwdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramNoDefault}.
	 * @param ctx the parse tree
	 */
	void enterParamNoDefault(PythonParser.ParamNoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramNoDefault}.
	 * @param ctx the parse tree
	 */
	void exitParamNoDefault(PythonParser.ParamNoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramNoDefaultStarAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterParamNoDefaultStarAnnotation(PythonParser.ParamNoDefaultStarAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramNoDefaultStarAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitParamNoDefaultStarAnnotation(PythonParser.ParamNoDefaultStarAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterParamWithDefault(PythonParser.ParamWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitParamWithDefault(PythonParser.ParamWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramMaybeDefault}.
	 * @param ctx the parse tree
	 */
	void enterParamMaybeDefault(PythonParser.ParamMaybeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramMaybeDefault}.
	 * @param ctx the parse tree
	 */
	void exitParamMaybeDefault(PythonParser.ParamMaybeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PythonParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PythonParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#paramStarAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterParamStarAnnotation(PythonParser.ParamStarAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#paramStarAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitParamStarAnnotation(PythonParser.ParamStarAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterStarAnnotation(PythonParser.StarAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitStarAnnotation(PythonParser.StarAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#defaultAssignment}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAssignment(PythonParser.DefaultAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#defaultAssignment}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAssignment(PythonParser.DefaultAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void enterElifStmt(PythonParser.ElifStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elifStmt}.
	 * @param ctx the parse tree
	 */
	void exitElifStmt(PythonParser.ElifStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedWithItems(PythonParser.ParenthesizedWithItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedWithItems(PythonParser.ParenthesizedWithItemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsyncParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterAsyncParenthesizedWithItems(PythonParser.AsyncParenthesizedWithItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsyncParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitAsyncParenthesizedWithItems(PythonParser.AsyncParenthesizedWithItemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterRegularWithItems(PythonParser.RegularWithItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitRegularWithItems(PythonParser.RegularWithItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#withItem}.
	 * @param ctx the parse tree
	 */
	void enterWithItem(PythonParser.WithItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#withItem}.
	 * @param ctx the parse tree
	 */
	void exitWithItem(PythonParser.WithItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryExcept}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryExcept(PythonParser.TryExceptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryExcept}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryExcept(PythonParser.TryExceptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryExceptStar}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryExceptStar(PythonParser.TryExceptStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryExceptStar}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryExceptStar(PythonParser.TryExceptStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exceptBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#exceptStarBlock}.
	 * @param ctx the parse tree
	 */
	void enterExceptStarBlock(PythonParser.ExceptStarBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#exceptStarBlock}.
	 * @param ctx the parse tree
	 */
	void exitExceptStarBlock(PythonParser.ExceptStarBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(PythonParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(PythonParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#matchStmt}.
	 * @param ctx the parse tree
	 */
	void enterMatchStmt(PythonParser.MatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#matchStmt}.
	 * @param ctx the parse tree
	 */
	void exitMatchStmt(PythonParser.MatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubjectExprMultiple}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubjectExprMultiple(PythonParser.SubjectExprMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubjectExprMultiple}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubjectExprMultiple(PythonParser.SubjectExprMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubjectExprSingle}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubjectExprSingle(PythonParser.SubjectExprSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubjectExprSingle}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubjectExprSingle(PythonParser.SubjectExprSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(PythonParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(PythonParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(PythonParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(PythonParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternsSequence}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatternsSequence(PythonParser.PatternsSequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternsSequence}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatternsSequence(PythonParser.PatternsSequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PatternsSingle}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void enterPatternsSingle(PythonParser.PatternsSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PatternsSingle}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 */
	void exitPatternsSingle(PythonParser.PatternsSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AsPatternMatch}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPatternMatch(PythonParser.AsPatternMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AsPatternMatch}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPatternMatch(PythonParser.AsPatternMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrPatternAlternatives}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterOrPatternAlternatives(PythonParser.OrPatternAlternativesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrPatternAlternatives}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitOrPatternAlternatives(PythonParser.OrPatternAlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#asPattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#asPattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#orPattern}.
	 * @param ctx the parse tree
	 */
	void enterOrPattern(PythonParser.OrPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#orPattern}.
	 * @param ctx the parse tree
	 */
	void exitOrPattern(PythonParser.OrPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterLiteralClosedPattern(PythonParser.LiteralClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitLiteralClosedPattern(PythonParser.LiteralClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaptureClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterCaptureClosedPattern(PythonParser.CaptureClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaptureClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitCaptureClosedPattern(PythonParser.CaptureClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WildcardClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardClosedPattern(PythonParser.WildcardClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WildcardClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardClosedPattern(PythonParser.WildcardClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterValueClosedPattern(PythonParser.ValueClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitValueClosedPattern(PythonParser.ValueClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GroupClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupClosedPattern(PythonParser.GroupClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GroupClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupClosedPattern(PythonParser.GroupClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SequenceClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterSequenceClosedPattern(PythonParser.SequenceClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SequenceClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitSequenceClosedPattern(PythonParser.SequenceClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MappingClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterMappingClosedPattern(PythonParser.MappingClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MappingClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitMappingClosedPattern(PythonParser.MappingClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void enterClassClosedPattern(PythonParser.ClassClosedPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 */
	void exitClassClosedPattern(PythonParser.ClassClosedPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumberLiteralPattern(PythonParser.SignedNumberLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumberLiteralPattern(PythonParser.SignedNumberLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterComplexNumberLiteralPattern(PythonParser.ComplexNumberLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitComplexNumberLiteralPattern(PythonParser.ComplexNumberLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralPattern(PythonParser.StringLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralPattern(PythonParser.StringLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteralPattern(PythonParser.NoneLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteralPattern(PythonParser.NoneLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralPattern(PythonParser.TrueLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralPattern(PythonParser.TrueLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralPattern(PythonParser.FalseLiteralPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralPattern(PythonParser.FalseLiteralPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumberLiteralExpr(PythonParser.SignedNumberLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumberLiteralExpr(PythonParser.SignedNumberLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComplexNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterComplexNumberLiteralExpr(PythonParser.ComplexNumberLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComplexNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitComplexNumberLiteralExpr(PythonParser.ComplexNumberLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteralExpr(PythonParser.StringLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteralExpr(PythonParser.StringLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterNoneLiteralExpr(PythonParser.NoneLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitNoneLiteralExpr(PythonParser.NoneLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteralExpr(PythonParser.TrueLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteralExpr(PythonParser.TrueLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteralExpr(PythonParser.FalseLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteralExpr(PythonParser.FalseLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void enterComplexNumber(PythonParser.ComplexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#complexNumber}.
	 * @param ctx the parse tree
	 */
	void exitComplexNumber(PythonParser.ComplexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(PythonParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(PythonParser.SignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#signedRealNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedRealNumber(PythonParser.SignedRealNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#signedRealNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedRealNumber(PythonParser.SignedRealNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#realNumber}.
	 * @param ctx the parse tree
	 */
	void enterRealNumber(PythonParser.RealNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#realNumber}.
	 * @param ctx the parse tree
	 */
	void exitRealNumber(PythonParser.RealNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#imaginaryNumber}.
	 * @param ctx the parse tree
	 */
	void enterImaginaryNumber(PythonParser.ImaginaryNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#imaginaryNumber}.
	 * @param ctx the parse tree
	 */
	void exitImaginaryNumber(PythonParser.ImaginaryNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#capturePattern}.
	 * @param ctx the parse tree
	 */
	void enterCapturePattern(PythonParser.CapturePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#capturePattern}.
	 * @param ctx the parse tree
	 */
	void exitCapturePattern(PythonParser.CapturePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#patternCaptureTarget}.
	 * @param ctx the parse tree
	 */
	void enterPatternCaptureTarget(PythonParser.PatternCaptureTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#patternCaptureTarget}.
	 * @param ctx the parse tree
	 */
	void exitPatternCaptureTarget(PythonParser.PatternCaptureTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPattern(PythonParser.WildcardPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPattern(PythonParser.WildcardPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#valuePattern}.
	 * @param ctx the parse tree
	 */
	void enterValuePattern(PythonParser.ValuePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#valuePattern}.
	 * @param ctx the parse tree
	 */
	void exitValuePattern(PythonParser.ValuePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(PythonParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(PythonParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#nameOrAttr}.
	 * @param ctx the parse tree
	 */
	void enterNameOrAttr(PythonParser.NameOrAttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#nameOrAttr}.
	 * @param ctx the parse tree
	 */
	void exitNameOrAttr(PythonParser.NameOrAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#groupPattern}.
	 * @param ctx the parse tree
	 */
	void enterGroupPattern(PythonParser.GroupPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#groupPattern}.
	 * @param ctx the parse tree
	 */
	void exitGroupPattern(PythonParser.GroupPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 */
	void enterListSequencePattern(PythonParser.ListSequencePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 */
	void exitListSequencePattern(PythonParser.ListSequencePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 */
	void enterTupleSequencePattern(PythonParser.TupleSequencePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 */
	void exitTupleSequencePattern(PythonParser.TupleSequencePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#openSequencePattern}.
	 * @param ctx the parse tree
	 */
	void enterOpenSequencePattern(PythonParser.OpenSequencePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#openSequencePattern}.
	 * @param ctx the parse tree
	 */
	void exitOpenSequencePattern(PythonParser.OpenSequencePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#maybeSequencePattern}.
	 * @param ctx the parse tree
	 */
	void enterMaybeSequencePattern(PythonParser.MaybeSequencePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#maybeSequencePattern}.
	 * @param ctx the parse tree
	 */
	void exitMaybeSequencePattern(PythonParser.MaybeSequencePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 */
	void enterStarMaybePattern(PythonParser.StarMaybePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 */
	void exitStarMaybePattern(PythonParser.StarMaybePatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 */
	void enterRegularMaybePattern(PythonParser.RegularMaybePatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 */
	void exitRegularMaybePattern(PythonParser.RegularMaybePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starPattern}.
	 * @param ctx the parse tree
	 */
	void enterStarPattern(PythonParser.StarPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starPattern}.
	 * @param ctx the parse tree
	 */
	void exitStarPattern(PythonParser.StarPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void enterEmptyMappingPattern(PythonParser.EmptyMappingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void exitEmptyMappingPattern(PythonParser.EmptyMappingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarMappingPattern(PythonParser.DoubleStarMappingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarMappingPattern(PythonParser.DoubleStarMappingPatternContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ItemsMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void enterItemsMappingPattern(PythonParser.ItemsMappingPatternContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ItemsMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 */
	void exitItemsMappingPattern(PythonParser.ItemsMappingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#itemsPattern}.
	 * @param ctx the parse tree
	 */
	void enterItemsPattern(PythonParser.ItemsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#itemsPattern}.
	 * @param ctx the parse tree
	 */
	void exitItemsPattern(PythonParser.ItemsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keyValuePattern}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePattern(PythonParser.KeyValuePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keyValuePattern}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePattern(PythonParser.KeyValuePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#doubleStarPattern}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarPattern(PythonParser.DoubleStarPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#doubleStarPattern}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarPattern(PythonParser.DoubleStarPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classPattern}.
	 * @param ctx the parse tree
	 */
	void enterClassPattern(PythonParser.ClassPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classPattern}.
	 * @param ctx the parse tree
	 */
	void exitClassPattern(PythonParser.ClassPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#positionalPatterns}.
	 * @param ctx the parse tree
	 */
	void enterPositionalPatterns(PythonParser.PositionalPatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#positionalPatterns}.
	 * @param ctx the parse tree
	 */
	void exitPositionalPatterns(PythonParser.PositionalPatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keywordPatterns}.
	 * @param ctx the parse tree
	 */
	void enterKeywordPatterns(PythonParser.KeywordPatternsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keywordPatterns}.
	 * @param ctx the parse tree
	 */
	void exitKeywordPatterns(PythonParser.KeywordPatternsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#keywordPattern}.
	 * @param ctx the parse tree
	 */
	void enterKeywordPattern(PythonParser.KeywordPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#keywordPattern}.
	 * @param ctx the parse tree
	 */
	void exitKeywordPattern(PythonParser.KeywordPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlias(PythonParser.TypeAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeAlias}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlias(PythonParser.TypeAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeParams}.
	 * @param ctx the parse tree
	 */
	void enterTypeParams(PythonParser.TypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeParams}.
	 * @param ctx the parse tree
	 */
	void exitTypeParams(PythonParser.TypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeParamSeq}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamSeq(PythonParser.TypeParamSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeParamSeq}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamSeq(PythonParser.TypeParamSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterRegularTypeParam(PythonParser.RegularTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitRegularTypeParam(PythonParser.RegularTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterStarTypeParam(PythonParser.StarTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitStarTypeParam(PythonParser.StarTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarTypeParam(PythonParser.DoubleStarTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarTypeParam(PythonParser.DoubleStarTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeParamBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeParamBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeParamDefault}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamDefault(PythonParser.TypeParamDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeParamDefault}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamDefault(PythonParser.TypeParamDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#typeParamStarredDefault}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamStarredDefault(PythonParser.TypeParamStarredDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#typeParamStarredDefault}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamStarredDefault(PythonParser.TypeParamStarredDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(PythonParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(PythonParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(PythonParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(PythonParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#yieldExpr}.
	 * @param ctx the parse tree
	 */
	void enterYieldExpr(PythonParser.YieldExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#yieldExpr}.
	 * @param ctx the parse tree
	 */
	void exitYieldExpr(PythonParser.YieldExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStarExpressions(PythonParser.StarExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStarExpressions(PythonParser.StarExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarBitwiseOr}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 */
	void enterStarBitwiseOr(PythonParser.StarBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarBitwiseOr}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 */
	void exitStarBitwiseOr(PythonParser.StarBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularStarExpression}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegularStarExpression(PythonParser.RegularStarExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularStarExpression}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegularStarExpression(PythonParser.RegularStarExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starNamedExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStarNamedExpressions(PythonParser.StarNamedExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starNamedExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStarNamedExpressions(PythonParser.StarNamedExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarNamedExpressionBitwiseOr}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 */
	void enterStarNamedExpressionBitwiseOr(PythonParser.StarNamedExpressionBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarNamedExpressionBitwiseOr}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 */
	void exitStarNamedExpressionBitwiseOr(PythonParser.StarNamedExpressionBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularStarNamedExpression}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegularStarNamedExpression(PythonParser.RegularStarNamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularStarNamedExpression}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegularStarNamedExpression(PythonParser.RegularStarNamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PythonParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PythonParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedAssignmentExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedAssignmentExpression(PythonParser.NamedAssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedAssignmentExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedAssignmentExpression(PythonParser.NamedAssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularNamedExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterRegularNamedExpression(PythonParser.RegularNamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularNamedExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitRegularNamedExpression(PythonParser.RegularNamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void enterDisjunction(PythonParser.DisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 */
	void exitDisjunction(PythonParser.DisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void enterConjunction(PythonParser.ConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 */
	void exitConjunction(PythonParser.ConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterNotInversion(PythonParser.NotInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitNotInversion(PythonParser.NotInversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComparisonInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void enterComparisonInversion(PythonParser.ComparisonInversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComparisonInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 */
	void exitComparisonInversion(PythonParser.ComparisonInversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterEqComparison(PythonParser.EqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitEqComparison(PythonParser.EqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterNotEqComparison(PythonParser.NotEqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitNotEqComparison(PythonParser.NotEqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterLessEqComparison(PythonParser.LessEqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitLessEqComparison(PythonParser.LessEqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterLessComparison(PythonParser.LessComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitLessComparison(PythonParser.LessComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqComparison(PythonParser.GreaterEqComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqComparison(PythonParser.GreaterEqComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterGreaterComparison(PythonParser.GreaterComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitGreaterComparison(PythonParser.GreaterComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotInComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterNotInComparison(PythonParser.NotInComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotInComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitNotInComparison(PythonParser.NotInComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterInComparison(PythonParser.InComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitInComparison(PythonParser.InComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsNotComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterIsNotComparison(PythonParser.IsNotComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsNotComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitIsNotComparison(PythonParser.IsNotComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void enterIsComparison(PythonParser.IsComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 */
	void exitIsComparison(PythonParser.IsComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#eqBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterEqBitwiseOr(PythonParser.EqBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#eqBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitEqBitwiseOr(PythonParser.EqBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#noteqBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterNoteqBitwiseOr(PythonParser.NoteqBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#noteqBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitNoteqBitwiseOr(PythonParser.NoteqBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lteBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterLteBitwiseOr(PythonParser.LteBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lteBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitLteBitwiseOr(PythonParser.LteBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ltBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterLtBitwiseOr(PythonParser.LtBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ltBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitLtBitwiseOr(PythonParser.LtBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#gteBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterGteBitwiseOr(PythonParser.GteBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#gteBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitGteBitwiseOr(PythonParser.GteBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#gtBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterGtBitwiseOr(PythonParser.GtBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#gtBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitGtBitwiseOr(PythonParser.GtBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#notinBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterNotinBitwiseOr(PythonParser.NotinBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#notinBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitNotinBitwiseOr(PythonParser.NotinBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#inBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterInBitwiseOr(PythonParser.InBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#inBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitInBitwiseOr(PythonParser.InBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#isnotBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterIsnotBitwiseOr(PythonParser.IsnotBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#isnotBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitIsnotBitwiseOr(PythonParser.IsnotBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#isBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterIsBitwiseOr(PythonParser.IsBitwiseOrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#isBitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitIsBitwiseOr(PythonParser.IsBitwiseOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseXorOperand}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorOperand(PythonParser.BitwiseXorOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseXorOperand}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorOperand(PythonParser.BitwiseXorOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseOrExpression}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOrExpression(PythonParser.BitwiseOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseOrExpression}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOrExpression(PythonParser.BitwiseOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseXorExpression}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseXorExpression(PythonParser.BitwiseXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseXorExpression}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseXorExpression(PythonParser.BitwiseXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseAndOperand}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndOperand(PythonParser.BitwiseAndOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseAndOperand}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndOperand(PythonParser.BitwiseAndOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseAndExpression(PythonParser.BitwiseAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseAndExpression(PythonParser.BitwiseAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExprOperand}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void enterShiftExprOperand(PythonParser.ShiftExprOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExprOperand}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 */
	void exitShiftExprOperand(PythonParser.ShiftExprOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumOperand}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumOperand(PythonParser.SumOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumOperand}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumOperand(PythonParser.SumOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(PythonParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(PythonParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TermOperand}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterTermOperand(PythonParser.TermOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TermOperand}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitTermOperand(PythonParser.TermOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PythonParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PythonParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FactorOperand}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFactorOperand(PythonParser.FactorOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FactorOperand}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFactorOperand(PythonParser.FactorOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PythonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PythonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlus(PythonParser.UnaryPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlus(PythonParser.UnaryPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(PythonParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(PythonParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseNot(PythonParser.BitwiseNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseNot(PythonParser.BitwiseNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PowerOperand}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterPowerOperand(PythonParser.PowerOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PowerOperand}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitPowerOperand(PythonParser.PowerOperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(PythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(PythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAwaitExpression(PythonParser.AwaitExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAwaitExpression(PythonParser.AwaitExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryOperand}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryOperand(PythonParser.PrimaryOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryOperand}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryOperand(PythonParser.PrimaryOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryWithAccess(PythonParser.PrimaryWithAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryWithAccess(PythonParser.PrimaryWithAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomOperand}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterAtomOperand(PythonParser.AtomOperandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomOperand}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitAtomOperand(PythonParser.AtomOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleSlice}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void enterSingleSlice(PythonParser.SingleSliceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleSlice}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void exitSingleSlice(PythonParser.SingleSliceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultipleSlices}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void enterMultipleSlices(PythonParser.MultipleSlicesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultipleSlices}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 */
	void exitMultipleSlices(PythonParser.MultipleSlicesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceRange}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSliceRange(PythonParser.SliceRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceRange}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSliceRange(PythonParser.SliceRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SliceExpression}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void enterSliceExpression(PythonParser.SliceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SliceExpression}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 */
	void exitSliceExpression(PythonParser.SliceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleGroupGenexpAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterTupleGroupGenexpAtom(PythonParser.TupleGroupGenexpAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleGroupGenexpAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitTupleGroupGenexpAtom(PythonParser.TupleGroupGenexpAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictSetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDictSetAtom(PythonParser.DictSetAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictSetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDictSetAtom(PythonParser.DictSetAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(PythonParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(PythonParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaParams}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParams(PythonParser.LambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaParams}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParams(PythonParser.LambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalOnlyLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalOnlyLambdaParams(PythonParser.PositionalOnlyLambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalOnlyLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalOnlyLambdaParams(PythonParser.PositionalOnlyLambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalOnlyWithDefaultsLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterPositionalOnlyWithDefaultsLambdaParams(PythonParser.PositionalOnlyWithDefaultsLambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalOnlyWithDefaultsLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitPositionalOnlyWithDefaultsLambdaParams(PythonParser.PositionalOnlyWithDefaultsLambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterRegularLambdaParams(PythonParser.RegularLambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitRegularLambdaParams(PythonParser.RegularLambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaParamsWithDefaults}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamsWithDefaults(PythonParser.LambdaParamsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaParamsWithDefaults}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamsWithDefaults(PythonParser.LambdaParamsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterStarLambdaParams(PythonParser.StarLambdaParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitStarLambdaParams(PythonParser.StarLambdaParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaSlashNoDefault}.
	 * @param ctx the parse tree
	 */
	void enterLambdaSlashNoDefault(PythonParser.LambdaSlashNoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaSlashNoDefault}.
	 * @param ctx the parse tree
	 */
	void exitLambdaSlashNoDefault(PythonParser.LambdaSlashNoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaSlashWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterLambdaSlashWithDefault(PythonParser.LambdaSlashWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaSlashWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitLambdaSlashWithDefault(PythonParser.LambdaSlashWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void enterStarLambdaParam(PythonParser.StarLambdaParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void exitStarLambdaParam(PythonParser.StarLambdaParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BareStarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void enterBareStarLambdaParam(PythonParser.BareStarLambdaParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BareStarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void exitBareStarLambdaParam(PythonParser.BareStarLambdaParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LambdaKeywordParams}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void enterLambdaKeywordParams(PythonParser.LambdaKeywordParamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LambdaKeywordParams}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 */
	void exitLambdaKeywordParams(PythonParser.LambdaKeywordParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaKwds}.
	 * @param ctx the parse tree
	 */
	void enterLambdaKwds(PythonParser.LambdaKwdsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaKwds}.
	 * @param ctx the parse tree
	 */
	void exitLambdaKwds(PythonParser.LambdaKwdsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaParamNoDefault}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamNoDefault(PythonParser.LambdaParamNoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaParamNoDefault}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamNoDefault(PythonParser.LambdaParamNoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaParamWithDefault}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamWithDefault(PythonParser.LambdaParamWithDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaParamWithDefault}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamWithDefault(PythonParser.LambdaParamWithDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaParamMaybeDefault}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParamMaybeDefault(PythonParser.LambdaParamMaybeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaParamMaybeDefault}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParamMaybeDefault(PythonParser.LambdaParamMaybeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#lambdaParam}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParam(PythonParser.LambdaParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#lambdaParam}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParam(PythonParser.LambdaParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 */
	void enterFStringReplacementFieldMiddle(PythonParser.FStringReplacementFieldMiddleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 */
	void exitFStringReplacementFieldMiddle(PythonParser.FStringReplacementFieldMiddleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringMiddleText}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 */
	void enterFStringMiddleText(PythonParser.FStringMiddleTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringMiddleText}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 */
	void exitFStringMiddleText(PythonParser.FStringMiddleTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fstringReplacementField}.
	 * @param ctx the parse tree
	 */
	void enterFstringReplacementField(PythonParser.FstringReplacementFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fstringReplacementField}.
	 * @param ctx the parse tree
	 */
	void exitFstringReplacementField(PythonParser.FstringReplacementFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fstringConversion}.
	 * @param ctx the parse tree
	 */
	void enterFstringConversion(PythonParser.FstringConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fstringConversion}.
	 * @param ctx the parse tree
	 */
	void exitFstringConversion(PythonParser.FstringConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fstringFullFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterFstringFullFormatSpec(PythonParser.FstringFullFormatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fstringFullFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitFstringFullFormatSpec(PythonParser.FstringFullFormatSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterFStringFormatSpecText(PythonParser.FStringFormatSpecTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitFStringFormatSpecText(PythonParser.FStringFormatSpecTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterFStringFormatSpecReplacementField(PythonParser.FStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitFStringFormatSpecReplacementField(PythonParser.FStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fstring}.
	 * @param ctx the parse tree
	 */
	void enterFstring(PythonParser.FstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fstring}.
	 * @param ctx the parse tree
	 */
	void exitFstring(PythonParser.FstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterTStringFormatSpecText(PythonParser.TStringFormatSpecTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitTStringFormatSpecText(PythonParser.TStringFormatSpecTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterTStringFormatSpecReplacementField(PythonParser.TStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitTStringFormatSpecReplacementField(PythonParser.TStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tstringFullFormatSpec}.
	 * @param ctx the parse tree
	 */
	void enterTstringFullFormatSpec(PythonParser.TstringFullFormatSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tstringFullFormatSpec}.
	 * @param ctx the parse tree
	 */
	void exitTstringFullFormatSpec(PythonParser.TstringFullFormatSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tstringReplacementField}.
	 * @param ctx the parse tree
	 */
	void enterTstringReplacementField(PythonParser.TstringReplacementFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tstringReplacementField}.
	 * @param ctx the parse tree
	 */
	void exitTstringReplacementField(PythonParser.TstringReplacementFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 */
	void enterTStringReplacementFieldMiddle(PythonParser.TStringReplacementFieldMiddleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 */
	void exitTStringReplacementFieldMiddle(PythonParser.TStringReplacementFieldMiddleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TStringMiddleText}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 */
	void enterTStringMiddleText(PythonParser.TStringMiddleTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TStringMiddleText}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 */
	void exitTStringMiddleText(PythonParser.TStringMiddleTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tstring}.
	 * @param ctx the parse tree
	 */
	void enterTstring(PythonParser.TstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tstring}.
	 * @param ctx the parse tree
	 */
	void exitTstring(PythonParser.TstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(PythonParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(PythonParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterFStringStrings(PythonParser.FStringStringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitFStringStrings(PythonParser.FStringStringsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void enterTStringStrings(PythonParser.TStringStringsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 */
	void exitTStringStrings(PythonParser.TStringStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(PythonParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(PythonParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PythonParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PythonParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(PythonParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(PythonParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#doubleStarredKvpairs}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarredKvpairs(PythonParser.DoubleStarredKvpairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#doubleStarredKvpairs}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarredKvpairs(PythonParser.DoubleStarredKvpairsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarredKeyValue}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarredKeyValue(PythonParser.DoubleStarredKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarredKeyValue}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarredKeyValue(PythonParser.DoubleStarredKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RegularKvpair}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 */
	void enterRegularKvpair(PythonParser.RegularKvpairContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RegularKvpair}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 */
	void exitRegularKvpair(PythonParser.RegularKvpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#kvpair}.
	 * @param ctx the parse tree
	 */
	void enterKvpair(PythonParser.KvpairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#kvpair}.
	 * @param ctx the parse tree
	 */
	void exitKvpair(PythonParser.KvpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forIfClauses}.
	 * @param ctx the parse tree
	 */
	void enterForIfClauses(PythonParser.ForIfClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forIfClauses}.
	 * @param ctx the parse tree
	 */
	void exitForIfClauses(PythonParser.ForIfClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forIfClause}.
	 * @param ctx the parse tree
	 */
	void enterForIfClause(PythonParser.ForIfClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forIfClause}.
	 * @param ctx the parse tree
	 */
	void exitForIfClause(PythonParser.ForIfClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 */
	void enterListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 */
	void exitListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 */
	void enterSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 */
	void exitSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void enterGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 */
	void exitGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 */
	void enterDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 */
	void exitDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PositionalArgsWithKwargs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterPositionalArgsWithKwargs(PythonParser.PositionalArgsWithKwargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PositionalArgsWithKwargs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitPositionalArgsWithKwargs(PythonParser.PositionalArgsWithKwargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KeywordArgs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void enterKeywordArgs(PythonParser.KeywordArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KeywordArgs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 */
	void exitKeywordArgs(PythonParser.KeywordArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void enterStarredKwargs(PythonParser.StarredKwargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void exitStarredKwargs(PythonParser.StarredKwargsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarredKwargs(PythonParser.DoubleStarredKwargsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarredKwargs(PythonParser.DoubleStarredKwargsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starredExpression}.
	 * @param ctx the parse tree
	 */
	void enterStarredExpression(PythonParser.StarredExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starredExpression}.
	 * @param ctx the parse tree
	 */
	void exitStarredExpression(PythonParser.StarredExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 */
	void enterNamedArg(PythonParser.NamedArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 */
	void exitNamedArg(PythonParser.NamedArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 */
	void enterStarredArg(PythonParser.StarredArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 */
	void exitStarredArg(PythonParser.StarredArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedDoubleStarArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 */
	void enterNamedDoubleStarArg(PythonParser.NamedDoubleStarArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedDoubleStarArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 */
	void exitNamedDoubleStarArg(PythonParser.NamedDoubleStarArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarredArg(PythonParser.DoubleStarredArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarredArg(PythonParser.DoubleStarredArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starTargets}.
	 * @param ctx the parse tree
	 */
	void enterStarTargets(PythonParser.StarTargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starTargets}.
	 * @param ctx the parse tree
	 */
	void exitStarTargets(PythonParser.StarTargetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starTargetsListSeq}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetsListSeq(PythonParser.StarTargetsListSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starTargetsListSeq}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetsListSeq(PythonParser.StarTargetsListSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#starTargetsTupleSeq}.
	 * @param ctx the parse tree
	 */
	void enterStarTargetsTupleSeq(PythonParser.StarTargetsTupleSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#starTargetsTupleSeq}.
	 * @param ctx the parse tree
	 */
	void exitStarTargetsTupleSeq(PythonParser.StarTargetsTupleSeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 */
	void enterNestedStarTarget(PythonParser.NestedStarTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 */
	void exitNestedStarTarget(PythonParser.NestedStarTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStarTarget(PythonParser.SimpleStarTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStarTarget(PythonParser.SimpleStarTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributedStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 */
	void enterAttributedStarTarget(PythonParser.AttributedStarTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributedStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 */
	void exitAttributedStarTarget(PythonParser.AttributedStarTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 */
	void enterAtomicStarTarget(PythonParser.AtomicStarTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 */
	void exitAtomicStarTarget(PythonParser.AtomicStarTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void enterNameStarAtom(PythonParser.NameStarAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void exitNameStarAtom(PythonParser.NameStarAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedStarAtom(PythonParser.ParenthesizedStarAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedStarAtom(PythonParser.ParenthesizedStarAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void enterTupleStarAtom(PythonParser.TupleStarAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void exitTupleStarAtom(PythonParser.TupleStarAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void enterListStarAtom(PythonParser.ListStarAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void exitListStarAtom(PythonParser.ListStarAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubscriptAttributeTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptAttributeTarget(PythonParser.SubscriptAttributeTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubscriptAttributeTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptAttributeTarget(PythonParser.SubscriptAttributeTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void enterNameTarget(PythonParser.NameTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void exitNameTarget(PythonParser.NameTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedTarget(PythonParser.ParenthesizedTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedTarget(PythonParser.ParenthesizedTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#singleSubscriptAttributeTarget}.
	 * @param ctx the parse tree
	 */
	void enterSingleSubscriptAttributeTarget(PythonParser.SingleSubscriptAttributeTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#singleSubscriptAttributeTarget}.
	 * @param ctx the parse tree
	 */
	void exitSingleSubscriptAttributeTarget(PythonParser.SingleSubscriptAttributeTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TPrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTPrimaryWithAccess(PythonParser.TPrimaryWithAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TPrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTPrimaryWithAccess(PythonParser.TPrimaryWithAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#delTargets}.
	 * @param ctx the parse tree
	 */
	void enterDelTargets(PythonParser.DelTargetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#delTargets}.
	 * @param ctx the parse tree
	 */
	void exitDelTargets(PythonParser.DelTargetsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributedDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 */
	void enterAttributedDelTarget(PythonParser.AttributedDelTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributedDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 */
	void exitAttributedDelTarget(PythonParser.AttributedDelTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomicDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 */
	void enterAtomicDelTarget(PythonParser.AtomicDelTargetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomicDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 */
	void exitAtomicDelTarget(PythonParser.AtomicDelTargetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NameDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void enterNameDelAtom(PythonParser.NameDelAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NameDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void exitNameDelAtom(PythonParser.NameDelAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedDelAtom(PythonParser.ParenthesizedDelAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedDelAtom(PythonParser.ParenthesizedDelAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void enterTupleDelAtom(PythonParser.TupleDelAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void exitTupleDelAtom(PythonParser.TupleDelAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void enterListDelAtom(PythonParser.ListDelAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 */
	void exitListDelAtom(PythonParser.ListDelAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeExpressionsWithStar}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterTypeExpressionsWithStar(PythonParser.TypeExpressionsWithStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeExpressionsWithStar}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitTypeExpressionsWithStar(PythonParser.TypeExpressionsWithStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterStarTypeExpression(PythonParser.StarTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitStarTypeExpression(PythonParser.StarTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoubleStarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterDoubleStarTypeExpression(PythonParser.DoubleStarTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleStarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitDoubleStarTypeExpression(PythonParser.DoubleStarTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 */
	void enterNewlineFuncTypeComment(PythonParser.NewlineFuncTypeCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 */
	void exitNewlineFuncTypeComment(PythonParser.NewlineFuncTypeCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 */
	void enterInlineFuncTypeComment(PythonParser.InlineFuncTypeCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 */
	void exitInlineFuncTypeComment(PythonParser.InlineFuncTypeCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void enterPlainName(PythonParser.PlainNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void exitPlainName(PythonParser.PlainNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TypeName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(PythonParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TypeName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(PythonParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatchName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void enterMatchName(PythonParser.MatchNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatchName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void exitMatchName(PythonParser.MatchNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CaseName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void enterCaseName(PythonParser.CaseNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CaseName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 */
	void exitCaseName(PythonParser.CaseNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterWildcardName(PythonParser.WildcardNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitWildcardName(PythonParser.WildcardNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NonWildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardName(PythonParser.NonWildcardNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NonWildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardName(PythonParser.NonWildcardNameContext ctx);
}