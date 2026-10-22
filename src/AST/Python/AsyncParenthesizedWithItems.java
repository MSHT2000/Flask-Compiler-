package AST.Python;

public class AsyncParenthesizedWithItems extends WithStmt {
    private final String nodeName;
    private final int lineNumber;
    private String ASYNC;
    private String WITH;
    private String LPAR;
    private java.util.List<WithItem> withItem;
    private java.util.List<String> COMMA;
    private String RPAR;
    private String COLON;
    private Block block;

    public AsyncParenthesizedWithItems(String nodeName, int lineNumber, String ASYNC, String WITH, String LPAR, java.util.List<WithItem> withItem, java.util.List<String> COMMA, String RPAR, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASYNC = ASYNC;
        this.WITH = WITH;
        this.LPAR = LPAR;
        this.withItem = withItem;
        this.COMMA = COMMA;
        this.RPAR = RPAR;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getASYNC() { return ASYNC; }
    public void setASYNC(String ASYNC) { this.ASYNC = ASYNC; }
    public String getWITH() { return WITH; }
    public void setWITH(String WITH) { this.WITH = WITH; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public java.util.List<WithItem> getWithItem() { return withItem; }
    public void setWithItem(java.util.List<WithItem> withItem) { this.withItem = withItem; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "AsyncParenthesizedWithItems"; }
}
