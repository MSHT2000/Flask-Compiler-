package AST.Python;

public class DictSetAtom extends Atom {
    private final String nodeName;
    private final int lineNumber;
    private Dict dict;
    private Set set;                 // NOTE: resolves to AST.Python.Set
    private Dictcomp dictcomp;
    private Setcomp setcomp;

    public DictSetAtom(String nodeName, int lineNumber,
                       Dict dict,
                       Set set,
                       Dictcomp dictcomp,
                       Setcomp setcomp) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.dict = dict;
        this.set = set;
        this.dictcomp = dictcomp;
        this.setcomp = setcomp;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public Dict getDict() { return dict; }
    public void setDict(Dict dict) { this.dict = dict; }

    public Set getSet() { return set; }
    public void setSet(Set set) { this.set = set; }

    public Dictcomp getDictcomp() { return dictcomp; }
    public void setDictcomp(Dictcomp dictcomp) { this.dictcomp = dictcomp; }

    public Setcomp getSetcomp() { return setcomp; }
    public void setSetcomp(Setcomp setcomp) { this.setcomp = setcomp; }

    @Override
    public String toString() { return "DictSetAtom"; }
}