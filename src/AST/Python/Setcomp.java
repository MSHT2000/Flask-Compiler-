package AST.Python;

public class Setcomp {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private NamedExpression namedExpression;
    private ForIfClauses forIfClauses;
    private String RBRACE;

    public Setcomp(String nodeName, int lineNumber,
                   String LBRACE,
                   NamedExpression namedExpression,
                   ForIfClauses forIfClauses,
                   String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.namedExpression = namedExpression;
        this.forIfClauses = forIfClauses;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }

    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) {
        this.namedExpression = namedExpression;
    }

    public ForIfClauses getForIfClauses() { return forIfClauses; }
    public void setForIfClauses(ForIfClauses forIfClauses) { this.forIfClauses = forIfClauses; }

    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "Setcomp"; }
}