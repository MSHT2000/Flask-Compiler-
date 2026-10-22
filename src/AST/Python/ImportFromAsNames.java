package AST.Python;

public class ImportFromAsNames {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<ImportFromAsName> importFromAsName;
    private java.util.List<String> COMMA;

    public ImportFromAsNames(String nodeName, int lineNumber, java.util.List<ImportFromAsName> importFromAsName, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.importFromAsName = importFromAsName;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<ImportFromAsName> getImportFromAsName() { return importFromAsName; }
    public void setImportFromAsName(java.util.List<ImportFromAsName> importFromAsName) { this.importFromAsName = importFromAsName; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "ImportFromAsNames"; }
}
