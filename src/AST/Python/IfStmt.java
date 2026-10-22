package AST.Python;

public class IfStmt {
    private final String nodeName;
    private final int lineNumber;
    private String IF;
    private NamedExpression namedExpression;
    private String COLON;
    private Block block;
    private ElifStmt elifStmt;
    private ElseBlock elseBlock;

    public IfStmt(String nodeName, int lineNumber, String IF, NamedExpression namedExpression, String COLON, Block block, ElifStmt elifStmt, ElseBlock elseBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IF = IF;
        this.namedExpression = namedExpression;
        this.COLON = COLON;
        this.block = block;
        this.elifStmt = elifStmt;
        this.elseBlock = elseBlock;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getIF() { return IF; }
    public void setIF(String IF) { this.IF = IF; }
    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) { this.namedExpression = namedExpression; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
    public ElifStmt getElifStmt() { return elifStmt; }
    public void setElifStmt(ElifStmt elifStmt) { this.elifStmt = elifStmt; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }

    @Override
    public String toString() { return "IfStmt"; }
}
