package AST.Python;

public class WildcardName extends Name {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_WILDCARD;

    public WildcardName(String nodeName, int lineNumber, String NAME_OR_WILDCARD) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_WILDCARD = NAME_OR_WILDCARD;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_WILDCARD() { return NAME_OR_WILDCARD; }
    public void setNAME_OR_WILDCARD(String NAME_OR_WILDCARD) { this.NAME_OR_WILDCARD = NAME_OR_WILDCARD; }

    @Override
    public String toString() { return "WildcardName"; }
}
