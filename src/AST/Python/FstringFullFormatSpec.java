package AST.Python;

import java.util.List;

public class FstringFullFormatSpec {
    private final String nodeName;
    private final int lineNumber;
    private String COLON;
    private List<FstringFormatSpec> fstringFormatSpec;

    public FstringFullFormatSpec(String nodeName, int lineNumber,
                                 String COLON,
                                 List<FstringFormatSpec> fstringFormatSpec) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.COLON = COLON;
        this.fstringFormatSpec = fstringFormatSpec;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }

    public List<FstringFormatSpec> getFstringFormatSpec() { return fstringFormatSpec; }
    public void setFstringFormatSpec(List<FstringFormatSpec> fstringFormatSpec) {
        this.fstringFormatSpec = fstringFormatSpec;
    }

    @Override
    public String toString() { return "FstringFullFormatSpec"; }
}