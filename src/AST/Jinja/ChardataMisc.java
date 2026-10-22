package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ChardataMisc extends HtmlMisc {
    private String nodeName;
    private int lineNumber;
    private HtmlChardata htmlChardata;

    public ChardataMisc(String nodeName, int lineNumber, HtmlChardata htmlChardata) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlChardata = htmlChardata;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public HtmlChardata getHtmlChardata() { return htmlChardata; }
    public void setHtmlChardata(HtmlChardata htmlChardata) { this.htmlChardata = htmlChardata; }

    @Override
    public String toString() { return "ChardataMisc"; }
}
