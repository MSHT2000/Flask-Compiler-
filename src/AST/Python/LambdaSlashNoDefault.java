package AST.Python;

import java.util.List;

public class LambdaSlashNoDefault {
    private final String nodeName;
    private final int lineNumber;
    private List<LambdaParamNoDefault> lambdaParamNoDefault;
    private String SLASH;
    private String COMMA;   // nullable

    public LambdaSlashNoDefault(String nodeName, int lineNumber,
                                List<LambdaParamNoDefault> lambdaParamNoDefault,
                                String SLASH,
                                String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParamNoDefault = lambdaParamNoDefault;
        this.SLASH = SLASH;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<LambdaParamNoDefault> getLambdaParamNoDefault() { return lambdaParamNoDefault; }
    public void setLambdaParamNoDefault(List<LambdaParamNoDefault> lambdaParamNoDefault) {
        this.lambdaParamNoDefault = lambdaParamNoDefault;
    }

    public String getSLASH() { return SLASH; }
    public void setSLASH(String SLASH) { this.SLASH = SLASH; }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "LambdaSlashNoDefault"; }
}