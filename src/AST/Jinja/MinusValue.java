package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class MinusValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String Minus;

    public MinusValue(String nodeName, int lineNumber, String Minus) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Minus = Minus;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getMinus() { return Minus; }
    public void setMinus(String Minus) { this.Minus = Minus; }

    @Override
    public String toString() { return "MinusValue"; }
}
