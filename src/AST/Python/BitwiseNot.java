package AST.Python;

public class BitwiseNot extends Factor {
    private final String nodeName;
    private final int lineNumber;
    private String TILDE;
    private Factor factor;

    public BitwiseNot(String nodeName, int lineNumber,
                      String TILDE,
                      Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TILDE = TILDE;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getTILDE() { return TILDE; }
    public void setTILDE(String TILDE) { this.TILDE = TILDE; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "BitwiseNot"; }
}