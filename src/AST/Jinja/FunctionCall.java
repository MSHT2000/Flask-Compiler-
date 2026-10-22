package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FunctionCall extends JinjaPostfixPart {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LPAREN;
    private JinjaArgumentList jinjaArgumentList;
    private String JINJA_RPAREN;

    public FunctionCall(String nodeName, int lineNumber, String JINJA_LPAREN, JinjaArgumentList jinjaArgumentList, String JINJA_RPAREN) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LPAREN = JINJA_LPAREN;
        this.jinjaArgumentList = jinjaArgumentList;
        this.JINJA_RPAREN = JINJA_RPAREN;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LPAREN() { return JINJA_LPAREN; }
    public void setJINJA_LPAREN(String JINJA_LPAREN) { this.JINJA_LPAREN = JINJA_LPAREN; }
    public JinjaArgumentList getJinjaArgumentList() { return jinjaArgumentList; }
    public void setJinjaArgumentList(JinjaArgumentList jinjaArgumentList) { this.jinjaArgumentList = jinjaArgumentList; }
    public String getJINJA_RPAREN() { return JINJA_RPAREN; }
    public void setJINJA_RPAREN(String JINJA_RPAREN) { this.JINJA_RPAREN = JINJA_RPAREN; }

    @Override
    public String toString() { return "FunctionCall"; }
}
