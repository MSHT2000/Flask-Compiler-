package AST.Python;

import java.util.List;

public class StarTargetsTupleSeq {
    private final String nodeName;
    private final int lineNumber;
    private List<StarTarget> starTarget;
    private List<String> COMMA;

    public StarTargetsTupleSeq(String nodeName, int lineNumber,
                               List<StarTarget> starTarget,
                               List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starTarget = starTarget;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<StarTarget> getStarTarget() { return starTarget; }
    public void setStarTarget(List<StarTarget> starTarget) { this.starTarget = starTarget; }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "StarTargetsTupleSeq"; }
}