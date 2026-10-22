package AST.Python;

public class ListDelAtom extends DelTAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private DelTargets delTargets;   // nullable — may be null for "[]"
    private String RSQB;

    public ListDelAtom(String nodeName, int lineNumber,
                       String LSQB,
                       DelTargets delTargets,
                       String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.delTargets = delTargets;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public DelTargets getDelTargets() { return delTargets; }
    public void setDelTargets(DelTargets delTargets) { this.delTargets = delTargets; }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "ListDelAtom"; }
}