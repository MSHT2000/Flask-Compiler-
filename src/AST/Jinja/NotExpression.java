package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class NotExpression extends JinjaNotExpression {
    private String nodeName;
    private int lineNumber;
    private String JINJA_NOT;
    private JinjaNotExpression jinjaNotExpression;

    public NotExpression(String nodeName, int lineNumber, String JINJA_NOT, JinjaNotExpression jinjaNotExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_NOT = JINJA_NOT;
        this.jinjaNotExpression = jinjaNotExpression;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_NOT() { return JINJA_NOT; }
    public void setJINJA_NOT(String JINJA_NOT) { this.JINJA_NOT = JINJA_NOT; }
    public JinjaNotExpression getJinjaNotExpression() { return jinjaNotExpression; }
    public void setJinjaNotExpression(JinjaNotExpression jinjaNotExpression) { this.jinjaNotExpression = jinjaNotExpression; }

    @Override
    public String toString() { return "NotExpression"; }
}
