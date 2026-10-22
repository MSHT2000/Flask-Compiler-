package AST.Python;

public class TypeParamBound {
    private final String nodeName;
    private final int lineNumber;
    private String COLON;
    private Expression expression;

    public TypeParamBound(String nodeName, int lineNumber, String COLON, Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.COLON = COLON;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "TypeParamBound"; }
}
