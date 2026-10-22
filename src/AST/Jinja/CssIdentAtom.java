package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssIdentAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String CSS_IDENT;

    public CssIdentAtom(String nodeName, int lineNumber, String CSS_IDENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_IDENT = CSS_IDENT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_IDENT() { return CSS_IDENT; }
    public void setCSS_IDENT(String CSS_IDENT) { this.CSS_IDENT = CSS_IDENT; }

    @Override
    public String toString() { return "CssIdentAtom"; }
}
