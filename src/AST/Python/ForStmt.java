package AST.Python;

public class ForStmt {
    private final String nodeName;
    private final int lineNumber;
    private String ASYNC;
    private String FOR;
    private StarTargets starTargets;
    private String IN;
    private StarExpressions starExpressions;
    private String COLON;
    private String TYPE_COMMENT;
    private Block block;
    private ElseBlock elseBlock;

    public ForStmt(String nodeName, int lineNumber, String ASYNC, String FOR, StarTargets starTargets, String IN, StarExpressions starExpressions, String COLON, String TYPE_COMMENT, Block block, ElseBlock elseBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASYNC = ASYNC;
        this.FOR = FOR;
        this.starTargets = starTargets;
        this.IN = IN;
        this.starExpressions = starExpressions;
        this.COLON = COLON;
        this.TYPE_COMMENT = TYPE_COMMENT;
        this.block = block;
        this.elseBlock = elseBlock;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getASYNC() { return ASYNC; }
    public void setASYNC(String ASYNC) { this.ASYNC = ASYNC; }
    public String getFOR() { return FOR; }
    public void setFOR(String FOR) { this.FOR = FOR; }
    public StarTargets getStarTargets() { return starTargets; }
    public void setStarTargets(StarTargets starTargets) { this.starTargets = starTargets; }
    public String getIN() { return IN; }
    public void setIN(String IN) { this.IN = IN; }
    public StarExpressions getStarExpressions() { return starExpressions; }
    public void setStarExpressions(StarExpressions starExpressions) { this.starExpressions = starExpressions; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public String getTYPE_COMMENT() { return TYPE_COMMENT; }
    public void setTYPE_COMMENT(String TYPE_COMMENT) { this.TYPE_COMMENT = TYPE_COMMENT; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }

    @Override
    public String toString() { return "ForStmt"; }
}
