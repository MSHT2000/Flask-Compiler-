package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CdataItem extends HtmlContentItem {
    private String nodeName;
    private int lineNumber;
    private String CDATA;

    public CdataItem(String nodeName, int lineNumber, String CDATA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CDATA = CDATA;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getCDATA() { return CDATA; }
    public void setCDATA(String CDATA) { this.CDATA = CDATA; }

    @Override
    public String toString() { return "CdataItem"; }
}
