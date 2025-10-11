package org.spe;

public class Calculator {

    // Basic operations with double precision
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    // Scientific operations
    public double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Cannot take square root of negative number");
        }
        return Math.sqrt(x);
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial of negative number is undefined");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public double ln(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is undefined for non-positive numbers");
        }
        return Math.log(x);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, base);
    }
}