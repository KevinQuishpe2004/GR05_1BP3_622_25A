package ec.epn.edu;


public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("EJECUTANDO LA CALCULADORA!!!!!!!!!!!");
        System.out.println("la suma entre 10 y 20 es " + Calculator.add(10,20) );
        System.out.println("la resta entre 10 y 20 es " + Calculator.subtract(10,20) );
        System.out.println("la multiplicacion entre 10 + 20 es " + Calculator.multiply(10,20));
        System.out.println("la división entre 20 y 10 es " + Calculator.add(20,10) );
        System.out.println("la sumatoria de 100 es " + Calculator.summation(100) );
        System.out.println("la raiz cuadrada de 100 es " + Calculator.squareRoot(100) );
        System.out.println("el logaritmo natural de 100 es " + Calculator.naturalLog(100) );
        System.out.println("el factorial de 5 es " + Calculator.factorial(5) );
        System.out.println("la potencia de 2^3 es " + Calculator.power(2,3) );

    }
}

