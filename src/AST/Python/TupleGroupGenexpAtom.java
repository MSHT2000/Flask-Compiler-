package AST.Python;

public class TupleGroupGenexpAtom extends Atom {
    private final String nodeName;
    private final int lineNumber;
    private Tuple tuple;
    private Group group;
    private Genexp genexp;

    public TupleGroupGenexpAtom(String nodeName, int lineNumber,
                                Tuple tuple,
                                Group group,
                                Genexp genexp) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.tuple = tuple;
        this.group = group;
        this.genexp = genexp;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Tuple getTuple() { return tuple; }
    public void setTuple(Tuple tuple) { this.tuple = tuple; }

    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }

    public Genexp getGenexp() { return genexp; }
    public void setGenexp(Genexp genexp) { this.genexp = genexp; }

    @Override
    public String toString() { return "TupleGroupGenexpAtom"; }
}