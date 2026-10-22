package AST.Python;

public class InBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String IN;
    private BitwiseOr bitwiseOr;

    public InBitwiseOr(String nodeName, int lineNumber,
                       String IN,
                       BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IN = IN;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getIN() { return IN; }
    public void setIN(String IN) { this.IN = IN; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "InBitwiseOr"; }
}