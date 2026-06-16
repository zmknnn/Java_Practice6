package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTester {
    Calculator calculator = new Calculator();

    @Test
    @DisplayName("Додавання")
    void addTest() {
        assertEquals(13, calculator.add(6, 7));
    }

    @Test
    @DisplayName("Віднімання")
    void subtractTest() {
        assertEquals(4, calculator.subtract(7, 3));
    }

    @Test
    @DisplayName("Множення")
    void multiplyTest() {
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    @DisplayName("Ділення")
    void divideTest() {
        assertEquals(5, calculator.divide(15, 3));
    }



}
