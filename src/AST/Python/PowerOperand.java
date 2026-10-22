package AST.Python;

public class PowerOperand extends Factor {
    private final String nodeName;
    private final int lineNumber;
    private Power power;

    public PowerOperand(String nodeName, int lineNumber, Power power) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.power = power;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Power getPower() { return power; }
    public void setPower(Power power) { this.power = power; }

    @Override
    public String toString() { return "PowerOperand"; }
}