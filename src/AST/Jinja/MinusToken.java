package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class MinusToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String Minus;

    public MinusToken(String nodeName, int lineNumber, String Minus) {
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
    public String toString() { return "MinusToken"; }
}
