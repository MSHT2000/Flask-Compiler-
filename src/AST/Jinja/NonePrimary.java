package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class NonePrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_NONE;

    public NonePrimary(String nodeName, int lineNumber, String JINJA_NONE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_NONE = JINJA_NONE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_NONE() { return JINJA_NONE; }
    public void setJINJA_NONE(String JINJA_NONE) { this.JINJA_NONE = JINJA_NONE; }

    @Override
    public String toString() { return "NonePrimary"; }
}
