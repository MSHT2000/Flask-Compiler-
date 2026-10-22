package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaAdditive {
    private String nodeName;
    private int lineNumber;
    private JinjaMultiplicative jinjaMultiplicative;
    private List<JinjaAdditiveTail> jinjaAdditiveTail;

    public JinjaAdditive(String nodeName, int lineNumber, JinjaMultiplicative jinjaMultiplicative, List<JinjaAdditiveTail> jinjaAdditiveTail) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaMultiplicative = jinjaMultiplicative;
        this.jinjaAdditiveTail = jinjaAdditiveTail;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaMultiplicative getJinjaMultiplicative() { return jinjaMultiplicative; }
    public void setJinjaMultiplicative(JinjaMultiplicative jinjaMultiplicative) { this.jinjaMultiplicative = jinjaMultiplicative; }
    public List<JinjaAdditiveTail> getJinjaAdditiveTail() { return jinjaAdditiveTail; }
    public void setJinjaAdditiveTail(List<JinjaAdditiveTail> jinjaAdditiveTail) { this.jinjaAdditiveTail = jinjaAdditiveTail; }

    @Override
    public String toString() { return "JinjaAdditive"; }
}
