package AST.Python;

import java.util.List;

public class BareStarLambdaParam extends LambdaStarEtc {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private String COMMA;
    private List<LambdaParamMaybeDefault> lambdaParamMaybeDefault;
    private LambdaKwds lambdaKwds;   // nullable

    public BareStarLambdaParam(String nodeName, int lineNumber,
                               String STAR,
                               String COMMA,
                               List<LambdaParamMaybeDefault> lambdaParamMaybeDefault,
                               LambdaKwds lambdaKwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.COMMA = COMMA;
        this.lambdaParamMaybeDefault = lambdaParamMaybeDefault;
        this.lambdaKwds = lambdaKwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    public List<LambdaParamMaybeDefault> getLambdaParamMaybeDefault() { return lambdaParamMaybeDefault; }
    public void setLambdaParamMaybeDefault(List<LambdaParamMaybeDefault> lambdaParamMaybeDefault) {
        this.lambdaParamMaybeDefault = lambdaParamMaybeDefault;
    }

    public LambdaKwds getLambdaKwds() { return lambdaKwds; }
    public void setLambdaKwds(LambdaKwds lambdaKwds) { this.lambdaKwds = lambdaKwds; }

    @Override
    public String toString() { return "BareStarLambdaParam"; }
}