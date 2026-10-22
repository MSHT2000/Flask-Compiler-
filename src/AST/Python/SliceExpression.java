package AST.Python;

public class SliceExpression extends Slice {
    private final String nodeName;
    private final int lineNumber;
    private NamedExpression namedExpression;

    public SliceExpression(String nodeName, int lineNumber, NamedExpression namedExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.namedExpression = namedExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) {
        this.namedExpression = namedExpression;
    }

    @Override
    public String toString() { return "SliceExpression"; }
}