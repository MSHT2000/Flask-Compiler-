package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class EqOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_EQ;

    public EqOperator(String nodeName, int lineNumber, String JINJA_EQ) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_EQ = JINJA_EQ;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_EQ() { return JINJA_EQ; }
    public void setJINJA_EQ(String JINJA_EQ) { this.JINJA_EQ = JINJA_EQ; }

    @Override
    public String toString() { return "EqOperator"; }
}
