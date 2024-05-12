// package Challenges.5_challenge;

// 8.Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).

import java.util.Scanner;

 class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to my Basic Claculator Program for Two numbers!!\n");

        System.out.print("Please enter your first number : ");
        int a = input.nextInt();

        System.out.print("Now, Enter your second number : ");
        int b = input.nextInt();

        // int c = a-b;

        System.out.println("Your addition of two number is : "+(a+b)); 
        System.out.println("Your Subtraction of two number is : "+(a-b)); 
        System.out.println("Your Multiplication of two number is : "+a*b); 
        System.out.println("Your Division of two number is : "+a/b); 
        System.out.println("Your Modulus of two number is : "+a%b); 
    }
    
}
