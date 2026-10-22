package AST.Python;

public class LtBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String LESS;
    private BitwiseOr bitwiseOr;

    public LtBitwiseOr(String nodeName, int lineNumber,
                       String LESS,
                       BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LESS = LESS;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLESS() { return LESS; }
    public void setLESS(String LESS) { this.LESS = LESS; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "LtBitwiseOr"; }
}