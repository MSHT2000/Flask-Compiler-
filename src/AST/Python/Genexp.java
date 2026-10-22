package AST.Python;

public class Genexp {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private AssignmentExpression assignmentExpression;   // nullable
    private Expression expression;                       // nullable
    private ForIfClauses forIfClauses;
    private String RPAR;

    public Genexp(String nodeName, int lineNumber,
                  String LPAR,
                  AssignmentExpression assignmentExpression,
                  Expression expression,
                  ForIfClauses forIfClauses,
                  String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.assignmentExpression = assignmentExpression;
        this.expression = expression;
        this.forIfClauses = forIfClauses;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public AssignmentExpression getAssignmentExpression() { return assignmentExpression; }
    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    public ForIfClauses getForIfClauses() { return forIfClauses; }
    public void setForIfClauses(ForIfClauses forIfClauses) { this.forIfClauses = forIfClauses; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "Genexp"; }
}