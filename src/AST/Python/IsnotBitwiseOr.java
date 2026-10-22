package AST.Python;

public class IsnotBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String IS;
    private String NOT;
    private BitwiseOr bitwiseOr;

    public IsnotBitwiseOr(String nodeName, int lineNumber,
                          String IS,
                          String NOT,
                          BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IS = IS;
        this.NOT = NOT;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getIS() { return IS; }
    public void setIS(String IS) { this.IS = IS; }

    public String getNOT() { return NOT; }
    public void setNOT(String NOT) { this.NOT = NOT; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "IsnotBitwiseOr"; }
}