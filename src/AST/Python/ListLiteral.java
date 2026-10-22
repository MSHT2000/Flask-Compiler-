package AST.Python;

public class ListLiteral {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private StarNamedExpressions starNamedExpressions;   // nullable — null for "[]"
    private String RSQB;

    public ListLiteral(String nodeName, int lineNumber,
                       String LSQB,
                       StarNamedExpressions starNamedExpressions,
                       String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.starNamedExpressions = starNamedExpressions;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public StarNamedExpressions getStarNamedExpressions() { return starNamedExpressions; }
    public void setStarNamedExpressions(StarNamedExpressions starNamedExpressions) {
        this.starNamedExpressions = starNamedExpressions;
    }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "List"; }
}