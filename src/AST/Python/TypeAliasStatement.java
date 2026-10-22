package AST.Python;

public class TypeAliasStatement extends SimpleStmt {
    private final String nodeName;
    private final int lineNumber;
    private TypeAlias typeAlias;

    public TypeAliasStatement(String nodeName, int lineNumber, TypeAlias typeAlias) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.typeAlias = typeAlias;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public TypeAlias getTypeAlias() { return typeAlias; }
    public void setTypeAlias(TypeAlias typeAlias) { this.typeAlias = typeAlias; }

    @Override
    public String toString() { return "TypeAliasStatement"; }
}
