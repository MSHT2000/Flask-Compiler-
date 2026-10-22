package AST.Python;

public class KeywordPatterns {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<KeywordPattern> keywordPattern;
    private java.util.List<String> COMMA;

    public KeywordPatterns(String nodeName, int lineNumber, java.util.List<KeywordPattern> keywordPattern, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.keywordPattern = keywordPattern;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<KeywordPattern> getKeywordPattern() { return keywordPattern; }
    public void setKeywordPattern(java.util.List<KeywordPattern> keywordPattern) { this.keywordPattern = keywordPattern; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "KeywordPatterns"; }
}
