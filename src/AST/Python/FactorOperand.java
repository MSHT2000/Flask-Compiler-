package AST.Python;

public class FactorOperand extends Term {
    private final String nodeName;
    private final int lineNumber;
    private Factor factor;

    public FactorOperand(String nodeName, int lineNumber, Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "FactorOperand"; }
}