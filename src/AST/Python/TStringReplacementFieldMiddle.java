package AST.Python;

public class TStringReplacementFieldMiddle extends TstringMiddle {
    private final String nodeName;
    private final int lineNumber;
    private TstringReplacementField tstringReplacementField;

    public TStringReplacementFieldMiddle(String nodeName, int lineNumber,
                                         TstringReplacementField tstringReplacementField) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tstringReplacementField = tstringReplacementField;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public TstringReplacementField getTstringReplacementField() {
        return tstringReplacementField;
    }
    public void setTstringReplacementField(TstringReplacementField tstringReplacementField) {
        this.tstringReplacementField = tstringReplacementField;
    }

    @Override
    public String toString() { return "TStringReplacementFieldMiddle"; }
}