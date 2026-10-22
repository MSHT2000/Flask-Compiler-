package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssImportantToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String CSS_IMPORTANT;

    public CssImportantToken(String nodeName, int lineNumber, String CSS_IMPORTANT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_IMPORTANT = CSS_IMPORTANT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_IMPORTANT() { return CSS_IMPORTANT; }
    public void setCSS_IMPORTANT(String CSS_IMPORTANT) { this.CSS_IMPORTANT = CSS_IMPORTANT; }

    @Override
    public String toString() { return "CssImportantToken"; }
}
