package AST.Python;

public class FileInput {
    private final String nodeName;
    private final int lineNumber;
    private Statements statements;
    private String EOF;

    public FileInput(String nodeName, int lineNumber, Statements statements, String EOF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.statements = statements;
        this.EOF = EOF;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Statements getStatements() { return statements; }
    public void setStatements(Statements statements) { this.statements = statements; }
    public String getEOF() { return EOF; }
    public void setEOF(String EOF) { this.EOF = EOF; }

    @Override
    public String toString() { return "FileInput"; }
}
