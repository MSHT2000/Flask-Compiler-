package AST.Python;

public class SlashAssign extends Augassign {
    private final String nodeName;
    private final int lineNumber;
    private String SLASHEQUAL;

    public SlashAssign(String nodeName, int lineNumber, String SLASHEQUAL) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.SLASHEQUAL = SLASHEQUAL;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSLASHEQUAL() { return SLASHEQUAL; }
    public void setSLASHEQUAL(String SLASHEQUAL) { this.SLASHEQUAL = SLASHEQUAL; }

    @Override
    public String toString() { return "SlashAssign"; }
}
