package AST.Python;

public class TPrimaryAtom extends TPrimary {
    private final String nodeName;
    private final int lineNumber;
    private Atom atom;

    public TPrimaryAtom(String nodeName, int lineNumber, Atom atom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.atom = atom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Atom getAtom() { return atom; }
    public void setAtom(Atom atom) { this.atom = atom; }

    @Override
    public String toString() { return "TPrimaryAtom"; }
}