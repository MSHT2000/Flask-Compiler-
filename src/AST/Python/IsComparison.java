package AST.Python;

public class IsComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private IsBitwiseOr isBitwiseOr;

    public IsComparison(String nodeName, int lineNumber, IsBitwiseOr isBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.isBitwiseOr = isBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public IsBitwiseOr getIsBitwiseOr() { return isBitwiseOr; }
    public void setIsBitwiseOr(IsBitwiseOr isBitwiseOr) { this.isBitwiseOr = isBitwiseOr; }

    @Override
    public String toString() { return "IsComparison"; }
}