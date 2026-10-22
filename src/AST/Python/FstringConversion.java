package AST.Python;

public class FstringConversion {
    private final String nodeName;
    private final int lineNumber;
    private String EXCLAMATION;
    private Name name;

    public FstringConversion(String nodeName, int lineNumber,
                             String EXCLAMATION,
                             Name name) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.EXCLAMATION = EXCLAMATION;
        this.name = name;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public String getEXCLAMATION() { return EXCLAMATION; }
    public void setEXCLAMATION(String EXCLAMATION) { this.EXCLAMATION = EXCLAMATION; }

    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }

    @Override
    public String toString() { return "FstringConversion"; }
}