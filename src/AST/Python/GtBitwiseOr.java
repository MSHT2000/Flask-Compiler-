package AST.Python;

public class GtBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String GREATER;
    private BitwiseOr bitwiseOr;

    public GtBitwiseOr(String nodeName, int lineNumber,
                       String GREATER,
                       BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.GREATER = GREATER;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getGREATER() { return GREATER; }
    public void setGREATER(String GREATER) { this.GREATER = GREATER; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "GtBitwiseOr"; }
}