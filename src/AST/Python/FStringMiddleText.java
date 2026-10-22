package AST.Python;

public class FStringMiddleText extends FstringMiddle {
    private final String nodeName;
    private final int lineNumber;
    private String FSTRING_MIDDLE;

    public FStringMiddleText(String nodeName, int lineNumber, String FSTRING_MIDDLE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.FSTRING_MIDDLE = FSTRING_MIDDLE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getFSTRING_MIDDLE() { return FSTRING_MIDDLE; }
    public void setFSTRING_MIDDLE(String FSTRING_MIDDLE) { this.FSTRING_MIDDLE = FSTRING_MIDDLE; }

    @Override
    public String toString() { return "FStringMiddleText"; }
}