package AST.Python;

public class OrPattern {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<ClosedPattern> closedPattern;
    private java.util.List<String> VBAR;

    public OrPattern(String nodeName, int lineNumber, java.util.List<ClosedPattern> closedPattern, java.util.List<String> VBAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.closedPattern = closedPattern;
        this.VBAR = VBAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<ClosedPattern> getClosedPattern() { return closedPattern; }
    public void setClosedPattern(java.util.List<ClosedPattern> closedPattern) { this.closedPattern = closedPattern; }
    public java.util.List<String> getVBAR() { return VBAR; }
    public void setVBAR(java.util.List<String> VBAR) { this.VBAR = VBAR; }

    @Override
    public String toString() { return "OrPattern"; }
}
