package AST.Python;

public class DottedAsName {
    private final String nodeName;
    private final int lineNumber;
    private DottedName dottedName;
    private String AS;
    private Name name;

    public DottedAsName(String nodeName, int lineNumber, DottedName dottedName, String AS, Name name) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.dottedName = dottedName;
        this.AS = AS;
        this.name = name;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public DottedName getDottedName() { return dottedName; }
    public void setDottedName(DottedName dottedName) { this.dottedName = dottedName; }
    public String getAS() { return AS; }
    public void setAS(String AS) { this.AS = AS; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() { return "DottedAsName"; }
}
