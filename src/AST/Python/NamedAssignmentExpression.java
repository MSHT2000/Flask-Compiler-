package AST.Python;

public class NamedAssignmentExpression extends NamedExpression {
    private final String nodeName;
    private final int lineNumber;
    private AssignmentExpression assignmentExpression;

    public NamedAssignmentExpression(String nodeName, int lineNumber,
                                     AssignmentExpression assignmentExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.assignmentExpression = assignmentExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public AssignmentExpression getAssignmentExpression() { return assignmentExpression; }
    public void setAssignmentExpression(AssignmentExpression assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    @Override
    public String toString() { return "NamedAssignmentExpression"; }
}