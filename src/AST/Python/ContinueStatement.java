package AST.Python;

public class ContinueStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private ContinueStmt continueStmt;

    public ContinueStatement(String nodeName, int lineNumber, ContinueStmt continueStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.continueStmt = continueStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ContinueStmt getContinueStmt() { return continueStmt; }
    public void setContinueStmt(ContinueStmt continueStmt) { this.continueStmt = continueStmt; }

    @Override
    public String toString() { return "ContinueStatement"; }
}
