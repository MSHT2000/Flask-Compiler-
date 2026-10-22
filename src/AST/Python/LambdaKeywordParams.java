package AST.Python;

public class LambdaKeywordParams extends LambdaStarEtc {
    private final String nodeName;
    private final int lineNumber;
    private LambdaKwds lambdaKwds;

    public LambdaKeywordParams(String nodeName, int lineNumber, LambdaKwds lambdaKwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaKwds = lambdaKwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaKwds getLambdaKwds() { return lambdaKwds; }
    public void setLambdaKwds(LambdaKwds lambdaKwds) { this.lambdaKwds = lambdaKwds; }

    @Override
    public String toString() { return "LambdaKeywordParams"; }
}