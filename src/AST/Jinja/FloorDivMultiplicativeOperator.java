package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class FloorDivMultiplicativeOperator extends JinjaMultiplicativeOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_FLOORDIV;

    public FloorDivMultiplicativeOperator(String nodeName, int lineNumber, String JINJA_FLOORDIV) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_FLOORDIV = JINJA_FLOORDIV;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_FLOORDIV() { return JINJA_FLOORDIV; }
    public void setJINJA_FLOORDIV(String JINJA_FLOORDIV) { this.JINJA_FLOORDIV = JINJA_FLOORDIV; }

    @Override
    public String toString() { return "FloorDivMultiplicativeOperator"; }
}
