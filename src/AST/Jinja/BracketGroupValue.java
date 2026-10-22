package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class BracketGroupValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String OpenBracket;
    private List<CssValuePart> cssValuePart;
    private String CloseBracket;

    public BracketGroupValue(String nodeName, int lineNumber, String OpenBracket, List<CssValuePart> cssValuePart, String CloseBracket) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenBracket = OpenBracket;
        this.cssValuePart = cssValuePart;
        this.CloseBracket = CloseBracket;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenBracket() { return OpenBracket; }
    public void setOpenBracket(String OpenBracket) { this.OpenBracket = OpenBracket; }
    public List<CssValuePart> getCssValuePart() { return cssValuePart; }
    public void setCssValuePart(List<CssValuePart> cssValuePart) { this.cssValuePart = cssValuePart; }
    public String getCloseBracket() { return CloseBracket; }
    public void setCloseBracket(String CloseBracket) { this.CloseBracket = CloseBracket; }

    @Override
    public String toString() { return "BracketGroupValue"; }
}
