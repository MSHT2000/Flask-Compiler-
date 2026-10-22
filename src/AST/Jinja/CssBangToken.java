package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssBangToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String CSS_BANG;

    public CssBangToken(String nodeName, int lineNumber, String CSS_BANG) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_BANG = CSS_BANG;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_BANG() { return CSS_BANG; }
    public void setCSS_BANG(String CSS_BANG) { this.CSS_BANG = CSS_BANG; }

    @Override
    public String toString() { return "CssBangToken"; }
}
