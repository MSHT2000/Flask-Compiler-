package AST.Python;

public class KeyValuePattern {
    private final String nodeName;
    private final int lineNumber;
    private LiteralExpr literalExpr;
    private Attr attr;
    private String COLON;
    private Pattern pattern;

    public KeyValuePattern(String nodeName, int lineNumber, LiteralExpr literalExpr, Attr attr, String COLON, Pattern pattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.literalExpr = literalExpr;
        this.attr = attr;
        this.COLON = COLON;
        this.pattern = pattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public LiteralExpr getLiteralExpr() { return literalExpr; }
    public void setLiteralExpr(LiteralExpr literalExpr) { this.literalExpr = literalExpr; }
    public Attr getAttr() { return attr; }
    public void setAttr(Attr attr) { this.attr = attr; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Pattern getPattern() { return pattern; }
    public void setPattern(Pattern pattern) { this.pattern = pattern; }

    @Override
    public String toString() { return "KeyValuePattern"; }
}
