package ec.epn.edu;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParametersTest {

    @ParameterizedTest(name = "{index}: add({0}, {1}) = {2}")
    @MethodSource("additionProvider")
    void give_parameters_when_addition_then_returnSum(int a, int b, int expectedSum) {
        assertEquals(expectedSum, Calculator.add(a, b));
    }

    private static Stream<Arguments> additionProvider() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(2, 3, 5),
                Arguments.of(3, 4, 7),
                Arguments.of(4, 5, 9)
        );
    }

    @ParameterizedTest(name = "{index}: subtract({0}, {1}) = {2}")
    @MethodSource("subtractionProvider")
    void give_parameters_when_subtraction_then_returnDifference(int a, int b, int expectedDifference) {
        assertEquals(expectedDifference, Calculator.subtract(a, b));
    }
    static Stream<Arguments> subtractionProvider() {
        return Stream.of(
                Arguments.of(5, 3, 2),
                Arguments.of(10,11, -1),
                Arguments.of(7, 2, 5),
                Arguments.of(8, 3, 5)
        );
    }
    @ParameterizedTest(name = "{index}: multiply({0}, {1}) = {2}")
    @MethodSource("multiplicationProvider")
    void give_parameters_when_multiplication_then_returnProduct(int a, int b, int expectedProduct) {
        assertEquals(expectedProduct, Calculator.multiply(a, b));
    }
    static Stream<Arguments> multiplicationProvider() {
        return Stream.of(
                Arguments.of(-1, 2, -2),
                Arguments.of(2, 3, 6),
                Arguments.of(3, -4, -12),
                Arguments.of(-4, -5, 20)
        );
    }

}