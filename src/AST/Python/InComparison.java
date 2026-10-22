package AST.Python;

public class InComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private InBitwiseOr inBitwiseOr;

    public InComparison(String nodeName, int lineNumber, InBitwiseOr inBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.inBitwiseOr = inBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public InBitwiseOr getInBitwiseOr() { return inBitwiseOr; }
    public void setInBitwiseOr(InBitwiseOr inBitwiseOr) { this.inBitwiseOr = inBitwiseOr; }

    @Override
    public String toString() { return "InComparison"; }
}