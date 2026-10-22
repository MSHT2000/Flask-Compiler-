package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaComparison {
    private String nodeName;
    private int lineNumber;
    private JinjaAdditive first;
    private List<JinjaComparisonOperator> operators;
    private List<JinjaAdditive> operands;

    public JinjaComparison(String nodeName, int lineNumber, JinjaAdditive first, List<JinjaComparisonOperator> operators, List<JinjaAdditive> operands) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.first = first;
        this.operators = operators;
        this.operands = operands;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaAdditive getFirst() { return first; }
    public void setFirst(JinjaAdditive first) { this.first = first; }
    public List<JinjaComparisonOperator> getOperators() { return operators; }
    public void setOperators(List<JinjaComparisonOperator> operators) { this.operators = operators; }
    public List<JinjaAdditive> getOperands() { return operands; }
    public void setOperands(List<JinjaAdditive> operands) { this.operands = operands; }

    @Override
    public String toString() { return "JinjaComparison"; }
}
