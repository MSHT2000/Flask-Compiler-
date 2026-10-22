package AST.Python;

public class IfStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private IfStmt ifStmt;

    public IfStatement(String nodeName, int lineNumber, IfStmt ifStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ifStmt = ifStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public IfStmt getIfStmt() { return ifStmt; }
    public void setIfStmt(IfStmt ifStmt) { this.ifStmt = ifStmt; }

    @Override
    public String toString() { return "IfStatement"; }
}
