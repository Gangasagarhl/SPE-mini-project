package org.spe;

import java.util.Scanner;

// test 20
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("=== Scientific Calculator ===");

        do {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√x)");
            System.out.println("6. Factorial (!x)");
            System.out.println("7. Natural Logarithm (ln(x))");
            System.out.println("8. Power (x^y)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        double a1 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b1 = sc.nextDouble();
                        System.out.println("Result: " + calc.add(a1, b1));
                        break;

                    case 2:
                        System.out.print("Enter first number: ");
                        double a2 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b2 = sc.nextDouble();
                        System.out.println("Result: " + calc.subtract(a2, b2));
                        break;

                    case 3:
                        System.out.print("Enter first number: ");
                        double a3 = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        double b3 = sc.nextDouble();
                        System.out.println("Result: " + calc.multiply(a3, b3));
                        break;

                    case 4:
                        System.out.print("Enter numerator: ");
                        double a4 = sc.nextDouble();
                        System.out.print("Enter denominator: ");
                        double b4 = sc.nextDouble();
                        System.out.println("Result: " + calc.divide(a4, b4));
                        break;

                    case 5:
                        System.out.print("Enter number: ");
                        double x1 = sc.nextDouble();
                        System.out.println("Result: " + calc.sqrt(x1));
                        break;

                    case 6:
                        System.out.print("Enter integer number: ");
                        int n = sc.nextInt();
                        System.out.println("Result: " + calc.factorial(n));
                        break;

                    case 7:
                        System.out.print("Enter number: ");
                        double x2 = sc.nextDouble();
                        System.out.println("Result: " + calc.ln(x2));
                        break;

                    case 8:
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter exponent: ");
                        double exp = sc.nextDouble();
                        System.out.println("Result: " + calc.power(base, exp));
                        break;

                    case 9:
                        System.out.println("Exiting calculator. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 9);

        sc.close();
    }
}