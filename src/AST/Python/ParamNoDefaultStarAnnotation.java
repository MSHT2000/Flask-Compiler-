package AST.Python;

public class ParamNoDefaultStarAnnotation {
    private final String nodeName;
    private final int lineNumber;
    private ParamStarAnnotation paramStarAnnotation;
    private String COMMA;
    private String TYPE_COMMENT;

    public ParamNoDefaultStarAnnotation(String nodeName, int lineNumber, ParamStarAnnotation paramStarAnnotation, String COMMA, String TYPE_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.paramStarAnnotation = paramStarAnnotation;
        this.COMMA = COMMA;
        this.TYPE_COMMENT = TYPE_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ParamStarAnnotation getParamStarAnnotation() { return paramStarAnnotation; }
    public void setParamStarAnnotation(ParamStarAnnotation paramStarAnnotation) { this.paramStarAnnotation = paramStarAnnotation; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }

    @Override
    public String toString() { return "ParamNoDefaultStarAnnotation"; }
}
