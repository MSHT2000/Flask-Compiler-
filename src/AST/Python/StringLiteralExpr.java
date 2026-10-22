package AST.Python;

public class StringLiteralExpr extends LiteralExpr {
    private final String nodeName;
    private final int lineNumber;
    private Strings strings;

    public StringLiteralExpr(String nodeName, int lineNumber, Strings strings) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.strings = strings;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Strings getStrings() { return strings; }
    public void setStrings(Strings strings) { this.strings = strings; }

    @Override
    public String toString() { return "StringLiteralExpr"; }
}
