package AST.Python;

public class AtomOperand extends Primary {
    private final String nodeName;
    private final int lineNumber;
    private Atom atom;

    public AtomOperand(String nodeName, int lineNumber, Atom atom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.atom = atom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Atom getAtom() { return atom; }
    public void setAtom(Atom atom) { this.atom = atom; }

    @Override
    public String toString() { return "AtomOperand"; }
}