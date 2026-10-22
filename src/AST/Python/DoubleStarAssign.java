package AST.Python;

public class DoubleStarAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAREQUAL;

    public DoubleStarAssign(String nodeName, int lineNumber, String DOUBLESTAREQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAREQUAL = DOUBLESTAREQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDOUBLESTAREQUAL() { return DOUBLESTAREQUAL; }
    public void setDOUBLESTAREQUAL(String DOUBLESTAREQUAL) { this.DOUBLESTAREQUAL = DOUBLESTAREQUAL; }

    @Override
    public String toString() { return "DoubleStarAssign"; }
}
