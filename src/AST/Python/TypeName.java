package AST.Python;

public class TypeName extends NameExceptUnderscore {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_TYPE;

    public TypeName(String nodeName, int lineNumber, String NAME_OR_TYPE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_TYPE = NAME_OR_TYPE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_TYPE() { return NAME_OR_TYPE; }
    public void setNAME_OR_TYPE(String NAME_OR_TYPE) { this.NAME_OR_TYPE = NAME_OR_TYPE; }

    @Override
    public String toString() { return "TypeName"; }
}
