package AST.Python;

public class SimpleStmts {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<SimpleStmt> simpleStmt;
    private java.util.List<String> SEMI;
    private String NEWLINE;

    public SimpleStmts(String nodeName, int lineNumber, java.util.List<SimpleStmt> simpleStmt, java.util.List<String> SEMI, String NEWLINE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.simpleStmt = simpleStmt;
        this.SEMI = SEMI;
        this.NEWLINE = NEWLINE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<SimpleStmt> getSimpleStmt() { return simpleStmt; }
    public void setSimpleStmt(java.util.List<SimpleStmt> simpleStmt) { this.simpleStmt = simpleStmt; }
    public java.util.List<String> getSEMI() { return SEMI; }
    public void setSEMI(java.util.List<String> SEMI) { this.SEMI = SEMI; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }

    @Override
    public String toString() { return "SimpleStmts"; }
}
