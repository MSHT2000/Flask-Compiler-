package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ExtendsStatement extends JinjaSimpleStatementInner {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_EXTENDS;
    private String module;

    public ExtendsStatement(String nodeName, int lineNumber, String JINJA_STMT_EXTENDS, String module) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_EXTENDS = JINJA_STMT_EXTENDS;
        this.module = module;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_EXTENDS() { return JINJA_STMT_EXTENDS; }
    public void setJINJA_STMT_EXTENDS(String JINJA_STMT_EXTENDS) { this.JINJA_STMT_EXTENDS = JINJA_STMT_EXTENDS; }
    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }

    @Override
    public String toString() { return "ExtendsStatement"; }
}
