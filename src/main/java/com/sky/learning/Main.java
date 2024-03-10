package com.sky.learning;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner s = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Please enter number 1");
        double num1 = s.nextDouble();

        // Prompt the user to enter the second number
        System.out.println("Please enter number 2");
        double num2 = s.nextDouble();

        // Prompt the user to enter an operator (+, -, *, /)
        System.out.println("Please enter the operator (+,-,*,/) :");
        char operator = s.next().charAt(0);

        // Close the Scanner object to prevent resource leaks
        s.close();

        double output;
        // Perform the calculation based on the operator entered
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("Please Enter Valid Operator");
                return;
        }

        // Display the final result of the calculation
        System.out.println("=========== Final Result ===========");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }
}