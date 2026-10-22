package AST.Python;

public class ReturnStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private ReturnStmt returnStmt;

    public ReturnStatement(String nodeName, int lineNumber, ReturnStmt returnStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.returnStmt = returnStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ReturnStmt getReturnStmt() { return returnStmt; }
    public void setReturnStmt(ReturnStmt returnStmt) { this.returnStmt = returnStmt; }

    @Override
    public String toString() { return "ReturnStatement"; }
}
