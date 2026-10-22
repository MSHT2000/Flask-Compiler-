package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class HtmlElements {
    private String nodeName;
    private int lineNumber;
    private List<HtmlMisc> htmlMisc;
    private HtmlElement htmlElement;

    public HtmlElements(String nodeName, int lineNumber, List<HtmlMisc> htmlMisc, HtmlElement htmlElement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlMisc = htmlMisc;
        this.htmlElement = htmlElement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<HtmlMisc> getHtmlMisc() { return htmlMisc; }
    public void setHtmlMisc(List<HtmlMisc> htmlMisc) { this.htmlMisc = htmlMisc; }
    public HtmlElement getHtmlElement() { return htmlElement; }
    public void setHtmlElement(HtmlElement htmlElement) { this.htmlElement = htmlElement; }

    @Override
    public String toString() { return "HtmlElements"; }
}
