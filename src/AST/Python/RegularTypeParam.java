package AST.Python;

public class RegularTypeParam extends TypeParam {
    private final String nodeName;
    private final int lineNumber;
    private Name name;
    private TypeParamBound typeParamBound;
    private TypeParamDefault typeParamDefault;

    public RegularTypeParam(String nodeName, int lineNumber, Name name, TypeParamBound typeParamBound, TypeParamDefault typeParamDefault) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.typeParamBound = typeParamBound;
        this.typeParamDefault = typeParamDefault;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParamBound getTypeParamBound() { return typeParamBound; }
    public void setTypeParamBound(TypeParamBound typeParamBound) { this.typeParamBound = typeParamBound; }
    public TypeParamDefault getTypeParamDefault() { return typeParamDefault; }
    public void setTypeParamDefault(TypeParamDefault typeParamDefault) { this.typeParamDefault = typeParamDefault; }

    @Override
    public String toString() { return "RegularTypeParam"; }
}
