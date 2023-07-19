package simplejavacalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static java.lang.Double.NaN;
import java.lang.Math;
import java.lang.reflect.Field;


import simplejavacalculator.Calculator;

class CalculatorTest {

	@Test
	void calculateBiImplUnknownModeTest() throws NoSuchFieldException, IllegalAccessException {
		Calculator calculator = new Calculator();

		Field modeField = Calculator.class.getDeclaredField("mode");
		modeField.setAccessible(true);
		modeField.set(calculator, null);

		// Now try to calculate
		Assertions.assertThrows(Error.class, () -> {
			calculator.calculateBi(Calculator.BiOperatorModes.add, 3.0);
		});
	}
	@Test
	void calculateBiNormalTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
		Assertions.assertEquals(NaN, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
    }
	@Test
	void calculateBiXPowerYTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0);
		Assertions.assertEquals(8.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
	}

	@Test
	void calculateBiAddTestNum01() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 1.0);
		Assertions.assertEquals(1.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 0.0));
	}
	@Test
	void calculateBiAddTestNum0() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 0.0);
		Assertions.assertEquals(0.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 0.0));
	}

	@Test
	void calculateBiAddTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 3.0);
		Assertions.assertEquals(5.5, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.5));
	}
	
	@Test
	void calculateBiMinusTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 3.1415);
		Assertions.assertEquals(2.0415, calculator.calculateBi(Calculator.BiOperatorModes.normal, 1.1));
	}
	
	@Test
	void calculateBiMultiplyTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, 3.2);
		Assertions.assertEquals(6.4, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	void calculateBiDivideTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.divide, 6.4);
		Assertions.assertEquals(3.2, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	void calculateEqualTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0);
		Assertions.assertEquals(11.4, calculator.calculateEqual(3.0));
	}
	
	@Test
	void resetTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		Assertions.assertEquals(8.4, calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0));
		Assertions.assertEquals(NaN, calculator.reset());		
	}
	
	@Test
	void CalculateMonoSquareTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(9.0, calculator.calculateMono(Calculator.MonoOperatorModes.square, 3.0));
	}
	
	@Test
	void CalculateMonoSquareRootTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(5.0, calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0));
	}
	
	@Test
	void CalculateMonoOneDividedByTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.10, calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0));
	}
	
	@Test
	void CalculateMonoSinTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.009138395397176044, calculator.calculateMono(Calculator.MonoOperatorModes.sin, java.lang.Math.PI / 6), 0.0000000001);
	}

	@Test
	void CalculateMonoCosTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.9998329794591297, calculator.calculateMono(Calculator.MonoOperatorModes.cos, java.lang.Math.PI / 3), 0.0000000001);
	}
	@Test
	void CalculateMonoTan90Test() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(NaN, calculator.calculateMono(Calculator.MonoOperatorModes.tan, 90.0), 0.0);
	}
	@Test
	void CalculateMonoTan0Test() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.0, calculator.calculateMono(Calculator.MonoOperatorModes.tan, 0.0), 0.0);
	}
	@Test
	void CalculateMonoTanTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.013708642534394057, calculator.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI / 4), 0.0000000001);
	}
	
	@Test
	void CalculateMonoLogTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(2.0, calculator.calculateMono(Calculator.MonoOperatorModes.log, 100.0));
	}

	@Test
	void CalculateMonoLnTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(1.0, calculator.calculateMono(Calculator.MonoOperatorModes.ln, 2.718281828459045));
	}
	
	@Test
	void CalculateMonoRateTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(.75, calculator.calculateMono(Calculator.MonoOperatorModes.rate, 75.0));
	}
	
	@Test
	void CalculateMonoAbsTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, -3.0));
		Assertions.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, 3.0));
	}

	@Test
	void calculateMonoUnknownModeTest() {
		Calculator calculator = new Calculator();
		Assertions.assertThrows(Error.class, () -> {
			calculator.calculateMono(null, 3.0);
		});
	}

	@Test
	void calculateMaxDoubleTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(709.782712893384, calculator.calculateMono(Calculator.MonoOperatorModes.ln, Double.MAX_VALUE));
	}

	@Test
	void calculateManyBiTest(){
		Calculator calculator = new Calculator();

		calculator.calculateBi(Calculator.BiOperatorModes.add, 5.0);
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 2.0);
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, 3.0);
		calculator.calculateBi(Calculator.BiOperatorModes.divide, 4.0);
		calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 3.0);
		double x = calculator.calculateBi(Calculator.BiOperatorModes.normal, 5.0);

		Assertions.assertEquals(4315.127572016459, x);
	}

	@Test
	void calculateManyMonoTest(){
		Calculator calculator = new Calculator();

		double x =
				calculator.calculateMono(Calculator.MonoOperatorModes.sin,
				calculator.calculateMono(Calculator.MonoOperatorModes.cos,
				calculator.calculateMono(Calculator.MonoOperatorModes.tan,
				calculator.calculateMono(Calculator.MonoOperatorModes.ln,
				calculator.calculateMono(Calculator.MonoOperatorModes.abs,
				calculator.calculateMono(Calculator.MonoOperatorModes.log,
				calculator.calculateMono(Calculator.MonoOperatorModes.rate,
				calculator.calculateMono(Calculator.MonoOperatorModes.abs,
				calculator.calculateMono(Calculator.MonoOperatorModes.square,
				calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,
				calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0)))))))))));

		Assertions.assertEquals(0.017452405459852646, x);
	}

	@Test
	void calculateManyTest(){
		Calculator calculator = new Calculator();

		calculator.calculateBi(Calculator.BiOperatorModes.add, 5.0);
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 2.0);
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, 3.0);
		calculator.calculateBi(Calculator.BiOperatorModes.divide, 4.0);
		calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 3.0);
		double x = calculator.calculateBi(Calculator.BiOperatorModes.normal, 5.0);

		double y =
			calculator.calculateMono(Calculator.MonoOperatorModes.sin,
			calculator.calculateMono(Calculator.MonoOperatorModes.cos,
			calculator.calculateMono(Calculator.MonoOperatorModes.tan,
			calculator.calculateMono(Calculator.MonoOperatorModes.ln,
			calculator.calculateMono(Calculator.MonoOperatorModes.abs,
			calculator.calculateMono(Calculator.MonoOperatorModes.log,
			calculator.calculateMono(Calculator.MonoOperatorModes.rate,
			calculator.calculateMono(Calculator.MonoOperatorModes.abs,
			calculator.calculateMono(Calculator.MonoOperatorModes.square,
			calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot,
			calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, x)))))))))));

		Assertions.assertEquals(0.017452404015460624, y);
	}
}
