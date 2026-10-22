package AST.Python;

public class StarExpressionStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private StarExpressions starExpressions;

    public StarExpressionStatement(String nodeName, int lineNumber, StarExpressions starExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starExpressions = starExpressions;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public StarExpressions getStarExpressions() { return starExpressions; }
    public void setStarExpressions(StarExpressions starExpressions) { this.starExpressions = starExpressions; }

    @Override
    public String toString() { return "StarExpressionStatement"; }
}
