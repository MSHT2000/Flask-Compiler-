package AST.Python;

public class ClassDefinition extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private ClassDef classDef;

    public ClassDefinition(String nodeName, int lineNumber, ClassDef classDef) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.classDef = classDef;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ClassDef getClassDef() { return classDef; }
    public void setClassDef(ClassDef classDef) { this.classDef = classDef; }

    @Override
    public String toString() { return "ClassDefinition"; }
}
