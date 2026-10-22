package AST.Python;

public class AssertStmt {
    private final String nodeName;
    private final int lineNumber;
    private String ASSERT;
    private java.util.List<Expression> expression;
    private String COMMA;

    public AssertStmt(String nodeName, int lineNumber, String ASSERT, java.util.List<Expression> expression, String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASSERT = ASSERT;
        this.expression = expression;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getASSERT() { return ASSERT; }
    public void setASSERT(String ASSERT) { this.ASSERT = ASSERT; }
    public java.util.List<Expression> getExpression() { return expression; }
    public void setExpression(java.util.List<Expression> expression) { this.expression = expression; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "AssertStmt"; }
}
