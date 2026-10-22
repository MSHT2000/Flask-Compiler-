package AST.Python;

public class SingleSlice extends Slices {
    private final String nodeName;
    private final int lineNumber;
    private Slice slice;

    public SingleSlice(String nodeName, int lineNumber, Slice slice) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.slice = slice;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Slice getSlice() { return slice; }
    public void setSlice(Slice slice) { this.slice = slice; }

    @Override
    public String toString() { return "SingleSlice"; }
}