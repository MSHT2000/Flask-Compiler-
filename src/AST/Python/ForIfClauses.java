package AST.Python;

import java.util.List;

public class ForIfClauses {
    private final String nodeName;
    private final int lineNumber;
    private List<ForIfClause> forIfClause;

    public ForIfClauses(String nodeName, int lineNumber,
                        List<ForIfClause> forIfClause) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.forIfClause = forIfClause;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<ForIfClause> getForIfClause() { return forIfClause; }
    public void setForIfClause(List<ForIfClause> forIfClause) {
        this.forIfClause = forIfClause;
    }

    @Override
    public String toString() { return "ForIfClauses"; }
}