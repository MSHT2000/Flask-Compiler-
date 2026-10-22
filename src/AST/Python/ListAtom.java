package AST.Python;

public class ListAtom extends Atom {
    private final String nodeName;
    private final int lineNumber;
    private ListLiteral list;               // NOTE: resolves to AST.Python.List
    private Listcomp listcomp;

    public ListAtom(String nodeName, int lineNumber,
                    ListLiteral list,
                    Listcomp listcomp) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.list = list;
        this.listcomp = listcomp;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public ListLiteral getList() { return list; }
    public void setList(ListLiteral list) { this.list = list; }

    public Listcomp getListcomp() { return listcomp; }
    public void setListcomp(Listcomp listcomp) { this.listcomp = listcomp; }

    @Override
    public String toString() { return "ListAtom"; }
}