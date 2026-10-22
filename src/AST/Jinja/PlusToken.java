package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PlusToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String Plus;

    public PlusToken(String nodeName, int lineNumber, String Plus) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Plus = Plus;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getPlus() { return Plus; }
    public void setPlus(String Plus) { this.Plus = Plus; }

    @Override
    public String toString() { return "PlusToken"; }
}
