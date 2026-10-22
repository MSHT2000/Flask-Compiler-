package AST.Python;

import java.util.List;

public class DelTargets {
    private final String nodeName;
    private final int lineNumber;
    private List<DelTarget> delTarget;
    private List<String> COMMA;

    public DelTargets(String nodeName, int lineNumber,
                      List<DelTarget> delTarget,
                      List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.delTarget = delTarget;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<DelTarget> getDelTarget() { return delTarget; }
    public void setDelTarget(List<DelTarget> delTarget) { this.delTarget = delTarget; }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "DelTargets"; }
}