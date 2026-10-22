package AST.Python;

public class StarExpressions {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<StarExpression> starExpression;
    private java.util.List<String> COMMA;

    public StarExpressions(String nodeName, int lineNumber, java.util.List<StarExpression> starExpression, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starExpression = starExpression;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<StarExpression> getStarExpression() { return starExpression; }
    public void setStarExpression(java.util.List<StarExpression> starExpression) { this.starExpression = starExpression; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "StarExpressions"; }
}
