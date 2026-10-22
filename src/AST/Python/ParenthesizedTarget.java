package AST.Python;

public class ParenthesizedTarget extends SingleTarget {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private SingleTarget singleTarget;
    private String RPAR;

    public ParenthesizedTarget(String nodeName, int lineNumber,
                               String LPAR,
                               SingleTarget singleTarget,
                               String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.singleTarget = singleTarget;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public SingleTarget getSingleTarget() { return singleTarget; }
    public void setSingleTarget(SingleTarget singleTarget) { this.singleTarget = singleTarget; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "ParenthesizedTarget"; }
}