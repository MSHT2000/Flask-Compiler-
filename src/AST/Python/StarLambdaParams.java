package AST.Python;

public class StarLambdaParams extends LambdaParameters {
    private final String nodeName;
    private final int lineNumber;
    private LambdaStarEtc lambdaStarEtc;

    public StarLambdaParams(String nodeName, int lineNumber, LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaStarEtc = lambdaStarEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaStarEtc getLambdaStarEtc() { return lambdaStarEtc; }
    public void setLambdaStarEtc(LambdaStarEtc lambdaStarEtc) { this.lambdaStarEtc = lambdaStarEtc; }

    @Override
    public String toString() { return "StarLambdaParams"; }
}