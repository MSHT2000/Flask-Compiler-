package AST.Python;

public class ComplexNumber {
    private final String nodeName;
    private final int lineNumber;
    private SignedRealNumber signedRealNumber;
    private String PLUS;
    private String MINUS;
    private ImaginaryNumber imaginaryNumber;

    public ComplexNumber(String nodeName, int lineNumber, SignedRealNumber signedRealNumber, String PLUS, String MINUS, ImaginaryNumber imaginaryNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.signedRealNumber = signedRealNumber;
        this.PLUS = PLUS;
        this.MINUS = MINUS;
        this.imaginaryNumber = imaginaryNumber;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SignedRealNumber getSignedRealNumber() { return signedRealNumber; }
    public void setSignedRealNumber(SignedRealNumber signedRealNumber) { this.signedRealNumber = signedRealNumber; }
    public String getPLUS() { return PLUS; }
    public void setPLUS(String PLUS) { this.PLUS = PLUS; }
    public String getMINUS() { return MINUS; }
    public void setMINUS(String MINUS) { this.MINUS = MINUS; }
    public ImaginaryNumber getImaginaryNumber() { return imaginaryNumber; }
    public void setImaginaryNumber(ImaginaryNumber imaginaryNumber) { this.imaginaryNumber = imaginaryNumber; }

    @Override
    public String toString() { return "ComplexNumber"; }
}
