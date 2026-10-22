package AST.Python;

public class ConditionalExpression extends Expression {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Disjunction> disjunction;
    private String IF;
    private String ELSE;
    private Expression expression;

    public ConditionalExpression(String nodeName, int lineNumber, java.util.List<Disjunction> disjunction, String IF, String ELSE, Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.disjunction = disjunction;
        this.IF = IF;
        this.ELSE = ELSE;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Disjunction> getDisjunction() { return disjunction; }
    public void setDisjunction(java.util.List<Disjunction> disjunction) { this.disjunction = disjunction; }
    public String getIF() { return IF; }
    public void setIF(String IF) { this.IF = IF; }
    public String getELSE() { return ELSE; }
    public void setELSE(String ELSE) { this.ELSE = ELSE; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "ConditionalExpression"; }
}
