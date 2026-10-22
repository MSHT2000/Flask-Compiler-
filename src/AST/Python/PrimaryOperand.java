package AST.Python;

public class PrimaryOperand extends AwaitPrimary {
    private final String nodeName;
    private final int lineNumber;
    private Primary primary;

    public PrimaryOperand(String nodeName, int lineNumber, Primary primary) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.primary = primary;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Primary getPrimary() { return primary; }
    public void setPrimary(Primary primary) { this.primary = primary; }

    @Override
    public String toString() { return "PrimaryOperand"; }
}