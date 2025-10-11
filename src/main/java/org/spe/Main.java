package org.spe;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 5;

        System.out.println("a = " + a + " b = " + b);
        System.out.println("a + b = " + calc.add(a, b));
        System.out.println("a - b = " + calc.subtract(a, b));
        System.out.println("a * b = " + calc.multiply(a, b));
        System.out.println("a / b = " + calc.divide(a, b));
    }
}