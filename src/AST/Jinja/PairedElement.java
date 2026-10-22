package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PairedElement extends HtmlElement {
    private String nodeName;
    private int lineNumber;
    private String TAG_OPEN;
    private String tagName;
    private List<HtmlAttribute> attributes;
    private String TAG_CLOSE;
    private HtmlContent content;
    private String TAG_SLASH;
    private String closeName;
    private String TAG_SLASH_CLOSE;

    public PairedElement(String nodeName, int lineNumber, String TAG_OPEN, String tagName, List<HtmlAttribute> attributes, String TAG_CLOSE, HtmlContent content, String TAG_SLASH, String closeName, String TAG_SLASH_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TAG_OPEN = TAG_OPEN;
        this.tagName = tagName;
        this.attributes = attributes;
        this.TAG_CLOSE = TAG_CLOSE;
        this.content = content;
        this.TAG_SLASH = TAG_SLASH;
        this.closeName = closeName;
        this.TAG_SLASH_CLOSE = TAG_SLASH_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getTAG_OPEN() { return TAG_OPEN; }
    public void setTAG_OPEN(String TAG_OPEN) { this.TAG_OPEN = TAG_OPEN; }
    public String getTagName() { return tagName; }
    public void setTagName(String tagName) { this.tagName = tagName; }
    public List<HtmlAttribute> getAttributes() { return attributes; }
    public void setAttributes(List<HtmlAttribute> attributes) { this.attributes = attributes; }
    public String getTAG_CLOSE() { return TAG_CLOSE; }
    public void setTAG_CLOSE(String TAG_CLOSE) { this.TAG_CLOSE = TAG_CLOSE; }
    public HtmlContent getContent() { return content; }
    public void setContent(HtmlContent content) { this.content = content; }
    public String getTAG_SLASH() { return TAG_SLASH; }
    public void setTAG_SLASH(String TAG_SLASH) { this.TAG_SLASH = TAG_SLASH; }
    public String getCloseName() { return closeName; }
    public void setCloseName(String closeName) { this.closeName = closeName; }
    public String getTAG_SLASH_CLOSE() { return TAG_SLASH_CLOSE; }
    public void setTAG_SLASH_CLOSE(String TAG_SLASH_CLOSE) { this.TAG_SLASH_CLOSE = TAG_SLASH_CLOSE; }

    @Override
    public String toString() { return "PairedElement"; }
}
