package Visitor;

import AST.Python.*;
import antlr.PythonParser;
import antlr.PythonParserBaseVisitor;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

public class PythonVisitor extends PythonParserBaseVisitor<Object> {

    /** Convenience: 1-based line number of the first token in this rule. */
    private static int line(ParserRuleContext ctx) {
        return ctx.getStart().getLine();
    }

    // =====================================================================
    // STARTING RULES
    // =====================================================================

    @Override
    public FileInput visitFileInput(PythonParser.FileInputContext ctx) {
        Statements statements = ctx.statements() != null ? visitStatements(ctx.statements()) : null;
        String eof = ctx.EOF() != null ? ctx.EOF().getText() : null;
        return new FileInput("FileInput", line(ctx), statements, eof);
    }

    @Override
    public Interactive visitInteractive(PythonParser.InteractiveContext ctx) {
        StatementNewline sn = ((StatementNewline)visit(ctx.statementNewline()));
        return new Interactive("Interactive", line(ctx), sn);
    }

    @Override
    public Eval visitEval(PythonParser.EvalContext ctx) {
        Expressions expressions = visitExpressions(ctx.expressions());
        List<String> newlines = new ArrayList<>();
        for (int i = 0; i < ctx.NEWLINE().size(); i++) newlines.add(ctx.NEWLINE(i).getText());
        String eof = ctx.EOF() != null ? ctx.EOF().getText() : null;
        return new Eval("Eval", line(ctx), expressions, newlines, eof);
    }

    @Override
    public FuncType visitFuncType(PythonParser.FuncTypeContext ctx) {
        String lpar = ctx.LPAR().getText();
        TypeExpressions te = ctx.typeExpressions() != null ? ((TypeExpressions)visit(ctx.typeExpressions())) : null;
        String rpar = ctx.RPAR().getText();
        String rarrow = ctx.RARROW().getText();
        Expression expr = ((Expression)visit(ctx.expression()));
        List<String> newlines = new ArrayList<>();
        for (int i = 0; i < ctx.NEWLINE().size(); i++) newlines.add(ctx.NEWLINE(i).getText());
        String eof = ctx.EOF() != null ? ctx.EOF().getText() : null;
        return new FuncType("FuncType", line(ctx), lpar, te, rpar, rarrow, expr, newlines, eof);
    }

    // =====================================================================
    // GENERAL STATEMENTS
    // =====================================================================

    @Override
    public Statements visitStatements(PythonParser.StatementsContext ctx) {
        List<Statement> stmts = new ArrayList<>();
        for (int i = 0; i < ctx.statement().size(); i++) {
            if (ctx.statement(i) != null) stmts.add((Statement)visit(ctx.statement(i)));
        }
        return new Statements("Statements", line(ctx), stmts);
    }

    @Override
    public Statement visitCompoundStatement(PythonParser.CompoundStatementContext ctx) {
        CompoundStmt cs = (CompoundStmt) visit(ctx.compoundStmt());
        return new CompoundStatement("CompoundStatement", line(ctx), cs);
    }

    @Override
    public Statement visitSimpleStatements(PythonParser.SimpleStatementsContext ctx) {
        SimpleStmts ss = visitSimpleStmts(ctx.simpleStmts());
        return new SimpleStatements("SimpleStatements", line(ctx), ss);
    }

    @Override
    public SingleCompoundStmt visitSingleCompoundStmt(PythonParser.SingleCompoundStmtContext ctx) {
        CompoundStmt cs = (CompoundStmt)visit(ctx.compoundStmt());
        return new SingleCompoundStmt("SingleCompoundStmt", line(ctx), cs);
    }

    @Override
    public StatementNewline visitCompoundStatementNewline(PythonParser.CompoundStatementNewlineContext ctx) {
        SingleCompoundStmt scs = visitSingleCompoundStmt(ctx.singleCompoundStmt());
        String nl = ctx.NEWLINE().getText();
        return new CompoundStatementNewline("CompoundStatementNewline", line(ctx), scs, nl);
    }

    @Override
    public StatementNewline visitSimpleStatementsNewline(PythonParser.SimpleStatementsNewlineContext ctx) {
        SimpleStmts ss = visitSimpleStmts(ctx.simpleStmts());
        return new SimpleStatementsNewline("SimpleStatementsNewline", line(ctx), ss);
    }

    @Override
    public StatementNewline visitBlankLine(PythonParser.BlankLineContext ctx) {
        return new BlankLine("BlankLine", line(ctx), ctx.NEWLINE().getText());
    }

    @Override
    public StatementNewline visitEndOfFile(PythonParser.EndOfFileContext ctx) {
        return new EndOfFile("EndOfFile", line(ctx), ctx.EOF().getText());
    }

    @Override
    public SimpleStmts visitSimpleStmts(PythonParser.SimpleStmtsContext ctx) {
        List<SimpleStmt> stmts = new ArrayList<>();
        for (int i = 0; i < ctx.simpleStmt().size(); i++) {
            if (ctx.simpleStmt(i) != null) stmts.add((SimpleStmt)visit(ctx.simpleStmt(i)));
        }
        List<String> semis = new ArrayList<>();
        for (int i = 0; i < ctx.SEMI().size(); i++) semis.add(ctx.SEMI(i).getText());
        String nl = ctx.NEWLINE() != null ? ctx.NEWLINE().getText() : null;
        return new SimpleStmts("SimpleStmts", line(ctx), stmts, semis, nl);
    }

    // -------------------- simpleStmt alternatives ------------------------

    @Override
    public SimpleStmt visitAssignmentStatement(PythonParser.AssignmentStatementContext ctx) {
        Assignment a = (Assignment)visit(ctx.assignment());
        return new AssignmentStatement("AssignmentStatement", line(ctx), a);
    }

    @Override
    public SimpleStmt visitTypeAliasStatement(PythonParser.TypeAliasStatementContext ctx) {
        TypeAlias ta = visitTypeAlias(ctx.typeAlias());
        return new TypeAliasStatement("TypeAliasStatement", line(ctx), ta);
    }

    @Override
    public SimpleStmt visitStarExpressionStatement(PythonParser.StarExpressionStatementContext ctx) {
        StarExpressions se = visitStarExpressions(ctx.starExpressions());
        return new StarExpressionStatement("StarExpressionStatement", line(ctx), se);
    }

    @Override
    public SimpleStmt visitReturnStatement(PythonParser.ReturnStatementContext ctx) {
        ReturnStmt rs = visitReturnStmt(ctx.returnStmt());
        return new ReturnStatement("ReturnStatement", line(ctx), rs);
    }

    @Override
    public SimpleStmt visitImportStatement(PythonParser.ImportStatementContext ctx) {
        ImportStmt is = (ImportStmt)visit(ctx.importStmt());
        return new ImportStatement("ImportStatement", line(ctx), is);
    }

    @Override
    public SimpleStmt visitRaiseStatement(PythonParser.RaiseStatementContext ctx) {
        RaiseStmt rs = visitRaiseStmt(ctx.raiseStmt());
        return new RaiseStatement("RaiseStatement", line(ctx), rs);
    }

    @Override
    public SimpleStmt visitPassStatement(PythonParser.PassStatementContext ctx) {
        PassStmt ps = visitPassStmt(ctx.passStmt());
        return new PassStatement("PassStatement", line(ctx), ps);
    }

    @Override
    public SimpleStmt visitDeleteStatement(PythonParser.DeleteStatementContext ctx) {
        DelStmt ds = visitDelStmt(ctx.delStmt());
        return new DeleteStatement("DeleteStatement", line(ctx), ds);
    }

    @Override
    public SimpleStmt visitYieldStatement(PythonParser.YieldStatementContext ctx) {
        YieldStmt ys = visitYieldStmt(ctx.yieldStmt());
        return new YieldStatement("YieldStatement", line(ctx), ys);
    }

    @Override
    public SimpleStmt visitAssertStatement(PythonParser.AssertStatementContext ctx) {
        AssertStmt as = visitAssertStmt(ctx.assertStmt());
        return new AssertStatement("AssertStatement", line(ctx), as);
    }

    @Override
    public SimpleStmt visitBreakStatement(PythonParser.BreakStatementContext ctx) {
        BreakStmt bs = visitBreakStmt(ctx.breakStmt());
        return new BreakStatement("BreakStatement", line(ctx), bs);
    }

    @Override
    public SimpleStmt visitContinueStatement(PythonParser.ContinueStatementContext ctx) {
        ContinueStmt cs = visitContinueStmt(ctx.continueStmt());
        return new ContinueStatement("ContinueStatement", line(ctx), cs);
    }

    @Override
    public SimpleStmt visitGlobalStatement(PythonParser.GlobalStatementContext ctx) {
        GlobalStmt gs = visitGlobalStmt(ctx.globalStmt());
        return new GlobalStatement("GlobalStatement", line(ctx), gs);
    }

    @Override
    public SimpleStmt visitNonlocalStatement(PythonParser.NonlocalStatementContext ctx) {
        NonlocalStmt ns = visitNonlocalStmt(ctx.nonlocalStmt());
        return new NonlocalStatement("NonlocalStatement", line(ctx), ns);
    }

    // -------------------- compoundStmt alternatives ----------------------

    @Override
    public CompoundStmt visitFunctionDefinition(PythonParser.FunctionDefinitionContext ctx) {
        FunctionDef fd = (FunctionDef)visit(ctx.functionDef());
        return new FunctionDefinition("FunctionDefinition", line(ctx), fd);
    }

    @Override
    public CompoundStmt visitIfStatement(PythonParser.IfStatementContext ctx) {
        IfStmt is = visitIfStmt(ctx.ifStmt());
        return new IfStatement("IfStatement", line(ctx), is);
    }

    @Override
    public CompoundStmt visitClassDefinition(PythonParser.ClassDefinitionContext ctx) {
        ClassDef cd = (ClassDef)visit(ctx.classDef());
        return new ClassDefinition("ClassDefinition", line(ctx), cd);
    }

    @Override
    public CompoundStmt visitWithStatement(PythonParser.WithStatementContext ctx) {
        WithStmt ws = (WithStmt)visit(ctx.withStmt());
        return new WithStatement("WithStatement", line(ctx), ws);
    }

    @Override
    public CompoundStmt visitForStatement(PythonParser.ForStatementContext ctx) {
        ForStmt fs = visitForStmt(ctx.forStmt());
        return new ForStatement("ForStatement", line(ctx), fs);
    }

    @Override
    public CompoundStmt visitTryStatement(PythonParser.TryStatementContext ctx) {
        TryStmt ts = (TryStmt) visit(ctx.tryStmt());
        return new TryStatement("TryStatement", line(ctx), ts);
    }

    @Override
    public CompoundStmt visitWhileStatement(PythonParser.WhileStatementContext ctx) {
        WhileStmt ws = visitWhileStmt(ctx.whileStmt());
        return new WhileStatement("WhileStatement", line(ctx), ws);
    }

    @Override
    public CompoundStmt visitMatchStatement(PythonParser.MatchStatementContext ctx) {
        MatchStmt ms = visitMatchStmt(ctx.matchStmt());
        return new MatchStatement("MatchStatement", line(ctx), ms);
    }

    // =====================================================================
    // ASSIGNMENT ALTERNATIVES
    // =====================================================================

    @Override
    public Assignment visitAnnotatedAssignmentName(PythonParser.AnnotatedAssignmentNameContext ctx) {
        Name name = (Name)visit(ctx.name());
        String colon = ctx.COLON().getText();
        Expression expr = (Expression) visit(ctx.expression());
        String eq = ctx.EQUAL() != null ? ctx.EQUAL().getText() : null;
        AnnotatedRhs rhs = ctx.annotatedRhs() != null ? (AnnotatedRhs) visit(ctx.annotatedRhs()) : null;
        return new AnnotatedAssignmentName("AnnotatedAssignmentName", line(ctx), name, colon, expr, eq, rhs);
    }

    @Override
    public Assignment visitAnnotatedAssignmentTarget(PythonParser.AnnotatedAssignmentTargetContext ctx) {
        String lpar = ctx.LPAR() != null ? ctx.LPAR().getText() : null;
        SingleTarget st = ctx.singleTarget() != null ? (SingleTarget) visit(ctx.singleTarget()) : null;
        String rpar = ctx.RPAR() != null ? ctx.RPAR().getText() : null;
        SingleSubscriptAttributeTarget ssa = ctx.singleSubscriptAttributeTarget() != null
                ? visitSingleSubscriptAttributeTarget(ctx.singleSubscriptAttributeTarget()) : null;
        String colon = ctx.COLON().getText();
        Expression expr = (Expression) visit(ctx.expression());
        String eq = ctx.EQUAL() != null ? ctx.EQUAL().getText() : null;
        AnnotatedRhs rhs = ctx.annotatedRhs() != null ? (AnnotatedRhs) visit(ctx.annotatedRhs()) : null;
        return new AnnotatedAssignmentTarget("AnnotatedAssignmentTarget", line(ctx),
                lpar, st, rpar, ssa, colon, expr, eq, rhs);
    }

    @Override
    public Assignment visitChainedAssignment(PythonParser.ChainedAssignmentContext ctx) {
        List<StarTargets> starTargets = new ArrayList<>();
        for (int i = 0; i < ctx.starTargets().size(); i++) {
            if (ctx.starTargets(i) != null) starTargets.add(visitStarTargets(ctx.starTargets(i)));
        }
        List<String> equals = new ArrayList<>();
        for (int i = 0; i < ctx.EQUAL().size(); i++) equals.add(ctx.EQUAL(i).getText());
        AnnotatedRhs rhs = (AnnotatedRhs) visit(ctx.annotatedRhs());
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        return new ChainedAssignment("ChainedAssignment", line(ctx), starTargets, equals, rhs, tc);
    }

    @Override
    public Assignment visitAugmentedAssignment(PythonParser.AugmentedAssignmentContext ctx) {
        SingleTarget st = (SingleTarget) visit(ctx.singleTarget());
        Augassign a = (Augassign) visit(ctx.augassign());
        AnnotatedRhs rhs = (AnnotatedRhs) visit(ctx.annotatedRhs());
        return new AugmentedAssignment("AugmentedAssignment", line(ctx), st, a, rhs);
    }

    // -------------------- annotatedRhs -----------------------------------

    @Override
    public AnnotatedRhs visitYieldAnnotatedRhs(PythonParser.YieldAnnotatedRhsContext ctx) {
        return new YieldAnnotatedRhs("YieldAnnotatedRhs", line(ctx), visitYieldExpr(ctx.yieldExpr()));
    }

    @Override
    public AnnotatedRhs visitStarExpressionsAnnotatedRhs(PythonParser.StarExpressionsAnnotatedRhsContext ctx) {
        return new StarExpressionsAnnotatedRhs("StarExpressionsAnnotatedRhs", line(ctx),
                visitStarExpressions(ctx.starExpressions()));
    }

    // -------------------- augassign alternatives -------------------------

    @Override public Augassign visitPlusAssign(PythonParser.PlusAssignContext ctx) {
        return new PlusAssign("PlusAssign", line(ctx), ctx.PLUSEQUAL().getText());
    }
    @Override public Augassign visitMinusAssign(PythonParser.MinusAssignContext ctx) {
        return new MinusAssign("MinusAssign", line(ctx), ctx.MINEQUAL().getText());
    }
    @Override public Augassign visitStarAssign(PythonParser.StarAssignContext ctx) {
        return new StarAssign("StarAssign", line(ctx), ctx.STAREQUAL().getText());
    }
    @Override public Augassign visitAtAssign(PythonParser.AtAssignContext ctx) {
        return new AtAssign("AtAssign", line(ctx), ctx.ATEQUAL().getText());
    }
    @Override public Augassign visitSlashAssign(PythonParser.SlashAssignContext ctx) {
        return new SlashAssign("SlashAssign", line(ctx), ctx.SLASHEQUAL().getText());
    }
    @Override public Augassign visitPercentAssign(PythonParser.PercentAssignContext ctx) {
        return new PercentAssign("PercentAssign", line(ctx), ctx.PERCENTEQUAL().getText());
    }
    @Override public Augassign visitAmpersandAssign(PythonParser.AmpersandAssignContext ctx) {
        return new AmpersandAssign("AmpersandAssign", line(ctx), ctx.AMPEREQUAL().getText());
    }
    @Override public Augassign visitVBarAssign(PythonParser.VBarAssignContext ctx) {
        return new VBarAssign("VBarAssign", line(ctx), ctx.VBAREQUAL().getText());
    }
    @Override public Augassign visitCircumflexAssign(PythonParser.CircumflexAssignContext ctx) {
        return new CircumflexAssign("CircumflexAssign", line(ctx), ctx.CIRCUMFLEXEQUAL().getText());
    }
    @Override public Augassign visitLeftShiftAssign(PythonParser.LeftShiftAssignContext ctx) {
        return new LeftShiftAssign("LeftShiftAssign", line(ctx), ctx.LEFTSHIFTEQUAL().getText());
    }
    @Override public Augassign visitRightShiftAssign(PythonParser.RightShiftAssignContext ctx) {
        return new RightShiftAssign("RightShiftAssign", line(ctx), ctx.RIGHTSHIFTEQUAL().getText());
    }
    @Override public Augassign visitDoubleStarAssign(PythonParser.DoubleStarAssignContext ctx) {
        return new DoubleStarAssign("DoubleStarAssign", line(ctx), ctx.DOUBLESTAREQUAL().getText());
    }
    @Override public Augassign visitDoubleSlashAssign(PythonParser.DoubleSlashAssignContext ctx) {
        return new DoubleSlashAssign("DoubleSlashAssign", line(ctx), ctx.DOUBLESLASHEQUAL().getText());
    }

