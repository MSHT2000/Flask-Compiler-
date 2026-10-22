package AST.Python;

public class SlashWithDefault {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<ParamNoDefault> paramNoDefault;
    private java.util.List<ParamWithDefault> paramWithDefault;
    private String SLASH;
    private String COMMA;

    public SlashWithDefault(String nodeName, int lineNumber, java.util.List<ParamNoDefault> paramNoDefault, java.util.List<ParamWithDefault> paramWithDefault, String SLASH, String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.paramNoDefault = paramNoDefault;
        this.paramWithDefault = paramWithDefault;
        this.SLASH = SLASH;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<ParamNoDefault> getParamNoDefault() { return paramNoDefault; }
    public void setParamNoDefault(java.util.List<ParamNoDefault> paramNoDefault) { this.paramNoDefault = paramNoDefault; }
    public java.util.List<ParamWithDefault> getParamWithDefault() { return paramWithDefault; }
    public void setParamWithDefault(java.util.List<ParamWithDefault> paramWithDefault) { this.paramWithDefault = paramWithDefault; }
    public String getSLASH() { return SLASH; }
    public void setSLASH(String SLASH) { this.SLASH = SLASH; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "SlashWithDefault"; }
}
