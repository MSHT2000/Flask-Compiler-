package AST.Python;

public class CompoundStatement extends Statement {
    private final String nodeName;
    private final int lineNumber;
    private CompoundStmt compoundStmt;

    public CompoundStatement(String nodeName, int lineNumber, CompoundStmt compoundStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.compoundStmt = compoundStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public CompoundStmt getCompoundStmt() { return compoundStmt; }
    public void setCompoundStmt(CompoundStmt compoundStmt) { this.compoundStmt = compoundStmt; }

    @Override
    public String toString() { return "CompoundStatement"; }
}
