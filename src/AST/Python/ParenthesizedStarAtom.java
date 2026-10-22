package AST.Python;

public class ParenthesizedStarAtom extends StarAtom {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private TargetWithStarAtom targetWithStarAtom;
    private String RPAR;

    public ParenthesizedStarAtom(String nodeName, int lineNumber,
                                 String LPAR,
                                 TargetWithStarAtom targetWithStarAtom,
                                 String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.targetWithStarAtom = targetWithStarAtom;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public TargetWithStarAtom getTargetWithStarAtom() { return targetWithStarAtom; }
    public void setTargetWithStarAtom(TargetWithStarAtom targetWithStarAtom) {
        this.targetWithStarAtom = targetWithStarAtom;
    }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "ParenthesizedStarAtom"; }
}