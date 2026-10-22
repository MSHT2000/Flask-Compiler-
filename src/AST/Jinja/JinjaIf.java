package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaIf extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaIfStatement jinjaIfStatement;

    public JinjaIf(String nodeName, int lineNumber, JinjaIfStatement jinjaIfStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaIfStatement = jinjaIfStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaIfStatement getJinjaIfStatement() { return jinjaIfStatement; }
    public void setJinjaIfStatement(JinjaIfStatement jinjaIfStatement) { this.jinjaIfStatement = jinjaIfStatement; }

    @Override
    public String toString() { return "JinjaIf"; }
}
