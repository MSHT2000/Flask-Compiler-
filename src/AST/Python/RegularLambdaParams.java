package AST.Python;

import java.util.List;

public class RegularLambdaParams extends LambdaParameters {
    private final String nodeName;
    private final int lineNumber;
    private List<LambdaParamNoDefault> lambdaParamNoDefault;
    private List<LambdaParamWithDefault> lambdaParamWithDefault;
    private LambdaStarEtc lambdaStarEtc;   // nullable

    public RegularLambdaParams(String nodeName, int lineNumber,
                               List<LambdaParamNoDefault> lambdaParamNoDefault,
                               List<LambdaParamWithDefault> lambdaParamWithDefault,
                               LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParamNoDefault = lambdaParamNoDefault;
        this.lambdaParamWithDefault = lambdaParamWithDefault;
        this.lambdaStarEtc = lambdaStarEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<LambdaParamNoDefault> getLambdaParamNoDefault() { return lambdaParamNoDefault; }
    public void setLambdaParamNoDefault(List<LambdaParamNoDefault> lambdaParamNoDefault) {
        this.lambdaParamNoDefault = lambdaParamNoDefault;
    }

    public List<LambdaParamWithDefault> getLambdaParamWithDefault() { return lambdaParamWithDefault; }
    public void setLambdaParamWithDefault(List<LambdaParamWithDefault> lambdaParamWithDefault) {
        this.lambdaParamWithDefault = lambdaParamWithDefault;
    }

    public LambdaStarEtc getLambdaStarEtc() { return lambdaStarEtc; }
    public void setLambdaStarEtc(LambdaStarEtc lambdaStarEtc) { this.lambdaStarEtc = lambdaStarEtc; }

    @Override
    public String toString() { return "RegularLambdaParams"; }
}