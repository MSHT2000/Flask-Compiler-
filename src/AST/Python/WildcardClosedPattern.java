package AST.Python;

public class WildcardClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private WildcardPattern wildcardPattern;

    public WildcardClosedPattern(String nodeName, int lineNumber, WildcardPattern wildcardPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.wildcardPattern = wildcardPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public WildcardPattern getWildcardPattern() { return wildcardPattern; }
    public void setWildcardPattern(WildcardPattern wildcardPattern) { this.wildcardPattern = wildcardPattern; }

    @Override
    public String toString() { return "WildcardClosedPattern"; }
}
