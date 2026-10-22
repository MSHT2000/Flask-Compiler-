package AST.Python;

public class ChainedAssignment extends Assignment {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<StarTargets> starTargets;
    private java.util.List<String> EQUAL;
    private AnnotatedRhs annotatedRhs;
    private String TYPE_COMMENT;

    public ChainedAssignment(String nodeName, int lineNumber, java.util.List<StarTargets> starTargets, java.util.List<String> EQUAL, AnnotatedRhs annotatedRhs, String TYPE_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starTargets = starTargets;
        this.EQUAL = EQUAL;
        this.annotatedRhs = annotatedRhs;
        this.TYPE_COMMENT = TYPE_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<StarTargets> getStarTargets() { return starTargets; }
    public void setStarTargets(java.util.List<StarTargets> starTargets) { this.starTargets = starTargets; }
    public java.util.List<String> getEQUAL() { return EQUAL; }
    public void setEQUAL(java.util.List<String> EQUAL) { this.EQUAL = EQUAL; }
    public AnnotatedRhs getAnnotatedRhs() { return annotatedRhs; }
    public void setAnnotatedRhs(AnnotatedRhs annotatedRhs) { this.annotatedRhs = annotatedRhs; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }

    @Override
    public String toString() { return "ChainedAssignment"; }
}
