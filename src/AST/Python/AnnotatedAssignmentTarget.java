package AST.Python;

public class AnnotatedAssignmentTarget extends Assignment {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private SingleTarget singleTarget;
    private String RPAR;
    private SingleSubscriptAttributeTarget singleSubscriptAttributeTarget;
    private String COLON;
    private Expression expression;
    private String EQUAL;
    private AnnotatedRhs annotatedRhs;

    public AnnotatedAssignmentTarget(String nodeName, int lineNumber, String LPAR, SingleTarget singleTarget, String RPAR, SingleSubscriptAttributeTarget singleSubscriptAttributeTarget, String COLON, Expression expression, String EQUAL, AnnotatedRhs annotatedRhs) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.singleTarget = singleTarget;
        this.RPAR = RPAR;
        this.singleSubscriptAttributeTarget = singleSubscriptAttributeTarget;
        this.COLON = COLON;
        this.expression = expression;
        this.EQUAL = EQUAL;
        this.annotatedRhs = annotatedRhs;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public SingleTarget getSingleTarget() { return singleTarget; }
    public void setSingleTarget(SingleTarget singleTarget) { this.singleTarget = singleTarget; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }
    public SingleSubscriptAttributeTarget getSingleSubscriptAttributeTarget() { return singleSubscriptAttributeTarget; }
    public void setSingleSubscriptAttributeTarget(SingleSubscriptAttributeTarget singleSubscriptAttributeTarget) { this.singleSubscriptAttributeTarget = singleSubscriptAttributeTarget; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public AnnotatedRhs getAnnotatedRhs() { return annotatedRhs; }
    public void setAnnotatedRhs(AnnotatedRhs annotatedRhs) { this.annotatedRhs = annotatedRhs; }

    @Override
    public String toString() { return "AnnotatedAssignmentTarget"; }
}
