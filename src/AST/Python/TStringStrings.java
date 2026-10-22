package AST.Python;

import java.util.List;

public class TStringStrings extends Strings {
    private final String nodeName;
    private final int lineNumber;
    private List<Tstring> tstring;

    public TStringStrings(String nodeName, int lineNumber,
                          List<Tstring> tstring) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tstring = tstring;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Tstring> getTstring() { return tstring; }
    public void setTstring(List<Tstring> tstring) { this.tstring = tstring; }

    @Override
    public String toString() { return "TStringStrings"; }
}