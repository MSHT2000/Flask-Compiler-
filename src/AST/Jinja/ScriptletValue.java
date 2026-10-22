package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ScriptletValue extends ScriptletOrSeaWs {
    private String nodeName;
    private int lineNumber;
    private String SCRIPTLET;

    public ScriptletValue(String nodeName, int lineNumber, String SCRIPTLET) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.SCRIPTLET = SCRIPTLET;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getSCRIPTLET() { return SCRIPTLET; }
    public void setSCRIPTLET(String SCRIPTLET) { this.SCRIPTLET = SCRIPTLET; }

    @Override
    public String toString() { return "ScriptletValue"; }
}
