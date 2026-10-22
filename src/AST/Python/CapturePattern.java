package AST.Python;

public class CapturePattern {
    private final String nodeName;
    private final int lineNumber;
    private PatternCaptureTarget patternCaptureTarget;

    public CapturePattern(String nodeName, int lineNumber, PatternCaptureTarget patternCaptureTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.patternCaptureTarget = patternCaptureTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public PatternCaptureTarget getPatternCaptureTarget() { return patternCaptureTarget; }
    public void setPatternCaptureTarget(PatternCaptureTarget patternCaptureTarget) { this.patternCaptureTarget = patternCaptureTarget; }

    @Override
    public String toString() { return "CapturePattern"; }
}
