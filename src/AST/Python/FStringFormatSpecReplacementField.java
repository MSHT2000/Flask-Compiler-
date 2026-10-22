package AST.Python;

public class FStringFormatSpecReplacementField extends FstringFormatSpec {
    private final String nodeName;
    private final int lineNumber;
    private FstringReplacementField fstringReplacementField;

    public FStringFormatSpecReplacementField(String nodeName, int lineNumber,
                                             FstringReplacementField fstringReplacementField) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.fstringReplacementField = fstringReplacementField;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public FstringReplacementField getFstringReplacementField() {
        return fstringReplacementField;
    }
    public void setFstringReplacementField(FstringReplacementField fstringReplacementField) {
        this.fstringReplacementField = fstringReplacementField;
    }

    @Override
    public String toString() { return "FStringFormatSpecReplacementField"; }
}