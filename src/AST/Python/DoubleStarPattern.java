package AST.Python;

public class DoubleStarPattern {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private PatternCaptureTarget patternCaptureTarget;

    public DoubleStarPattern(String nodeName, int lineNumber, String DOUBLESTAR, PatternCaptureTarget patternCaptureTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.patternCaptureTarget = patternCaptureTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }
    public PatternCaptureTarget getPatternCaptureTarget() { return patternCaptureTarget; }
    public void setPatternCaptureTarget(PatternCaptureTarget patternCaptureTarget) { this.patternCaptureTarget = patternCaptureTarget; }

    @Override
    public String toString() { return "DoubleStarPattern"; }
}
