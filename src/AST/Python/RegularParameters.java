package AST.Python;

public class RegularParameters extends Parameters {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<ParamNoDefault> paramNoDefault;
    private java.util.List<ParamWithDefault> paramWithDefault;
    private StarEtc starEtc;

    public RegularParameters(String nodeName, int lineNumber, java.util.List<ParamNoDefault> paramNoDefault, java.util.List<ParamWithDefault> paramWithDefault, StarEtc starEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.paramNoDefault = paramNoDefault;
        this.paramWithDefault = paramWithDefault;
        this.starEtc = starEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<ParamNoDefault> getParamNoDefault() { return paramNoDefault; }
    public void setParamNoDefault(java.util.List<ParamNoDefault> paramNoDefault) { this.paramNoDefault = paramNoDefault; }
    public java.util.List<ParamWithDefault> getParamWithDefault() { return paramWithDefault; }
    public void setParamWithDefault(java.util.List<ParamWithDefault> paramWithDefault) { this.paramWithDefault = paramWithDefault; }
    public StarEtc getStarEtc() { return starEtc; }
    public void setStarEtc(StarEtc starEtc) { this.starEtc = starEtc; }

    @Override
    public String toString() { return "RegularParameters"; }
}
