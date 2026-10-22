package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class HtmlAttribute {
    private String nodeName;
    private int lineNumber;
    private String name;
    private String TAG_EQUALS;
    private AttributeValue value;

    public HtmlAttribute(String nodeName, int lineNumber, String name, String TAG_EQUALS, AttributeValue value) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.TAG_EQUALS = TAG_EQUALS;
        this.value = value;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTAG_EQUALS() { return TAG_EQUALS; }
    public void setTAG_EQUALS(String TAG_EQUALS) { this.TAG_EQUALS = TAG_EQUALS; }
    public AttributeValue getValue() { return value; }
    public void setValue(AttributeValue value) { this.value = value; }

    @Override
    public String toString() { return "HtmlAttribute"; }
}
