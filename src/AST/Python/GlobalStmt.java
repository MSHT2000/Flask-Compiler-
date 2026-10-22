package AST.Python;

public class GlobalStmt {
    private final String nodeName;
    private final int lineNumber;
    private String GLOBAL;
    private java.util.List<Name> name;
    private java.util.List<String> COMMA;

    public GlobalStmt(String nodeName, int lineNumber, String GLOBAL, java.util.List<Name> name, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.GLOBAL = GLOBAL;
        this.name = name;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getGLOBAL() { return GLOBAL; }
    public void setGLOBAL(String GLOBAL) { this.GLOBAL = GLOBAL; }
    public java.util.List<Name> getName() { return name; }
    public void setName(java.util.List<Name> name) { this.name = name; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "GlobalStmt"; }
}
