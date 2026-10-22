package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaFor extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaForStatement jinjaForStatement;

    public JinjaFor(String nodeName, int lineNumber, JinjaForStatement jinjaForStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaForStatement = jinjaForStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaForStatement getJinjaForStatement() { return jinjaForStatement; }
    public void setJinjaForStatement(JinjaForStatement jinjaForStatement) { this.jinjaForStatement = jinjaForStatement; }

    @Override
    public String toString() { return "JinjaFor"; }
}
