package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class InlineSetStatement extends JinjaSetStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_SET;
    private String name;
    private String JINJA_ASSIGN;
    private JinjaExpr value;
    private String JINJA_STMT_CLOSE;

    public InlineSetStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_SET, String name, String JINJA_ASSIGN, JinjaExpr value, String JINJA_STMT_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_SET = JINJA_STMT_SET;
        this.name = name;
        this.JINJA_ASSIGN = JINJA_ASSIGN;
        this.value = value;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
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
    public String getJINJA_ASSIGN() { return JINJA_ASSIGN; }
    public void setJINJA_ASSIGN(String JINJA_ASSIGN) { this.JINJA_ASSIGN = JINJA_ASSIGN; }
    public JinjaExpr getValue() { return value; }
    public void setValue(JinjaExpr value) { this.value = value; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }

    @Override
    public String toString() { return "InlineSetStatement"; }
}
