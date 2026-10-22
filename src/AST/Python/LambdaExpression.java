package AST.Python;

public class LambdaExpression extends Expression {
    private final String nodeName;
    private final int lineNumber;
    private Lambdef lambdef;

    public LambdaExpression(String nodeName, int lineNumber, Lambdef lambdef) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdef = lambdef;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Lambdef getLambdef() { return lambdef; }
    public void setLambdef(Lambdef lambdef) { this.lambdef = lambdef; }

    @Override
    public String toString() { return "LambdaExpression"; }
}
