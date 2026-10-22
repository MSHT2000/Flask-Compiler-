package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class Subscript extends JinjaPostfixPart {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LBRACK;
    private JinjaExpr jinjaExpr;
    private String JINJA_RBRACK;

    public Subscript(String nodeName, int lineNumber, String JINJA_LBRACK, JinjaExpr jinjaExpr, String JINJA_RBRACK) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LBRACK = JINJA_LBRACK;
        this.jinjaExpr = jinjaExpr;
        this.JINJA_RBRACK = JINJA_RBRACK;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LBRACK() { return JINJA_LBRACK; }
    public void setJINJA_LBRACK(String JINJA_LBRACK) { this.JINJA_LBRACK = JINJA_LBRACK; }
    public JinjaExpr getJinjaExpr() { return jinjaExpr; }
    public void setJinjaExpr(JinjaExpr jinjaExpr) { this.jinjaExpr = jinjaExpr; }
    public String getJINJA_RBRACK() { return JINJA_RBRACK; }
    public void setJINJA_RBRACK(String JINJA_RBRACK) { this.JINJA_RBRACK = JINJA_RBRACK; }

    @Override
    public String toString() { return "Subscript"; }
}
