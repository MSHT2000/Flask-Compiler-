package AST.Python;

public class KeywordPattern {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private String EQUAL;
    private Pattern pattern;

    public KeywordPattern(String nodeName, int lineNumber, Name name, String EQUAL, Pattern pattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.EQUAL = EQUAL;
        this.pattern = pattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public Pattern getPattern() { return pattern; }
    public void setPattern(Pattern pattern) { this.pattern = pattern; }

    @Override
    public String toString() { return "KeywordPattern"; }
}
