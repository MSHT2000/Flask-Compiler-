package AST.Python;

public class CaptureClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private CapturePattern capturePattern;

    public CaptureClosedPattern(String nodeName, int lineNumber, CapturePattern capturePattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.capturePattern = capturePattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public CapturePattern getCapturePattern() { return capturePattern; }
    public void setCapturePattern(CapturePattern capturePattern) { this.capturePattern = capturePattern; }

    @Override
    public String toString() { return "CaptureClosedPattern"; }
}
