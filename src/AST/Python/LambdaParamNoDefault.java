package AST.Python;

public class LambdaParamNoDefault {
    private final String nodeName;
    private final int lineNumber;
    private LambdaParam lambdaParam;
    private String COMMA;   // nullable

    public LambdaParamNoDefault(String nodeName, int lineNumber,
                                LambdaParam lambdaParam,
                                String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParam = lambdaParam;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaParam getLambdaParam() { return lambdaParam; }
    public void setLambdaParam(LambdaParam lambdaParam) { this.lambdaParam = lambdaParam; }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "LambdaParamNoDefault"; }
}