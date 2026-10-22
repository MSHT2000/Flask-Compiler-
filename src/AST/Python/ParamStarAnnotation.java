package AST.Python;

public class ParamStarAnnotation {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private StarAnnotation starAnnotation;

    public ParamStarAnnotation(String nodeName, int lineNumber, Name name, StarAnnotation starAnnotation) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.starAnnotation = starAnnotation;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public StarAnnotation getStarAnnotation() { return starAnnotation; }
    public void setStarAnnotation(StarAnnotation starAnnotation) { this.starAnnotation = starAnnotation; }

    @Override
    public String toString() { return "ParamStarAnnotation"; }
}
