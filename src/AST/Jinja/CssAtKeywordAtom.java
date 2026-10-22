package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssAtKeywordAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String CSS_AT_KEYWORD;

    public CssAtKeywordAtom(String nodeName, int lineNumber, String CSS_AT_KEYWORD) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_AT_KEYWORD = CSS_AT_KEYWORD;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_AT_KEYWORD() { return CSS_AT_KEYWORD; }
    public void setCSS_AT_KEYWORD(String CSS_AT_KEYWORD) { this.CSS_AT_KEYWORD = CSS_AT_KEYWORD; }

    @Override
    public String toString() { return "CssAtKeywordAtom"; }
}
