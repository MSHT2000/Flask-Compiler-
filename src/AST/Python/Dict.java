package AST.Python;

public class Dict {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private DoubleStarredKvpairs doubleStarredKvpairs;   // nullable — null for "{}"
    private String RBRACE;

    public Dict(String nodeName, int lineNumber,
                String LBRACE,
                DoubleStarredKvpairs doubleStarredKvpairs,
                String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.doubleStarredKvpairs = doubleStarredKvpairs;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }

    public DoubleStarredKvpairs getDoubleStarredKvpairs() { return doubleStarredKvpairs; }
    public void setDoubleStarredKvpairs(DoubleStarredKvpairs doubleStarredKvpairs) {
        this.doubleStarredKvpairs = doubleStarredKvpairs;
    }

    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "Dict"; }
}