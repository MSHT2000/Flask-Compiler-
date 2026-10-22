package AST.Python;

public class TrueLiteralExpr extends LiteralExpr {
    private final String nodeName;
    private final int lineNumber;
    private String TRUE;

    public TrueLiteralExpr(String nodeName, int lineNumber, String TRUE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TRUE = TRUE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getTRUE() { return TRUE; }
    public void setTRUE(String TRUE) { this.TRUE = TRUE; }

    @Override
    public String toString() { return "TrueLiteralExpr"; }
}
