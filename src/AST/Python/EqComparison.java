package AST.Python;

public class EqComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private EqBitwiseOr eqBitwiseOr;

    public EqComparison(String nodeName, int lineNumber, EqBitwiseOr eqBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.eqBitwiseOr = eqBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public EqBitwiseOr getEqBitwiseOr() { return eqBitwiseOr; }
    public void setEqBitwiseOr(EqBitwiseOr eqBitwiseOr) { this.eqBitwiseOr = eqBitwiseOr; }

    @Override
    public String toString() { return "EqComparison"; }
}