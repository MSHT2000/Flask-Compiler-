package AST.Python;

public class BitwiseXorExpression extends BitwiseXor {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseXor bitwiseXor;
    private String CIRCUMFLEX;
    private BitwiseAnd bitwiseAnd;

    public BitwiseXorExpression(String nodeName, int lineNumber,
                                BitwiseXor bitwiseXor,
                                String CIRCUMFLEX,
                                BitwiseAnd bitwiseAnd) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseXor = bitwiseXor;
        this.CIRCUMFLEX = CIRCUMFLEX;
        this.bitwiseAnd = bitwiseAnd;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseXor getBitwiseXor() { return bitwiseXor; }
    public void setBitwiseXor(BitwiseXor bitwiseXor) { this.bitwiseXor = bitwiseXor; }

    public String getCIRCUMFLEX() { return CIRCUMFLEX; }
    public void setCIRCUMFLEX(String CIRCUMFLEX) { this.CIRCUMFLEX = CIRCUMFLEX; }

    public BitwiseAnd getBitwiseAnd() { return bitwiseAnd; }
    public void setBitwiseAnd(BitwiseAnd bitwiseAnd) { this.bitwiseAnd = bitwiseAnd; }

    @Override
    public String toString() { return "BitwiseXorExpression"; }
}