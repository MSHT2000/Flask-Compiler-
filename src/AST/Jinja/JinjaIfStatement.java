package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaIfStatement {
    private String nodeName;
    private int lineNumber;
    private List<String> JINJA_STMT_OPEN;
    private String JINJA_STMT_IF;
    private JinjaExpr ifCondition;
    private List<String> JINJA_STMT_CLOSE;
    private TemplateBody ifBody;
    private List<String> JINJA_STMT_ELIF;
    private List<JinjaExpr> elifConditions;
    private List<TemplateBody> elifBodies;
    private String JINJA_STMT_ELSE;
    private TemplateBody elseBody;
    private String JINJA_STMT_ENDIF;

    public JinjaIfStatement(String nodeName, int lineNumber, List<String> JINJA_STMT_OPEN, String JINJA_STMT_IF, JinjaExpr ifCondition, List<String> JINJA_STMT_CLOSE, TemplateBody ifBody, List<String> JINJA_STMT_ELIF, List<JinjaExpr> elifConditions, List<TemplateBody> elifBodies, String JINJA_STMT_ELSE, TemplateBody elseBody, String JINJA_STMT_ENDIF) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_IF = JINJA_STMT_IF;
        this.ifCondition = ifCondition;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.ifBody = ifBody;
        this.JINJA_STMT_ELIF = JINJA_STMT_ELIF;
        this.elifConditions = elifConditions;
        this.elifBodies = elifBodies;
        this.JINJA_STMT_ELSE = JINJA_STMT_ELSE;
        this.elseBody = elseBody;
        this.JINJA_STMT_ENDIF = JINJA_STMT_ENDIF;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<String> getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(List<String> JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_IF() { return JINJA_STMT_IF; }
    public void setJINJA_STMT_IF(String JINJA_STMT_IF) { this.JINJA_STMT_IF = JINJA_STMT_IF; }
    public JinjaExpr getIfCondition() { return ifCondition; }
    public void setIfCondition(JinjaExpr ifCondition) { this.ifCondition = ifCondition; }
    public List<String> getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(List<String> JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getIfBody() { return ifBody; }
    public void setIfBody(TemplateBody ifBody) { this.ifBody = ifBody; }
    public List<String> getJINJA_STMT_ELIF() { return JINJA_STMT_ELIF; }
    public void setJINJA_STMT_ELIF(List<String> JINJA_STMT_ELIF) { this.JINJA_STMT_ELIF = JINJA_STMT_ELIF; }
    public List<JinjaExpr> getElifConditions() { return elifConditions; }
    public void setElifConditions(List<JinjaExpr> elifConditions) { this.elifConditions = elifConditions; }
    public List<TemplateBody> getElifBodies() { return elifBodies; }
    public void setElifBodies(List<TemplateBody> elifBodies) { this.elifBodies = elifBodies; }
    public String getJINJA_STMT_ELSE() { return JINJA_STMT_ELSE; }
    public void setJINJA_STMT_ELSE(String JINJA_STMT_ELSE) { this.JINJA_STMT_ELSE = JINJA_STMT_ELSE; }
    public TemplateBody getElseBody() { return elseBody; }
    public void setElseBody(TemplateBody elseBody) { this.elseBody = elseBody; }
    public String getJINJA_STMT_ENDIF() { return JINJA_STMT_ENDIF; }
    public void setJINJA_STMT_ENDIF(String JINJA_STMT_ENDIF) { this.JINJA_STMT_ENDIF = JINJA_STMT_ENDIF; }

    @Override
    public String toString() { return "JinjaIfStatement"; }
}
