package org.example;

import java.util.Scanner;

public class QuickCalcApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("QuickCalc");

        while (true) {
            System.out.print("Enter operation (+ - * /) or C to clear, Q to quit: ");
            String op = scanner.next();

            if (op.equalsIgnoreCase("Q")) break;

            if (op.equalsIgnoreCase("C")) {
                System.out.println("Result: " + calc.clear());
                continue;
            }

            System.out.print("Enter first number: ");
            double a = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double b = scanner.nextDouble();

            double result = 0;

            switch (op) {
                case "+" -> result = calc.add(a, b);
                case "-" -> result = calc.subtract(a, b);
                case "*" -> result = calc.multiply(a, b);
                case "/" -> result = calc.divide(a, b);
                default -> System.out.println("Invalid operation");
            }

            System.out.println("Result: " + result);
        }
    }
}