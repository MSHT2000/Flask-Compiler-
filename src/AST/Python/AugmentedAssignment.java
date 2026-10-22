package AST.Python;

public class AugmentedAssignment extends Assignment {
    private final String nodeName;
    private final int lineNumber;
    private SingleTarget singleTarget;
    private Augassign augassign;
    private AnnotatedRhs annotatedRhs;

    public AugmentedAssignment(String nodeName, int lineNumber, SingleTarget singleTarget, Augassign augassign, AnnotatedRhs annotatedRhs) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.singleTarget = singleTarget;
        this.augassign = augassign;
        this.annotatedRhs = annotatedRhs;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SingleTarget getSingleTarget() { return singleTarget; }
    public void setSingleTarget(SingleTarget singleTarget) { this.singleTarget = singleTarget; }
    public Augassign getAugassign() { return augassign; }
    public void setAugassign(Augassign augassign) { this.augassign = augassign; }
    public AnnotatedRhs getAnnotatedRhs() { return annotatedRhs; }
    public void setAnnotatedRhs(AnnotatedRhs annotatedRhs) { this.annotatedRhs = annotatedRhs; }

    @Override
    public String toString() { return "AugmentedAssignment"; }
}
