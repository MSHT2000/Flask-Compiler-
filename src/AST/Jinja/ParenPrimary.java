package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ParenPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LPAREN;
    private JinjaExpr jinjaExpr;
    private String JINJA_RPAREN;

    public ParenPrimary(String nodeName, int lineNumber, String JINJA_LPAREN, JinjaExpr jinjaExpr, String JINJA_RPAREN) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LPAREN = JINJA_LPAREN;
        this.jinjaExpr = jinjaExpr;
        this.JINJA_RPAREN = JINJA_RPAREN;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LPAREN() { return JINJA_LPAREN; }
    public void setJINJA_LPAREN(String JINJA_LPAREN) { this.JINJA_LPAREN = JINJA_LPAREN; }
    public JinjaExpr getJinjaExpr() { return jinjaExpr; }
    public void setJinjaExpr(JinjaExpr jinjaExpr) { this.jinjaExpr = jinjaExpr; }
    public String getJINJA_RPAREN() { return JINJA_RPAREN; }
    public void setJINJA_RPAREN(String JINJA_RPAREN) { this.JINJA_RPAREN = JINJA_RPAREN; }

    @Override
    public String toString() { return "ParenPrimary"; }
}
