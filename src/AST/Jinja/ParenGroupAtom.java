package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class ParenGroupAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String OpenParen;
    private List<CssSelectorAtom> cssSelectorAtom;
    private String CloseParen;

    public ParenGroupAtom(String nodeName, int lineNumber, String OpenParen, List<CssSelectorAtom> cssSelectorAtom, String CloseParen) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenParen = OpenParen;
        this.cssSelectorAtom = cssSelectorAtom;
        this.CloseParen = CloseParen;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenParen() { return OpenParen; }
    public void setOpenParen(String OpenParen) { this.OpenParen = OpenParen; }
    public List<CssSelectorAtom> getCssSelectorAtom() { return cssSelectorAtom; }
    public void setCssSelectorAtom(List<CssSelectorAtom> cssSelectorAtom) { this.cssSelectorAtom = cssSelectorAtom; }
    public String getCloseParen() { return CloseParen; }
    public void setCloseParen(String CloseParen) { this.CloseParen = CloseParen; }

    @Override
    public String toString() { return "ParenGroupAtom"; }
}
