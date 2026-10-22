package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssDeclaration {
    private String nodeName;
    private int lineNumber;
    private CssProperty property;
    private String Colon;
    private CssValue value;

    public CssDeclaration(String nodeName, int lineNumber, CssProperty property, String Colon, CssValue value) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.property = property;
        this.Colon = Colon;
        this.value = value;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public CssProperty getProperty() { return property; }
    public void setProperty(CssProperty property) { this.property = property; }
    public String getColon() { return Colon; }
    public void setColon(String Colon) { this.Colon = Colon; }
    public CssValue getValue() { return value; }
    public void setValue(CssValue value) { this.value = value; }

    @Override
    public String toString() { return "CssDeclaration"; }
}
