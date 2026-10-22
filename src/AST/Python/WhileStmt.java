package AST.Python;

public class WhileStmt {
    private final String nodeName;
    private final int lineNumber;
    private String WHILE;
    private NamedExpression namedExpression;
    private String COLON;
    private Block block;
    private ElseBlock elseBlock;

    public WhileStmt(String nodeName, int lineNumber, String WHILE, NamedExpression namedExpression, String COLON, Block block, ElseBlock elseBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.WHILE = WHILE;
        this.namedExpression = namedExpression;
        this.COLON = COLON;
        this.block = block;
        this.elseBlock = elseBlock;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getWHILE() { return WHILE; }
    public void setWHILE(String WHILE) { this.WHILE = WHILE; }
    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) { this.namedExpression = namedExpression; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }

    @Override
    public String toString() { return "WhileStmt"; }
}
