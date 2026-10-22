package AST.Python;

public class LessComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private LtBitwiseOr ltBitwiseOr;

    public LessComparison(String nodeName, int lineNumber, LtBitwiseOr ltBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ltBitwiseOr = ltBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LtBitwiseOr getLtBitwiseOr() { return ltBitwiseOr; }
    public void setLtBitwiseOr(LtBitwiseOr ltBitwiseOr) { this.ltBitwiseOr = ltBitwiseOr; }

    @Override
    public String toString() { return "LessComparison"; }
}