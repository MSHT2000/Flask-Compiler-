package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CommentMisc extends HtmlMisc {
    private String nodeName;
    private int lineNumber;
    private HtmlComment htmlComment;

    public CommentMisc(String nodeName, int lineNumber, HtmlComment htmlComment) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlComment = htmlComment;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public HtmlComment getHtmlComment() { return htmlComment; }
    public void setHtmlComment(HtmlComment htmlComment) { this.htmlComment = htmlComment; }

    @Override
    public String toString() { return "CommentMisc"; }
}
