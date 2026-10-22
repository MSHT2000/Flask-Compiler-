package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaPostfix {
    private String nodeName;
    private int lineNumber;
    private JinjaPrimary base;
    private List<JinjaPostfixPart> parts;

    public JinjaPostfix(String nodeName, int lineNumber, JinjaPrimary base, List<JinjaPostfixPart> parts) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.base = base;
        this.parts = parts;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaPrimary getBase() { return base; }
    public void setBase(JinjaPrimary base) { this.base = base; }
    public List<JinjaPostfixPart> getParts() { return parts; }
    public void setParts(List<JinjaPostfixPart> parts) { this.parts = parts; }

    @Override
    public String toString() { return "JinjaPostfix"; }
}
