package AST.Python;

public class BreakStmt {
    private final String nodeName;
    private final int lineNumber;
    private String BREAK;

    public BreakStmt(String nodeName, int lineNumber, String BREAK) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.BREAK = BREAK;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getBREAK() { return BREAK; }
    public void setBREAK(String BREAK) { this.BREAK = BREAK; }

    @Override
    public String toString() { return "BreakStmt"; }
}
