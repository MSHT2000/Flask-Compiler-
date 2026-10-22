package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class LtOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LT;

    public LtOperator(String nodeName, int lineNumber, String JINJA_LT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LT = JINJA_LT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LT() { return JINJA_LT; }
    public void setJINJA_LT(String JINJA_LT) { this.JINJA_LT = JINJA_LT; }

    @Override
    public String toString() { return "LtOperator"; }
}
