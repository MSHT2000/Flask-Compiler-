package AST.Python;

public class Kwds {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private ParamNoDefault paramNoDefault;

    public Kwds(String nodeName, int lineNumber, String DOUBLESTAR, ParamNoDefault paramNoDefault) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.paramNoDefault = paramNoDefault;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }
    public ParamNoDefault getParamNoDefault() { return paramNoDefault; }
    public void setParamNoDefault(ParamNoDefault paramNoDefault) { this.paramNoDefault = paramNoDefault; }

    @Override
    public String toString() { return "Kwds"; }
}
