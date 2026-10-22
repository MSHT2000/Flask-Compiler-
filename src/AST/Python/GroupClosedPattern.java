package AST.Python;

public class GroupClosedPattern extends ClosedPattern {
    private final String nodeName;
    private final int lineNumber;
    private GroupPattern groupPattern;

    public GroupClosedPattern(String nodeName, int lineNumber, GroupPattern groupPattern) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.groupPattern = groupPattern;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
    public GroupPattern getGroupPattern() { return groupPattern; }
    public void setGroupPattern(GroupPattern groupPattern) { this.groupPattern = groupPattern; }

    @Override
    public String toString() { return "GroupClosedPattern"; }
}
