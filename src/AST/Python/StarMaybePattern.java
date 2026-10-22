package AST.Python;

public class StarMaybePattern extends MaybeStarPattern {
    private final String nodeName;
    private final int lineNumber;
    private StarPattern starPattern;

    public StarMaybePattern(String nodeName, int lineNumber, StarPattern starPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starPattern = starPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public StarPattern getStarPattern() { return starPattern; }
    public void setStarPattern(StarPattern starPattern) { this.starPattern = starPattern; }

    @Override
    public String toString() { return "StarMaybePattern"; }
}
