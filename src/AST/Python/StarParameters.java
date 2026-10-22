package AST.Python;

public class StarParameters extends Parameters {
    private final String nodeName;
    private final int lineNumber;
    private StarEtc starEtc;

    public StarParameters(String nodeName, int lineNumber, StarEtc starEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starEtc = starEtc;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public StarEtc getStarEtc() { return starEtc; }
    public void setStarEtc(StarEtc starEtc) { this.starEtc = starEtc; }

    @Override
    public String toString() { return "StarParameters"; }
}
