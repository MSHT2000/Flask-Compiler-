package AST.Python;

public class NewlineFuncTypeComment extends FuncTypeComment {
    private final String nodeName;
    private final int lineNumber;
    private String NEWLINE;
    private String TYPE_COMMENT;

    public NewlineFuncTypeComment(String nodeName, int lineNumber, String NEWLINE, String TYPE_COMMENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NEWLINE = NEWLINE;
        this.TYPE_COMMENT = TYPE_COMMENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }

    @Override
    public String toString() { return "NewlineFuncTypeComment"; }
}
