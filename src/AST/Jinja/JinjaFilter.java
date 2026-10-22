package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaFilter extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaFilterStatement jinjaFilterStatement;

    public JinjaFilter(String nodeName, int lineNumber, JinjaFilterStatement jinjaFilterStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaFilterStatement = jinjaFilterStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaFilterStatement getJinjaFilterStatement() { return jinjaFilterStatement; }
    public void setJinjaFilterStatement(JinjaFilterStatement jinjaFilterStatement) { this.jinjaFilterStatement = jinjaFilterStatement; }

    @Override
    public String toString() { return "JinjaFilter"; }
}
