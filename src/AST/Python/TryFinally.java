package AST.Python;

public class TryFinally extends TryStmt {
    private final String nodeName;
    private final int lineNumber;
    private String TRY;
    private String COLON;
    private Block block;
    private FinallyBlock finallyBlock;

    public TryFinally(String nodeName, int lineNumber, String TRY, String COLON, Block block, FinallyBlock finallyBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TRY = TRY;
        this.COLON = COLON;
        this.block = block;
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
    public FinallyBlock getFinallyBlock() { return finallyBlock; }
    public void setFinallyBlock(FinallyBlock finallyBlock) { this.finallyBlock = finallyBlock; }

    @Override
    public String toString() { return "TryFinally"; }
}
