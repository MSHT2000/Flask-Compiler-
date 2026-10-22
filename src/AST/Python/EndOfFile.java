package AST.Python;

public class EndOfFile extends StatementNewline {
    private final String nodeName;
    private final int lineNumber;
    private String EOF;

    public EndOfFile(String nodeName, int lineNumber, String EOF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EOF = EOF;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getEOF() { return EOF; }
    public void setEOF(String EOF) { this.EOF = EOF; }

    @Override
    public String toString() { return "EndOfFile"; }
}
