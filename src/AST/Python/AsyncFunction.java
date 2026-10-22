package AST.Python;

public class AsyncFunction extends FunctionDefRaw {
    private final String nodeName;
    private final int lineNumber;
    private String ASYNC;
    private String DEF;
    private Name name;
    private TypeParams typeParams;
    private String LPAR;
    private Params params;
    private String RPAR;
    private String RARROW;
    private Expression expression;
    private String COLON;
    private FuncTypeComment funcTypeComment;
    private Block block;

    public AsyncFunction(String nodeName, int lineNumber, String ASYNC, String DEF, Name name, TypeParams typeParams, String LPAR, Params params, String RPAR, String RARROW, Expression expression, String COLON, FuncTypeComment funcTypeComment, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASYNC = ASYNC;
        this.DEF = DEF;
        this.name = name;
        this.typeParams = typeParams;
        this.LPAR = LPAR;
        this.params = params;
        this.RPAR = RPAR;
        this.RARROW = RARROW;
        this.expression = expression;
        this.COLON = COLON;
        this.funcTypeComment = funcTypeComment;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getASYNC() { return ASYNC; }
    public void setASYNC(String ASYNC) { this.ASYNC = ASYNC; }
    public String getDEF() { return DEF; }
    public void setDEF(String DEF) { this.DEF = DEF; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParams getTypeParams() { return typeParams; }
    public void setTypeParams(TypeParams typeParams) { this.typeParams = typeParams; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public Params getParams() { return params; }
    public void setParams(Params params) { this.params = params; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }
    public String getRARROW() { return RARROW; }
    public void setRARROW(String RARROW) { this.RARROW = RARROW; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public FuncTypeComment getFuncTypeComment() { return funcTypeComment; }
    public void setFuncTypeComment(FuncTypeComment funcTypeComment) { this.funcTypeComment = funcTypeComment; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "AsyncFunction"; }
}
