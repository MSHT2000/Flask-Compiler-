package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaMultiplicativeTail {
    private String nodeName;
    private int lineNumber;
    private JinjaMultiplicativeOperator jinjaMultiplicativeOperator;
    private JinjaPower jinjaPower;

    public JinjaMultiplicativeTail(String nodeName, int lineNumber, JinjaMultiplicativeOperator jinjaMultiplicativeOperator, JinjaPower jinjaPower) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaMultiplicativeOperator = jinjaMultiplicativeOperator;
        this.jinjaPower = jinjaPower;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaMultiplicativeOperator getJinjaMultiplicativeOperator() { return jinjaMultiplicativeOperator; }
    public void setJinjaMultiplicativeOperator(JinjaMultiplicativeOperator jinjaMultiplicativeOperator) { this.jinjaMultiplicativeOperator = jinjaMultiplicativeOperator; }
    public JinjaPower getJinjaPower() { return jinjaPower; }
    public void setJinjaPower(JinjaPower jinjaPower) { this.jinjaPower = jinjaPower; }

    @Override
    public String toString() { return "JinjaMultiplicativeTail"; }
}
