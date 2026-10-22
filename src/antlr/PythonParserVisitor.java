package antlr;// Generated from C:/Users/Mohammed Shadi/IdeaProjects/Flask Compiler/src/antlr/PythonParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#fileInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileInput(PythonParser.FileInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#interactive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteractive(PythonParser.InteractiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval(PythonParser.EvalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(PythonParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(PythonParser.StatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatement}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PythonParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatements}
	 * labeled alternative in {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatements(PythonParser.SimpleStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#singleCompoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCompoundStmt(PythonParser.SingleCompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStatementNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatementNewline(PythonParser.CompoundStatementNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStatementsNewline}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatementsNewline(PythonParser.SimpleStatementsNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlankLine}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlankLine(PythonParser.BlankLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EndOfFile}
	 * labeled alternative in {@link PythonParser#statementNewline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndOfFile(PythonParser.EndOfFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#simpleStmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStmts(PythonParser.SimpleStmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeAliasStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAliasStatement(PythonParser.TypeAliasStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarExpressionStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarExpressionStatement(PythonParser.StarExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PythonParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(PythonParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaiseStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStatement(PythonParser.RaiseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PassStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStatement(PythonParser.PassStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeleteStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(PythonParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStatement(PythonParser.YieldStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStatement(PythonParser.AssertStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(PythonParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(PythonParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GlobalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatement(PythonParser.GlobalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonlocalStatement}
	 * labeled alternative in {@link PythonParser#simpleStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocalStatement(PythonParser.NonlocalStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(PythonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefinition(PythonParser.ClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WithStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithStatement(PythonParser.WithStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PythonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryStatement(PythonParser.TryStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PythonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchStatement}
	 * labeled alternative in {@link PythonParser#compoundStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchStatement(PythonParser.MatchStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedAssignmentName}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedAssignmentName(PythonParser.AnnotatedAssignmentNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnnotatedAssignmentTarget}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotatedAssignmentTarget(PythonParser.AnnotatedAssignmentTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChainedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChainedAssignment(PythonParser.ChainedAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AugmentedAssignment}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code YieldAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldAnnotatedRhs(PythonParser.YieldAnnotatedRhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarExpressionsAnnotatedRhs}
	 * labeled alternative in {@link PythonParser#annotatedRhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarExpressionsAnnotatedRhs(PythonParser.StarExpressionsAnnotatedRhsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAssign(PythonParser.PlusAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MinusAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusAssign(PythonParser.MinusAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAssign(PythonParser.StarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtAssign(PythonParser.AtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashAssign(PythonParser.SlashAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PercentAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentAssign(PythonParser.PercentAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AmpersandAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAmpersandAssign(PythonParser.AmpersandAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VBarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVBarAssign(PythonParser.VBarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CircumflexAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircumflexAssign(PythonParser.CircumflexAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LeftShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftShiftAssign(PythonParser.LeftShiftAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RightShiftAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightShiftAssign(PythonParser.RightShiftAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarAssign(PythonParser.DoubleStarAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleSlashAssign}
	 * labeled alternative in {@link PythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleSlashAssign(PythonParser.DoubleSlashAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(PythonParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#raiseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseStmt(PythonParser.RaiseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#passStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassStmt(PythonParser.PassStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#breakStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(PythonParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#continueStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(PythonParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#globalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStmt(PythonParser.GlobalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#nonlocalStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocalStmt(PythonParser.NonlocalStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#delStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelStmt(PythonParser.DelStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#yieldStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldStmt(PythonParser.YieldStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertStmt(PythonParser.AssertStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportNameStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNameStatement(PythonParser.ImportNameStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromStatement}
	 * labeled alternative in {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromStatement(PythonParser.ImportFromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportName(PythonParser.ImportNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromDotted}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromDotted(PythonParser.ImportFromDottedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromRelative}
	 * labeled alternative in {@link PythonParser#importFrom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromRelative(PythonParser.ImportFromRelativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromParenthesized}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromParenthesized(PythonParser.ImportFromParenthesizedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromNameList}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromNameList(PythonParser.ImportFromNameListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromStar}
	 * labeled alternative in {@link PythonParser#importFromTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromStar(PythonParser.ImportFromStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importFromAsNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromAsNames(PythonParser.ImportFromAsNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importFromAsName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromAsName(PythonParser.ImportFromAsNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dottedAsNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedAsNames(PythonParser.DottedAsNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dottedAsName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedAsName(PythonParser.DottedAsNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DottedNamePath}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedNamePath(PythonParser.DottedNamePathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleDottedName}
	 * labeled alternative in {@link PythonParser#dottedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDottedName(PythonParser.SimpleDottedNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndentedBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndentedBlock(PythonParser.IndentedBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleBlock}
	 * labeled alternative in {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleBlock(PythonParser.SimpleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(PythonParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedClassDefinition(PythonParser.DecoratedClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UndecoratedClassDefinition}
	 * labeled alternative in {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndecoratedClassDefinition(PythonParser.UndecoratedClassDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classDefRaw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefRaw(PythonParser.ClassDefRawContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratedFunctionDefinition(PythonParser.DecoratedFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UndecoratedFunctionDefinition}
	 * labeled alternative in {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndecoratedFunctionDefinition(PythonParser.UndecoratedFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(PythonParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsyncFunction}
	 * labeled alternative in {@link PythonParser#functionDefRaw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncFunction(PythonParser.AsyncFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(PythonParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalOnlyWithSlash}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalOnlyWithSlash(PythonParser.PositionalOnlyWithSlashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalOnlyWithSlashAndDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalOnlyWithSlashAndDefaults(PythonParser.PositionalOnlyWithSlashAndDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularParameters(PythonParser.RegularParametersContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParametersWithDefaults}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametersWithDefaults(PythonParser.ParametersWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParameters}
	 * labeled alternative in {@link PythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParameters(PythonParser.StarParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#slashNoDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashNoDefault(PythonParser.SlashNoDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#slashWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlashWithDefault(PythonParser.SlashWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParam(PythonParser.StarParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarParamWithAnnotation}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarParamWithAnnotation(PythonParser.StarParamWithAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BareStarParam}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareStarParam(PythonParser.BareStarParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordOnlyParams}
	 * labeled alternative in {@link PythonParser#starEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordOnlyParams(PythonParser.KeywordOnlyParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#kwds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKwds(PythonParser.KwdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramNoDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamNoDefault(PythonParser.ParamNoDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramNoDefaultStarAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamNoDefaultStarAnnotation(PythonParser.ParamNoDefaultStarAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamWithDefault(PythonParser.ParamWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramMaybeDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamMaybeDefault(PythonParser.ParamMaybeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(PythonParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#paramStarAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamStarAnnotation(PythonParser.ParamStarAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(PythonParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarAnnotation(PythonParser.StarAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#defaultAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultAssignment(PythonParser.DefaultAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(PythonParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStmt(PythonParser.ElifStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(PythonParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PythonParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(PythonParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedWithItems(PythonParser.ParenthesizedWithItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsyncParenthesizedWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsyncParenthesizedWithItems(PythonParser.AsyncParenthesizedWithItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularWithItems}
	 * labeled alternative in {@link PythonParser#withStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularWithItems(PythonParser.RegularWithItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#withItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithItem(PythonParser.WithItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryFinally}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryFinally(PythonParser.TryFinallyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryExcept}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExcept(PythonParser.TryExceptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryExceptStar}
	 * labeled alternative in {@link PythonParser#tryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExceptStar(PythonParser.TryExceptStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exceptBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptBlock(PythonParser.ExceptBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#exceptStarBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptStarBlock(PythonParser.ExceptStarBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(PythonParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#matchStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchStmt(PythonParser.MatchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubjectExprMultiple}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectExprMultiple(PythonParser.SubjectExprMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubjectExprSingle}
	 * labeled alternative in {@link PythonParser#subjectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubjectExprSingle(PythonParser.SubjectExprSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(PythonParser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(PythonParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternsSequence}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternsSequence(PythonParser.PatternsSequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PatternsSingle}
	 * labeled alternative in {@link PythonParser#patterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternsSingle(PythonParser.PatternsSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AsPatternMatch}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsPatternMatch(PythonParser.AsPatternMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrPatternAlternatives}
	 * labeled alternative in {@link PythonParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPatternAlternatives(PythonParser.OrPatternAlternativesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#asPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsPattern(PythonParser.AsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#orPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrPattern(PythonParser.OrPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralClosedPattern(PythonParser.LiteralClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaptureClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaptureClosedPattern(PythonParser.CaptureClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WildcardClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardClosedPattern(PythonParser.WildcardClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueClosedPattern(PythonParser.ValueClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GroupClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClosedPattern(PythonParser.GroupClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SequenceClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceClosedPattern(PythonParser.SequenceClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MappingClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMappingClosedPattern(PythonParser.MappingClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassClosedPattern}
	 * labeled alternative in {@link PythonParser#closedPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassClosedPattern(PythonParser.ClassClosedPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberLiteralPattern(PythonParser.SignedNumberLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexNumberLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNumberLiteralPattern(PythonParser.ComplexNumberLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralPattern(PythonParser.StringLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteralPattern(PythonParser.NoneLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteralPattern(PythonParser.TrueLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteralPattern}
	 * labeled alternative in {@link PythonParser#literalPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteralPattern(PythonParser.FalseLiteralPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumberLiteralExpr(PythonParser.SignedNumberLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComplexNumberLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNumberLiteralExpr(PythonParser.ComplexNumberLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteralExpr(PythonParser.StringLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneLiteralExpr(PythonParser.NoneLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueLiteralExpr(PythonParser.TrueLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseLiteralExpr}
	 * labeled alternative in {@link PythonParser#literalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseLiteralExpr(PythonParser.FalseLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#complexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexNumber(PythonParser.ComplexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#signedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(PythonParser.SignedNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#signedRealNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedRealNumber(PythonParser.SignedRealNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#realNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealNumber(PythonParser.RealNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#imaginaryNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImaginaryNumber(PythonParser.ImaginaryNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#capturePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapturePattern(PythonParser.CapturePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#patternCaptureTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternCaptureTarget(PythonParser.PatternCaptureTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#wildcardPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardPattern(PythonParser.WildcardPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#valuePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuePattern(PythonParser.ValuePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(PythonParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#nameOrAttr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOrAttr(PythonParser.NameOrAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#groupPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupPattern(PythonParser.GroupPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSequencePattern(PythonParser.ListSequencePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleSequencePattern}
	 * labeled alternative in {@link PythonParser#sequencePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleSequencePattern(PythonParser.TupleSequencePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#openSequencePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenSequencePattern(PythonParser.OpenSequencePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#maybeSequencePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaybeSequencePattern(PythonParser.MaybeSequencePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarMaybePattern(PythonParser.StarMaybePatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularMaybePattern}
	 * labeled alternative in {@link PythonParser#maybeStarPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularMaybePattern(PythonParser.RegularMaybePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarPattern(PythonParser.StarPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyMappingPattern(PythonParser.EmptyMappingPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarMappingPattern(PythonParser.DoubleStarMappingPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ItemsMappingPattern}
	 * labeled alternative in {@link PythonParser#mappingPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsMappingPattern(PythonParser.ItemsMappingPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#itemsPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsPattern(PythonParser.ItemsPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keyValuePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePattern(PythonParser.KeyValuePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#doubleStarPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarPattern(PythonParser.DoubleStarPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassPattern(PythonParser.ClassPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#positionalPatterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalPatterns(PythonParser.PositionalPatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keywordPatterns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordPatterns(PythonParser.KeywordPatternsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#keywordPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordPattern(PythonParser.KeywordPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(PythonParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParams(PythonParser.TypeParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeParamSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamSeq(PythonParser.TypeParamSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularTypeParam(PythonParser.RegularTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTypeParam(PythonParser.StarTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarTypeParam}
	 * labeled alternative in {@link PythonParser#typeParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarTypeParam(PythonParser.DoubleStarTypeParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeParamBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamBound(PythonParser.TypeParamBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeParamDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamDefault(PythonParser.TypeParamDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#typeParamStarredDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamStarredDefault(PythonParser.TypeParamStarredDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PythonParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(PythonParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExpression}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PythonParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#yieldExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYieldExpr(PythonParser.YieldExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarExpressions(PythonParser.StarExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarBitwiseOr}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarBitwiseOr(PythonParser.StarBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularStarExpression}
	 * labeled alternative in {@link PythonParser#starExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularStarExpression(PythonParser.RegularStarExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starNamedExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarNamedExpressions(PythonParser.StarNamedExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarNamedExpressionBitwiseOr}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarNamedExpressionBitwiseOr(PythonParser.StarNamedExpressionBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularStarNamedExpression}
	 * labeled alternative in {@link PythonParser#starNamedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularStarNamedExpression(PythonParser.RegularStarNamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PythonParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedAssignmentExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedAssignmentExpression(PythonParser.NamedAssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularNamedExpression}
	 * labeled alternative in {@link PythonParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularNamedExpression(PythonParser.RegularNamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunction(PythonParser.DisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(PythonParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInversion(PythonParser.NotInversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComparisonInversion}
	 * labeled alternative in {@link PythonParser#inversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonInversion(PythonParser.ComparisonInversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(PythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqComparison(PythonParser.EqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqComparison(PythonParser.NotEqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqComparison(PythonParser.LessEqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessComparison(PythonParser.LessComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqComparison(PythonParser.GreaterEqComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterComparison(PythonParser.GreaterComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotInComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInComparison(PythonParser.NotInComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInComparison(PythonParser.InComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsNotComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotComparison(PythonParser.IsNotComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsComparison}
	 * labeled alternative in {@link PythonParser#compareOpBitwiseOrPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsComparison(PythonParser.IsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#eqBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBitwiseOr(PythonParser.EqBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#noteqBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoteqBitwiseOr(PythonParser.NoteqBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lteBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteBitwiseOr(PythonParser.LteBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ltBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtBitwiseOr(PythonParser.LtBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#gteBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteBitwiseOr(PythonParser.GteBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#gtBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtBitwiseOr(PythonParser.GtBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#notinBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotinBitwiseOr(PythonParser.NotinBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#inBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInBitwiseOr(PythonParser.InBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#isnotBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsnotBitwiseOr(PythonParser.IsnotBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#isBitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsBitwiseOr(PythonParser.IsBitwiseOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseXorOperand}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorOperand(PythonParser.BitwiseXorOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseOrExpression}
	 * labeled alternative in {@link PythonParser#bitwiseOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOrExpression(PythonParser.BitwiseOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseXorExpression}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseXorExpression(PythonParser.BitwiseXorExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAndOperand}
	 * labeled alternative in {@link PythonParser#bitwiseXor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndOperand(PythonParser.BitwiseAndOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseAndExpression}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseAndExpression(PythonParser.BitwiseAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExprOperand}
	 * labeled alternative in {@link PythonParser#bitwiseAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExprOperand(PythonParser.ShiftExprOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SumOperand}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumOperand(PythonParser.SumOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ShiftExpression}
	 * labeled alternative in {@link PythonParser#shiftExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(PythonParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TermOperand}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermOperand(PythonParser.TermOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link PythonParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PythonParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FactorOperand}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorOperand(PythonParser.FactorOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link PythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PythonParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryPlus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlus(PythonParser.UnaryPlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(PythonParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitwiseNot}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseNot(PythonParser.BitwiseNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PowerOperand}
	 * labeled alternative in {@link PythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerOperand(PythonParser.PowerOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AwaitExpression}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAwaitExpression(PythonParser.AwaitExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryOperand}
	 * labeled alternative in {@link PythonParser#awaitPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryOperand(PythonParser.PrimaryOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryWithAccess(PythonParser.PrimaryWithAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomOperand}
	 * labeled alternative in {@link PythonParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomOperand(PythonParser.AtomOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleSlice}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSlice(PythonParser.SingleSliceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultipleSlices}
	 * labeled alternative in {@link PythonParser#slices}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleSlices(PythonParser.MultipleSlicesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SliceRange}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceRange(PythonParser.SliceRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SliceExpression}
	 * labeled alternative in {@link PythonParser#slice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceExpression(PythonParser.SliceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameAtom(PythonParser.NameAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(PythonParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(PythonParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(PythonParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(PythonParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(PythonParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleGroupGenexpAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleGroupGenexpAtom(PythonParser.TupleGroupGenexpAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(PythonParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictSetAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictSetAtom(PythonParser.DictSetAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EllipsisAtom}
	 * labeled alternative in {@link PythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEllipsisAtom(PythonParser.EllipsisAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(PythonParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(PythonParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParams(PythonParser.LambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalOnlyLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalOnlyLambdaParams(PythonParser.PositionalOnlyLambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalOnlyWithDefaultsLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalOnlyWithDefaultsLambdaParams(PythonParser.PositionalOnlyWithDefaultsLambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularLambdaParams(PythonParser.RegularLambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaParamsWithDefaults}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamsWithDefaults(PythonParser.LambdaParamsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarLambdaParams}
	 * labeled alternative in {@link PythonParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarLambdaParams(PythonParser.StarLambdaParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaSlashNoDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaSlashNoDefault(PythonParser.LambdaSlashNoDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaSlashWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaSlashWithDefault(PythonParser.LambdaSlashWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarLambdaParam(PythonParser.StarLambdaParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BareStarLambdaParam}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBareStarLambdaParam(PythonParser.BareStarLambdaParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaKeywordParams}
	 * labeled alternative in {@link PythonParser#lambdaStarEtc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaKeywordParams(PythonParser.LambdaKeywordParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaKwds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaKwds(PythonParser.LambdaKwdsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaParamNoDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamNoDefault(PythonParser.LambdaParamNoDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaParamWithDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamWithDefault(PythonParser.LambdaParamWithDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaParamMaybeDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParamMaybeDefault(PythonParser.LambdaParamMaybeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#lambdaParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParam(PythonParser.LambdaParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringReplacementFieldMiddle(PythonParser.FStringReplacementFieldMiddleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringMiddleText}
	 * labeled alternative in {@link PythonParser#fstringMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringMiddleText(PythonParser.FStringMiddleTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fstringReplacementField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstringReplacementField(PythonParser.FstringReplacementFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fstringConversion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstringConversion(PythonParser.FstringConversionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fstringFullFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstringFullFormatSpec(PythonParser.FstringFullFormatSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringFormatSpecText(PythonParser.FStringFormatSpecTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#fstringFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringFormatSpecReplacementField(PythonParser.FStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFstring(PythonParser.FstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TStringFormatSpecText}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTStringFormatSpecText(PythonParser.TStringFormatSpecTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TStringFormatSpecReplacementField}
	 * labeled alternative in {@link PythonParser#tstringFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTStringFormatSpecReplacementField(PythonParser.TStringFormatSpecReplacementFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tstringFullFormatSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTstringFullFormatSpec(PythonParser.TstringFullFormatSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tstringReplacementField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTstringReplacementField(PythonParser.TstringReplacementFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TStringReplacementFieldMiddle}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTStringReplacementFieldMiddle(PythonParser.TStringReplacementFieldMiddleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TStringMiddleText}
	 * labeled alternative in {@link PythonParser#tstringMiddle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTStringMiddleText(PythonParser.TStringMiddleTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTstring(PythonParser.TstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(PythonParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringStrings(PythonParser.FStringStringsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TStringStrings}
	 * labeled alternative in {@link PythonParser#strings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTStringStrings(PythonParser.TStringStringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(PythonParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(PythonParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PythonParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict(PythonParser.DictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#doubleStarredKvpairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarredKvpairs(PythonParser.DoubleStarredKvpairsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarredKeyValue}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarredKeyValue(PythonParser.DoubleStarredKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RegularKvpair}
	 * labeled alternative in {@link PythonParser#doubleStarredKvpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularKvpair(PythonParser.RegularKvpairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#kvpair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKvpair(PythonParser.KvpairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forIfClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIfClauses(PythonParser.ForIfClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forIfClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIfClause(PythonParser.ForIfClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListcomp(PythonParser.ListcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#setcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetcomp(PythonParser.SetcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#genexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenexp(PythonParser.GenexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictcomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictcomp(PythonParser.DictcompContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PythonParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PositionalArgsWithKwargs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionalArgsWithKwargs(PythonParser.PositionalArgsWithKwargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KeywordArgs}
	 * labeled alternative in {@link PythonParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordArgs(PythonParser.KeywordArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarredKwargs(PythonParser.StarredKwargsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarredKwargs}
	 * labeled alternative in {@link PythonParser#kwargs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarredKwargs(PythonParser.DoubleStarredKwargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starredExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarredExpression(PythonParser.StarredExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedArg(PythonParser.NamedArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrStarred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarredArg(PythonParser.StarredArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedDoubleStarArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedDoubleStarArg(PythonParser.NamedDoubleStarArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarredArg}
	 * labeled alternative in {@link PythonParser#kwargOrDoubleStarred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarredArg(PythonParser.DoubleStarredArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargets(PythonParser.StarTargetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starTargetsListSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetsListSeq(PythonParser.StarTargetsListSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#starTargetsTupleSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTargetsTupleSeq(PythonParser.StarTargetsTupleSeqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStarTarget(PythonParser.NestedStarTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleStarTarget}
	 * labeled alternative in {@link PythonParser#starTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStarTarget(PythonParser.SimpleStarTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributedStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedStarTarget(PythonParser.AttributedStarTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicStarTarget}
	 * labeled alternative in {@link PythonParser#targetWithStarAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicStarTarget(PythonParser.AtomicStarTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameStarAtom(PythonParser.NameStarAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedStarAtom(PythonParser.ParenthesizedStarAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleStarAtom(PythonParser.TupleStarAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListStarAtom}
	 * labeled alternative in {@link PythonParser#starAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListStarAtom(PythonParser.ListStarAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubscriptAttributeTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptAttributeTarget(PythonParser.SubscriptAttributeTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameTarget(PythonParser.NameTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedTarget}
	 * labeled alternative in {@link PythonParser#singleTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedTarget(PythonParser.ParenthesizedTargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#singleSubscriptAttributeTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSubscriptAttributeTarget(PythonParser.SingleSubscriptAttributeTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryAtom}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TPrimaryWithAccess}
	 * labeled alternative in {@link PythonParser#tPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTPrimaryWithAccess(PythonParser.TPrimaryWithAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#delTargets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelTargets(PythonParser.DelTargetsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributedDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributedDelTarget(PythonParser.AttributedDelTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomicDelTarget}
	 * labeled alternative in {@link PythonParser#delTarget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicDelTarget(PythonParser.AtomicDelTargetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NameDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameDelAtom(PythonParser.NameDelAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedDelAtom(PythonParser.ParenthesizedDelAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleDelAtom(PythonParser.TupleDelAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDelAtom}
	 * labeled alternative in {@link PythonParser#delTAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDelAtom(PythonParser.ListDelAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeExpressionsWithStar}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeExpressionsWithStar(PythonParser.TypeExpressionsWithStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarTypeExpression(PythonParser.StarTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoubleStarTypeExpression}
	 * labeled alternative in {@link PythonParser#typeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleStarTypeExpression(PythonParser.DoubleStarTypeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewlineFuncTypeComment(PythonParser.NewlineFuncTypeCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InlineFuncTypeComment}
	 * labeled alternative in {@link PythonParser#funcTypeComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineFuncTypeComment(PythonParser.InlineFuncTypeCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainName(PythonParser.PlainNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TypeName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(PythonParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchName(PythonParser.MatchNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CaseName}
	 * labeled alternative in {@link PythonParser#nameExceptUnderscore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseName(PythonParser.CaseNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardName(PythonParser.WildcardNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NonWildcardName}
	 * labeled alternative in {@link PythonParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardName(PythonParser.NonWildcardNameContext ctx);
}