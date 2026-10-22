package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DoubleQuotedValue extends AttributeValue {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_OPEN_DQ;
    private List<AttributeValueContent> attributeValueContent;
    private String ATTVALUE_DQ_CLOSE;

    public DoubleQuotedValue(String nodeName, int lineNumber, String ATTVALUE_OPEN_DQ, List<AttributeValueContent> attributeValueContent, String ATTVALUE_DQ_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_OPEN_DQ = ATTVALUE_OPEN_DQ;
        this.attributeValueContent = attributeValueContent;
        this.ATTVALUE_DQ_CLOSE = ATTVALUE_DQ_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_OPEN_DQ() { return ATTVALUE_OPEN_DQ; }
    public void setATTVALUE_OPEN_DQ(String ATTVALUE_OPEN_DQ) { this.ATTVALUE_OPEN_DQ = ATTVALUE_OPEN_DQ; }
    public List<AttributeValueContent> getAttributeValueContent() { return attributeValueContent; }
    public void setAttributeValueContent(List<AttributeValueContent> attributeValueContent) { this.attributeValueContent = attributeValueContent; }
    public String getATTVALUE_DQ_CLOSE() { return ATTVALUE_DQ_CLOSE; }
    public void setATTVALUE_DQ_CLOSE(String ATTVALUE_DQ_CLOSE) { this.ATTVALUE_DQ_CLOSE = ATTVALUE_DQ_CLOSE; }

    @Override
    public String toString() { return "DoubleQuotedValue"; }
}
