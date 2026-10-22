package AST.Python;

public class RegularStarNamedExpression extends StarNamedExpression {
    private final String nodeName;
    private final int lineNumber;
    private NamedExpression namedExpression;

    public RegularStarNamedExpression(String nodeName, int lineNumber,
                                      NamedExpression namedExpression) {
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
    public String toString() { return "RegularStarNamedExpression"; }
}