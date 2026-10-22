package AST.Python;

import java.util.List;

public class PositionalOnlyWithDefaultsLambdaParams extends LambdaParameters {
    private final String nodeName;
    private final int lineNumber;
    private LambdaSlashWithDefault lambdaSlashWithDefault;
    private List<LambdaParamWithDefault> lambdaParamWithDefault;
    private LambdaStarEtc lambdaStarEtc;   // nullable

    public PositionalOnlyWithDefaultsLambdaParams(
            String nodeName, int lineNumber,
            LambdaSlashWithDefault lambdaSlashWithDefault,
            List<LambdaParamWithDefault> lambdaParamWithDefault,
            LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaSlashWithDefault = lambdaSlashWithDefault;
        this.lambdaParamWithDefault = lambdaParamWithDefault;
        this.lambdaStarEtc = lambdaStarEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaSlashWithDefault getLambdaSlashWithDefault() { return lambdaSlashWithDefault; }
    public void setLambdaSlashWithDefault(LambdaSlashWithDefault lambdaSlashWithDefault) {
        this.lambdaSlashWithDefault = lambdaSlashWithDefault;
    }

    public List<LambdaParamWithDefault> getLambdaParamWithDefault() { return lambdaParamWithDefault; }
    public void setLambdaParamWithDefault(List<LambdaParamWithDefault> lambdaParamWithDefault) {
        this.lambdaParamWithDefault = lambdaParamWithDefault;
    }

    public LambdaStarEtc getLambdaStarEtc() { return lambdaStarEtc; }
    public void setLambdaStarEtc(LambdaStarEtc lambdaStarEtc) { this.lambdaStarEtc = lambdaStarEtc; }

    @Override
    public String toString() { return "PositionalOnlyWithDefaultsLambdaParams"; }
}