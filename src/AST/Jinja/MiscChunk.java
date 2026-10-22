package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class MiscChunk extends TemplateChunk {
    private String nodeName;
    private int lineNumber;
    private HtmlMisc htmlMisc;

    public MiscChunk(String nodeName, int lineNumber, HtmlMisc htmlMisc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlMisc = htmlMisc;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public HtmlMisc getHtmlMisc() { return htmlMisc; }
    public void setHtmlMisc(HtmlMisc htmlMisc) { this.htmlMisc = htmlMisc; }

    @Override
    public String toString() { return "MiscChunk"; }
}
