package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssVariableAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String CSS_VARIABLE;

    public CssVariableAtom(String nodeName, int lineNumber, String CSS_VARIABLE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CSS_VARIABLE = CSS_VARIABLE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCSS_VARIABLE() { return CSS_VARIABLE; }
    public void setCSS_VARIABLE(String CSS_VARIABLE) { this.CSS_VARIABLE = CSS_VARIABLE; }

    @Override
    public String toString() { return "CssVariableAtom"; }
}
