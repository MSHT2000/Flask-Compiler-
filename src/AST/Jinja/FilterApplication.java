package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FilterApplication extends JinjaPostfixPart {
    private String nodeName;
    private int lineNumber;
    private String JINJA_PIPE;
    private String JINJA_IDENTIFIER;
    private String JINJA_LPAREN;
    private JinjaArgumentList jinjaArgumentList;
    private String JINJA_RPAREN;

    public FilterApplication(String nodeName, int lineNumber, String JINJA_PIPE, String JINJA_IDENTIFIER, String JINJA_LPAREN, JinjaArgumentList jinjaArgumentList, String JINJA_RPAREN) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_PIPE = JINJA_PIPE;
        this.JINJA_IDENTIFIER = JINJA_IDENTIFIER;
        this.JINJA_LPAREN = JINJA_LPAREN;
        this.jinjaArgumentList = jinjaArgumentList;
        this.JINJA_RPAREN = JINJA_RPAREN;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_PIPE() { return JINJA_PIPE; }
    public void setJINJA_PIPE(String JINJA_PIPE) { this.JINJA_PIPE = JINJA_PIPE; }
    public String getJINJA_IDENTIFIER() { return JINJA_IDENTIFIER; }
    public void setJINJA_IDENTIFIER(String JINJA_IDENTIFIER) { this.JINJA_IDENTIFIER = JINJA_IDENTIFIER; }
    public String getJINJA_LPAREN() { return JINJA_LPAREN; }
    public void setJINJA_LPAREN(String JINJA_LPAREN) { this.JINJA_LPAREN = JINJA_LPAREN; }
    public JinjaArgumentList getJinjaArgumentList() { return jinjaArgumentList; }
    public void setJinjaArgumentList(JinjaArgumentList jinjaArgumentList) { this.jinjaArgumentList = jinjaArgumentList; }
    public String getJINJA_RPAREN() { return JINJA_RPAREN; }
    public void setJINJA_RPAREN(String JINJA_RPAREN) { this.JINJA_RPAREN = JINJA_RPAREN; }

    @Override
    public String toString() { return "FilterApplication"; }
}
