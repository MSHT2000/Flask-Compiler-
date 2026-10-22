package AST.Python;

public class DecoratedFunctionDefinition extends FunctionDef {
    private final String nodeName;
    private final int lineNumber;
    private Decorators decorators;
    private FunctionDefRaw functionDefRaw;

    public DecoratedFunctionDefinition(String nodeName, int lineNumber, Decorators decorators, FunctionDefRaw functionDefRaw) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.decorators = decorators;
        this.functionDefRaw = functionDefRaw;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Decorators getDecorators() { return decorators; }
    public void setDecorators(Decorators decorators) { this.decorators = decorators; }
    public FunctionDefRaw getFunctionDefRaw() { return functionDefRaw; }
    public void setFunctionDefRaw(FunctionDefRaw functionDefRaw) { this.functionDefRaw = functionDefRaw; }

    @Override
    public String toString() { return "DecoratedFunctionDefinition"; }
}
