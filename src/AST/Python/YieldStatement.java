package AST.Python;

public class YieldStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private YieldStmt yieldStmt;

    public YieldStatement(String nodeName, int lineNumber, YieldStmt yieldStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.yieldStmt = yieldStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public YieldStmt getYieldStmt() { return yieldStmt; }
    public void setYieldStmt(YieldStmt yieldStmt) { this.yieldStmt = yieldStmt; }

    @Override
    public String toString() { return "YieldStatement"; }
}
