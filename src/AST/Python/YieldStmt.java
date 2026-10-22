package AST.Python;

public class YieldStmt {
    private final String nodeName;
    private final int lineNumber;
    private YieldExpr yieldExpr;

    public YieldStmt(String nodeName, int lineNumber, YieldExpr yieldExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.yieldExpr = yieldExpr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public YieldExpr getYieldExpr() { return yieldExpr; }
    public void setYieldExpr(YieldExpr yieldExpr) { this.yieldExpr = yieldExpr; }

    @Override
    public String toString() { return "YieldStmt"; }
}
