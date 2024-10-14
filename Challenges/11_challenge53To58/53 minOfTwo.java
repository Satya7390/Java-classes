// package Challenges.11_challenge53To58;

// 53. Create a program to find the minimum of two numbers.

import java.util.Scanner;

class minOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to find the minimum of two numbers!!");
        System.out.print("Please enter your fisrt number : ");
        int num1 = input.nextInt();
        System.out.print("Now, please enter your second nummber : ");
        int num2 = input.nextInt();

        int minOfTwoNumber = num1 < num2 ? num1 : num2;
        System.out.println(minOfTwoNumber + " is your minimum of the two numbers");
    }
}

// Outputs :
// Welcome to find the minimum of two numbers!!
// Please enter your fisrt number : 33
// Now, please enter your second nummber : 11
// 11 is your minimum of the two numbers