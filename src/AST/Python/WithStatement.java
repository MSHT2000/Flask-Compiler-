package AST.Python;

public class WithStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private WithStmt withStmt;

    public WithStatement(String nodeName, int lineNumber, WithStmt withStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.withStmt = withStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public WithStmt getWithStmt() { return withStmt; }
    public void setWithStmt(WithStmt withStmt) { this.withStmt = withStmt; }

    @Override
    public String toString() { return "WithStatement"; }
}
