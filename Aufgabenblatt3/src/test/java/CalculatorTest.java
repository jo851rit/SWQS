import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @After
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void addValid() {
        int value = calculator.add(2,2);
        assertEquals(4, value);
    }

    @Test
    public void addMinus() {
        int value = calculator.add(2, -1);
        assertEquals(1, value);
    }

    @Test
    public void subtractValid() {
        int value = calculator.subtract(2, 2);
        assertEquals(0, value);
    }

    @Test
    public void subtractMinus() {
        int value = calculator.subtract(2, -2);
        assertEquals(4, value);
    }

    @Test
    public void multiplyValid() {
        int value = calculator.multiply(2, 2);
        assertEquals(4, value);
    }

    @Test
    public void multiplyMinus() {
        int value = calculator.multiply(2, -2);
        assertEquals(-4, value);
    }

    @Test
    public void divideValid() {
        double value = calculator.divide(2, 2);
        assertEquals(1, value);
    }

    @Test(expected=Exception.class)
    public void divideByZero() {
        double value = calculator.divide(2, 0);
    }
}