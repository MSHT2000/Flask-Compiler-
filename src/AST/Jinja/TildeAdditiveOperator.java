package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class TildeAdditiveOperator extends JinjaAdditiveOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_TILDE;

    public TildeAdditiveOperator(String nodeName, int lineNumber, String JINJA_TILDE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_TILDE = JINJA_TILDE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_TILDE() { return JINJA_TILDE; }
    public void setJINJA_TILDE(String JINJA_TILDE) { this.JINJA_TILDE = JINJA_TILDE; }

    @Override
    public String toString() { return "TildeAdditiveOperator"; }
}
