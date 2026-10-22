package AST.Python;

import java.util.List;

public class TypeExpressionsWithStar extends TypeExpressions {
    private final String nodeName;
    private final int lineNumber;
    private List<Expression> expression;
    private List<String> COMMA;
    private String STAR;
    private String DOUBLESTAR;

    public TypeExpressionsWithStar(String nodeName, int lineNumber,
                                   List<Expression> expression,
                                   List<String> COMMA,
                                   String STAR,
                                   String DOUBLESTAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.COMMA = COMMA;
        this.STAR = STAR;
        this.DOUBLESTAR = DOUBLESTAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Expression> getExpression() { return expression; }
    public void setExpression(List<Expression> expression) { this.expression = expression; }

    public List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(List<String> COMMA) { this.COMMA = COMMA; }

    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }

    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }

    @Override
    public String toString() { return "TypeExpressionsWithStar"; }
}