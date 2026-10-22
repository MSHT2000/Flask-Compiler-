package AST.Python;

public class StarParamWithAnnotation extends StarEtc {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private ParamNoDefaultStarAnnotation paramNoDefaultStarAnnotation;
    private java.util.List<ParamMaybeDefault> paramMaybeDefault;
    private Kwds kwds;

    public StarParamWithAnnotation(String nodeName, int lineNumber, String STAR, ParamNoDefaultStarAnnotation paramNoDefaultStarAnnotation, java.util.List<ParamMaybeDefault> paramMaybeDefault, Kwds kwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.paramNoDefaultStarAnnotation = paramNoDefaultStarAnnotation;
        this.paramMaybeDefault = paramMaybeDefault;
        this.kwds = kwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }
    public ParamNoDefaultStarAnnotation getParamNoDefaultStarAnnotation() { return paramNoDefaultStarAnnotation; }
    public void setParamNoDefaultStarAnnotation(ParamNoDefaultStarAnnotation paramNoDefaultStarAnnotation) { this.paramNoDefaultStarAnnotation = paramNoDefaultStarAnnotation; }
    public java.util.List<ParamMaybeDefault> getParamMaybeDefault() { return paramMaybeDefault; }
    public void setParamMaybeDefault(java.util.List<ParamMaybeDefault> paramMaybeDefault) { this.paramMaybeDefault = paramMaybeDefault; }
    public Kwds getKwds() { return kwds; }
    public void setKwds(Kwds kwds) { this.kwds = kwds; }

    @Override
    public String toString() { return "StarParamWithAnnotation"; }
}
