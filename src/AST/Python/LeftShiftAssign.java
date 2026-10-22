package AST.Python;

public class LeftShiftAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String LEFTSHIFTEQUAL;

    public LeftShiftAssign(String nodeName, int lineNumber, String LEFTSHIFTEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LEFTSHIFTEQUAL = LEFTSHIFTEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLEFTSHIFTEQUAL() { return LEFTSHIFTEQUAL; }
    public void setLEFTSHIFTEQUAL(String LEFTSHIFTEQUAL) { this.LEFTSHIFTEQUAL = LEFTSHIFTEQUAL; }

    @Override
    public String toString() { return "LeftShiftAssign"; }
}
