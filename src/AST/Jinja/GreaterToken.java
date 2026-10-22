package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class GreaterToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String Greater;

    public GreaterToken(String nodeName, int lineNumber, String Greater) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Greater = Greater;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getGreater() { return Greater; }
    public void setGreater(String Greater) { this.Greater = Greater; }

    @Override
    public String toString() { return "GreaterToken"; }
}
