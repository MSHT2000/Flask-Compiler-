package AST.Python;

public class ImportFromRelative extends ImportFrom {
    private final String nodeName;
    private final int lineNumber;
    private String FROM;
    private java.util.List<String> DOT;
    private java.util.List<String> ELLIPSIS;
    private String IMPORT;
    private ImportFromTargets importFromTargets;

    public ImportFromRelative(String nodeName, int lineNumber, String FROM, java.util.List<String> DOT, java.util.List<String> ELLIPSIS, String IMPORT, ImportFromTargets importFromTargets) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.FROM = FROM;
        this.DOT = DOT;
        this.ELLIPSIS = ELLIPSIS;
        this.IMPORT = IMPORT;
        this.importFromTargets = importFromTargets;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getFROM() { return FROM; }
    public void setFROM(String FROM) { this.FROM = FROM; }
    public java.util.List<String> getDOT() { return DOT; }
    public void setDOT(java.util.List<String> DOT) { this.DOT = DOT; }
    public java.util.List<String> getELLIPSIS() { return ELLIPSIS; }
    public void setELLIPSIS(java.util.List<String> ELLIPSIS) { this.ELLIPSIS = ELLIPSIS; }
    public String getIMPORT() { return IMPORT; }
    public void setIMPORT(String IMPORT) { this.IMPORT = IMPORT; }
    public ImportFromTargets getImportFromTargets() { return importFromTargets; }
    public void setImportFromTargets(ImportFromTargets importFromTargets) { this.importFromTargets = importFromTargets; }

    @Override
    public String toString() { return "ImportFromRelative"; }
}
