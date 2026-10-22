package AST.Python;

public class LteBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String LESSEQUAL;
    private BitwiseOr bitwiseOr;

    public LteBitwiseOr(String nodeName, int lineNumber,
                        String LESSEQUAL,
                        BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LESSEQUAL = LESSEQUAL;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLESSEQUAL() { return LESSEQUAL; }
    public void setLESSEQUAL(String LESSEQUAL) { this.LESSEQUAL = LESSEQUAL; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "LteBitwiseOr"; }
}