package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class RegularHtmlComment extends HtmlComment {
    private String nodeName;
    private int lineNumber;
    private String HTML_COMMENT;

    public RegularHtmlComment(String nodeName, int lineNumber, String HTML_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.HTML_COMMENT = HTML_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getHTML_COMMENT() { return HTML_COMMENT; }
    public void setHTML_COMMENT(String HTML_COMMENT) { this.HTML_COMMENT = HTML_COMMENT; }

    @Override
    public String toString() { return "RegularHtmlComment"; }
}
