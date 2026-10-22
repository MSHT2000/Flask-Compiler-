package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class JinjaForStatement {
    private String nodeName;
    private int lineNumber;
    private List<String> JINJA_STMT_OPEN;
    private String JINJA_STMT_FOR;
    private JinjaForTarget target;
    private String JINJA_IN;
    private JinjaExprList iterable;
    private String JINJA_STMT_RECURSIVE;
    private List<String> JINJA_STMT_CLOSE;
    private TemplateBody body;
    private String JINJA_STMT_ELSE;
    private TemplateBody elseBody;
    private String JINJA_STMT_ENDFOR;

    public JinjaForStatement(String nodeName, int lineNumber, List<String> JINJA_STMT_OPEN, String JINJA_STMT_FOR, JinjaForTarget target, String JINJA_IN, JinjaExprList iterable, String JINJA_STMT_RECURSIVE, List<String> JINJA_STMT_CLOSE, TemplateBody body, String JINJA_STMT_ELSE, TemplateBody elseBody, String JINJA_STMT_ENDFOR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_STMT_OPEN = JINJA_STMT_OPEN;
        this.JINJA_STMT_FOR = JINJA_STMT_FOR;
        this.target = target;
        this.JINJA_IN = JINJA_IN;
        this.iterable = iterable;
        this.JINJA_STMT_RECURSIVE = JINJA_STMT_RECURSIVE;
        this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE;
        this.body = body;
        this.JINJA_STMT_ELSE = JINJA_STMT_ELSE;
        this.elseBody = elseBody;
        this.JINJA_STMT_ENDFOR = JINJA_STMT_ENDFOR;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<String> getJINJA_STMT_OPEN() { return JINJA_STMT_OPEN; }
    public void setJINJA_STMT_OPEN(List<String> JINJA_STMT_OPEN) { this.JINJA_STMT_OPEN = JINJA_STMT_OPEN; }
    public String getJINJA_STMT_FOR() { return JINJA_STMT_FOR; }
    public void setJINJA_STMT_FOR(String JINJA_STMT_FOR) { this.JINJA_STMT_FOR = JINJA_STMT_FOR; }
    public JinjaForTarget getTarget() { return target; }
    public void setTarget(JinjaForTarget target) { this.target = target; }
    public String getJINJA_IN() { return JINJA_IN; }
    public void setJINJA_IN(String JINJA_IN) { this.JINJA_IN = JINJA_IN; }
    public JinjaExprList getIterable() { return iterable; }
    public void setIterable(JinjaExprList iterable) { this.iterable = iterable; }
    public String getJINJA_STMT_RECURSIVE() { return JINJA_STMT_RECURSIVE; }
    public void setJINJA_STMT_RECURSIVE(String JINJA_STMT_RECURSIVE) { this.JINJA_STMT_RECURSIVE = JINJA_STMT_RECURSIVE; }
    public List<String> getJINJA_STMT_CLOSE() { return JINJA_STMT_CLOSE; }
    public void setJINJA_STMT_CLOSE(List<String> JINJA_STMT_CLOSE) { this.JINJA_STMT_CLOSE = JINJA_STMT_CLOSE; }
    public TemplateBody getBody() { return body; }
    public void setBody(TemplateBody body) { this.body = body; }
    public String getJINJA_STMT_ELSE() { return JINJA_STMT_ELSE; }
    public void setJINJA_STMT_ELSE(String JINJA_STMT_ELSE) { this.JINJA_STMT_ELSE = JINJA_STMT_ELSE; }
    public TemplateBody getElseBody() { return elseBody; }
    public void setElseBody(TemplateBody elseBody) { this.elseBody = elseBody; }
    public String getJINJA_STMT_ENDFOR() { return JINJA_STMT_ENDFOR; }
    public void setJINJA_STMT_ENDFOR(String JINJA_STMT_ENDFOR) { this.JINJA_STMT_ENDFOR = JINJA_STMT_ENDFOR; }

    @Override
    public String toString() { return "JinjaForStatement"; }
}
