package AST.Python;

public class Expressions {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Expression> expression;
    private java.util.List<String> COMMA;

    public Expressions(String nodeName, int lineNumber, java.util.List<Expression> expression, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Expression> getExpression() { return expression; }
    public void setExpression(java.util.List<Expression> expression) { this.expression = expression; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "Expressions"; }
}
