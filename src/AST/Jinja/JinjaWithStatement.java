package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaWithStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_WITH;
    private List<JinjaWithItem> items;
    private List<String> JINJA_COMMA;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDWITH;

    public JinjaWithStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_WITH, List<JinjaWithItem> items, List<String> JINJA_COMMA, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDWITH) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_WITH = JINJA_STMT_WITH;
        this.items = items;
        this.JINJA_COMMA = JINJA_COMMA;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDWITH = JINJA_STMT_ENDWITH;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_WITH() { return JINJA_STMT_WITH; }
    public void setJINJA_STMT_WITH(String JINJA_STMT_WITH) { this.JINJA_STMT_WITH = JINJA_STMT_WITH; }
    public List<JinjaWithItem> getItems() { return items; }
    public void setItems(List<JinjaWithItem> items) { this.items = items; }
    public List<String> getJINJA_COMMA() { return JINJA_COMMA; }
    public void setJINJA_COMMA(List<String> JINJA_COMMA) { this.JINJA_COMMA = JINJA_COMMA; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDWITH() { return JINJA_STMT_ENDWITH; }
    public void setJINJA_STMT_ENDWITH(String JINJA_STMT_ENDWITH) { this.JINJA_STMT_ENDWITH = JINJA_STMT_ENDWITH; }

    @Override
    public String toString() { return "JinjaWithStatement"; }
}
