package AST.Python;

public class Eval {
    private final String nodeName;
    private final int lineNumber;
    private Expressions expressions;
    private java.util.List<String> NEWLINE;
    private String EOF;

    public Eval(String nodeName, int lineNumber, Expressions expressions, java.util.List<String> NEWLINE, String EOF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expressions = expressions;
        this.NEWLINE = NEWLINE;
        this.EOF = EOF;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Expressions getExpressions() { return expressions; }
    public void setExpressions(Expressions expressions) { this.expressions = expressions; }
    public java.util.List<String> getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(java.util.List<String> NEWLINE) { this.NEWLINE = NEWLINE; }
    public String getEOF() { return EOF; }
    public void setEOF(String EOF) { this.EOF = EOF; }

    @Override
    public String toString() { return "Eval"; }
}
