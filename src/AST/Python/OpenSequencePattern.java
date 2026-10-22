package AST.Python;

public class OpenSequencePattern {
    private final String nodeName;
    private final int lineNumber;
    private MaybeStarPattern maybeStarPattern;
    private String COMMA;
    private MaybeSequencePattern maybeSequencePattern;

    public OpenSequencePattern(String nodeName, int lineNumber, MaybeStarPattern maybeStarPattern, String COMMA, MaybeSequencePattern maybeSequencePattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.maybeStarPattern = maybeStarPattern;
        this.COMMA = COMMA;
        this.maybeSequencePattern = maybeSequencePattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public MaybeStarPattern getMaybeStarPattern() { return maybeStarPattern; }
    public void setMaybeStarPattern(MaybeStarPattern maybeStarPattern) { this.maybeStarPattern = maybeStarPattern; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public MaybeSequencePattern getMaybeSequencePattern() { return maybeSequencePattern; }
    public void setMaybeSequencePattern(MaybeSequencePattern maybeSequencePattern) { this.maybeSequencePattern = maybeSequencePattern; }

    @Override
    public String toString() { return "OpenSequencePattern"; }
}
