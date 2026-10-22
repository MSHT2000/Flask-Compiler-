package AST.Python;

public class ImportFromNameList extends ImportFromTargets {
    private final String nodeName;
    private final int lineNumber;
    private ImportFromAsNames importFromAsNames;

    public ImportFromNameList(String nodeName, int lineNumber, ImportFromAsNames importFromAsNames) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.importFromAsNames = importFromAsNames;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ImportFromAsNames getImportFromAsNames() { return importFromAsNames; }
    public void setImportFromAsNames(ImportFromAsNames importFromAsNames) { this.importFromAsNames = importFromAsNames; }

    @Override
    public String toString() { return "ImportFromNameList"; }
}
