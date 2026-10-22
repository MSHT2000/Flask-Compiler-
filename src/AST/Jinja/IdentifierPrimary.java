package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class IdentifierPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_IDENTIFIER;

    public IdentifierPrimary(String nodeName, int lineNumber, String JINJA_IDENTIFIER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_IDENTIFIER = JINJA_IDENTIFIER;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_IDENTIFIER() { return JINJA_IDENTIFIER; }
    public void setJINJA_IDENTIFIER(String JINJA_IDENTIFIER) { this.JINJA_IDENTIFIER = JINJA_IDENTIFIER; }

    @Override
    public String toString() { return "IdentifierPrimary"; }
}
