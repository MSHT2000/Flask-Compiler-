# write_all.ps1 (batch 7)
$root = "C:\Users\Mohammed Shadi\IdeaProjects\Flask Compiler\src\AST\Python"
New-Item -ItemType Directory -Force -Path $root | Out-Null
$utf8 = New-Object System.Text.UTF8Encoding($false)
function W([string]$n, [string]$b) {
    [System.IO.File]::WriteAllText((Join-Path $root $n), $b, $utf8)
    Write-Host "wrote $n"
}

W "TupleDelTarget.java" @'
package AST.Python;
import java.lang.String;
public class TupleDelTarget extends DelTAtom {
    public String nodeName;
    public int lineNumber;
    DelTargets delTargets;
    public TupleDelTarget() {
    }
    public TupleDelTarget(String nodeName, int lineNumber,
                          DelTargets delTargets,
                          String rpar) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.delTargets = delTargets;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public DelTargets getDelTargets() { return delTargets; }
    public void setDelTargets(DelTargets delTargets) { this.delTargets = delTargets; }
    @Override
    public String toString() { return ""; }
}
'@

W "TupleGroupOrGenexpAtom.java" @'
package AST.Python;
import java.lang.String;
public class TupleGroupOrGenexpAtom extends Atom {
    public String nodeName;
    public int lineNumber;
    Tuple tuple;
    Group group;
    Genexp genexp;
    public TupleGroupOrGenexpAtom() {
    }
    public TupleGroupOrGenexpAtom(String nodeName, int lineNumber,
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
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Tuple getTuple() { return tuple; }
    public void setTuple(Tuple tuple) { this.tuple = tuple; }
    public Group getGroup() { return group; }
    public void setGroup(Group group) { this.group = group; }
    public Genexp getGenexp() { return genexp; }
    public void setGenexp(Genexp genexp) { this.genexp = genexp; }
    @Override
    public String toString() { return ""; }
}
'@

W "TupleSequencePattern.java" @'
package AST.Python;
import java.lang.String;
public class TupleSequencePattern extends SequencePattern {
    public String nodeName;
    public int lineNumber;
    OpenSequencePattern openSequencePattern;
    public TupleSequencePattern() {
    }
    public TupleSequencePattern(String nodeName, int lineNumber,
                                OpenSequencePattern openSequencePattern,
                                String rpar) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.openSequencePattern = openSequencePattern;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public OpenSequencePattern getOpenSequencePattern() { return openSequencePattern; }
    public void setOpenSequencePattern(OpenSequencePattern openSequencePattern) { this.openSequencePattern = openSequencePattern; }
    @Override
    public String toString() { return ""; }
}
'@

W "TupleSubjectExpr.java" @'
package AST.Python;
import java.lang.String;
public class TupleSubjectExpr extends SubjectExpr {
    public String nodeName;
    public int lineNumber;
    StarNamedExpression starNamedExpression;
    StarNamedExpressions starNamedExpressions;
    public TupleSubjectExpr() {
    }
    public TupleSubjectExpr(String nodeName, int lineNumber,
                            StarNamedExpression starNamedExpression,
                            StarNamedExpressions starNamedExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starNamedExpression = starNamedExpression;
        this.starNamedExpressions = starNamedExpressions;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public StarNamedExpression getStarNamedExpression() { return starNamedExpression; }
    public void setStarNamedExpression(StarNamedExpression starNamedExpression) { this.starNamedExpression = starNamedExpression; }
    public StarNamedExpressions getStarNamedExpressions() { return starNamedExpressions; }
    public void setStarNamedExpressions(StarNamedExpressions starNamedExpressions) { this.starNamedExpressions = starNamedExpressions; }
    @Override
    public String toString() { return ""; }
}
'@

W "TupleTarget.java" @'
package AST.Python;
import java.lang.String;
public class TupleTarget extends StarAtom {
    public String nodeName;
    public int lineNumber;
    StarTargetsTupleSeq starTargetsTupleSeq;
    public TupleTarget() {
    }
    public TupleTarget(String nodeName, int lineNumber,
                       StarTargetsTupleSeq starTargetsTupleSeq,
                       String rpar) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starTargetsTupleSeq = starTargetsTupleSeq;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public StarTargetsTupleSeq getStarTargetsTupleSeq() { return starTargetsTupleSeq; }
    public void setStarTargetsTupleSeq(StarTargetsTupleSeq starTargetsTupleSeq) { this.starTargetsTupleSeq = starTargetsTupleSeq; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeAlias.java" @'
package AST.Python;
import java.lang.String;
public class TypeAlias {
    public String nodeName;
    public int lineNumber;
    Name name;
    TypeParams typeParams;
    Expression expression;
    public TypeAlias() {
    }
    public TypeAlias(String nodeName, int lineNumber,
                     Name name,
                     TypeParams typeParams,
                     Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.name = name;
        this.typeParams = typeParams;
        this.expression = expression;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Name getName() { return name; }
    public void setName(Name name) { this.name = name; }
    public TypeParams getTypeParams() { return typeParams; }
    public void setTypeParams(TypeParams typeParams) { this.typeParams = typeParams; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeAliasStmt.java" @'
package AST.Python;
import java.lang.String;
public class TypeAliasStmt extends SimpleStmt{
    public String nodeName;
    public int lineNumber;
    public TypeAliasStmt() {
    }
    public TypeAliasStmt(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeName.java" @'
package AST.Python;
import java.lang.String;
public class TypeName extends NameExceptUnderscore {
    public String nodeName;
    public int lineNumber;
    public TypeName() {
    }
    public TypeName(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeParamBound.java" @'
package AST.Python;
import java.lang.String;
public class TypeParamBound {
    public String nodeName;
    public int lineNumber;
    Expression expression;
    public TypeParamBound() {
    }
    public TypeParamBound(String nodeName, int lineNumber,
                          Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeParamDefault.java" @'
package AST.Python;
import java.lang.String;
public class TypeParamDefault {
    public String nodeName;
    public int lineNumber;
    Expression expression;
    public TypeParamDefault() {
    }
    public TypeParamDefault(String nodeName, int lineNumber,
                            Expression expression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeParams.java" @'
package AST.Python;
import java.lang.String;
public class TypeParams {
    public String nodeName;
    public int lineNumber;
    TypeParamSeq typeParamSeq;
    public TypeParams() {
    }
    public TypeParams(String nodeName, int lineNumber,
                      TypeParamSeq typeParamSeq,
                      String rsqb) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.typeParamSeq = typeParamSeq;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public TypeParamSeq getTypeParamSeq() { return typeParamSeq; }
    public void setTypeParamSeq(TypeParamSeq typeParamSeq) { this.typeParamSeq = typeParamSeq; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeParamSeq.java" @'
package AST.Python;
import java.lang.String;
import java.util.List;
public class TypeParamSeq {
    public String nodeName;
    public int lineNumber;
    TypeParam typeParam;
    List<TypeParam> typeParamList;
    public TypeParamSeq() {
    }
    public TypeParamSeq(String nodeName, int lineNumber,
                        TypeParam typeParam,
                        List<TypeParam> typeParamList,
                        String comma) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.typeParam = typeParam;
        this.typeParamList = typeParamList;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public TypeParam getTypeParam() { return typeParam; }
    public void setTypeParam(TypeParam typeParam) { this.typeParam = typeParam; }
    public List<TypeParam> getTypeParamList() { return typeParamList; }
    public void setTypeParamList(List<TypeParam> typeParamList) { this.typeParamList = typeParamList; }
    @Override
    public String toString() { return ""; }
}
'@

W "TypeParamStarredDefault.java" @'
package AST.Python;
import java.lang.String;
public class TypeParamStarredDefault {
    public String nodeName;
    public int lineNumber;
    StarExpression starExpression;
    public TypeParamStarredDefault() {
    }
    public TypeParamStarredDefault(String nodeName, int lineNumber,
                                   StarExpression starExpression) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.starExpression = starExpression;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public StarExpression getStarExpression() { return starExpression; }
    public void setStarExpression(StarExpression starExpression) { this.starExpression = starExpression; }
    @Override
    public String toString() { return ""; }
}
'@

W "ValuePattern.java" @'
package AST.Python;
import java.lang.String;
public class ValuePattern extends ClosedPattern {
    public String nodeName;
    public int lineNumber;
    Attr attr;
    public ValuePattern() {
    }
    public ValuePattern(String nodeName, int lineNumber, Attr attr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.attr = attr;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Attr getAttr() { return attr; }
    public void setAttr(Attr attr) { this.attr = attr; }
    @Override
    public String toString() { return ""; }
}
'@

W "VbarEqualAugAssign.java" @'
package AST.Python;
import java.lang.String;
public class VbarEqualAugAssign extends AugAssign{
    int lineNumber;
    public String nameNode;
    public VbarEqualAugAssign(int lineNumber) {
        this.lineNumber = lineNumber;
    }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public String getNameNode() { return nameNode; }
    public void setNameNode(String nameNode) { this.nameNode = nameNode; }
    @Override
    public String toString() { return ""; }
}
'@

W "WhileStatement.java" @'
package AST.Python;
import java.lang.String;
public class WhileStatement extends CompoundStmt{
    public String nodeName;
    public int lineNumber;
    public WhileStatement() {
    }
    public WhileStatement(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "WhileStmt.java" @'
package AST.Python;
import java.lang.String;
public class WhileStmt {
    public String nodeName;
    public int lineNumber;
    NamedExpression namedExpression;
    Block block;
    ElseBlock elseBlock;
    public WhileStmt() {
    }
    public WhileStmt(String nodeName, int lineNumber,
                     NamedExpression namedExpression,
                     Block block,
                     ElseBlock elseBlock) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.namedExpression = namedExpression;
        this.block = block;
        this.elseBlock = elseBlock;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public NamedExpression getNamedExpression() { return namedExpression; }
    public void setNamedExpression(NamedExpression namedExpression) { this.namedExpression = namedExpression; }
    public Block getBlock() { return block; }
    public void setBlock(Block block) { this.block = block; }
    public ElseBlock getElseBlock() { return elseBlock; }
    public void setElseBlock(ElseBlock elseBlock) { this.elseBlock = elseBlock; }
    @Override
    public String toString() { return ""; }
}
'@

W "WildcardImportTargets.java" @'
package AST.Python;
import java.lang.String;
public class WildcardImportTargets extends ImportFromTargets {
    public String nodeName;
    public int lineNumber;
    public WildcardImportTargets() {
    }
    public WildcardImportTargets(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "WildcardName.java" @'
package AST.Python;
import java.lang.String;
public class WildcardName extends Name {
    public String nodeName;
    public int lineNumber;
    public WildcardName() {
    }
    public WildcardName(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "WildcardPattern.java" @'
package AST.Python;
import java.lang.String;
public class WildcardPattern extends ClosedPattern {
    public String nodeName;
    public int lineNumber;
    public WildcardPattern() {
    }
    public WildcardPattern(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "WithDefaultLambdaParameters.java" @'
package AST.Python;
import java.lang.String;
import java.util.List;
public class WithDefaultLambdaParameters extends LambdaParameters {
    public String nodeName;
    public int lineNumber;
    List<LambdaParamWithDefault> lambdaParamWithDefaultList;
    LambdaStarEtc lambdaStarEtc;
    public WithDefaultLambdaParameters() {
    }
    public WithDefaultLambdaParameters(String nodeName, int lineNumber,
                                       List<LambdaParamWithDefault> lambdaParamWithDefaultList,
                                       LambdaStarEtc lambdaStarEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.lambdaParamWithDefaultList = lambdaParamWithDefaultList;
        this.lambdaStarEtc = lambdaStarEtc;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<LambdaParamWithDefault> getLambdaParamWithDefaultList() { return lambdaParamWithDefaultList; }
    public void setLambdaParamWithDefaultList(List<LambdaParamWithDefault> lambdaParamWithDefaultList) { this.lambdaParamWithDefaultList = lambdaParamWithDefaultList; }
    public LambdaStarEtc getLambdaStarEtc() { return lambdaStarEtc; }
    public void setLambdaStarEtc(LambdaStarEtc lambdaStarEtc) { this.lambdaStarEtc = lambdaStarEtc; }
    @Override
    public String toString() { return ""; }
}
'@

W "WithDefaultParameters.java" @'
package AST.Python;
import java.lang.String;
import java.util.List;
public class WithDefaultParameters extends Parameters {
    public String nodeName;
    public int lineNumber;
    List<ParamWithDefault> paramWithDefaultList;
    StarEtc starEtc;
    public WithDefaultParameters() {
    }
    public WithDefaultParameters(String nodeName, int lineNumber,
                                 List<ParamWithDefault> paramWithDefaultList,
                                 StarEtc starEtc) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.paramWithDefaultList = paramWithDefaultList;
        this.starEtc = starEtc;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public List<ParamWithDefault> getParamWithDefaultList() { return paramWithDefaultList; }
    public void setParamWithDefaultList(List<ParamWithDefault> paramWithDefaultList) { this.paramWithDefaultList = paramWithDefaultList; }
    public StarEtc getStarEtc() { return starEtc; }
    public void setStarEtc(StarEtc starEtc) { this.starEtc = starEtc; }
    @Override
    public String toString() { return ""; }
}
'@

W "WithItem.java" @'
package AST.Python;
import java.lang.String;
public class WithItem {
    public String nodeName;
    public int lineNumber;
    Expression expression;
    StarTarget starTarget;
    public WithItem() {
    }
    public WithItem(String nodeName, int lineNumber,
                    Expression expression,
                    StarTarget starTarget) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.starTarget = starTarget;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public StarTarget getStarTarget() { return starTarget; }
    public void setStarTarget(StarTarget starTarget) { this.starTarget = starTarget; }
    @Override
    public String toString() { return ""; }
}
'@

W "WithStatement.java" @'
package AST.Python;
import java.lang.String;
public class WithStatement extends CompoundStmt{
    public String nodeName;
    public int lineNumber;
    public WithStatement() {
    }
    public WithStatement(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "YeildExpressions.java" @'
package AST.Python;
import java.lang.String;
public class YeildExpressions extends AnnotatedRhs{
    public String nodeName;
    public int lineNumber;
    public YeildExpressions() {
    }
    public YeildExpressions(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    @Override
    public String toString() { return ""; }
}
'@

W "YieldExpr.java" @'
package AST.Python;
import java.lang.String;
public class YieldExpr {
    public String nodeName;
    public int lineNumber;
    Expression expression;
    StarExpressions starExpressions;
    public YieldExpr() {
    }
    public YieldExpr(String nodeName, int lineNumber,
                     Expression expression,
                     StarExpressions starExpressions) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.expression = expression;
        this.starExpressions = starExpressions;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public Expression getExpression() { return expression; }
    public void setExpression(Expression expression) { this.expression = expression; }
    public StarExpressions getStarExpressions() { return starExpressions; }
    public void setStarExpressions(StarExpressions starExpressions) { this.starExpressions = starExpressions; }
    @Override
    public String toString() { return ""; }
}
'@

W "YieldStmt.java" @'
package AST.Python;
import java.lang.String;
public class YieldStmt {
    public String nodeName;
    public int lineNumber;
    YieldExpr yieldExpr;
    public YieldStmt() {
    }
    public YieldStmt(String nodeName, int lineNumber, YieldExpr yieldExpr) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
        this.yieldExpr = yieldExpr;
    }
    public String getNodeName() { return nodeName; }
    public void setNodeName(String nodeName) { this.nodeName = nodeName; }
    public int getLineNumber() { return lineNumber; }
    public void setLineNumber(int lineNumber) { this.lineNumber = lineNumber; }
    public YieldExpr getYieldExpr() { return yieldExpr; }
    public void setYieldExpr(YieldExpr yieldExpr) { this.yieldExpr = yieldExpr; }
    @Override
    public String toString() { return ""; }
}
'@

Write-Host ""
Write-Host "All 27 files written to $root"