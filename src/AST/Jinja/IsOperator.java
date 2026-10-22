package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class IsOperator extends JinjaComparisonOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_IS;

    public IsOperator(String nodeName, int lineNumber, String JINJA_IS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_IS = JINJA_IS;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_IS() { return JINJA_IS; }
    public void setJINJA_IS(String JINJA_IS) { this.JINJA_IS = JINJA_IS; }

    @Override
    public String toString() { return "IsOperator"; }
}
