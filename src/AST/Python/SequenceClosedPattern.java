package AST.Python;

public class SequenceClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private SequencePattern sequencePattern;

    public SequenceClosedPattern(String nodeName, int lineNumber, SequencePattern sequencePattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.sequencePattern = sequencePattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SequencePattern getSequencePattern() { return sequencePattern; }
    public void setSequencePattern(SequencePattern sequencePattern) { this.sequencePattern = sequencePattern; }

    @Override
    public String toString() { return "SequenceClosedPattern"; }
}
