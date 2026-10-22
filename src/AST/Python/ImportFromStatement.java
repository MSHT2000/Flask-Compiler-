package AST.Python;

public class ImportFromStatement extends ImportStmt {
    private final String nodeName;
    private final int lineNumber;
    private ImportFrom importFrom;

    public ImportFromStatement(String nodeName, int lineNumber, ImportFrom importFrom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.importFrom = importFrom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ImportFrom getImportFrom() { return importFrom; }
    public void setImportFrom(ImportFrom importFrom) { this.importFrom = importFrom; }

    @Override
    public String toString() { return "ImportFromStatement"; }
}
