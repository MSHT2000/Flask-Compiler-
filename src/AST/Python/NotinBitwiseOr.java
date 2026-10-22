package AST.Python;

public class NotinBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String NOT;
    private String IN;
    private BitwiseOr bitwiseOr;

    public NotinBitwiseOr(String nodeName, int lineNumber,
                          String NOT,
                          String IN,
                          BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NOT = NOT;
        this.IN = IN;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getNOT() { return NOT; }
    public void setNOT(String NOT) { this.NOT = NOT; }

    public String getIN() { return IN; }
    public void setIN(String IN) { this.IN = IN; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "NotinBitwiseOr"; }
}