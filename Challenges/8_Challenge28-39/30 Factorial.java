
// 30. Write a function that calculates the factorial of a given number.

import java.util.Scanner;

class  Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to Calculate Factorial of a Number!!\n");

        System.out.print("\nPlease Enter Your Number : ");

        int num = input.nextInt();

        long fact = factorial(num);
        System.out.println("Your factorial of "+num+" is : "+fact);
    }

    public static long factorial(int num){

        if (num < 2) {

            return 1;
            
        }

        long fact = 1;

        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
            
        }

        return fact;
    }
    
}


// Output 

// Welcome to Calculate Factorial of a Number!!


// Please Enter Your Number : 5
// Your factorial of 5 is : 120
