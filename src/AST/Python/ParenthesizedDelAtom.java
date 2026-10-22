package AST.Python;

public class ParenthesizedDelAtom extends DelTAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private DelTarget delTarget;
    private String RPAR;

    public ParenthesizedDelAtom(String nodeName, int lineNumber,
                                String LPAR,
                                DelTarget delTarget,
                                String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.delTarget = delTarget;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public DelTarget getDelTarget() { return delTarget; }
    public void setDelTarget(DelTarget delTarget) { this.delTarget = delTarget; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "ParenthesizedDelAtom"; }
}