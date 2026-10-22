package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssStringValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String CSS_STRING;

    public CssStringValue(String nodeName, int lineNumber, String CSS_STRING) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_STRING = CSS_STRING;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_STRING() { return CSS_STRING; }
    public void setCSS_STRING(String CSS_STRING) { this.CSS_STRING = CSS_STRING; }

    @Override
    public String toString() { return "CssStringValue"; }
}
