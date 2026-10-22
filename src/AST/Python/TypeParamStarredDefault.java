package AST.Python;

public class TypeParamStarredDefault {
    private final String nodeName;
    private final int lineNumber;
    private String EQUAL;
    private StarExpression starExpression;

    public TypeParamStarredDefault(String nodeName, int lineNumber, String EQUAL, StarExpression starExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EQUAL = EQUAL;
        this.starExpression = starExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public StarExpression getStarExpression() { return starExpression; }
    public void setStarExpression(StarExpression starExpression) { this.starExpression = starExpression; }

    @Override
    public String toString() { return "TypeParamStarredDefault"; }
}
