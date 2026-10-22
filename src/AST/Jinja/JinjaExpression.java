package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaExpression {
    private String nodeName;
    private int lineNumber;
    private String JINJA_EXPR_OPEN;
    private JinjaExprList exprs;
    private String JINJA_EXPR_CLOSE;

    public JinjaExpression(String nodeName, int lineNumber, String JINJA_EXPR_OPEN, JinjaExprList exprs, String JINJA_EXPR_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_EXPR_OPEN = JINJA_EXPR_OPEN;
        this.exprs = exprs;
        this.JINJA_EXPR_CLOSE = JINJA_EXPR_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_EXPR_OPEN() { return JINJA_EXPR_OPEN; }
    public void setJINJA_EXPR_OPEN(String JINJA_EXPR_OPEN) { this.JINJA_EXPR_OPEN = JINJA_EXPR_OPEN; }
    public JinjaExprList getExprs() { return exprs; }
    public void setExprs(JinjaExprList exprs) { this.exprs = exprs; }
    public String getJINJA_EXPR_CLOSE() { return JINJA_EXPR_CLOSE; }
    public void setJINJA_EXPR_CLOSE(String JINJA_EXPR_CLOSE) { this.JINJA_EXPR_CLOSE = JINJA_EXPR_CLOSE; }

    @Override
    public String toString() { return "JinjaExpression"; }
}
