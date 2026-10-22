package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TemplateDocument {
    private String nodeName;
    private int lineNumber;
    private TemplateBody body;
    private String EOF;

    public TemplateDocument(String nodeName, int lineNumber, TemplateBody body, String EOF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.body = body;
        this.EOF = EOF;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getEOF() { return EOF; }
    public void setEOF(String EOF) { this.EOF = EOF; }

    @Override
    public String toString() { return "TemplateDocument"; }
}
