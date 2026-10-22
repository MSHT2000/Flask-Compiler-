package AST.Python;

public class DeleteStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private DelStmt delStmt;

    public DeleteStatement(String nodeName, int lineNumber, DelStmt delStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.delStmt = delStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public DelStmt getDelStmt() { return delStmt; }
    public void setDelStmt(DelStmt delStmt) { this.delStmt = delStmt; }

    @Override
    public String toString() { return "DeleteStatement"; }
}
