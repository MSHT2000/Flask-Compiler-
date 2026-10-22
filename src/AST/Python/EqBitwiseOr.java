package AST.Python;

public class EqBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String EQEQUAL;
    private BitwiseOr bitwiseOr;

    public EqBitwiseOr(String nodeName, int lineNumber,
                       String EQEQUAL,
                       BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EQEQUAL = EQEQUAL;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getEQEQUAL() { return EQEQUAL; }
    public void setEQEQUAL(String EQEQUAL) { this.EQEQUAL = EQEQUAL; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "EqBitwiseOr"; }
}