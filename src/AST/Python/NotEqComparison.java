package AST.Python;

public class NotEqComparison extends CompareOpBitwiseOrPair {
    private final String nodeName;
    private final int lineNumber;
    private NoteqBitwiseOr noteqBitwiseOr;

    public NotEqComparison(String nodeName, int lineNumber, NoteqBitwiseOr noteqBitwiseOr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.noteqBitwiseOr = noteqBitwiseOr;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public NoteqBitwiseOr getNoteqBitwiseOr() { return noteqBitwiseOr; }
    public void setNoteqBitwiseOr(NoteqBitwiseOr noteqBitwiseOr) { this.noteqBitwiseOr = noteqBitwiseOr; }

    @Override
    public String toString() { return "NotEqComparison"; }
}