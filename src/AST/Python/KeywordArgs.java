package AST.Python;

public class KeywordArgs extends Args {
    private final String nodeName;
    private final int lineNumber;
    private Kwargs kwargs;

    public KeywordArgs(String nodeName, int lineNumber, Kwargs kwargs) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.kwargs = kwargs;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Kwargs getKwargs() { return kwargs; }
    public void setKwargs(Kwargs kwargs) { this.kwargs = kwargs; }

    @Override
    public String toString() { return "KeywordArgs"; }
}