package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class GtOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_GT;

    public GtOperator(String nodeName, int lineNumber, String JINJA_GT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_GT = JINJA_GT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_GT() { return JINJA_GT; }
    public void setJINJA_GT(String JINJA_GT) { this.JINJA_GT = JINJA_GT; }

    @Override
    public String toString() { return "GtOperator"; }
}
