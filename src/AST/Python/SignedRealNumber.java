package AST.Python;

public class SignedRealNumber {
    private final String nodeName;
    private final int lineNumber;
    private String MINUS;
    private RealNumber realNumber;

    public SignedRealNumber(String nodeName, int lineNumber, String MINUS, RealNumber realNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.MINUS = MINUS;
        this.realNumber = realNumber;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getMINUS() { return MINUS; }
    public void setMINUS(String MINUS) { this.MINUS = MINUS; }
    public RealNumber getRealNumber() { return realNumber; }
    public void setRealNumber(RealNumber realNumber) { this.realNumber = realNumber; }

    @Override
    public String toString() { return "SignedRealNumber"; }
}
