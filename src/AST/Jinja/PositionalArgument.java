package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PositionalArgument extends JinjaArgument {
    private String nodeName;
    private int lineNumber;
    private JinjaExpr jinjaExpr;

    public PositionalArgument(String nodeName, int lineNumber, JinjaExpr jinjaExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaExpr = jinjaExpr;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaExpr getJinjaExpr() { return jinjaExpr; }
    public void setJinjaExpr(JinjaExpr jinjaExpr) { this.jinjaExpr = jinjaExpr; }

    @Override
    public String toString() { return "PositionalArgument"; }
}
