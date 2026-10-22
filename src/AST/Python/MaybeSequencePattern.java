package AST.Python;

public class MaybeSequencePattern {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<MaybeStarPattern> maybeStarPattern;
    private java.util.List<String> COMMA;

    public MaybeSequencePattern(String nodeName, int lineNumber, java.util.List<MaybeStarPattern> maybeStarPattern, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.maybeStarPattern = maybeStarPattern;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<MaybeStarPattern> getMaybeStarPattern() { return maybeStarPattern; }
    public void setMaybeStarPattern(java.util.List<MaybeStarPattern> maybeStarPattern) { this.maybeStarPattern = maybeStarPattern; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "MaybeSequencePattern"; }
}
