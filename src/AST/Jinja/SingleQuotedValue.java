package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class SingleQuotedValue extends AttributeValue {
    private String nodeName;
    private int lineNumber;
    private String ATTVALUE_OPEN_SQ;
    private List<AttributeValueContent> attributeValueContent;
    private String ATTVALUE_SQ_CLOSE;

    public SingleQuotedValue(String nodeName, int lineNumber, String ATTVALUE_OPEN_SQ, List<AttributeValueContent> attributeValueContent, String ATTVALUE_SQ_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATTVALUE_OPEN_SQ = ATTVALUE_OPEN_SQ;
        this.attributeValueContent = attributeValueContent;
        this.ATTVALUE_SQ_CLOSE = ATTVALUE_SQ_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getATTVALUE_OPEN_SQ() { return ATTVALUE_OPEN_SQ; }
    public void setATTVALUE_OPEN_SQ(String ATTVALUE_OPEN_SQ) { this.ATTVALUE_OPEN_SQ = ATTVALUE_OPEN_SQ; }
    public List<AttributeValueContent> getAttributeValueContent() { return attributeValueContent; }
    public void setAttributeValueContent(List<AttributeValueContent> attributeValueContent) { this.attributeValueContent = attributeValueContent; }
    public String getATTVALUE_SQ_CLOSE() { return ATTVALUE_SQ_CLOSE; }
    public void setATTVALUE_SQ_CLOSE(String ATTVALUE_SQ_CLOSE) { this.ATTVALUE_SQ_CLOSE = ATTVALUE_SQ_CLOSE; }

    @Override
    public String toString() { return "SingleQuotedValue"; }
}
