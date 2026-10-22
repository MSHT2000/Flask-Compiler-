package AST.Python;

import java.util.List;

public class Disjunction {
    private final String nodeName;
    private final int lineNumber;
    private List<Conjunction> conjunction;
    private List<String> OR;

    public Disjunction(String nodeName, int lineNumber,
                       List<Conjunction> conjunction,
                       List<String> OR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.conjunction = conjunction;
        this.OR = OR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Conjunction> getConjunction() { return conjunction; }
    public void setConjunction(List<Conjunction> conjunction) { this.conjunction = conjunction; }

    public List<String> getOR() { return OR; }
    public void setOR(List<String> OR) { this.OR = OR; }

    @Override
    public String toString() { return "Disjunction"; }
}