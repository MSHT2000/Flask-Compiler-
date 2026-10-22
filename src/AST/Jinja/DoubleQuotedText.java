package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DoubleQuotedText extends AttributeValueContent {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_DQ_TEXT;

    public DoubleQuotedText(String nodeName, int lineNumber, String ATTVALUE_DQ_TEXT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_DQ_TEXT = ATTVALUE_DQ_TEXT;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_DQ_TEXT() { return ATTVALUE_DQ_TEXT; }
    public void setATTVALUE_DQ_TEXT(String ATTVALUE_DQ_TEXT) { this.ATTVALUE_DQ_TEXT = ATTVALUE_DQ_TEXT; }

    @Override
    public String toString() { return "DoubleQuotedText"; }
}
