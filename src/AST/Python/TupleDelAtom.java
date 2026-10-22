package AST.Python;

public class TupleDelAtom extends DelTAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private DelTargets delTargets;   // nullable — may be null for "()"
    private String RPAR;

    public TupleDelAtom(String nodeName, int lineNumber,
                        String LPAR,
                        DelTargets delTargets,
                        String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.delTargets = delTargets;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public DelTargets getDelTargets() { return delTargets; }
    public void setDelTargets(DelTargets delTargets) { this.delTargets = delTargets; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "TupleDelAtom"; }
}