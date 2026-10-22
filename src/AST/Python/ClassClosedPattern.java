package AST.Python;

public class ClassClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private ClassPattern classPattern;

    public ClassClosedPattern(String nodeName, int lineNumber, ClassPattern classPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.classPattern = classPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ClassPattern getClassPattern() { return classPattern; }
    public void setClassPattern(ClassPattern classPattern) { this.classPattern = classPattern; }

    @Override
    public String toString() { return "ClassClosedPattern"; }
}
