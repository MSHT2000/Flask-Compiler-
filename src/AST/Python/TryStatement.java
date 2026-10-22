package AST.Python;

public class TryStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private TryStmt tryStmt;

    public TryStatement(String nodeName, int lineNumber, TryStmt tryStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tryStmt = tryStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public TryStmt getTryStmt() { return tryStmt; }
    public void setTryStmt(TryStmt tryStmt) { this.tryStmt = tryStmt; }

    @Override
    public String toString() { return "TryStatement"; }
}
