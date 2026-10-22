package AST.Python;

public class DefaultAssignment {
    private final String nodeName;
    private final int lineNumber;
    private String EQUAL;
    private Expression expression;

    public DefaultAssignment(String nodeName, int lineNumber, String EQUAL, Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EQUAL = EQUAL;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "DefaultAssignment"; }
}
