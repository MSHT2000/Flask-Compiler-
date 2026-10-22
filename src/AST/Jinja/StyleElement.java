package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class StyleElement extends HtmlElement {
    private String nodeName;
    private int lineNumber;
    private String STYLE_OPEN;
    private CssStylesheet stylesheet;
    private String CSS_END;

    public StyleElement(String nodeName, int lineNumber, String STYLE_OPEN, CssStylesheet stylesheet, String CSS_END) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STYLE_OPEN = STYLE_OPEN;
        this.stylesheet = stylesheet;
        this.CSS_END = CSS_END;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getSTYLE_OPEN() { return STYLE_OPEN; }
    public void setSTYLE_OPEN(String STYLE_OPEN) { this.STYLE_OPEN = STYLE_OPEN; }
    public CssStylesheet getStylesheet() { return stylesheet; }
    public void setStylesheet(CssStylesheet stylesheet) { this.stylesheet = stylesheet; }
    public String getCSS_END() { return CSS_END; }
    public void setCSS_END(String CSS_END) { this.CSS_END = CSS_END; }

    @Override
    public String toString() { return "StyleElement"; }
}
