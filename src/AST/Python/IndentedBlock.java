package AST.Python;

public class IndentedBlock extends Block {
    private final String nodeName;
    private final int lineNumber;
    private String NEWLINE;
    private String INDENT;
    private Statements statements;
    private String DEDENT;

    public IndentedBlock(String nodeName, int lineNumber, String NEWLINE, String INDENT, Statements statements, String DEDENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NEWLINE = NEWLINE;
        this.INDENT = INDENT;
        this.statements = statements;
        this.DEDENT = DEDENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }
    public String getINDENT() { return INDENT; }
    public void setINDENT(String INDENT) { this.INDENT = INDENT; }
    public Statements getStatements() { return statements; }
    public void setStatements(Statements statements) { this.statements = statements; }
    public String getDEDENT() { return DEDENT; }
    public void setDEDENT(String DEDENT) { this.DEDENT = DEDENT; }

    @Override
    public String toString() { return "IndentedBlock"; }
}
