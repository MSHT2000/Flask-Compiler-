package AST.Python;

public class InlineFuncTypeComment extends FuncTypeComment {
    private final String nodeName;
    private final int lineNumber;
    private String TYPE_COMMENT;

    public InlineFuncTypeComment(String nodeName, int lineNumber, String TYPE_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TYPE_COMMENT = TYPE_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }

    @Override
    public String toString() { return "InlineFuncTypeComment"; }
}
