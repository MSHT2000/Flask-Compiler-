package AST.Python;

public class CaseBlock {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_CASE;
    private Patterns patterns;
    private Guard guard;
    private String COLON;
    private Block block;

    public CaseBlock(String nodeName, int lineNumber, String NAME_OR_CASE, Patterns patterns, Guard guard, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_CASE = NAME_OR_CASE;
        this.patterns = patterns;
        this.guard = guard;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_CASE() { return NAME_OR_CASE; }
    public void setNAME_OR_CASE(String NAME_OR_CASE) { this.NAME_OR_CASE = NAME_OR_CASE; }
    public Patterns getPatterns() { return patterns; }
    public void setPatterns(Patterns patterns) { this.patterns = patterns; }
    public Guard getGuard() { return guard; }
    public void setGuard(Guard guard) { this.guard = guard; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "CaseBlock"; }
}
