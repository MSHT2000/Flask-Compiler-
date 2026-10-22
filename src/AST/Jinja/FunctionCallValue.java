package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FunctionCallValue extends CssValuePart {
    private String nodeName;
    private int lineNumber;
    private String CSS_FUNCTION;
    private List<CssValuePart> cssValuePart;
    private String CloseParen;

    public FunctionCallValue(String nodeName, int lineNumber, String CSS_FUNCTION, List<CssValuePart> cssValuePart, String CloseParen) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_FUNCTION = CSS_FUNCTION;
        this.cssValuePart = cssValuePart;
        this.CloseParen = CloseParen;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_FUNCTION() { return CSS_FUNCTION; }
    public void setCSS_FUNCTION(String CSS_FUNCTION) { this.CSS_FUNCTION = CSS_FUNCTION; }
    public List<CssValuePart> getCssValuePart() { return cssValuePart; }
    public void setCssValuePart(List<CssValuePart> cssValuePart) { this.cssValuePart = cssValuePart; }
    public String getCloseParen() { return CloseParen; }
    public void setCloseParen(String CloseParen) { this.CloseParen = CloseParen; }

    @Override
    public String toString() { return "FunctionCallValue"; }
}
