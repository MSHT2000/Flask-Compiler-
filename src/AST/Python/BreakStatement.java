package AST.Python;

public class BreakStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private BreakStmt breakStmt;

    public BreakStatement(String nodeName, int lineNumber, BreakStmt breakStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.breakStmt = breakStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public BreakStmt getBreakStmt() { return breakStmt; }
    public void setBreakStmt(BreakStmt breakStmt) { this.breakStmt = breakStmt; }

    @Override
    public String toString() { return "BreakStatement"; }
}
