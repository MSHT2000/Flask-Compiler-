package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class MultiplyValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String Multiply;

    public MultiplyValue(String nodeName, int lineNumber, String Multiply) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Multiply = Multiply;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getMultiply() { return Multiply; }
    public void setMultiply(String Multiply) { this.Multiply = Multiply; }

    @Override
    public String toString() { return "MultiplyValue"; }
}
