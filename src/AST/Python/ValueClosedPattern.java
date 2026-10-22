package AST.Python;

public class ValueClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private ValuePattern valuePattern;

    public ValueClosedPattern(String nodeName, int lineNumber, ValuePattern valuePattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.valuePattern = valuePattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ValuePattern getValuePattern() { return valuePattern; }
    public void setValuePattern(ValuePattern valuePattern) { this.valuePattern = valuePattern; }

    @Override
    public String toString() { return "ValueClosedPattern"; }
}
