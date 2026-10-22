package AST.Python;

public class MappingClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private MappingPattern mappingPattern;

    public MappingClosedPattern(String nodeName, int lineNumber, MappingPattern mappingPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.mappingPattern = mappingPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public MappingPattern getMappingPattern() { return mappingPattern; }
    public void setMappingPattern(MappingPattern mappingPattern) { this.mappingPattern = mappingPattern; }

    @Override
    public String toString() { return "MappingClosedPattern"; }
}
