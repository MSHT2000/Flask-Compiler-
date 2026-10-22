package AST.Python;

public class StarTypeParam extends TypeParam {
    private final String nodeName;
    private final int lineNumber;
    private String STAR;
    private Name name;
    private TypeParamStarredDefault typeParamStarredDefault;

    public StarTypeParam(String nodeName, int lineNumber, String STAR, Name name, TypeParamStarredDefault typeParamStarredDefault) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.STAR = STAR;
        this.name = name;
        this.typeParamStarredDefault = typeParamStarredDefault;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getSTAR() { return STAR; }
    public void setSTAR(String STAR) { this.STAR = STAR; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParamStarredDefault getTypeParamStarredDefault() { return typeParamStarredDefault; }
    public void setTypeParamStarredDefault(TypeParamStarredDefault typeParamStarredDefault) { this.typeParamStarredDefault = typeParamStarredDefault; }

    @Override
    public String toString() { return "StarTypeParam"; }
}
