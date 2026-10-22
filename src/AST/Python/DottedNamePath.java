package AST.Python;

public class DottedNamePath extends DottedName {
    private final String nodeName;
    private final int lineNumber;
    private DottedName dottedName;
    private String DOT;
    private Name name;

    public DottedNamePath(String nodeName, int lineNumber, DottedName dottedName, String DOT, Name name) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.dottedName = dottedName;
        this.DOT = DOT;
        this.name = name;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public DottedName getDottedName() { return dottedName; }
    public void setDottedName(DottedName dottedName) { this.dottedName = dottedName; }
    public String getDOT() { return DOT; }
    public void setDOT(String DOT) { this.DOT = DOT; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() { return "DottedNamePath"; }
}
