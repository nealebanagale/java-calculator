package com.calculator;

import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        // input/output
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");

        // Array list
        ArrayList<String> operations = new ArrayList<>();
        operations.add("addition");
        operations.add("subtraction");
        operations.add("multiplication");
        operations.add("division");
        System.out.print("Please enter operation: ");
        System.out.println(operations.toString());
        String operation = sc.next();

        // control flow
        if (operations.contains(operation)) {
            int result = 0;
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            switch(operation) {
                case "addition":
                    result = a + b;
                    break;
                case "subtraction":
                    result = a - b;
                    break;
                case "multiplication":
                    result = a * b;
                    break;
                case "division":
                    result = a / b;
                    break;
            }

            System.out.println("Result: " + result);

            // Arrays
            int[] commonEven = new int[] {2, 4, 10};
            int[] commonOdd = {3, 7};

            // control flow for-loop
            for (int i = 0; i < commonOdd.length; i++) {
                if (commonOdd[i] == result) {
                    System.out.println(result + " is a common odd number.");
                }
            }

            for (int element : commonEven) {
                if (element == result) {
                    System.out.println(String.format("%s is a common even number.", result));
                }
            }
        } else {
            System.out.println("Invalid operation.");
            return;
        }


/**
 * TO DO
 * map
 * ENUM
 * inheritance (enum) + Override
 */
    }
}
