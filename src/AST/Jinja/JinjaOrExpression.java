package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaOrExpression {
    private String nodeName;
    private int lineNumber;
    private JinjaAndExpression first;
    private List<String> JINJA_OR;
    private List<JinjaAndExpression> operands;

    public JinjaOrExpression(String nodeName, int lineNumber, JinjaAndExpression first, List<String> JINJA_OR, List<JinjaAndExpression> operands) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.first = first;
        this.JINJA_OR = JINJA_OR;
        this.operands = operands;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaAndExpression getFirst() { return first; }
    public void setFirst(JinjaAndExpression first) { this.first = first; }
    public List<String> getJINJA_OR() { return JINJA_OR; }
    public void setJINJA_OR(List<String> JINJA_OR) { this.JINJA_OR = JINJA_OR; }
    public List<JinjaAndExpression> getOperands() { return operands; }
    public void setOperands(List<JinjaAndExpression> operands) { this.operands = operands; }

    @Override
    public String toString() { return "JinjaOrExpression"; }
}
