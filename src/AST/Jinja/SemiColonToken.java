package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SemiColonToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String SemiColon;

    public SemiColonToken(String nodeName, int lineNumber, String SemiColon) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.SemiColon = SemiColon;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getSemiColon() { return SemiColon; }
    public void setSemiColon(String SemiColon) { this.SemiColon = SemiColon; }

    @Override
    public String toString() { return "SemiColonToken"; }
}
