package AST.Python;

public class ItemsMappingPattern extends MappingPattern {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private ItemsPattern itemsPattern;
    private java.util.List<String> COMMA;
    private DoubleStarPattern doubleStarPattern;
    private String RBRACE;

    public ItemsMappingPattern(String nodeName, int lineNumber, String LBRACE, ItemsPattern itemsPattern, java.util.List<String> COMMA, DoubleStarPattern doubleStarPattern, String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.itemsPattern = itemsPattern;
        this.COMMA = COMMA;
        this.doubleStarPattern = doubleStarPattern;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }
    public ItemsPattern getItemsPattern() { return itemsPattern; }
    public void setItemsPattern(ItemsPattern itemsPattern) { this.itemsPattern = itemsPattern; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }
    public DoubleStarPattern getDoubleStarPattern() { return doubleStarPattern; }
    public void setDoubleStarPattern(DoubleStarPattern doubleStarPattern) { this.doubleStarPattern = doubleStarPattern; }
    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "ItemsMappingPattern"; }
}
