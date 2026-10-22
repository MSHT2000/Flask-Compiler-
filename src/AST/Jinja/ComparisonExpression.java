package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ComparisonExpression extends JinjaNotExpression {
    private String nodeName;
    private int lineNumber;
    private JinjaComparison jinjaComparison;

    public ComparisonExpression(String nodeName, int lineNumber, JinjaComparison jinjaComparison) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaComparison = jinjaComparison;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaComparison getJinjaComparison() { return jinjaComparison; }
    public void setJinjaComparison(JinjaComparison jinjaComparison) { this.jinjaComparison = jinjaComparison; }

    @Override
    public String toString() { return "ComparisonExpression"; }
}
