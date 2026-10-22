package AST.Python;

public class ImportName {
    private final String nodeName;
    private final int lineNumber;
    private String IMPORT;
    private DottedAsNames dottedAsNames;

    public ImportName(String nodeName, int lineNumber, String IMPORT, DottedAsNames dottedAsNames) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IMPORT = IMPORT;
        this.dottedAsNames = dottedAsNames;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getIMPORT() { return IMPORT; }
    public void setIMPORT(String IMPORT) { this.IMPORT = IMPORT; }
    public DottedAsNames getDottedAsNames() { return dottedAsNames; }
    public void setDottedAsNames(DottedAsNames dottedAsNames) { this.dottedAsNames = dottedAsNames; }

    @Override
    public String toString() { return "ImportName"; }
}
