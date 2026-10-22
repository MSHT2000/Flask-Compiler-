package SymbolTable;

import java.util.*;

public class SymbolTable {

    // ============ Scope ============
    public static class Scope {
        public final String name;
        public final Scope parent;
        public final Map<String, Symbol> symbols = new LinkedHashMap<>();
        public final List<Scope> children = new ArrayList<>();

        public Scope(String name, Scope parent) {
            this.name = name;
            this.parent = parent;
            if (parent != null) parent.children.add(this);
        }

        public boolean define(Symbol symbol) {
            if (symbols.containsKey(symbol.name)) return false; // redefinition
            symbols.put(symbol.name, symbol);
            return true;
        }

        public Symbol lookupLocal(String name) {
            return symbols.get(name);
        }
    }

    // ============ Stack of Scopes ============
    private final Deque<Scope> stack = new ArrayDeque<>();
    private final Scope globalScope;

    public SymbolTable() {
        this.globalScope = new Scope("global", null);
        this.stack.push(globalScope);
    }

    public Scope currentScope() { return stack.peek(); }
    public Scope globalScope()  { return globalScope; }
    public int   depth()        { return stack.size(); }

    public void enterScope(String name) {
        stack.push(new Scope(name, stack.peek()));
    }

    public void exitScope() {
        if (stack.size() > 1) stack.pop();
    }

    public boolean define(Symbol symbol) {
        return currentScope().define(symbol);
    }

    /** البحث من الأعلى للأسفل */
    public Symbol resolve(String name) {
        for (Scope scope : stack) {
            Symbol s = scope.lookupLocal(name);
            if (s != null) return s;
        }
        return null;
    }

    public Symbol resolveLocal(String name) {
        return currentScope().lookupLocal(name);
    }

    // ============ Output ============
    public String printTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Symbol Table ===\n\n");
        printScope(globalScope, 0, sb);
        return sb.toString();
    }

    private void printScope(Scope scope, int indent, StringBuilder sb) {
        sb.append("  ".repeat(indent)).append("Scope: ").append(scope.name).append("\n");
        for (Symbol s : scope.symbols.values()) {
            sb.append("  ".repeat(indent + 1)).append(s).append("\n");
        }
        for (Scope child : scope.children) {
            printScope(child, indent + 1, sb);
        }
    }
}