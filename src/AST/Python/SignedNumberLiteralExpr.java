package AST.Python;

public class SignedNumberLiteralExpr extends LiteralExpr {
    private final String nodeName;
    private final int lineNumber;
    private SignedNumber signedNumber;

    public SignedNumberLiteralExpr(String nodeName, int lineNumber, SignedNumber signedNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.signedNumber = signedNumber;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SignedNumber getSignedNumber() { return signedNumber; }
    public void setSignedNumber(SignedNumber signedNumber) { this.signedNumber = signedNumber; }

    @Override
    public String toString() { return "SignedNumberLiteralExpr"; }
}
