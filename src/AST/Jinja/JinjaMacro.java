package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaMacro extends TemplateJinja {
    private String nodeName;
    private int lineNumber;
    private JinjaMacroStatement jinjaMacroStatement;

    public JinjaMacro(String nodeName, int lineNumber, JinjaMacroStatement jinjaMacroStatement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaMacroStatement = jinjaMacroStatement;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaMacroStatement getJinjaMacroStatement() { return jinjaMacroStatement; }
    public void setJinjaMacroStatement(JinjaMacroStatement jinjaMacroStatement) { this.jinjaMacroStatement = jinjaMacroStatement; }

    @Override
    public String toString() { return "JinjaMacro"; }
}
