package AST.Python;

import java.util.List;

public class TstringFullFormatSpec {
    private final String nodeName;
    private final int lineNumber;
    private String COLON;
    private List<TstringFormatSpec> tstringFormatSpec;

    public TstringFullFormatSpec(String nodeName, int lineNumber,
                                 String COLON,
                                 List<TstringFormatSpec> tstringFormatSpec) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.COLON = COLON;
        this.tstringFormatSpec = tstringFormatSpec;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }

    public List<TstringFormatSpec> getTstringFormatSpec() { return tstringFormatSpec; }
    public void setTstringFormatSpec(List<TstringFormatSpec> tstringFormatSpec) {
        this.tstringFormatSpec = tstringFormatSpec;
    }

    @Override
    public String toString() { return "TstringFullFormatSpec"; }
}