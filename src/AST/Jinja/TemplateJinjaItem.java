package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TemplateJinjaItem extends HtmlContentItem {
    private String nodeName;
    private int lineNumber;
    private TemplateJinja templateJinja;

    public TemplateJinjaItem(String nodeName, int lineNumber, TemplateJinja templateJinja) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.templateJinja = templateJinja;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public TemplateJinja getTemplateJinja() { return templateJinja; }
    public void setTemplateJinja(TemplateJinja templateJinja) { this.templateJinja = templateJinja; }

    @Override
    public String toString() { return "TemplateJinjaItem"; }
}
