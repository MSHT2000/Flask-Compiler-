package AST.Python;

import java.util.List;

public class DoubleStarredKvpairs {
    private final String nodeName;
    private final int lineNumber;
    private List<DoubleStarredKvpair> doubleStarredKvpair;
    private List<String> COMMA;

    public DoubleStarredKvpairs(String nodeName, int lineNumber,
                                List<DoubleStarredKvpair> doubleStarredKvpair,
                                List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.doubleStarredKvpair = doubleStarredKvpair;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<DoubleStarredKvpair> getDoubleStarredKvpair() { return doubleStarredKvpair; }
    public void setDoubleStarredKvpair(List<DoubleStarredKvpair> doubleStarredKvpair) {
        this.doubleStarredKvpair = doubleStarredKvpair;
    }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "DoubleStarredKvpairs"; }
}