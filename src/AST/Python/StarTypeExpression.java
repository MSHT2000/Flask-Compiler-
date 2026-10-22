package AST.Python;

import java.util.List;

public class StarTypeExpression extends TypeExpressions {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private List<Expression> expression;
    private String COMMA;
    private String DOUBLESTAR;

    public StarTypeExpression(String nodeName, int lineNumber,
                              String STAR,
                              List<Expression> expression,
                              String COMMA,
                              String DOUBLESTAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.expression = expression;
        this.COMMA = COMMA;
        this.DOUBLESTAR = DOUBLESTAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public List<Expression> getExpression() { return expression; }
    public void setExpression(List<Expression> expression) { this.expression = expression; }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    @Override
    public String toString() { return "StarTypeExpression"; }
}