package AST.Python;

public class ImportFromParenthesized extends ImportFromTargets {
    private final String nodeName;
    private final int lineNumber;
    private String LPAR;
    private ImportFromAsNames importFromAsNames;
    private String COMMA;
    private String RPAR;

    public ImportFromParenthesized(String nodeName, int lineNumber, String LPAR, ImportFromAsNames importFromAsNames, String COMMA, String RPAR) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.LPAR = LPAR;
        this.importFromAsNames = importFromAsNames;
        this.COMMA = COMMA;
        this.RPAR = RPAR;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public String getLPAR() { return LPAR; }
    public void setLPAR(String LPAR) { this.LPAR = LPAR; }
    public ImportFromAsNames getImportFromAsNames() { return importFromAsNames; }
    public void setImportFromAsNames(ImportFromAsNames importFromAsNames) { this.importFromAsNames = importFromAsNames; }
    public String getCOMMA() { return COMMA; }
    public void setCOMMA(String COMMA) { this.COMMA = COMMA; }
    public String getRPAR() { return RPAR; }
    public void setRPAR(String RPAR) { this.RPAR = RPAR; }

    @Override
    public String toString() { return "ImportFromParenthesized"; }
}
