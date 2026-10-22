package AST.Python;

public class TStringMiddleText extends TstringMiddle {
    private final String nodeName;
    private final int lineNumber;
    private String TSTRING_MIDDLE;

    public TStringMiddleText(String nodeName, int lineNumber, String TSTRING_MIDDLE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TSTRING_MIDDLE = TSTRING_MIDDLE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getTSTRING_MIDDLE() { return TSTRING_MIDDLE; }
    public void setTSTRING_MIDDLE(String TSTRING_MIDDLE) { this.TSTRING_MIDDLE = TSTRING_MIDDLE; }

    @Override
    public String toString() { return "TStringMiddleText"; }
}