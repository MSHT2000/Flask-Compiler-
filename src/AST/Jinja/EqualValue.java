package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class EqualValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String Equal;

    public EqualValue(String nodeName, int lineNumber, String Equal) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Equal = Equal;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getEqual() { return Equal; }
    public void setEqual(String Equal) { this.Equal = Equal; }

    @Override
    public String toString() { return "EqualValue"; }
}
