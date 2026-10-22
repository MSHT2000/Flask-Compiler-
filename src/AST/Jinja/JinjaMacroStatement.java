package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaMacroStatement {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STMT_OPEN;
    private String JINJA_STMT_MACRO;
    private String name;
    private String JINJA_LPAREN;
    private JinjaMacroParams params;
    private String JINJA_RPAREN;
    private String JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ENDMACRO;

    public JinjaMacroStatement(String nodeName, int lineNumber, String JINJA_STMT_OPEN, String JINJA_STMT_MACRO, String name, String JINJA_LPAREN, JinjaMacroParams params, String JINJA_RPAREN, String JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ENDMACRO) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_MACRO = JINJA_STMT_MACRO;
        this.name = name;
        this.JINJA_LPAREN = JINJA_LPAREN;
        this.params = params;
        this.JINJA_RPAREN = JINJA_RPAREN;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ENDMACRO = JINJA_STMT_ENDMACRO;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(String JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_MACRO() { return JINJA_STMT_MACRO; }
    public void setJINJA_STMT_MACRO(String JINJA_STMT_MACRO) { this.JINJA_STMT_MACRO = JINJA_STMT_MACRO; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getJINJA_LPAREN() { return JINJA_LPAREN; }
    public void setJINJA_LPAREN(String JINJA_LPAREN) { this.JINJA_LPAREN = JINJA_LPAREN; }
    public JinjaMacroParams getParams() { return params; }
    public void setParams(JinjaMacroParams params) { this.params = params; }
    public String getJINJA_RPAREN() { return JINJA_RPAREN; }
    public void setJINJA_RPAREN(String JINJA_RPAREN) { this.JINJA_RPAREN = JINJA_RPAREN; }
    public String getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(String JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ENDMACRO() { return JINJA_STMT_ENDMACRO; }
    public void setJINJA_STMT_ENDMACRO(String JINJA_STMT_ENDMACRO) { this.JINJA_STMT_ENDMACRO = JINJA_STMT_ENDMACRO; }

    @Override
    public String toString() { return "JinjaMacroStatement"; }
}
