package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssPercentValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String CSS_PERCENT;

    public CssPercentValue(String nodeName, int lineNumber, String CSS_PERCENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_PERCENT = CSS_PERCENT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_PERCENT() { return CSS_PERCENT; }
    public void setCSS_PERCENT(String CSS_PERCENT) { this.CSS_PERCENT = CSS_PERCENT; }

    @Override
    public String toString() { return "CssPercentValue"; }
}
