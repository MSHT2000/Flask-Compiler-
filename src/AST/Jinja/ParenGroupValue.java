package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ParenGroupValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String OpenParen;
    private List<CssValuePart> cssValuePart;
    private String CloseParen;

    public ParenGroupValue(String nodeName, int lineNumber, String OpenParen, List<CssValuePart> cssValuePart, String CloseParen) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenParen = OpenParen;
        this.cssValuePart = cssValuePart;
        this.CloseParen = CloseParen;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenParen() { return OpenParen; }
    public void setOpenParen(String OpenParen) { this.OpenParen = OpenParen; }
    public List<CssValuePart> getCssValuePart() { return cssValuePart; }
    public void setCssValuePart(List<CssValuePart> cssValuePart) { this.cssValuePart = cssValuePart; }
    public String getCloseParen() { return CloseParen; }
    public void setCloseParen(String CloseParen) { this.CloseParen = CloseParen; }

    @Override
    public String toString() { return "ParenGroupValue"; }
}
