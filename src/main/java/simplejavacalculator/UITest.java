package simplejavacalculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UITest {

    private UI ui;

    @BeforeEach
    public void setUp() throws Exception {
        ui = new UI();
        ui.init();
    }

    @AfterEach
    public void tearDown() throws Exception {
        ui.frame.dispose();
    }

    @Test
    public void testAddition() {
        performButtonClicks("3+2=");
        assertEquals("5.0", ui.text.getText());
    }

    @Test
    public void testSubtraction() {
        performButtonClicks("7-4=");
        assertEquals("3.0", ui.text.getText());
    }

    @Test
    public void testMultiplication() {
        performButtonClicks("5*6=");
        assertEquals("30.0", ui.text.getText());
    }

    @Test
    public void testDivision() {
        performButtonClicks("8/2=");
        assertEquals("4.0", ui.text.getText());
    }

    @Test
    public void testSquareRoot() {
        performButtonClicks("9q");
        assertEquals("3.0", ui.text.getText());
    }

    @Test
    public void testSquareRootNegative() {
        performButtonClicks("0-9=q");
        assertEquals("Undefined", ui.text.getText());
    }

    @Test
    public void testPercentage() {
        performButtonClicks("100+10%=");
        assertEquals("1.01", ui.text.getText());
    }

    @Test
    public void testLogarithm() {
        performButtonClicks("120l");
        assertEquals("1.3222192947339193", ui.text.getText());
    }

    @Test
    public void testBinaryConversion() {
        performButtonClicks("9B");
        assertEquals("1001", ui.text.getText());
    }

    @Test
    public void testSquare() {
        performButtonClicks("5s");
        assertEquals("25.0", ui.text.getText());
    }

    @Test
    public void testOneDividedBy() {
        performButtonClicks("1/2=");
        assertEquals("0.5", ui.text.getText());
    }

    @Test
    public void testCos() {
        performButtonClicks("0o");
        assertEquals("1.0", ui.text.getText());
    }

    @Test
    public void testSin() {
        performButtonClicks("90i");
        assertEquals("0.15643446504023087", ui.text.getText());
    }

    @Test
    public void testTan() {
        performButtonClicks("45a");
        assertEquals("1.3763819204711734", ui.text.getText());
    }

    @Test
    public void testNaturalLogarithm() {
        performButtonClicks("2n");
        assertEquals("0.6931471805599453", ui.text.getText());
    }

    @Test
    public void testCancel() {
        performButtonClicks("10+20C");
        assertEquals("", ui.text.getText());
    }

    @Test
    public void testPowerOf() {
        performButtonClicks("2p3");
        assertEquals("3", ui.text.getText());
    }

    @Test
    public void testAbs() {
        performButtonClicks("2A");
        assertEquals("2.0", ui.text.getText());
    }

    @Test
    public void testOneDivide() {
        performButtonClicks("8O");
        assertEquals("0.125", ui.text.getText());
    }

    @Test
    public void testOneDivide0() {
        performButtonClicks("0O");
        assertEquals("Undefined", ui.text.getText());
    }

    @Test
    public void testLn0() {
        performButtonClicks("0n");
        assertEquals("Undefined", ui.text.getText());
    }

    @Test
    public void testLnNegative() {
        performButtonClicks("0-5=n");
        assertEquals("Undefined", ui.text.getText());
    }

    @Test
    public void testLog0() {
        performButtonClicks("0l");
        assertEquals("Undefined", ui.text.getText());
    }

    @Test
    public void testLogNegative() {
        performButtonClicks("0-5=l");
        assertEquals("Undefined", ui.text.getText());
    }

    private void performButtonClicks(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c);
                ui.but[digit].doClick();
            } else {
                switch (c) {
                    case '+':
                        ui.butAdd.doClick();
                        break;
                    case '-':
                        ui.butMinus.doClick();
                        break;
                    case '*':
                        ui.butMultiply.doClick();
                        break;
                    case '/':
                        ui.butDivide.doClick();
                        break;
                    case '=':
                        ui.butEqual.doClick();
                        break;
                    case 's':
                        ui.butSquare.doClick();
                        break;
                    case 'q':
                        ui.butSquareRoot.doClick();
                        break;
                    case '%':
                        ui.butrate.doClick();
                        break;
                    case 'l':
                        ui.butlog.doClick();
                        break;
                    case 'B':
                        ui.butBinary.doClick();
                        break;
                    case 'i':
                        ui.butSin.doClick();
                        break;
                    case 'o':
                        ui.butCos.doClick();
                        break;
                    case 'a':
                        ui.butTan.doClick();
                        break;
                    case 'n':
                        ui.butln.doClick();
                        break;
                    case 'C':
                        ui.butCancel.doClick();
                        break;
                    case 'A':
                        ui.butabs.doClick();
                        break;
                    case 'p':
                        ui.butxpowerofy.doClick();
                        break;
                    case 'O':
                        ui.butOneDividedBy.doClick();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input character: " + c);
                }
            }
        }
    }
}
