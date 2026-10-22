package AST.Python;

public class AmpersandAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String AMPEREQUAL;

    public AmpersandAssign(String nodeName, int lineNumber, String AMPEREQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.AMPEREQUAL = AMPEREQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getAMPEREQUAL() { return AMPEREQUAL; }
    public void setAMPEREQUAL(String AMPEREQUAL) { this.AMPEREQUAL = AMPEREQUAL; }

    @Override
    public String toString() { return "AmpersandAssign"; }
}
