package AST.Python;

import java.util.List;

public class Kvpair {
    private final String nodeName;
    private final int lineNumber;
    private List<Expression> expression;
    private String COLON;

    public Kvpair(String nodeName, int lineNumber,
                  List<Expression> expression,
                  String COLON) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.COLON = COLON;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public List<Expression> getExpression() { return expression; }
    public void setExpression(List<Expression> expression) { this.expression = expression; }

    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }

    @Override
    public String toString() { return "Kvpair"; }
}