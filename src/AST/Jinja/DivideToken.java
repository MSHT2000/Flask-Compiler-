package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DivideToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String Divide;

    public DivideToken(String nodeName, int lineNumber, String Divide) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Divide = Divide;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getDivide() { return Divide; }
    public void setDivide(String Divide) { this.Divide = Divide; }

    @Override
    public String toString() { return "DivideToken"; }
}
