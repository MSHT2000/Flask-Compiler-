package AST.Python;

public class DelStmt {
    private final String nodeName;
    private final int lineNumber;
    private String DEL;
    private DelTargets delTargets;

    public DelStmt(String nodeName, int lineNumber, String DEL, DelTargets delTargets) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DEL = DEL;
        this.delTargets = delTargets;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDEL() { return DEL; }
    public void setDEL(String DEL) { this.DEL = DEL; }
    public DelTargets getDelTargets() { return delTargets; }
    public void setDelTargets(DelTargets delTargets) { this.delTargets = delTargets; }

    @Override
    public String toString() { return "DelStmt"; }
}
