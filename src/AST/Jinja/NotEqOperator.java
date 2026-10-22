package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class NotEqOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_NEQ;

    public NotEqOperator(String nodeName, int lineNumber, String JINJA_NEQ) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_NEQ = JINJA_NEQ;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_NEQ() { return JINJA_NEQ; }
    public void setJINJA_NEQ(String JINJA_NEQ) { this.JINJA_NEQ = JINJA_NEQ; }

    @Override
    public String toString() { return "NotEqOperator"; }
}
