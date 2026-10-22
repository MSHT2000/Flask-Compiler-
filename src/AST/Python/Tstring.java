package AST.Python;

import java.util.List;

public class Tstring {
    private final String nodeName;
    private final int lineNumber;
    private String TSTRING_START;
    private List<TstringMiddle> tstringMiddle;
    private String TSTRING_END;

    public Tstring(String nodeName, int lineNumber,
                   String TSTRING_START,
                   List<TstringMiddle> tstringMiddle,
                   String TSTRING_END) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.TSTRING_START = TSTRING_START;
        this.tstringMiddle = tstringMiddle;
        this.TSTRING_END = TSTRING_END;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getTSTRING_START() { return TSTRING_START; }
    public void setTSTRING_START(String TSTRING_START) { this.TSTRING_START = TSTRING_START; }

    public List<TstringMiddle> getTstringMiddle() { return tstringMiddle; }
    public void setTstringMiddle(List<TstringMiddle> tstringMiddle) {
        this.tstringMiddle = tstringMiddle;
    }

    public String getTSTRING_END() { return TSTRING_END; }
    public void setTSTRING_END(String TSTRING_END) { this.TSTRING_END = TSTRING_END; }

    @Override
    public String toString() { return "Tstring"; }
}