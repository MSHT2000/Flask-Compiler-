package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class UnquotedValue extends AttributeValue {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_UNQUOTED;

    public UnquotedValue(String nodeName, int lineNumber, String ATTVALUE_UNQUOTED) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_UNQUOTED = ATTVALUE_UNQUOTED;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_UNQUOTED() { return ATTVALUE_UNQUOTED; }
    public void setATTVALUE_UNQUOTED(String ATTVALUE_UNQUOTED) { this.ATTVALUE_UNQUOTED = ATTVALUE_UNQUOTED; }

    @Override
    public String toString() { return "UnquotedValue"; }
}
