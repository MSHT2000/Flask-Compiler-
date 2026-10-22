package AST.Python;

public class NamedArg extends KwargOrStarred {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private String EQUAL;
    private Expression expression;

    public NamedArg(String nodeName, int lineNumber,
                    Name name,
                    String EQUAL,
                    Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.EQUAL = EQUAL;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }

    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "NamedArg"; }
}