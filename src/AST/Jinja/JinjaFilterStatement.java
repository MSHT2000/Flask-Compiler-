package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaFilterStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_FILTER;
    private String name;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDFILTER;

    public JinjaFilterStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_FILTER, String name, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDFILTER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_FILTER = JINJA_STMT_FILTER;
        this.name = name;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDFILTER = JINJA_STMT_ENDFILTER;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_FILTER() { return JINJA_STMT_FILTER; }
    public void setJINJA_STMT_FILTER(String JINJA_STMT_FILTER) { this.JINJA_STMT_FILTER = JINJA_STMT_FILTER; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDFILTER() { return JINJA_STMT_ENDFILTER; }
    public void setJINJA_STMT_ENDFILTER(String JINJA_STMT_ENDFILTER) { this.JINJA_STMT_ENDFILTER = JINJA_STMT_ENDFILTER; }

    @Override
    public String toString() { return "JinjaFilterStatement"; }
}
