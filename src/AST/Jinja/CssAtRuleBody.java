package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssAtRuleBody {
    private String nodeName;
    private int lineNumber;
    private List<CssAnyToken> cssAnyToken;
    private String OpenBrace;
    private String CloseBrace;
    private String SemiColon;

    public CssAtRuleBody(String nodeName, int lineNumber, List<CssAnyToken> cssAnyToken, String OpenBrace, String CloseBrace, String SemiColon) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.cssAnyToken = cssAnyToken;
        this.OpenBrace = OpenBrace;
        this.CloseBrace = CloseBrace;
        this.SemiColon = SemiColon;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<CssAnyToken> getCssAnyToken() { return cssAnyToken; }
    public void setCssAnyToken(List<CssAnyToken> cssAnyToken) { this.cssAnyToken = cssAnyToken; }
    public String getOpenBrace() { return OpenBrace; }
    public void setOpenBrace(String OpenBrace) { this.OpenBrace = OpenBrace; }
    public String getCloseBrace() { return CloseBrace; }
    public void setCloseBrace(String CloseBrace) { this.CloseBrace = CloseBrace; }
    public String getSemiColon() { return SemiColon; }
    public void setSemiColon(String SemiColon) { this.SemiColon = SemiColon; }

    @Override
    public String toString() { return "CssAtRuleBody"; }
}
