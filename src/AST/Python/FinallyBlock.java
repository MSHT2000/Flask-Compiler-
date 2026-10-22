package AST.Python;

public class FinallyBlock {
    private final String nodeName;
    private final int lineNumber;
    private String FINALLY;
    private String COLON;
    private Block block;

    public FinallyBlock(String nodeName, int lineNumber, String FINALLY, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.FINALLY = FINALLY;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getFINALLY() { return FINALLY; }
    public void setFINALLY(String FINALLY) { this.FINALLY = FINALLY; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "FinallyBlock"; }
}
