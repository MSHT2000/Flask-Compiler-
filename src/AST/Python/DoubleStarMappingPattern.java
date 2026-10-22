package AST.Python;

public class DoubleStarMappingPattern extends MappingPattern {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private DoubleStarPattern doubleStarPattern;
    private String COMMA;
    private String RBRACE;

    public DoubleStarMappingPattern(String nodeName, int lineNumber, String LBRACE, DoubleStarPattern doubleStarPattern, String COMMA, String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.doubleStarPattern = doubleStarPattern;
        this.COMMA = COMMA;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }
    public DoubleStarPattern getDoubleStarPattern() { return doubleStarPattern; }
    public void setDoubleStarPattern(DoubleStarPattern doubleStarPattern) { this.doubleStarPattern = doubleStarPattern; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "DoubleStarMappingPattern"; }
}
