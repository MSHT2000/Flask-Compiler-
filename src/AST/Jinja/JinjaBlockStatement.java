package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaBlockStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_BLOCK;
    private String blockName;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDBLOCK;
    private String closeName;

    public JinjaBlockStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_BLOCK, String blockName, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDBLOCK, String closeName) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_BLOCK = JINJA_STMT_BLOCK;
        this.blockName = blockName;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDBLOCK = JINJA_STMT_ENDBLOCK;
        this.closeName = closeName;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_BLOCK() { return JINJA_STMT_BLOCK; }
    public void setJINJA_STMT_BLOCK(String JINJA_STMT_BLOCK) { this.JINJA_STMT_BLOCK = JINJA_STMT_BLOCK; }
    public String getBlockName() { return blockName; }
    public void setBlockName(String blockName) { this.blockName = blockName; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDBLOCK() { return JINJA_STMT_ENDBLOCK; }
    public void setJINJA_STMT_ENDBLOCK(String JINJA_STMT_ENDBLOCK) { this.JINJA_STMT_ENDBLOCK = JINJA_STMT_ENDBLOCK; }
    public String getCloseName() { return closeName; }
    public void setCloseName(String closeName) { this.closeName = closeName; }

    @Override
    public String toString() { return "JinjaBlockStatement"; }
}
