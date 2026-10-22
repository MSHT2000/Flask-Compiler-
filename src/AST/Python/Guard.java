package AST.Python;

public class Guard {
    private final String nodeName;
    private final int lineNumber;
    private String IF;
    private NamedExpression namedExpression;

    public Guard(String nodeName, int lineNumber, String IF, NamedExpression namedExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IF = IF;
        this.namedExpression = namedExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getIF() { return IF; }
    public void setIF(String IF) { this.IF = IF; }
    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) { this.namedExpression = namedExpression; }

    @Override
    public String toString() { return "Guard"; }
}
