package AST.Python;

public class TermOperand extends Sum {
    private final String nodeName;
    private final int lineNumber;
    private Term term;

    public TermOperand(String nodeName, int lineNumber, Term term) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.term = term;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Term getTerm() { return term; }
    public void setTerm(Term term) { this.term = term; }

    @Override
    public String toString() { return "TermOperand"; }
}