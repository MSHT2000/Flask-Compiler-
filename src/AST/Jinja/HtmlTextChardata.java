package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class HtmlTextChardata extends HtmlChardata {
    private String nodeName;
    private int lineNumber;
    private String HTML_TEXT;

    public HtmlTextChardata(String nodeName, int lineNumber, String HTML_TEXT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.HTML_TEXT = HTML_TEXT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getHTML_TEXT() { return HTML_TEXT; }
    public void setHTML_TEXT(String HTML_TEXT) { this.HTML_TEXT = HTML_TEXT; }

    @Override
    public String toString() { return "HtmlTextChardata"; }
}
