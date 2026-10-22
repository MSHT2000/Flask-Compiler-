package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DotValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String Dot;

    public DotValue(String nodeName, int lineNumber, String Dot) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Dot = Dot;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getDot() { return Dot; }
    public void setDot(String Dot) { this.Dot = Dot; }

    @Override
    public String toString() { return "DotValue"; }
}
