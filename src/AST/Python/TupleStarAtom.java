package AST.Python;

public class TupleStarAtom extends StarAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private StarTargetsTupleSeq starTargetsTupleSeq;   // nullable — null for "()"
    private String RPAR;

    public TupleStarAtom(String nodeName, int lineNumber,
                         String LPAR,
                         StarTargetsTupleSeq starTargetsTupleSeq,
                         String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.starTargetsTupleSeq = starTargetsTupleSeq;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public StarTargetsTupleSeq getStarTargetsTupleSeq() { return starTargetsTupleSeq; }
    public void setStarTargetsTupleSeq(StarTargetsTupleSeq starTargetsTupleSeq) {
        this.starTargetsTupleSeq = starTargetsTupleSeq;
    }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "TupleStarAtom"; }
}