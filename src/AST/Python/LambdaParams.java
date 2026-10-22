package AST.Python;

public class LambdaParams {
    private final String nodeName;
    private final int lineNumber;
    private LambdaParameters lambdaParameters;

    public LambdaParams(String nodeName, int lineNumber, LambdaParameters lambdaParameters) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParameters = lambdaParameters;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaParameters getLambdaParameters() { return lambdaParameters; }
    public void setLambdaParameters(LambdaParameters lambdaParameters) {
        this.lambdaParameters = lambdaParameters;
    }

    @Override
    public String toString() { return "LambdaParams"; }
}