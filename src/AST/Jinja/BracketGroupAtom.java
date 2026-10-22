package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class BracketGroupAtom extends CssSelectorAtom {
    private String nodeName;
    private int lineNumber;
    private String OpenBracket;
    private List<CssSelectorAtom> cssSelectorAtom;
    private String CloseBracket;

    public BracketGroupAtom(String nodeName, int lineNumber, String OpenBracket, List<CssSelectorAtom> cssSelectorAtom, String CloseBracket) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.OpenBracket = OpenBracket;
        this.cssSelectorAtom = cssSelectorAtom;
        this.CloseBracket = CloseBracket;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getOpenBracket() { return OpenBracket; }
    public void setOpenBracket(String OpenBracket) { this.OpenBracket = OpenBracket; }
    public List<CssSelectorAtom> getCssSelectorAtom() { return cssSelectorAtom; }
    public void setCssSelectorAtom(List<CssSelectorAtom> cssSelectorAtom) { this.cssSelectorAtom = cssSelectorAtom; }
    public String getCloseBracket() { return CloseBracket; }
    public void setCloseBracket(String CloseBracket) { this.CloseBracket = CloseBracket; }

    @Override
    public String toString() { return "BracketGroupAtom"; }
}
