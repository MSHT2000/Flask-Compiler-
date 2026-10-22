package AST.Python;

public class ComparisonInversion extends Inversion {
    private final String nodeName;
    private final int lineNumber;
    private Comparison comparison;

    public ComparisonInversion(String nodeName, int lineNumber, Comparison comparison) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.comparison = comparison;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Comparison getComparison() { return comparison; }
    public void setComparison(Comparison comparison) { this.comparison = comparison; }

    @Override
    public String toString() { return "ComparisonInversion"; }
}