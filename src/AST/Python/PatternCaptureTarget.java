package AST.Python;

public class PatternCaptureTarget {
    private final String nodeName;
    private final int lineNumber;
    private NameExceptUnderscore nameExceptUnderscore;

    public PatternCaptureTarget(String nodeName, int lineNumber, NameExceptUnderscore nameExceptUnderscore) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.nameExceptUnderscore = nameExceptUnderscore;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public NameExceptUnderscore getNameExceptUnderscore() { return nameExceptUnderscore; }
    public void setNameExceptUnderscore(NameExceptUnderscore nameExceptUnderscore) { this.nameExceptUnderscore = nameExceptUnderscore; }

    @Override
    public String toString() { return "PatternCaptureTarget"; }
}
