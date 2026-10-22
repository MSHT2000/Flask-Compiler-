package SymbolTable;

public class Symbol {

    public enum Kind {
        VARIABLE, FUNCTION, PARAMETER, CLASS, IMPORT, LOOP_VAR
    }

    public final String name;
    public final Kind kind;
    public final int line;
    public final String dataType;   // "int", "str", "list", "dict", "function", null
    public int paramCount = -1;     // للدوال فقط
    public boolean used = false;    // للتحذير "غير مستخدم"

    public Symbol(String name, Kind kind, int line, String dataType) {
        this.name = name;
        this.kind = kind;
        this.line = line;
        this.dataType = dataType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ").append(kind.toString().toLowerCase());
        if (dataType != null) sb.append(" (").append(dataType).append(")");
        if (paramCount >= 0) sb.append(" params=").append(paramCount);
        sb.append(" [line ").append(line).append("]");
        return sb.toString();
    }
}