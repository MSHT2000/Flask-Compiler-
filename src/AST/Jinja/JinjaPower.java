package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaPower {
    private String nodeName;
    private int lineNumber;
    private JinjaUnary base;
    private List<String> JINJA_POW;
    private List<JinjaUnary> exponents;

    public JinjaPower(String nodeName, int lineNumber, JinjaUnary base, List<String> JINJA_POW, List<JinjaUnary> exponents) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.base = base;
        this.JINJA_POW = JINJA_POW;
        this.exponents = exponents;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public JinjaUnary getBase() { return base; }
    public void setBase(JinjaUnary base) { this.base = base; }
    public List<String> getJINJA_POW() { return JINJA_POW; }
    public void setJINJA_POW(List<String> JINJA_POW) { this.JINJA_POW = JINJA_POW; }
    public List<JinjaUnary> getExponents() { return exponents; }
    public void setExponents(List<JinjaUnary> exponents) { this.exponents = exponents; }

    @Override
    public String toString() { return "JinjaPower"; }
}
