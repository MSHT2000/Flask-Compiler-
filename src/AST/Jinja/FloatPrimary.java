package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FloatPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_FLOAT;

    public FloatPrimary(String nodeName, int lineNumber, String JINJA_FLOAT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_FLOAT = JINJA_FLOAT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_FLOAT() { return JINJA_FLOAT; }
    public void setJINJA_FLOAT(String JINJA_FLOAT) { this.JINJA_FLOAT = JINJA_FLOAT; }

    @Override
    public String toString() { return "FloatPrimary"; }
}
