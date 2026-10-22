package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaBlock extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaBlockStatement jinjaBlockStatement;

    public JinjaBlock(String nodeName, int lineNumber, JinjaBlockStatement jinjaBlockStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaBlockStatement = jinjaBlockStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaBlockStatement getJinjaBlockStatement() { return jinjaBlockStatement; }
    public void setJinjaBlockStatement(JinjaBlockStatement jinjaBlockStatement) { this.jinjaBlockStatement = jinjaBlockStatement; }

    @Override
    public String toString() { return "JinjaBlock"; }
}
