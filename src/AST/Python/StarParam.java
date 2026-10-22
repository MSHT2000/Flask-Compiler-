package AST.Python;

public class StarParam extends StarEtc {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private ParamNoDefault paramNoDefault;
    private java.util.List<ParamMaybeDefault> paramMaybeDefault;
    private Kwds kwds;

    public StarParam(String nodeName, int lineNumber, String STAR, ParamNoDefault paramNoDefault, java.util.List<ParamMaybeDefault> paramMaybeDefault, Kwds kwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.paramNoDefault = paramNoDefault;
        this.paramMaybeDefault = paramMaybeDefault;
        this.kwds = kwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }
    public ParamNoDefault getParamNoDefault() { return paramNoDefault; }
    public void setParamNoDefault(ParamNoDefault paramNoDefault) { this.paramNoDefault = paramNoDefault; }
    public java.util.List<ParamMaybeDefault> getParamMaybeDefault() { return paramMaybeDefault; }
    public void setParamMaybeDefault(java.util.List<ParamMaybeDefault> paramMaybeDefault) { this.paramMaybeDefault = paramMaybeDefault; }
    public Kwds getKwds() { return kwds; }
    public void setKwds(Kwds kwds) { this.kwds = kwds; }

    @Override
    public String toString() { return "StarParam"; }
}
