package AST.Python;

public class DoubleStarredKeyValue extends DoubleStarredKvpair {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private BitwiseOr bitwiseOr;

    public DoubleStarredKeyValue(String nodeName, int lineNumber,
                                 String DOUBLESTAR,
                                 BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "DoubleStarredKeyValue"; }
}