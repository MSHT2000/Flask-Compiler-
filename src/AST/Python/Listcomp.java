package AST.Python;

public class Listcomp {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private NamedExpression namedExpression;
    private ForIfClauses forIfClauses;
    private String RSQB;

    public Listcomp(String nodeName, int lineNumber,
                    String LSQB,
                    NamedExpression namedExpression,
                    ForIfClauses forIfClauses,
                    String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.namedExpression = namedExpression;
        this.forIfClauses = forIfClauses;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) {
        this.namedExpression = namedExpression;
    }

    public ForIfClauses getForIfClauses() { return forIfClauses; }
    public void setForIfClauses(ForIfClauses forIfClauses) { this.forIfClauses = forIfClauses; }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "Listcomp"; }
}