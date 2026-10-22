package AST.Python;

public class ImportFromAsName {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Name> name;
    private String AS;

    public ImportFromAsName(String nodeName, int lineNumber, java.util.List<Name> name, String AS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.AS = AS;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Name> getName() { return name; }
    public void setName(java.util.List<Name> name) { this.name = name; }
    public String getAS() { return AS; }
    public void setAS(String AS) { this.AS = AS; }

    @Override
    public String toString() { return "ImportFromAsName"; }
}
