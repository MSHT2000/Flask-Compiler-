package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class StarMultiplicativeOperator extends JinjaMultiplicativeOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_STAR;

    public StarMultiplicativeOperator(String nodeName, int lineNumber, String JINJA_STAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STAR = JINJA_STAR;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_STAR() { return JINJA_STAR; }
    public void setJINJA_STAR(String JINJA_STAR) { this.JINJA_STAR = JINJA_STAR; }

    @Override
    public String toString() { return "StarMultiplicativeOperator"; }
}
