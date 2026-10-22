package AST.Python;

public class RegularWithItems extends WithStmt {
    private final String nodeName;
    private final int lineNumber;
    private String ASYNC;
    private String WITH;
    private java.util.List<WithItem> withItem;
    private java.util.List<String> COMMA;
    private String COLON;
    private String TYPE_COMMENT;
    private Block block;

    public RegularWithItems(String nodeName, int lineNumber, String ASYNC, String WITH, java.util.List<WithItem> withItem, java.util.List<String> COMMA, String COLON, String TYPE_COMMENT, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASYNC = ASYNC;
        this.WITH = WITH;
        this.withItem = withItem;
        this.COMMA = COMMA;
        this.COLON = COLON;
        this.TYPE_COMMENT = TYPE_COMMENT;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getASYNC() { return ASYNC; }
    public void setASYNC(String ASYNC) { this.ASYNC = ASYNC; }
    public String getWITH() { return WITH; }
    public void setWITH(String WITH) { this.WITH = WITH; }
    public java.util.List<WithItem> getWithItem() { return withItem; }
    public void setWithItem(java.util.List<WithItem> withItem) { this.withItem = withItem; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "RegularWithItems"; }
}
