package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaRaw extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaRawStatement jinjaRawStatement;

    public JinjaRaw(String nodeName, int lineNumber, JinjaRawStatement jinjaRawStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaRawStatement = jinjaRawStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaRawStatement getJinjaRawStatement() { return jinjaRawStatement; }
    public void setJinjaRawStatement(JinjaRawStatement jinjaRawStatement) { this.jinjaRawStatement = jinjaRawStatement; }

    @Override
    public String toString() { return "JinjaRaw"; }
}
