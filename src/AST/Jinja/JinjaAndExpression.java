package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaAndExpression {
    private String nodeName;
    private int lineNumber;
    private JinjaNotExpression first;
    private List<String> JINJA_AND;
    private List<JinjaNotExpression> operands;

    public JinjaAndExpression(String nodeName, int lineNumber, JinjaNotExpression first, List<String> JINJA_AND, List<JinjaNotExpression> operands) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.first = first;
        this.JINJA_AND = JINJA_AND;
        this.operands = operands;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaNotExpression getFirst() { return first; }
    public void setFirst(JinjaNotExpression first) { this.first = first; }
    public List<String> getJINJA_AND() { return JINJA_AND; }
    public void setJINJA_AND(List<String> JINJA_AND) { this.JINJA_AND = JINJA_AND; }
    public List<JinjaNotExpression> getOperands() { return operands; }
    public void setOperands(List<JinjaNotExpression> operands) { this.operands = operands; }

    @Override
    public String toString() { return "JinjaAndExpression"; }
}
