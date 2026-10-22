package AST.Python;

public class SubscriptAttributeTarget extends SingleTarget {
    private final String nodeName;
    private final int lineNumber;
    private SingleSubscriptAttributeTarget singleSubscriptAttributeTarget;

    public SubscriptAttributeTarget(String nodeName, int lineNumber,
                                    SingleSubscriptAttributeTarget singleSubscriptAttributeTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.singleSubscriptAttributeTarget = singleSubscriptAttributeTarget;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public SingleSubscriptAttributeTarget getSingleSubscriptAttributeTarget() {
        return singleSubscriptAttributeTarget;
    }
    public void setSingleSubscriptAttributeTarget(
            SingleSubscriptAttributeTarget singleSubscriptAttributeTarget) {
        this.singleSubscriptAttributeTarget = singleSubscriptAttributeTarget;
    }

    @Override
    public String toString() { return "SubscriptAttributeTarget"; }
}