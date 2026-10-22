package AST.Python;

public class Tuple {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private StarNamedExpression  starNamedExpression;   // nullable
    private String COMMA;                               // nullable
    private StarNamedExpressions starNamedExpressions;  // nullable
    private String RPAR;

    public Tuple(String nodeName, int lineNumber,
                 String LPAR,
                 StarNamedExpression starNamedExpression,
                 String COMMA,
                 StarNamedExpressions starNamedExpressions,
                 String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.starNamedExpression = starNamedExpression;
        this.COMMA = COMMA;
        this.starNamedExpressions = starNamedExpressions;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public StarNamedExpression getStarNamedExpression() { return starNamedExpression; }
    public void setStarNamedExpression(StarNamedExpression starNamedExpression) {
        this.starNamedExpression = starNamedExpression;
    }

    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }

    public StarNamedExpressions getStarNamedExpressions() { return starNamedExpressions; }
    public void setStarNamedExpressions(StarNamedExpressions starNamedExpressions) {
        this.starNamedExpressions = starNamedExpressions;
    }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "Tuple"; }
}