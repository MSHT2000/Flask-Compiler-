package AST.Python;

import java.util.List;

public class MultipleSlices extends Slices {
    private final String nodeName;
    private final int lineNumber;
    private List<Slice> slice;
    private List<StarredExpression> starredExpression;
    private List<String> COMMA;

    public MultipleSlices(String nodeName, int lineNumber,
                          List<Slice> slice,
                          List<StarredExpression> starredExpression,
                          List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.slice = slice;
        this.starredExpression = starredExpression;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Slice> getSlice() { return slice; }
    public void setSlice(List<Slice> slice) { this.slice = slice; }

    public List<StarredExpression> getStarredExpression() { return starredExpression; }
    public void setStarredExpression(List<StarredExpression> starredExpression) {
        this.starredExpression = starredExpression;
    }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "MultipleSlices"; }
}