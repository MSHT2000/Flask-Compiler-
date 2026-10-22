package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TildeValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String Tilde;

    public TildeValue(String nodeName, int lineNumber, String Tilde) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Tilde = Tilde;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getTilde() { return Tilde; }
    public void setTilde(String Tilde) { this.Tilde = Tilde; }

    @Override
    public String toString() { return "TildeValue"; }
}
