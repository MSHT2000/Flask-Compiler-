package AST.Python;

public class BitwiseOrExpression extends BitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseOr bitwiseOr;
    private String VBAR;
    private BitwiseXor bitwiseXor;

    public BitwiseOrExpression(String nodeName, int lineNumber,
                               BitwiseOr bitwiseOr,
                               String VBAR,
                               BitwiseXor bitwiseXor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseOr = bitwiseOr;
        this.VBAR = VBAR;
        this.bitwiseXor = bitwiseXor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    public String getVBAR() { return VBAR; }
    public void setVBAR(String VBAR) { this.VBAR = VBAR; }

    public BitwiseXor getBitwiseXor() { return bitwiseXor; }
    public void setBitwiseXor(BitwiseXor bitwiseXor) { this.bitwiseXor = bitwiseXor; }

    @Override
    public String toString() { return "BitwiseOrExpression"; }
}