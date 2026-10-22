package AST.Python;

public class Interactive {
    private final String nodeName;
    private final int lineNumber;
    private StatementNewline statementNewline;

    public Interactive(String nodeName, int lineNumber, StatementNewline statementNewline) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.statementNewline = statementNewline;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public StatementNewline getStatementNewline() { return statementNewline; }
    public void setStatementNewline(StatementNewline statementNewline) { this.statementNewline = statementNewline; }

    @Override
    public String toString() { return "Interactive"; }
}
