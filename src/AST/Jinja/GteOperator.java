package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class GteOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_GE;

    public GteOperator(String nodeName, int lineNumber, String JINJA_GE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_GE = JINJA_GE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_GE() { return JINJA_GE; }
    public void setJINJA_GE(String JINJA_GE) { this.JINJA_GE = JINJA_GE; }

    @Override
    public String toString() { return "GteOperator"; }
}
