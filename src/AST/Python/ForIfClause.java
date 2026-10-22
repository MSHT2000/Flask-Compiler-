package AST.Python;

import java.util.List;

public class ForIfClause {
    private final String nodeName;
    private final int lineNumber;
    private String ASYNC;                 // nullable — only present for "async for ..."
    private String FOR;
    private StarTargets starTargets;
    private String IN;
    private List<Disjunction> disjunction;
    private List<String> IF;

    public ForIfClause(String nodeName, int lineNumber,
                       String ASYNC,
                       String FOR,
                       StarTargets starTargets,
                       String IN,
                       List<Disjunction> disjunction,
                       List<String> IF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.ASYNC = ASYNC;
        this.FOR = FOR;
        this.starTargets = starTargets;
        this.IN = IN;
        this.disjunction = disjunction;
        this.IF = IF;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getASYNC() { return ASYNC; }
    public void setASYNC(String ASYNC) { this.ASYNC = ASYNC; }

    public String getFOR() { return FOR; }
    public void setFOR(String FOR) { this.FOR = FOR; }

    public StarTargets getStarTargets() { return starTargets; }
    public void setStarTargets(StarTargets starTargets) { this.starTargets = starTargets; }

    public String getIN() { return IN; }
    public void setIN(String IN) { this.IN = IN; }

    public List<Disjunction> getDisjunction() { return disjunction; }
    public void setDisjunction(List<Disjunction> disjunction) { this.disjunction = disjunction; }

    public List<String> getIF() { return IF; }
    public void setIF(List<String> IF) { this.IF = IF; }

    @Override
    public String toString() { return "ForIfClause"; }
}