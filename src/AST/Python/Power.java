package AST.Python;

public class Power {
    private final String nodeName;
    private final int lineNumber;
    private AwaitPrimary awaitPrimary;
    private String DOUBLESTAR;    // nullable — present only when "**" appears
    private Factor factor;        // nullable — present only when "**" appears

    public Power(String nodeName, int lineNumber,
                 AwaitPrimary awaitPrimary,
                 String DOUBLESTAR,
                 Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.awaitPrimary = awaitPrimary;
        this.DOUBLESTAR = DOUBLESTAR;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public AwaitPrimary getAwaitPrimary() { return awaitPrimary; }
    public void setAwaitPrimary(AwaitPrimary awaitPrimary) { this.awaitPrimary = awaitPrimary; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "Power"; }
}