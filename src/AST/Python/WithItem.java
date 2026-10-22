package AST.Python;

public class WithItem {
    private final String nodeName;
    private final int lineNumber;
    private Expression expression;
    private String AS;
    private StarTarget starTarget;

    public WithItem(String nodeName, int lineNumber, Expression expression, String AS, StarTarget starTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.AS = AS;
        this.starTarget = starTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public String getAS() { return AS; }
    public void setAS(String AS) { this.AS = AS; }
    public StarTarget getStarTarget() { return starTarget; }
    public void setStarTarget(StarTarget starTarget) { this.starTarget = starTarget; }

    @Override
    public String toString() { return "WithItem"; }
}
