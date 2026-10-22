package AST.Python;

public class ImportStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private ImportStmt importStmt;

    public ImportStatement(String nodeName, int lineNumber, ImportStmt importStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.importStmt = importStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ImportStmt getImportStmt() { return importStmt; }
    public void setImportStmt(ImportStmt importStmt) { this.importStmt = importStmt; }

    @Override
    public String toString() { return "ImportStatement"; }
}
