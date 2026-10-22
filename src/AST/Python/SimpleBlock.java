package AST.Python;

public class SimpleBlock extends Block {
    private final String nodeName;
    private final int lineNumber;
    private SimpleStmts simpleStmts;

    public SimpleBlock(String nodeName, int lineNumber, SimpleStmts simpleStmts) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.simpleStmts = simpleStmts;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public SimpleStmts getSimpleStmts() { return simpleStmts; }
    public void setSimpleStmts(SimpleStmts simpleStmts) { this.simpleStmts = simpleStmts; }

    @Override
    public String toString() { return "SimpleBlock"; }
}
