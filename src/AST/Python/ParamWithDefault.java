package AST.Python;

public class ParamWithDefault {
    private final String nodeName;
    private final int lineNumber;
    private Param param;
    private DefaultAssignment defaultAssignment;
    private String COMMA;
    private String TYPE_COMMENT;

    public ParamWithDefault(String nodeName, int lineNumber, Param param, DefaultAssignment defaultAssignment, String COMMA, String TYPE_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.param = param;
        this.defaultAssignment = defaultAssignment;
        this.COMMA = COMMA;
        this.TYPE_COMMENT = TYPE_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Param getParam() { return param; }
    public void setParam(Param param) { this.param = param; }
    public DefaultAssignment getDefaultAssignment() { return defaultAssignment; }
    public void setDefaultAssignment(DefaultAssignment defaultAssignment) { this.defaultAssignment = defaultAssignment; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }

    @Override
    public String toString() { return "ParamWithDefault"; }
}
