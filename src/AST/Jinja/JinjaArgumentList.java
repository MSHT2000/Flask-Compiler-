package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaArgumentList {
    private String nodeName;
    private int lineNumber;
    private List<JinjaArgument> items;
    private List<String> JINJA_COMMA;

    public JinjaArgumentList(String nodeName, int lineNumber, List<JinjaArgument> items, List<String> JINJA_COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.items = items;
        this.JINJA_COMMA = JINJA_COMMA;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<JinjaArgument> getItems() { return items; }
    public void setItems(List<JinjaArgument> items) { this.items = items; }
    public List<String> getJINJA_COMMA() { return JINJA_COMMA; }
    public void setJINJA_COMMA(List<String> JINJA_COMMA) { this.JINJA_COMMA = JINJA_COMMA; }

    @Override
    public String toString() { return "JinjaArgumentList"; }
}
