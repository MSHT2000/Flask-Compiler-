package AST.Python;

public class AdditiveExpression extends Sum {
    private final String nodeName;
    private final int lineNumber;
    private Sum sum;
    private String PLUS;    // nullable — one of PLUS / MINUS is non-null
    private String MINUS;   // nullable
    private Term term;

    public AdditiveExpression(String nodeName, int lineNumber,
                              Sum sum,
                              String PLUS,
                              String MINUS,
                              Term term) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.sum = sum;
        this.PLUS = PLUS;
        this.MINUS = MINUS;
        this.term = term;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Sum getSum() { return sum; }
    public void setSum(Sum sum) { this.sum = sum; }

    public String getPLUS() { return PLUS; }
    public void setPLUS(String PLUS) { this.PLUS = PLUS; }

    public String getMINUS() { return MINUS; }
    public void setMINUS(String MINUS) { this.MINUS = MINUS; }

    public Term getTerm() { return term; }
    public void setTerm(Term term) { this.term = term; }

    @Override
    public String toString() { return "AdditiveExpression"; }
}