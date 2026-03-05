package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test void testAddition() { assertEquals(8, calc.add(5,3)); }
    @Test void testSubtraction() { assertEquals(6, calc.subtract(10,4)); }
    @Test void testMultiplication() { assertEquals(42, calc.multiply(6,7)); }
    @Test void testDivision() { assertEquals(5, calc.divide(10,2)); }
    @Test void testDivisionByZero() { assertThrows(IllegalArgumentException.class, () -> calc.divide(5,0)); }
    @Test void testNegativeNumbers() { assertEquals(-2, calc.add(-5,3)); }
    @Test void testDecimalNumbers() { assertEquals(5.5, calc.add(2.5,3.0)); }
    @Test void testLargeNumbers() { assertEquals(1000000, calc.add(500000,500000)); }
}