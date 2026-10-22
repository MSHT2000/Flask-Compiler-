package AST.Python;

public class BareStarParam extends StarEtc {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private String COMMA;
    private java.util.List<ParamMaybeDefault> paramMaybeDefault;
    private Kwds kwds;

    public BareStarParam(String nodeName, int lineNumber, String STAR, String COMMA, java.util.List<ParamMaybeDefault> paramMaybeDefault, Kwds kwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.COMMA = COMMA;
        this.paramMaybeDefault = paramMaybeDefault;
        this.kwds = kwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public java.util.List<ParamMaybeDefault> getParamMaybeDefault() { return paramMaybeDefault; }
    public void setParamMaybeDefault(java.util.List<ParamMaybeDefault> paramMaybeDefault) { this.paramMaybeDefault = paramMaybeDefault; }
    public Kwds getKwds() { return kwds; }
    public void setKwds(Kwds kwds) { this.kwds = kwds; }

    @Override
    public String toString() { return "BareStarParam"; }
}
