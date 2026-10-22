package AST.Python;

public class FstringReplacementField {
    private final String nodeName;
    private final int lineNumber;
    private String LBRACE;
    private AnnotatedRhs annotatedRhs;
    private String EQUAL;                                 // nullable
    private FstringConversion fstringConversion;          // nullable
    private FstringFullFormatSpec fstringFullFormatSpec;  // nullable
    private String RBRACE;

    public FstringReplacementField(String nodeName, int lineNumber,
                                   String LBRACE,
                                   AnnotatedRhs annotatedRhs,
                                   String EQUAL,
                                   FstringConversion fstringConversion,
                                   FstringFullFormatSpec fstringFullFormatSpec,
                                   String RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LBRACE = LBRACE;
        this.annotatedRhs = annotatedRhs;
        this.EQUAL = EQUAL;
        this.fstringConversion = fstringConversion;
        this.fstringFullFormatSpec = fstringFullFormatSpec;
        this.RBRACE = RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getLBRACE() { return LBRACE; }
    public void setLBRACE(String LBRACE) { this.LBRACE = LBRACE; }

    public AnnotatedRhs getAnnotatedRhs() { return annotatedRhs; }
    public void setAnnotatedRhs(AnnotatedRhs annotatedRhs) { this.annotatedRhs = annotatedRhs; }

    public String getEQUAL() { return EQUAL; }
    public void setEQUAL(String EQUAL) { this.EQUAL = EQUAL; }

    public FstringConversion getFstringConversion() { return fstringConversion; }
    public void setFstringConversion(FstringConversion fstringConversion) {
        this.fstringConversion = fstringConversion;
    }

    public FstringFullFormatSpec getFstringFullFormatSpec() { return fstringFullFormatSpec; }
    public void setFstringFullFormatSpec(FstringFullFormatSpec fstringFullFormatSpec) {
        this.fstringFullFormatSpec = fstringFullFormatSpec;
    }

    public String getRBRACE() { return RBRACE; }
    public void setRBRACE(String RBRACE) { this.RBRACE = RBRACE; }

    @Override
    public String toString() { return "FstringReplacementField"; }
}