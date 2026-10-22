package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaDictEntry {
    private String nodeName;
    private int lineNumber;
    private JinjaExpr key;
    private String JINJA_COLON;
    private JinjaExpr value;

    public JinjaDictEntry(String nodeName, int lineNumber, JinjaExpr key, String JINJA_COLON, JinjaExpr value) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.key = key;
        this.JINJA_COLON = JINJA_COLON;
        this.value = value;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaExpr getKey() { return key; }
    public void setKey(JinjaExpr key) { this.key = key; }
    public String getJINJA_COLON() { return JINJA_COLON; }
    public void setJINJA_COLON(String JINJA_COLON) { this.JINJA_COLON = JINJA_COLON; }
    public JinjaExpr getValue() { return value; }
    public void setValue(JinjaExpr value) { this.value = value; }

    @Override
    public String toString() { return "JinjaDictEntry"; }
}
