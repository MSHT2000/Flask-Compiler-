package AST.Python;

public class AtAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String ATEQUAL;

    public AtAssign(String nodeName, int lineNumber, String ATEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ATEQUAL = ATEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getATEQUAL() { return ATEQUAL; }
    public void setATEQUAL(String ATEQUAL) { this.ATEQUAL = ATEQUAL; }

    @Override
    public String toString() { return "AtAssign"; }
}
