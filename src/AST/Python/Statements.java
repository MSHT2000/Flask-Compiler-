package AST.Python;

public class Statements {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<Statement> statement;

    public Statements(String nodeName, int lineNumber, java.util.List<Statement> statement) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.statement = statement;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<Statement> getStatement() { return statement; }
    public void setStatement(java.util.List<Statement> statement) { this.statement = statement; }

    @Override
    public String toString() { return "Statements"; }
}
