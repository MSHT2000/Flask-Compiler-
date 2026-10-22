package AST.Python;

public class GroupPattern {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private Pattern pattern;
    private String RPAR;

    public GroupPattern(String nodeName, int lineNumber, String LPAR, Pattern pattern, String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.pattern = pattern;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public Pattern getPattern() { return pattern; }
    public void setPattern(Pattern pattern) { this.pattern = pattern; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "GroupPattern"; }
}
