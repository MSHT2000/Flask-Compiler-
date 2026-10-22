package AST.Python;

public class SignedNumber {
    private final String nodeName;
    private final int lineNumber;
    private String MINUS;
    private String NUMBER;

    public SignedNumber(String nodeName, int lineNumber, String MINUS, String NUMBER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.MINUS = MINUS;
        this.NUMBER = NUMBER;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getMINUS() { return MINUS; }
    public void setMINUS(String MINUS) { this.MINUS = MINUS; }
    public String getNUMBER() { return NUMBER; }
    public void setNUMBER(String NUMBER) { this.NUMBER = NUMBER; }

    @Override
    public String toString() { return "SignedNumber"; }
}
