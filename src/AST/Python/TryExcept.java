package AST.Python;

public class TryExcept extends TryStmt {
    private final String nodeName;
    private final int lineNumber;
    private String TRY;
    private String COLON;
    private Block block;
    private java.util.List<ExceptBlock> exceptBlock;
    private ElseBlock elseBlock;
    private FinallyBlock finallyBlock;

    public TryExcept(String nodeName, int lineNumber, String TRY, String COLON, Block block, java.util.List<ExceptBlock> exceptBlock, ElseBlock elseBlock, FinallyBlock finallyBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TRY = TRY;
        this.COLON = COLON;
        this.block = block;
        this.exceptBlock = exceptBlock;
        this.elseBlock = elseBlock;
        this.finallyBlock = finallyBlock;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getTRY() { return TRY; }
    public void setTRY(String TRY) { this.TRY = TRY; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
    public java.util.List<ExceptBlock> getExceptBlock() { return exceptBlock; }
    public void setExceptBlock(java.util.List<ExceptBlock> exceptBlock) { this.exceptBlock = exceptBlock; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }
    public FinallyBlock getFinallyBlock() { return finallyBlock; }
    public void setFinallyBlock(FinallyBlock finallyBlock) { this.finallyBlock = finallyBlock; }

    @Override
    public String toString() { return "TryExcept"; }
}
