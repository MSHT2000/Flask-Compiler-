package AST.Python;

public class NonlocalStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private NonlocalStmt nonlocalStmt;

    public NonlocalStatement(String nodeName, int lineNumber, NonlocalStmt nonlocalStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.nonlocalStmt = nonlocalStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public NonlocalStmt getNonlocalStmt() { return nonlocalStmt; }
    public void setNonlocalStmt(NonlocalStmt nonlocalStmt) { this.nonlocalStmt = nonlocalStmt; }

    @Override
    public String toString() { return "NonlocalStatement"; }
}
