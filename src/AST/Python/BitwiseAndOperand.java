package AST.Python;

public class BitwiseAndOperand extends BitwiseXor {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseAnd bitwiseAnd;

    public BitwiseAndOperand(String nodeName, int lineNumber, BitwiseAnd bitwiseAnd) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseAnd = bitwiseAnd;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseAnd getBitwiseAnd() { return bitwiseAnd; }
    public void setBitwiseAnd(BitwiseAnd bitwiseAnd) { this.bitwiseAnd = bitwiseAnd; }

    @Override
    public String toString() { return "BitwiseAndOperand"; }
}