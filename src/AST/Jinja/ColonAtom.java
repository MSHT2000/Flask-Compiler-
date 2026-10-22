package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ColonAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String Colon;

    public ColonAtom(String nodeName, int lineNumber, String Colon) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Colon = Colon;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getColon() { return Colon; }
    public void setColon(String Colon) { this.Colon = Colon; }

    @Override
    public String toString() { return "ColonAtom"; }
}
