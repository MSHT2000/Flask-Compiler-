package AST.Python;

public class MatchName extends NameExceptUnderscore {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_MATCH;

    public MatchName(String nodeName, int lineNumber, String NAME_OR_MATCH) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_MATCH = NAME_OR_MATCH;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_MATCH() { return NAME_OR_MATCH; }
    public void setNAME_OR_MATCH(String NAME_OR_MATCH) { this.NAME_OR_MATCH = NAME_OR_MATCH; }

    @Override
    public String toString() { return "MatchName"; }
}
