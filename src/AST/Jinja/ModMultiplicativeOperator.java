package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ModMultiplicativeOperator extends JinjaMultiplicativeOperator {
    private String nodeName;
    private int lineNumber;
    private String JINJA_MOD;

    public ModMultiplicativeOperator(String nodeName, int lineNumber, String JINJA_MOD) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_MOD = JINJA_MOD;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_MOD() { return JINJA_MOD; }
    public void setJINJA_MOD(String JINJA_MOD) { this.JINJA_MOD = JINJA_MOD; }

    @Override
    public String toString() { return "ModMultiplicativeOperator"; }
}
