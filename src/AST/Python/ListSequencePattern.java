package AST.Python;

public class ListSequencePattern extends SequencePattern {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private MaybeSequencePattern maybeSequencePattern;
    private String RSQB;

    public ListSequencePattern(String nodeName, int lineNumber, String LSQB, MaybeSequencePattern maybeSequencePattern, String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.maybeSequencePattern = maybeSequencePattern;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }
    public MaybeSequencePattern getMaybeSequencePattern() { return maybeSequencePattern; }
    public void setMaybeSequencePattern(MaybeSequencePattern maybeSequencePattern) { this.maybeSequencePattern = maybeSequencePattern; }
    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "ListSequencePattern"; }
}
