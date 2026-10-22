package AST.Python;

public class DottedAsNames {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<DottedAsName> dottedAsName;
    private java.util.List<String> COMMA;

    public DottedAsNames(String nodeName, int lineNumber, java.util.List<DottedAsName> dottedAsName, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.dottedAsName = dottedAsName;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<DottedAsName> getDottedAsName() { return dottedAsName; }
    public void setDottedAsName(java.util.List<DottedAsName> dottedAsName) { this.dottedAsName = dottedAsName; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "DottedAsNames"; }
}
