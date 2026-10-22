package AST.Python;

public class AssertStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private AssertStmt assertStmt;

    public AssertStatement(String nodeName, int lineNumber, AssertStmt assertStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.assertStmt = assertStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public AssertStmt getAssertStmt() { return assertStmt; }
    public void setAssertStmt(AssertStmt assertStmt) { this.assertStmt = assertStmt; }

    @Override
    public String toString() { return "AssertStatement"; }
}
