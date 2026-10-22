import AST.Python.FileInput;
import AST.Jinja.TemplateDocument;

import Visitor.PythonVisitor;
import Visitor.JinjaVisitor;

import antlr.PythonLexer;
import antlr.PythonParser;
import antlr.JinjaLexer;
import antlr.JinjaParser;

import SymbolTable.SymbolTable;
import SemanticCheck.SemanticChecker;

import codeGeneration.Generator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        Path root = Paths.get("").toAbsolutePath();
        Path pyFile      = root.resolve("test/pure_app/pure_app.py");
        Path templatesDir = root.resolve("test/pure_app/templates");
        Path staticDir    = root.resolve("test/pure_app/static");
        Path resultDir    = root.resolve("Result");

        Files.createDirectories(resultDir);

        // ============================================================
        // 1. Python AST
        // ============================================================
        CharStream pyCs = CharStreams.fromPath(pyFile);
        PythonLexer pyLexer = new PythonLexer(pyCs);
        PythonParser pyParser = new PythonParser(new CommonTokenStream(pyLexer));
        ParseTree pyTree = pyParser.fileInput();
        FileInput pyAst = (FileInput) new PythonVisitor().visit(pyTree);
        System.out.println("✅ Python AST built");

        // ============================================================
        // 2. Jinja ASTs
        // ============================================================
        Map<String, TemplateDocument> jinjaAsts = new LinkedHashMap<>();

        try (Stream<Path> files = Files.list(templatesDir)) {
            List<Path> htmls = files
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(".html"))
                    .sorted()
                    .toList();

            for (Path h : htmls) {
                CharStream jCs = CharStreams.fromPath(h);
                JinjaLexer jLexer = new JinjaLexer(jCs);
                JinjaParser jParser = new JinjaParser(new CommonTokenStream(jLexer));
                ParseTree jTree = jParser.templateDocument();
                TemplateDocument jAst = (TemplateDocument) new JinjaVisitor().visit(jTree);

                String name = h.getFileName().toString().replace(".html", "");
                jinjaAsts.put(name, jAst);
            }
        }
        System.out.println("✅ Jinja AST built (" + jinjaAsts.size() + " templates)");

        // ============================================================
        // 3. Symbol Table
        // ============================================================
        SymbolTable symbolTable = new SymbolTable();
        SemanticChecker checker = new SemanticChecker(symbolTable);

        // check() يبني SymbolTable + يفحص
        checker.check(pyAst, jinjaAsts);

        System.out.println("✅ Symbol Table + Semantic Check done");

        // ============================================================
        // 4. اكتب SymbolTable.txt
        // ============================================================
        try (FileWriter fw = new FileWriter(resultDir.resolve("SymbolTable.txt").toFile())) {
            fw.write(symbolTable.printTree());
        }
        System.out.println("✅ Result/SymbolTable.txt");

        // ============================================================
        // 5. اكتب Semantic.txt
        // ============================================================
        try (FileWriter fw = new FileWriter(resultDir.resolve("Semantic.txt").toFile())) {
            fw.write("=== Semantic Check ===\n\n");

            List<String> errors   = checker.getErrors();
            List<String> warnings = checker.getWarnings();

            if (errors.isEmpty() && warnings.isEmpty()) {
                fw.write("✅ No errors, no warnings.\n");
            } else {
                for (String e : errors)   fw.write("❌ " + e + "\n");
                for (String w : warnings) fw.write("⚠️  " + w + "\n");
            }
        }
        System.out.println("✅ Result/Semantic.txt");

        // ============================================================
        // 6. Code Generation
        // ============================================================
        new Generator().generate(pyAst, jinjaAsts, templatesDir, staticDir);
        System.out.println("✅ Flask project generated");

        System.out.println("\n=== Done ===");
    }
}