package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaExpr {
    private String nodeName;
    private int lineNumber;
    private JinjaOrExpression trueExpr;
    private String JINJA_IF;
    private JinjaOrExpression condition;
    private String JINJA_ELSE;
    private JinjaExpr falseExpr;

    public JinjaExpr(String nodeName, int lineNumber, JinjaOrExpression trueExpr, String JINJA_IF, JinjaOrExpression condition, String JINJA_ELSE, JinjaExpr falseExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.trueExpr = trueExpr;
        this.JINJA_IF = JINJA_IF;
        this.condition = condition;
        this.JINJA_ELSE = JINJA_ELSE;
        this.falseExpr = falseExpr;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaOrExpression getTrueExpr() { return trueExpr; }
    public void setTrueExpr(JinjaOrExpression trueExpr) { this.trueExpr = trueExpr; }
    public String getJINJA_IF() { return JINJA_IF; }
    public void setJINJA_IF(String JINJA_IF) { this.JINJA_IF = JINJA_IF; }
    public JinjaOrExpression getCondition() { return condition; }
    public void setCondition(JinjaOrExpression condition) { this.condition = condition; }
    public String getJINJA_ELSE() { return JINJA_ELSE; }
    public void setJINJA_ELSE(String JINJA_ELSE) { this.JINJA_ELSE = JINJA_ELSE; }
    public JinjaExpr getFalseExpr() { return falseExpr; }
    public void setFalseExpr(JinjaExpr falseExpr) { this.falseExpr = falseExpr; }

    @Override
    public String toString() { return "JinjaExpr"; }
}
