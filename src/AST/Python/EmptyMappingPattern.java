package AST.Python;

public class EmptyMappingPattern extends MappingPattern {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private String RBRACE;

    public EmptyMappingPattern(String nodeName, int lineNumber, String LBRACE, String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }
    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "EmptyMappingPattern"; }
}
