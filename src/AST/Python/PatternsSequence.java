package AST.Python;

public class PatternsSequence extends Patterns {
    private final String nodeName;
    private final int lineNumber;
    private OpenSequencePattern openSequencePattern;

    public PatternsSequence(String nodeName, int lineNumber, OpenSequencePattern openSequencePattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.openSequencePattern = openSequencePattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public OpenSequencePattern getOpenSequencePattern() { return openSequencePattern; }
    public void setOpenSequencePattern(OpenSequencePattern openSequencePattern) { this.openSequencePattern = openSequencePattern; }

    @Override
    public String toString() { return "PatternsSequence"; }
}
