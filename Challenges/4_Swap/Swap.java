// package Challenges.4_Swap;

// Create a Program to SWap Two Numbers

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("Welcome To Swapping Tech.... \n");

       System.out.print("Enter value of A : ");
       int A = input.nextInt();
       System.out.print("Enter valu of B : ");
       int B = input.nextInt();
       System.out.println("Your Swapping is Done....\n");

       int C= A;
       A=B;
       B=C;
       System.out.println("Value of A is : "+A);
       System.out.println("Value of B is : "+B);

    }

}
