package AST.Python;

public class LiteralClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private LiteralPattern literalPattern;

    public LiteralClosedPattern(String nodeName, int lineNumber, LiteralPattern literalPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.literalPattern = literalPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public LiteralPattern getLiteralPattern() { return literalPattern; }
    public void setLiteralPattern(LiteralPattern literalPattern) { this.literalPattern = literalPattern; }

    @Override
    public String toString() { return "LiteralClosedPattern"; }
}
