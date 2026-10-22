package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SimpleWithItem extends JinjaWithItem {
    private String nodeName;
    private int lineNumber;
    private JinjaExpr value;

    public SimpleWithItem(String nodeName, int lineNumber, JinjaExpr value) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.value = value;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaExpr getValue() { return value; }
    public void setValue(JinjaExpr value) { this.value = value; }

    @Override
    public String toString() { return "SimpleWithItem"; }
}
