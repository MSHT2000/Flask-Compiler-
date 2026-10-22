package AST.Python;

public class FuncType {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private TypeExpressions typeExpressions;
    private String RPAR;
    private String RARROW;
    private Expression expression;
    private java.util.List<String> NEWLINE;
    private String EOF;

    public FuncType(String nodeName, int lineNumber, String LPAR, TypeExpressions typeExpressions, String RPAR, String RARROW, Expression expression, java.util.List<String> NEWLINE, String EOF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.typeExpressions = typeExpressions;
        this.RPAR = RPAR;
        this.RARROW = RARROW;
        this.expression = expression;
        this.NEWLINE = NEWLINE;
        this.EOF = EOF;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public TypeExpressions getTypeExpressions() { return typeExpressions; }
    public void setTypeExpressions(TypeExpressions typeExpressions) { this.typeExpressions = typeExpressions; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }
    public String getRARROW() { return RARROW; }
    public void setRARROW(String RARROW) { this.RARROW = RARROW; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public java.util.List<String> getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(java.util.List<String> NEWLINE) { this.NEWLINE = NEWLINE; }
    public String getEOF() { return EOF; }
    public void setEOF(String EOF) { this.EOF = EOF; }

    @Override
    public String toString() { return "FuncType"; }
}
