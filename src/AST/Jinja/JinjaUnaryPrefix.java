package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaUnaryPrefix {
    private String nodeName;
    private int lineNumber;
    private JinjaUnaryOperator jinjaUnaryOperator;
    private JinjaUnary jinjaUnary;

    public JinjaUnaryPrefix(String nodeName, int lineNumber, JinjaUnaryOperator jinjaUnaryOperator, JinjaUnary jinjaUnary) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaUnaryOperator = jinjaUnaryOperator;
        this.jinjaUnary = jinjaUnary;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaUnaryOperator getJinjaUnaryOperator() { return jinjaUnaryOperator; }
    public void setJinjaUnaryOperator(JinjaUnaryOperator jinjaUnaryOperator) { this.jinjaUnaryOperator = jinjaUnaryOperator; }
    public JinjaUnary getJinjaUnary() { return jinjaUnary; }
    public void setJinjaUnary(JinjaUnary jinjaUnary) { this.jinjaUnary = jinjaUnary; }

    @Override
    public String toString() { return "JinjaUnaryPrefix"; }
}
