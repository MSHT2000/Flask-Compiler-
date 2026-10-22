package AST.Python;

public class VBarAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String VBAREQUAL;

    public VBarAssign(String nodeName, int lineNumber, String VBAREQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.VBAREQUAL = VBAREQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getVBAREQUAL() { return VBAREQUAL; }
    public void setVBAREQUAL(String VBAREQUAL) { this.VBAREQUAL = VBAREQUAL; }

    @Override
    public String toString() { return "VBarAssign"; }
}
