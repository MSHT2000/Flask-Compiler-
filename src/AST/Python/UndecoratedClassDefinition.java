package AST.Python;

public class UndecoratedClassDefinition extends ClassDef {
    private final String nodeName;
    private final int lineNumber;
    private ClassDefRaw classDefRaw;

    public UndecoratedClassDefinition(String nodeName, int lineNumber, ClassDefRaw classDefRaw) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.classDefRaw = classDefRaw;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ClassDefRaw getClassDefRaw() { return classDefRaw; }
    public void setClassDefRaw(ClassDefRaw classDefRaw) { this.classDefRaw = classDefRaw; }

    @Override
    public String toString() { return "UndecoratedClassDefinition"; }
}
