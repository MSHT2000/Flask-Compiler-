package AST.Python;

public class BitwiseAndExpression extends BitwiseAnd {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseAnd bitwiseAnd;
    private String AMPER;
    private ShiftExpr shiftExpr;

    public BitwiseAndExpression(String nodeName, int lineNumber,
                                BitwiseAnd bitwiseAnd,
                                String AMPER,
                                ShiftExpr shiftExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseAnd = bitwiseAnd;
        this.AMPER = AMPER;
        this.shiftExpr = shiftExpr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseAnd getBitwiseAnd() { return bitwiseAnd; }
    public void setBitwiseAnd(BitwiseAnd bitwiseAnd) { this.bitwiseAnd = bitwiseAnd; }

    public String getAMPER() { return AMPER; }
    public void setAMPER(String AMPER) { this.AMPER = AMPER; }

    public ShiftExpr getShiftExpr() { return shiftExpr; }
    public void setShiftExpr(ShiftExpr shiftExpr) { this.shiftExpr = shiftExpr; }

    @Override
    public String toString() { return "BitwiseAndExpression"; }
}