package AST.Python;

public class BitwiseXorOperand extends BitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseXor bitwiseXor;

    public BitwiseXorOperand(String nodeName, int lineNumber, BitwiseXor bitwiseXor) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseXor = bitwiseXor;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseXor getBitwiseXor() { return bitwiseXor; }
    public void setBitwiseXor(BitwiseXor bitwiseXor) { this.bitwiseXor = bitwiseXor; }

    @Override
    public String toString() { return "BitwiseXorOperand"; }
}