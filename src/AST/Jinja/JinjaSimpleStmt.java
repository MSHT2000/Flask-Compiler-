package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaSimpleStmt extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaSimpleStatement jinjaSimpleStatement;

    public JinjaSimpleStmt(String nodeName, int lineNumber, JinjaSimpleStatement jinjaSimpleStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaSimpleStatement = jinjaSimpleStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaSimpleStatement getJinjaSimpleStatement() { return jinjaSimpleStatement; }
    public void setJinjaSimpleStatement(JinjaSimpleStatement jinjaSimpleStatement) { this.jinjaSimpleStatement = jinjaSimpleStatement; }

    @Override
    public String toString() { return "JinjaSimpleStmt"; }
}
