package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CommentItem extends HtmlContentItem {
    private String nodeName;
    private int lineNumber;
    private HtmlComment htmlComment;

    public CommentItem(String nodeName, int lineNumber, HtmlComment htmlComment) {
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
    public String toString() { return "CommentItem"; }
}
