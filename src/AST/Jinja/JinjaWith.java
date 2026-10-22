package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaWith extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaWithStatement jinjaWithStatement;

    public JinjaWith(String nodeName, int lineNumber, JinjaWithStatement jinjaWithStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaWithStatement = jinjaWithStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaWithStatement getJinjaWithStatement() { return jinjaWithStatement; }
    public void setJinjaWithStatement(JinjaWithStatement jinjaWithStatement) { this.jinjaWithStatement = jinjaWithStatement; }

    @Override
    public String toString() { return "JinjaWith"; }
}
