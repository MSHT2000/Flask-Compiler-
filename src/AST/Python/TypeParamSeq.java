package AST.Python;

public class TypeParamSeq {
    private final String nodeName;
    private final int lineNumber;
    private java.util.List<TypeParam> typeParam;
    private java.util.List<String> COMMA;

    public TypeParamSeq(String nodeName, int lineNumber, java.util.List<TypeParam> typeParam, java.util.List<String> COMMA) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.typeParam = typeParam;
        this.COMMA = COMMA;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public java.util.List<TypeParam> getTypeParam() { return typeParam; }
    public void setTypeParam(java.util.List<TypeParam> typeParam) { this.typeParam = typeParam; }
    public java.util.List<String> getCOMMA() { return COMMA; }
    public void setCOMMA(java.util.List<String> COMMA) { this.COMMA = COMMA; }

    @Override
    public String toString() { return "TypeParamSeq"; }
}
