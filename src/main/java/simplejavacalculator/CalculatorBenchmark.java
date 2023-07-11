package simplejavacalculator;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class CalculatorBenchmark {

    @Benchmark
    public void testAddition() {
        Calculator calc = new Calculator();
        calc.calculateBi(Calculator.BiOperatorModes.add, 5.0);
        calc.calculateEqual(3.0);
    }

    @Benchmark
    public void testSubtraction() {
        Calculator calc = new Calculator();
        calc.calculateBi(Calculator.BiOperatorModes.minus, 8.0);
        calc.calculateEqual(3.0);
    }

    @Benchmark
    public void testMultiplication() {
        Calculator calc = new Calculator();
        calc.calculateBi(Calculator.BiOperatorModes.multiply, 7.0);
        calc.calculateEqual(4.0);
    }

    @Benchmark
    public void testDivision() {
        Calculator calc = new Calculator();
        calc.calculateBi(Calculator.BiOperatorModes.divide, 20.0);
        calc.calculateEqual(4.0);
    }

    @Benchmark
    public void testSquareRoot() {
        Calculator calc = new Calculator();
        calc.calculateMono(Calculator.MonoOperatorModes.squareRoot, 16.0);
    }

    @Benchmark
    public void testLogarithm() {
        Calculator calc = new Calculator();
        calc.calculateMono(Calculator.MonoOperatorModes.log, 100.0);
    }
}