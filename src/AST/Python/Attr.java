package AST.Python;

public class Attr {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Name> name;
    private java.util.List<String> DOT;

    public Attr(String nodeName, int lineNumber, java.util.List<Name> name, java.util.List<String> DOT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.DOT = DOT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Name> getName() { return name; }
    public void setName(java.util.List<Name> name) { this.name = name; }
    public java.util.List<String> getDOT() { return DOT; }
    public void setDOT(java.util.List<String> DOT) { this.DOT = DOT; }

    @Override
    public String toString() { return "Attr"; }
}
