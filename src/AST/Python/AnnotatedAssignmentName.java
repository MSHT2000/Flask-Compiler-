package AST.Python;

public class AnnotatedAssignmentName extends Assignment {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private String COLON;
    private Expression expression;
    private String EQUAL;
    private AnnotatedRhs annotatedRhs;

    public AnnotatedAssignmentName(String nodeName, int lineNumber, Name name, String COLON, Expression expression, String EQUAL, AnnotatedRhs annotatedRhs) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.COLON = COLON;
        this.expression = expression;
        this.EQUAL = EQUAL;
        this.annotatedRhs = annotatedRhs;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public AnnotatedRhs getAnnotatedRhs() { return annotatedRhs; }
    public void setAnnotatedRhs(AnnotatedRhs annotatedRhs) { this.annotatedRhs = annotatedRhs; }

    @Override
    public String toString() { return "AnnotatedAssignmentName"; }
}
