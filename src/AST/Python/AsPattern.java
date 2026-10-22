package AST.Python;

public class AsPattern {
    private final String nodeName;
    private final int lineNumber;
    private OrPattern orPattern;
    private String AS;
    private PatternCaptureTarget patternCaptureTarget;

    public AsPattern(String nodeName, int lineNumber, OrPattern orPattern, String AS, PatternCaptureTarget patternCaptureTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.orPattern = orPattern;
        this.AS = AS;
        this.patternCaptureTarget = patternCaptureTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public OrPattern getOrPattern() { return orPattern; }
    public void setOrPattern(OrPattern orPattern) { this.orPattern = orPattern; }
    public String getAS() { return AS; }
    public void setAS(String AS) { this.AS = AS; }
    public PatternCaptureTarget getPatternCaptureTarget() { return patternCaptureTarget; }
    public void setPatternCaptureTarget(PatternCaptureTarget patternCaptureTarget) { this.patternCaptureTarget = patternCaptureTarget; }

    @Override
    public String toString() { return "AsPattern"; }
}
