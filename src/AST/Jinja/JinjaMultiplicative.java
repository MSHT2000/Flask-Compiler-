package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaMultiplicative {
    private String nodeName;
    private int lineNumber;
    private JinjaPower jinjaPower;
    private List<JinjaMultiplicativeTail> jinjaMultiplicativeTail;

    public JinjaMultiplicative(String nodeName, int lineNumber, JinjaPower jinjaPower, List<JinjaMultiplicativeTail> jinjaMultiplicativeTail) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.jinjaPower = jinjaPower;
        this.jinjaMultiplicativeTail = jinjaMultiplicativeTail;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaPower getJinjaPower() { return jinjaPower; }
    public void setJinjaPower(JinjaPower jinjaPower) { this.jinjaPower = jinjaPower; }
    public List<JinjaMultiplicativeTail> getJinjaMultiplicativeTail() { return jinjaMultiplicativeTail; }
    public void setJinjaMultiplicativeTail(List<JinjaMultiplicativeTail> jinjaMultiplicativeTail) { this.jinjaMultiplicativeTail = jinjaMultiplicativeTail; }

    @Override
    public String toString() { return "JinjaMultiplicative"; }
}
