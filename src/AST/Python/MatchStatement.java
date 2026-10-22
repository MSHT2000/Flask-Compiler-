package AST.Python;

public class MatchStatement extends CompoundStmt {
    private final String nodeName;
    private final int lineNumber;
    private MatchStmt matchStmt;

    public MatchStatement(String nodeName, int lineNumber, MatchStmt matchStmt) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.matchStmt = matchStmt;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public MatchStmt getMatchStmt() { return matchStmt; }
    public void setMatchStmt(MatchStmt matchStmt) { this.matchStmt = matchStmt; }

    @Override
    public String toString() { return "MatchStatement"; }
}
