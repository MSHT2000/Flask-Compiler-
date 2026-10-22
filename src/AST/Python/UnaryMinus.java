package AST.Python;

public class UnaryMinus extends Factor {
    private final String nodeName;
    private final int lineNumber;
    private String MINUS;
    private Factor factor;

    public UnaryMinus(String nodeName, int lineNumber,
                      String MINUS,
                      Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.MINUS = MINUS;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getMINUS() { return MINUS; }
    public void setMINUS(String MINUS) { this.MINUS = MINUS; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "UnaryMinus"; }
}