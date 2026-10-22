package AST.Python;

import java.util.List;

public class LambdaParamsWithDefaults extends LambdaParameters {
    private final String nodeName;
    private final int lineNumber;
    private List<LambdaParamWithDefault> lambdaParamWithDefault;
    private LambdaStarEtc lambdaStarEtc;   // nullable

    public LambdaParamsWithDefaults(String nodeName, int lineNumber,
                                    List<LambdaParamWithDefault> lambdaParamWithDefault,
                                    LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParamWithDefault = lambdaParamWithDefault;
        this.lambdaStarEtc = lambdaStarEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<LambdaParamWithDefault> getLambdaParamWithDefault() { return lambdaParamWithDefault; }
    public void setLambdaParamWithDefault(List<LambdaParamWithDefault> lambdaParamWithDefault) {
        this.lambdaParamWithDefault = lambdaParamWithDefault;
    }

    public LambdaStarEtc getLambdaStarEtc() { return lambdaStarEtc; }
    public void setLambdaStarEtc(LambdaStarEtc lambdaStarEtc) { this.lambdaStarEtc = lambdaStarEtc; }

    @Override
    public String toString() { return "LambdaParamsWithDefaults"; }
}