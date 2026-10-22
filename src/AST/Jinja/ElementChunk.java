package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ElementChunk extends TemplateChunk {
    private String nodeName;
    private int lineNumber;
    private HtmlElement htmlElement;

    public ElementChunk(String nodeName, int lineNumber, HtmlElement htmlElement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.htmlElement = htmlElement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public HtmlElement getHtmlElement() { return htmlElement; }
    public void setHtmlElement(HtmlElement htmlElement) { this.htmlElement = htmlElement; }

    @Override
    public String toString() { return "ElementChunk"; }
}
