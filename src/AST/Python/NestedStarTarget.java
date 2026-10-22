package AST.Python;

public class NestedStarTarget extends StarTarget {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private StarTarget starTarget;

    public NestedStarTarget(String nodeName, int lineNumber,
                            String STAR,
                            StarTarget starTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.starTarget = starTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public StarTarget getStarTarget() { return starTarget; }
    public void setStarTarget(StarTarget starTarget) { this.starTarget = starTarget; }

    @Override
    public String toString() { return "NestedStarTarget"; }
}