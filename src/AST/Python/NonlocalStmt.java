package AST.Python;

public class NonlocalStmt {
    private final String nodeName;
    private final int lineNumber;
    private String NONLOCAL;
    private java.util.List<Name> name;
    private java.util.List<String> COMMA;

    public NonlocalStmt(String nodeName, int lineNumber, String NONLOCAL, java.util.List<Name> name, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NONLOCAL = NONLOCAL;
        this.name = name;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNONLOCAL() { return NONLOCAL; }
    public void setNONLOCAL(String NONLOCAL) { this.NONLOCAL = NONLOCAL; }
    public java.util.List<Name> getName() { return name; }
    public void setName(java.util.List<Name> name) { this.name = name; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "NonlocalStmt"; }
}
