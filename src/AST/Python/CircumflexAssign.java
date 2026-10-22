package AST.Python;

public class CircumflexAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String CIRCUMFLEXEQUAL;

    public CircumflexAssign(String nodeName, int lineNumber, String CIRCUMFLEXEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CIRCUMFLEXEQUAL = CIRCUMFLEXEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getCIRCUMFLEXEQUAL() { return CIRCUMFLEXEQUAL; }
    public void setCIRCUMFLEXEQUAL(String CIRCUMFLEXEQUAL) { this.CIRCUMFLEXEQUAL = CIRCUMFLEXEQUAL; }

    @Override
    public String toString() { return "CircumflexAssign"; }
}
