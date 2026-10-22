package AST.Python;

public class ComplexNumberLiteralExpr extends LiteralExpr {
    private final String nodeName;
    private final int lineNumber;
    private ComplexNumber complexNumber;

    public ComplexNumberLiteralExpr(String nodeName, int lineNumber, ComplexNumber complexNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.complexNumber = complexNumber;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public ComplexNumber getComplexNumber() { return complexNumber; }
    public void setComplexNumber(ComplexNumber complexNumber) { this.complexNumber = complexNumber; }

    @Override
    public String toString() { return "ComplexNumberLiteralExpr"; }
}
