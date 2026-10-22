package AST.Python;

public class StarredExpression {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private Expression expression;

    public StarredExpression(String nodeName, int lineNumber,
                             String STAR,
                             Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "StarredExpression"; }
}