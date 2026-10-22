package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PostfixExpr extends JinjaUnary {
    private String nodeName;
    private int lineNumber;
    private JinjaPostfix jinjaPostfix;

    public PostfixExpr(String nodeName, int lineNumber, JinjaPostfix jinjaPostfix) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaPostfix = jinjaPostfix;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaPostfix getJinjaPostfix() { return jinjaPostfix; }
    public void setJinjaPostfix(JinjaPostfix jinjaPostfix) { this.jinjaPostfix = jinjaPostfix; }

    @Override
    public String toString() { return "PostfixExpr"; }
}
