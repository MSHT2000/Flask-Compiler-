package AST.Python;

public class ReturnStmt {
    private final String nodeName;
    private final int lineNumber;
    private String RETURN;
    private StarExpressions starExpressions;

    public ReturnStmt(String nodeName, int lineNumber, String RETURN, StarExpressions starExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.RETURN = RETURN;
        this.starExpressions = starExpressions;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getRETURN() { return RETURN; }
    public void setRETURN(String RETURN) { this.RETURN = RETURN; }
    public StarExpressions getStarExpressions() { return starExpressions; }
    public void setStarExpressions(StarExpressions starExpressions) { this.starExpressions = starExpressions; }

    @Override
    public String toString() { return "ReturnStmt"; }
}
