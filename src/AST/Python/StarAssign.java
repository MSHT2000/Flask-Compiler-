package AST.Python;

public class StarAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String STAREQUAL;

    public StarAssign(String nodeName, int lineNumber, String STAREQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAREQUAL = STAREQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAREQUAL() { return STAREQUAL; }
    public void setSTAREQUAL(String STAREQUAL) { this.STAREQUAL = STAREQUAL; }

    @Override
    public String toString() { return "StarAssign"; }
}
