package org.spe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    // Basic operation tests
    @Test
    void testAdd() {
        assertEquals(5.5, calculator.add(2.3, 3.2), 0.0001);
    }

    @Test
    void testSubtract() {
        assertEquals(1.1, calculator.subtract(3.2, 2.1), 0.0001);
    }

    @Test
    void testMultiply() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), 0.0001);
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), 0.0001);
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5.0, 0));
    }

    // Scientific operation tests
    @Test
    void testSqrt() {
        assertEquals(3.0, calculator.sqrt(9.0), 0.0001);
    }

    @Test
    void testSqrtNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sqrt(-4.0));
    }

    @Test
    void testFactorial() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-3));
    }

    @Test
    void testLn() {
        assertEquals(Math.log(5.0), calculator.ln(5.0), 0.0001);
    }

    @Test
    void testLnInvalid() {
        assertThrows(IllegalArgumentException.class, () -> calculator.ln(0));
    }

    @Test
    void testPower() {
        assertEquals(8.0, calculator.power(2.0, 3.0), 0.0001);
    }
}