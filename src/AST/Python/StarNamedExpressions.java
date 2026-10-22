package AST.Python;

import java.util.List;

public class StarNamedExpressions {
    private final String nodeName;
    private final int lineNumber;
    private List<StarNamedExpression> starNamedExpression;
    private List<String> COMMA;

    public StarNamedExpressions(String nodeName, int lineNumber,
                                List<StarNamedExpression> starNamedExpression,
                                List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starNamedExpression = starNamedExpression;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<StarNamedExpression> getStarNamedExpression() { return starNamedExpression; }
    public void setStarNamedExpression(List<StarNamedExpression> starNamedExpression) {
        this.starNamedExpression = starNamedExpression;
    }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "StarNamedExpressions"; }
}