    // =====================================================================
    // SIMPLE STATEMENTS
    // =====================================================================

    @Override
    public ReturnStmt visitReturnStmt(PythonParser.ReturnStmtContext ctx) {
        String ret = ctx.RETURN().getText();
        StarExpressions se = ctx.starExpressions() != null ? visitStarExpressions(ctx.starExpressions()) : null;
        return new ReturnStmt("ReturnStmt", line(ctx), ret, se);
    }

    @Override
    public RaiseStmt visitRaiseStmt(PythonParser.RaiseStmtContext ctx) {
        String raise = ctx.RAISE().getText();
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) {
            if (ctx.expression(i) != null) exprs.add((Expression) visit(ctx.expression(i)));
        }
        String from = ctx.FROM() != null ? ctx.FROM().getText() : null;
        return new RaiseStmt("RaiseStmt", line(ctx), raise, exprs, from);
    }

    @Override
    public PassStmt visitPassStmt(PythonParser.PassStmtContext ctx) {
        return new PassStmt("PassStmt", line(ctx), ctx.PASS().getText());
    }

    @Override
    public BreakStmt visitBreakStmt(PythonParser.BreakStmtContext ctx) {
        return new BreakStmt("BreakStmt", line(ctx), ctx.BREAK().getText());
    }

    @Override
    public ContinueStmt visitContinueStmt(PythonParser.ContinueStmtContext ctx) {
        return new ContinueStmt("ContinueStmt", line(ctx), ctx.CONTINUE().getText());
    }

    @Override
    public GlobalStmt visitGlobalStmt(PythonParser.GlobalStmtContext ctx) {
        String g = ctx.GLOBAL().getText();
        List<Name> names = new ArrayList<>();
        for (int i = 0; i < ctx.name().size(); i++) names.add((Name) visit(ctx.name(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new GlobalStmt("GlobalStmt", line(ctx), g, names, commas);
    }

    @Override
    public NonlocalStmt visitNonlocalStmt(PythonParser.NonlocalStmtContext ctx) {
        String nl = ctx.NONLOCAL().getText();
        List<Name> names = new ArrayList<>();
        for (int i = 0; i < ctx.name().size(); i++) names.add((Name) visit(ctx.name(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new NonlocalStmt("NonlocalStmt", line(ctx), nl, names, commas);
    }

    @Override
    public DelStmt visitDelStmt(PythonParser.DelStmtContext ctx) {
        return new DelStmt("DelStmt", line(ctx), ctx.DEL().getText(),
                visitDelTargets(ctx.delTargets()));
    }

    @Override
    public YieldStmt visitYieldStmt(PythonParser.YieldStmtContext ctx) {
        return new YieldStmt("YieldStmt", line(ctx), visitYieldExpr(ctx.yieldExpr()));
    }

    @Override
    public AssertStmt visitAssertStmt(PythonParser.AssertStmtContext ctx) {
        String a = ctx.ASSERT().getText();
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression) visit(ctx.expression(i)));
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        return new AssertStmt("AssertStmt", line(ctx), a, exprs, comma);
    }

    // -------------------- importStmt alternatives ------------------------

    @Override
    public ImportStmt visitImportNameStatement(PythonParser.ImportNameStatementContext ctx) {
        return new ImportNameStatement("ImportNameStatement", line(ctx),
                visitImportName(ctx.importName()));
    }

    @Override
    public ImportStmt visitImportFromStatement(PythonParser.ImportFromStatementContext ctx) {
        return new ImportFromStatement("ImportFromStatement", line(ctx),
                (ImportFrom) visit(ctx.importFrom()));
    }

    @Override
    public ImportName visitImportName(PythonParser.ImportNameContext ctx) {
        return new ImportName("ImportName", line(ctx),
                ctx.IMPORT().getText(), visitDottedAsNames(ctx.dottedAsNames()));
    }

    @Override
    public ImportFrom visitImportFromDotted(PythonParser.ImportFromDottedContext ctx) {
        String from = ctx.FROM().getText();
        List<String> dots = new ArrayList<>();
        for (int i = 0; i < ctx.DOT().size(); i++) dots.add(ctx.DOT(i).getText());
        List<String> ellipses = new ArrayList<>();
        for (int i = 0; i < ctx.ELLIPSIS().size(); i++) ellipses.add(ctx.ELLIPSIS(i).getText());
        DottedName dn = (DottedName)visit(ctx.dottedName());
        String imp = ctx.IMPORT().getText();
        ImportFromTargets ift = (ImportFromTargets)visit(ctx.importFromTargets());
        return new ImportFromDotted("ImportFromDotted", line(ctx),
                from, dots, ellipses, dn, imp, ift);
    }

    @Override
    public ImportFrom visitImportFromRelative(PythonParser.ImportFromRelativeContext ctx) {
        String from = ctx.FROM().getText();
        List<String> dots = new ArrayList<>();
        for (int i = 0; i < ctx.DOT().size(); i++) dots.add(ctx.DOT(i).getText());
        List<String> ellipses = new ArrayList<>();
        for (int i = 0; i < ctx.ELLIPSIS().size(); i++) ellipses.add(ctx.ELLIPSIS(i).getText());
        String imp = ctx.IMPORT().getText();
        ImportFromTargets ift = (ImportFromTargets)visit(ctx.importFromTargets());
        return new ImportFromRelative("ImportFromRelative", line(ctx),
                from, dots, ellipses, imp, ift);
    }

    @Override
    public ImportFromTargets visitImportFromParenthesized(PythonParser.ImportFromParenthesizedContext ctx) {
        String lpar = ctx.LPAR().getText();
        ImportFromAsNames ifan = visitImportFromAsNames(ctx.importFromAsNames());
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String rpar = ctx.RPAR().getText();
        return new ImportFromParenthesized("ImportFromParenthesized", line(ctx),
                lpar, ifan, comma, rpar);
    }

    @Override
    public ImportFromTargets visitImportFromNameList(PythonParser.ImportFromNameListContext ctx) {
        return new ImportFromNameList("ImportFromNameList", line(ctx),
                visitImportFromAsNames(ctx.importFromAsNames()));
    }

    @Override
    public ImportFromTargets visitImportFromStar(PythonParser.ImportFromStarContext ctx) {
        return new ImportFromStar("ImportFromStar", line(ctx), ctx.STAR().getText());
    }

    @Override
    public ImportFromAsNames visitImportFromAsNames(PythonParser.ImportFromAsNamesContext ctx) {
        List<ImportFromAsName> names = new ArrayList<>();
        for (int i = 0; i < ctx.importFromAsName().size(); i++)
            names.add(visitImportFromAsName(ctx.importFromAsName(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new ImportFromAsNames("ImportFromAsNames", line(ctx), names, commas);
    }

    @Override
    public ImportFromAsName visitImportFromAsName(PythonParser.ImportFromAsNameContext ctx) {
        List<Name> names = new ArrayList<>();
        for (int i = 0; i < ctx.name().size(); i++) names.add((Name)visit(ctx.name(i)));
        String as = ctx.AS() != null ? ctx.AS().getText() : null;
        return new ImportFromAsName("ImportFromAsName", line(ctx), names, as);
    }

    @Override
    public DottedAsNames visitDottedAsNames(PythonParser.DottedAsNamesContext ctx) {
        List<DottedAsName> names = new ArrayList<>();
        for (int i = 0; i < ctx.dottedAsName().size(); i++)
            names.add(visitDottedAsName(ctx.dottedAsName(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new DottedAsNames("DottedAsNames", line(ctx), names, commas);
    }

    @Override
    public DottedAsName visitDottedAsName(PythonParser.DottedAsNameContext ctx) {
        DottedName dn = (DottedName)visit(ctx.dottedName());
        String as = ctx.AS() != null ? ctx.AS().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        return new DottedAsName("DottedAsName", line(ctx), dn, as, name);
    }

    @Override
    public DottedName visitDottedNamePath(PythonParser.DottedNamePathContext ctx) {
        DottedName dn = (DottedName)visit(ctx.dottedName());
        String dot = ctx.DOT().getText();
        Name name = (Name)visit(ctx.name());
        return new DottedNamePath("DottedNamePath", line(ctx), dn, dot, name);
    }

    @Override
    public DottedName visitSimpleDottedName(PythonParser.SimpleDottedNameContext ctx) {
        return new SimpleDottedName("SimpleDottedName", line(ctx), (Name)visit(ctx.name()));
    }

    // =====================================================================
    // BLOCKS
    // =====================================================================

    @Override
    public Block visitIndentedBlock(PythonParser.IndentedBlockContext ctx) {
        String nl = ctx.NEWLINE().getText();
        String ind = ctx.INDENT().getText();
        Statements stmts = visitStatements(ctx.statements());
        String ded = ctx.DEDENT().getText();
        return new IndentedBlock("IndentedBlock", line(ctx), nl, ind, stmts, ded);
    }

    @Override
    public Block visitSimpleBlock(PythonParser.SimpleBlockContext ctx) {
        return new SimpleBlock("SimpleBlock", line(ctx), visitSimpleStmts(ctx.simpleStmts()));
    }

    @Override
    public Decorators visitDecorators(PythonParser.DecoratorsContext ctx) {
        List<String> ats = new ArrayList<>();
        for (int i = 0; i < ctx.AT().size(); i++) ats.add(ctx.AT(i).getText());
        List<NamedExpression> nes = new ArrayList<>();
        for (int i = 0; i < ctx.namedExpression().size(); i++)
            nes.add((NamedExpression)visit(ctx.namedExpression(i)));
        List<String> nls = new ArrayList<>();
        for (int i = 0; i < ctx.NEWLINE().size(); i++) nls.add(ctx.NEWLINE(i).getText());
        return new Decorators("Decorators", line(ctx), ats, nes, nls);
    }

    // =====================================================================
    // CLASS / FUNCTION
    // =====================================================================

    @Override
    public ClassDef visitDecoratedClassDefinition(PythonParser.DecoratedClassDefinitionContext ctx) {
        return new DecoratedClassDefinition("DecoratedClassDefinition", line(ctx),
                visitDecorators(ctx.decorators()), visitClassDefRaw(ctx.classDefRaw()));
    }

    @Override
    public ClassDef visitUndecoratedClassDefinition(PythonParser.UndecoratedClassDefinitionContext ctx) {
        return new UndecoratedClassDefinition("UndecoratedClassDefinition", line(ctx),
                visitClassDefRaw(ctx.classDefRaw()));
    }

    @Override
    public ClassDefRaw visitClassDefRaw(PythonParser.ClassDefRawContext ctx) {
        String cls = ctx.CLASS().getText();
        Name name = (Name)visit(ctx.name());
        TypeParams tp = ctx.typeParams() != null ? visitTypeParams(ctx.typeParams()) : null;
        String lpar = ctx.LPAR() != null ? ctx.LPAR().getText() : null;
        Arguments args = ctx.arguments() != null ? visitArguments(ctx.arguments()) : null;
        String rpar = ctx.RPAR() != null ? ctx.RPAR().getText() : null;
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        return new ClassDefRaw("ClassDefRaw", line(ctx),
                cls, name, tp, lpar, args, rpar, colon, block);
    }

    @Override
    public FunctionDef visitDecoratedFunctionDefinition(PythonParser.DecoratedFunctionDefinitionContext ctx) {
        return new DecoratedFunctionDefinition("DecoratedFunctionDefinition", line(ctx),
                visitDecorators(ctx.decorators()), (FunctionDefRaw)visit(ctx.functionDefRaw()));
    }

    @Override
    public FunctionDef visitUndecoratedFunctionDefinition(PythonParser.UndecoratedFunctionDefinitionContext ctx) {
        return new UndecoratedFunctionDefinition("UndecoratedFunctionDefinition", line(ctx),
                (FunctionDefRaw)visit(ctx.functionDefRaw()));
    }

    @Override
    public FunctionDefRaw visitRegularFunction(PythonParser.RegularFunctionContext ctx) {
        String def = ctx.DEF().getText();
        Name name = (Name)visit(ctx.name());
        TypeParams tp = ctx.typeParams() != null ? visitTypeParams(ctx.typeParams()) : null;
        String lpar = ctx.LPAR().getText();
        Params params = ctx.params() != null ? visitParams(ctx.params()) : null;
        String rpar = ctx.RPAR().getText();
        String rarrow = ctx.RARROW() != null ? ctx.RARROW().getText() : null;
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        String colon = ctx.COLON().getText();
        FuncTypeComment ftc = ctx.funcTypeComment() != null ? (FuncTypeComment)visit(ctx.funcTypeComment()) : null;
        Block block = (Block)visit(ctx.block());
        return new RegularFunction("RegularFunction", line(ctx),
                def, name, tp, lpar, params, rpar, rarrow, expr, colon, ftc, block);
    }

    @Override
    public FunctionDefRaw visitAsyncFunction(PythonParser.AsyncFunctionContext ctx) {
        String async = ctx.ASYNC().getText();
        String def = ctx.DEF().getText();
        Name name = (Name)visit(ctx.name());
        TypeParams tp = ctx.typeParams() != null ? visitTypeParams(ctx.typeParams()) : null;
        String lpar = ctx.LPAR().getText();
        Params params = ctx.params() != null ? visitParams(ctx.params()) : null;
        String rpar = ctx.RPAR().getText();
        String rarrow = ctx.RARROW() != null ? ctx.RARROW().getText() : null;
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        String colon = ctx.COLON().getText();
        FuncTypeComment ftc = ctx.funcTypeComment() != null ? (FuncTypeComment)visit(ctx.funcTypeComment()) : null;
        Block block = (Block)visit(ctx.block());
        return new AsyncFunction("AsyncFunction", line(ctx),
                async, def, name, tp, lpar, params, rpar, rarrow, expr, colon, ftc, block);
    }

    // =====================================================================
    // PARAMS
    // =====================================================================

    @Override
    public Params visitParams(PythonParser.ParamsContext ctx) {
        return new Params("Params", line(ctx), (Parameters)visit(ctx.parameters()));
    }

    @Override
    public Parameters visitPositionalOnlyWithSlash(PythonParser.PositionalOnlyWithSlashContext ctx) {
        SlashNoDefault snd = visitSlashNoDefault(ctx.slashNoDefault());
        List<ParamNoDefault> pnd = new ArrayList<>();
        for (int i = 0; i < ctx.paramNoDefault().size(); i++) pnd.add(visitParamNoDefault(ctx.paramNoDefault(i)));
        List<ParamWithDefault> pwd = new ArrayList<>();
        for (int i = 0; i < ctx.paramWithDefault().size(); i++) pwd.add(visitParamWithDefault(ctx.paramWithDefault(i)));
        StarEtc se = ctx.starEtc() != null ? (StarEtc)visit(ctx.starEtc()) : null;
        return new PositionalOnlyWithSlash("PositionalOnlyWithSlash", line(ctx), snd, pnd, pwd, se);
    }

    @Override
    public Parameters visitPositionalOnlyWithSlashAndDefaults(PythonParser.PositionalOnlyWithSlashAndDefaultsContext ctx) {
        SlashWithDefault swd = visitSlashWithDefault(ctx.slashWithDefault());
        List<ParamWithDefault> pwd = new ArrayList<>();
        for (int i = 0; i < ctx.paramWithDefault().size(); i++) pwd.add(visitParamWithDefault(ctx.paramWithDefault(i)));
        StarEtc se = ctx.starEtc() != null ? (StarEtc)visit(ctx.starEtc()) : null;
        return new PositionalOnlyWithSlashAndDefaults("PositionalOnlyWithSlashAndDefaults", line(ctx), swd, pwd, se);
    }

    @Override
    public Parameters visitRegularParameters(PythonParser.RegularParametersContext ctx) {
        List<ParamNoDefault> pnd = new ArrayList<>();
        for (int i = 0; i < ctx.paramNoDefault().size(); i++) pnd.add(visitParamNoDefault(ctx.paramNoDefault(i)));
        List<ParamWithDefault> pwd = new ArrayList<>();
        for (int i = 0; i < ctx.paramWithDefault().size(); i++) pwd.add(visitParamWithDefault(ctx.paramWithDefault(i)));
        StarEtc se = ctx.starEtc() != null ? (StarEtc)visit(ctx.starEtc()) : null;
        return new RegularParameters("RegularParameters", line(ctx), pnd, pwd, se);
    }

    @Override
    public Parameters visitParametersWithDefaults(PythonParser.ParametersWithDefaultsContext ctx) {
        List<ParamWithDefault> pwd = new ArrayList<>();
        for (int i = 0; i < ctx.paramWithDefault().size(); i++) pwd.add(visitParamWithDefault(ctx.paramWithDefault(i)));
        StarEtc se = ctx.starEtc() != null ? (StarEtc)visit(ctx.starEtc()) : null;
        return new ParametersWithDefaults("ParametersWithDefaults", line(ctx), pwd, se);
    }

    @Override
    public Parameters visitStarParameters(PythonParser.StarParametersContext ctx) {
        return new StarParameters("StarParameters", line(ctx), (StarEtc)visit(ctx.starEtc()));
    }

    @Override
    public SlashNoDefault visitSlashNoDefault(PythonParser.SlashNoDefaultContext ctx) {
        List<ParamNoDefault> pnd = new ArrayList<>();
        for (int i = 0; i < ctx.paramNoDefault().size(); i++) pnd.add(visitParamNoDefault(ctx.paramNoDefault(i)));
        String slash = ctx.SLASH().getText();
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        return new SlashNoDefault("SlashNoDefault", line(ctx), pnd, slash, comma);
    }

    @Override
    public SlashWithDefault visitSlashWithDefault(PythonParser.SlashWithDefaultContext ctx) {
        List<ParamNoDefault> pnd = new ArrayList<>();
        for (int i = 0; i < ctx.paramNoDefault().size(); i++) pnd.add(visitParamNoDefault(ctx.paramNoDefault(i)));
        List<ParamWithDefault> pwd = new ArrayList<>();
        for (int i = 0; i < ctx.paramWithDefault().size(); i++) pwd.add(visitParamWithDefault(ctx.paramWithDefault(i)));
        String slash = ctx.SLASH().getText();
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        return new SlashWithDefault("SlashWithDefault", line(ctx), pnd, pwd, slash, comma);
    }

    @Override
    public StarEtc visitStarParam(PythonParser.StarParamContext ctx) {
        String star = ctx.STAR().getText();
        ParamNoDefault pnd = visitParamNoDefault(ctx.paramNoDefault());
        List<ParamMaybeDefault> pmd = new ArrayList<>();
        for (int i = 0; i < ctx.paramMaybeDefault().size(); i++) pmd.add(visitParamMaybeDefault(ctx.paramMaybeDefault(i)));
        Kwds kwds = ctx.kwds() != null ? visitKwds(ctx.kwds()) : null;
        return new StarParam("StarParam", line(ctx), star, pnd, pmd, kwds);
    }

    @Override
    public StarEtc visitStarParamWithAnnotation(PythonParser.StarParamWithAnnotationContext ctx) {
        String star = ctx.STAR().getText();
        ParamNoDefaultStarAnnotation pndsa = visitParamNoDefaultStarAnnotation(ctx.paramNoDefaultStarAnnotation());
        List<ParamMaybeDefault> pmd = new ArrayList<>();
        for (int i = 0; i < ctx.paramMaybeDefault().size(); i++) pmd.add(visitParamMaybeDefault(ctx.paramMaybeDefault(i)));
        Kwds kwds = ctx.kwds() != null ? visitKwds(ctx.kwds()) : null;
        return new StarParamWithAnnotation("StarParamWithAnnotation", line(ctx), star, pndsa, pmd, kwds);
    }

    @Override
    public StarEtc visitBareStarParam(PythonParser.BareStarParamContext ctx) {
        String star = ctx.STAR().getText();
        String comma = ctx.COMMA().getText();
        List<ParamMaybeDefault> pmd = new ArrayList<>();
        for (int i = 0; i < ctx.paramMaybeDefault().size(); i++) pmd.add(visitParamMaybeDefault(ctx.paramMaybeDefault(i)));
        Kwds kwds = ctx.kwds() != null ? visitKwds(ctx.kwds()) : null;
        return new BareStarParam("BareStarParam", line(ctx), star, comma, pmd, kwds);
    }

    @Override
    public StarEtc visitKeywordOnlyParams(PythonParser.KeywordOnlyParamsContext ctx) {
        return new KeywordOnlyParams("KeywordOnlyParams", line(ctx), visitKwds(ctx.kwds()));
    }

    @Override
    public Kwds visitKwds(PythonParser.KwdsContext ctx) {
        return new Kwds("Kwds", line(ctx), ctx.DOUBLESTAR().getText(),
                visitParamNoDefault(ctx.paramNoDefault()));
    }

    @Override
    public ParamNoDefault visitParamNoDefault(PythonParser.ParamNoDefaultContext ctx) {
        Param p = visitParam(ctx.param());
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        return new ParamNoDefault("ParamNoDefault", line(ctx), p, comma, tc);
    }

    @Override
    public ParamNoDefaultStarAnnotation visitParamNoDefaultStarAnnotation(PythonParser.ParamNoDefaultStarAnnotationContext ctx) {
        ParamStarAnnotation psa = visitParamStarAnnotation(ctx.paramStarAnnotation());
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        return new ParamNoDefaultStarAnnotation("ParamNoDefaultStarAnnotation", line(ctx), psa, comma, tc);
    }

    @Override
    public ParamWithDefault visitParamWithDefault(PythonParser.ParamWithDefaultContext ctx) {
        Param p = visitParam(ctx.param());
        DefaultAssignment da = visitDefaultAssignment(ctx.defaultAssignment());
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        return new ParamWithDefault("ParamWithDefault", line(ctx), p, da, comma, tc);
    }

    @Override
    public ParamMaybeDefault visitParamMaybeDefault(PythonParser.ParamMaybeDefaultContext ctx) {
        Param p = visitParam(ctx.param());
        DefaultAssignment da = ctx.defaultAssignment() != null ? visitDefaultAssignment(ctx.defaultAssignment()) : null;
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        return new ParamMaybeDefault("ParamMaybeDefault", line(ctx), p, da, comma, tc);
    }

    @Override
    public Param visitParam(PythonParser.ParamContext ctx) {
        Name n = (Name)visit(ctx.name());
        Annotation a = ctx.annotation() != null ? visitAnnotation(ctx.annotation()) : null;
        return new Param("Param", line(ctx), n, a);
    }

    @Override
    public ParamStarAnnotation visitParamStarAnnotation(PythonParser.ParamStarAnnotationContext ctx) {
        return new ParamStarAnnotation("ParamStarAnnotation", line(ctx),
                (Name)visit(ctx.name()), visitStarAnnotation(ctx.starAnnotation()));
    }

    @Override
    public Annotation visitAnnotation(PythonParser.AnnotationContext ctx) {
        return new Annotation("Annotation", line(ctx), ctx.COLON().getText(),
                (Expression)visit(ctx.expression()));
    }

    @Override
    public StarAnnotation visitStarAnnotation(PythonParser.StarAnnotationContext ctx) {
        return new StarAnnotation("StarAnnotation", line(ctx), ctx.COLON().getText(),
                (StarExpression)visit(ctx.starExpression()));
    }

    @Override
    public DefaultAssignment visitDefaultAssignment(PythonParser.DefaultAssignmentContext ctx) {
        return new DefaultAssignment("DefaultAssignment", line(ctx), ctx.EQUAL().getText(),
                (Expression)visit(ctx.expression()));
    }

    // =====================================================================
    // IF / WHILE / FOR / WITH / TRY / MATCH
    // =====================================================================

    @Override
    public IfStmt visitIfStmt(PythonParser.IfStmtContext ctx) {
        String i = ctx.IF().getText();
        NamedExpression ne = (NamedExpression)visit(ctx.namedExpression());
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        ElifStmt elif = ctx.elifStmt() != null ? visitElifStmt(ctx.elifStmt()) : null;
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        return new IfStmt("IfStmt", line(ctx), i, ne, colon, block, elif, elseB);
    }

    @Override
    public ElifStmt visitElifStmt(PythonParser.ElifStmtContext ctx) {
        String elif = ctx.ELIF().getText();
        NamedExpression ne = (NamedExpression)visit(ctx.namedExpression());
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        ElifStmt nested = ctx.elifStmt() != null ? visitElifStmt(ctx.elifStmt()) : null;
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        return new ElifStmt("ElifStmt", line(ctx), elif, ne, colon, block, nested, elseB);
    }

    @Override
    public ElseBlock visitElseBlock(PythonParser.ElseBlockContext ctx) {
        return new ElseBlock("ElseBlock", line(ctx), ctx.ELSE().getText(),
                ctx.COLON().getText(), (Block)visit(ctx.block()));
    }

    @Override
    public WhileStmt visitWhileStmt(PythonParser.WhileStmtContext ctx) {
        String w = ctx.WHILE().getText();
        NamedExpression ne = (NamedExpression)visit(ctx.namedExpression());
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        return new WhileStmt("WhileStmt", line(ctx), w, ne, colon, block, elseB);
    }

    @Override
    public ForStmt visitForStmt(PythonParser.ForStmtContext ctx) {
        String async = ctx.ASYNC() != null ? ctx.ASYNC().getText() : null;
        String f = ctx.FOR().getText();
        StarTargets st = visitStarTargets(ctx.starTargets());
        String in = ctx.IN().getText();
        StarExpressions se = visitStarExpressions(ctx.starExpressions());
        String colon = ctx.COLON().getText();
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        Block block = (Block)visit(ctx.block());
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        return new ForStmt("ForStmt", line(ctx), async, f, st, in, se, colon, tc, block, elseB);
    }

    @Override
    public WithStmt visitParenthesizedWithItems(PythonParser.ParenthesizedWithItemsContext ctx) {
        String w = ctx.WITH().getText();
        String lpar = ctx.LPAR().getText();
        List<WithItem> items = new ArrayList<>();
        for (int i = 0; i < ctx.withItem().size(); i++) items.add(visitWithItem(ctx.withItem(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        String rpar = ctx.RPAR().getText();
        String colon = ctx.COLON().getText();
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        Block block = (Block) visit(ctx.block());
        return new ParenthesizedWithItems("ParenthesizedWithItems", line(ctx),
                w, lpar, items, commas, rpar, colon, tc, block);
    }

    @Override
    public WithStmt visitAsyncParenthesizedWithItems(PythonParser.AsyncParenthesizedWithItemsContext ctx) {
        String async = ctx.ASYNC().getText();
        String w = ctx.WITH().getText();
        String lpar = ctx.LPAR().getText();
        List<WithItem> items = new ArrayList<>();
        for (int i = 0; i < ctx.withItem().size(); i++) items.add(visitWithItem(ctx.withItem(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        String rpar = ctx.RPAR().getText();
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        return new AsyncParenthesizedWithItems("AsyncParenthesizedWithItems", line(ctx),
                async, w, lpar, items, commas, rpar, colon, block);
    }

    @Override
    public WithStmt visitRegularWithItems(PythonParser.RegularWithItemsContext ctx) {
        String async = ctx.ASYNC() != null ? ctx.ASYNC().getText() : null;
        String w = ctx.WITH().getText();
        List<WithItem> items = new ArrayList<>();
        for (int i = 0; i < ctx.withItem().size(); i++) items.add(visitWithItem(ctx.withItem(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        String colon = ctx.COLON().getText();
        String tc = ctx.TYPE_COMMENT() != null ? ctx.TYPE_COMMENT().getText() : null;
        Block block = (Block)visit(ctx.block());
        return new RegularWithItems("RegularWithItems", line(ctx),
                async, w, items, commas, colon, tc, block);
    }

    @Override
    public WithItem visitWithItem(PythonParser.WithItemContext ctx) {
        Expression expr = (Expression)visit(ctx.expression());
        String as = ctx.AS() != null ? ctx.AS().getText() : null;
        StarTarget st = ctx.starTarget() != null ? (StarTarget)visit(ctx.starTarget()) : null;
        return new WithItem("WithItem", line(ctx), expr, as, st);
    }

    @Override
    public TryStmt visitTryFinally(PythonParser.TryFinallyContext ctx) {
        String t = ctx.TRY().getText();
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        FinallyBlock fb = visitFinallyBlock(ctx.finallyBlock());
        return new TryFinally("TryFinally", line(ctx), t, colon, block, fb);
    }

    @Override
    public TryStmt visitTryExcept(PythonParser.TryExceptContext ctx) {
        String t = ctx.TRY().getText();
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        List<ExceptBlock> ebs = new ArrayList<>();
        for (int i = 0; i < ctx.exceptBlock().size(); i++) ebs.add(visitExceptBlock(ctx.exceptBlock(i)));
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        FinallyBlock fb = ctx.finallyBlock() != null ? visitFinallyBlock(ctx.finallyBlock()) : null;
        return new TryExcept("TryExcept", line(ctx), t, colon, block, ebs, elseB, fb);
    }

    @Override
    public TryStmt visitTryExceptStar(PythonParser.TryExceptStarContext ctx) {
        String t = ctx.TRY().getText();
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        List<ExceptStarBlock> esbs = new ArrayList<>();
        for (int i = 0; i < ctx.exceptStarBlock().size(); i++) esbs.add(visitExceptStarBlock(ctx.exceptStarBlock(i)));
        ElseBlock elseB = ctx.elseBlock() != null ? visitElseBlock(ctx.elseBlock()) : null;
        FinallyBlock fb = ctx.finallyBlock() != null ? visitFinallyBlock(ctx.finallyBlock()) : null;
        return new TryExceptStar("TryExceptStar", line(ctx), t, colon, block, esbs, elseB, fb);
    }

    @Override
    public ExceptBlock visitExceptBlock(PythonParser.ExceptBlockContext ctx) {
        String exc = ctx.EXCEPT().getText();
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        String as = ctx.AS() != null ? ctx.AS().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        Expressions exprs = ctx.expressions() != null ? visitExpressions(ctx.expressions()) : null;
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        return new ExceptBlock("ExceptBlock", line(ctx),
                exc, expr, as, name, exprs, colon, block);
    }

    @Override
    public ExceptStarBlock visitExceptStarBlock(PythonParser.ExceptStarBlockContext ctx) {
        String exc = ctx.EXCEPT().getText();
        String star = ctx.STAR().getText();
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        String as = ctx.AS() != null ? ctx.AS().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        Expressions exprs = ctx.expressions() != null ? visitExpressions(ctx.expressions()) : null;
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        return new ExceptStarBlock("ExceptStarBlock", line(ctx),
                exc, star, expr, as, name, exprs, colon, block);
    }

    @Override
    public FinallyBlock visitFinallyBlock(PythonParser.FinallyBlockContext ctx) {
        return new FinallyBlock("FinallyBlock", line(ctx), ctx.FINALLY().getText(),
                ctx.COLON().getText(), (Block)visit(ctx.block()));
    }

    @Override
    public MatchStmt visitMatchStmt(PythonParser.MatchStmtContext ctx) {
        String nm = ctx.NAME_OR_MATCH().getText();
        SubjectExpr se = (SubjectExpr)visit(ctx.subjectExpr());
        String colon = ctx.COLON().getText();
        String nl = ctx.NEWLINE().getText();
        String ind = ctx.INDENT().getText();
        List<CaseBlock> cbs = new ArrayList<>();
        for (int i = 0; i < ctx.caseBlock().size(); i++) cbs.add(visitCaseBlock(ctx.caseBlock(i)));
        String ded = ctx.DEDENT().getText();
        return new MatchStmt("MatchStmt", line(ctx), nm, se, colon, nl, ind, cbs, ded);
    }

    @Override
    public SubjectExpr visitSubjectExprMultiple(PythonParser.SubjectExprMultipleContext ctx) {
        StarNamedExpression sne = (StarNamedExpression)visit(ctx.starNamedExpression());
        String comma = ctx.COMMA().getText();
        StarNamedExpressions snes = ctx.starNamedExpressions() != null
                ? visitStarNamedExpressions(ctx.starNamedExpressions()) : null;
        return new SubjectExprMultiple("SubjectExprMultiple", line(ctx), sne, comma, snes);
    }

    @Override
    public SubjectExpr visitSubjectExprSingle(PythonParser.SubjectExprSingleContext ctx) {
        return new SubjectExprSingle("SubjectExprSingle", line(ctx),
                (NamedExpression)visit(ctx.namedExpression()));
    }

    @Override
    public CaseBlock visitCaseBlock(PythonParser.CaseBlockContext ctx) {
        String nc = ctx.NAME_OR_CASE().getText();
        Patterns p = (Patterns)visit(ctx.patterns());
        Guard g = ctx.guard() != null ? visitGuard(ctx.guard()) : null;
        String colon = ctx.COLON().getText();
        Block block = (Block)visit(ctx.block());
        return new CaseBlock("CaseBlock", line(ctx), nc, p, g, colon, block);
    }

    @Override
    public Guard visitGuard(PythonParser.GuardContext ctx) {
        return new Guard("Guard", line(ctx), ctx.IF().getText(),
                (NamedExpression)visit(ctx.namedExpression()));
    }

    // =====================================================================
    // PATTERNS
    // =====================================================================

    @Override
    public Patterns visitPatternsSequence(PythonParser.PatternsSequenceContext ctx) {
        return new PatternsSequence("PatternsSequence", line(ctx),
                visitOpenSequencePattern(ctx.openSequencePattern()));
    }

    @Override
    public Patterns visitPatternsSingle(PythonParser.PatternsSingleContext ctx) {
        return new PatternsSingle("PatternsSingle", line(ctx), (Pattern)visit(ctx.pattern()));
    }

    @Override
    public Pattern visitAsPatternMatch(PythonParser.AsPatternMatchContext ctx) {
        return new AsPatternMatch("AsPatternMatch", line(ctx), visitAsPattern(ctx.asPattern()));
    }

    @Override
    public Pattern visitOrPatternAlternatives(PythonParser.OrPatternAlternativesContext ctx) {
        return new OrPatternAlternatives("OrPatternAlternatives", line(ctx), visitOrPattern(ctx.orPattern()));
    }

    @Override
    public AsPattern visitAsPattern(PythonParser.AsPatternContext ctx) {
        return new AsPattern("AsPattern", line(ctx),
                visitOrPattern(ctx.orPattern()),
                ctx.AS().getText(),
                visitPatternCaptureTarget(ctx.patternCaptureTarget()));
    }

    @Override
    public OrPattern visitOrPattern(PythonParser.OrPatternContext ctx) {
        List<ClosedPattern> cps = new ArrayList<>();
        for (int i = 0; i < ctx.closedPattern().size(); i++) cps.add((ClosedPattern)visit(ctx.closedPattern(i)));
        List<String> vb = new ArrayList<>();
        for (int i = 0; i < ctx.VBAR().size(); i++) vb.add(ctx.VBAR(i).getText());
        return new OrPattern("OrPattern", line(ctx), cps, vb);
    }

    @Override
    public ClosedPattern visitLiteralClosedPattern(PythonParser.LiteralClosedPatternContext ctx) {
        return new LiteralClosedPattern("LiteralClosedPattern", line(ctx), (LiteralPattern)visit(ctx.literalPattern()));
    }
    @Override
    public ClosedPattern visitCaptureClosedPattern(PythonParser.CaptureClosedPatternContext ctx) {
        return new CaptureClosedPattern("CaptureClosedPattern", line(ctx), visitCapturePattern(ctx.capturePattern()));
    }
    @Override
    public ClosedPattern visitWildcardClosedPattern(PythonParser.WildcardClosedPatternContext ctx) {
        return new WildcardClosedPattern("WildcardClosedPattern", line(ctx), visitWildcardPattern(ctx.wildcardPattern()));
    }
    @Override
    public ClosedPattern visitValueClosedPattern(PythonParser.ValueClosedPatternContext ctx) {
        return new ValueClosedPattern("ValueClosedPattern", line(ctx), visitValuePattern(ctx.valuePattern()));
    }
    @Override
    public ClosedPattern visitGroupClosedPattern(PythonParser.GroupClosedPatternContext ctx) {
        return new GroupClosedPattern("GroupClosedPattern", line(ctx), visitGroupPattern(ctx.groupPattern()));
    }
    @Override
    public ClosedPattern visitSequenceClosedPattern(PythonParser.SequenceClosedPatternContext ctx) {
        return new SequenceClosedPattern("SequenceClosedPattern", line(ctx), (SequencePattern)visit(ctx.sequencePattern()));
    }
    @Override
    public ClosedPattern visitMappingClosedPattern(PythonParser.MappingClosedPatternContext ctx) {
        return new MappingClosedPattern("MappingClosedPattern", line(ctx), (MappingPattern)visit(ctx.mappingPattern()));
    }
    @Override
    public ClosedPattern visitClassClosedPattern(PythonParser.ClassClosedPatternContext ctx) {
        return new ClassClosedPattern("ClassClosedPattern", line(ctx), visitClassPattern(ctx.classPattern()));
    }

    @Override
    public LiteralPattern visitSignedNumberLiteralPattern(PythonParser.SignedNumberLiteralPatternContext ctx) {
        return new SignedNumberLiteralPattern("SignedNumberLiteralPattern", line(ctx), visitSignedNumber(ctx.signedNumber()));
    }
    @Override
    public LiteralPattern visitComplexNumberLiteralPattern(PythonParser.ComplexNumberLiteralPatternContext ctx) {
        return new ComplexNumberLiteralPattern("ComplexNumberLiteralPattern", line(ctx), visitComplexNumber(ctx.complexNumber()));
    }
    @Override
    public LiteralPattern visitStringLiteralPattern(PythonParser.StringLiteralPatternContext ctx) {
        return new StringLiteralPattern("StringLiteralPattern", line(ctx), (Strings)visit(ctx.strings()));
    }
    @Override
    public LiteralPattern visitNoneLiteralPattern(PythonParser.NoneLiteralPatternContext ctx) {
        return new NoneLiteralPattern("NoneLiteralPattern", line(ctx), ctx.NONE().getText());
    }
    @Override
    public LiteralPattern visitTrueLiteralPattern(PythonParser.TrueLiteralPatternContext ctx) {
        return new TrueLiteralPattern("TrueLiteralPattern", line(ctx), ctx.TRUE().getText());
    }
    @Override
    public LiteralPattern visitFalseLiteralPattern(PythonParser.FalseLiteralPatternContext ctx) {
        return new FalseLiteralPattern("FalseLiteralPattern", line(ctx), ctx.FALSE().getText());
    }

    @Override
    public LiteralExpr visitSignedNumberLiteralExpr(PythonParser.SignedNumberLiteralExprContext ctx) {
        return new SignedNumberLiteralExpr("SignedNumberLiteralExpr", line(ctx), visitSignedNumber(ctx.signedNumber()));
    }
    @Override
    public LiteralExpr visitComplexNumberLiteralExpr(PythonParser.ComplexNumberLiteralExprContext ctx) {
        return new ComplexNumberLiteralExpr("ComplexNumberLiteralExpr", line(ctx), visitComplexNumber(ctx.complexNumber()));
    }
    @Override
    public LiteralExpr visitStringLiteralExpr(PythonParser.StringLiteralExprContext ctx) {
        return new StringLiteralExpr("StringLiteralExpr", line(ctx),(Strings) visit(ctx.strings()));
    }
    @Override
    public LiteralExpr visitNoneLiteralExpr(PythonParser.NoneLiteralExprContext ctx) {
        return new NoneLiteralExpr("NoneLiteralExpr", line(ctx), ctx.NONE().getText());
    }
    @Override
    public LiteralExpr visitTrueLiteralExpr(PythonParser.TrueLiteralExprContext ctx) {
        return new TrueLiteralExpr("TrueLiteralExpr", line(ctx), ctx.TRUE().getText());
    }
    @Override
    public LiteralExpr visitFalseLiteralExpr(PythonParser.FalseLiteralExprContext ctx) {
        return new FalseLiteralExpr("FalseLiteralExpr", line(ctx), ctx.FALSE().getText());
    }

    @Override
    public ComplexNumber visitComplexNumber(PythonParser.ComplexNumberContext ctx) {
        SignedRealNumber srn = visitSignedRealNumber(ctx.signedRealNumber());
        String plus = ctx.PLUS() != null ? ctx.PLUS().getText() : null;
        String minus = ctx.MINUS() != null ? ctx.MINUS().getText() : null;
        ImaginaryNumber im = visitImaginaryNumber(ctx.imaginaryNumber());
        return new ComplexNumber("ComplexNumber", line(ctx), srn, plus, minus, im);
    }

    @Override
    public SignedNumber visitSignedNumber(PythonParser.SignedNumberContext ctx) {
        String minus = ctx.MINUS() != null ? ctx.MINUS().getText() : null;
        return new SignedNumber("SignedNumber", line(ctx), minus, ctx.NUMBER().getText());
    }

    @Override
    public SignedRealNumber visitSignedRealNumber(PythonParser.SignedRealNumberContext ctx) {
        String minus = ctx.MINUS() != null ? ctx.MINUS().getText() : null;
        return new SignedRealNumber("SignedRealNumber", line(ctx), minus, visitRealNumber(ctx.realNumber()));
    }

    @Override
    public RealNumber visitRealNumber(PythonParser.RealNumberContext ctx) {
        return new RealNumber("RealNumber", line(ctx), ctx.NUMBER().getText());
    }

    @Override
    public ImaginaryNumber visitImaginaryNumber(PythonParser.ImaginaryNumberContext ctx) {
        return new ImaginaryNumber("ImaginaryNumber", line(ctx), ctx.NUMBER().getText());
    }

    @Override
    public CapturePattern visitCapturePattern(PythonParser.CapturePatternContext ctx) {
        return new CapturePattern("CapturePattern", line(ctx),
                visitPatternCaptureTarget(ctx.patternCaptureTarget()));
    }

    @Override
    public PatternCaptureTarget visitPatternCaptureTarget(PythonParser.PatternCaptureTargetContext ctx) {
        return new PatternCaptureTarget("PatternCaptureTarget", line(ctx),
                (NameExceptUnderscore)visit(ctx.nameExceptUnderscore()));
    }

    @Override
    public WildcardPattern visitWildcardPattern(PythonParser.WildcardPatternContext ctx) {
        return new WildcardPattern("WildcardPattern", line(ctx), ctx.NAME_OR_WILDCARD().getText());
    }

    @Override
    public ValuePattern visitValuePattern(PythonParser.ValuePatternContext ctx) {
        return new ValuePattern("ValuePattern", line(ctx), visitAttr(ctx.attr()));
    }

    @Override
    public Attr visitAttr(PythonParser.AttrContext ctx) {
        List<Name> names = new ArrayList<>();
        for (int i = 0; i < ctx.name().size(); i++) names.add((Name)visit(ctx.name(i)));
        List<String> dots = new ArrayList<>();
        for (int i = 0; i < ctx.DOT().size(); i++) dots.add(ctx.DOT(i).getText());
        return new Attr("Attr", line(ctx), names, dots);
    }

    @Override
    public NameOrAttr visitNameOrAttr(PythonParser.NameOrAttrContext ctx) {
        List<Name> names = new ArrayList<>();
        for (int i = 0; i < ctx.name().size(); i++) names.add((Name)visit(ctx.name(i)));
        List<String> dots = new ArrayList<>();
        for (int i = 0; i < ctx.DOT().size(); i++) dots.add(ctx.DOT(i).getText());
        return new NameOrAttr("NameOrAttr", line(ctx), names, dots);
    }

    @Override
    public GroupPattern visitGroupPattern(PythonParser.GroupPatternContext ctx) {
        return new GroupPattern("GroupPattern", line(ctx),
                ctx.LPAR().getText(), (Pattern)visit(ctx.pattern()), ctx.RPAR().getText());
    }

    @Override
    public SequencePattern visitListSequencePattern(PythonParser.ListSequencePatternContext ctx) {
        String lsqb = ctx.LSQB().getText();
        MaybeSequencePattern msp = ctx.maybeSequencePattern() != null
                ? visitMaybeSequencePattern(ctx.maybeSequencePattern()) : null;
        String rsqb = ctx.RSQB().getText();
        return new ListSequencePattern("ListSequencePattern", line(ctx), lsqb, msp, rsqb);
    }

    @Override
    public SequencePattern visitTupleSequencePattern(PythonParser.TupleSequencePatternContext ctx) {
        String lpar = ctx.LPAR().getText();
        OpenSequencePattern osp = ctx.openSequencePattern() != null
                ? visitOpenSequencePattern(ctx.openSequencePattern()) : null;
        String rpar = ctx.RPAR().getText();
        return new TupleSequencePattern("TupleSequencePattern", line(ctx), lpar, osp, rpar);
    }

    @Override
    public OpenSequencePattern visitOpenSequencePattern(PythonParser.OpenSequencePatternContext ctx) {
        MaybeStarPattern msp = (MaybeStarPattern)visit(ctx.maybeStarPattern());
        String comma = ctx.COMMA().getText();
        MaybeSequencePattern mseq = ctx.maybeSequencePattern() != null
                ? visitMaybeSequencePattern(ctx.maybeSequencePattern()) : null;
        return new OpenSequencePattern("OpenSequencePattern", line(ctx), msp, comma, mseq);
    }

    @Override
    public MaybeSequencePattern visitMaybeSequencePattern(PythonParser.MaybeSequencePatternContext ctx) {
        List<MaybeStarPattern> msps = new ArrayList<>();
        for (int i = 0; i < ctx.maybeStarPattern().size(); i++) msps.add((MaybeStarPattern)visit(ctx.maybeStarPattern(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new MaybeSequencePattern("MaybeSequencePattern", line(ctx), msps, commas);
    }

    @Override
    public MaybeStarPattern visitStarMaybePattern(PythonParser.StarMaybePatternContext ctx) {
        return new StarMaybePattern("StarMaybePattern", line(ctx), visitStarPattern(ctx.starPattern()));
    }

    @Override
    public MaybeStarPattern visitRegularMaybePattern(PythonParser.RegularMaybePatternContext ctx) {
        return new RegularMaybePattern("RegularMaybePattern", line(ctx), (Pattern) visit(ctx.pattern()));
    }

    @Override
    public StarPattern visitStarPattern(PythonParser.StarPatternContext ctx) {
        return new StarPattern("StarPattern", line(ctx), ctx.STAR().getText(), (Name)visit(ctx.name()));
    }

    @Override
    public MappingPattern visitEmptyMappingPattern(PythonParser.EmptyMappingPatternContext ctx) {
        return new EmptyMappingPattern("EmptyMappingPattern", line(ctx),
                ctx.LBRACE().getText(), ctx.RBRACE().getText());
    }

    @Override
    public MappingPattern visitDoubleStarMappingPattern(PythonParser.DoubleStarMappingPatternContext ctx) {
        String lb = ctx.LBRACE().getText();
        DoubleStarPattern dsp = visitDoubleStarPattern(ctx.doubleStarPattern());
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String rb = ctx.RBRACE().getText();
        return new DoubleStarMappingPattern("DoubleStarMappingPattern", line(ctx), lb, dsp, comma, rb);
    }

    @Override
    public MappingPattern visitItemsMappingPattern(PythonParser.ItemsMappingPatternContext ctx) {
        String lb = ctx.LBRACE().getText();
        ItemsPattern ip = visitItemsPattern(ctx.itemsPattern());
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        DoubleStarPattern dsp = ctx.doubleStarPattern() != null ? visitDoubleStarPattern(ctx.doubleStarPattern()) : null;
        String rb = ctx.RBRACE().getText();
        return new ItemsMappingPattern("ItemsMappingPattern", line(ctx), lb, ip, commas, dsp, rb);
    }

    @Override
    public ItemsPattern visitItemsPattern(PythonParser.ItemsPatternContext ctx) {
        List<KeyValuePattern> kvps = new ArrayList<>();
        for (int i = 0; i < ctx.keyValuePattern().size(); i++) kvps.add(visitKeyValuePattern(ctx.keyValuePattern(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new ItemsPattern("ItemsPattern", line(ctx), kvps, commas);
    }

    @Override
    public KeyValuePattern visitKeyValuePattern(PythonParser.KeyValuePatternContext ctx) {
        LiteralExpr le = ctx.literalExpr() != null ? (LiteralExpr)visit(ctx.literalExpr()) : null;
        Attr a = ctx.attr() != null ? visitAttr(ctx.attr()) : null;
        String colon = ctx.COLON().getText();
        Pattern p = (Pattern)visit(ctx.pattern());
        return new KeyValuePattern("KeyValuePattern", line(ctx), le, a, colon, p);
    }

    @Override
    public DoubleStarPattern visitDoubleStarPattern(PythonParser.DoubleStarPatternContext ctx) {
        return new DoubleStarPattern("DoubleStarPattern", line(ctx),
                ctx.DOUBLESTAR().getText(),
                visitPatternCaptureTarget(ctx.patternCaptureTarget()));
    }

    @Override
    public ClassPattern visitClassPattern(PythonParser.ClassPatternContext ctx) {
        NameOrAttr noa = visitNameOrAttr(ctx.nameOrAttr());
        String lpar = ctx.LPAR().getText();
        PositionalPatterns pp = ctx.positionalPatterns() != null ? visitPositionalPatterns(ctx.positionalPatterns()) : null;
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        KeywordPatterns kps = null;
        if (ctx.keywordPatterns() != null) {
            kps = visitKeywordPatterns(ctx.keywordPatterns());
        }
        String rpar = ctx.RPAR().getText();
        return new ClassPattern("ClassPattern", line(ctx), noa, lpar, pp, commas, kps, rpar);
    }

    @Override
    public PositionalPatterns visitPositionalPatterns(PythonParser.PositionalPatternsContext ctx) {
        List<Pattern> ps = new ArrayList<>();
        for (int i = 0; i < ctx.pattern().size(); i++) ps.add((Pattern)visit(ctx.pattern(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new PositionalPatterns("PositionalPatterns", line(ctx), ps, commas);
    }

    @Override
    public KeywordPatterns visitKeywordPatterns(PythonParser.KeywordPatternsContext ctx) {
        List<KeywordPattern> kps = new ArrayList<>();
        for (int i = 0; i < ctx.keywordPattern().size(); i++) kps.add(visitKeywordPattern(ctx.keywordPattern(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new KeywordPatterns("KeywordPatterns", line(ctx), kps, commas);
    }

    @Override
    public KeywordPattern visitKeywordPattern(PythonParser.KeywordPatternContext ctx) {
        return new KeywordPattern("KeywordPattern", line(ctx),
                (Name)visit(ctx.name()), ctx.EQUAL().getText(), (Pattern)visit(ctx.pattern()));
    }

    // =====================================================================
    // TYPE STATEMENT
    // =====================================================================

    @Override
    public TypeAlias visitTypeAlias(PythonParser.TypeAliasContext ctx) {
        String nm = ctx.NAME_OR_TYPE().getText();
        Name name = (Name)visit(ctx.name());
        TypeParams tp = ctx.typeParams() != null ? visitTypeParams(ctx.typeParams()) : null;
        String eq = ctx.EQUAL().getText();
        Expression expr = (Expression)visit(ctx.expression());
        return new TypeAlias("TypeAlias", line(ctx), nm, name, tp, eq, expr);
    }

    @Override
    public TypeParams visitTypeParams(PythonParser.TypeParamsContext ctx) {
        return new TypeParams("TypeParams", line(ctx),
                ctx.LSQB().getText(), visitTypeParamSeq(ctx.typeParamSeq()), ctx.RSQB().getText());
    }

    @Override
    public TypeParamSeq visitTypeParamSeq(PythonParser.TypeParamSeqContext ctx) {
        List<TypeParam> tps = new ArrayList<>();
        for (int i = 0; i < ctx.typeParam().size(); i++) tps.add((TypeParam)visit(ctx.typeParam(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new TypeParamSeq("TypeParamSeq", line(ctx), tps, commas);
    }

    @Override
    public TypeParam visitRegularTypeParam(PythonParser.RegularTypeParamContext ctx) {
        Name name = (Name)visit(ctx.name());
        TypeParamBound tpb = ctx.typeParamBound() != null ? visitTypeParamBound(ctx.typeParamBound()) : null;
        TypeParamDefault tpd = ctx.typeParamDefault() != null ? visitTypeParamDefault(ctx.typeParamDefault()) : null;
        return new RegularTypeParam("RegularTypeParam", line(ctx), name, tpb, tpd);
    }

    @Override
    public TypeParam visitStarTypeParam(PythonParser.StarTypeParamContext ctx) {
        Name name = (Name)visit(ctx.name());
        TypeParamStarredDefault tpsd = ctx.typeParamStarredDefault() != null
                ? visitTypeParamStarredDefault(ctx.typeParamStarredDefault()) : null;
        return new StarTypeParam("StarTypeParam", line(ctx), ctx.STAR().getText(), name, tpsd);
    }

    @Override
    public TypeParam visitDoubleStarTypeParam(PythonParser.DoubleStarTypeParamContext ctx) {
        Name name = (Name)visit(ctx.name());
        TypeParamDefault tpd = ctx.typeParamDefault() != null ? visitTypeParamDefault(ctx.typeParamDefault()) : null;
        return new DoubleStarTypeParam("DoubleStarTypeParam", line(ctx), ctx.DOUBLESTAR().getText(), name, tpd);
    }

    @Override
    public TypeParamBound visitTypeParamBound(PythonParser.TypeParamBoundContext ctx) {
        return new TypeParamBound("TypeParamBound", line(ctx), ctx.COLON().getText(), (Expression)visit(ctx.expression()));
    }

    @Override
    public TypeParamDefault visitTypeParamDefault(PythonParser.TypeParamDefaultContext ctx) {
        return new TypeParamDefault("TypeParamDefault", line(ctx), ctx.EQUAL().getText(), (Expression)visit(ctx.expression()));
    }

    @Override
    public TypeParamStarredDefault visitTypeParamStarredDefault(PythonParser.TypeParamStarredDefaultContext ctx) {
        return new TypeParamStarredDefault("TypeParamStarredDefault", line(ctx),
                ctx.EQUAL().getText(), (StarExpression)visit(ctx.starExpression()));
    }

    // =====================================================================
    // EXPRESSIONS
    // =====================================================================

    @Override
    public Expressions visitExpressions(PythonParser.ExpressionsContext ctx) {
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression)visit(ctx.expression(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new Expressions("Expressions", line(ctx), exprs, commas);
    }

    @Override
    public Expression visitConditionalExpression(PythonParser.ConditionalExpressionContext ctx) {
        List<Disjunction> ds = new ArrayList<>();
        for (int i = 0; i < ctx.disjunction().size(); i++) ds.add(visitDisjunction(ctx.disjunction(i)));
        String i = ctx.IF() != null ? ctx.IF().getText() : null;
        String e = ctx.ELSE() != null ? ctx.ELSE().getText() : null;
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        return new ConditionalExpression("ConditionalExpression", line(ctx), ds, i, e, expr);
    }

    @Override
    public Expression visitLambdaExpression(PythonParser.LambdaExpressionContext ctx) {
        return new LambdaExpression("LambdaExpression", line(ctx), visitLambdef(ctx.lambdef()));
    }

    @Override
    public YieldExpr visitYieldExpr(PythonParser.YieldExprContext ctx) {
        String y = ctx.YIELD().getText();
        String from = ctx.FROM() != null ? ctx.FROM().getText() : null;
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        StarExpressions se = ctx.starExpressions() != null ? visitStarExpressions(ctx.starExpressions()) : null;
        return new YieldExpr("YieldExpr", line(ctx), y, from, expr, se);
    }

    @Override
    public StarExpressions visitStarExpressions(PythonParser.StarExpressionsContext ctx) {
        List<StarExpression> ses = new ArrayList<>();
        for (int i = 0; i < ctx.starExpression().size(); i++) ses.add((StarExpression)visit(ctx.starExpression(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new StarExpressions("StarExpressions", line(ctx), ses, commas);
    }

    @Override
    public StarExpression visitStarBitwiseOr(PythonParser.StarBitwiseOrContext ctx) {
        return new StarBitwiseOr("StarBitwiseOr", line(ctx),
                ctx.STAR().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }

    @Override
    public StarExpression visitRegularStarExpression(PythonParser.RegularStarExpressionContext ctx) {
        return new RegularStarExpression("RegularStarExpression", line(ctx),
                (Expression)visit(ctx.expression()));
    }

    @Override
    public StarNamedExpressions visitStarNamedExpressions(PythonParser.StarNamedExpressionsContext ctx) {
        List<StarNamedExpression> snes = new ArrayList<>();
        for (int i = 0; i < ctx.starNamedExpression().size(); i++)
            snes.add((StarNamedExpression)visit(ctx.starNamedExpression(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new StarNamedExpressions("StarNamedExpressions", line(ctx), snes, commas);
    }

    @Override
    public StarNamedExpression visitStarNamedExpressionBitwiseOr(PythonParser.StarNamedExpressionBitwiseOrContext ctx) {
        return new StarNamedExpressionBitwiseOr("StarNamedExpressionBitwiseOr", line(ctx),
                ctx.STAR().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }

    @Override
    public StarNamedExpression visitRegularStarNamedExpression(PythonParser.RegularStarNamedExpressionContext ctx) {
        return new RegularStarNamedExpression("RegularStarNamedExpression", line(ctx),
                (NamedExpression)visit(ctx.namedExpression()));
    }

    @Override
    public AssignmentExpression visitAssignmentExpression(PythonParser.AssignmentExpressionContext ctx) {
        return new AssignmentExpression("AssignmentExpression", line(ctx),
                (Name)visit(ctx.name()), ctx.COLONEQUAL().getText(), (Expression)visit(ctx.expression()));
    }

    @Override
    public NamedExpression visitNamedAssignmentExpression(PythonParser.NamedAssignmentExpressionContext ctx) {
        return new NamedAssignmentExpression("NamedAssignmentExpression", line(ctx),
                visitAssignmentExpression(ctx.assignmentExpression()));
    }

    @Override
    public NamedExpression visitRegularNamedExpression(PythonParser.RegularNamedExpressionContext ctx) {
        return new RegularNamedExpression("RegularNamedExpression", line(ctx),
                (Expression)visit(ctx.expression()));
    }

    @Override
    public Disjunction visitDisjunction(PythonParser.DisjunctionContext ctx) {
        List<Conjunction> cs = new ArrayList<>();
        for (int i = 0; i < ctx.conjunction().size(); i++) cs.add(visitConjunction(ctx.conjunction(i)));
        List<String> ors = new ArrayList<>();
        for (int i = 0; i < ctx.OR().size(); i++) ors.add(ctx.OR(i).getText());
        return new Disjunction("Disjunction", line(ctx), cs, ors);
    }

    @Override
    public Conjunction visitConjunction(PythonParser.ConjunctionContext ctx) {
        List<Inversion> invs = new ArrayList<>();
        for (int i = 0; i < ctx.inversion().size(); i++) invs.add((Inversion)visit(ctx.inversion(i)));
        List<String> ands = new ArrayList<>();
        for (int i = 0; i < ctx.AND().size(); i++) ands.add(ctx.AND(i).getText());
        return new Conjunction("Conjunction", line(ctx), invs, ands);
    }

    @Override
    public Inversion visitNotInversion(PythonParser.NotInversionContext ctx) {
        return new NotInversion("NotInversion", line(ctx),
                ctx.NOT().getText(), (Inversion)visit(ctx.inversion()));
    }

    @Override
    public Inversion visitComparisonInversion(PythonParser.ComparisonInversionContext ctx) {
        return new ComparisonInversion("ComparisonInversion", line(ctx), visitComparison(ctx.comparison()));
    }

    @Override
    public Comparison visitComparison(PythonParser.ComparisonContext ctx) {
        BitwiseOr bo = (BitwiseOr)visit(ctx.bitwiseOr());
        List<CompareOpBitwiseOrPair> cops = new ArrayList<>();
        for (int i = 0; i < ctx.compareOpBitwiseOrPair().size(); i++)
            cops.add((CompareOpBitwiseOrPair)visit(ctx.compareOpBitwiseOrPair(i)));
        return new Comparison("Comparison", line(ctx), bo, cops);
    }

    @Override
    public CompareOpBitwiseOrPair visitEqComparison(PythonParser.EqComparisonContext ctx) {
        return new EqComparison("EqComparison", line(ctx), visitEqBitwiseOr(ctx.eqBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitNotEqComparison(PythonParser.NotEqComparisonContext ctx) {
        return new NotEqComparison("NotEqComparison", line(ctx), visitNoteqBitwiseOr(ctx.noteqBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitLessEqComparison(PythonParser.LessEqComparisonContext ctx) {
        return new LessEqComparison("LessEqComparison", line(ctx), visitLteBitwiseOr(ctx.lteBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitLessComparison(PythonParser.LessComparisonContext ctx) {
        return new LessComparison("LessComparison", line(ctx), visitLtBitwiseOr(ctx.ltBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitGreaterEqComparison(PythonParser.GreaterEqComparisonContext ctx) {
        return new GreaterEqComparison("GreaterEqComparison", line(ctx), visitGteBitwiseOr(ctx.gteBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitGreaterComparison(PythonParser.GreaterComparisonContext ctx) {
        return new GreaterComparison("GreaterComparison", line(ctx), visitGtBitwiseOr(ctx.gtBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitNotInComparison(PythonParser.NotInComparisonContext ctx) {
        return new NotInComparison("NotInComparison", line(ctx), visitNotinBitwiseOr(ctx.notinBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitInComparison(PythonParser.InComparisonContext ctx) {
        return new InComparison("InComparison", line(ctx), visitInBitwiseOr(ctx.inBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitIsNotComparison(PythonParser.IsNotComparisonContext ctx) {
        return new IsNotComparison("IsNotComparison", line(ctx), visitIsnotBitwiseOr(ctx.isnotBitwiseOr()));
    }
    @Override
    public CompareOpBitwiseOrPair visitIsComparison(PythonParser.IsComparisonContext ctx) {
        return new IsComparison("IsComparison", line(ctx), visitIsBitwiseOr(ctx.isBitwiseOr()));
    }

    @Override
    public EqBitwiseOr visitEqBitwiseOr(PythonParser.EqBitwiseOrContext ctx) {
        return new EqBitwiseOr("EqBitwiseOr", line(ctx), ctx.EQEQUAL().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public NoteqBitwiseOr visitNoteqBitwiseOr(PythonParser.NoteqBitwiseOrContext ctx) {
        return new NoteqBitwiseOr("NoteqBitwiseOr", line(ctx), ctx.NOTEQUAL().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public LteBitwiseOr visitLteBitwiseOr(PythonParser.LteBitwiseOrContext ctx) {
        return new LteBitwiseOr("LteBitwiseOr", line(ctx), ctx.LESSEQUAL().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public LtBitwiseOr visitLtBitwiseOr(PythonParser.LtBitwiseOrContext ctx) {
        return new LtBitwiseOr("LtBitwiseOr", line(ctx), ctx.LESS().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public GteBitwiseOr visitGteBitwiseOr(PythonParser.GteBitwiseOrContext ctx) {
        return new GteBitwiseOr("GteBitwiseOr", line(ctx), ctx.GREATEREQUAL().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public GtBitwiseOr visitGtBitwiseOr(PythonParser.GtBitwiseOrContext ctx) {
        return new GtBitwiseOr("GtBitwiseOr", line(ctx), ctx.GREATER().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public NotinBitwiseOr visitNotinBitwiseOr(PythonParser.NotinBitwiseOrContext ctx) {
        return new NotinBitwiseOr("NotinBitwiseOr", line(ctx), ctx.NOT().getText(), ctx.IN().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public InBitwiseOr visitInBitwiseOr(PythonParser.InBitwiseOrContext ctx) {
        return new InBitwiseOr("InBitwiseOr", line(ctx), ctx.IN().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public IsnotBitwiseOr visitIsnotBitwiseOr(PythonParser.IsnotBitwiseOrContext ctx) {
        return new IsnotBitwiseOr("IsnotBitwiseOr", line(ctx), ctx.IS().getText(), ctx.NOT().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public IsBitwiseOr visitIsBitwiseOr(PythonParser.IsBitwiseOrContext ctx) {
        return new IsBitwiseOr("IsBitwiseOr", line(ctx), ctx.IS().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }

    @Override
    public BitwiseOr visitBitwiseOrExpression(PythonParser.BitwiseOrExpressionContext ctx) {
        BitwiseOr bo = (BitwiseOr)visit(ctx.bitwiseOr());
        BitwiseXor bx = (BitwiseXor)visit(ctx.bitwiseXor());
        return new BitwiseOrExpression("BitwiseOrExpression", line(ctx), bo, ctx.VBAR().getText(), bx);
    }

    @Override
    public BitwiseOr visitBitwiseXorOperand(PythonParser.BitwiseXorOperandContext ctx) {
        return new BitwiseXorOperand("BitwiseXorOperand", line(ctx), (BitwiseXor)visit(ctx.bitwiseXor()));
    }

    @Override
    public BitwiseXor visitBitwiseXorExpression(PythonParser.BitwiseXorExpressionContext ctx) {
        BitwiseXor bx = (BitwiseXor)visit(ctx.bitwiseXor());
        BitwiseAnd ba = (BitwiseAnd)visit(ctx.bitwiseAnd());
        return new BitwiseXorExpression("BitwiseXorExpression", line(ctx), bx, ctx.CIRCUMFLEX().getText(), ba);
    }

    @Override
    public BitwiseXor visitBitwiseAndOperand(PythonParser.BitwiseAndOperandContext ctx) {
        return new BitwiseAndOperand("BitwiseAndOperand", line(ctx), (BitwiseAnd)visit(ctx.bitwiseAnd()));
    }

    @Override
    public BitwiseAnd visitBitwiseAndExpression(PythonParser.BitwiseAndExpressionContext ctx) {
        BitwiseAnd ba = (BitwiseAnd)visit(ctx.bitwiseAnd());
        ShiftExpr se = (ShiftExpr)visit(ctx.shiftExpr());
        return new BitwiseAndExpression("BitwiseAndExpression", line(ctx), ba, ctx.AMPER().getText(), se);
    }

    @Override
    public BitwiseAnd visitShiftExprOperand(PythonParser.ShiftExprOperandContext ctx) {
        return new ShiftExprOperand("ShiftExprOperand", line(ctx), (ShiftExpr)visit(ctx.shiftExpr()));
    }

    @Override
    public ShiftExpr visitShiftExpression(PythonParser.ShiftExpressionContext ctx) {
        ShiftExpr se = (ShiftExpr)visit(ctx.shiftExpr());
        String left = ctx.LEFTSHIFT() != null ? ctx.LEFTSHIFT().getText() : null;
        String right = ctx.RIGHTSHIFT() != null ? ctx.RIGHTSHIFT().getText() : null;
        Sum sum = (Sum)visit(ctx.sum());
        return new ShiftExpression("ShiftExpression", line(ctx), se, left, right, sum);
    }

    @Override
    public ShiftExpr visitSumOperand(PythonParser.SumOperandContext ctx) {
        return new SumOperand("SumOperand", line(ctx), (Sum)visit(ctx.sum()));
    }

    @Override
    public Sum visitAdditiveExpression(PythonParser.AdditiveExpressionContext ctx) {
        Sum sum = (Sum)visit(ctx.sum());
        String plus = ctx.PLUS() != null ? ctx.PLUS().getText() : null;
        String minus = ctx.MINUS() != null ? ctx.MINUS().getText() : null;
        Term term = (Term)visit(ctx.term());
        return new AdditiveExpression("AdditiveExpression", line(ctx), sum, plus, minus, term);
    }

    @Override
    public Sum visitTermOperand(PythonParser.TermOperandContext ctx) {
        return new TermOperand("TermOperand", line(ctx), (Term)visit(ctx.term()));
    }

    @Override
    public Term visitMultiplicativeExpression(PythonParser.MultiplicativeExpressionContext ctx) {
        Term term = (Term)visit(ctx.term());
        String star = ctx.STAR() != null ? ctx.STAR().getText() : null;
        String slash = ctx.SLASH() != null ? ctx.SLASH().getText() : null;
        String dslash = ctx.DOUBLESLASH() != null ? ctx.DOUBLESLASH().getText() : null;
        String pct = ctx.PERCENT() != null ? ctx.PERCENT().getText() : null;
        String at = ctx.AT() != null ? ctx.AT().getText() : null;
        Factor f = (Factor)visit(ctx.factor());
        return new MultiplicativeExpression("MultiplicativeExpression", line(ctx),
                term, star, slash, dslash, pct, at, f);
    }

    @Override
    public Term visitFactorOperand(PythonParser.FactorOperandContext ctx) {
        return new FactorOperand("FactorOperand", line(ctx), (Factor)visit(ctx.factor()));
    }

    @Override
    public Factor visitUnaryPlus(PythonParser.UnaryPlusContext ctx) {
        return new UnaryPlus("UnaryPlus", line(ctx), ctx.PLUS().getText(), (Factor)visit(ctx.factor()));
    }
    @Override
    public Factor visitUnaryMinus(PythonParser.UnaryMinusContext ctx) {
        return new UnaryMinus("UnaryMinus", line(ctx), ctx.MINUS().getText(), (Factor)visit(ctx.factor()));
    }
    @Override
    public Factor visitBitwiseNot(PythonParser.BitwiseNotContext ctx) {
        return new BitwiseNot("BitwiseNot", line(ctx), ctx.TILDE().getText(), (Factor)visit(ctx.factor()));
    }
    @Override
    public Factor visitPowerOperand(PythonParser.PowerOperandContext ctx) {
        return new PowerOperand("PowerOperand", line(ctx), visitPower(ctx.power()));
    }

    @Override
    public Power visitPower(PythonParser.PowerContext ctx) {
        AwaitPrimary ap = (AwaitPrimary)visit(ctx.awaitPrimary());
        String ds = ctx.DOUBLESTAR() != null ? ctx.DOUBLESTAR().getText() : null;
        Factor f = ctx.factor() != null ? (Factor)visit(ctx.factor()) : null;
        return new Power("Power", line(ctx), ap, ds, f);
    }

    @Override
    public AwaitPrimary visitAwaitExpression(PythonParser.AwaitExpressionContext ctx) {
        return new AwaitExpression("AwaitExpression", line(ctx),
                ctx.AWAIT().getText(), (Primary)visit(ctx.primary()));
    }
    @Override
    public AwaitPrimary visitPrimaryOperand(PythonParser.PrimaryOperandContext ctx) {
        return new PrimaryOperand("PrimaryOperand", line(ctx), (Primary)visit(ctx.primary()));
    }

    @Override
    public Primary visitPrimaryWithAccess(PythonParser.PrimaryWithAccessContext ctx) {
        Primary p = (Primary)visit(ctx.primary());
        String dot = ctx.DOT() != null ? ctx.DOT().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        Genexp gen = ctx.genexp() != null ? visitGenexp(ctx.genexp()) : null;
        String lpar = ctx.LPAR() != null ? ctx.LPAR().getText() : null;
        Arguments args = ctx.arguments() != null ? visitArguments(ctx.arguments()) : null;
        String rpar = ctx.RPAR() != null ? ctx.RPAR().getText() : null;
        String lsqb = ctx.LSQB() != null ? ctx.LSQB().getText() : null;
        Slices sl = ctx.slices() != null ? (Slices)visit(ctx.slices()) : null;
        String rsqb = ctx.RSQB() != null ? ctx.RSQB().getText() : null;
        return new PrimaryWithAccess("PrimaryWithAccess", line(ctx),
                p, dot, name, gen, lpar, args, rpar, lsqb, sl, rsqb);
    }

    @Override
    public Primary visitAtomOperand(PythonParser.AtomOperandContext ctx) {
        return new AtomOperand("AtomOperand", line(ctx), (Atom)visit(ctx.atom()));
    }

    @Override
    public Slices visitSingleSlice(PythonParser.SingleSliceContext ctx) {
        return new SingleSlice("SingleSlice", line(ctx), (Slice)visit(ctx.slice()));
    }

    @Override
    public Slices visitMultipleSlices(PythonParser.MultipleSlicesContext ctx) {
        List<Slice> ss = new ArrayList<>();
        for (int i = 0; i < ctx.slice().size(); i++) ss.add((Slice)visit(ctx.slice(i)));
        List<StarredExpression> ses = new ArrayList<>();
        for (int i = 0; i < ctx.starredExpression().size(); i++) ses.add(visitStarredExpression(ctx.starredExpression(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new MultipleSlices("MultipleSlices", line(ctx), ss, ses, commas);
    }

    @Override
    public Slice visitSliceRange(PythonParser.SliceRangeContext ctx) {
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression)visit(ctx.expression(i)));
        List<String> colons = new ArrayList<>();
        for (int i = 0; i < ctx.COLON().size(); i++) colons.add(ctx.COLON(i).getText());
        return new SliceRange("SliceRange", line(ctx), exprs, colons);
    }

    @Override
    public Slice visitSliceExpression(PythonParser.SliceExpressionContext ctx) {
        return new SliceExpression("SliceExpression", line(ctx), (NamedExpression)visit(ctx.namedExpression()));
    }

    @Override
    public Atom visitNameAtom(PythonParser.NameAtomContext ctx) {
        return new NameAtom("NameAtom", line(ctx), (Name)visit(ctx.name()));
    }
    @Override
    public Atom visitTrueAtom(PythonParser.TrueAtomContext ctx) {
        return new TrueAtom("TrueAtom", line(ctx), ctx.TRUE().getText());
    }
    @Override
    public Atom visitFalseAtom(PythonParser.FalseAtomContext ctx) {
        return new FalseAtom("FalseAtom", line(ctx), ctx.FALSE().getText());
    }
    @Override
    public Atom visitNoneAtom(PythonParser.NoneAtomContext ctx) {
        return new NoneAtom("NoneAtom", line(ctx), ctx.NONE().getText());
    }
    @Override
    public Atom visitStringAtom(PythonParser.StringAtomContext ctx) {
        return new StringAtom("StringAtom", line(ctx), (Strings)visit(ctx.strings()));
    }
    @Override
    public Atom visitNumberAtom(PythonParser.NumberAtomContext ctx) {
        return new NumberAtom("NumberAtom", line(ctx), ctx.NUMBER().getText());
    }
    @Override
    public Atom visitTupleGroupGenexpAtom(PythonParser.TupleGroupGenexpAtomContext ctx) {
        Tuple t = ctx.tuple() != null ? visitTuple(ctx.tuple()) : null;
        Group g = ctx.group() != null ? visitGroup(ctx.group()) : null;
        Genexp gen = ctx.genexp() != null ? visitGenexp(ctx.genexp()) : null;
        return new TupleGroupGenexpAtom("TupleGroupGenexpAtom", line(ctx), t, g, gen);
    }
    @Override
    public Atom visitListAtom(PythonParser.ListAtomContext ctx) {
        ListLiteral ll = ctx.listLiteral() != null ? visitListLiteral(ctx.listLiteral()) : null;
        Listcomp lc = ctx.listcomp() != null ? visitListcomp(ctx.listcomp()) : null;
        return new ListAtom("ListAtom", line(ctx), ll, lc);
    }
    @Override
    public Atom visitDictSetAtom(PythonParser.DictSetAtomContext ctx) {
        Dict d = ctx.dict() != null ? visitDict(ctx.dict()) : null;
        Set s = ctx.set() != null ? visitSet(ctx.set()) : null;
        Dictcomp dc = ctx.dictcomp() != null ? visitDictcomp(ctx.dictcomp()) : null;
        Setcomp sc = ctx.setcomp() != null ? visitSetcomp(ctx.setcomp()) : null;
        return new DictSetAtom("DictSetAtom", line(ctx), d, s, dc, sc);
    }
    @Override
    public Atom visitEllipsisAtom(PythonParser.EllipsisAtomContext ctx) {
        return new EllipsisAtom("EllipsisAtom", line(ctx), ctx.ELLIPSIS().getText());
    }

    @Override
    public Group visitGroup(PythonParser.GroupContext ctx) {
        String lpar = ctx.LPAR().getText();
        YieldExpr ye = ctx.yieldExpr() != null ? visitYieldExpr(ctx.yieldExpr()) : null;
        NamedExpression ne = ctx.namedExpression() != null ? (NamedExpression)visit(ctx.namedExpression()) : null;
        String rpar = ctx.RPAR().getText();
        return new Group("Group", line(ctx), lpar, ye, ne, rpar);
    }

    // =====================================================================
    // LAMBDA
    // =====================================================================

    @Override
    public Lambdef visitLambdef(PythonParser.LambdefContext ctx) {
        String l = ctx.LAMBDA().getText();
        LambdaParams lp = ctx.lambdaParams() != null ? visitLambdaParams(ctx.lambdaParams()) : null;
        String colon = ctx.COLON().getText();
        Expression expr = (Expression)visit(ctx.expression());
        return new Lambdef("Lambdef", line(ctx), l, lp, colon, expr);
    }

    @Override
    public LambdaParams visitLambdaParams(PythonParser.LambdaParamsContext ctx) {
        return new LambdaParams("LambdaParams", line(ctx), (LambdaParameters)visit(ctx.lambdaParameters()));
    }

    @Override
    public LambdaParameters visitPositionalOnlyLambdaParams(PythonParser.PositionalOnlyLambdaParamsContext ctx) {
        LambdaSlashNoDefault lsnd = visitLambdaSlashNoDefault(ctx.lambdaSlashNoDefault());
        List<LambdaParamNoDefault> lpnd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamNoDefault().size(); i++) lpnd.add(visitLambdaParamNoDefault(ctx.lambdaParamNoDefault(i)));
        List<LambdaParamWithDefault> lpwd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamWithDefault().size(); i++) lpwd.add(visitLambdaParamWithDefault(ctx.lambdaParamWithDefault(i)));
        LambdaStarEtc lse = ctx.lambdaStarEtc() != null ? (LambdaStarEtc)visit(ctx.lambdaStarEtc()) : null;
        return new PositionalOnlyLambdaParams("PositionalOnlyLambdaParams", line(ctx), lsnd, lpnd, lpwd, lse);
    }

    @Override
    public LambdaParameters visitPositionalOnlyWithDefaultsLambdaParams(PythonParser.PositionalOnlyWithDefaultsLambdaParamsContext ctx) {
        LambdaSlashWithDefault lswd = visitLambdaSlashWithDefault(ctx.lambdaSlashWithDefault());
        List<LambdaParamWithDefault> lpwd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamWithDefault().size(); i++) lpwd.add(visitLambdaParamWithDefault(ctx.lambdaParamWithDefault(i)));
        LambdaStarEtc lse = ctx.lambdaStarEtc() != null ? (LambdaStarEtc)visit(ctx.lambdaStarEtc()) : null;
        return new PositionalOnlyWithDefaultsLambdaParams("PositionalOnlyWithDefaultsLambdaParams", line(ctx), lswd, lpwd, lse);
    }

    @Override
    public LambdaParameters visitRegularLambdaParams(PythonParser.RegularLambdaParamsContext ctx) {
        List<LambdaParamNoDefault> lpnd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamNoDefault().size(); i++) lpnd.add(visitLambdaParamNoDefault(ctx.lambdaParamNoDefault(i)));
        List<LambdaParamWithDefault> lpwd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamWithDefault().size(); i++) lpwd.add(visitLambdaParamWithDefault(ctx.lambdaParamWithDefault(i)));
        LambdaStarEtc lse = ctx.lambdaStarEtc() != null ? (LambdaStarEtc)visit(ctx.lambdaStarEtc()) : null;
        return new RegularLambdaParams("RegularLambdaParams", line(ctx), lpnd, lpwd, lse);
    }

    @Override
    public LambdaParameters visitLambdaParamsWithDefaults(PythonParser.LambdaParamsWithDefaultsContext ctx) {
        List<LambdaParamWithDefault> lpwd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamWithDefault().size(); i++) lpwd.add(visitLambdaParamWithDefault(ctx.lambdaParamWithDefault(i)));
        LambdaStarEtc lse = ctx.lambdaStarEtc() != null ? (LambdaStarEtc)visit(ctx.lambdaStarEtc()) : null;
        return new LambdaParamsWithDefaults("LambdaParamsWithDefaults", line(ctx), lpwd, lse);
    }

    @Override
    public LambdaParameters visitStarLambdaParams(PythonParser.StarLambdaParamsContext ctx) {
        return new StarLambdaParams("StarLambdaParams", line(ctx), (LambdaStarEtc)visit(ctx.lambdaStarEtc()));
    }

    @Override
    public LambdaSlashNoDefault visitLambdaSlashNoDefault(PythonParser.LambdaSlashNoDefaultContext ctx) {
        List<LambdaParamNoDefault> lpnd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamNoDefault().size(); i++) lpnd.add(visitLambdaParamNoDefault(ctx.lambdaParamNoDefault(i)));
        String slash = ctx.SLASH().getText();
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        return new LambdaSlashNoDefault("LambdaSlashNoDefault", line(ctx), lpnd, slash, comma);
    }

    @Override
    public LambdaSlashWithDefault visitLambdaSlashWithDefault(PythonParser.LambdaSlashWithDefaultContext ctx) {
        List<LambdaParamNoDefault> lpnd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamNoDefault().size(); i++) lpnd.add(visitLambdaParamNoDefault(ctx.lambdaParamNoDefault(i)));
        List<LambdaParamWithDefault> lpwd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamWithDefault().size(); i++) lpwd.add(visitLambdaParamWithDefault(ctx.lambdaParamWithDefault(i)));
        String slash = ctx.SLASH().getText();
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        return new LambdaSlashWithDefault("LambdaSlashWithDefault", line(ctx), lpnd, lpwd, slash, comma);
    }

    @Override
    public LambdaStarEtc visitStarLambdaParam(PythonParser.StarLambdaParamContext ctx) {
        String star = ctx.STAR().getText();
        LambdaParamNoDefault lpnd = visitLambdaParamNoDefault(ctx.lambdaParamNoDefault());
        List<LambdaParamMaybeDefault> lpmd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamMaybeDefault().size(); i++) lpmd.add(visitLambdaParamMaybeDefault(ctx.lambdaParamMaybeDefault(i)));
        LambdaKwds lk = ctx.lambdaKwds() != null ? visitLambdaKwds(ctx.lambdaKwds()) : null;
        return new StarLambdaParam("StarLambdaParam", line(ctx), star, lpnd, lpmd, lk);
    }

    @Override
    public LambdaStarEtc visitBareStarLambdaParam(PythonParser.BareStarLambdaParamContext ctx) {
        String star = ctx.STAR().getText();
        String comma = ctx.COMMA().getText();
        List<LambdaParamMaybeDefault> lpmd = new ArrayList<>();
        for (int i = 0; i < ctx.lambdaParamMaybeDefault().size(); i++) lpmd.add(visitLambdaParamMaybeDefault(ctx.lambdaParamMaybeDefault(i)));
        LambdaKwds lk = ctx.lambdaKwds() != null ? visitLambdaKwds(ctx.lambdaKwds()) : null;
        return new BareStarLambdaParam("BareStarLambdaParam", line(ctx), star, comma, lpmd, lk);
    }

    @Override
    public LambdaStarEtc visitLambdaKeywordParams(PythonParser.LambdaKeywordParamsContext ctx) {
        return new LambdaKeywordParams("LambdaKeywordParams", line(ctx), visitLambdaKwds(ctx.lambdaKwds()));
    }

    @Override
    public LambdaKwds visitLambdaKwds(PythonParser.LambdaKwdsContext ctx) {
        return new LambdaKwds("LambdaKwds", line(ctx),
                ctx.DOUBLESTAR().getText(), visitLambdaParamNoDefault(ctx.lambdaParamNoDefault()));
    }

    @Override
    public LambdaParamNoDefault visitLambdaParamNoDefault(PythonParser.LambdaParamNoDefaultContext ctx) {
        return new LambdaParamNoDefault("LambdaParamNoDefault", line(ctx),
                visitLambdaParam(ctx.lambdaParam()),
                ctx.COMMA() != null ? ctx.COMMA().getText() : null);
    }

    @Override
    public LambdaParamWithDefault visitLambdaParamWithDefault(PythonParser.LambdaParamWithDefaultContext ctx) {
        return new LambdaParamWithDefault("LambdaParamWithDefault", line(ctx),
                visitLambdaParam(ctx.lambdaParam()),
                visitDefaultAssignment(ctx.defaultAssignment()),
                ctx.COMMA() != null ? ctx.COMMA().getText() : null);
    }

    @Override
    public LambdaParamMaybeDefault visitLambdaParamMaybeDefault(PythonParser.LambdaParamMaybeDefaultContext ctx) {
        return new LambdaParamMaybeDefault("LambdaParamMaybeDefault", line(ctx),
                visitLambdaParam(ctx.lambdaParam()),
                ctx.defaultAssignment() != null ? visitDefaultAssignment(ctx.defaultAssignment()) : null,
                ctx.COMMA() != null ? ctx.COMMA().getText() : null);
    }

    @Override
    public LambdaParam visitLambdaParam(PythonParser.LambdaParamContext ctx) {
        return new LambdaParam("LambdaParam", line(ctx), (Name)visit(ctx.name()));
    }

    // =====================================================================
    // F-STRING / T-STRING
    // =====================================================================

    @Override
    public FstringMiddle visitFStringReplacementFieldMiddle(PythonParser.FStringReplacementFieldMiddleContext ctx) {
        return new FStringReplacementFieldMiddle("FStringReplacementFieldMiddle", line(ctx),
                visitFstringReplacementField(ctx.fstringReplacementField()));
    }
    @Override
    public FstringMiddle visitFStringMiddleText(PythonParser.FStringMiddleTextContext ctx) {
        return new FStringMiddleText("FStringMiddleText", line(ctx), ctx.FSTRING_MIDDLE().getText());
    }

    @Override
    public FstringReplacementField visitFstringReplacementField(PythonParser.FstringReplacementFieldContext ctx) {
        String lb = ctx.LBRACE().getText();
        AnnotatedRhs ar = (AnnotatedRhs)visit(ctx.annotatedRhs());
        String eq = ctx.EQUAL() != null ? ctx.EQUAL().getText() : null;
        FstringConversion fc = ctx.fstringConversion() != null ? visitFstringConversion(ctx.fstringConversion()) : null;
        FstringFullFormatSpec fffs = ctx.fstringFullFormatSpec() != null
                ? visitFstringFullFormatSpec(ctx.fstringFullFormatSpec()) : null;
        String rb = ctx.RBRACE().getText();
        return new FstringReplacementField("FstringReplacementField", line(ctx),
                lb, ar, eq, fc, fffs, rb);
    }

    @Override
    public FstringConversion visitFstringConversion(PythonParser.FstringConversionContext ctx) {
        return new FstringConversion("FstringConversion", line(ctx),
                ctx.EXCLAMATION().getText(), (Name)visit(ctx.name()));
    }

    @Override
    public FstringFullFormatSpec visitFstringFullFormatSpec(PythonParser.FstringFullFormatSpecContext ctx) {
        List<FstringFormatSpec> ffs = new ArrayList<>();
        for (int i = 0; i < ctx.fstringFormatSpec().size(); i++) ffs.add((FstringFormatSpec)visit(ctx.fstringFormatSpec(i)));
        return new FstringFullFormatSpec("FstringFullFormatSpec", line(ctx), ctx.COLON().getText(), ffs);
    }

    @Override
    public FstringFormatSpec visitFStringFormatSpecText(PythonParser.FStringFormatSpecTextContext ctx) {
        return new FStringFormatSpecText("FStringFormatSpecText", line(ctx), ctx.FSTRING_MIDDLE().getText());
    }
    @Override
    public FstringFormatSpec visitFStringFormatSpecReplacementField(PythonParser.FStringFormatSpecReplacementFieldContext ctx) {
        return new FStringFormatSpecReplacementField("FStringFormatSpecReplacementField", line(ctx),
                visitFstringReplacementField(ctx.fstringReplacementField()));
    }

    @Override
    public Fstring visitFstring(PythonParser.FstringContext ctx) {
        String start = ctx.FSTRING_START().getText();
        List<FstringMiddle> middles = new ArrayList<>();
        for (int i = 0; i < ctx.fstringMiddle().size(); i++) middles.add((FstringMiddle)visit(ctx.fstringMiddle(i)));
        String end = ctx.FSTRING_END().getText();
        return new Fstring("Fstring", line(ctx), start, middles, end);
    }

    @Override
    public TstringFormatSpec visitTStringFormatSpecText(PythonParser.TStringFormatSpecTextContext ctx) {
        return new TStringFormatSpecText("TStringFormatSpecText", line(ctx), ctx.TSTRING_MIDDLE().getText());
    }
    @Override
    public TstringFormatSpec visitTStringFormatSpecReplacementField(PythonParser.TStringFormatSpecReplacementFieldContext ctx) {
        return new TStringFormatSpecReplacementField("TStringFormatSpecReplacementField", line(ctx),
                visitTstringReplacementField(ctx.tstringReplacementField()));
    }

    @Override
    public TstringFullFormatSpec visitTstringFullFormatSpec(PythonParser.TstringFullFormatSpecContext ctx) {
        List<TstringFormatSpec> tfs = new ArrayList<>();
        for (int i = 0; i < ctx.tstringFormatSpec().size(); i++) tfs.add((TstringFormatSpec)visit(ctx.tstringFormatSpec(i)));
        return new TstringFullFormatSpec("TstringFullFormatSpec", line(ctx), ctx.COLON().getText(), tfs);
    }

    @Override
    public TstringReplacementField visitTstringReplacementField(PythonParser.TstringReplacementFieldContext ctx) {
        String lb = ctx.LBRACE().getText();
        AnnotatedRhs ar = (AnnotatedRhs)visit(ctx.annotatedRhs());
        String eq = ctx.EQUAL() != null ? ctx.EQUAL().getText() : null;
        FstringConversion fc = ctx.fstringConversion() != null ? visitFstringConversion(ctx.fstringConversion()) : null;
        TstringFullFormatSpec tffs = ctx.tstringFullFormatSpec() != null
                ? visitTstringFullFormatSpec(ctx.tstringFullFormatSpec()) : null;
        String rb = ctx.RBRACE().getText();
        return new TstringReplacementField("TstringReplacementField", line(ctx),
                lb, ar, eq, fc, tffs, rb);
    }

    @Override
    public TstringMiddle visitTStringReplacementFieldMiddle(PythonParser.TStringReplacementFieldMiddleContext ctx) {
        return new TStringReplacementFieldMiddle("TStringReplacementFieldMiddle", line(ctx),
                visitTstringReplacementField(ctx.tstringReplacementField()));
    }
    @Override
    public TstringMiddle visitTStringMiddleText(PythonParser.TStringMiddleTextContext ctx) {
        return new TStringMiddleText("TStringMiddleText", line(ctx), ctx.TSTRING_MIDDLE().getText());
    }

    @Override
    public Tstring visitTstring(PythonParser.TstringContext ctx) {
        String start = ctx.TSTRING_START().getText();
        List<TstringMiddle> middles = new ArrayList<>();
        for (int i = 0; i < ctx.tstringMiddle().size(); i++) middles.add((TstringMiddle)visit(ctx.tstringMiddle(i)));
        String end = ctx.TSTRING_END().getText();
        return new Tstring("Tstring", line(ctx), start, middles, end);
    }

    @Override
    public String visitString(PythonParser.StringContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public Strings visitFStringStrings(PythonParser.FStringStringsContext ctx) {
        List<Fstring> fs = new ArrayList<>();
        for (int i = 0; i < ctx.fstring().size(); i++) fs.add(visitFstring(ctx.fstring(i)));
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < ctx.string().size(); i++) ss.add(visitString(ctx.string(i)));
        return new FStringStrings("FStringStrings", line(ctx), fs, ss);
    }

    @Override
    public Strings visitTStringStrings(PythonParser.TStringStringsContext ctx) {
        List<Tstring> ts = new ArrayList<>();
        for (int i = 0; i < ctx.tstring().size(); i++) ts.add(visitTstring(ctx.tstring(i)));
        return new TStringStrings("TStringStrings", line(ctx), ts);
    }

    // =====================================================================
    // LIST / TUPLE / SET / DICT
    // =====================================================================

    @Override
    public ListLiteral visitListLiteral(PythonParser.ListLiteralContext ctx) {
        String lsqb = ctx.LSQB().getText();
        StarNamedExpressions sne = ctx.starNamedExpressions() != null
                ? visitStarNamedExpressions(ctx.starNamedExpressions()) : null;
        String rsqb = ctx.RSQB().getText();
        return new ListLiteral("ListLiteral", line(ctx), lsqb, sne, rsqb);
    }

    @Override
    public Tuple visitTuple(PythonParser.TupleContext ctx) {
        String lpar = ctx.LPAR().getText();
        StarNamedExpression sne = ctx.starNamedExpression() != null ? (StarNamedExpression)visit(ctx.starNamedExpression()) : null;
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        StarNamedExpressions snes = ctx.starNamedExpressions() != null ? visitStarNamedExpressions(ctx.starNamedExpressions()) : null;
        String rpar = ctx.RPAR().getText();
        return new Tuple("Tuple", line(ctx), lpar, sne, comma, snes, rpar);
    }

    @Override
    public Set visitSet(PythonParser.SetContext ctx) {
        return new Set("Set", line(ctx),
                ctx.LBRACE().getText(),
                visitStarNamedExpressions(ctx.starNamedExpressions()),
                ctx.RBRACE().getText());
    }

    @Override
    public Dict visitDict(PythonParser.DictContext ctx) {
        String lb = ctx.LBRACE().getText();
        DoubleStarredKvpairs dsk = ctx.doubleStarredKvpairs() != null
                ? visitDoubleStarredKvpairs(ctx.doubleStarredKvpairs()) : null;
        String rb = ctx.RBRACE().getText();
        return new Dict("Dict", line(ctx), lb, dsk, rb);
    }

    @Override
    public DoubleStarredKvpairs visitDoubleStarredKvpairs(PythonParser.DoubleStarredKvpairsContext ctx) {
        List<DoubleStarredKvpair> dsk = new ArrayList<>();
        for (int i = 0; i < ctx.doubleStarredKvpair().size(); i++) dsk.add((DoubleStarredKvpair)visit(ctx.doubleStarredKvpair(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new DoubleStarredKvpairs("DoubleStarredKvpairs", line(ctx), dsk, commas);
    }

    @Override
    public DoubleStarredKvpair visitDoubleStarredKeyValue(PythonParser.DoubleStarredKeyValueContext ctx) {
        return new DoubleStarredKeyValue("DoubleStarredKeyValue", line(ctx),
                ctx.DOUBLESTAR().getText(), (BitwiseOr)visit(ctx.bitwiseOr()));
    }
    @Override
    public DoubleStarredKvpair visitRegularKvpair(PythonParser.RegularKvpairContext ctx) {
        return new RegularKvpair("RegularKvpair", line(ctx), visitKvpair(ctx.kvpair()));
    }

    @Override
    public Kvpair visitKvpair(PythonParser.KvpairContext ctx) {
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression)visit(ctx.expression(i)));
        return new Kvpair("Kvpair", line(ctx), exprs, ctx.COLON().getText());
    }

    // =====================================================================
    // COMPREHENSIONS
    // =====================================================================

    @Override
    public ForIfClauses visitForIfClauses(PythonParser.ForIfClausesContext ctx) {
        List<ForIfClause> fics = new ArrayList<>();
        for (int i = 0; i < ctx.forIfClause().size(); i++) fics.add(visitForIfClause(ctx.forIfClause(i)));
        return new ForIfClauses("ForIfClauses", line(ctx), fics);
    }

    @Override
    public ForIfClause visitForIfClause(PythonParser.ForIfClauseContext ctx) {
        String async = ctx.ASYNC() != null ? ctx.ASYNC().getText() : null;
        String f = ctx.FOR().getText();
        StarTargets st = visitStarTargets(ctx.starTargets());
        String in = ctx.IN().getText();
        List<Disjunction> ds = new ArrayList<>();
        for (int i = 0; i < ctx.disjunction().size(); i++) ds.add(visitDisjunction(ctx.disjunction(i)));
        List<String> ifs = new ArrayList<>();
        for (int i = 0; i < ctx.IF().size(); i++) ifs.add(ctx.IF(i).getText());
        return new ForIfClause("ForIfClause", line(ctx), async, f, st, in, ds, ifs);
    }

    @Override
    public Listcomp visitListcomp(PythonParser.ListcompContext ctx) {
        return new Listcomp("Listcomp", line(ctx),
                ctx.LSQB().getText(),
                (NamedExpression)visit(ctx.namedExpression()),
                visitForIfClauses(ctx.forIfClauses()),
                ctx.RSQB().getText());
    }

    @Override
    public Setcomp visitSetcomp(PythonParser.SetcompContext ctx) {
        return new Setcomp("Setcomp", line(ctx),
                ctx.LBRACE().getText(),
                (NamedExpression)visit(ctx.namedExpression()),
                visitForIfClauses(ctx.forIfClauses()),
                ctx.RBRACE().getText());
    }

    @Override
    public Genexp visitGenexp(PythonParser.GenexpContext ctx) {
        String lpar = ctx.LPAR().getText();
        AssignmentExpression ae = ctx.assignmentExpression() != null ? visitAssignmentExpression(ctx.assignmentExpression()) : null;
        Expression expr = ctx.expression() != null ? (Expression)visit(ctx.expression()) : null;
        ForIfClauses fic = visitForIfClauses(ctx.forIfClauses());
        String rpar = ctx.RPAR().getText();
        return new Genexp("Genexp", line(ctx), lpar, ae, expr, fic, rpar);
    }

    @Override
    public Dictcomp visitDictcomp(PythonParser.DictcompContext ctx) {
        return new Dictcomp("Dictcomp", line(ctx),
                ctx.LBRACE().getText(),
                visitKvpair(ctx.kvpair()),
                visitForIfClauses(ctx.forIfClauses()),
                ctx.RBRACE().getText());
    }

    // =====================================================================
    // CALL ARGUMENTS
    // =====================================================================

    @Override
    public Arguments visitArguments(PythonParser.ArgumentsContext ctx) {
        return new Arguments("Arguments", line(ctx),
                (Args)visit(ctx.args()),
                ctx.COMMA() != null ? ctx.COMMA().getText() : null);
    }

    @Override
    public Args visitPositionalArgsWithKwargs(PythonParser.PositionalArgsWithKwargsContext ctx) {
        List<StarredExpression> ses = new ArrayList<>();
        for (int i = 0; i < ctx.starredExpression().size(); i++) ses.add(visitStarredExpression(ctx.starredExpression(i)));
        List<AssignmentExpression> aes = new ArrayList<>();
        for (int i = 0; i < ctx.assignmentExpression().size(); i++) aes.add(visitAssignmentExpression(ctx.assignmentExpression(i)));
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression)visit(ctx.expression(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        Kwargs kw = ctx.kwargs() != null ? (Kwargs)visit(ctx.kwargs()) : null;
        return new PositionalArgsWithKwargs("PositionalArgsWithKwargs", line(ctx),
                ses, aes, exprs, commas, kw);
    }

    @Override
    public Args visitKeywordArgs(PythonParser.KeywordArgsContext ctx) {
        return new KeywordArgs("KeywordArgs", line(ctx), (Kwargs)visit(ctx.kwargs()));
    }

    @Override
    public Kwargs visitStarredKwargs(PythonParser.StarredKwargsContext ctx) {
        List<KwargOrStarred> kos = new ArrayList<>();
        for (int i = 0; i < ctx.kwargOrStarred().size(); i++) kos.add((KwargOrStarred)visit(ctx.kwargOrStarred(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        List<KwargOrDoubleStarred> kods = new ArrayList<>();
        for (int i = 0; i < ctx.kwargOrDoubleStarred().size(); i++) kods.add((KwargOrDoubleStarred)visit(ctx.kwargOrDoubleStarred(i)));
        return new StarredKwargs("StarredKwargs", line(ctx), kos, commas, kods);
    }

    @Override
    public Kwargs visitDoubleStarredKwargs(PythonParser.DoubleStarredKwargsContext ctx) {
        List<KwargOrDoubleStarred> kods = new ArrayList<>();
        for (int i = 0; i < ctx.kwargOrDoubleStarred().size(); i++) kods.add((KwargOrDoubleStarred)visit(ctx.kwargOrDoubleStarred(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new DoubleStarredKwargs("DoubleStarredKwargs", line(ctx), kods, commas);
    }

    @Override
    public StarredExpression visitStarredExpression(PythonParser.StarredExpressionContext ctx) {
        return new StarredExpression("StarredExpression", line(ctx),
                ctx.STAR().getText(), (Expression)visit(ctx.expression()));
    }

    @Override
    public KwargOrStarred visitNamedArg(PythonParser.NamedArgContext ctx) {
        return new NamedArg("NamedArg", line(ctx),
                (Name) visit(ctx.name()), ctx.EQUAL().getText(), (Expression)visit(ctx.expression()));
    }
    @Override
    public KwargOrStarred visitStarredArg(PythonParser.StarredArgContext ctx) {
        return new StarredArg("StarredArg", line(ctx), visitStarredExpression(ctx.starredExpression()));
    }

    @Override
    public KwargOrDoubleStarred visitNamedDoubleStarArg(PythonParser.NamedDoubleStarArgContext ctx) {
        return new NamedDoubleStarArg("NamedDoubleStarArg", line(ctx),
                (Name) visit(ctx.name()), ctx.EQUAL().getText(), (Expression)visit(ctx.expression()));
    }
    @Override
    public KwargOrDoubleStarred visitDoubleStarredArg(PythonParser.DoubleStarredArgContext ctx) {
        return new DoubleStarredArg("DoubleStarredArg", line(ctx),
                ctx.DOUBLESTAR().getText(), (Expression)visit(ctx.expression()));
    }

    // =====================================================================
    // ASSIGNMENT TARGETS
    // =====================================================================

    @Override
    public StarTargets visitStarTargets(PythonParser.StarTargetsContext ctx) {
        List<StarTarget> sts = new ArrayList<>();
        for (int i = 0; i < ctx.starTarget().size(); i++) sts.add((StarTarget)visit(ctx.starTarget(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new StarTargets("StarTargets", line(ctx), sts, commas);
    }

    @Override
    public StarTargetsListSeq visitStarTargetsListSeq(PythonParser.StarTargetsListSeqContext ctx) {
        List<StarTarget> sts = new ArrayList<>();
        for (int i = 0; i < ctx.starTarget().size(); i++) sts.add((StarTarget)visit(ctx.starTarget(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new StarTargetsListSeq("StarTargetsListSeq", line(ctx), sts, commas);
    }

    @Override
    public StarTargetsTupleSeq visitStarTargetsTupleSeq(PythonParser.StarTargetsTupleSeqContext ctx) {
        List<StarTarget> sts = new ArrayList<>();
        for (int i = 0; i < ctx.starTarget().size(); i++) sts.add((StarTarget)visit(ctx.starTarget(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new StarTargetsTupleSeq("StarTargetsTupleSeq", line(ctx), sts, commas);
    }

    @Override
    public StarTarget visitNestedStarTarget(PythonParser.NestedStarTargetContext ctx) {
        return new NestedStarTarget("NestedStarTarget", line(ctx),
                ctx.STAR().getText(), (StarTarget)visit(ctx.starTarget()));
    }
    @Override
    public StarTarget visitSimpleStarTarget(PythonParser.SimpleStarTargetContext ctx) {
        return new SimpleStarTarget("SimpleStarTarget", line(ctx),
                (TargetWithStarAtom)visit(ctx.targetWithStarAtom()));
    }

    @Override
    public TargetWithStarAtom visitAttributedStarTarget(PythonParser.AttributedStarTargetContext ctx) {
        TPrimary tp = (TPrimary)visit(ctx.tPrimary());
        String dot = ctx.DOT() != null ? ctx.DOT().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        String lsqb = ctx.LSQB() != null ? ctx.LSQB().getText() : null;
        Slices sl = ctx.slices() != null ? (Slices)visit(ctx.slices()) : null;
        String rsqb = ctx.RSQB() != null ? ctx.RSQB().getText() : null;
        return new AttributedStarTarget("AttributedStarTarget", line(ctx), tp, dot, name, lsqb, sl, rsqb);
    }
    @Override
    public TargetWithStarAtom visitAtomicStarTarget(PythonParser.AtomicStarTargetContext ctx) {
        return new AtomicStarTarget("AtomicStarTarget", line(ctx), (StarAtom)visit(ctx.starAtom()));
    }

    @Override
    public StarAtom visitNameStarAtom(PythonParser.NameStarAtomContext ctx) {
        return new NameStarAtom("NameStarAtom", line(ctx), (Name)visit(ctx.name()));
    }
    @Override
    public StarAtom visitParenthesizedStarAtom(PythonParser.ParenthesizedStarAtomContext ctx) {
        return new ParenthesizedStarAtom("ParenthesizedStarAtom", line(ctx),
                ctx.LPAR().getText(), (TargetWithStarAtom)visit(ctx.targetWithStarAtom()), ctx.RPAR().getText());
    }
    @Override
    public StarAtom visitTupleStarAtom(PythonParser.TupleStarAtomContext ctx) {
        String lpar = ctx.LPAR().getText();
        StarTargetsTupleSeq stts = ctx.starTargetsTupleSeq() != null ? visitStarTargetsTupleSeq(ctx.starTargetsTupleSeq()) : null;
        String rpar = ctx.RPAR().getText();
        return new TupleStarAtom("TupleStarAtom", line(ctx), lpar, stts, rpar);
    }
    @Override
    public StarAtom visitListStarAtom(PythonParser.ListStarAtomContext ctx) {
        String lsqb = ctx.LSQB().getText();
        StarTargetsListSeq stls = ctx.starTargetsListSeq() != null ? visitStarTargetsListSeq(ctx.starTargetsListSeq()) : null;
        String rsqb = ctx.RSQB().getText();
        return new ListStarAtom("ListStarAtom", line(ctx), lsqb, stls, rsqb);
    }

    @Override
    public SingleTarget visitSubscriptAttributeTarget(PythonParser.SubscriptAttributeTargetContext ctx) {
        return new SubscriptAttributeTarget("SubscriptAttributeTarget", line(ctx),
                visitSingleSubscriptAttributeTarget(ctx.singleSubscriptAttributeTarget()));
    }
    @Override
    public SingleTarget visitNameTarget(PythonParser.NameTargetContext ctx) {
        return new NameTarget("NameTarget", line(ctx), (Name)visit(ctx.name()));
    }
    @Override
    public SingleTarget visitParenthesizedTarget(PythonParser.ParenthesizedTargetContext ctx) {
        return new ParenthesizedTarget("ParenthesizedTarget", line(ctx),
                ctx.LPAR().getText(), (SingleTarget)visit(ctx.singleTarget()), ctx.RPAR().getText());
    }

    @Override
    public SingleSubscriptAttributeTarget visitSingleSubscriptAttributeTarget(PythonParser.SingleSubscriptAttributeTargetContext ctx) {
        TPrimary tp = (TPrimary)visit(ctx.tPrimary());
        String dot = ctx.DOT() != null ? ctx.DOT().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        String lsqb = ctx.LSQB() != null ? ctx.LSQB().getText() : null;
        Slices sl = ctx.slices() != null ? (Slices)visit(ctx.slices()) : null;
        String rsqb = ctx.RSQB() != null ? ctx.RSQB().getText() : null;
        return new SingleSubscriptAttributeTarget("SingleSubscriptAttributeTarget", line(ctx),
                tp, dot, name, lsqb, sl, rsqb);
    }

    @Override
    public TPrimary visitTPrimaryAtom(PythonParser.TPrimaryAtomContext ctx) {
        return new TPrimaryAtom("TPrimaryAtom", line(ctx), (Atom)visit(ctx.atom()));
    }

    @Override
    public TPrimary visitTPrimaryWithAccess(PythonParser.TPrimaryWithAccessContext ctx) {
        TPrimary tp = (TPrimary)visit(ctx.tPrimary());
        String dot = ctx.DOT() != null ? ctx.DOT().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        String lsqb = ctx.LSQB() != null ? ctx.LSQB().getText() : null;
        Slices sl = ctx.slices() != null ? (Slices)visit(ctx.slices()) : null;
        String rsqb = ctx.RSQB() != null ? ctx.RSQB().getText() : null;
        Genexp gen = ctx.genexp() != null ? visitGenexp(ctx.genexp()) : null;
        String lpar = ctx.LPAR() != null ? ctx.LPAR().getText() : null;
        Arguments args = ctx.arguments() != null ? visitArguments(ctx.arguments()) : null;
        String rpar = ctx.RPAR() != null ? ctx.RPAR().getText() : null;
        return new TPrimaryWithAccess("TPrimaryWithAccess", line(ctx),
                tp, dot, name, lsqb, sl, rsqb, gen, lpar, args, rpar);
    }

    // =====================================================================
    // DEL TARGETS
    // =====================================================================

    @Override
    public DelTargets visitDelTargets(PythonParser.DelTargetsContext ctx) {
        List<DelTarget> dts = new ArrayList<>();
        for (int i = 0; i < ctx.delTarget().size(); i++) dts.add((DelTarget)visit(ctx.delTarget(i)));
        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) commas.add(ctx.COMMA(i).getText());
        return new DelTargets("DelTargets", line(ctx), dts, commas);
    }

    @Override
    public DelTarget visitAttributedDelTarget(PythonParser.AttributedDelTargetContext ctx) {
        TPrimary tp = (TPrimary)visit(ctx.tPrimary());
        String dot = ctx.DOT() != null ? ctx.DOT().getText() : null;
        Name name = ctx.name() != null ? (Name)visit(ctx.name()) : null;
        String lsqb = ctx.LSQB() != null ? ctx.LSQB().getText() : null;
        Slices sl = ctx.slices() != null ? (Slices)visit(ctx.slices()) : null;
        String rsqb = ctx.RSQB() != null ? ctx.RSQB().getText() : null;
        return new AttributedDelTarget("AttributedDelTarget", line(ctx), tp, dot, name, lsqb, sl, rsqb);
    }
    @Override
    public DelTarget visitAtomicDelTarget(PythonParser.AtomicDelTargetContext ctx) {
        return new AtomicDelTarget("AtomicDelTarget", line(ctx), (DelTAtom)visit(ctx.delTAtom()));
    }

    @Override
    public DelTAtom visitNameDelAtom(PythonParser.NameDelAtomContext ctx) {
        return new NameDelAtom("NameDelAtom", line(ctx), (Name)visit(ctx.name()));
    }
    @Override
    public DelTAtom visitParenthesizedDelAtom(PythonParser.ParenthesizedDelAtomContext ctx) {
        return new ParenthesizedDelAtom("ParenthesizedDelAtom", line(ctx),
                ctx.LPAR().getText(),(DelTarget)visit(ctx.delTarget()), ctx.RPAR().getText());
    }
    @Override
    public DelTAtom visitTupleDelAtom(PythonParser.TupleDelAtomContext ctx) {
        String lpar = ctx.LPAR().getText();
        DelTargets dts = ctx.delTargets() != null ? visitDelTargets(ctx.delTargets()) : null;
        String rpar = ctx.RPAR().getText();
        return new TupleDelAtom("TupleDelAtom", line(ctx), lpar, dts, rpar);
    }
    @Override
    public DelTAtom visitListDelAtom(PythonParser.ListDelAtomContext ctx) {
        String lsqb = ctx.LSQB().getText();
        DelTargets dts = ctx.delTargets() != null ? visitDelTargets(ctx.delTargets()) : null;
        String rsqb = ctx.RSQB().getText();
        return new ListDelAtom("ListDelAtom", line(ctx), lsqb, dts, rsqb);
    }

    // =====================================================================
    // TYPING ELEMENTS
    // =====================================================================
    @Override
    public TypeExpressions visitTypeExpressionsWithStar(PythonParser.TypeExpressionsWithStarContext ctx) {
        // 1. Extract all expressions
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) {
            exprs.add((Expression) visit(ctx.expression(i)));
        }

        List<String> commas = new ArrayList<>();
        for (int i = 0; i < ctx.COMMA().size(); i++) {
            commas.add(ctx.COMMA(i).getText());
        }

        String star = ctx.STAR() != null ? ctx.STAR().getText() : null;

        String doubleStar = ctx.DOUBLESTAR() != null ? ctx.DOUBLESTAR().getText() : null;

        return new TypeExpressionsWithStar("TypeExpressionsWithStar", line(ctx), exprs, commas, star, doubleStar);
    }

    @Override
    public TypeExpressions visitStarTypeExpression(PythonParser.StarTypeExpressionContext ctx) {
        String star = ctx.STAR().getText();
        List<Expression> exprs = new ArrayList<>();
        for (int i = 0; i < ctx.expression().size(); i++) exprs.add((Expression)visit(ctx.expression(i)));
        String comma = ctx.COMMA() != null ? ctx.COMMA().getText() : null;
        String ds = ctx.DOUBLESTAR() != null ? ctx.DOUBLESTAR().getText() : null;
        return new StarTypeExpression("StarTypeExpression", line(ctx), star, exprs, comma, ds);
    }

    @Override
    public TypeExpressions visitDoubleStarTypeExpression(PythonParser.DoubleStarTypeExpressionContext ctx) {
        return new DoubleStarTypeExpression("DoubleStarTypeExpression", line(ctx),
                ctx.DOUBLESTAR().getText(), (Expression)visit(ctx.expression()));
    }

    @Override
    public FuncTypeComment visitNewlineFuncTypeComment(PythonParser.NewlineFuncTypeCommentContext ctx) {
        return new NewlineFuncTypeComment("NewlineFuncTypeComment", line(ctx),
                ctx.NEWLINE().getText(), ctx.TYPE_COMMENT().getText());
    }
    @Override
    public FuncTypeComment visitInlineFuncTypeComment(PythonParser.InlineFuncTypeCommentContext ctx) {
        return new InlineFuncTypeComment("InlineFuncTypeComment", line(ctx),
                ctx.TYPE_COMMENT().getText());
    }

    // =====================================================================
    // NAME
    // =====================================================================

    @Override
    public NameExceptUnderscore visitPlainName(PythonParser.PlainNameContext ctx) {
        return new PlainName("PlainName", line(ctx), ctx.NAME().getText());
    }
    @Override
    public NameExceptUnderscore visitTypeName(PythonParser.TypeNameContext ctx) {
        return new TypeName("TypeName", line(ctx), ctx.NAME_OR_TYPE().getText());
    }
    @Override
    public NameExceptUnderscore visitMatchName(PythonParser.MatchNameContext ctx) {
        return new MatchName("MatchName", line(ctx), ctx.NAME_OR_MATCH().getText());
    }
    @Override
    public NameExceptUnderscore visitCaseName(PythonParser.CaseNameContext ctx) {
        return new CaseName("CaseName", line(ctx), ctx.NAME_OR_CASE().getText());
    }

    @Override
    public Name visitNonWildcardName(PythonParser.NonWildcardNameContext ctx) {
        return new NonWildcardName("NonWildcardName", line(ctx),
                (NameExceptUnderscore)visit(ctx.nameExceptUnderscore()));
    }
    @Override
    public Name visitWildcardName(PythonParser.WildcardNameContext ctx) {
        return new WildcardName("WildcardName", line(ctx), ctx.NAME_OR_WILDCARD().getText());
    }
}