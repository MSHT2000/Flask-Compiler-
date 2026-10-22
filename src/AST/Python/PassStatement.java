package AST.Python;

public class PassStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private PassStmt passStmt;

    public PassStatement(String nodeName, int lineNumber, PassStmt passStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.passStmt = passStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public PassStmt getPassStmt() { return passStmt; }
    public void setPassStmt(PassStmt passStmt) { this.passStmt = passStmt; }

    @Override
    public String toString() { return "PassStatement"; }
}
