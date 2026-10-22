package AST.Python;

public class OrPatternAlternatives extends Pattern {
    private final String nodeName;
    private final int lineNumber;
    private OrPattern orPattern;

    public OrPatternAlternatives(String nodeName, int lineNumber, OrPattern orPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.orPattern = orPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public OrPattern getOrPattern() { return orPattern; }
    public void setOrPattern(OrPattern orPattern) { this.orPattern = orPattern; }

    @Override
    public String toString() { return "OrPatternAlternatives"; }
}
