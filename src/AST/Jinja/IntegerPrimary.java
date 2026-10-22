package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class IntegerPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_INTEGER;

    public IntegerPrimary(String nodeName, int lineNumber, String JINJA_INTEGER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_INTEGER = JINJA_INTEGER;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_INTEGER() { return JINJA_INTEGER; }
    public void setJINJA_INTEGER(String JINJA_INTEGER) { this.JINJA_INTEGER = JINJA_INTEGER; }

    @Override
    public String toString() { return "IntegerPrimary"; }
}
