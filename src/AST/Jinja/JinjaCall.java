package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaCall extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaCallStatement jinjaCallStatement;

    public JinjaCall(String nodeName, int lineNumber, JinjaCallStatement jinjaCallStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaCallStatement = jinjaCallStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaCallStatement getJinjaCallStatement() { return jinjaCallStatement; }
    public void setJinjaCallStatement(JinjaCallStatement jinjaCallStatement) { this.jinjaCallStatement = jinjaCallStatement; }

    @Override
    public String toString() { return "JinjaCall"; }
}
