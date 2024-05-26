

// 29. Create a program to sum all odd numbers from 1 to a specified number N.

import java.util.Scanner;

/**
 * 29 SumofOdd
 */
 class  SumofOdd {

    public static void main(String[] args) {
        greetUser();

        Scanner input = new Scanner(System.in);
        System.out.print("\nPlease Enter your Number : ");

        int num = input.nextInt();

        System.out.println("Your OddSum till "+num+" is : "+oddSum(num));
    }

    public static int oddSum(int num){

        int sum = 0;
        int i = 1;
        while (i <= num) {

            sum += i;

            i += 2;
            
        }

        return sum;
      
    }

    public static void greetUser(){
        System.out.println("\nWelcome to Odd Sum Calculation!!");
    }
}

