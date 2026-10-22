package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssHashAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String CSS_HASH;

    public CssHashAtom(String nodeName, int lineNumber, String CSS_HASH) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_HASH = CSS_HASH;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_HASH() { return CSS_HASH; }
    public void setCSS_HASH(String CSS_HASH) { this.CSS_HASH = CSS_HASH; }

    @Override
    public String toString() { return "CssHashAtom"; }
}
