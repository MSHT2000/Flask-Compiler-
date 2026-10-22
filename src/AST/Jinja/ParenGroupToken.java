package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ParenGroupToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String OpenParen;
    private List<CssAnyToken> cssAnyToken;
    private String CloseParen;

    public ParenGroupToken(String nodeName, int lineNumber, String OpenParen, List<CssAnyToken> cssAnyToken, String CloseParen) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenParen = OpenParen;
        this.cssAnyToken = cssAnyToken;
        this.CloseParen = CloseParen;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenParen() { return OpenParen; }
    public void setOpenParen(String OpenParen) { this.OpenParen = OpenParen; }
    public List<CssAnyToken> getCssAnyToken() { return cssAnyToken; }
    public void setCssAnyToken(List<CssAnyToken> cssAnyToken) { this.cssAnyToken = cssAnyToken; }
    public String getCloseParen() { return CloseParen; }
    public void setCloseParen(String CloseParen) { this.CloseParen = CloseParen; }

    @Override
    public String toString() { return "ParenGroupToken"; }
}
