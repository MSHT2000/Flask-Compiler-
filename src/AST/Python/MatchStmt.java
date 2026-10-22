package AST.Python;

public class MatchStmt {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_MATCH;
    private SubjectExpr subjectExpr;
    private String COLON;
    private String NEWLINE;
    private String INDENT;
    private java.util.List<CaseBlock> caseBlock;
    private String DEDENT;

    public MatchStmt(String nodeName, int lineNumber, String NAME_OR_MATCH, SubjectExpr subjectExpr, String COLON, String NEWLINE, String INDENT, java.util.List<CaseBlock> caseBlock, String DEDENT) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_MATCH = NAME_OR_MATCH;
        this.subjectExpr = subjectExpr;
        this.COLON = COLON;
        this.NEWLINE = NEWLINE;
        this.INDENT = INDENT;
        this.caseBlock = caseBlock;
        this.DEDENT = DEDENT;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_MATCH() { return NAME_OR_MATCH; }
    public void setNAME_OR_MATCH(String NAME_OR_MATCH) { this.NAME_OR_MATCH = NAME_OR_MATCH; }
    public SubjectExpr getSubjectExpr() { return subjectExpr; }
    public void setSubjectExpr(SubjectExpr subjectExpr) { this.subjectExpr = subjectExpr; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public String getNEWLINE() { return NEWLINE; }
    public void setNEWLINE(String NEWLINE) { this.NEWLINE = NEWLINE; }
    public String getINDENT() { return INDENT; }
    public void setINDENT(String INDENT) { this.INDENT = INDENT; }
    public java.util.List<CaseBlock> getCaseBlock() { return caseBlock; }
    public void setCaseBlock(java.util.List<CaseBlock> caseBlock) { this.caseBlock = caseBlock; }
    public String getDEDENT() { return DEDENT; }
    public void setDEDENT(String DEDENT) { this.DEDENT = DEDENT; }

    @Override
    public String toString() { return "MatchStmt"; }
}
