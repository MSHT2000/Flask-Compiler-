package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class HtmlDocument {
    private String nodeName;
    private int lineNumber;
    private List<ScriptletOrSeaWs> scriptletOrSeaWs;
    private String XML_DECLARATION;
    private String DTD;
    private List<HtmlElements> htmlElements;

    public HtmlDocument(String nodeName, int lineNumber, List<ScriptletOrSeaWs> scriptletOrSeaWs, String XML_DECLARATION, String DTD, List<HtmlElements> htmlElements) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.scriptletOrSeaWs = scriptletOrSeaWs;
        this.XML_DECLARATION = XML_DECLARATION;
        this.DTD = DTD;
        this.htmlElements = htmlElements;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<ScriptletOrSeaWs> getScriptletOrSeaWs() { return scriptletOrSeaWs; }
    public void setScriptletOrSeaWs(List<ScriptletOrSeaWs> scriptletOrSeaWs) { this.scriptletOrSeaWs = scriptletOrSeaWs; }
    public String getXML_DECLARATION() { return XML_DECLARATION; }
    public void setXML_DECLARATION(String XML_DECLARATION) { this.XML_DECLARATION = XML_DECLARATION; }
    public String getDTD() { return DTD; }
    public void setDTD(String DTD) { this.DTD = DTD; }
    public List<HtmlElements> getHtmlElements() { return htmlElements; }
    public void setHtmlElements(List<HtmlElements> htmlElements) { this.htmlElements = htmlElements; }

    @Override
    public String toString() { return "HtmlDocument"; }
}
