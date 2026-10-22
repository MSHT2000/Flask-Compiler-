package AST.Python;

public class Param {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private Annotation annotation;

    public Param(String nodeName, int lineNumber, Name name, Annotation annotation) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.annotation = annotation;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public Annotation getAnnotation() { return annotation; }
    public void setAnnotation(Annotation annotation) { this.annotation = annotation; }

    @Override
    public String toString() { return "Param"; }
}
