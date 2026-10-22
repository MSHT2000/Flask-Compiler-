package AST.Python;

public class AtomicDelTarget extends DelTarget {
    private final String nodeName;
    private final int lineNumber;
    private DelTAtom delTAtom;

    public AtomicDelTarget(String nodeName, int lineNumber, DelTAtom delTAtom) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.delTAtom = delTAtom;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public DelTAtom getDelTAtom() { return delTAtom; }
    public void setDelTAtom(DelTAtom delTAtom) { this.delTAtom = delTAtom; }

    @Override
    public String toString() { return "AtomicDelTarget"; }
}