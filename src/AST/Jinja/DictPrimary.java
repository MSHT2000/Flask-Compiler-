package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class DictPrimary extends JinjaPrimary {
    private String nodeName;
    private int lineNumber;
    private String JINJA_LBRACE;
    private JinjaDictEntryList jinjaDictEntryList;
    private String JINJA_RBRACE;

    public DictPrimary(String nodeName, int lineNumber, String JINJA_LBRACE, JinjaDictEntryList jinjaDictEntryList, String JINJA_RBRACE) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.JINJA_LBRACE = JINJA_LBRACE;
        this.jinjaDictEntryList = jinjaDictEntryList;
        this.JINJA_RBRACE = JINJA_RBRACE;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getJINJA_LBRACE() { return JINJA_LBRACE; }
    public void setJINJA_LBRACE(String JINJA_LBRACE) { this.JINJA_LBRACE = JINJA_LBRACE; }
    public JinjaDictEntryList getJinjaDictEntryList() { return jinjaDictEntryList; }
    public void setJinjaDictEntryList(JinjaDictEntryList jinjaDictEntryList) { this.jinjaDictEntryList = jinjaDictEntryList; }
    public String getJINJA_RBRACE() { return JINJA_RBRACE; }
    public void setJINJA_RBRACE(String JINJA_RBRACE) { this.JINJA_RBRACE = JINJA_RBRACE; }

    @Override
    public String toString() { return "DictPrimary"; }
}
