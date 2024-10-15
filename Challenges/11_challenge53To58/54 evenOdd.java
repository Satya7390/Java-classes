
// 54. Create a program to find if the given number is even or odd.

import java.util.Scanner;

class evenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to finding even or odd!!");
        System.out.print("Enter your number which you want to find even or odd : ");
        int num = input.nextInt();

        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your given number " + num + " is " + result);
    }

}

// Outputs : 
// Welcome to finding even or odd!!
// Enter your number which you want to find even or odd : 5
// Your given number 5 is Odd

// Welcome to finding even or odd!!
// Enter your number which you want to find even or odd : 6
// Your given number 6 is Even