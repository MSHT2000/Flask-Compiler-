package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaComment {
    private String nodeName;
    private int lineNumber;
    private String JINJA_COMMENT_OPEN;
    private List<String> text;
    private String JINJA_COMMENT_CLOSE;

    public JinjaComment(String nodeName, int lineNumber, String JINJA_COMMENT_OPEN, List<String> text, String JINJA_COMMENT_CLOSE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_COMMENT_OPEN = JINJA_COMMENT_OPEN;
        this.text = text;
        this.JINJA_COMMENT_CLOSE = JINJA_COMMENT_CLOSE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_COMMENT_OPEN() { return JINJA_COMMENT_OPEN; }
    public void setJINJA_COMMENT_OPEN(String JINJA_COMMENT_OPEN) { this.JINJA_COMMENT_OPEN = JINJA_COMMENT_OPEN; }
    public List<String> getText() { return text; }
    public void setText(List<String> text) { this.text = text; }
    public String getJINJA_COMMENT_CLOSE() { return JINJA_COMMENT_CLOSE; }
    public void setJINJA_COMMENT_CLOSE(String JINJA_COMMENT_CLOSE) { this.JINJA_COMMENT_CLOSE = JINJA_COMMENT_CLOSE; }

    @Override
    public String toString() { return "JinjaComment"; }
}
