package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class AtRule extends CssRuleSet {
    private String nodeName;
    private int lineNumber;
    private String keyword;
    private CssAtRuleBody body;

    public AtRule(String nodeName, int lineNumber, String keyword, CssAtRuleBody body) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.keyword = keyword;
        this.body = body;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getKeyword() { return keyword; }
    public void setKeyword(String keyword) { this.keyword = keyword; }
    public CssAtRuleBody getBody() { return body; }
    public void setBody(CssAtRuleBody body) { this.body = body; }

    @Override
    public String toString() { return "AtRule"; }
}
