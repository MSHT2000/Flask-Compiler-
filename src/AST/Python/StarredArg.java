package AST.Python;

public class StarredArg extends KwargOrStarred {
    private final String nodeName;
    private final int lineNumber;
    private StarredExpression starredExpression;

    public StarredArg(String nodeName, int lineNumber,
                      StarredExpression starredExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starredExpression = starredExpression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public StarredExpression getStarredExpression() { return starredExpression; }
    public void setStarredExpression(StarredExpression starredExpression) {
        this.starredExpression = starredExpression;
    }

    @Override
    public String toString() { return "StarredArg"; }
}