package AST.Python;

import java.util.List;

public class StarLambdaParam extends LambdaStarEtc {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private LambdaParamNoDefault lambdaParamNoDefault;
    private List<LambdaParamMaybeDefault> lambdaParamMaybeDefault;
    private LambdaKwds lambdaKwds;   // nullable

    public StarLambdaParam(String nodeName, int lineNumber,
                           String STAR,
                           LambdaParamNoDefault lambdaParamNoDefault,
                           List<LambdaParamMaybeDefault> lambdaParamMaybeDefault,
                           LambdaKwds lambdaKwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.lambdaParamNoDefault = lambdaParamNoDefault;
        this.lambdaParamMaybeDefault = lambdaParamMaybeDefault;
        this.lambdaKwds = lambdaKwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public LambdaParamNoDefault getLambdaParamNoDefault() { return lambdaParamNoDefault; }
    public void setLambdaParamNoDefault(LambdaParamNoDefault lambdaParamNoDefault) {
        this.lambdaParamNoDefault = lambdaParamNoDefault;
    }

    public List<LambdaParamMaybeDefault> getLambdaParamMaybeDefault() { return lambdaParamMaybeDefault; }
    public void setLambdaParamMaybeDefault(List<LambdaParamMaybeDefault> lambdaParamMaybeDefault) {
        this.lambdaParamMaybeDefault = lambdaParamMaybeDefault;
    }

    public LambdaKwds getLambdaKwds() { return lambdaKwds; }
    public void setLambdaKwds(LambdaKwds lambdaKwds) { this.lambdaKwds = lambdaKwds; }

    @Override
    public String toString() { return "StarLambdaParam"; }
}