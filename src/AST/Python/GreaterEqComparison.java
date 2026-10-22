package AST.Python;

public class GreaterEqComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private GteBitwiseOr gteBitwiseOr;

    public GreaterEqComparison(String nodeName, int lineNumber, GteBitwiseOr gteBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.gteBitwiseOr = gteBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public GteBitwiseOr getGteBitwiseOr() { return gteBitwiseOr; }
    public void setGteBitwiseOr(GteBitwiseOr gteBitwiseOr) { this.gteBitwiseOr = gteBitwiseOr; }

    @Override
    public String toString() { return "GreaterEqComparison"; }
}