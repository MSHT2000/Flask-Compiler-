package AST.Python;

public class PassStmt {
    private final String nodeName;
    private final int lineNumber;
    private String PASS;

    public PassStmt(String nodeName, int lineNumber, String PASS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.PASS = PASS;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getPASS() { return PASS; }
    public void setPASS(String PASS) { this.PASS = PASS; }

    @Override
    public String toString() { return "PassStmt"; }
}
