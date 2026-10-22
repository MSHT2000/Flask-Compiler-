package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SelectorRule extends CssRuleSet {
    private String nodeName;
    private int lineNumber;
    private CssSelectorPart selectors;
    private String OpenBrace;
    private CssDeclarationList decls;
    private String CloseBrace;

    public SelectorRule(String nodeName, int lineNumber, CssSelectorPart selectors, String OpenBrace, CssDeclarationList decls, String CloseBrace) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.selectors = selectors;
        this.OpenBrace = OpenBrace;
        this.decls = decls;
        this.CloseBrace = CloseBrace;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public CssSelectorPart getSelectors() { return selectors; }
    public void setSelectors(CssSelectorPart selectors) { this.selectors = selectors; }
    public String getOpenBrace() { return OpenBrace; }
    public void setOpenBrace(String OpenBrace) { this.OpenBrace = OpenBrace; }
    public CssDeclarationList getDecls() { return decls; }
    public void setDecls(CssDeclarationList decls) { this.decls = decls; }
    public String getCloseBrace() { return CloseBrace; }
    public void setCloseBrace(String CloseBrace) { this.CloseBrace = CloseBrace; }

    @Override
    public String toString() { return "SelectorRule"; }
}
