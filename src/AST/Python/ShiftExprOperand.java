package AST.Python;

public class ShiftExprOperand extends BitwiseAnd {
    private final String nodeName;
    private final int lineNumber;
    private ShiftExpr shiftExpr;

    public ShiftExprOperand(String nodeName, int lineNumber, ShiftExpr shiftExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.shiftExpr = shiftExpr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public ShiftExpr getShiftExpr() { return shiftExpr; }
    public void setShiftExpr(ShiftExpr shiftExpr) { this.shiftExpr = shiftExpr; }

    @Override
    public String toString() { return "ShiftExprOperand"; }
}