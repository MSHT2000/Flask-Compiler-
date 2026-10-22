package AST.Python;

public class AsPatternMatch extends Pattern {
    private final String nodeName;
    private final int lineNumber;
    private AsPattern asPattern;

    public AsPatternMatch(String nodeName, int lineNumber, AsPattern asPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.asPattern = asPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public AsPattern getAsPattern() { return asPattern; }
    public void setAsPattern(AsPattern asPattern) { this.asPattern = asPattern; }

    @Override
    public String toString() { return "AsPatternMatch"; }
}
