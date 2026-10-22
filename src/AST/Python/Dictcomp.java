package AST.Python;

public class Dictcomp {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private Kvpair kvpair;
    private ForIfClauses forIfClauses;
    private String RBRACE;

    public Dictcomp(String nodeName, int lineNumber,
                    String LBRACE,
                    Kvpair kvpair,
                    ForIfClauses forIfClauses,
                    String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.kvpair = kvpair;
        this.forIfClauses = forIfClauses;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }

    public Kvpair getKvpair() { return kvpair; }
    public void setKvpair(Kvpair kvpair) { this.kvpair = kvpair; }

    public ForIfClauses getForIfClauses() { return forIfClauses; }
    public void setForIfClauses(ForIfClauses forIfClauses) { this.forIfClauses = forIfClauses; }

    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "Dictcomp"; }
}