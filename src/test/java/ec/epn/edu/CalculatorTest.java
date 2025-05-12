package ec.epn.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Suma dos enteros correctamente")
    public void given_twoIntegers_whenAdd_thenReturnCorrectSum() {
        // Given
        int a = 2;
        int b = 3;

        // When
        int result = Calculator.add(a, b);

        // Then
        assertEquals(5, result, "2 + 3 debería ser 5");
    }

    @Test
    @DisplayName("División lanza excepción cuando divide por cero")
    public void given_numberAndZero_whenDivide_thenThrowArithmeticException() {
        // Given
        double numerator = 5;
        double denominator = 0;

        // When & Then
        assertThrows(ArithmeticException.class, () -> Calculator.divide(numerator, denominator));
    }

    @Test
    @DisplayName("Logaritmo natural de un número positivo")
    public void given_positiveNumber_whenNaturalLog_thenReturnCorrectValue() {
        // Given
        double number = Math.E;

        // When
        double result = Calculator.naturalLog(number);

        // Then
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    @DisplayName("Raíz cuadrada lanza excepción para números negativos")
    public void given_negativeNumber_whenSquareRoot_thenThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.squareRoot(-1));
    }

    @Test
    @DisplayName("Factorial de un número positivo")
    public void given_positiveInteger_whenFactorial_thenReturnCorrectValue() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
    }
    @Test
    @DisplayName("Sustracción de dos enteros correctamente")
    public void given_twoIntegers_whenSubtract_thenReturnCorrectDifference() {
        // Given
        int a = 5;
        int b = 3;

        // When
        int result = Calculator.subtract(a, b);

        // Then
        assertEquals(2, result, "5 - 3 debería ser 2");
    }
    @Test
    @DisplayName("Multiplicación de dos enteros correctamente")
    public void given_twoIntegers_whenMultiply_thenReturnCorrectProduct() {
        // Given
        int a = 2;
        int b = 3;

        // When
        int result = Calculator.multiply(a, b);

        // Then
        assertEquals(6, result, "2 * 3 debería ser 6");
    }

    @Test
    @DisplayName("Sumatoria de números hasta llegar al límite (número dado)")
    public void given_oneNumber_whenSum_thenReturnCorrectSum() {
        int limite = 10;

        int result = Calculator.summation(limite);

        assertEquals(55, result, "la sumatoria de 10 debería dar 55");
    }

}