package AST.Python;

public class LambdaKwds {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private LambdaParamNoDefault lambdaParamNoDefault;

    public LambdaKwds(String nodeName, int lineNumber,
                      String DOUBLESTAR,
                      LambdaParamNoDefault lambdaParamNoDefault) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.lambdaParamNoDefault = lambdaParamNoDefault;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    public LambdaParamNoDefault getLambdaParamNoDefault() { return lambdaParamNoDefault; }
    public void setLambdaParamNoDefault(LambdaParamNoDefault lambdaParamNoDefault) {
        this.lambdaParamNoDefault = lambdaParamNoDefault;
    }

    @Override
    public String toString() { return "LambdaKwds"; }
}