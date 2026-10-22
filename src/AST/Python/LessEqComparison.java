package AST.Python;

public class LessEqComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private LteBitwiseOr lteBitwiseOr;

    public LessEqComparison(String nodeName, int lineNumber, LteBitwiseOr lteBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lteBitwiseOr = lteBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LteBitwiseOr getLteBitwiseOr() { return lteBitwiseOr; }
    public void setLteBitwiseOr(LteBitwiseOr lteBitwiseOr) { this.lteBitwiseOr = lteBitwiseOr; }

    @Override
    public String toString() { return "LessEqComparison"; }
}