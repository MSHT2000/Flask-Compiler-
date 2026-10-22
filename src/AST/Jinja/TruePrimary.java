package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TruePrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_TRUE;

    public TruePrimary(String nodeName, int lineNumber, String JINJA_TRUE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_TRUE = JINJA_TRUE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_TRUE() { return JINJA_TRUE; }
    public void setJINJA_TRUE(String JINJA_TRUE) { this.JINJA_TRUE = JINJA_TRUE; }

    @Override
    public String toString() { return "TruePrimary"; }
}
