package AST.Python;

public class ClassDefRaw {
    private final String nodeName;
    private final int lineNumber;
    private String CLASS;
    private Name name;
    private TypeParams typeParams;
    private String LPAR;
    private Arguments arguments;
    private String RPAR;
    private String COLON;
    private Block block;

    public ClassDefRaw(String nodeName, int lineNumber, String CLASS, Name name, TypeParams typeParams, String LPAR, Arguments arguments, String RPAR, String COLON, Block block) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.CLASS = CLASS;
        this.name = name;
        this.typeParams = typeParams;
        this.LPAR = LPAR;
        this.arguments = arguments;
        this.RPAR = RPAR;
        this.COLON = COLON;
        this.block = block;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getCLASS() { return CLASS; }
    public void setCLASS(String CLASS) { this.CLASS = CLASS; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParams getTypeParams() { return typeParams; }
    public void setTypeParams(TypeParams typeParams) { this.typeParams = typeParams; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public Arguments getArguments() { return arguments; }
    public void setArguments(Arguments arguments) { this.arguments = arguments; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }
    public String getCOLON() { return COLON; }
    public void setCOLON(String COLON) { this.COLON = COLON; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }

    @Override
    public String toString() { return "ClassDefRaw"; }
}
