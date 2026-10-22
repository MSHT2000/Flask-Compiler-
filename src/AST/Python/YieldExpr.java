package AST.Python;

public class YieldExpr {
    private final String nodeName;
    private final int lineNumber;
    private String YIELD;
    private String FROM;
    private Expression expression;
    private StarExpressions starExpressions;

    public YieldExpr(String nodeName, int lineNumber, String YIELD, String FROM, Expression expression, StarExpressions starExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.YIELD = YIELD;
        this.FROM = FROM;
        this.expression = expression;
        this.starExpressions = starExpressions;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getYIELD() { return YIELD; }
    public void setYIELD(String YIELD) { this.YIELD = YIELD; }
    public String getFROM() { return FROM; }
    public void setFROM(String FROM) { this.FROM = FROM; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public StarExpressions getStarExpressions() { return starExpressions; }
    public void setStarExpressions(StarExpressions starExpressions) { this.starExpressions = starExpressions; }

    @Override
    public String toString() { return "YieldExpr"; }
}
