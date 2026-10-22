package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class UnaryPrefixExpr extends JinjaUnary {
    private String nodeName;
    private int lineNumber;
    private JinjaUnaryPrefix jinjaUnaryPrefix;

    public UnaryPrefixExpr(String nodeName, int lineNumber, JinjaUnaryPrefix jinjaUnaryPrefix) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaUnaryPrefix = jinjaUnaryPrefix;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaUnaryPrefix getJinjaUnaryPrefix() { return jinjaUnaryPrefix; }
    public void setJinjaUnaryPrefix(JinjaUnaryPrefix jinjaUnaryPrefix) { this.jinjaUnaryPrefix = jinjaUnaryPrefix; }

    @Override
    public String toString() { return "UnaryPrefixExpr"; }
}
