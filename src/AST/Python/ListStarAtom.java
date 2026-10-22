package AST.Python;

public class ListStarAtom extends StarAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private StarTargetsListSeq starTargetsListSeq;   // nullable — null for "[]"
    private String RSQB;

    public ListStarAtom(String nodeName, int lineNumber,
                        String LSQB,
                        StarTargetsListSeq starTargetsListSeq,
                        String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.starTargetsListSeq = starTargetsListSeq;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public StarTargetsListSeq getStarTargetsListSeq() { return starTargetsListSeq; }
    public void setStarTargetsListSeq(StarTargetsListSeq starTargetsListSeq) {
        this.starTargetsListSeq = starTargetsListSeq;
    }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "ListStarAtom"; }
}