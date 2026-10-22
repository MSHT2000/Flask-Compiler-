package AST.Python;

public class UnaryPlus extends Factor {
    private final String nodeName;
    private final int lineNumber;
    private String PLUS;
    private Factor factor;

    public UnaryPlus(String nodeName, int lineNumber,
                     String PLUS,
                     Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.PLUS = PLUS;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getPLUS() { return PLUS; }
    public void setPLUS(String PLUS) { this.PLUS = PLUS; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "UnaryPlus"; }
}