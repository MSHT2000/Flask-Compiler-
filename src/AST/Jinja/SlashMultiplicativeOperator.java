package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SlashMultiplicativeOperator extends JinjaMultiplicativeOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_SLASH;

    public SlashMultiplicativeOperator(String nodeName, int lineNumber, String JINJA_SLASH) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_SLASH = JINJA_SLASH;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_SLASH() { return JINJA_SLASH; }
    public void setJINJA_SLASH(String JINJA_SLASH) { this.JINJA_SLASH = JINJA_SLASH; }

    @Override
    public String toString() { return "SlashMultiplicativeOperator"; }
}
