package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssValue {
    private String nodeName;
    private int lineNumber;
    private List<CssValuePart> parts;

    public CssValue(String nodeName, int lineNumber, List<CssValuePart> parts) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.parts = parts;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<CssValuePart> getParts() { return parts; }
    public void setParts(List<CssValuePart> parts) { this.parts = parts; }

    @Override
    public String toString() { return "CssValue"; }
}
