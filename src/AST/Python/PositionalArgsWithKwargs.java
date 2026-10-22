package AST.Python;

import java.util.List;

public class PositionalArgsWithKwargs extends Args {
    private final String nodeName;
    private final int lineNumber;
    private List<StarredExpression> starredExpression;
    private List<AssignmentExpression> assignmentExpression;
    private List<Expression> expression;
    private List<String> COMMA;
    private Kwargs kwargs;

    public PositionalArgsWithKwargs(String nodeName, int lineNumber,
                                    List<StarredExpression> starredExpression,
                                    List<AssignmentExpression> assignmentExpression,
                                    List<Expression> expression,
                                    List<String> COMMA,
                                    Kwargs kwargs) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starredExpression = starredExpression;
        this.assignmentExpression = assignmentExpression;
        this.expression = expression;
        this.COMMA = COMMA;
        this.kwargs = kwargs;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<StarredExpression> getStarredExpression() { return starredExpression; }
    public void setStarredExpression(List<StarredExpression> starredExpression) {
        this.starredExpression = starredExpression;
    }

    public List<AssignmentExpression> getAssignmentExpression() { return assignmentExpression; }
    public void setAssignmentExpression(List<AssignmentExpression> assignmentExpression) {
        this.assignmentExpression = assignmentExpression;
    }

    public List<Expression> getExpression() { return expression; }
    public void setExpression(List<Expression> expression) { this.expression = expression; }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    public Kwargs getKwargs() { return kwargs; }
    public void setKwargs(Kwargs kwargs) { this.kwargs = kwargs; }

    @Override
    public String toString() { return "PositionalArgsWithKwargs"; }
}