package AST.Python;

public class MinusAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String MINEQUAL;

    public MinusAssign(String nodeName, int lineNumber, String MINEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.MINEQUAL = MINEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getMINEQUAL() { return MINEQUAL; }
    public void setMINEQUAL(String MINEQUAL) { this.MINEQUAL = MINEQUAL; }

    @Override
    public String toString() { return "MinusAssign"; }
}
