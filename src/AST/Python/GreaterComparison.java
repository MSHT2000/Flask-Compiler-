package AST.Python;

public class GreaterComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private GtBitwiseOr gtBitwiseOr;

    public GreaterComparison(String nodeName, int lineNumber, GtBitwiseOr gtBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.gtBitwiseOr = gtBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public GtBitwiseOr getGtBitwiseOr() { return gtBitwiseOr; }
    public void setGtBitwiseOr(GtBitwiseOr gtBitwiseOr) { this.gtBitwiseOr = gtBitwiseOr; }

    @Override
    public String toString() { return "GreaterComparison"; }
}