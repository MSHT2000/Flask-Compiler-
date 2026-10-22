package AST.Python;

public class TryExceptStar extends TryStmt {
    private final String nodeName;
    private final int lineNumber;
    private String TRY;
    private String COLON;
    private Block block;
    private java.util.List<ExceptStarBlock> exceptStarBlock;
    private ElseBlock elseBlock;
    private FinallyBlock finallyBlock;

    public TryExceptStar(String nodeName, int lineNumber, String TRY, String COLON, Block block, java.util.List<ExceptStarBlock> exceptStarBlock, ElseBlock elseBlock, FinallyBlock finallyBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TRY = TRY;
        this.COLON = COLON;
        this.block = block;
        this.exceptStarBlock = exceptStarBlock;
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
    public java.util.List<ExceptStarBlock> getExceptStarBlock() { return exceptStarBlock; }
    public void setExceptStarBlock(java.util.List<ExceptStarBlock> exceptStarBlock) { this.exceptStarBlock = exceptStarBlock; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }
    public FinallyBlock getFinallyBlock() { return finallyBlock; }
    public void setFinallyBlock(FinallyBlock finallyBlock) { this.finallyBlock = finallyBlock; }

    @Override
    public String toString() { return "TryExceptStar"; }
}
