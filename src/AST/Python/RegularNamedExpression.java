package AST.Python;

public class RegularNamedExpression extends NamedExpression {
    private final String nodeName;
    private final int lineNumber;
    private Expression expression;

    public RegularNamedExpression(String nodeName, int lineNumber, Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "RegularNamedExpression"; }
}