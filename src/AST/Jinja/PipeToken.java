package AST.Jinja;

import java.util.List;

// Auto-generated AST node for JinjaParser.g4
public class PipeToken extends CssAnyToken {
    private String nodeName;
    private int lineNumber;
    private String Pipe;

    public PipeToken(String nodeName, int lineNumber, String Pipe) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.Pipe = Pipe;
    }

    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getPipe() { return Pipe; }
    public void setPipe(String Pipe) { this.Pipe = Pipe; }

    @Override
    public String toString() { return "PipeToken"; }
}
