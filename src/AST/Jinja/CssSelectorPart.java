package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssSelectorPart {
    private String nodeName;
    private int lineNumber;
    private List<CssSelectorAtom> atoms;

    public CssSelectorPart(String nodeName, int lineNumber, List<CssSelectorAtom> atoms) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.atoms = atoms;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<CssSelectorAtom> getAtoms() { return atoms; }
    public void setAtoms(List<CssSelectorAtom> atoms) { this.atoms = atoms; }

    @Override
    public String toString() { return "CssSelectorPart"; }
}
