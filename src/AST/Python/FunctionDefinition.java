package AST.Python;

public class FunctionDefinition extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private FunctionDef functionDef;

    public FunctionDefinition(String nodeName, int lineNumber, FunctionDef functionDef) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.functionDef = functionDef;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public FunctionDef getFunctionDef() { return functionDef; }
    public void setFunctionDef(FunctionDef functionDef) { this.functionDef = functionDef; }

    @Override
    public String toString() { return "FunctionDefinition"; }
}
