package AST.Python;

public class DoubleStarredArg extends KwargOrDoubleStarred {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private Expression expression;

    public DoubleStarredArg(String nodeName, int lineNumber,
                            String DOUBLESTAR,
                            Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "DoubleStarredArg"; }
}