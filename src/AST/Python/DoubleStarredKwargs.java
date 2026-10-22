package AST.Python;

import java.util.List;

public class DoubleStarredKwargs extends Kwargs {
    private final String nodeName;
    private final int lineNumber;
    private List<KwargOrDoubleStarred> kwargOrDoubleStarred;
    private List<String> COMMA;

    public DoubleStarredKwargs(String nodeName, int lineNumber,
                               List<KwargOrDoubleStarred> kwargOrDoubleStarred,
                               List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.kwargOrDoubleStarred = kwargOrDoubleStarred;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<KwargOrDoubleStarred> getKwargOrDoubleStarred() { return kwargOrDoubleStarred; }
    public void setKwargOrDoubleStarred(List<KwargOrDoubleStarred> kwargOrDoubleStarred) {
        this.kwargOrDoubleStarred = kwargOrDoubleStarred;
    }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "DoubleStarredKwargs"; }
}