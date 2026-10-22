package AST.Python;

public class AttributedStarTarget extends TargetWithStarAtom {
    private final String nodeName;
    private final int lineNumber;
    private TPrimary tPrimary;
    private String DOT;
    private Name name;
    private String LSQB;
    private Slices slices;
    private String RSQB;

    public AttributedStarTarget(String nodeName, int lineNumber,
                                TPrimary tPrimary,
                                String DOT,
                                Name name,
                                String LSQB,
                                Slices slices,
                                String RSQB) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tPrimary = tPrimary;
        this.DOT = DOT;
        this.name = name;
        this.LSQB = LSQB;
        this.slices = slices;
        this.RSQB = RSQB;
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

    @Override
    public String toString() { return "AttributedStarTarget"; }
}