package AST.Python;

public class TupleSequencePattern extends SequencePattern {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private OpenSequencePattern openSequencePattern;
    private String RPAR;

    public TupleSequencePattern(String nodeName, int lineNumber, String LPAR, OpenSequencePattern openSequencePattern, String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.openSequencePattern = openSequencePattern;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public OpenSequencePattern getOpenSequencePattern() { return openSequencePattern; }
    public void setOpenSequencePattern(OpenSequencePattern openSequencePattern) { this.openSequencePattern = openSequencePattern; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "TupleSequencePattern"; }
}
