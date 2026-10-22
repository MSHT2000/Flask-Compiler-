package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class CssDeclarationList {
    private String nodeName;
    private int lineNumber;
    private List<CssDeclaration> decls;
    private List<String> SemiColon;

    public CssDeclarationList(String nodeName, int lineNumber, List<CssDeclaration> decls, List<String> SemiColon) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.decls = decls;
        this.SemiColon = SemiColon;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<CssDeclaration> getDecls() { return decls; }
    public void setDecls(List<CssDeclaration> decls) { this.decls = decls; }
    public List<String> getSemiColon() { return SemiColon; }
    public void setSemiColon(List<String> SemiColon) { this.SemiColon = SemiColon; }

    @Override
    public String toString() { return "CssDeclarationList"; }
}
