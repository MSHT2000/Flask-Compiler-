package AST.Python;

public class ShiftExpression extends ShiftExpr {
    private final String nodeName;
    private final int lineNumber;
    private ShiftExpr shiftExpr;
    private String LEFTSHIFT;    // nullable — one of LEFTSHIFT / RIGHTSHIFT is non-null
    private String RIGHTSHIFT;   // nullable
    private Sum sum;

    public ShiftExpression(String nodeName, int lineNumber,
                           ShiftExpr shiftExpr,
                           String LEFTSHIFT,
                           String RIGHTSHIFT,
                           Sum sum) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.shiftExpr = shiftExpr;
        this.LEFTSHIFT = LEFTSHIFT;
        this.RIGHTSHIFT = RIGHTSHIFT;
        this.sum = sum;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public ShiftExpr getShiftExpr() { return shiftExpr; }
    public void setShiftExpr(ShiftExpr shiftExpr) { this.shiftExpr = shiftExpr; }

    public String getLEFTSHIFT() { return LEFTSHIFT; }
    public void setLEFTSHIFT(String LEFTSHIFT) { this.LEFTSHIFT = LEFTSHIFT; }

    public String getRIGHTSHIFT() { return RIGHTSHIFT; }
    public void setRIGHTSHIFT(String RIGHTSHIFT) { this.RIGHTSHIFT = RIGHTSHIFT; }

    public Sum getSum() { return sum; }
    public void setSum(Sum sum) { this.sum = sum; }

    @Override
    public String toString() { return "ShiftExpression"; }
}