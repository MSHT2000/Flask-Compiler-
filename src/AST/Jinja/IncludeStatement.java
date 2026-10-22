package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class IncludeStatement extends JinjaSimpleStatementInner {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_INCLUDE;
    private String JINJA_STRING;
    private String JINJA_IDENTIFIER;

    public IncludeStatement(String nodeName, int lineNumber, String JINJA_STMT_INCLUDE, String JINJA_STRING, String JINJA_IDENTIFIER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_INCLUDE = JINJA_STMT_INCLUDE;
        this.JINJA_STRING = JINJA_STRING;
        this.JINJA_IDENTIFIER = JINJA_IDENTIFIER;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_INCLUDE() { return JINJA_STMT_INCLUDE; }
    public void setJINJA_STMT_INCLUDE(String JINJA_STMT_INCLUDE) { this.JINJA_STMT_INCLUDE = JINJA_STMT_INCLUDE; }
    public String getJINJA_STRING() { return JINJA_STRING; }
    public void setJINJA_STRING(String JINJA_STRING) { this.JINJA_STRING = JINJA_STRING; }
    public String getJINJA_IDENTIFIER() { return JINJA_IDENTIFIER; }
    public void setJINJA_IDENTIFIER(String JINJA_IDENTIFIER) { this.JINJA_IDENTIFIER = JINJA_IDENTIFIER; }

    @Override
    public String toString() { return "IncludeStatement"; }
}
