package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaExpressionNode extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaExpression jinjaExpression;

    public JinjaExpressionNode(String nodeName, int lineNumber, JinjaExpression jinjaExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaExpression = jinjaExpression;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaExpression getJinjaExpression() { return jinjaExpression; }
    public void setJinjaExpression(JinjaExpression jinjaExpression) { this.jinjaExpression = jinjaExpression; }

    @Override
    public String toString() { return "JinjaExpressionNode"; }
}
