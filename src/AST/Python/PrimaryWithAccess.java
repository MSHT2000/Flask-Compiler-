package AST.Python;

public class PrimaryWithAccess extends Primary {
    private final String nodeName;
    private final int lineNumber;
    private Primary primary;
    private String DOT;
    private Name name;
    private Genexp genexp;
    private String LPAR;
    private Arguments arguments;   // nullable
    private String RPAR;
    private String LSQB;
    private Slices slices;
    private String RSQB;

    public PrimaryWithAccess(String nodeName, int lineNumber,
                             Primary primary,
                             String DOT,
                             Name name,
                             Genexp genexp,
                             String LPAR,
                             Arguments arguments,
                             String RPAR,
                             String LSQB,
                             Slices slices,
                             String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.primary = primary;
        this.DOT = DOT;
        this.name = name;
        this.genexp = genexp;
        this.LPAR = LPAR;
        this.arguments = arguments;
        this.RPAR = RPAR;
        this.LSQB = LSQB;
        this.slices = slices;
        this.RSQB = RSQB;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Primary getPrimary() { return primary; }
    public void setPrimary(Primary primary) { this.primary = primary; }

    public String getDOT() { return DOT; }
    public void setDOT(String DOT) { this.DOT = DOT; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    public Genexp getGenexp() { return genexp; }
    public void setGenexp(Genexp genexp) { this.genexp = genexp; }

    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }

    public Arguments getArguments() { return arguments; }
    public void setArguments(Arguments arguments) { this.arguments = arguments; }

    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    public String getLSQB() { return LSQB; }
    public void setLSQB(String LSQB) { this.LSQB = LSQB; }

    public Slices getSlices() { return slices; }
    public void setSlices(Slices slices) { this.slices = slices; }

    public String getRSQB() { return RSQB; }
    public void setRSQB(String RSQB) { this.RSQB = RSQB; }

    @Override
    public String toString() { return "PrimaryWithAccess"; }
}