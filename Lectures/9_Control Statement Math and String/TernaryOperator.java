// package Lectures.9_Control Statement Matha and String;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Number Checker!!\n");
        System.out.print("Please enter your first number : ");
        int num1 = input.nextInt();
        System.out.print("Now , please enter your second number : ");
        int num2 = input.nextInt();

// use of ternary TernaryOperator==============

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is your greatest number!!");
    }
}

// Outputs : 

// Welcome to Number Checker!!

// Please enter your first number : 22
// Now , please enter your second number : 34
// 34 is your greatest number!!