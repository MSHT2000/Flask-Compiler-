package AST.Python;

public class DecoratedClassDefinition extends ClassDef {
    private final String nodeName;
    private final int lineNumber;
    private Decorators decorators;
    private ClassDefRaw classDefRaw;

    public DecoratedClassDefinition(String nodeName, int lineNumber, Decorators decorators, ClassDefRaw classDefRaw) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.decorators = decorators;
        this.classDefRaw = classDefRaw;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Decorators getDecorators() { return decorators; }
    public void setDecorators(Decorators decorators) { this.decorators = decorators; }
    public ClassDefRaw getClassDefRaw() { return classDefRaw; }
    public void setClassDefRaw(ClassDefRaw classDefRaw) { this.classDefRaw = classDefRaw; }

    @Override
    public String toString() { return "DecoratedClassDefinition"; }
}
