package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class HtmlContent {
    private String nodeName;
    private int lineNumber;
    private List<HtmlContentItem> htmlContentItem;

    public HtmlContent(String nodeName, int lineNumber, List<HtmlContentItem> htmlContentItem) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlContentItem = htmlContentItem;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<HtmlContentItem> getHtmlContentItem() { return htmlContentItem; }
    public void setHtmlContentItem(List<HtmlContentItem> htmlContentItem) { this.htmlContentItem = htmlContentItem; }

    @Override
    public String toString() { return "HtmlContent"; }
}
