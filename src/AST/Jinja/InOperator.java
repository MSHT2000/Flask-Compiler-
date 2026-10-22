package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class InOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_IN;

    public InOperator(String nodeName, int lineNumber, String JINJA_IN) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_IN = JINJA_IN;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_IN() { return JINJA_IN; }
    public void setJINJA_IN(String JINJA_IN) { this.JINJA_IN = JINJA_IN; }

    @Override
    public String toString() { return "InOperator"; }
}
