package AST.Python;

public class TypeAlias {
    private final String nodeName;
    private final int lineNumber;
    private String NAME_OR_TYPE;
    private Name name;
    private TypeParams typeParams;
    private String EQUAL;
    private Expression expression;

    public TypeAlias(String nodeName, int lineNumber, String NAME_OR_TYPE, Name name, TypeParams typeParams, String EQUAL, Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.NAME_OR_TYPE = NAME_OR_TYPE;
        this.name = name;
        this.typeParams = typeParams;
        this.EQUAL = EQUAL;
        this.expression = expression;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getNAME_OR_TYPE() { return NAME_OR_TYPE; }
    public void setNAME_OR_TYPE(String NAME_OR_TYPE) { this.NAME_OR_TYPE = NAME_OR_TYPE; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParams getTypeParams() { return typeParams; }
    public void setTypeParams(TypeParams typeParams) { this.typeParams = typeParams; }
    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }

    @Override
    public String toString() { return "TypeAlias"; }
}
