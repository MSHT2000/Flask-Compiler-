package AST.Python;

public class StarPattern {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private Name name;

    public StarPattern(String nodeName, int lineNumber, String STAR, Name name) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.name = name;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() { return "StarPattern"; }
}
