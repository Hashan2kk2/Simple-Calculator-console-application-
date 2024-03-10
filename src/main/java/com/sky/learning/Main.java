package com.sky.learning;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number 1");
        double num1 = s.nextDouble();
        System.out.println("Please enter number 2");
        double num2 = s.nextDouble();

        System.out.println("Please enter the operator (+,-,*,/) :");
        char operator = s.next().charAt(0);
        s.close();

        double output;
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
                output = num1 / num1;
                break;
            default:
                System.out.println("Please Enter Valid Operator");
                return;
        }
        System.out.println("=========== Final Result ===========");
        System.out.println(num1 + " " + operator + " " + num2 + "=" + output);
    }
}