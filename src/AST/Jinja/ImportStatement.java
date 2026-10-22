package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ImportStatement extends JinjaSimpleStatementInner {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_IMPORT;
    private String module;
    private String JINJA_STMT_AS;
    private String alias;

    public ImportStatement(String nodeName, int lineNumber, String JINJA_STMT_IMPORT, String module, String JINJA_STMT_AS, String alias) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_IMPORT = JINJA_STMT_IMPORT;
        this.module = module;
        this.JINJA_STMT_AS = JINJA_STMT_AS;
        this.alias = alias;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_IMPORT() { return JINJA_STMT_IMPORT; }
    public void setJINJA_STMT_IMPORT(String JINJA_STMT_IMPORT) { this.JINJA_STMT_IMPORT = JINJA_STMT_IMPORT; }
    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }
    public String getJINJA_STMT_AS() { return JINJA_STMT_AS; }
    public void setJINJA_STMT_AS(String JINJA_STMT_AS) { this.JINJA_STMT_AS = JINJA_STMT_AS; }
    public String getAlias() { return alias; }
    public void setAlias(String alias) { this.alias = alias; }

    @Override
    public String toString() { return "ImportStatement"; }
}
