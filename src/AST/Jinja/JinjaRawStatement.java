package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaRawStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_RAW;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDRAW;

    public JinjaRawStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_RAW, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDRAW) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_RAW = JINJA_STMT_RAW;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDRAW = JINJA_STMT_ENDRAW;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_RAW() { return JINJA_STMT_RAW; }
    public void setJINJA_STMT_RAW(String JINJA_STMT_RAW) { this.JINJA_STMT_RAW = JINJA_STMT_RAW; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDRAW() { return JINJA_STMT_ENDRAW; }
    public void setJINJA_STMT_ENDRAW(String JINJA_STMT_ENDRAW) { this.JINJA_STMT_ENDRAW = JINJA_STMT_ENDRAW; }

    @Override
    public String toString() { return "JinjaRawStatement"; }
}
