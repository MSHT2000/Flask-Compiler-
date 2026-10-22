package AST.Python;

public class RightShiftAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String RIGHTSHIFTEQUAL;

    public RightShiftAssign(String nodeName, int lineNumber, String RIGHTSHIFTEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.RIGHTSHIFTEQUAL = RIGHTSHIFTEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getRIGHTSHIFTEQUAL() { return RIGHTSHIFTEQUAL; }
    public void setRIGHTSHIFTEQUAL(String RIGHTSHIFTEQUAL) { this.RIGHTSHIFTEQUAL = RIGHTSHIFTEQUAL; }

    @Override
    public String toString() { return "RightShiftAssign"; }
}
