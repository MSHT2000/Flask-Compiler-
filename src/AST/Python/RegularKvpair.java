package AST.Python;

public class RegularKvpair extends DoubleStarredKvpair {
    private final String nodeName;
    private final int lineNumber;
    private Kvpair kvpair;

    public RegularKvpair(String nodeName, int lineNumber, Kvpair kvpair) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.kvpair = kvpair;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Kvpair getKvpair() { return kvpair; }
    public void setKvpair(Kvpair kvpair) { this.kvpair = kvpair; }

    @Override
    public String toString() { return "RegularKvpair"; }
}