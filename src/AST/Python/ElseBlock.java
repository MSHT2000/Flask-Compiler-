package AST.Python;

public class ElseBlock {
    private final String nodeName;
    private final int lineNumber;
    private String ELSE;
    private String COLON;
    private Block block;

    public ElseBlock(String nodeName, int lineNumber, String ELSE, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ELSE = ELSE;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getELSE() { return ELSE; }
    public void setELSE(String ELSE) { this.ELSE = ELSE; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "ElseBlock"; }
}
