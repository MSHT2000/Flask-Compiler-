package AST.Python;

public class CaseName extends NameExceptUnderscore {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_CASE;

    public CaseName(String nodeName, int lineNumber, String NAME_OR_CASE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_CASE = NAME_OR_CASE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_CASE() { return NAME_OR_CASE; }
    public void setNAME_OR_CASE(String NAME_OR_CASE) { this.NAME_OR_CASE = NAME_OR_CASE; }

    @Override
    public String toString() { return "CaseName"; }
}
