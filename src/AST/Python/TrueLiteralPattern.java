package AST.Python;

public class TrueLiteralPattern extends LiteralPattern {
    private final String nodeName;
    private final int lineNumber;
    private String TRUE;

    public TrueLiteralPattern(String nodeName, int lineNumber, String TRUE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TRUE = TRUE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getTRUE() { return TRUE; }
    public void setTRUE(String TRUE) { this.TRUE = TRUE; }

    @Override
    public String toString() { return "TrueLiteralPattern"; }
}
