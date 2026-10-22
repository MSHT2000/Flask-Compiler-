package AST.Python;

public class AwaitExpression extends AwaitPrimary {
    private final String nodeName;
    private final int lineNumber;
    private String AWAIT;
    private Primary primary;

    public AwaitExpression(String nodeName, int lineNumber,
                           String AWAIT,
                           Primary primary) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.AWAIT = AWAIT;
        this.primary = primary;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getAWAIT() { return AWAIT; }
    public void setAWAIT(String AWAIT) { this.AWAIT = AWAIT; }

    public Primary getPrimary() { return primary; }
    public void setPrimary(Primary primary) { this.primary = primary; }

    @Override
    public String toString() { return "AwaitExpression"; }
}