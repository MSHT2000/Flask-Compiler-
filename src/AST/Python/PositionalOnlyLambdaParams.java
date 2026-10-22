package AST.Python;

import java.util.List;

public class PositionalOnlyLambdaParams extends LambdaParameters {
    private final String nodeName;
    private final int lineNumber;
    private LambdaSlashNoDefault lambdaSlashNoDefault;
    private List<LambdaParamNoDefault> lambdaParamNoDefault;
    private List<LambdaParamWithDefault> lambdaParamWithDefault;
    private LambdaStarEtc lambdaStarEtc;   // nullable

    public PositionalOnlyLambdaParams(String nodeName, int lineNumber,
                                      LambdaSlashNoDefault lambdaSlashNoDefault,
                                      List<LambdaParamNoDefault> lambdaParamNoDefault,
                                      List<LambdaParamWithDefault> lambdaParamWithDefault,
                                      LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaSlashNoDefault = lambdaSlashNoDefault;
        this.lambdaParamNoDefault = lambdaParamNoDefault;
        this.lambdaParamWithDefault = lambdaParamWithDefault;
        this.lambdaStarEtc = lambdaStarEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaSlashNoDefault getLambdaSlashNoDefault() { return lambdaSlashNoDefault; }
    public void setLambdaSlashNoDefault(LambdaSlashNoDefault lambdaSlashNoDefault) {
        this.lambdaSlashNoDefault = lambdaSlashNoDefault;
    }

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
    public String toString() { return "PositionalOnlyLambdaParams"; }
}