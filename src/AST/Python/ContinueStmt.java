package AST.Python;

public class ContinueStmt {
    private final String nodeName;
    private final int lineNumber;
    private String CONTINUE;

    public ContinueStmt(String nodeName, int lineNumber, String CONTINUE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CONTINUE = CONTINUE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getCONTINUE() { return CONTINUE; }
    public void setCONTINUE(String CONTINUE) { this.CONTINUE = CONTINUE; }

    @Override
    public String toString() { return "ContinueStmt"; }
}
