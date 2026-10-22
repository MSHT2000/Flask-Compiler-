package AST.Python;

public class GlobalStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private GlobalStmt globalStmt;

    public GlobalStatement(String nodeName, int lineNumber, GlobalStmt globalStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.globalStmt = globalStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public GlobalStmt getGlobalStmt() { return globalStmt; }
    public void setGlobalStmt(GlobalStmt globalStmt) { this.globalStmt = globalStmt; }

    @Override
    public String toString() { return "GlobalStatement"; }
}
