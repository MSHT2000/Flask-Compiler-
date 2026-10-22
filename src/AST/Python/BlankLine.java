package AST.Python;

public class BlankLine extends StatementNewline {
    private final String nodeName;
    private final int lineNumber;
    private String NEWLINE;

    public BlankLine(String nodeName, int lineNumber, String NEWLINE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NEWLINE = NEWLINE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }

    @Override
    public String toString() { return "BlankLine"; }
}
