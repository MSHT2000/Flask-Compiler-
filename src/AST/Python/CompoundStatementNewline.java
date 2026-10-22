package AST.Python;

public class CompoundStatementNewline extends StatementNewline {
    private final String nodeName;
    private final int lineNumber;
    private SingleCompoundStmt singleCompoundStmt;
    private String NEWLINE;

    public CompoundStatementNewline(String nodeName, int lineNumber, SingleCompoundStmt singleCompoundStmt, String NEWLINE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.singleCompoundStmt = singleCompoundStmt;
        this.NEWLINE = NEWLINE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SingleCompoundStmt getSingleCompoundStmt() { return singleCompoundStmt; }
    public void setSingleCompoundStmt(SingleCompoundStmt singleCompoundStmt) { this.singleCompoundStmt = singleCompoundStmt; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }

    @Override
    public String toString() { return "CompoundStatementNewline"; }
}
