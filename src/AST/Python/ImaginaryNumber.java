package AST.Python;

public class ImaginaryNumber {
    private final String nodeName;
    private final int lineNumber;
    private String NUMBER;

    public ImaginaryNumber(String nodeName, int lineNumber, String NUMBER) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NUMBER = NUMBER;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNUMBER() { return NUMBER; }
    public void setNUMBER(String NUMBER) { this.NUMBER = NUMBER; }

    @Override
    public String toString() { return "ImaginaryNumber"; }
}
