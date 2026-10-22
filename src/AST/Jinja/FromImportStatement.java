package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FromImportStatement extends JinjaSimpleStatementInner {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_FROM;
    private String module;
    private String JINJA_STMT_IMPORT;
    private List<String> importedNames;
    private List<String> JINJA_COMMA;

    public FromImportStatement(String nodeName, int lineNumber, String JINJA_STMT_FROM, String module, String JINJA_STMT_IMPORT, List<String> importedNames, List<String> JINJA_COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_FROM = JINJA_STMT_FROM;
        this.module = module;
        this.JINJA_STMT_IMPORT = JINJA_STMT_IMPORT;
        this.importedNames = importedNames;
        this.JINJA_COMMA = JINJA_COMMA;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_FROM() { return JINJA_STMT_FROM; }
    public void setJINJA_STMT_FROM(String JINJA_STMT_FROM) { this.JINJA_STMT_FROM = JINJA_STMT_FROM; }
    public String getModule() { return module; }
    public void setModule(String module) { this.module = module; }
    public String getJINJA_STMT_IMPORT() { return JINJA_STMT_IMPORT; }
    public void setJINJA_STMT_IMPORT(String JINJA_STMT_IMPORT) { this.JINJA_STMT_IMPORT = JINJA_STMT_IMPORT; }
    public List<String> getImportedNames() { return importedNames; }
    public void setImportedNames(List<String> importedNames) { this.importedNames = importedNames; }
    public List<String> getJINJA_COMMA() { return JINJA_COMMA; }
    public void setJINJA_COMMA(List<String> JINJA_COMMA) { this.JINJA_COMMA = JINJA_COMMA; }

    @Override
    public String toString() { return "FromImportStatement"; }
}
