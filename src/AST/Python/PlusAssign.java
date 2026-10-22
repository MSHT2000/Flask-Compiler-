package AST.Python;

public class PlusAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String PLUSEQUAL;

    public PlusAssign(String nodeName, int lineNumber, String PLUSEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.PLUSEQUAL = PLUSEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getPLUSEQUAL() { return PLUSEQUAL; }
    public void setPLUSEQUAL(String PLUSEQUAL) { this.PLUSEQUAL = PLUSEQUAL; }

    @Override
    public String toString() { return "PlusAssign"; }
}
