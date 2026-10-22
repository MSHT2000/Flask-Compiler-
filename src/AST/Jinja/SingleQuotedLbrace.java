package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SingleQuotedLbrace extends AttributeValueContent {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_SQ_LBRACE;

    public SingleQuotedLbrace(String nodeName, int lineNumber, String ATTVALUE_SQ_LBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_SQ_LBRACE = ATTVALUE_SQ_LBRACE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_SQ_LBRACE() { return ATTVALUE_SQ_LBRACE; }
    public void setATTVALUE_SQ_LBRACE(String ATTVALUE_SQ_LBRACE) { this.ATTVALUE_SQ_LBRACE = ATTVALUE_SQ_LBRACE; }

    @Override
    public String toString() { return "SingleQuotedLbrace"; }
}
