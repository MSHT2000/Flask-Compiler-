package AST.Python;

public class Decorators {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<String> AT;
    private java.util.List<NamedExpression> namedExpression;
    private java.util.List<String> NEWLINE;

    public Decorators(String nodeName, int lineNumber, java.util.List<String> AT, java.util.List<NamedExpression> namedExpression, java.util.List<String> NEWLINE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.AT = AT;
        this.namedExpression = namedExpression;
        this.NEWLINE = NEWLINE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<String> getAT() { return AT; }
    public void setAT(java.util.List<String> AT) { this.AT = AT; }
    public java.util.List<NamedExpression> getNamedExpression() { return namedExpression; }
    public void setNamedExpression(java.util.List<NamedExpression> namedExpression) { this.namedExpression = namedExpression; }
    public java.util.List<String> getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(java.util.List<String> NEWLINE) { this.NEWLINE = NEWLINE; }

    @Override
    public String toString() { return "Decorators"; }
}
