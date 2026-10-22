package AST.Python;

public class TypeParams {
    private final String nodeName;
    private final int lineNumber;
    private String LSQB;
    private TypeParamSeq typeParamSeq;
    private String RSQB;

    public TypeParams(String nodeName, int lineNumber, String LSQB, TypeParamSeq typeParamSeq, String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LSQB = LSQB;
        this.typeParamSeq = typeParamSeq;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }
    public TypeParamSeq getTypeParamSeq() { return typeParamSeq; }
    public void setTypeParamSeq(TypeParamSeq typeParamSeq) { this.typeParamSeq = typeParamSeq; }
    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "TypeParams"; }
}
