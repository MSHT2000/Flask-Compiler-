package AST.Python;

public class ForStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private ForStmt forStmt;

    public ForStatement(String nodeName, int lineNumber, ForStmt forStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.forStmt = forStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ForStmt getForStmt() { return forStmt; }
    public void setForStmt(ForStmt forStmt) { this.forStmt = forStmt; }

    @Override
    public String toString() { return "ForStatement"; }
}
