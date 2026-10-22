package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class KeywordArgument extends JinjaArgument {
    private String nodeName;
    private int lineNumber;
    private String key;
    private String JINJA_ASSIGN;
    private JinjaExpr value;

    public KeywordArgument(String nodeName, int lineNumber, String key, String JINJA_ASSIGN, JinjaExpr value) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.key = key;
        this.JINJA_ASSIGN = JINJA_ASSIGN;
        this.value = value;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getKey() { return key; }
    public void setKey(String key) { this.key = key; }
    public String getJINJA_ASSIGN() { return JINJA_ASSIGN; }
    public void setJINJA_ASSIGN(String JINJA_ASSIGN) { this.JINJA_ASSIGN = JINJA_ASSIGN; }
    public JinjaExpr getValue() { return value; }
    public void setValue(JinjaExpr value) { this.value = value; }

    @Override
    public String toString() { return "KeywordArgument"; }
}
