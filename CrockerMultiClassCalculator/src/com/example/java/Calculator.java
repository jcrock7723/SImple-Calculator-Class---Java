package com.example.java;

/*
Breaking out classes to Utilities Package - MathHelper Class
 */

import com.example.java.Utilities.MathHelper;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose and operation (+ - * /): ");

        double result = 0;

        try {
            switch(op) {
                case "+":
                    result = MathHelper.addValues(s1,s2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(s1,s2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(s1,s2);
                    break;
                case "/":
                    result = MathHelper.divideValues(s1,s2);
                    break;
                default:
                    System.out.println("Unrecognized Operation");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number Formatting Exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
