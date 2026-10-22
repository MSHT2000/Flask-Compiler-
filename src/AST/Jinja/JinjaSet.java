package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaSet extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaSetStatement jinjaSetStatement;

    public JinjaSet(String nodeName, int lineNumber, JinjaSetStatement jinjaSetStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaSetStatement = jinjaSetStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaSetStatement getJinjaSetStatement() { return jinjaSetStatement; }
    public void setJinjaSetStatement(JinjaSetStatement jinjaSetStatement) { this.jinjaSetStatement = jinjaSetStatement; }

    @Override
    public String toString() { return "JinjaSet"; }
}
