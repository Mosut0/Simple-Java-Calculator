package simplejavacalculator;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SyntaxBasedTesting {

    public static void main(String[] args) {
        String[] testCases = {
                "2 + 3",
                "cos(0.5) + sqrt(16)",
                "sqrt(25) + 13 / 12",
                "2 * 3",
                "cos(0.5)",
                "cos(-0.5)",
                "log",
                "abs-10",
                "log(",
                "sqrt2",
                "3 * (4 + 5)",
                "ln(2) + ln(3)",
                "tan(0.785398)",
                "1 / 0",
                "square(4) - sqrt(16)",
                "ln(abs(-5))",
                "(2 + 3 * 4) / (5 - 1)",
        };

        gLexer lexer = new gLexer(CharStreams.fromString(""));
        gParser parser = new gParser(new CommonTokenStream(lexer));

        for (String testCase : testCases) {
            System.out.println("Testing expression: " + testCase);
            lexer.setInputStream(CharStreams.fromString(testCase));
            parser.setInputStream(new CommonTokenStream(lexer));

            try {
                ParseTree parseTree = parser.expression();
                System.out.println("Parsed with the following Errors: ");
            } catch (Exception e) {
                System.out.println("Syntax Error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}