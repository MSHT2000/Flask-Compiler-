package AST.Python;

public class ValuePattern {
    private final String nodeName;
    private final int lineNumber;
    private Attr attr;

    public ValuePattern(String nodeName, int lineNumber, Attr attr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.attr = attr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Attr getAttr() { return attr; }
    public void setAttr(Attr attr) { this.attr = attr; }

    @Override
    public String toString() { return "ValuePattern"; }
}
