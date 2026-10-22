package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SingleQuotedText extends AttributeValueContent {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_SQ_TEXT;

    public SingleQuotedText(String nodeName, int lineNumber, String ATTVALUE_SQ_TEXT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_SQ_TEXT = ATTVALUE_SQ_TEXT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_SQ_TEXT() { return ATTVALUE_SQ_TEXT; }
    public void setATTVALUE_SQ_TEXT(String ATTVALUE_SQ_TEXT) { this.ATTVALUE_SQ_TEXT = ATTVALUE_SQ_TEXT; }

    @Override
    public String toString() { return "SingleQuotedText"; }
}
