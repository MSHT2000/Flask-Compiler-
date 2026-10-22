package AST.Python;

import java.util.List;

public class Conjunction {
    private final String nodeName;
    private final int lineNumber;
    private List<Inversion> inversion;
    private List<String> AND;

    public Conjunction(String nodeName, int lineNumber,
                       List<Inversion> inversion,
                       List<String> AND) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.inversion = inversion;
        this.AND = AND;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Inversion> getInversion() { return inversion; }
    public void setInversion(List<Inversion> inversion) { this.inversion = inversion; }

    public List<String> getAND() { return AND; }
    public void setAND(List<String> AND) { this.AND = AND; }

    @Override
    public String toString() { return "Conjunction"; }
}