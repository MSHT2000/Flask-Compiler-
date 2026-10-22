package AST.Python;

public class SubjectExprMultiple extends SubjectExpr {
    private final String nodeName;
    private final int lineNumber;
    private StarNamedExpression starNamedExpression;
    private String COMMA;
    private StarNamedExpressions starNamedExpressions;

    public SubjectExprMultiple(String nodeName, int lineNumber, StarNamedExpression starNamedExpression, String COMMA, StarNamedExpressions starNamedExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starNamedExpression = starNamedExpression;
        this.COMMA = COMMA;
        this.starNamedExpressions = starNamedExpressions;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public StarNamedExpression getStarNamedExpression() { return starNamedExpression; }
    public void setStarNamedExpression(StarNamedExpression starNamedExpression) { this.starNamedExpression = starNamedExpression; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public StarNamedExpressions getStarNamedExpressions() { return starNamedExpressions; }
    public void setStarNamedExpressions(StarNamedExpressions starNamedExpressions) { this.starNamedExpressions = starNamedExpressions; }

    @Override
    public String toString() { return "SubjectExprMultiple"; }
}
