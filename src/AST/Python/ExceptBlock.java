package AST.Python;

public class ExceptBlock {
    private final String nodeName;
    private final int lineNumber;
    private String EXCEPT;
    private Expression expression;
    private String AS;
    private Name name;
    private Expressions expressions;
    private String COLON;
    private Block block;

    public ExceptBlock(String nodeName, int lineNumber, String EXCEPT, Expression expression, String AS, Name name, Expressions expressions, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EXCEPT = EXCEPT;
        this.expression = expression;
        this.AS = AS;
        this.name = name;
        this.expressions = expressions;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getEXCEPT() { return EXCEPT; }
    public void setEXCEPT(String EXCEPT) { this.EXCEPT = EXCEPT; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public String getAS() { return AS; }
    public void setAS(String AS) { this.AS = AS; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public Expressions getExpressions() { return expressions; }
    public void setExpressions(Expressions expressions) { this.expressions = expressions; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "ExceptBlock"; }
}
