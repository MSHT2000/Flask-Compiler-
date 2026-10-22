package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PlusAdditiveOperator extends JinjaAdditiveOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_PLUS;

    public PlusAdditiveOperator(String nodeName, int lineNumber, String JINJA_PLUS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_PLUS = JINJA_PLUS;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_PLUS() { return JINJA_PLUS; }
    public void setJINJA_PLUS(String JINJA_PLUS) { this.JINJA_PLUS = JINJA_PLUS; }

    @Override
    public String toString() { return "PlusAdditiveOperator"; }
}
