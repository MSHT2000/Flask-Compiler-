package AST.Python;

public class ItemsPattern {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<KeyValuePattern> keyValuePattern;
    private java.util.List<String> COMMA;

    public ItemsPattern(String nodeName, int lineNumber, java.util.List<KeyValuePattern> keyValuePattern, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.keyValuePattern = keyValuePattern;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<KeyValuePattern> getKeyValuePattern() { return keyValuePattern; }
    public void setKeyValuePattern(java.util.List<KeyValuePattern> keyValuePattern) { this.keyValuePattern = keyValuePattern; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "ItemsPattern"; }
}
