package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CommaAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String Comma;

    public CommaAtom(String nodeName, int lineNumber, String Comma) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Comma = Comma;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getComma() { return Comma; }
    public void setComma(String Comma) { this.Comma = Comma; }

    @Override
    public String toString() { return "CommaAtom"; }
}
