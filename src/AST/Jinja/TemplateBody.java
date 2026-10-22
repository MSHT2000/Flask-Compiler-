package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TemplateBody {
    private String nodeName;
    private int lineNumber;
    private List<TemplateChunk> chunks;

    public TemplateBody(String nodeName, int lineNumber, List<TemplateChunk> chunks) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.chunks = chunks;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<TemplateChunk> getChunks() { return chunks; }
    public void setChunks(List<TemplateChunk> chunks) { this.chunks = chunks; }

    @Override
    public String toString() { return "TemplateBody"; }
}
