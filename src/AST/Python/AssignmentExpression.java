package AST.Python;

public class AssignmentExpression {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private String COLONEQUAL;
    private Expression expression;

    public AssignmentExpression(String nodeName, int lineNumber,
                                Name name,
                                String COLONEQUAL,
                                Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.COLONEQUAL = COLONEQUAL;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public String getCOLONEQUAL() { return COLONEQUAL; }
    public void setCOLONEQUAL(String COLONEQUAL) { this.COLONEQUAL = COLONEQUAL; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "AssignmentExpression"; }
}