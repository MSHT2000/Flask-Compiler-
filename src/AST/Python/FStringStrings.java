package AST.Python;

import java.util.List;

public class FStringStrings extends Strings {
    private final String nodeName;
    private final int lineNumber;
    private List<Fstring> fstring;
    private List<String> string;

    public FStringStrings(String nodeName, int lineNumber,
                          List<Fstring> fstring,
                          List<String> string) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.fstring = fstring;
        this.string = string;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Fstring> getFstring() { return fstring; }
    public void setFstring(List<Fstring> fstring) { this.fstring = fstring; }

    public List<String> getString() { return string; }
    public void setString(List<String> string) { this.string = string; }

    @Override
    public String toString() { return "FStringStrings"; }
}