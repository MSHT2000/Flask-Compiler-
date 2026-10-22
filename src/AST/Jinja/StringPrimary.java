package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class StringPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STRING;

    public StringPrimary(String nodeName, int lineNumber, String JINJA_STRING) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STRING = JINJA_STRING;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STRING() { return JINJA_STRING; }
    public void setJINJA_STRING(String JINJA_STRING) { this.JINJA_STRING = JINJA_STRING; }

    @Override
    public String toString() { return "StringPrimary"; }
}
