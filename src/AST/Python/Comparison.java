package AST.Python;

import java.util.List;

public class Comparison {
    private final String nodeName;
    private final int lineNumber;
    private BitwiseOr bitwiseOr;
    private List<CompareOpBitwiseOrPair> compareOpBitwiseOrPair;

    public Comparison(String nodeName, int lineNumber,
                      BitwiseOr bitwiseOr,
                      List<CompareOpBitwiseOrPair> compareOpBitwiseOrPair) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.bitwiseOr = bitwiseOr;
        this.compareOpBitwiseOrPair = compareOpBitwiseOrPair;
    }

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }

    public BitwiseOr getBitwiseOr() { return bitwiseOr; }
    public void setBitwiseOr(BitwiseOr bitwiseOr) { this.bitwiseOr = bitwiseOr; }

    public List<CompareOpBitwiseOrPair> getCompareOpBitwiseOrPair() { return compareOpBitwiseOrPair; }
    public void setCompareOpBitwiseOrPair(List<CompareOpBitwiseOrPair> compareOpBitwiseOrPair) {
        this.compareOpBitwiseOrPair = compareOpBitwiseOrPair;
    }

    @Override
    public String toString() { return "Comparison"; }
}