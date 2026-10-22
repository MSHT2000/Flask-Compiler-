package AST.Python;

import java.util.List;

public class Fstring {
    private final String nodeName;
    private final int lineNumber;
    private String FSTRING_START;
    private List<FstringMiddle> fstringMiddle;
    private String FSTRING_END;

    public Fstring(String nodeName, int lineNumber,
                   String FSTRING_START,
                   List<FstringMiddle> fstringMiddle,
                   String FSTRING_END) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.FSTRING_START = FSTRING_START;
        this.fstringMiddle = fstringMiddle;
        this.FSTRING_END = FSTRING_END;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getFSTRING_START() { return FSTRING_START; }
    public void setFSTRING_START(String FSTRING_START) { this.FSTRING_START = FSTRING_START; }

    public List<FstringMiddle> getFstringMiddle() { return fstringMiddle; }
    public void setFstringMiddle(List<FstringMiddle> fstringMiddle) {
        this.fstringMiddle = fstringMiddle;
    }

    public String getFSTRING_END() { return FSTRING_END; }
    public void setFSTRING_END(String FSTRING_END) { this.FSTRING_END = FSTRING_END; }

    @Override
    public String toString() { return "Fstring"; }
}