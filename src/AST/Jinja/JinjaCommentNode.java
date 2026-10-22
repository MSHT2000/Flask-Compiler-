package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaCommentNode extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaComment jinjaComment;

    public JinjaCommentNode(String nodeName, int lineNumber, JinjaComment jinjaComment) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaComment = jinjaComment;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaComment getJinjaComment() { return jinjaComment; }
    public void setJinjaComment(JinjaComment jinjaComment) { this.jinjaComment = jinjaComment; }

    @Override
    public String toString() { return "JinjaCommentNode"; }
}
