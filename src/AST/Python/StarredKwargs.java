package AST.Python;

import java.util.List;

public class StarredKwargs extends Kwargs {
    private final String nodeName;
    private final int lineNumber;
    private List<KwargOrStarred> kwargOrStarred;
    private List<String> COMMA;
    private List<KwargOrDoubleStarred> kwargOrDoubleStarred;

    public StarredKwargs(String nodeName, int lineNumber,
                         List<KwargOrStarred> kwargOrStarred,
                         List<String> COMMA,
                         List<KwargOrDoubleStarred> kwargOrDoubleStarred) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.kwargOrStarred = kwargOrStarred;
        this.COMMA = COMMA;
        this.kwargOrDoubleStarred = kwargOrDoubleStarred;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<KwargOrStarred> getKwargOrStarred() { return kwargOrStarred; }
    public void setKwargOrStarred(List<KwargOrStarred> kwargOrStarred) {
        this.kwargOrStarred = kwargOrStarred;
    }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    public List<KwargOrDoubleStarred> getKwargOrDoubleStarred() { return kwargOrDoubleStarred; }
    public void setKwargOrDoubleStarred(List<KwargOrDoubleStarred> kwargOrDoubleStarred) {
        this.kwargOrDoubleStarred = kwargOrDoubleStarred;
    }

    @Override
    public String toString() { return "StarredKwargs"; }
}