package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ConditionalHtmlComment extends HtmlComment {
    private String nodeName;
    private int lineNumber;
    private String HTML_CONDITIONAL_COMMENT;

    public ConditionalHtmlComment(String nodeName, int lineNumber, String HTML_CONDITIONAL_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.HTML_CONDITIONAL_COMMENT = HTML_CONDITIONAL_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getHTML_CONDITIONAL_COMMENT() { return HTML_CONDITIONAL_COMMENT; }
    public void setHTML_CONDITIONAL_COMMENT(String HTML_CONDITIONAL_COMMENT) { this.HTML_CONDITIONAL_COMMENT = HTML_CONDITIONAL_COMMENT; }

    @Override
    public String toString() { return "ConditionalHtmlComment"; }
}
