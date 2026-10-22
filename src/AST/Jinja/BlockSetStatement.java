package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class BlockSetStatement extends JinjaSetStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_SET;
    private String name;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDSET;

    public BlockSetStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_SET, String name, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDSET) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_SET = JINJA_STMT_SET;
        this.name = name;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDSET = JINJA_STMT_ENDSET;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_SET() { return JINJA_STMT_SET; }
    public void setJINJA_STMT_SET(String JINJA_STMT_SET) { this.JINJA_STMT_SET = JINJA_STMT_SET; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDSET() { return JINJA_STMT_ENDSET; }
    public void setJINJA_STMT_ENDSET(String JINJA_STMT_ENDSET) { this.JINJA_STMT_ENDSET = JINJA_STMT_ENDSET; }

    @Override
    public String toString() { return "BlockSetStatement"; }
}
