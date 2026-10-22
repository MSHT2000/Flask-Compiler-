package AST.Python;

public class AtomicStarTarget extends TargetWithStarAtom {
    private final String nodeName;
    private final int lineNumber;
    private StarAtom starAtom;

    public AtomicStarTarget(String nodeName, int lineNumber, StarAtom starAtom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starAtom = starAtom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public StarAtom getStarAtom() { return starAtom; }
    public void setStarAtom(StarAtom starAtom) { this.starAtom = starAtom; }

    @Override
    public String toString() { return "AtomicStarTarget"; }
}