package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class LteOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LE;

    public LteOperator(String nodeName, int lineNumber, String JINJA_LE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LE = JINJA_LE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LE() { return JINJA_LE; }
    public void setJINJA_LE(String JINJA_LE) { this.JINJA_LE = JINJA_LE; }

    @Override
    public String toString() { return "LteOperator"; }
}
