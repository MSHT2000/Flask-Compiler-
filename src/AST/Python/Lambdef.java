package AST.Python;

public class Lambdef {
    private final String nodeName;
    private final int lineNumber;
    private String LAMBDA;
    private LambdaParams lambdaParams;   // nullable — may be null
    private String COLON;
    private Expression expression;

    public Lambdef(String nodeName, int lineNumber,
                   String LAMBDA,
                   LambdaParams lambdaParams,
                   String COLON,
                   Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LAMBDA = LAMBDA;
        this.lambdaParams = lambdaParams;
        this.COLON = COLON;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLAMBDA() { return LAMBDA; }
    public void setLAMBDA(String LAMBDA) { this.LAMBDA = LAMBDA; }

    public LambdaParams getLambdaParams() { return lambdaParams; }
    public void setLambdaParams(LambdaParams lambdaParams) { this.lambdaParams = lambdaParams; }

    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "Lambdef"; }
}