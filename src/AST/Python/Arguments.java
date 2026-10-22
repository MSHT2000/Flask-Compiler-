package AST.Python;

public class Arguments {
    private final String nodeName;
    private final int lineNumber;
    private Args args;
    private String COMMA;

    public Arguments(String nodeName, int lineNumber, Args args, String COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.args = args;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Args getArgs() { return args; }
    public void setArgs(Args args) { this.args = args; }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "Arguments"; }
}