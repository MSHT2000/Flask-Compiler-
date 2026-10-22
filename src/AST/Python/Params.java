package AST.Python;

public class Params {
    private final String nodeName;
    private final int lineNumber;
    private Parameters parameters;

    public Params(String nodeName, int lineNumber, Parameters parameters) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.parameters = parameters;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Parameters getParameters() { return parameters; }
    public void setParameters(Parameters parameters) { this.parameters = parameters; }

    @Override
    public String toString() { return "Params"; }
}
