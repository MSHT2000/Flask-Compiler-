package AST.Python;

public class NoteqBitwiseOr {
    private final String nodeName;
    private final int lineNumber;
    private String NOTEQUAL;
    private BitwiseOr bitwiseOr;

    public NoteqBitwiseOr(String nodeName, int lineNumber,
                          String NOTEQUAL,
                          BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NOTEQUAL = NOTEQUAL;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getNOTEQUAL() { return NOTEQUAL; }
    public void setNOTEQUAL(String NOTEQUAL) { this.NOTEQUAL = NOTEQUAL; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "NoteqBitwiseOr"; }
}