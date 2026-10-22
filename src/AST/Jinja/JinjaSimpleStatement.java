package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaSimpleStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private JinjaSimpleStatementInner jinjaSimpleStatementInner;
    private String JINJA_STMT_CLOSE;

    public JinjaSimpleStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, JinjaSimpleStatementInner jinjaSimpleStatementInner, String JINJA_STMT_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.jinjaSimpleStatementInner = jinjaSimpleStatementInner;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public JinjaSimpleStatementInner getJinjaSimpleStatementInner() { return jinjaSimpleStatementInner; }
    public void setJinjaSimpleStatementInner(JinjaSimpleStatementInner jinjaSimpleStatementInner) { this.jinjaSimpleStatementInner = jinjaSimpleStatementInner; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }

    @Override
    public String toString() { return "JinjaSimpleStatement"; }
}
