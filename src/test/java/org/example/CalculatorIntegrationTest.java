package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIntegrationTest {

    @Test void testFullCalculationFlow() {
        Calculator calc = new Calculator();
        double result = calc.add(5,3);
        assertEquals(8, result);
    }

    @Test void testClearFunction() {
        Calculator calc = new Calculator();
        calc.add(5,3);
        double cleared = calc.clear();
        assertEquals(0, cleared);
    }
}