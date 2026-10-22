package AST.Python;

public class GteBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String GREATEREQUAL;
    private BitwiseOr bitwiseOr;

    public GteBitwiseOr(String nodeName, int lineNumber,
                        String GREATEREQUAL,
                        BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.GREATEREQUAL = GREATEREQUAL;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getGREATEREQUAL() { return GREATEREQUAL; }
    public void setGREATEREQUAL(String GREATEREQUAL) { this.GREATEREQUAL = GREATEREQUAL; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "GteBitwiseOr"; }
}