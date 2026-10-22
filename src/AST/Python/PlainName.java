package AST.Python;

public class PlainName extends NameExceptUnderscore {
    private final String nodeName;
    private final int lineNumber;
    private String NAME;

    public PlainName(String nodeName, int lineNumber, String NAME) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME = NAME;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME() { return NAME; }
    public void setNAME(String NAME) { this.NAME = NAME; }

    @Override
    public String toString() { return "PlainName"; }
}
