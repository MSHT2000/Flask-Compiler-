package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class BraceGroupToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String OpenBrace;
    private List<CssAnyToken> cssAnyToken;
    private String CloseBrace;

    public BraceGroupToken(String nodeName, int lineNumber, String OpenBrace, List<CssAnyToken> cssAnyToken, String CloseBrace) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenBrace = OpenBrace;
        this.cssAnyToken = cssAnyToken;
        this.CloseBrace = CloseBrace;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenBrace() { return OpenBrace; }
    public void setOpenBrace(String OpenBrace) { this.OpenBrace = OpenBrace; }
    public List<CssAnyToken> getCssAnyToken() { return cssAnyToken; }
    public void setCssAnyToken(List<CssAnyToken> cssAnyToken) { this.cssAnyToken = cssAnyToken; }
    public String getCloseBrace() { return CloseBrace; }
    public void setCloseBrace(String CloseBrace) { this.CloseBrace = CloseBrace; }

    @Override
    public String toString() { return "BraceGroupToken"; }
}
