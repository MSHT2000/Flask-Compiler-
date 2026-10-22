package AST.Python;

public class SumOperand extends ShiftExpr {
    private final String nodeName;
    private final int lineNumber;
    private Sum sum;

    public SumOperand(String nodeName, int lineNumber, Sum sum) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.sum = sum;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Sum getSum() { return sum; }
    public void setSum(Sum sum) { this.sum = sum; }

    @Override
    public String toString() { return "SumOperand"; }
}