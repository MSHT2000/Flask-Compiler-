package AST.Python;

public class StarAnnotation {
    private final String nodeName;
    private final int lineNumber;
    private String COLON;
    private StarExpression starExpression;

    public StarAnnotation(String nodeName, int lineNumber, String COLON, StarExpression starExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.COLON = COLON;
        this.starExpression = starExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public StarExpression getStarExpression() { return starExpression; }
    public void setStarExpression(StarExpression starExpression) { this.starExpression = starExpression; }

    @Override
    public String toString() { return "StarAnnotation"; }
}
