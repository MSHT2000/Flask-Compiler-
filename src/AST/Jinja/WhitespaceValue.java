package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class WhitespaceValue extends ScriptletOrSeaWs {
    private String nodeName;
    private int lineNumber;
    private String SEA_WS;

    public WhitespaceValue(String nodeName, int lineNumber, String SEA_WS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.SEA_WS = SEA_WS;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getSEA_WS() { return SEA_WS; }
    public void setSEA_WS(String SEA_WS) { this.SEA_WS = SEA_WS; }

    @Override
    public String toString() { return "WhitespaceValue"; }
}
