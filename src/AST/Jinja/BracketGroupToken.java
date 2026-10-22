package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class BracketGroupToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String OpenBracket;
    private List<CssAnyToken> cssAnyToken;
    private String CloseBracket;

    public BracketGroupToken(String nodeName, int lineNumber, String OpenBracket, List<CssAnyToken> cssAnyToken, String CloseBracket) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenBracket = OpenBracket;
        this.cssAnyToken = cssAnyToken;
        this.CloseBracket = CloseBracket;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenBracket() { return OpenBracket; }
    public void setOpenBracket(String OpenBracket) { this.OpenBracket = OpenBracket; }
    public List<CssAnyToken> getCssAnyToken() { return cssAnyToken; }
    public void setCssAnyToken(List<CssAnyToken> cssAnyToken) { this.cssAnyToken = cssAnyToken; }
    public String getCloseBracket() { return CloseBracket; }
    public void setCloseBracket(String CloseBracket) { this.CloseBracket = CloseBracket; }

    @Override
    public String toString() { return "BracketGroupToken"; }
}
