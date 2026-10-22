package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssStylesheet {
    private String nodeName;
    private int lineNumber;
    private List<CssRuleSet> rules;

    public CssStylesheet(String nodeName, int lineNumber, List<CssRuleSet> rules) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.rules = rules;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<CssRuleSet> getRules() { return rules; }
    public void setRules(List<CssRuleSet> rules) { this.rules = rules; }

    @Override
    public String toString() { return "CssStylesheet"; }
}
