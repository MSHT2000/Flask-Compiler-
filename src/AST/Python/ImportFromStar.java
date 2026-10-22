package AST.Python;

public class ImportFromStar extends ImportFromTargets {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;

    public ImportFromStar(String nodeName, int lineNumber, String STAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    @Override
    public String toString() { return "ImportFromStar"; }
}
