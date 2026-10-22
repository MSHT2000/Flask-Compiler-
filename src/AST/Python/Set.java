package AST.Python;

public class Set {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private StarNamedExpressions starNamedExpressions;
    private String RBRACE;

    public Set(String nodeName, int lineNumber,
               String LBRACE,
               StarNamedExpressions starNamedExpressions,
               String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.starNamedExpressions = starNamedExpressions;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }

    public StarNamedExpressions getStarNamedExpressions() { return starNamedExpressions; }
    public void setStarNamedExpressions(StarNamedExpressions starNamedExpressions) {
        this.starNamedExpressions = starNamedExpressions;
    }

    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "Set"; }
}