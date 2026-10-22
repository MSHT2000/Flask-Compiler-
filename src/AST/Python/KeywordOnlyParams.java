package AST.Python;

public class KeywordOnlyParams extends StarEtc {
    private final String nodeName;
    private final int lineNumber;
    private Kwds kwds;

    public KeywordOnlyParams(String nodeName, int lineNumber, Kwds kwds) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.kwds = kwds;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Kwds getKwds() { return kwds; }
    public void setKwds(Kwds kwds) { this.kwds = kwds; }

    @Override
    public String toString() { return "KeywordOnlyParams"; }
}
