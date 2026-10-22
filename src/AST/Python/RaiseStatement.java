package AST.Python;

public class RaiseStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private RaiseStmt raiseStmt;

    public RaiseStatement(String nodeName, int lineNumber, RaiseStmt raiseStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.raiseStmt = raiseStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public RaiseStmt getRaiseStmt() { return raiseStmt; }
    public void setRaiseStmt(RaiseStmt raiseStmt) { this.raiseStmt = raiseStmt; }

    @Override
    public String toString() { return "RaiseStatement"; }
}
