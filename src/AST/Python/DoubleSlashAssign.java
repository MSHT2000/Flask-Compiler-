package AST.Python;

public class DoubleSlashAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESLASHEQUAL;

    public DoubleSlashAssign(String nodeName, int lineNumber, String DOUBLESLASHEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESLASHEQUAL = DOUBLESLASHEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDOUBLESLASHEQUAL() { return DOUBLESLASHEQUAL; }
    public void setDOUBLESLASHEQUAL(String DOUBLESLASHEQUAL) { this.DOUBLESLASHEQUAL = DOUBLESLASHEQUAL; }

    @Override
    public String toString() { return "DoubleSlashAssign"; }
}
