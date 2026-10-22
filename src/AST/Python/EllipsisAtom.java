package AST.Python;

public class EllipsisAtom extends Atom {
    private final String nodeName;
    private final int lineNumber;
    private String ELLIPSIS;

    public EllipsisAtom(String nodeName, int lineNumber, String ELLIPSIS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ELLIPSIS = ELLIPSIS;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getELLIPSIS() { return ELLIPSIS; }
    public void setELLIPSIS(String ELLIPSIS) { this.ELLIPSIS = ELLIPSIS; }

    @Override
    public String toString() { return "EllipsisAtom"; }
}