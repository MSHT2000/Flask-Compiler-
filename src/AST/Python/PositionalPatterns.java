package AST.Python;

public class PositionalPatterns {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Pattern> pattern;
    private java.util.List<String> COMMA;

    public PositionalPatterns(String nodeName, int lineNumber, java.util.List<Pattern> pattern, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.pattern = pattern;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Pattern> getPattern() { return pattern; }
    public void setPattern(java.util.List<Pattern> pattern) { this.pattern = pattern; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "PositionalPatterns"; }
}
