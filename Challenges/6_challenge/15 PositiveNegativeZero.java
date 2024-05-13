// package 6_challenge;

// 15.Create a program that determines if a number is positive, negative, or zero.

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome to find number is positive, negative, or zero!!\n");

        System.out.print("Please Enter Your Number : ");

        double num = input.nextDouble();

        if(num>0){
            System.out.println("Your Number is Positive!!");
        }
        else if(num<0){
            System.out.println("Your Number is Negative!!");
        }
        else{
            System.out.println("Your Number is Zero!!");
        }

    }

}
