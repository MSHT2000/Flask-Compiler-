package AST.Python;

public class TPrimaryWithAccess extends TPrimary {
    private final String nodeName;
    private final int lineNumber;
    private TPrimary tPrimary;
    private String DOT;
    private Name name;
    private String LSQB;
    private Slices slices;
    private String RSQB;
    private Genexp genexp;
    private String LPAR;
    private Arguments arguments;   // nullable
    private String RPAR;

    public TPrimaryWithAccess(String nodeName, int lineNumber,
                              TPrimary tPrimary,
                              String DOT,
                              Name name,
                              String LSQB,
                              Slices slices,
                              String RSQB,
                              Genexp genexp,
                              String LPAR,
                              Arguments arguments,
                              String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tPrimary = tPrimary;
        this.DOT = DOT;
        this.name = name;
        this.LSQB = LSQB;
        this.slices = slices;
        this.RSQB = RSQB;
        this.genexp = genexp;
        this.LPAR = LPAR;
        this.arguments = arguments;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public TPrimary getTPrimary() { return tPrimary; }
    public void setTPrimary(TPrimary tPrimary) { this.tPrimary = tPrimary; }

    public String getDOT() { return DOT; }
    public void setDOT(String DOT) { this.DOT = DOT; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public Slices getSlices() { return slices; }
    public void setSlices(Slices slices) { this.slices = slices; }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    public Genexp getGenexp() { return genexp; }
    public void setGenexp(Genexp genexp) { this.genexp = genexp; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public Arguments getArguments() { return arguments; }
    public void setArguments(Arguments arguments) { this.arguments = arguments; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "TPrimaryWithAccess"; }
}