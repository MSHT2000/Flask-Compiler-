package AST.Python;

public class FalseLiteralPattern extends LiteralPattern {
    private final String nodeName;
    private final int lineNumber;
    private String FALSE;

    public FalseLiteralPattern(String nodeName, int lineNumber, String FALSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.FALSE = FALSE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getFALSE() { return FALSE; }
    public void setFALSE(String FALSE) { this.FALSE = FALSE; }

    @Override
    public String toString() { return "FalseLiteralPattern"; }
}
