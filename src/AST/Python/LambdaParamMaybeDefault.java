package AST.Python;

public class LambdaParamMaybeDefault {
    private final String nodeName;
    private final int lineNumber;
    private LambdaParam lambdaParam;
    private DefaultAssignment defaultAssignment;   // nullable
    private String COMMA;                          // nullable

    public LambdaParamMaybeDefault(String nodeName, int lineNumber,
                                   LambdaParam lambdaParam,
                                   DefaultAssignment defaultAssignment,
                                   String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParam = lambdaParam;
        this.defaultAssignment = defaultAssignment;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public LambdaParam getLambdaParam() { return lambdaParam; }
    public void setLambdaParam(LambdaParam lambdaParam) { this.lambdaParam = lambdaParam; }

    public DefaultAssignment getDefaultAssignment() { return defaultAssignment; }
    public void setDefaultAssignment(DefaultAssignment defaultAssignment) {
        this.defaultAssignment = defaultAssignment;
    }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "LambdaParamMaybeDefault"; }
}