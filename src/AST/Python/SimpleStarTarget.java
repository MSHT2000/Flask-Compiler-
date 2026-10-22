package AST.Python;

public class SimpleStarTarget extends StarTarget {
    private final String nodeName;
    private final int lineNumber;
    private TargetWithStarAtom targetWithStarAtom;

    public SimpleStarTarget(String nodeName, int lineNumber,
                            TargetWithStarAtom targetWithStarAtom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.targetWithStarAtom = targetWithStarAtom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public TargetWithStarAtom getTargetWithStarAtom() { return targetWithStarAtom; }
    public void setTargetWithStarAtom(TargetWithStarAtom targetWithStarAtom) {
        this.targetWithStarAtom = targetWithStarAtom;
    }

    @Override
    public String toString() { return "SimpleStarTarget"; }
}