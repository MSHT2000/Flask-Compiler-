package AST.Python;

public class AssignmentStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private Assignment assignment;

    public AssignmentStatement(String nodeName, int lineNumber, Assignment assignment) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.assignment = assignment;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Assignment getAssignment() { return assignment; }
    public void setAssignment(Assignment assignment) { this.assignment = assignment; }

    @Override
    public String toString() { return "AssignmentStatement"; }
}
