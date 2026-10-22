package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssNumberAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String CSS_NUMBER;

    public CssNumberAtom(String nodeName, int lineNumber, String CSS_NUMBER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_NUMBER = CSS_NUMBER;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_NUMBER() { return CSS_NUMBER; }
    public void setCSS_NUMBER(String CSS_NUMBER) { this.CSS_NUMBER = CSS_NUMBER; }

    @Override
    public String toString() { return "CssNumberAtom"; }
}
