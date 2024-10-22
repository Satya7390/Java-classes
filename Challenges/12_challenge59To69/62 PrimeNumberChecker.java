
// 62. Create a program using for to display if a number is prime or not.

import java.util.Scanner;

class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Prime number Checker !!");
        System.out.print("Enter your number which you want to Check Prime or Not : ");
        int num = input.nextInt();
        System.out.println("Your number is " + (isPrime(num) ? "Prime" : "Not Prime"));
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Outputs : 
// Welcome to Prime number Checker !!
// Enter your number which you want to Check Prime or Not : 4
// Your number is Not Prime

// Welcome to Prime number Checker !!
// Enter your number which you want to Check Prime or Not : 3
// Your number is Prime