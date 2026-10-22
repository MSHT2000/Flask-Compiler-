package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FalsePrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_FALSE;

    public FalsePrimary(String nodeName, int lineNumber, String JINJA_FALSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_FALSE = JINJA_FALSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_FALSE() { return JINJA_FALSE; }
    public void setJINJA_FALSE(String JINJA_FALSE) { this.JINJA_FALSE = JINJA_FALSE; }

    @Override
    public String toString() { return "FalsePrimary"; }
}
