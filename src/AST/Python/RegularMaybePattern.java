package AST.Python;

public class RegularMaybePattern extends MaybeStarPattern {
    private final String nodeName;
    private final int lineNumber;
    private Pattern pattern;

    public RegularMaybePattern(String nodeName, int lineNumber, Pattern pattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.pattern = pattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Pattern getPattern() { return pattern; }
    public void setPattern(Pattern pattern) { this.pattern = pattern; }

    @Override
    public String toString() { return "RegularMaybePattern"; }
}
