package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DoubleQuotedLbrace extends AttributeValueContent {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_DQ_LBRACE;

    public DoubleQuotedLbrace(String nodeName, int lineNumber, String ATTVALUE_DQ_LBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_DQ_LBRACE = ATTVALUE_DQ_LBRACE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_DQ_LBRACE() { return ATTVALUE_DQ_LBRACE; }
    public void setATTVALUE_DQ_LBRACE(String ATTVALUE_DQ_LBRACE) { this.ATTVALUE_DQ_LBRACE = ATTVALUE_DQ_LBRACE; }

    @Override
    public String toString() { return "DoubleQuotedLbrace"; }
}
