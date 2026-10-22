package AST.Python;

public class DoubleStarTypeParam extends TypeParam {
    private final String nodeName;
    private final int lineNumber;
    private String DOUBLESTAR;
    private Name name;
    private TypeParamDefault typeParamDefault;

    public DoubleStarTypeParam(String nodeName, int lineNumber, String DOUBLESTAR, Name name, TypeParamDefault typeParamDefault) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.DOUBLESTAR = DOUBLESTAR;
        this.name = name;
        this.typeParamDefault = typeParamDefault;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getDOUBLESTAR() { return DOUBLESTAR; }
    public void setDOUBLESTAR(String DOUBLESTAR) { this.DOUBLESTAR = DOUBLESTAR; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParamDefault getTypeParamDefault() { return typeParamDefault; }
    public void setTypeParamDefault(TypeParamDefault typeParamDefault) { this.typeParamDefault = typeParamDefault; }

    @Override
    public String toString() { return "DoubleStarTypeParam"; }
}
