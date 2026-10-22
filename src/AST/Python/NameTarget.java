package AST.Python;

public class NameTarget extends SingleTarget {
    private final String nodeName;
    private final int lineNumber;
    private Name name;

    public NameTarget(String nodeName, int lineNumber, Name name) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() { return "NameTarget"; }
}