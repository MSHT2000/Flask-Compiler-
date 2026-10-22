package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaAdditiveTail {
    private String nodeName;
    private int lineNumber;
    private JinjaAdditiveOperator jinjaAdditiveOperator;
    private JinjaMultiplicative jinjaMultiplicative;

    public JinjaAdditiveTail(String nodeName, int lineNumber, JinjaAdditiveOperator jinjaAdditiveOperator, JinjaMultiplicative jinjaMultiplicative) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaAdditiveOperator = jinjaAdditiveOperator;
        this.jinjaMultiplicative = jinjaMultiplicative;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaAdditiveOperator getJinjaAdditiveOperator() { return jinjaAdditiveOperator; }
    public void setJinjaAdditiveOperator(JinjaAdditiveOperator jinjaAdditiveOperator) { this.jinjaAdditiveOperator = jinjaAdditiveOperator; }
    public JinjaMultiplicative getJinjaMultiplicative() { return jinjaMultiplicative; }
    public void setJinjaMultiplicative(JinjaMultiplicative jinjaMultiplicative) { this.jinjaMultiplicative = jinjaMultiplicative; }

    @Override
    public String toString() { return "JinjaAdditiveTail"; }
}
