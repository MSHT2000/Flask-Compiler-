package AST.Python;

public class MultiplicativeExpression extends Term {
    private final String nodeName;
    private final int lineNumber;
    private Term term;
    private String STAR;          // nullable — exactly one of the five is non-null
    private String SLASH;         // nullable
    private String DOUBLESLASH;   // nullable
    private String PERCENT;       // nullable
    private String AT;            // nullable
    private Factor factor;

    public MultiplicativeExpression(String nodeName, int lineNumber,
                                    Term term,
                                    String STAR,
                                    String SLASH,
                                    String DOUBLESLASH,
                                    String PERCENT,
                                    String AT,
                                    Factor factor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.term = term;
        this.STAR = STAR;
        this.SLASH = SLASH;
        this.DOUBLESLASH = DOUBLESLASH;
        this.PERCENT = PERCENT;
        this.AT = AT;
        this.factor = factor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Term getTerm() { return term; }
    public void setTerm(Term term) { this.term = term; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public String getSLASH() { return SLASH; }
    public void setSLASH(String SLASH) { this.SLASH = SLASH; }

    public String getDOUBLESLASH() { return DOUBLESLASH; }
    public void setDOUBLESLASH(String DOUBLESLASH) { this.DOUBLESLASH = DOUBLESLASH; }

    public String getPERCENT() { return PERCENT; }
    public void setPERCENT(String PERCENT) { this.PERCENT = PERCENT; }

    public String getAT() { return AT; }
    public void setAT(String AT) { this.AT = AT; }

    public Factor getFactor() { return factor; }
    public void setFactor(Factor factor) { this.factor = factor; }

    @Override
    public String toString() { return "MultiplicativeExpression"; }
}