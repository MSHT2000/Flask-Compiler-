package AST.Python;

public class NoneLiteralExpr extends LiteralExpr {
    private final String nodeName;
    private final int lineNumber;
    private String NONE;

    public NoneLiteralExpr(String nodeName, int lineNumber, String NONE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NONE = NONE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNONE() { return NONE; }
    public void setNONE(String NONE) { this.NONE = NONE; }

    @Override
    public String toString() { return "NoneLiteralExpr"; }
}
