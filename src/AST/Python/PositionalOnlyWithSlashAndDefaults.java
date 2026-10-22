package AST.Python;

public class PositionalOnlyWithSlashAndDefaults extends Parameters {
    private final String nodeName;
    private final int lineNumber;
    private SlashWithDefault slashWithDefault;
    private java.util.List<ParamWithDefault> paramWithDefault;
    private StarEtc starEtc;

    public PositionalOnlyWithSlashAndDefaults(String nodeName, int lineNumber, SlashWithDefault slashWithDefault, java.util.List<ParamWithDefault> paramWithDefault, StarEtc starEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.slashWithDefault = slashWithDefault;
        this.paramWithDefault = paramWithDefault;
        this.starEtc = starEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SlashWithDefault getSlashWithDefault() { return slashWithDefault; }
    public void setSlashWithDefault(SlashWithDefault slashWithDefault) { this.slashWithDefault = slashWithDefault; }
    public java.util.List<ParamWithDefault> getParamWithDefault() { return paramWithDefault; }
    public void setParamWithDefault(java.util.List<ParamWithDefault> paramWithDefault) { this.paramWithDefault = paramWithDefault; }
    public StarEtc getStarEtc() { return starEtc; }
    public void setStarEtc(StarEtc starEtc) { this.starEtc = starEtc; }

    @Override
    public String toString() { return "PositionalOnlyWithSlashAndDefaults"; }
}
