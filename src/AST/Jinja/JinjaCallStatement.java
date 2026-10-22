package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaCallStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_CALL;
    private String name;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDCALL;

    public JinjaCallStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_CALL, String name, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDCALL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_CALL = JINJA_STMT_CALL;
        this.name = name;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDCALL = JINJA_STMT_ENDCALL;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_CALL() { return JINJA_STMT_CALL; }
    public void setJINJA_STMT_CALL(String JINJA_STMT_CALL) { this.JINJA_STMT_CALL = JINJA_STMT_CALL; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDCALL() { return JINJA_STMT_ENDCALL; }
    public void setJINJA_STMT_ENDCALL(String JINJA_STMT_ENDCALL) { this.JINJA_STMT_ENDCALL = JINJA_STMT_ENDCALL; }

    @Override
    public String toString() { return "JinjaCallStatement"; }
}
