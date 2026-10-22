package AST.Python;

public class PercentAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String PERCENTEQUAL;

    public PercentAssign(String nodeName, int lineNumber, String PERCENTEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.PERCENTEQUAL = PERCENTEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getPERCENTEQUAL() { return PERCENTEQUAL; }
    public void setPERCENTEQUAL(String PERCENTEQUAL) { this.PERCENTEQUAL = PERCENTEQUAL; }

    @Override
    public String toString() { return "PercentAssign"; }
}
