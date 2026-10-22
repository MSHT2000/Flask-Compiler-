package AST.Python;

public class ImportNameStatement extends ImportStmt {
    private final String nodeName;
    private final int lineNumber;
    private ImportName importName;

    public ImportNameStatement(String nodeName, int lineNumber, ImportName importName) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.importName = importName;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ImportName getImportName() { return importName; }
    public void setImportName(ImportName importName) { this.importName = importName; }

    @Override
    public String toString() { return "ImportNameStatement"; }
}
