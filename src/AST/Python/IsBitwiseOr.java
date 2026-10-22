package AST.Python;

public class IsBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String IS;
    private BitwiseOr bitwiseOr;

    public IsBitwiseOr(String nodeName, int lineNumber,
                       String IS,
                       BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.IS = IS;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getIS() { return IS; }
    public void setIS(String IS) { this.IS = IS; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "IsBitwiseOr"; }
}