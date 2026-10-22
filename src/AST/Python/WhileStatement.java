package AST.Python;

public class WhileStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private WhileStmt whileStmt;

    public WhileStatement(String nodeName, int lineNumber, WhileStmt whileStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.whileStmt = whileStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public WhileStmt getWhileStmt() { return whileStmt; }
    public void setWhileStmt(WhileStmt whileStmt) { this.whileStmt = whileStmt; }

    @Override
    public String toString() { return "WhileStatement"; }
}
