package AST.Python;

public class NotInComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private NotinBitwiseOr notinBitwiseOr;

    public NotInComparison(String nodeName, int lineNumber, NotinBitwiseOr notinBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.notinBitwiseOr = notinBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public NotinBitwiseOr getNotinBitwiseOr() { return notinBitwiseOr; }
    public void setNotinBitwiseOr(NotinBitwiseOr notinBitwiseOr) { this.notinBitwiseOr = notinBitwiseOr; }

    @Override
    public String toString() { return "NotInComparison"; }
}