package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class MinusAdditiveOperator extends JinjaAdditiveOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_MINUS;

    public MinusAdditiveOperator(String nodeName, int lineNumber, String JINJA_MINUS) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_MINUS = JINJA_MINUS;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_MINUS() { return JINJA_MINUS; }
    public void setJINJA_MINUS(String JINJA_MINUS) { this.JINJA_MINUS = JINJA_MINUS; }

    @Override
    public String toString() { return "MinusAdditiveOperator"; }
}
