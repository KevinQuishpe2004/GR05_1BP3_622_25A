package ec.epn.edu;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public static double naturalLog(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Natural log is only defined for positive numbers.");
        }
        return Math.log(number);
    }

    public static void squareRoot(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers.");
        }
        System.out.println(Math.sqrt(i));
    }

    public static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i - 1);

    }

    public static int summation(int limite) {
        return ((limite) * (limite+1)) / 2;
    }
}
