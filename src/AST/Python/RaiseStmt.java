package AST.Python;

public class RaiseStmt {
    private final String nodeName;
    private final int lineNumber;
    private String RAISE;
    private java.util.List<Expression> expression;
    private String FROM;

    public RaiseStmt(String nodeName, int lineNumber, String RAISE, java.util.List<Expression> expression, String FROM) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.RAISE = RAISE;
        this.expression = expression;
        this.FROM = FROM;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getRAISE() { return RAISE; }
    public void setRAISE(String RAISE) { this.RAISE = RAISE; }
    public java.util.List<Expression> getExpression() { return expression; }
    public void setExpression(java.util.List<Expression> expression) { this.expression = expression; }
    public String getFROM() { return FROM; }
    public void setFROM(String FROM) { this.FROM = FROM; }

    @Override
    public String toString() { return "RaiseStmt"; }
}
