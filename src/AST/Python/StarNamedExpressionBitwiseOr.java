package AST.Python;

public class StarNamedExpressionBitwiseOr extends StarNamedExpression {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private BitwiseOr bitwiseOr;

    public StarNamedExpressionBitwiseOr(String nodeName, int lineNumber,
                                        String STAR,
                                        BitwiseOr bitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.bitwiseOr = bitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    @Override
    public String toString() { return "StarNamedExpressionBitwiseOr"; }
}