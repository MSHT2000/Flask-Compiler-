package AST.Python;

public class UndecoratedFunctionDefinition extends FunctionDef {
    private final String nodeName;
    private final int lineNumber;
    private FunctionDefRaw functionDefRaw;

    public UndecoratedFunctionDefinition(String nodeName, int lineNumber, FunctionDefRaw functionDefRaw) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.functionDefRaw = functionDefRaw;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public FunctionDefRaw getFunctionDefRaw() { return functionDefRaw; }
    public void setFunctionDefRaw(FunctionDefRaw functionDefRaw) { this.functionDefRaw = functionDefRaw; }

    @Override
    public String toString() { return "UndecoratedFunctionDefinition"; }
}
