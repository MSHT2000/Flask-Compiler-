package AST.Python;

public class IsNotComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private IsnotBitwiseOr isnotBitwiseOr;

    public IsNotComparison(String nodeName, int lineNumber, IsnotBitwiseOr isnotBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.isnotBitwiseOr = isnotBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public IsnotBitwiseOr getIsnotBitwiseOr() { return isnotBitwiseOr; }
    public void setIsnotBitwiseOr(IsnotBitwiseOr isnotBitwiseOr) { this.isnotBitwiseOr = isnotBitwiseOr; }

    @Override
    public String toString() { return "IsNotComparison"; }
}