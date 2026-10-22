package AST.Python;

import java.util.List;

/**
 * AST node representing the 'classPattern' rule.
 *
 * Grammar:
 * classPattern
 *     : nameOrAttr LPAR ((positionalPatterns (COMMA keywordPatterns)? | keywordPatterns) COMMA?)? RPAR
 *     ;
 */
public class ClassPattern extends Pattern {
    public String nodeName;
    public int lineNumber;
    public NameOrAttr nameOrAttr;
    public String lpar;
    public PositionalPatterns positionalPatterns;
    public List<String> commas;
    public KeywordPatterns keywordPatterns;
    public String rpar;

    public ClassPattern(String nodeName, int lineNumber, NameOrAttr nameOrAttr, String lpar,
                        PositionalPatterns positionalPatterns, List<String> commas,
                        KeywordPatterns keywordPatterns, String rpar) {
        this.nameOrAttr = nameOrAttr;
        this.lpar = lpar;
        this.positionalPatterns = positionalPatterns;
        this.commas = commas;
        this.keywordPatterns = keywordPatterns;
        this.rpar = rpar;
    }

    public NameOrAttr getNameOrAttr() {
        return nameOrAttr;
    }

    public String getLpar() {
        return lpar;
    }

    public PositionalPatterns getPositionalPatterns() {
        return positionalPatterns;
    }

    public List<String> getCommas() {
        return commas;
    }

    public KeywordPatterns getKeywordPatterns() {
        return keywordPatterns;
    }

    public String getRpar() {
        return rpar;
    }

    @Override
    public String toString() {
        return "ClassPattern";
    }
}