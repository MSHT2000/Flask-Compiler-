package AST.Python;

public class NotInversion extends Inversion {
    private final String nodeName;
    private final int lineNumber;
    private String NOT;
    private Inversion inversion;

    public NotInversion(String nodeName, int lineNumber,
                        String NOT,
                        Inversion inversion) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NOT = NOT;
        this.inversion = inversion;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getNOT() { return NOT; }
    public void setNOT(String NOT) { this.NOT = NOT; }

    public Inversion getInversion() { return inversion; }
    public void setInversion(Inversion inversion) { this.inversion = inversion; }

    @Override
    public String toString() { return "NotInversion"; }
}