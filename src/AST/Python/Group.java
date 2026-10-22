package AST.Python;

public class Group {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private YieldExpr yieldExpr;                  // nullable
    private NamedExpression namedExpression;      // nullable
    private String RPAR;

    public Group(String nodeName, int lineNumber,
                 String LPAR,
                 YieldExpr yieldExpr,
                 NamedExpression namedExpression,
                 String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.yieldExpr = yieldExpr;
        this.namedExpression = namedExpression;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public YieldExpr getYieldExpr() { return yieldExpr; }
    public void setYieldExpr(YieldExpr yieldExpr) { this.yieldExpr = yieldExpr; }

    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) {
        this.namedExpression = namedExpression;
    }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "Group"; }
}